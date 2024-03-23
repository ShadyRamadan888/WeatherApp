package com.weather.feature_city_input.screens

import androidx.lifecycle.ViewModel
import com.weather.data.model.CityUiState
import com.weather.domain.usecases.input_city_usecase.IInputCityUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class InputCityViewModel @Inject constructor(
    private val inputCityUseCase: IInputCityUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(CityUiState())
    val state = _state.asStateFlow()

    fun onCityNameChanged(cityName: String) = _state.update { it.copy(name = cityName) }

    fun onClickSearchButton(cityName: String) {
        inputCityUseCase.invoke(cityName)
    }
}