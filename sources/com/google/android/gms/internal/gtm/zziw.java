package com.google.android.gms.internal.gtm;

final class zziw implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzjh zzc;

    public zziw(zzjh zzjh, String str, String str2, String str3) {
        this.zzc = zzjh;
        this.zza = str;
        this.zzb = str2;
    }

    public final void run() {
        String str = this.zza;
        zzho.zzd("Starting to load container " + str + ".");
        zzjh zzjh = this.zzc;
        if (zzjh.zzn != 1) {
            zzgv.zzc("Unexpected state - container loading already initiated.", zzjh.zzd);
            return;
        }
        zzjh.zzn = 2;
        zzjh zzjh2 = this.zzc;
        zzjh2.zzf.zzc(this.zza, this.zzb, (String) null, new zzjf(zzjh2, (zzje) null));
    }
}
