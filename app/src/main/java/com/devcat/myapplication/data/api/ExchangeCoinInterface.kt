package com.devcat.myapplication.data.api

import com.devcat.myapplication.data.entity.CoinItem


interface ExchangeCoinInterface<T>{

    val exchangeBaseURL : String
    val apiInterface : T

    suspend fun getPrice(markets:String) : CoinItem

}