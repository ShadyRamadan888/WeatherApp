package com.weather.data.local

import android.content.SharedPreferences
import com.weather.core.utils.Constants
import javax.inject.Inject

class SharedPreferenceManagerImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : SharedPreferenceManager {

    override fun setCityName(city: String) {
        val editor = sharedPreferences.edit()
        editor.apply {
            putString(Constants.CITY_NAME, city)
        }.apply()
    }

    override fun getCityName(): String =
        requireNotNull(sharedPreferences.getString(Constants.CITY_NAME, null))

    override fun clearCityName() {
        val editor = sharedPreferences.edit()
        editor.apply {
            putString(Constants.CITY_NAME, "")
        }.apply()
    }
}