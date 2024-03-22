package com.weather.domain.di

import com.weather.data.local.SharedPreferenceManager
import com.weather.domain.usecases.input_city_usecase.IInputCityUseCase
import com.weather.domain.usecases.input_city_usecase.InputCityUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCasesModule {

    @Provides
    fun provideInputCityUseCase(sharedPreferenceManager: SharedPreferenceManager): IInputCityUseCase {
        return InputCityUseCase(sharedPreferenceManager)
    }
}