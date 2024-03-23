package com.weather.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class City(
    @SerialName("id")
    val id: Long,
    @SerialName("name")
    val name: String,
    @SerialName("coord")
    val coord: Coord,
    @SerialName("country")
    val country: String,
    @SerialName("population")
    val population: Int,
    @SerialName("timezone")
    val timezone: Int,
    @SerialName("sunrise")
    val sunrise: Int,
    @SerialName("sunset")
    val sunset: Int
)
