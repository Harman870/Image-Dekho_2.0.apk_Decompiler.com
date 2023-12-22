package com.google.android.gms.internal.gtm;

final class zzgi implements Runnable {
    public final /* synthetic */ zzgs zza;

    public zzgi(zzgs zzgs) {
        this.zza = zzgs;
    }

    public final void run() {
        if (this.zza.zzm == 2) {
            this.zza.zzl.zze();
        }
    }
}
