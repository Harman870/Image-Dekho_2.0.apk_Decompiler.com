package com.google.android.gms.internal.gtm;

final class zzjk implements Runnable {
    public final /* synthetic */ zzjl zza;

    public zzjk(zzjl zzjl) {
        this.zza = zzjl;
    }

    public final void run() {
        if (this.zza.zza.isEmpty()) {
            zzho.zze("TagManagerBackend dispatch called without loaded container.");
            return;
        }
        for (zzgs zzs : this.zza.zza.values()) {
            zzs.zzs();
        }
    }
}
