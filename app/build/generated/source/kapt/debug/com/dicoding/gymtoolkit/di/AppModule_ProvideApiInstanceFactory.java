package com.dicoding.gymtoolkit.di;

import com.dicoding.gymtoolkit.data.remote.NewsApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideApiInstanceFactory implements Factory<NewsApi> {
  @Override
  public NewsApi get() {
    return provideApiInstance();
  }

  public static AppModule_ProvideApiInstanceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NewsApi provideApiInstance() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApiInstance());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideApiInstanceFactory INSTANCE = new AppModule_ProvideApiInstanceFactory();
  }
}
