package com.example.hw8m5_geeks.repository

import com.example.hw8m5_geeks.data.RickAndMortyApiService
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val apiService: RickAndMortyApiService
) {
    fun getCharacter(page: Int) = apiService.getCharacters(page)
}