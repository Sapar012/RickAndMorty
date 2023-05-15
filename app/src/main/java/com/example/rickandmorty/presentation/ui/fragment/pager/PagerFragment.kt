package com.example.rickandmorty.presentation.ui.fragment.pager

import com.example.rickandmorty.databinding.FragmentPagerBinding
import com.example.rickandmorty.presentation.ui.base.BaseFragment
import com.google.android.material.tabs.TabLayoutMediator

class PagerFragment : BaseFragment<FragmentPagerBinding>(FragmentPagerBinding::inflate) {

    private val adapter: PagerAdapter by lazy {
        PagerAdapter(this)
    }

    override fun setupUI() {
        val list = listOf(
            "CharacterFragment",
            "LocetionFragment",
            "EpiSodeFragment"
        )

        binding.View2.adapter = adapter

        TabLayoutMediator(binding.pagerTab, binding.View2) { tab, post ->
            tab.text = list[post]
        }.attach()
    }

    override fun setupObserver() {

    }
}