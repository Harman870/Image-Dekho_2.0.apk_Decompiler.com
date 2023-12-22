package com.google.android.gms.internal.gtm;

import android.os.RemoteException;

final class zzgl implements Runnable {
    public final /* synthetic */ zzgs zza;

    public /* synthetic */ zzgl(zzgs zzgs, zzgk zzgk) {
        this.zza = zzgs;
    }

    public final void run() {
        this.zza.zzm = 3;
        String zzi = this.zza.zzb;
        zzho.zze("Container " + zzi + " loading failed.");
        zzgs zzgs = this.zza;
        if (zzgs.zzn != null) {
            for (zzgz zzgz : zzgs.zzn) {
                if (zzgz.zzf()) {
                    try {
                        this.zza.zzi.zzc("app", zzgz.zzb(), zzgz.zza(), zzgz.currentTimeMillis());
                        String zzb = zzgz.zzb();
                        zzho.zzd("Logged event " + zzb + " to Firebase (marked as passthrough).");
                    } catch (RemoteException e10) {
                        zzgv.zzb("Error logging event with measurement proxy:", e10, this.zza.zza);
                    }
                } else {
                    String zzb2 = zzgz.zzb();
                    zzho.zzd("Discarded event " + zzb2 + " (marked as non-passthrough).");
                }
            }
            this.zza.zzn = null;
        }
    }
}
