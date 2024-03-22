package com.weather.data.local

interface SharedPreferenceManager {
    suspend fun setCityName(city: String)
    suspend fun getCityName(): String
    suspend fun clearCityName()
}