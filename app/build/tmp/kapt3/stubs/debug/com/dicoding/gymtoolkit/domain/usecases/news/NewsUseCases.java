package com.dicoding.gymtoolkit.domain.usecases.news;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\rH\u00c6\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lcom/dicoding/gymtoolkit/domain/usecases/news/NewsUseCases;", "", "getNews", "Lcom/dicoding/gymtoolkit/domain/usecases/news/GetNews;", "searchNews", "Lcom/dicoding/gymtoolkit/domain/usecases/news/SearchNews;", "upsertArticle", "Lcom/dicoding/gymtoolkit/domain/usecases/news/UpsertArticle;", "deleteArticle", "Lcom/dicoding/gymtoolkit/domain/usecases/news/DeleteArticle;", "selectArticles", "Lcom/dicoding/gymtoolkit/domain/usecases/news/SelectArticles;", "selectArticle", "Lcom/dicoding/gymtoolkit/domain/usecases/news/SelectArticle;", "(Lcom/dicoding/gymtoolkit/domain/usecases/news/GetNews;Lcom/dicoding/gymtoolkit/domain/usecases/news/SearchNews;Lcom/dicoding/gymtoolkit/domain/usecases/news/UpsertArticle;Lcom/dicoding/gymtoolkit/domain/usecases/news/DeleteArticle;Lcom/dicoding/gymtoolkit/domain/usecases/news/SelectArticles;Lcom/dicoding/gymtoolkit/domain/usecases/news/SelectArticle;)V", "getDeleteArticle", "()Lcom/dicoding/gymtoolkit/domain/usecases/news/DeleteArticle;", "getGetNews", "()Lcom/dicoding/gymtoolkit/domain/usecases/news/GetNews;", "getSearchNews", "()Lcom/dicoding/gymtoolkit/domain/usecases/news/SearchNews;", "getSelectArticle", "()Lcom/dicoding/gymtoolkit/domain/usecases/news/SelectArticle;", "getSelectArticles", "()Lcom/dicoding/gymtoolkit/domain/usecases/news/SelectArticles;", "getUpsertArticle", "()Lcom/dicoding/gymtoolkit/domain/usecases/news/UpsertArticle;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class NewsUseCases {
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.gymtoolkit.domain.usecases.news.GetNews getNews = null;
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.gymtoolkit.domain.usecases.news.SearchNews searchNews = null;
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.gymtoolkit.domain.usecases.news.UpsertArticle upsertArticle = null;
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.gymtoolkit.domain.usecases.news.DeleteArticle deleteArticle = null;
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.gymtoolkit.domain.usecases.news.SelectArticles selectArticles = null;
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.gymtoolkit.domain.usecases.news.SelectArticle selectArticle = null;
    
    public NewsUseCases(@org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.GetNews getNews, @org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.SearchNews searchNews, @org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.UpsertArticle upsertArticle, @org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.DeleteArticle deleteArticle, @org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.SelectArticles selectArticles, @org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.SelectArticle selectArticle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.GetNews getGetNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.SearchNews getSearchNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.UpsertArticle getUpsertArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.DeleteArticle getDeleteArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.SelectArticles getSelectArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.SelectArticle getSelectArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.GetNews component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.SearchNews component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.UpsertArticle component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.DeleteArticle component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.SelectArticles component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.SelectArticle component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.NewsUseCases copy(@org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.GetNews getNews, @org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.SearchNews searchNews, @org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.UpsertArticle upsertArticle, @org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.DeleteArticle deleteArticle, @org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.SelectArticles selectArticles, @org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.usecases.news.SelectArticle selectArticle) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}