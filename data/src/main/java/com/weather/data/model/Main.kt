package com.weather.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Main(
    @SerialName("feels_like")
    val feelsLike: Double? = null,
    @SerialName("humidity")
    val humidity: Long? = null,
    @SerialName("pressure")
    val pressure: Long? = null,
    @SerialName("temp")
    val temp: Double? = null,
    @SerialName("temp_max")
    val tempMax: Double? = null,
    @SerialName("temp_min")
    val tempMin: Double? = null,
    @SerialName("sea_level")
    val seaLevel: Long,
    @SerialName("grnd_level")
    val grndLevel: Long,
    @SerialName("temp_kf")
    val tempKf: Double,
)