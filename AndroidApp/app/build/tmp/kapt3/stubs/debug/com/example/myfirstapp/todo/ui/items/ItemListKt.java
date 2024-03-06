package com.example.myfirstapp.todo.ui.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001a\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a9\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\'\u0010\n\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0006\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000bj\u0002`\u000fH\u0007\u001aG\u0010\u0010\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\'\u0010\n\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0006\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000bj\u0002`\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0007*D\u0010\u0013\"\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000b2\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000b\u00a8\u0006\u0014"}, d2 = {"AvailabilityDot", "", "series", "Lcom/example/myfirstapp/todo/data/Series;", "CustomImage", "url", "", "modifier", "Landroidx/compose/ui/Modifier;", "ItemDetail", "onItemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "id", "Lcom/example/myfirstapp/todo/ui/items/OnItemFn;", "ItemList", "seriesList", "", "OnItemFn", "app_debug"})
public final class ItemListKt {
    
    @androidx.compose.runtime.Composable
    public static final void ItemList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.myfirstapp.todo.data.Series> seriesList, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ItemDetail(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.Series series, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CustomImage(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AvailabilityDot(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.Series series) {
    }
}