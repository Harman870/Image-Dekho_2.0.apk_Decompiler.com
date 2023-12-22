package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import l4.a;

final class zzu implements Executor {
    private final Handler zza = new a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
