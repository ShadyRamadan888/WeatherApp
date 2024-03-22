package com.weather.weatherapp.di

import com.weather.data.di.DataLayerModule
import com.weather.data.di.SharedPreferencesModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        DataLayerModule::class,
        SharedPreferencesModule::class
    ]
)
interface WeatherComponent