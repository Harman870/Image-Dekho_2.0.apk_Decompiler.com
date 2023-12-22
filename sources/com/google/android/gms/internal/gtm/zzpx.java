package com.google.android.gms.internal.gtm;

final class zzpx implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzpk zzb;
    public final /* synthetic */ zzqa zzc;

    public zzpx(zzqa zzqa, String str, zzpk zzpk) {
        this.zzc = zzqa;
        this.zza = str;
        this.zzb = zzpk;
    }

    public final void run() {
        this.zzc.zzf(this.zza, this.zzb);
    }
}
