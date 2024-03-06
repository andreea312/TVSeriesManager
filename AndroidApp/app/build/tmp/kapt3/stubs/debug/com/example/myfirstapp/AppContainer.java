package com.example.myfirstapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u00108\u001a\u00020+2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00100\u001a\n 2*\u0004\u0018\u00010101X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u00103\u001a\u0002048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b5\u00106\u00a8\u00069"}, d2 = {"Lcom/example/myfirstapp/AppContainer;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "authDataSource", "Lcom/example/myfirstapp/auth/data/remote/AuthDataSource;", "authRepository", "Lcom/example/myfirstapp/auth/data/AuthRepository;", "getAuthRepository", "()Lcom/example/myfirstapp/auth/data/AuthRepository;", "authRepository$delegate", "Lkotlin/Lazy;", "connectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "getContext", "()Landroid/content/Context;", "database", "Lcom/example/myfirstapp/todo/data/SeriesDatabase;", "getDatabase", "()Lcom/example/myfirstapp/todo/data/SeriesDatabase;", "itemRepository", "Lcom/example/myfirstapp/todo/data/ItemRepository;", "getItemRepository", "()Lcom/example/myfirstapp/todo/data/ItemRepository;", "itemRepository$delegate", "itemService", "Lcom/example/myfirstapp/todo/data/remote/ItemService;", "getItemService", "()Lcom/example/myfirstapp/todo/data/remote/ItemService;", "itemWsClient", "Lcom/example/myfirstapp/todo/data/remote/ItemWsClient;", "getItemWsClient", "()Lcom/example/myfirstapp/todo/data/remote/ItemWsClient;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "getNetworkCallback", "()Landroid/net/ConnectivityManager$NetworkCallback;", "networkChanged", "Lkotlin/Function1;", "", "", "getNetworkChanged", "()Lkotlin/jvm/functions/Function1;", "setNetworkChanged", "(Lkotlin/jvm/functions/Function1;)V", "networkRequest", "Landroid/net/NetworkRequest;", "kotlin.jvm.PlatformType", "userPreferencesRepository", "Lcom/example/myfirstapp/core/data/UserPreferencesRepository;", "getUserPreferencesRepository", "()Lcom/example/myfirstapp/core/data/UserPreferencesRepository;", "userPreferencesRepository$delegate", "setNetworkChangedCallback", "app_debug"})
public final class AppContainer {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final android.net.NetworkRequest networkRequest = null;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> networkChanged;
    @org.jetbrains.annotations.NotNull
    private final android.net.ConnectivityManager connectivityManager = null;
    @org.jetbrains.annotations.NotNull
    private final android.net.ConnectivityManager.NetworkCallback networkCallback = null;
    private final com.example.myfirstapp.auth.data.remote.AuthDataSource authDataSource = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.myfirstapp.todo.data.remote.ItemService itemService = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.myfirstapp.todo.data.remote.ItemWsClient itemWsClient = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.myfirstapp.todo.data.SeriesDatabase database = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy itemRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy authRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy userPreferencesRepository$delegate = null;
    
    public AppContainer(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getNetworkChanged() {
        return null;
    }
    
    public final void setNetworkChanged(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    public final void setNetworkChangedCallback(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> networkChanged) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.net.ConnectivityManager getConnectivityManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.net.ConnectivityManager.NetworkCallback getNetworkCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.todo.data.remote.ItemService getItemService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.todo.data.remote.ItemWsClient getItemWsClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.todo.data.SeriesDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.todo.data.ItemRepository getItemRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.auth.data.AuthRepository getAuthRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.core.data.UserPreferencesRepository getUserPreferencesRepository() {
        return null;
    }
}