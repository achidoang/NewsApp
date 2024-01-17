package com.dicoding.gymtoolkit.presentation.details;

import com.dicoding.gymtoolkit.domain.usecases.news.NewsUseCases;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class DetailsViewModel_Factory implements Factory<DetailsViewModel> {
  private final Provider<NewsUseCases> newsUseCasesProvider;

  public DetailsViewModel_Factory(Provider<NewsUseCases> newsUseCasesProvider) {
    this.newsUseCasesProvider = newsUseCasesProvider;
  }

  @Override
  public DetailsViewModel get() {
    return newInstance(newsUseCasesProvider.get());
  }

  public static DetailsViewModel_Factory create(Provider<NewsUseCases> newsUseCasesProvider) {
    return new DetailsViewModel_Factory(newsUseCasesProvider);
  }

  public static DetailsViewModel newInstance(NewsUseCases newsUseCases) {
    return new DetailsViewModel(newsUseCases);
  }
}
