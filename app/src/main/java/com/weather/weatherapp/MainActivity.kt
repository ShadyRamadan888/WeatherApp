package com.weather.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.weather.core.utils.Constants
import com.weather.data.helper.LocalCheckHelper
import com.weather.weatherapp.navigation.WeatherNavGraph
import com.weather.weatherapp.ui.theme.WeatherAppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var localCheckHelper: LocalCheckHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WeatherAppTheme {
                val navController = rememberNavController()
                if (localCheckHelper.getLocalDataState())
                    WeatherNavGraph(
                        navHostController = navController,
                        startDestination = Constants.INPUT_CITY
                    )
                else {
                    WeatherNavGraph(
                        navHostController = navController,
                        startDestination = Constants.CURRENT_WEATHER
                    )
                }
            }
        }
    }
}