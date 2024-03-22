package com.weather.data.local

interface SharedPreferenceManager {
    fun setCityName(city: String)
    fun getCityName(): String
    fun clearCityName()
}