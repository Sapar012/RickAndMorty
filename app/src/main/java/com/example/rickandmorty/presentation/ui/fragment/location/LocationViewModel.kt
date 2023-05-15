package com.example.rickandmorty.presentation.ui.fragment.location

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rickandmorty.data.model.Location
import com.example.rickandmorty.data.model.MainResponse
import com.example.rickandmorty.data.repo.RickAndMortyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LocationViewModel @Inject constructor(
    private val repository : RickAndMortyRepository
):ViewModel() {


    var result : LiveData<MainResponse<Location>> = MutableLiveData()

    fun getCharacter(pager : Int) {
        result = repository.getLocation()
    }

}