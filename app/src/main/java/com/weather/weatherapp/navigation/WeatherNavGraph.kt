package com.weather.weatherapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.weather.feature_city_input.navigation.inputCityRoute
import com.weather.feature_current_weather.navigation.currentWeatherRoute

@Composable
fun WeatherNavGraph(
    navHostController: NavHostController,
    startDestination: String
) {
    NavHost(
        startDestination = startDestination,
        navController = navHostController
    ) {
        inputCityRoute(navHostController)
        currentWeatherRoute(navHostController)
    }
}