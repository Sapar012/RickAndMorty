package com.example.rickandmorty.presentation.ui.fragment.character

import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.rickandmorty.data.model.Result
import com.example.rickandmorty.data.service.ApiService
import com.example.rickandmorty.databinding.FragmentCharacterBinding
import com.example.rickandmorty.presentation.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CharacterFragment :
    BaseFragment<FragmentCharacterBinding>(FragmentCharacterBinding::inflate) {

    private val viewModel by lazy { ViewModelProvider(requireActivity())[CharacterViewModel::class.java] }
    private lateinit var adapter: CharacterAdapter


    override fun setupUI() {
        adapter = CharacterAdapter()
        binding.rvCharacter.adapter = adapter
    }

    override fun setupObserver() {
        viewModel.liveData.observe(viewLifecycleOwner) {
            adapter.setList(it.results as ArrayList<Result>)
            Log.e("ololo", "${it.results}", )
        }
    }
}
