package com.weather.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherList(
    @SerialName("dt")
    val dt: Int,
    @SerialName("main")
    val main: Main,
    @SerialName("weather")
    val weather: List<Weather>,
    @SerialName("clouds")
    val clouds: Clouds,
    @SerialName("wind")
    val wind: Wind,
    @SerialName("visibility")
    val visibility: Int,
    @SerialName("pop")
    val pop: Int,
    @SerialName("sys")
    val sys: Sys,
    @SerialName("dt_txt")
    val dtTxt: String
)