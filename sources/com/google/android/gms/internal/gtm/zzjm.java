package com.google.android.gms.internal.gtm;

import java.util.concurrent.ThreadFactory;

final class zzjm implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "google-tag-manager-background-thread");
    }
}
