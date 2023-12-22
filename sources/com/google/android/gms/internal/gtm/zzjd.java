package com.google.android.gms.internal.gtm;

final class zzjd implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzjf zzc;

    public zzjd(zzjf zzjf, boolean z9, String str) {
        this.zzc = zzjf;
        this.zza = z9;
        this.zzb = str;
    }

    public final void run() {
        zzjh zzjh = this.zzc.zza;
        if (zzjh.zzn == 2) {
            if (this.zza) {
                zzjh.zzn = 3;
                String str = this.zzb;
                zzho.zzd("Container " + str + " loaded.");
            } else {
                zzjh.zzn = 4;
                zzho.zza("Error loading container:".concat(String.valueOf(this.zzb)));
            }
            while (!this.zzc.zza.zzo.isEmpty()) {
                zzjh zzjh2 = this.zzc.zza;
                zzjh2.zzg.execute((Runnable) zzjh2.zzo.remove());
            }
            return;
        }
        zzho.zze("Container load callback completed after timeout");
    }
}
