package com.weather.feature_7_day_forecast.screens.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.weather.core.components.images.MainAsyncImage
import com.weather.core.components.spacer.SpacerVertically_20
import com.weather.core.components.texts.RegularText
import com.weather.data.model.WeatherList
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun MainForecastCard(
    item: WeatherList
) {

    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)
    val dayFormat = SimpleDateFormat("EEEE", Locale.US)

    Card(
        modifier = Modifier
            .padding(10.dp),
        colors = CardColors(
            containerColor = Color.White,
            contentColor = Color.White,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.White
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
        ) {
            Column(
                modifier = Modifier.weight(90f)
            ) {
                RegularText(
                    text = dayFormat.format(item.dt),
                    fontSize = 20.sp
                )
                SpacerVertically_20()
                RegularText(
                    text = item.weather[0].description ?: "",
                    fontSize = 20.sp
                )
            }

            MainAsyncImage(
                modifier = Modifier
                    .size(100.dp),
                model = "https://openweathermap.org/img/wn/${item.weather[0].icon}@4x.png"
            )

        }
    }

}
