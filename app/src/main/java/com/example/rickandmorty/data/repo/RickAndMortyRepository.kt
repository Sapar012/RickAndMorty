package com.example.rickandmorty.data.repo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.rickandmorty.data.model.Location
import com.example.rickandmorty.data.model.MainResponse
import com.example.rickandmorty.data.model.Result
import com.example.rickandmorty.data.service.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class RickAndMortyRepository @Inject constructor(private val apiService: ApiService) {


    fun getCharacter(page : Int): LiveData<MainResponse<Result>> {
        val liveData = MutableLiveData<MainResponse<Result>>()
        apiService.getCharacter(page = page).enqueue(object : Callback<MainResponse<Result>> {
            override fun onResponse(
                call: Call<MainResponse<Result>>,
                response: Response<MainResponse<Result>>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    liveData.value = response.body()
                }
            }

            override fun onFailure(call: Call<MainResponse<Result>>, t: Throwable) {
                t.localizedMessage?.let { Log.e("ololo", it) }
            }
        })
        return liveData
    }

    fun getLocation(): LiveData<MainResponse<Location>> {
        val liveData = MutableLiveData<MainResponse<Location>>()
        apiService.getLocation().enqueue(object : Callback<MainResponse<Location>> {
            override fun onResponse(
                call: Call<MainResponse<Location>>,
                response: Response<MainResponse<Location>>)
             {
                if (response.isSuccessful && response.body() != null) {
                    liveData.value = response.body()
                }
            }

            override fun onFailure(call: Call<MainResponse<Location>>, t: Throwable) {
                t.localizedMessage?.let { Log.e("ololo", it) }
            }
        })
            return liveData
    }

}