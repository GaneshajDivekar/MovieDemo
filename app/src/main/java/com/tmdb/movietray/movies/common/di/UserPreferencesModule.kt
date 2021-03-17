package com.tmdb.movietray.movies.common.di

import com.tmdb.movietray.movies.common.data.source.local.store.IUserPreferenceManager
import com.tmdb.movietray.movies.common.data.source.local.store.UserPreferenceManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
object UserPreferencesModule {

    @Provides
    fun provideUserPreferenceManager(iUserPreferenceManager: IUserPreferenceManager): UserPreferenceManager {
        return iUserPreferenceManager
    }
}