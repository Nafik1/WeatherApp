package com.example.weatherapp.domain.entity

data class Forecast(
    val currentWeather: Weather,
    val upcomming: List<Weather>
)
