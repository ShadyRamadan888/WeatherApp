package com.weather.feature_city_input.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.weather.feature_city_input.screens.InputCityScreen

private const val ROUTE = "inputCity"

fun NavController.navigateToInputCityScreen() {
    navigate(ROUTE)
}

fun NavGraphBuilder.inputCityRoute(
    navHostController: NavHostController
) {
    composable(ROUTE) {
        InputCityScreen(navHostController)
    }
}