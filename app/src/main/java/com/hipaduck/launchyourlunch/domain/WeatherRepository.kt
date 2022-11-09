package com.hipaduck.launchyourlunch.domain

interface WeatherRepository {
    suspend fun getWeather(): String
}