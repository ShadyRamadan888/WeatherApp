package com.weather.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Wind(
    @SerialName("deg")
    val deg: Long? = null,
    @SerialName("speed")
    val speed: Double? = null,
    @SerialName("gust")
    val gust: Double? = null
)