package com.weather.data.repo

import com.weather.data.model.ForecastResponse
import com.weather.data.model.WeatherResponse
import kotlinx.coroutines.flow.Flow

interface WeatherRepo {
    fun getCurrentWeather(city: String): Flow<WeatherResponse>
    fun get7DayForecast(city: String): Flow<ForecastResponse>
}