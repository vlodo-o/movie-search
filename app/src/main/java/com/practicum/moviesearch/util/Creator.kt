package com.practicum.moviesearch.util

import android.app.Activity
import android.content.Context
import com.practicum.moviesearch.domain.impl.MoviesRepositoryImpl
import com.practicum.moviesearch.data.network.RetrofitNetworkClient
import com.practicum.moviesearch.domain.api.MoviesInteractor
import com.practicum.moviesearch.domain.api.MoviesRepository
import com.practicum.moviesearch.domain.impl.MoviesInteractorImpl
import com.practicum.moviesearch.presentation.movies.MoviesSearchPresenter
import com.practicum.moviesearch.presentation.PosterController
import com.practicum.moviesearch.presentation.movies.MoviesView
import com.practicum.moviesearch.ui.movies.MoviesAdapter

object Creator {

    private fun getMoviesRepository(context: Context): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient(context))
    }

    fun provideMoviesInteractor(context: Context): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository(context))
    }

    fun provideMoviesSearchPresenter(
        moviesView: MoviesView,
        context: Context
    ): MoviesSearchPresenter {
        return MoviesSearchPresenter(
            view = moviesView,
            context = context,
        )
    }

    fun providePosterController(activity: Activity): PosterController {
        return PosterController(activity)
    }
}