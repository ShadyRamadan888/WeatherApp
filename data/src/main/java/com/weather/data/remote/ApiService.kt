package com.weather.data.remote

import com.weather.data.model.ForecastResponse
import com.weather.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather")
    suspend fun getCurrentWeather(
        @Query("q") city: String,
        @Query("appid") apiKey: String
    ): WeatherResponse

    @GET("forecast")
    suspend fun getDaysForecast(
        @Query("q") city: String,
        @Query("appid") apiKey: String,
        @Query("cnt") days: String
    ): ForecastResponse
}