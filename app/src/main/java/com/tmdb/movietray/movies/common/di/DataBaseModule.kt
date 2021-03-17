package com.tmdb.movietray.movies.common.di

import android.content.Context
import com.tmdb.movietray.movies.common.data.source.local.db.MovieDatabase
import com.tmdb.movietray.movies.home.popular.data.apihelper.PopularMovieService
import com.tmdb.movietray.movies.home.toprated.data.apihelper.TopRatedMovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
object DataBaseModule {
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): MovieDatabase =
        MovieDatabase.getInstance(context)
}