package com.example.myfirstapp.todo.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e*\u00020\u000fH\u0003\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028CX\u0082\u0004\u00a2\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00028CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u00a8\u0006\u0010"}, d2 = {"activeNetworkState", "Lcom/example/myfirstapp/todo/ui/NetworkState;", "Landroid/net/ConnectivityManager;", "getActiveNetworkState$annotations", "(Landroid/net/ConnectivityManager;)V", "getActiveNetworkState", "(Landroid/net/ConnectivityManager;)Lcom/example/myfirstapp/todo/ui/NetworkState;", "isActiveNetworkValidated", "", "(Landroid/net/ConnectivityManager;)Z", "connectivityState", "Landroidx/compose/runtime/State;", "Lcom/example/myfirstapp/todo/ui/ConnectionState;", "observeConnectivityAsFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroid/content/Context;", "app_debug"})
public final class NetworkStateKt {
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Deprecated
    private static void getActiveNetworkState$annotations(android.net.ConnectivityManager p0) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private static final com.example.myfirstapp.todo.ui.NetworkState getActiveNetworkState(android.net.ConnectivityManager $this$activeNetworkState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi", "MissingPermission"})
    private static final boolean isActiveNetworkValidated(android.net.ConnectivityManager $this$isActiveNetworkValidated) {
        return false;
    }
    
    /**
     * Network Utility to observe Internet connectivity status
     */
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private static final kotlinx.coroutines.flow.Flow<com.example.myfirstapp.todo.ui.ConnectionState> observeConnectivityAsFlow(android.content.Context $this$observeConnectivityAsFlow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.compose.runtime.Composable
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public static final androidx.compose.runtime.State<com.example.myfirstapp.todo.ui.ConnectionState> connectivityState() {
        return null;
    }
}