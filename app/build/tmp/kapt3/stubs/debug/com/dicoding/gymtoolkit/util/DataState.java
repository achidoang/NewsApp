package com.dicoding.gymtoolkit.util;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/dicoding/gymtoolkit/util/DataState;", "T", "", "()V", "Loading", "Response", "Success", "Lcom/dicoding/gymtoolkit/util/DataState$Loading;", "Lcom/dicoding/gymtoolkit/util/DataState$Response;", "Lcom/dicoding/gymtoolkit/util/DataState$Success;", "app_debug"})
public abstract class DataState<T extends java.lang.Object> {
    
    private DataState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0004H\u00c6\u0003J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/dicoding/gymtoolkit/util/DataState$Loading;", "T", "Lcom/dicoding/gymtoolkit/util/DataState;", "isLoading", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.dicoding.gymtoolkit.util.DataState<T> {
        private final boolean isLoading = false;
        
        public Loading(boolean isLoading) {
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        public final boolean component1() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.gymtoolkit.util.DataState.Loading<T> copy(boolean isLoading) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0004H\u00c6\u0003J\u0011\u0010\u000e\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u00c6\u0003J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0019\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/dicoding/gymtoolkit/util/DataState$Response;", "T", "Lcom/dicoding/gymtoolkit/util/DataState;", "uiComponent", "Lcom/dicoding/gymtoolkit/util/UIComponent;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lcom/dicoding/gymtoolkit/util/UIComponent;Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "getUiComponent", "()Lcom/dicoding/gymtoolkit/util/UIComponent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Response<T extends java.lang.Object> extends com.dicoding.gymtoolkit.util.DataState<T> {
        @org.jetbrains.annotations.NotNull
        private final com.dicoding.gymtoolkit.util.UIComponent uiComponent = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Exception error = null;
        
        public Response(@org.jetbrains.annotations.NotNull
        com.dicoding.gymtoolkit.util.UIComponent uiComponent, @org.jetbrains.annotations.Nullable
        java.lang.Exception error) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.gymtoolkit.util.UIComponent getUiComponent() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Exception getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.gymtoolkit.util.UIComponent component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Exception component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.gymtoolkit.util.DataState.Response<T> copy(@org.jetbrains.annotations.NotNull
        com.dicoding.gymtoolkit.util.UIComponent uiComponent, @org.jetbrains.annotations.Nullable
        java.lang.Exception error) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/dicoding/gymtoolkit/util/DataState$Success;", "T", "Lcom/dicoding/gymtoolkit/util/DataState;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/dicoding/gymtoolkit/util/DataState$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.dicoding.gymtoolkit.util.DataState<T> {
        private final T data = null;
        
        public Success(T data) {
        }
        
        public final T getData() {
            return null;
        }
        
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.gymtoolkit.util.DataState.Success<T> copy(T data) {
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
}