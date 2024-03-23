package com.weather.feature_7_day_forecast.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.weather.feature_7_day_forecast.screens.SevenDayForecastScreen


private const val ROUTE = "sevenDayScreen"

fun NavController.navigateToSevenDay() {
    navigate(ROUTE)
}

fun NavGraphBuilder.sevenDayRoute(
    navHostController: NavHostController
) {
    composable(ROUTE) {
        SevenDayForecastScreen(navHostController = navHostController)
    }
}