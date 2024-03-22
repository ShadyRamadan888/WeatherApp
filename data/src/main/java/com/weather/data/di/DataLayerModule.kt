package com.weather.data.di

import com.weather.core.utils.Constants
import com.weather.data.remote.ApiService
import com.weather.data.repo.WeatherRepo
import com.weather.data.repo.WeatherRepoImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataLayerModule {

    @Singleton
    @Provides
    fun provideWeatherApi(): ApiService {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
    @Provides
    fun provideWeatherRepo(apiService: ApiService): WeatherRepo{
        return WeatherRepoImp(apiService)
    }

}