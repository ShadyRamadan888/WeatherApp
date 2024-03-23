package com.weather.feature_current_weather.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.weather.data.model.WeatherUiState
import com.weather.domain.usecases.current_waether_usecase.ICurrentWeatherUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CurrentWeatherViewModel @Inject constructor(
    private val currentWeatherUseCase: ICurrentWeatherUseCase
) : ViewModel() {
    private val _state = MutableStateFlow<WeatherUiState>(WeatherUiState.Loading)
    val state = _state.asStateFlow()

    init {
        getCurrentWeather()
    }

    private fun getCurrentWeather() {
        viewModelScope.launch {
            currentWeatherUseCase.invoke()
                .map { WeatherUiState.Success(it) }
                .catch { _state.value = WeatherUiState.Loading }
                .collect { _state.value = it }
        }
    }
}