package com.google.android.gms.internal.gtm;

import android.os.Looper;
import i3.t;

final class zzcx implements Runnable {
    public final /* synthetic */ zzcy zza;

    public zzcx(zzcy zzcy) {
        this.zza = zzcy;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            t zzd = this.zza.zzb.zzd();
            zzd.getClass();
            zzd.f7164c.submit(this);
            return;
        }
        boolean zzh = this.zza.zzh();
        this.zza.zzd = 0;
        if (zzh) {
            this.zza.zza();
        }
    }
}
