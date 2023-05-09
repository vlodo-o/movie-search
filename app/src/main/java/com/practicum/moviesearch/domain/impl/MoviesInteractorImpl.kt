package com.practicum.moviesearch.domain.impl

import com.practicum.moviesearch.domain.api.MoviesInteractor
import com.practicum.moviesearch.domain.api.MoviesRepository

class MoviesInteractorImpl(private val repository: MoviesRepository) : MoviesInteractor {

    override fun searchMovies(expression: String, consumer: MoviesInteractor.MoviesConsumer) {
        val t = Thread {
            consumer.consume(repository.searchMovies(expression))
        }
        t.start()
    }
}