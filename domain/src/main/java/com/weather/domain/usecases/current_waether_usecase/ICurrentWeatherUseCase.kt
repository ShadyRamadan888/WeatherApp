package com.weather.domain.usecases.current_waether_usecase

import com.weather.data.model.WeatherX
import kotlinx.coroutines.flow.Flow

interface ICurrentWeatherUseCase {
    operator fun invoke(): Flow<List<WeatherX>>
}