package com.example.rickandmorty.presentation.ui.fragment.character

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rickandmorty.data.model.MainResponse
import com.example.rickandmorty.data.model.Result
import com.example.rickandmorty.data.repo.RickAndMortyRepository
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val repository : RickAndMortyRepository
) : ViewModel() {

    var liveData : LiveData<MainResponse<Result>> = MutableLiveData()

    fun getCharacter(page:Int) {
        liveData = repository.getCharacter(page)
    }
}