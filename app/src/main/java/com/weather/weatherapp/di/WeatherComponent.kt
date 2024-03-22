package com.weather.weatherapp.di

import com.weather.data.di.DataLayerModule
import com.weather.data.di.SharedPreferencesModule
import com.weather.domain.di.UseCasesModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        DataLayerModule::class,
        SharedPreferencesModule::class,
        UseCasesModule::class
    ]
)
interface WeatherComponent