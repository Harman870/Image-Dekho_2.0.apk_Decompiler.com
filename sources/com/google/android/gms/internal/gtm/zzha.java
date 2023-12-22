package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzha extends ThreadPoolExecutor {
    private final Context zza;

    public zzha(Context context, int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(1, 1, 0, timeUnit, blockingQueue, threadFactory);
        this.zza = context;
    }

    public final void afterExecute(Runnable runnable, Throwable th) {
        if (th != null) {
            zzgv.zzb("Uncaught exception: ", th, this.zza);
        }
    }
}
