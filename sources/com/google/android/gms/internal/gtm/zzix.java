package com.google.android.gms.internal.gtm;

final class zzix implements Runnable {
    public final /* synthetic */ zziy zza;

    public zzix(zziy zziy) {
        this.zza = zziy;
    }

    public final void run() {
        zzjh zzjh = this.zza.zza;
        if (zzjh.zzn == 1 || zzjh.zzn == 2) {
            zzjh.zzn = 4;
            zzho.zza("Container load timed out after 5000ms.");
            while (!this.zza.zza.zzo.isEmpty()) {
                zzjh zzjh2 = this.zza.zza;
                zzjh2.zzg.execute((Runnable) zzjh2.zzo.remove());
            }
        }
    }
}
