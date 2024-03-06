package com.example.myfirstapp.auth.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/myfirstapp/auth/data/remote/AuthDataSource;", "", "()V", "authService", "Lcom/example/myfirstapp/auth/data/remote/AuthDataSource$AuthService;", "login", "Lkotlin/Result;", "Lcom/example/myfirstapp/auth/data/remote/TokenHolder;", "user", "Lcom/example/myfirstapp/auth/data/remote/User;", "login-gIAlu-s", "(Lcom/example/myfirstapp/auth/data/remote/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AuthService", "app_debug"})
public final class AuthDataSource {
    private final com.example.myfirstapp.auth.data.remote.AuthDataSource.AuthService authService = null;
    
    public AuthDataSource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myfirstapp/auth/data/remote/AuthDataSource$AuthService;", "", "login", "Lcom/example/myfirstapp/auth/data/remote/TokenHolder;", "user", "Lcom/example/myfirstapp/auth/data/remote/User;", "(Lcom/example/myfirstapp/auth/data/remote/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface AuthService {
        
        @org.jetbrains.annotations.Nullable
        @retrofit2.http.POST(value = "/api/auth/login")
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull
        @retrofit2.http.Body
        com.example.myfirstapp.auth.data.remote.User user, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super com.example.myfirstapp.auth.data.remote.TokenHolder> continuation);
    }
}