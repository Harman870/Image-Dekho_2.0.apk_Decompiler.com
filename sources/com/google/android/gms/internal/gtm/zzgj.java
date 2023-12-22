package com.google.android.gms.internal.gtm;

final class zzgj implements Runnable {
    public final /* synthetic */ zzgs zza;

    public zzgj(zzgs zzgs) {
        this.zza = zzgs;
    }

    public final void run() {
        zzgs zzgs = this.zza;
        zzgs.zzg.execute(new zzgq(zzgs, (zzgp) null));
    }
}
