package com.example.weatherapp.di

import android.content.Context
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.arkivanov.mvikotlin.main.store.DefaultStoreFactory
import com.example.weatherapp.data.local.db.FavouriteCitiesDao
import com.example.weatherapp.data.local.db.FavouriteDatabase
import com.example.weatherapp.data.network.api.ApiFactory
import com.example.weatherapp.data.network.api.ApiService
import com.example.weatherapp.data.repository.FavouriteRepositoryImpl
import com.example.weatherapp.data.repository.SearchRepositoryImpl
import com.example.weatherapp.data.repository.WeatherRepositoryImpl
import com.example.weatherapp.domain.repository.FavouriteRepository
import com.example.weatherapp.domain.repository.SearchRepository
import com.example.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface PresentationModule {

    companion object {

        @Singleton
        @Provides
        fun provideStoreFactory(): StoreFactory = DefaultStoreFactory()
    }
}