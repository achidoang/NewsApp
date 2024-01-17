package com.dicoding.gymtoolkit.presentation.details

import com.dicoding.gymtoolkit.domain.model.Article

sealed class DetailsEvent {

    data class UpsertDeleteArticle(val article: Article) : DetailsEvent()

    object RemoveSideEffect : DetailsEvent()
}