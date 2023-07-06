package com.devcat.myapplication.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devcat.myapplication.presentation.ui.base.BaseFragment
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override val bindingFactory: (LayoutInflater) -> FragmentMainBinding
        get() = {FragmentMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


}