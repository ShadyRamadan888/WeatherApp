package com.weather.data.helper

import com.weather.data.local.SharedPreferenceManager
import javax.inject.Inject

class LocalCheckHelper @Inject constructor(
    private val sharedPreferenceManager: SharedPreferenceManager
) {

    fun getLocalDataState(): Boolean {
        val city = sharedPreferenceManager.getCityName()
        return city.isEmpty()
    }
}