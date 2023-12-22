package com.google.android.gms.internal.gtm;

final class zzpy implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzpk zzc;
    public final /* synthetic */ zzqa zzd;

    public zzpy(zzqa zzqa, String str, String str2, zzpk zzpk) {
        this.zzd = zzqa;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzpk;
    }

    public final void run() {
        this.zzd.zzd(this.zza, this.zzb, this.zzc);
    }
}
