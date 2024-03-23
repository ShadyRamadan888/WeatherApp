package com.weather.data.repo

import android.util.Log
import com.weather.data.model.ForecastResponse
import com.weather.data.model.WeatherResponse
import com.weather.data.remote.ApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class WeatherRepoImp @Inject constructor(
    private val apiService: ApiService
) : WeatherRepo {
    override fun getCurrentWeather(city: String): Flow<WeatherResponse> = flow {
        val response = apiService.getCurrentWeather(city)
        emit(response)
    }

    override fun get7DayForecast(city: String): Flow<ForecastResponse> = flow {
        val response = apiService.getDaysForecast(city)
        Log.v("SHR", response.toString())
        emit(response)
    }
}