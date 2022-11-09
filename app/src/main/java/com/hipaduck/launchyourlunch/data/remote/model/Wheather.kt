package com.hipaduck.launchyourlunch.data.remote.model

import com.google.gson.annotations.SerializedName
import org.json.JSONArray

data class WheatherResponse(
    @SerializedName("response")
    val response: Wheather
)

data class Wheather(
    @SerializedName("body")
    val items: Items
)

data class Items(
    @SerializedName("items")
    val item: Item
)

data class Item(
    @SerializedName("item")
    val info: JSONArray
)