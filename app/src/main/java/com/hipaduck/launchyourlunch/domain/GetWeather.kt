package com.hipaduck.launchyourlunch.domain

import android.util.Log
import javax.inject.Inject

class GetWeather @Inject constructor(
    private val repository: WeatherRepository,
) {
    suspend operator fun invoke(): String {
        var result = ""
        try {
            result = repository.getWeather()
        } catch (e: java.lang.Exception) {
            result = e.message.toString()
            Log.d("GAEGUL", "Usecase invoke: error ${e.message.toString()}")
        }
        return result
    }
}