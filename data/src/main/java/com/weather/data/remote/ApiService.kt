package com.weather.data.remote

import com.weather.core.utils.Constants
import com.weather.data.model.ForecastResponse
import com.weather.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather")
    suspend fun getCurrentWeather(
        @Query("q") city: String,
        @Query("appid") apiKey: String = Constants.API_KEY
    ): WeatherResponse

    @GET("forecast")
    suspend fun getDaysForecast(
        @Query("q") city: String,
        @Query("cnt") days: Int = 7,
        @Query("appid") apiKey: String = Constants.API_KEY,
    ): ForecastResponse
}