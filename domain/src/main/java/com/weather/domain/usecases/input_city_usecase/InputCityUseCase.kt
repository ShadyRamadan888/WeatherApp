package com.weather.domain.usecases.input_city_usecase

import com.weather.data.repo.WeatherRepo
import javax.inject.Inject

class InputCityUseCase @Inject constructor(
    private val repo: WeatherRepo
): IInputCityUseCase {
    override fun invoke(city: String) {
        TODO("Not yet implemented")
    }
}