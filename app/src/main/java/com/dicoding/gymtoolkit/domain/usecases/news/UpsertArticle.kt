package com.dicoding.gymtoolkit.domain.usecases.news

import com.dicoding.gymtoolkit.data.local.NewsDao
import com.dicoding.gymtoolkit.domain.model.Article
import com.dicoding.gymtoolkit.domain.repository.NewsRepository

class UpsertArticle (
    private val newsRepository: NewsRepository
){

    suspend operator fun invoke(article: Article){
        newsRepository.upsertArticle(article)
    }
}