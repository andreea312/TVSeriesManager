package com.example.myfirstapp.todo.ui.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0011J.\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0003R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/example/myfirstapp/todo/ui/item/ItemViewModel;", "Landroidx/lifecycle/ViewModel;", "itemId", "", "itemRepository", "Lcom/example/myfirstapp/todo/data/ItemRepository;", "(Ljava/lang/String;Lcom/example/myfirstapp/todo/data/ItemRepository;)V", "<set-?>", "Lcom/example/myfirstapp/todo/ui/item/ItemUiState;", "uiState", "getUiState", "()Lcom/example/myfirstapp/todo/ui/item/ItemUiState;", "setUiState", "(Lcom/example/myfirstapp/todo/ui/item/ItemUiState;)V", "uiState$delegate", "Landroidx/compose/runtime/MutableState;", "UpdateItem", "", "title", "episodes", "", "available", "", "loadItem", "saveItem", "date", "imageUrl", "Companion", "app_debug"})
public final class ItemViewModel extends androidx.lifecycle.ViewModel {
    private final java.lang.String itemId = null;
    private final com.example.myfirstapp.todo.data.ItemRepository itemRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState uiState$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.myfirstapp.todo.ui.item.ItemViewModel.Companion Companion = null;
    
    public ItemViewModel(@org.jetbrains.annotations.Nullable
    java.lang.String itemId, @org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.ItemRepository itemRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.todo.ui.item.ItemUiState getUiState() {
        return null;
    }
    
    private final void setUiState(com.example.myfirstapp.todo.ui.item.ItemUiState p0) {
    }
    
    public final void loadItem() {
    }
    
    public final void saveItem(@org.jetbrains.annotations.NotNull
    java.lang.String title, int episodes, @org.jetbrains.annotations.NotNull
    java.lang.String date, boolean available, @org.jetbrains.annotations.NotNull
    java.lang.String imageUrl) {
    }
    
    public final void UpdateItem(@org.jetbrains.annotations.NotNull
    java.lang.String title, int episodes, boolean available) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myfirstapp/todo/ui/item/ItemViewModel$Companion;", "", "()V", "Factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "itemId", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.ViewModelProvider.Factory Factory(@org.jetbrains.annotations.Nullable
        java.lang.String itemId) {
            return null;
        }
    }
}