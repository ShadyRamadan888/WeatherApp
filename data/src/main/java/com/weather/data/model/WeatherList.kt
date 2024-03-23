package com.weather.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherList(
    @SerialName("dt")
    val dt: Long,
    @SerialName("main")
    val main: Main,
    @SerialName("weather")
    val weather: List<WeatherX>,
    @SerialName("clouds")
    val clouds: Clouds,
    @SerialName("wind")
    val wind: Wind,
    @SerialName("visibility")
    val visibility: Long,
    @SerialName("pop")
    val pop: Double,
    @SerialName("sys")
    val sys: Sys,
    @SerialName("dt_txt")
    val dtTxt: String,
    @SerialName("rain")
    val rain: Rain?,
)