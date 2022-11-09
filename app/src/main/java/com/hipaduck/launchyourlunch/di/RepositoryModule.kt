package com.hipaduck.launchyourlunch.di

import com.hipaduck.launchyourlunch.data.remote.api.WheatherApi
import com.hipaduck.launchyourlunch.data.repository.WeatherRepositoryImpl
import com.hipaduck.launchyourlunch.domain.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideWeatherRepository(
        retrofit: Retrofit,
        api: WheatherApi,
    ): WeatherRepository {
        return WeatherRepositoryImpl(retrofit, api)
    }

    @Singleton
    @Provides
    fun provideWeatherApi(
        retrofit: Retrofit
    ): WheatherApi {
        return retrofit.create(WheatherApi::class.java)
    }
}