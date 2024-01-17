package com.dicoding.gymtoolkit.di;

import com.dicoding.gymtoolkit.domain.manager.LocalUserManager;
import com.dicoding.gymtoolkit.domain.usecases.app_entry.AppEntryUseCases;
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
public final class AppModule_ProvideAppEntryUseCasesFactory implements Factory<AppEntryUseCases> {
  private final Provider<LocalUserManager> localUserMangerProvider;

  public AppModule_ProvideAppEntryUseCasesFactory(
      Provider<LocalUserManager> localUserMangerProvider) {
    this.localUserMangerProvider = localUserMangerProvider;
  }

  @Override
  public AppEntryUseCases get() {
    return provideAppEntryUseCases(localUserMangerProvider.get());
  }

  public static AppModule_ProvideAppEntryUseCasesFactory create(
      Provider<LocalUserManager> localUserMangerProvider) {
    return new AppModule_ProvideAppEntryUseCasesFactory(localUserMangerProvider);
  }

  public static AppEntryUseCases provideAppEntryUseCases(LocalUserManager localUserManger) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAppEntryUseCases(localUserManger));
  }
}
