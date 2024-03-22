package com.weather.domain.usecases.input_city_usecase

import com.weather.data.local.SharedPreferenceManager
import javax.inject.Inject

class InputCityUseCase @Inject constructor(
    private val sharedPreferenceManager: SharedPreferenceManager
) : IInputCityUseCase {
    override fun invoke(city: String) {
        sharedPreferenceManager.setCityName(city)
    }
}