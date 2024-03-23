package com.weather.feature_7_day_forecast.screens.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.weather.core.components.images.BackgroundImage
import com.weather.core.components.progress.CircularIndeterminateProgressBar
import com.weather.data.model.ForecastResponse
import com.weather.data.model.WeatherList
import com.weather.data.model.WeatherUiState

@Composable
fun SevenDayForecastContent(
    weatherUiState: WeatherUiState
) {

    var isForecastWeatherLoading by remember { mutableStateOf(true) }
    var forecastResponse by remember { mutableStateOf(ForecastResponse()) }
    var forecastList by remember { mutableStateOf(emptyList<WeatherList>()) }

    when (weatherUiState) {
        is WeatherUiState.Loading -> {
            isForecastWeatherLoading = true
        }

        is WeatherUiState.Success<*> -> {
            isForecastWeatherLoading = false
            forecastResponse = weatherUiState.data as ForecastResponse
            forecastList = requireNotNull(forecastResponse.list)
        }

        is WeatherUiState.Error -> {
            isForecastWeatherLoading = true
        }
    }

    if (isForecastWeatherLoading) {
        BackgroundImage()
        CircularIndeterminateProgressBar(true)
    } else {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            BackgroundImage()

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(
                    horizontal = 16.dp,
                )
            ) {
                items(forecastList) { item ->
                    MainForecastCard(item)
                }
            }
        }
    }
}