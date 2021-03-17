package com.tmdb.movietray.movies.home.toprated.di

import com.tmdb.movietray.movies.home.toprated.data.apihelper.ITopRatedMoviesRepository
import com.tmdb.movietray.movies.home.toprated.data.apihelper.TopRatedMoviesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
class TopRatedRepositoryModule {

    @Provides
    fun provideTopRatedMoviesRepository(iTopRatedMoviesRepository: ITopRatedMoviesRepository): TopRatedMoviesRepository {
        return iTopRatedMoviesRepository
    }
}