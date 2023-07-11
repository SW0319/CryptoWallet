package com.devcat.myapplication.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.devcat.myapplication.data.entity.CoinItem
import com.devcat.myapplication.presentation.ui.adapter.ListCoinAdapter
import com.devcat.myapplication.presentation.ui.base.BaseFragment
import com.devcat.myapplication.presentation.ui.viewmodel.ListCoinViewModel
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMainBinding

class MainFragment() : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var data = MutableLiveData<List<CoinItem>>()
        var viewModel = ListCoinViewModel(data)
        viewModel.setExampleData()
        binding.mainPageListCoin.apply {
            adapter = ListCoinAdapter(data)
            layoutManager = LinearLayoutManager(context)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


}