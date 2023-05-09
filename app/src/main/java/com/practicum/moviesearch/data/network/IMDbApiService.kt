package com.practicum.moviesearch.data.network

import com.practicum.moviesearch.Consts.API_KEY
import com.practicum.moviesearch.data.dto.MoviesSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IMDbApiService {
    @GET("/en/API/SearchMovie/$API_KEY/{expression}")
    fun findMovie(@Path("expression") expression: String): Call<MoviesSearchResponse>
}