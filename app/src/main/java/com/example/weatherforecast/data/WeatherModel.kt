package com.example.weatherforecast.data

data class WeatherModel(
    val city: String,
    val time: String,
    val tempCurrent: String,
    val condition: String,
    val icon: String,
    val tempMax: String,
    val tempMin: String,
    val hours: String,
)
