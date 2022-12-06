package com.hipaduck.launchyourlunch.data.repository

import android.util.Log
import com.hipaduck.launchyourlunch.data.remote.api.WheatherApi
import com.hipaduck.launchyourlunch.domain.WeatherRepository
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WheatherApi,
) : WeatherRepository {
    private val serviceKey: String =
        "H4x622Qm0l4CRmP3aW++k0EZw++gIW0xnawVEKxNDWCKRg8HjZjyyQQnrEn8cToDhZkHiHxYDkvAAcMOohqbbA=="

    override suspend fun getWeather(): String {
        Log.d("GAEGUL", "getWeather: entered")
        var result: String = ""
        val currentDate: String = SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(Date())
        val response = api.requestWeather(serviceKey, "60", "125", currentDate, "0500", "json")

        if (response.isSuccessful) {
            response.body()?.let { body ->
                result = if (body.response.header.resultCode == "00") {
                    val arr = body.response.items.item.info
                    Log.d("GAEGUL", "getWeather: $arr")
                    arr.toString()
                } else {
                    body.response.header.resultMessage
                }
            }
        }

        return result
    }
}