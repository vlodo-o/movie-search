package com.practicum.moviesearch

import com.practicum.moviesearch.data.MoviesRepositoryImpl
import com.practicum.moviesearch.data.network.RetrofitNetworkClient
import com.practicum.moviesearch.domain.api.MoviesInteractor
import com.practicum.moviesearch.domain.api.MoviesRepository
import com.practicum.moviesearch.domain.impl.MoviesInteractorImpl

object Creator {
    private fun getMoviesRepository(): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient())
    }

    fun provideMoviesInteractor(): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository())
    }
}