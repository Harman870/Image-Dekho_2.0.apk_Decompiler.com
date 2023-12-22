package com.google.android.gms.internal.gtm;

final class zzcb implements Runnable {
    public final /* synthetic */ zzcd zza;
    public final /* synthetic */ zzfa zzb;

    public zzcb(zzcd zzcd, zzfa zzfa) {
        this.zza = zzcd;
        this.zzb = zzfa;
    }

    public final void run() {
        if (!this.zza.zza.zzg()) {
            this.zza.zza.zzE("Connected to service after a timeout");
            zzce.zzi(this.zza.zza, this.zzb);
        }
    }
}
