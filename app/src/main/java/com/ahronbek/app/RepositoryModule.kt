package com.ahronbek.app

import com.ahronbek.weatherapp.data.location.DefaultLocationTracker
import com.ahronbek.weatherapp.data.repository.WeatherRepositoryImpl
import com.ahronbek.weatherapp.domain.location.LocationTracker
import com.ahronbek.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}