package com.example.hw8m5_geeks.data


import com.example.hw8m5_geeks.model.CharacterResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMortyApiService {
    @GET("character")
    fun getCharacters(@Query("page") page: Int): retrofit2.Call<CharacterResponse>
}
