package com.weather.feature_city_input.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.weather.feature_city_input.screens.composables.InputCityContent

@Composable
fun InputCityScreen(
    navHostController: NavHostController,
    viewModel: InputCityViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    InputCityContent(
        cityUiState = state,
        onCityNameChanged = viewModel::onCityNameChanged,
        onClickButtonSearch = {
            viewModel.onClickSearchButton(state.name)
        }
    )
}