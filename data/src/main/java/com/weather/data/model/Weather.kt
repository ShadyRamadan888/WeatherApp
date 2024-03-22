package com.weather.data.model

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Weather(
    @SerialName("base")
    val base: String? = null,
    @Contextual
    val clouds: Clouds? = null,
    @SerialName("cod")
    val cod: Int? = null,
    @SerialName("coord")
    val coord: Coord? = null,
    @SerialName("dt")
    val dt: Int? = null,
    @SerialName("id")
    val id: Int? = null,
    @Contextual
    val main: Main? = null,
    @SerialName("name")
    val name: String? = null,
    @SerialName("sys")
    val sys: Sys? = null,
    @SerialName("timezone")
    val timezone: Int? = null,
    @SerialName("visibility")
    val visibility: Int? = null,
    @SerialName("weather")
    val weather: List<WeatherX>? = null,
    @SerialName("wind")
    val wind: Wind? = null
)