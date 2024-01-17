package com.dicoding.gymtoolkit.domain.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J*\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\bH&J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/dicoding/gymtoolkit/domain/repository/NewsRepository;", "", "deleteArticle", "", "article", "Lcom/dicoding/gymtoolkit/domain/model/Article;", "(Lcom/dicoding/gymtoolkit/domain/model/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNews", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "sources", "", "", "searchNews", "searchQuery", "selectArticle", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectArticles", "upsertArticle", "app_debug"})
public abstract interface NewsRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.dicoding.gymtoolkit.domain.model.Article>> getNews(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sources);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.dicoding.gymtoolkit.domain.model.Article>> searchNews(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sources);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsertArticle(@org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.model.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteArticle(@org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.model.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dicoding.gymtoolkit.domain.model.Article>> selectArticles();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object selectArticle(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dicoding.gymtoolkit.domain.model.Article> $completion);
}