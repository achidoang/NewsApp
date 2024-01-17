package com.dicoding.gymtoolkit.di

import android.app.Application
import androidx.room.Room
import com.dicoding.gymtoolkit.data.local.NewsDao
import com.dicoding.gymtoolkit.data.local.NewsDatabase
import com.dicoding.gymtoolkit.data.local.NewsTypeConvertor
import com.dicoding.gymtoolkit.data.manager.LocalUserManagerImpl
import com.dicoding.gymtoolkit.data.remote.NewsApi
import com.dicoding.gymtoolkit.data.repository.NewsRepositoryImpl
import com.dicoding.gymtoolkit.domain.manager.LocalUserManager
import com.dicoding.gymtoolkit.domain.repository.NewsRepository
import com.dicoding.gymtoolkit.domain.usecases.app_entry.AppEntryUseCases
import com.dicoding.gymtoolkit.domain.usecases.app_entry.ReadAppEntry
import com.dicoding.gymtoolkit.domain.usecases.app_entry.SaveAppEntry
import com.dicoding.gymtoolkit.domain.usecases.news.DeleteArticle
import com.dicoding.gymtoolkit.domain.usecases.news.GetNews
import com.dicoding.gymtoolkit.domain.usecases.news.NewsUseCases
import com.dicoding.gymtoolkit.domain.usecases.news.SearchNews
import com.dicoding.gymtoolkit.domain.usecases.news.SelectArticle
import com.dicoding.gymtoolkit.domain.usecases.news.SelectArticles
import com.dicoding.gymtoolkit.domain.usecases.news.UpsertArticle
import com.dicoding.gymtoolkit.util.Constants.BASE_URL
import com.dicoding.gymtoolkit.util.Constants.NEWS_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManager
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )

    @Provides
    @Singleton
    fun provideApiInstance(): NewsApi {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideNewsRepository(
        newsApi: NewsApi,
        newsDao: NewsDao
    ): NewsRepository {
        return NewsRepositoryImpl(newsApi, newsDao)
    }

    @Provides
    @Singleton
    fun provideNewsUseCases(
        newsRepository: NewsRepository,
        newsDao: NewsDao
    ): NewsUseCases {
        return NewsUseCases(
            getNews = GetNews(newsRepository),
            searchNews = SearchNews(newsRepository),
            upsertArticle = UpsertArticle(newsRepository),
            deleteArticle = DeleteArticle(newsRepository),
            selectArticles = SelectArticles(newsRepository),
            selectArticle = SelectArticle(newsRepository)
        )
    }

    @Provides
    @Singleton
    fun provideNewsDatabase(
        application: Application
    ): NewsDatabase {
        return Room.databaseBuilder(
            context = application,
            klass = NewsDatabase::class.java,
            name = NEWS_DATABASE_NAME
        ).addTypeConverter(NewsTypeConvertor())
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideNewsDao(
        newsDatabase: NewsDatabase
    ): NewsDao = newsDatabase.newsDao
}