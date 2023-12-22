package com.google.android.gms.internal.gtm;

final class zzbo implements Runnable {
    public final /* synthetic */ zzez zza;
    public final /* synthetic */ zzbs zzb;

    public zzbo(zzbs zzbs, zzez zzez) {
        this.zzb = zzbs;
        this.zza = zzez;
    }

    public final void run() {
        this.zzb.zza.zzj(this.zza);
    }
}
