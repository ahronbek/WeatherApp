package com.ahronbek.weatherapp.domain.repository

import com.ahronbek.weatherapp.domain.weather.WeatherInfo
import com.ahronbek.weatherapp.domain.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}