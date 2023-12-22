package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzqg {
    private final ScheduledExecutorService zza;
    private ScheduledFuture zzb = null;

    public zzqg() {
        ScheduledExecutorService zzb2 = zzgb.zza().zzb(1, 2);
        this.zza = zzb2;
    }

    public final void zza(Context context, zzpt zzpt, long j10, zzpk zzpk) {
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.zzb;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zzb = this.zza.schedule(new zzqf(context, zzpt, zzpk), 0, TimeUnit.MILLISECONDS);
        }
    }
}
