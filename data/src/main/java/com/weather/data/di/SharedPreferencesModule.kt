package com.weather.data.di

import android.content.Context
import android.content.SharedPreferences
import com.weather.core.utils.Constants
import com.weather.data.local.SharedPreferenceManager
import com.weather.data.local.SharedPreferenceManagerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object SharedPreferencesModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences(Constants.SHARED_PREFS, Context.MODE_PRIVATE)
    }

    @Provides
    fun provideCitySharedPrefsManager(sharedPreferences: SharedPreferences): SharedPreferenceManager {
        return SharedPreferenceManagerImpl(sharedPreferences)
    }
}