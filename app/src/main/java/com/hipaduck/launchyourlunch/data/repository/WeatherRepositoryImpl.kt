package com.hipaduck.launchyourlunch.data.repository

import android.util.Log
import com.hipaduck.launchyourlunch.data.remote.api.WheatherApi
import com.hipaduck.launchyourlunch.domain.WeatherRepository
import retrofit2.Retrofit
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val client: Retrofit,
    private val api: WheatherApi,
): WeatherRepository {
    override suspend fun getWeather(): String {
        Log.d("GAEGUL", "getWeather: entered")
        var result: String = ""
        val response = api.requestWheather("60", "125", "20221109", "0500", "json")

        if (response.isSuccessful) {
            response.body()?.let { body ->
                val arr = body.response.items.item.info
                Log.d("GAEGUL", "getWeather: " + arr)
                result = arr.toString()
            }
        }

        return result
    }
}