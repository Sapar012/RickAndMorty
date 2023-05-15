package com.example.rickandmorty.presentation.ui.fragment.pager

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.rickandmorty.presentation.ui.fragment.character.CharacterFragment
import com.example.rickandmorty.presentation.ui.fragment.episode.EpiSodeFragment
import com.example.rickandmorty.presentation.ui.fragment.location.LocetionFragment

class PagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> CharacterFragment()
            1 -> LocetionFragment()
            2 -> EpiSodeFragment()
            else -> CharacterFragment()
        }
    }
}
