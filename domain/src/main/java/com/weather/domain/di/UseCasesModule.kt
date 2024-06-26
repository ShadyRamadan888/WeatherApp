package com.weather.domain.di

import com.weather.data.local.SharedPreferenceManager
import com.weather.data.repo.WeatherRepo
import com.weather.domain.usecases.current_waether_usecase.CurrentWeatherUseCase
import com.weather.domain.usecases.current_waether_usecase.ICurrentWeatherUseCase
import com.weather.domain.usecases.input_city_usecase.IInputCityUseCase
import com.weather.domain.usecases.input_city_usecase.InputCityUseCase
import com.weather.domain.usecases.seven_days_forecast_usecase.ISevenDaysForecastUseCase
import com.weather.domain.usecases.seven_days_forecast_usecase.SevenDaysForecastUseCase
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

    @Provides
    fun provideCurrentWeatherUseCase(
        sharedPreferenceManager: SharedPreferenceManager,
        repo: WeatherRepo
    ): ICurrentWeatherUseCase {
        return CurrentWeatherUseCase(
            sharedPreferenceManager = sharedPreferenceManager,
            repo = repo
        )
    }

    @Provides
    fun provide7DaysForecastUseCase(
        sharedPreferenceManager: SharedPreferenceManager,
        repo: WeatherRepo
    ): ISevenDaysForecastUseCase {
        return SevenDaysForecastUseCase(
            sharedPreferenceManager = sharedPreferenceManager,
            repo = repo
        )
    }
}