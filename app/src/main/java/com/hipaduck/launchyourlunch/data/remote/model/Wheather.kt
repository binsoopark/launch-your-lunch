package com.hipaduck.launchyourlunch.data.remote.model

import com.google.gson.annotations.SerializedName
import org.json.JSONArray
import org.json.JSONObject

data class WheatherResponse(
    @SerializedName("response")
    val response: Wheather
)

data class Wheather(
    @SerializedName("header")
    val header: Header,
    @SerializedName("body")
    val items: Items
)

data class Header(
    @SerializedName("resultCode")
    val resultCode: String,
    @SerializedName("resultMsg")
    val resultMessage: String,
)

data class Items(
    @SerializedName("items")
    val item: Item
)

data class Item(
    @SerializedName("item")
    val info: List<Info>
)

data class Info(
    @SerializedName("baseDate")
    val baseDate: String,
    @SerializedName("baseTime")
    val baseTime: String,
    @SerializedName("category")
    val category: String,
    @SerializedName("fcstDate")
    val fsctDate: String,
    @SerializedName("fcstTime")
    val fcstTime: String,
    @SerializedName("fcstValue")
    val fcstValue: String,
    @SerializedName("nx")
    val nx: String,
    @SerializedName("ny")
    val ny: String,
)

/*
*
* "baseDate":"20221114",
"baseTime":"0500",
"category":"TMP",
"fcstDate":"20221114",
"fcstTime":"0600",
"fcstValue":"9",
"nx":60,
"ny":125
*
* 2022-11-28 11:24:19.563 20231-21810 okhttp.OkHttpClient     com.hipaduck.launchyourlunch         I  {"response":{"header":{"resultCode":"10","resultMsg":"최근 3일 간의 자료만 제공합니다."}}}
* 2022-11-28 11:34:47.061 22290-26197 okhttp.OkHttpClient     com.hipaduck.launchyourlunch         I  {"response":{"header":{"resultCode":"00","resultMsg":"NORMAL_SERVICE"},"body":{"dataType":"JSON","items":{"item":[{"baseDate":"20221128","baseTime":"0500","category":"TMP","fcstDate":"20221128","fcstTime":"0600","fcstValue":"9","nx":60,"ny":125},{"baseDate":"20221128","baseTime":"0500","category":"UUU","fcstDate":"20221128","fcstTime":"0600","fcstValue":"-2.1","nx":60,"ny":125},{"baseDate":"20221128","baseTime":"0500","category":"VVV","fcstDate":"20221128","fcstTime":"0600","fcstValue":"0.6","nx":60,"ny":125},{"baseDate":"20221128","baseTime":"0500","category":"VEC","fcstDate":"20221128","fcstTime":"0600","fcstValue":"105","nx":60,"ny":125},{"baseDate":"20221128","baseTime":"0500","category":"WSD","fcstDate":"20221128","fcstTime":"0600","fcstValue":"2.3","nx":60,"ny":125},{"baseDate":"20221128","baseTime":"0500","category":"SKY","fcstDate":"20221128","fcstTime":"0600","fcstValue":"4","nx":60,"ny":125},{"baseDate":"20221128","baseTime":"0500","category":"PTY","fcstDate":"20221128","fcstTime":"0600","fcstValue":"0","nx":60,"ny":125},{"baseDate":"20221128","baseTime":"0500","category":"POP","fcstDate":"20221128","fcstTime":"0600","fcstValue":"30","nx":60,"ny":125},{"baseDate":"20221128","baseTime":"0500","category":"WAV","fcstDate":"20221128","fcstTime":"0600","fcstValue":"0","nx":60,"ny":125},{"baseDate":"20221128","baseTime":"0500","category":"PCP","fcstDate":"20221128","fcstTime":"0600","fcstValue":"강수없음","nx":60,"ny":125}]},"pageNo":1,"numOfRows":10,"totalCount":809}}}
* */