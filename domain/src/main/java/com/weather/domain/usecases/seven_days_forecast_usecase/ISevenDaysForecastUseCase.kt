package com.weather.domain.usecases.seven_days_forecast_usecase

import com.weather.data.model.ForecastResponse
import kotlinx.coroutines.flow.Flow

interface ISevenDaysForecastUseCase {
    operator fun invoke(): Flow<ForecastResponse>
}