package com.devcat.myapplication.presentation.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import com.devcat.myapplication.data.api.ExchangeCoin_Upbit
import com.devcat.myapplication.data.entity.CoinItem
import com.devcat.myapplication.presentation.ui.base.BaseViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class ListCoinViewModel(var item : MutableLiveData<List<CoinItem>>) : BaseViewModel() {

    fun setExampleData()
    {

        var list = ArrayList<CoinItem>()
        runBlocking {
            list.add(ExchangeCoin_Upbit().getPrice("KRW-STEEM"))
            list.add(ExchangeCoin_Upbit().getPrice("KRW-BTC"))
            list.add(ExchangeCoin_Upbit().getPrice("KRW-ETH"))
        }

//        list.add(CoinItem(1,"image","Klay",1000F,5.4F))
//        list.add(CoinItem(2,"image","BTC",384123540F,5.4F))
//        list.add(CoinItem(3,"image","이더리움클래식ㅇㄹㅁㄴㅁㅇㄴㄹㅁㄴ(ETC)",111500F,5.4F))
//        list.add(CoinItem(4,"image","DOGE",100.5F,5.4F))
        item.value = list
    }
}