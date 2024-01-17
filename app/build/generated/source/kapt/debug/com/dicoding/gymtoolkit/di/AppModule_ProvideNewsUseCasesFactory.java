package com.dicoding.gymtoolkit.di;

import com.dicoding.gymtoolkit.data.local.NewsDao;
import com.dicoding.gymtoolkit.domain.repository.NewsRepository;
import com.dicoding.gymtoolkit.domain.usecases.news.NewsUseCases;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideNewsUseCasesFactory implements Factory<NewsUseCases> {
  private final Provider<NewsRepository> newsRepositoryProvider;

  private final Provider<NewsDao> newsDaoProvider;

  public AppModule_ProvideNewsUseCasesFactory(Provider<NewsRepository> newsRepositoryProvider,
      Provider<NewsDao> newsDaoProvider) {
    this.newsRepositoryProvider = newsRepositoryProvider;
    this.newsDaoProvider = newsDaoProvider;
  }

  @Override
  public NewsUseCases get() {
    return provideNewsUseCases(newsRepositoryProvider.get(), newsDaoProvider.get());
  }

  public static AppModule_ProvideNewsUseCasesFactory create(
      Provider<NewsRepository> newsRepositoryProvider, Provider<NewsDao> newsDaoProvider) {
    return new AppModule_ProvideNewsUseCasesFactory(newsRepositoryProvider, newsDaoProvider);
  }

  public static NewsUseCases provideNewsUseCases(NewsRepository newsRepository, NewsDao newsDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNewsUseCases(newsRepository, newsDao));
  }
}
