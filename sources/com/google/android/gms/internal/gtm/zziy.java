package com.google.android.gms.internal.gtm;

final class zziy implements Runnable {
    public final /* synthetic */ zzjh zza;

    public zziy(zzjh zzjh) {
        this.zza = zzjh;
    }

    public final void run() {
        this.zza.zzg.execute(new zzix(this));
    }
}
