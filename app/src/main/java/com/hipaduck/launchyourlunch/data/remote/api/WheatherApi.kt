package com.hipaduck.launchyourlunch.data.remote.api

import com.hipaduck.launchyourlunch.data.remote.model.WheatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WheatherApi {
    @GET("getVilageFcst")
    suspend fun requestWeather(
        @Query("ServiceKey") serviceKey: String,
        @Query("nx") nx: String,
        @Query("ny") ny: String,
        @Query("base_date") baseDate: String,
        @Query("base_time") baseTime: String,
        @Query("dataType") dataType: String,
    ): Response<WheatherResponse>
}