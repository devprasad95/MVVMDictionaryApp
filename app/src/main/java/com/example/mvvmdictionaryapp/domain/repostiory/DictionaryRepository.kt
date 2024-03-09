package com.example.mvvmdictionaryapp.domain.repostiory

import com.example.mvvmdictionaryapp.domain.model.WordItem
import com.example.mvvmdictionaryapp.util.Result
import kotlinx.coroutines.flow.Flow

interface DictionaryRepository {
    suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>>
}