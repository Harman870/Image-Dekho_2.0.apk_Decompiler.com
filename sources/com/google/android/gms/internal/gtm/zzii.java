package com.google.android.gms.internal.gtm;

final class zzii implements Runnable {
    public final /* synthetic */ zzin zza;

    public zzii(zzin zzin) {
        this.zza = zzin;
    }

    public final void run() {
        this.zza.zzh = false;
        this.zza.zzd.zza();
    }
}
