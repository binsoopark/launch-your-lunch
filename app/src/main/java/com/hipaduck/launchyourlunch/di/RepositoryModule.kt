package com.hipaduck.launchyourlunch.di

import com.hipaduck.launchyourlunch.data.repository.WeatherRepositoryImpl
import com.hipaduck.launchyourlunch.domain.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl,
    ): WeatherRepository

}


//class WeatherApiImpl @Inject constructor(): WheatherApi {
//    override suspend fun requestWeather(
//        serviceKey: String,
//        nx: String,
//        ny: String,
//        baseDate: String,
//        baseTime: String,
//        dataType: String
//    ): Response<WheatherResponse> {
//        TODO("Not yet implemented")
//    }
