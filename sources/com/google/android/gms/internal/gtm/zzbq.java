package com.google.android.gms.internal.gtm;

final class zzbq implements Runnable {
    public final /* synthetic */ zzdb zza;
    public final /* synthetic */ zzbs zzb;

    public zzbq(zzbs zzbs, zzdb zzdb) {
        this.zzb = zzbs;
        this.zza = zzdb;
    }

    public final void run() {
        this.zzb.zza.zzf(this.zza);
    }
}
