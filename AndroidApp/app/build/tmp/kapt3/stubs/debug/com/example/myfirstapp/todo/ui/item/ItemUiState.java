package com.example.myfirstapp.todo.ui.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u00c6\u0003JC\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lcom/example/myfirstapp/todo/ui/item/ItemUiState;", "", "itemId", "", "series", "Lcom/example/myfirstapp/todo/data/Series;", "loadResult", "Lcom/example/myfirstapp/core/Result;", "submitResult", "(Ljava/lang/String;Lcom/example/myfirstapp/todo/data/Series;Lcom/example/myfirstapp/core/Result;Lcom/example/myfirstapp/core/Result;)V", "getItemId", "()Ljava/lang/String;", "getLoadResult", "()Lcom/example/myfirstapp/core/Result;", "setLoadResult", "(Lcom/example/myfirstapp/core/Result;)V", "getSeries", "()Lcom/example/myfirstapp/todo/data/Series;", "getSubmitResult", "setSubmitResult", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class ItemUiState {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String itemId = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.myfirstapp.todo.data.Series series = null;
    @org.jetbrains.annotations.Nullable
    private com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> loadResult;
    @org.jetbrains.annotations.Nullable
    private com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> submitResult;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.todo.ui.item.ItemUiState copy(@org.jetbrains.annotations.Nullable
    java.lang.String itemId, @org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.Series series, @org.jetbrains.annotations.Nullable
    com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> loadResult, @org.jetbrains.annotations.Nullable
    com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> submitResult) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ItemUiState() {
        super();
    }
    
    public ItemUiState(@org.jetbrains.annotations.Nullable
    java.lang.String itemId, @org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.Series series, @org.jetbrains.annotations.Nullable
    com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> loadResult, @org.jetbrains.annotations.Nullable
    com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> submitResult) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getItemId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.todo.data.Series component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myfirstapp.todo.data.Series getSeries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> getLoadResult() {
        return null;
    }
    
    public final void setLoadResult(@org.jetbrains.annotations.Nullable
    com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> getSubmitResult() {
        return null;
    }
    
    public final void setSubmitResult(@org.jetbrains.annotations.Nullable
    com.example.myfirstapp.core.Result<com.example.myfirstapp.todo.data.Series> p0) {
    }
}