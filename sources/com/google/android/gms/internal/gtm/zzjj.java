package com.google.android.gms.internal.gtm;

final class zzjj implements Runnable {
    public final /* synthetic */ zzgz zza;
    public final /* synthetic */ zzjl zzb;

    public zzjj(zzjl zzjl, zzgz zzgz) {
        this.zzb = zzjl;
        this.zza = zzgz;
    }

    public final void run() {
        if (this.zzb.zza.isEmpty()) {
            zzho.zza("TagManagerBackend emit called without loaded container.");
            return;
        }
        for (zzgs zzt : this.zzb.zza.values()) {
            zzt.zzt(this.zza);
        }
    }
}
