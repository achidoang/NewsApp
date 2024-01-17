package com.dicoding.gymtoolkit.presentation.bookmark

import com.dicoding.gymtoolkit.domain.model.Article

data class BookmarkState (
    val articles: List<Article> = emptyList()
)