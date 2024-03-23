package com.weather.feature_7_day_forecast.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.weather.feature_7_day_forecast.screens.composables.SevenDayForecastContent

@Composable
fun SevenDayForecastScreen(
    viewModel: SevenDayForecastViewModel = hiltViewModel(),
    navHostController: NavHostController
) {
    val state by viewModel.state.collectAsState()
    SevenDayForecastContent(
        weatherUiState = state
    )
}