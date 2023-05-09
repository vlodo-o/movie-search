package com.practicum.moviesearch.data.dto

import com.practicum.moviesearch.domain.models.Movie

data class MoviesSearchResponse(val searchType: String,
                                val expression: String,
                                val results: List<Movie>)