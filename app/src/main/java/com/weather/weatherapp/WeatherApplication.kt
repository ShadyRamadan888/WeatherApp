package com.weather.weatherapp

import android.app.Application
import com.weather.weatherapp.di.DaggerWeatherComponent
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class WeatherApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        DaggerWeatherComponent.builder().build()
    }
}