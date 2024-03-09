package com.example.mvvmdictionaryapp.data.api

import com.example.mvvmdictionaryapp.data.dto.WordResultDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {
    @GET("{word}")
    suspend fun getWordResult(
        @Path("word") word: String
    ): WordResultDto? = null

    companion object {
        const val BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/"
    }
}