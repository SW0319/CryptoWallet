package com.devcat.myapplication.data.entity

data class CoinItem(
    val no : Int,
    val coinImage : String,
    val coinName : String,
    var price : Float,
    var priceRate : Float
)