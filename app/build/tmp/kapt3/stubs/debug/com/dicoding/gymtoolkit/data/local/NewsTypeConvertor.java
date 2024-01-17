package com.dicoding.gymtoolkit.data.local;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/dicoding/gymtoolkit/data/local/NewsTypeConvertor;", "", "()V", "sourceToString", "", "source", "Lcom/dicoding/gymtoolkit/domain/model/Source;", "stringToSource", "app_debug"})
@androidx.room.ProvidedTypeConverter
public final class NewsTypeConvertor {
    
    public NewsTypeConvertor() {
        super();
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String sourceToString(@org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.model.Source source) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.model.Source stringToSource(@org.jetbrains.annotations.NotNull
    java.lang.String source) {
        return null;
    }
}