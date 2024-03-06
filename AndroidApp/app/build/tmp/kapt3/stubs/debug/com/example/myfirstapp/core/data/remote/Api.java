package com.example.myfirstapp.core.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/example/myfirstapp/core/data/remote/Api;", "", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "httpUrl", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "tokenInterceptor", "Lcom/example/myfirstapp/core/data/remote/TokenInterceptor;", "getTokenInterceptor", "()Lcom/example/myfirstapp/core/data/remote/TokenInterceptor;", "url", "wsUrl", "getWsUrl", "()Ljava/lang/String;", "app_debug"})
public final class Api {
    @org.jetbrains.annotations.NotNull
    public static final com.example.myfirstapp.core.data.remote.Api INSTANCE = null;
    private static final java.lang.String url = "192.168.177.120:3000";
    private static final java.lang.String httpUrl = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String wsUrl = null;
    private static com.google.gson.Gson gson;
    @org.jetbrains.annotations.NotNull
    private static final com.example.myfirstapp.core.data.remote.TokenInterceptor tokenInterceptor = null;
    @org.jetbrains.annotations.NotNull
    private static final okhttp3.OkHttpClient okHttpClient = null;
    private static final retrofit2.Retrofit retrofit = null;
    
    private Api() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.core.data.remote.TokenInterceptor getTokenInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
}