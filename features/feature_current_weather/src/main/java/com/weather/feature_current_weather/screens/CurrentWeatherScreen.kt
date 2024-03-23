package com.weather.feature_current_weather.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.weather.feature_current_weather.screens.composables.CurrentWeatherContent

@Composable
fun CurrentWeatherScreen(
    navHostController: NavHostController,
    viewModel: CurrentWeatherViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()
    CurrentWeatherContent(state)
}