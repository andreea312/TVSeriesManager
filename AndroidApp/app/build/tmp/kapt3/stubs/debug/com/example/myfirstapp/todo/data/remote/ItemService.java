package com.example.myfirstapp.todo.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\'\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ1\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/myfirstapp/todo/data/remote/ItemService;", "", "create", "Lcom/example/myfirstapp/todo/data/Series;", "authorization", "", "series", "(Ljava/lang/String;Lcom/example/myfirstapp/todo/data/Series;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "find", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "read", "itemId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/myfirstapp/todo/data/Series;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ItemService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/api/series")
    public abstract java.lang.Object find(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.myfirstapp.todo.data.Series>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/api/series/{id}")
    public abstract java.lang.Object read(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Path(value = "id")
    java.lang.String itemId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.myfirstapp.todo.data.Series> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "/api/series")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object create(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.myfirstapp.todo.data.Series series, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.myfirstapp.todo.data.Series> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PUT(value = "/api/series/{id}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Path(value = "id")
    java.lang.String itemId, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.myfirstapp.todo.data.Series series, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.myfirstapp.todo.data.Series> continuation);
}