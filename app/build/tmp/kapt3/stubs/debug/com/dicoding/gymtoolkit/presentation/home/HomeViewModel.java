package com.dicoding.gymtoolkit.presentation.home;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/dicoding/gymtoolkit/presentation/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "newsUseCases", "Lcom/dicoding/gymtoolkit/domain/usecases/news/NewsUseCases;", "(Lcom/dicoding/gymtoolkit/domain/usecases/news/NewsUseCases;)V", "news", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/dicoding/gymtoolkit/domain/model/Article;", "getNews", "()Lkotlinx/coroutines/flow/Flow;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "Lcom/dicoding/gymtoolkit/presentation/home/HomeState;", "state", "getState", "()Landroidx/compose/runtime/MutableState;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.gymtoolkit.domain.usecases.news.NewsUseCases newsUseCases = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<com.dicoding.gymtoolkit.presentation.home.HomeState> state;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.dicoding.gymtoolkit.domain.model.Article>> news = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.NewsUseCases newsUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.dicoding.gymtoolkit.presentation.home.HomeState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.dicoding.gymtoolkit.domain.model.Article>> getNews() {
        return null;
    }
}