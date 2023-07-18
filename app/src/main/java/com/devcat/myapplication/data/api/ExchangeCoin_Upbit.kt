package com.devcat.myapplication.data.api

import android.util.Log
import com.devcat.myapplication.data.entity.CoinItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query
import java.text.DecimalFormat

class ExchangeCoin_Upbit : ExchangeCoinInterface<ExchangeCoin_Upbit.ExchangeUpbitApi>{

    override val exchangeBaseURL: String
        get() = "https://api.upbit.com/"

    override lateinit var apiInterface: ExchangeUpbitApi

    init {
        apiInterface = ApiManager.createRetrofitBuilder(exchangeBaseURL)
            .create(ExchangeUpbitApi::class.java)
    }

    override suspend fun getPrice(markets: String, displayName: String): CoinItem {
        return try{
            withContext(Dispatchers.IO){
                apiInterface.getPrice(markets).body()!!.first().apply {
                    if(displayName != "")
                        coinName = displayName
                    priceRate *=100
                }
            }
        }
        catch (e : Exception)
        {
            Log.e("test","실패하여 예외데이터 반환")
            CoinItem(0,"2","",10F,10F)
        }
    }

    interface ExchangeUpbitApi{
        @GET("v1/ticker")
        suspend fun getPrice(@Query("markets") type:String) : Response<List<CoinItem>>

    }
}