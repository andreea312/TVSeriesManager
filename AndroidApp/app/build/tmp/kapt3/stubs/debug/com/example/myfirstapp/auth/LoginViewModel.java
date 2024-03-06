package com.example.myfirstapp.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/myfirstapp/auth/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/example/myfirstapp/auth/data/AuthRepository;", "userPreferencesRepository", "Lcom/example/myfirstapp/core/data/UserPreferencesRepository;", "(Lcom/example/myfirstapp/auth/data/AuthRepository;Lcom/example/myfirstapp/core/data/UserPreferencesRepository;)V", "<set-?>", "Lcom/example/myfirstapp/auth/LoginUiState;", "uiState", "getUiState", "()Lcom/example/myfirstapp/auth/LoginUiState;", "setUiState", "(Lcom/example/myfirstapp/auth/LoginUiState;)V", "uiState$delegate", "Landroidx/compose/runtime/MutableState;", "login", "", "username", "", "password", "Companion", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.myfirstapp.auth.data.AuthRepository authRepository = null;
    private final com.example.myfirstapp.core.data.UserPreferencesRepository userPreferencesRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState uiState$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.myfirstapp.auth.LoginViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.lifecycle.ViewModelProvider.Factory Factory = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.auth.data.AuthRepository authRepository, @org.jetbrains.annotations.NotNull
    com.example.myfirstapp.core.data.UserPreferencesRepository userPreferencesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.auth.LoginUiState getUiState() {
        return null;
    }
    
    public final void setUiState(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.auth.LoginUiState p0) {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myfirstapp/auth/LoginViewModel$Companion;", "", "()V", "Factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.ViewModelProvider.Factory getFactory() {
            return null;
        }
    }
}