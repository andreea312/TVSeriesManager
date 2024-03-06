package com.example.myfirstapp.todo.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\r0\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0011\u0010!\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000fJ\u0011\u0010#\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010$\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0019J\u0019\u0010\'\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/example/myfirstapp/todo/data/ItemRepository;", "", "itemService", "Lcom/example/myfirstapp/todo/data/remote/ItemService;", "itemWsClient", "Lcom/example/myfirstapp/todo/data/remote/ItemWsClient;", "database", "Lcom/example/myfirstapp/todo/data/SeriesDatabase;", "context", "Landroid/content/Context;", "(Lcom/example/myfirstapp/todo/data/remote/ItemService;Lcom/example/myfirstapp/todo/data/remote/ItemWsClient;Lcom/example/myfirstapp/todo/data/SeriesDatabase;Landroid/content/Context;)V", "itemsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/myfirstapp/core/Result;", "", "Lcom/example/myfirstapp/todo/data/Series;", "seriesStream", "Lkotlinx/coroutines/flow/Flow;", "getSeriesStream", "()Lkotlinx/coroutines/flow/Flow;", "seriess", "closeWsClient", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBearerToken", "", "getItemEvents", "Lcom/example/myfirstapp/todo/data/remote/ItemEvent;", "handleItemCreated", "series", "(Lcom/example/myfirstapp/todo/data/Series;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleItemDeleted", "handleItemUpdated", "openWsClient", "quite_remove", "refresh", "save", "setToken", "token", "update", "app_debug"})
public final class ItemRepository {
    private final com.example.myfirstapp.todo.data.remote.ItemService itemService = null;
    private final com.example.myfirstapp.todo.data.remote.ItemWsClient itemWsClient = null;
    private final com.example.myfirstapp.todo.data.SeriesDatabase database = null;
    private final android.content.Context context = null;
    private java.util.List<com.example.myfirstapp.todo.data.Series> seriess;
    private kotlinx.coroutines.flow.MutableSharedFlow<com.example.myfirstapp.core.Result<java.util.List<com.example.myfirstapp.todo.data.Series>>> itemsFlow;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.example.myfirstapp.core.Result<java.util.List<com.example.myfirstapp.todo.data.Series>>> seriesStream = null;
    
    public ItemRepository(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.remote.ItemService itemService, @org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.remote.ItemWsClient itemWsClient, @org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.SeriesDatabase database, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.myfirstapp.core.Result<java.util.List<com.example.myfirstapp.todo.data.Series>>> getSeriesStream() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object refresh(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object openWsClient(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object closeWsClient(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getItemEvents(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.remote.ItemEvent>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.Series series, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.myfirstapp.todo.data.Series> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object save(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.Series series, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.myfirstapp.todo.data.Series> continuation) {
        return null;
    }
    
    private final java.lang.Object handleItemDeleted(com.example.myfirstapp.todo.data.Series series, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleItemUpdated(com.example.myfirstapp.todo.data.Series series, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleItemCreated(com.example.myfirstapp.todo.data.Series series, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void quite_remove(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.Series series) {
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    private final java.lang.String getBearerToken() {
        return null;
    }
}