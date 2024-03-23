package com.weather.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherResponse(
    @SerialName("coord")
    val coordinate: Coord? = null,
    @SerialName("weather")
    val weather: List<WeatherX>? = null,
    @SerialName("base")
    val base: String? = null,
    @SerialName("main")
    val main: Main? = null,
    @SerialName("visibility")
    val visibility: Int? = null,
    @SerialName("wind")
    val wind: Wind? = null,
    @SerialName("clouds")
    val clouds: Clouds? = null,
    @SerialName("dt")
    val dt: Int? = null,
    @SerialName("sys")
    val sys: Sys? = null,
    @SerialName("timezone")
    val timezone: Int? = null,
    @SerialName("id")
    val id: Int? = null,
    @SerialName("name")
    val name: String? = null,
    @SerialName("cod")
    val cod: Int? = null
)

@Serializable
data class ForecastResponse(
    @SerialName("cod")
    val cod: String,
    @SerialName("message")
    val message: Int,
    @SerialName("cnt")
    val cnt: Int,
    @SerialName("list")
    val list: List<WeatherList>? = null,
    @SerialName("city")
    val city: City
)