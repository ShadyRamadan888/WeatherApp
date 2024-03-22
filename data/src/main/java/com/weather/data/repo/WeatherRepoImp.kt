package com.weather.data.repo

import com.weather.data.model.WeatherList
import com.weather.data.model.WeatherX
import com.weather.data.remote.ApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class WeatherRepoImp @Inject constructor(
    private val apiService: ApiService
) : WeatherRepo {
    override fun getCurrentWeather(city: String): Flow<List<WeatherX>> = flow {
        val response = apiService.getCurrentWeather(city).weather
        emit(response)
    }

    override fun get7DayForecast(city: String): Flow<List<WeatherList>> = flow {
        val response = apiService.getDaysForecast(city).list
        emit(requireNotNull(response))
    }
}