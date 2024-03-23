package com.weather.domain.usecases.current_waether_usecase

import com.weather.data.local.SharedPreferenceManager
import com.weather.data.model.WeatherResponse
import com.weather.data.repo.WeatherRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CurrentWeatherUseCase @Inject constructor(
    private val sharedPreferenceManager: SharedPreferenceManager,
    private val repo: WeatherRepo
) : ICurrentWeatherUseCase {

    override fun invoke(): Flow<WeatherResponse> {
        val city = sharedPreferenceManager.getCityName()
        return repo.getCurrentWeather(city)
    }

}