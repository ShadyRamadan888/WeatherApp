package com.weather.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherResponse(
    @SerialName("coord")
    val coordinate: Coord,
    @SerialName("weather")
    val weather: List<WeatherX>,
    @SerialName("base")
    val base: String,
    @SerialName("main")
    val main: Main,
    @SerialName("visibility")
    val visibility: Int,
    @SerialName("wind")
    val wind: Wind,
    @SerialName("clouds")
    val clouds: Clouds,
    @SerialName("dt")
    val dt: Int,
    @SerialName("sys")
    val sys: Sys,
    @SerialName("timezone")
    val timezone: Int,
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @SerialName("cod")
    val cod: Int
)

@Serializable
data class Forecast7Response(
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