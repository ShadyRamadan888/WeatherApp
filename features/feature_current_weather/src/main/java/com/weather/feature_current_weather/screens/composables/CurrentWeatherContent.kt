package com.weather.feature_current_weather.screens.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.weather.core.components.buttons.ButtonToNavigate
import com.weather.core.components.images.BackgroundImage
import com.weather.core.components.images.MainAsyncImage
import com.weather.core.components.progress.CircularIndeterminateProgressBar
import com.weather.core.components.spacer.SpacerVertically_20
import com.weather.core.components.spacer.SpacerVertically_50
import com.weather.core.components.texts.RegularText
import com.weather.data.model.WeatherResponse
import com.weather.data.model.WeatherUiState

@Composable
fun CurrentWeatherContent(
    weatherUiState: WeatherUiState,
    onClickToSevenDayForecast: () -> Unit
) {

    var isCurrentWeatherLoading by remember { mutableStateOf(true) }
    var weatherResponse by remember { mutableStateOf(WeatherResponse()) }

    when (weatherUiState) {
        is WeatherUiState.Loading -> {
            isCurrentWeatherLoading = true
        }

        is WeatherUiState.Success<*> -> {
            isCurrentWeatherLoading = false
            weatherResponse = weatherUiState.data as WeatherResponse
        }

        is WeatherUiState.Error -> {
            isCurrentWeatherLoading = true
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        BackgroundImage()

        if (isCurrentWeatherLoading) {
            CircularIndeterminateProgressBar(true)
        } else {
            Column(
                modifier = Modifier
                    .align(Alignment.TopCenter),
            ) {
                SpacerVertically_50()
                RegularText(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = weatherResponse.name ?: "",
                    fontSize = 40.sp,
                    color = Color.White,
                )
                SpacerVertically_20()
                RegularText(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "${(weatherResponse.main!!.temp!!.toInt().minus(273))}°",
                    fontSize = 80.sp,
                    color = Color.White,
                )
                SpacerVertically_20()
                RegularText(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = weatherResponse.weather?.get(0)?.description ?: "",
                    fontSize = 25.sp,
                    color = Color.White,
                )
                MainAsyncImage(
                    modifier = Modifier
                        .size(200.dp)
                        .align(Alignment.CenterHorizontally),
                    model = "https://openweathermap.org/img/wn/${weatherResponse.weather?.get(0)?.icon}@4x.png"
                )
                SpacerVertically_20()
                ButtonToNavigate(
                    text = stringResource(com.weather.core.R.string.seven_day_forecast),
                    onClick = onClickToSevenDayForecast
                )
            }
        }
    }
}