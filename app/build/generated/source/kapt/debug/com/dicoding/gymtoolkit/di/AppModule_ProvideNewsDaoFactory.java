package com.dicoding.gymtoolkit.di;

import com.dicoding.gymtoolkit.data.local.NewsDao;
import com.dicoding.gymtoolkit.data.local.NewsDatabase;
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
public final class AppModule_ProvideNewsDaoFactory implements Factory<NewsDao> {
  private final Provider<NewsDatabase> newsDatabaseProvider;

  public AppModule_ProvideNewsDaoFactory(Provider<NewsDatabase> newsDatabaseProvider) {
    this.newsDatabaseProvider = newsDatabaseProvider;
  }

  @Override
  public NewsDao get() {
    return provideNewsDao(newsDatabaseProvider.get());
  }

  public static AppModule_ProvideNewsDaoFactory create(
      Provider<NewsDatabase> newsDatabaseProvider) {
    return new AppModule_ProvideNewsDaoFactory(newsDatabaseProvider);
  }

  public static NewsDao provideNewsDao(NewsDatabase newsDatabase) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNewsDao(newsDatabase));
  }
}
