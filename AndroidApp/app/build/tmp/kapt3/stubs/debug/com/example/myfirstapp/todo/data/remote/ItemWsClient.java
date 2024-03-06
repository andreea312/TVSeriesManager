package com.example.myfirstapp.todo.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJR\u0010\u0010\u001a\u00020\f2#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0013\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\f0\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/myfirstapp/todo/data/remote/ItemWsClient;", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "webSocket", "Lokhttp3/WebSocket;", "getWebSocket", "()Lokhttp3/WebSocket;", "setWebSocket", "(Lokhttp3/WebSocket;)V", "authorize", "", "token", "", "closeSocket", "openSocket", "onEvent", "Lkotlin/Function1;", "Lcom/example/myfirstapp/todo/data/remote/ItemEvent;", "Lkotlin/ParameterName;", "name", "itemEvent", "onClosed", "Lkotlin/Function0;", "onFailure", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ItemWebSocketListener", "app_debug"})
public final class ItemWsClient {
    private final okhttp3.OkHttpClient okHttpClient = null;
    public okhttp3.WebSocket webSocket;
    
    public ItemWsClient(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.WebSocket getWebSocket() {
        return null;
    }
    
    public final void setWebSocket(@org.jetbrains.annotations.NotNull
    okhttp3.WebSocket p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object openSocket(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.myfirstapp.todo.data.remote.ItemEvent, kotlin.Unit> onEvent, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClosed, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFailure, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void closeSocket() {
    }
    
    public final void authorize(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001BF\u0012#\u0010\u0002\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\u0002\u0010\fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0002\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/myfirstapp/todo/data/remote/ItemWsClient$ItemWebSocketListener;", "Lokhttp3/WebSocketListener;", "onEvent", "Lkotlin/Function1;", "Lcom/example/myfirstapp/todo/data/remote/ItemEvent;", "Lkotlin/ParameterName;", "name", "itemEvent", "", "onClosed", "Lkotlin/Function0;", "onFailure", "(Lcom/example/myfirstapp/todo/data/remote/ItemWsClient;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "itemEventJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "webSocket", "Lokhttp3/WebSocket;", "code", "", "reason", "", "onClosing", "t", "", "response", "Lokhttp3/Response;", "onMessage", "text", "bytes", "Lokio/ByteString;", "onOpen", "app_debug"})
    public final class ItemWebSocketListener extends okhttp3.WebSocketListener {
        private final kotlin.jvm.functions.Function1<com.example.myfirstapp.todo.data.remote.ItemEvent, kotlin.Unit> onEvent = null;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onClosed = null;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onFailure = null;
        private final com.squareup.moshi.Moshi moshi = null;
        private final com.squareup.moshi.JsonAdapter<com.example.myfirstapp.todo.data.remote.ItemEvent> itemEventJsonAdapter = null;
        
        public ItemWebSocketListener(@org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.example.myfirstapp.todo.data.remote.ItemEvent, kotlin.Unit> onEvent, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> onClosed, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> onFailure) {
            super();
        }
        
        @java.lang.Override
        public void onOpen(@org.jetbrains.annotations.NotNull
        okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull
        okhttp3.Response response) {
        }
        
        @java.lang.Override
        public void onMessage(@org.jetbrains.annotations.NotNull
        okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull
        java.lang.String text) {
        }
        
        @java.lang.Override
        public void onMessage(@org.jetbrains.annotations.NotNull
        okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull
        okio.ByteString bytes) {
        }
        
        @java.lang.Override
        public void onClosing(@org.jetbrains.annotations.NotNull
        okhttp3.WebSocket webSocket, int code, @org.jetbrains.annotations.NotNull
        java.lang.String reason) {
        }
        
        @java.lang.Override
        public void onClosed(@org.jetbrains.annotations.NotNull
        okhttp3.WebSocket webSocket, int code, @org.jetbrains.annotations.NotNull
        java.lang.String reason) {
        }
        
        @java.lang.Override
        public void onFailure(@org.jetbrains.annotations.NotNull
        okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull
        java.lang.Throwable t, @org.jetbrains.annotations.Nullable
        okhttp3.Response response) {
        }
    }
}