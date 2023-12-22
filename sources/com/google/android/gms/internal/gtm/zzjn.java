package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class zzjn {
    private static volatile ExecutorService zza;

    private zzjn() {
    }

    public static ExecutorService zza(Context context) {
        if (zza == null) {
            synchronized (zzjn.class) {
                if (zza == null) {
                    zza = new zzha(context, 1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new zzjm());
                }
            }
        }
        return zza;
    }
}
