package com.weather.weatherapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.weather.feature_city_input.navigation.inputCityRoute

@Composable
fun WeatherNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        startDestination = "inputCity",
        navController = navHostController
    ) {
        inputCityRoute(navHostController)
    }
}