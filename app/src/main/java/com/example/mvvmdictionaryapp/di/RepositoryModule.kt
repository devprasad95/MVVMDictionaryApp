package com.example.mvvmdictionaryapp.di

import com.example.mvvmdictionaryapp.data.repository.DictionaryRepositoryImpl
import com.example.mvvmdictionaryapp.domain.repostiory.DictionaryRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindDictionaryRepository(
        dictionaryRepositoryImpl: DictionaryRepositoryImpl
    ): DictionaryRepository
}