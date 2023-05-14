package com.practicum.moviesearch.data

import com.practicum.moviesearch.data.dto.Response

interface NetworkClient {
    fun doRequest(dto: Any): Response

}