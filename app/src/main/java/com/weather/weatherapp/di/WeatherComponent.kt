package com.weather.weatherapp.di

import com.weather.data.di.DataLayerModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        DataLayerModule::class,
    ]
) interface WeatherComponent