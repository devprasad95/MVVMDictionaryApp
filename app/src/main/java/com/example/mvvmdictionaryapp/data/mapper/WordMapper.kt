package com.example.mvvmdictionaryapp.data.mapper

import com.example.mvvmdictionaryapp.data.dto.DefinitionDto
import com.example.mvvmdictionaryapp.data.dto.MeaningDto
import com.example.mvvmdictionaryapp.data.dto.WordItemDto
import com.example.mvvmdictionaryapp.domain.model.Definition
import com.example.mvvmdictionaryapp.domain.model.Meaning
import com.example.mvvmdictionaryapp.domain.model.WordItem

fun WordItemDto.toWordItem() = WordItem(
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    } ?: emptyList(),
    phonetic = phonetic?: ""
)


fun MeaningDto.toMeaning() = Meaning(
    definition = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: ""
)

fun definitionDtoToDefinition(
    definitionDto: DefinitionDto?
) = Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""
)