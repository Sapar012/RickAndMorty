package com.example.rickandmorty.data.service

import com.example.rickandmorty.data.model.Location
import com.example.rickandmorty.data.model.MainResponse
import com.example.rickandmorty.data.model.Result
import com.example.rickandmorty.data.model.ResultX
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/character")
    fun getCharacter(
        @Query("page") page:Int? = 1
    ):Call<MainResponse<Result>>

    @GET("/location")
    fun getLocation():Call<MainResponse<Location>>

    @GET("/episode")
    fun getEpisode():Call<MainResponse<ResultX>>
}