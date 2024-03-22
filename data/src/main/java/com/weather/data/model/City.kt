package com.weather.data.model

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class City(
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @Contextual
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
