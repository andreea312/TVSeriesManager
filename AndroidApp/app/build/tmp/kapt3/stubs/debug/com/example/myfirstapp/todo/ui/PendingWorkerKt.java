package com.example.myfirstapp.todo.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"CHANNEL_ID", "", "NOTIFICATION_ID", "", "NOTIFICATION_TITLE", "", "VERBOSE_NOTIFICATION_CHANNEL_DESCRIPTION", "VERBOSE_NOTIFICATION_CHANNEL_NAME", "makeStatusNotification", "", "message", "context", "Landroid/content/Context;", "app_debug"})
public final class PendingWorkerKt {
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmField
    public static final java.lang.CharSequence VERBOSE_NOTIFICATION_CHANNEL_NAME = "Verbose WorkManager Notifications";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VERBOSE_NOTIFICATION_CHANNEL_DESCRIPTION = "Shows notifications whenever work starts";
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmField
    public static final java.lang.CharSequence NOTIFICATION_TITLE = "WorkRequest Starting";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHANNEL_ID = "VERBOSE_NOTIFICATION";
    public static final int NOTIFICATION_ID = 1;
    
    public static final void makeStatusNotification(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}