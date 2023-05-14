package com.practicum.moviesearch.ui.poster

import android.app.Activity
import android.os.Bundle
import com.practicum.moviesearch.util.Creator
import com.practicum.moviesearch.R

class PosterActivity : Activity() {

    private val posterController = Creator.providePosterController(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poster)
        posterController.onCreate()
    }
}