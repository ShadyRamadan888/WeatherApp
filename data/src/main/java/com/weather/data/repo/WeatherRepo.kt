package com.weather.data.repo

import com.weather.data.model.WeatherList
import com.weather.data.model.WeatherX
import kotlinx.coroutines.flow.Flow

interface WeatherRepo {
    fun getCurrentWeather(city: String): Flow<List<WeatherX>>
    fun get7DayForecast(city: String): Flow<List<WeatherList>>
}