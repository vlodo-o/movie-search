package com.practicum.moviesearch.presentation.movies

import com.practicum.moviesearch.domain.models.Movie
import com.practicum.moviesearch.ui.movies.models.MoviesState

interface MoviesView {

    // Методы, меняющие внешний вид экрана

    fun render(state: MoviesState)

    // Методы «одноразовых событий»

    fun showToast(additionalMessage: String)

}