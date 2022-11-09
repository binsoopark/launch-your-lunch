package com.hipaduck.launchyourlunch.di

import com.hipaduck.launchyourlunch.domain.GetWeather
import com.hipaduck.launchyourlunch.domain.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UsecaseModule {
    @Singleton
    @Provides
    fun providesGetWeather(
        repository: WeatherRepository,
    ): GetWeather {
        return GetWeather(repository)
    }
}