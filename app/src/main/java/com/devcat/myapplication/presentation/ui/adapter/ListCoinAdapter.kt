package com.devcat.myapplication.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.devcat.myapplication.data.entity.CoinItem
import com.example.myapplication.databinding.ItemCoinitemBinding

class ListCoinAdapter(item : MutableLiveData<List<CoinItem>>) : RecyclerView.Adapter<ListCoinAdapter.ListCoinItem>() {

    var listItem = item.value!!


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListCoinItem {
        return ListCoinItem(ItemCoinitemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ListCoinItem, position: Int) {

        listItem[position].apply {
            holder.binding.itemCoinName.text = coinName
            holder.binding.itemCoinPrice.text = "$price"
            holder.binding.itemCoinPriceRate.text = "$priceRate"
        }
    }

    override fun getItemCount(): Int = listItem.size

    inner class ListCoinItem(val binding: ItemCoinitemBinding) : RecyclerView.ViewHolder(binding.root)
}