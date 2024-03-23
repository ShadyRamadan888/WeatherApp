package com.weather.feature_current_weather.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.weather.feature_current_weather.screens.CurrentWeatherScreen

private const val ROUTE = "currentWeather"

fun NavController.navigateToCurrentWeather() {
    navigate(ROUTE)
}

fun NavGraphBuilder.currentWeatherRoute(
    navHostController: NavHostController
) {
    composable(ROUTE) {
        CurrentWeatherScreen(navHostController)
    }
}