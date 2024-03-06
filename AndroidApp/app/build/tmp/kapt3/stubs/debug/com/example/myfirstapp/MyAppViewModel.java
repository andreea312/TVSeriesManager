package com.example.myfirstapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/myfirstapp/MyAppViewModel;", "Landroidx/lifecycle/ViewModel;", "userPreferencesRepository", "Lcom/example/myfirstapp/core/data/UserPreferencesRepository;", "itemRepository", "Lcom/example/myfirstapp/todo/data/ItemRepository;", "(Lcom/example/myfirstapp/core/data/UserPreferencesRepository;Lcom/example/myfirstapp/todo/data/ItemRepository;)V", "logout", "", "setToken", "token", "", "Companion", "app_debug"})
public final class MyAppViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.myfirstapp.core.data.UserPreferencesRepository userPreferencesRepository = null;
    private final com.example.myfirstapp.todo.data.ItemRepository itemRepository = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.myfirstapp.MyAppViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.lifecycle.ViewModelProvider.Factory Factory = null;
    
    public MyAppViewModel(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.core.data.UserPreferencesRepository userPreferencesRepository, @org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.ItemRepository itemRepository) {
        super();
    }
    
    public final void logout() {
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myfirstapp/MyAppViewModel$Companion;", "", "()V", "Factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "app_debug"})
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