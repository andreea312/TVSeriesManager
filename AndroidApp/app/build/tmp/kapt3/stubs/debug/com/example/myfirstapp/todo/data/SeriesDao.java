package com.example.myfirstapp.todo.data;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myfirstapp/todo/data/SeriesDao;", "", "clear", "", "deleteById", "id", "", "getAll", "", "Lcom/example/myfirstapp/todo/data/Series;", "getById", "insert", "series", "update", "app_debug"})
public abstract interface SeriesDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Series")
    public abstract java.util.List<com.example.myfirstapp.todo.data.Series> getAll();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Series WHERE _id == :id")
    public abstract java.util.List<com.example.myfirstapp.todo.data.Series> getById(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.Series series);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.example.myfirstapp.todo.data.Series series);
    
    @androidx.room.Query(value = "DELETE FROM Series")
    public abstract void clear();
    
    @androidx.room.Query(value = "DELETE FROM Series WHERE _id == :id")
    public abstract void deleteById(@org.jetbrains.annotations.NotNull
    java.lang.String id);
}