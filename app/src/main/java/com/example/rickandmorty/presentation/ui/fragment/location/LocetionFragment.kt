package com.example.rickandmorty.presentation.ui.fragment.location

import androidx.lifecycle.ViewModelProvider
import com.example.rickandmorty.databinding.FragmentLoketionBinding
import com.example.rickandmorty.presentation.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LocetionFragment : BaseFragment<FragmentLoketionBinding>(FragmentLoketionBinding::inflate) {

    private val viewModel: LocationViewModel by lazy { ViewModelProvider(this)[LocationViewModel::class.java] }
    private val adapter: LocationAdapter by lazy { LocationAdapter() }


    override fun setupUI() {

    }

    override fun setupObserver() {
        viewModel.result.observe(viewLifecycleOwner){
            binding.rvLocation.adapter = adapter
        }
    }
}