package com.weather.feature_7_day_forecast.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.weather.data.model.WeatherUiState
import com.weather.domain.usecases.seven_days_forecast_usecase.ISevenDaysForecastUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SevenDayForecastViewModel @Inject constructor(
    private val sevenDaysForecastUseCase: ISevenDaysForecastUseCase
) : ViewModel() {
    private val _state = MutableStateFlow<WeatherUiState>(WeatherUiState.Loading)
    val state = _state.asStateFlow()

    init {
        getSevenDayForecast()
    }

    private fun getSevenDayForecast() {
        viewModelScope.launch {
            sevenDaysForecastUseCase.invoke()
                .map { WeatherUiState.Success(it) }
                .catch { _state.value = WeatherUiState.Loading }
                .collect { _state.value = it }
        }

    }
}