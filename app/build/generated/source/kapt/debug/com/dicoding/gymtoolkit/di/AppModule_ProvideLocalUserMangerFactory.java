package com.dicoding.gymtoolkit.di;

import android.app.Application;
import com.dicoding.gymtoolkit.domain.manager.LocalUserManager;
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
public final class AppModule_ProvideLocalUserMangerFactory implements Factory<LocalUserManager> {
  private final Provider<Application> applicationProvider;

  public AppModule_ProvideLocalUserMangerFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public LocalUserManager get() {
    return provideLocalUserManger(applicationProvider.get());
  }

  public static AppModule_ProvideLocalUserMangerFactory create(
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideLocalUserMangerFactory(applicationProvider);
  }

  public static LocalUserManager provideLocalUserManger(Application application) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideLocalUserManger(application));
  }
}
