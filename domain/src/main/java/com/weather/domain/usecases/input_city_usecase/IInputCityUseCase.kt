package com.weather.domain.usecases.input_city_usecase

interface IInputCityUseCase {
    operator fun invoke(city: String)
}