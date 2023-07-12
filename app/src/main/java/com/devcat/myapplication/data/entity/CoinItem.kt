package com.devcat.myapplication.data.entity

import com.google.gson.annotations.SerializedName

data class CoinItem(
    @SerializedName("trade_date")
    val no : Int,
    @SerializedName("trade_time")
    val coinImage : String,

    @SerializedName("market")
    val coinName : String,

    @SerializedName("trade_price")
    var price : Float,

    @SerializedName("signed_change_rate")
    var priceRate : Float
)