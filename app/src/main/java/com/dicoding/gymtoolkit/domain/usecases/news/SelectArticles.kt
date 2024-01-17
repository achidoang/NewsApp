package com.dicoding.gymtoolkit.domain.usecases.news

import com.dicoding.gymtoolkit.data.local.NewsDao
import com.dicoding.gymtoolkit.domain.model.Article
import com.dicoding.gymtoolkit.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SelectArticles(
    private val newsRepository: NewsRepository
){

    operator fun invoke(): Flow<List<Article>>{
        return newsRepository.selectArticles()
    }
}