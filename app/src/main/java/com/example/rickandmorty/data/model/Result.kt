package com.example.rickandmorty.data.model

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("gender")
    val gender: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val imgUrl: String,
    @SerializedName("name")
    val nameCharacter: String,
    @SerializedName("status")
    val statusLife: String,
    @SerializedName("species")
    val type: String,
)