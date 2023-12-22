package com.google.android.gms.internal.gtm;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class zzjp {
    /* access modifiers changed from: private */
    public static final ScheduledExecutorService zza = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new zzjo()));

    static {
        zzgb.zza();
    }
}
