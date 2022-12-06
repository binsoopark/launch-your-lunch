package com.hipaduck.launchyourlunch.di

import com.hipaduck.launchyourlunch.data.remote.api.WheatherApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideWeatherApi(
        retrofit: Retrofit
    ): WheatherApi {
        return retrofit.create(WheatherApi::class.java)
    }
}