package com.example.mvvmdictionaryapp.presentation

import com.example.mvvmdictionaryapp.domain.model.WordItem

data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",
    val wordItem: WordItem? = null
)
