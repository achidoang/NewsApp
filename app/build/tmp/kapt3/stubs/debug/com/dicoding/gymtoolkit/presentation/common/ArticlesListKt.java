package com.dicoding.gymtoolkit.presentation.common;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a4\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a4\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\b\u0010\n\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a8\u0006\r"}, d2 = {"ArticlesList", "", "modifier", "Landroidx/compose/ui/Modifier;", "articles", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/dicoding/gymtoolkit/domain/model/Article;", "onClick", "Lkotlin/Function1;", "", "ShimmerEffect", "handlePagingResult", "", "app_debug"})
public final class ArticlesListKt {
    
    @androidx.compose.runtime.Composable
    public static final void ArticlesList(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.util.List<com.dicoding.gymtoolkit.domain.model.Article> articles, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.dicoding.gymtoolkit.domain.model.Article, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ArticlesList(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.dicoding.gymtoolkit.domain.model.Article> articles, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.dicoding.gymtoolkit.domain.model.Article, kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final boolean handlePagingResult(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.dicoding.gymtoolkit.domain.model.Article> articles) {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    public static final void ShimmerEffect() {
    }
}