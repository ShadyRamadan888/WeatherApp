package com.weather.data.model

sealed class WeatherUiState {
    data class Success<T>(val data: T?) : WeatherUiState()
    data class Error(val t: Throwable) : WeatherUiState()
    object Loading : WeatherUiState()
}