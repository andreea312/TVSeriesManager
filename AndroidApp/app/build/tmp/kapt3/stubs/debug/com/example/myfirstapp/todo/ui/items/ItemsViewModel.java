package com.example.myfirstapp.todo.ui.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/myfirstapp/todo/ui/items/ItemsViewModel;", "Landroidx/lifecycle/ViewModel;", "itemRepository", "Lcom/example/myfirstapp/todo/data/ItemRepository;", "(Lcom/example/myfirstapp/todo/data/ItemRepository;)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/example/myfirstapp/core/Result;", "", "Lcom/example/myfirstapp/todo/data/Series;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadItems", "", "Companion", "app_debug"})
public final class ItemsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.myfirstapp.todo.data.ItemRepository itemRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.myfirstapp.core.Result<java.util.List<com.example.myfirstapp.todo.data.Series>>> uiState = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.myfirstapp.todo.ui.items.ItemsViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.lifecycle.ViewModelProvider.Factory Factory = null;
    
    public ItemsViewModel(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.ItemRepository itemRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.myfirstapp.core.Result<java.util.List<com.example.myfirstapp.todo.data.Series>>> getUiState() {
        return null;
    }
    
    public final void loadItems() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myfirstapp/todo/ui/items/ItemsViewModel$Companion;", "", "()V", "Factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "app_debug"})
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