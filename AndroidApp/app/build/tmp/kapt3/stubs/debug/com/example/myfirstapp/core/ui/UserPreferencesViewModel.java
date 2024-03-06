package com.example.myfirstapp.core.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myfirstapp/core/ui/UserPreferencesViewModel;", "Landroidx/lifecycle/ViewModel;", "userPreferencesRepository", "Lcom/example/myfirstapp/core/data/UserPreferencesRepository;", "(Lcom/example/myfirstapp/core/data/UserPreferencesRepository;)V", "uiState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/myfirstapp/core/data/UserPreferences;", "getUiState", "()Lkotlinx/coroutines/flow/Flow;", "save", "", "userPreferences", "Companion", "app_debug"})
public final class UserPreferencesViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.myfirstapp.core.data.UserPreferencesRepository userPreferencesRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.example.myfirstapp.core.data.UserPreferences> uiState = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.myfirstapp.core.ui.UserPreferencesViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.lifecycle.ViewModelProvider.Factory Factory = null;
    
    public UserPreferencesViewModel(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.core.data.UserPreferencesRepository userPreferencesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.myfirstapp.core.data.UserPreferences> getUiState() {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.core.data.UserPreferences userPreferences) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myfirstapp/core/ui/UserPreferencesViewModel$Companion;", "", "()V", "Factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "app_debug"})
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