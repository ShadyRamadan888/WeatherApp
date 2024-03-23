package com.weather.domain.usecases.seven_days_forecast_usecase

import com.weather.data.local.SharedPreferenceManager
import com.weather.data.model.ForecastResponse
import com.weather.data.repo.WeatherRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SevenDaysForecastUseCase @Inject constructor(
    private val sharedPreferenceManager: SharedPreferenceManager,
    private val repo: WeatherRepo
) : ISevenDaysForecastUseCase {
    override fun invoke(): Flow<ForecastResponse> {
        val city = sharedPreferenceManager.getCityName()
        return repo.get7DayForecast(city)
    }
}