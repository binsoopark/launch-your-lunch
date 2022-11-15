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
* */