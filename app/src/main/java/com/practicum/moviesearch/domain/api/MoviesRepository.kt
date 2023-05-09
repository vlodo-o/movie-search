package com.practicum.moviesearch.domain.api

import com.practicum.moviesearch.domain.models.Movie
import com.practicum.moviesearch.util.Resource

interface MoviesRepository {
    fun searchMovies(expression: String): Resource<List<Movie>>
}