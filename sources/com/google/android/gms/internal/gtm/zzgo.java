package com.google.android.gms.internal.gtm;

import android.os.RemoteException;

final class zzgo implements Runnable {
    public final /* synthetic */ zzgs zza;
    private final zzgz zzb;

    public zzgo(zzgs zzgs, zzgz zzgz) {
        this.zza = zzgs;
        this.zzb = zzgz;
    }

    public final void run() {
        if (this.zza.zzm == 2) {
            zzho.zzd("Evaluating tags for event ".concat(String.valueOf(this.zzb.zzb())));
            this.zza.zzl.zzf(this.zzb);
        } else if (this.zza.zzm == 1) {
            this.zza.zzn.add(this.zzb);
            String zzb2 = this.zzb.zzb();
            zzho.zzd("Added event " + zzb2 + " to pending queue.");
        } else if (this.zza.zzm == 3) {
            String zzb3 = this.zzb.zzb();
            zzho.zzd("Failed to evaluate tags for event " + zzb3 + " (container failed to load)");
            zzgz zzgz = this.zzb;
            if (zzgz.zzf()) {
                try {
                    this.zza.zzi.zzc("app", zzgz.zzb(), zzgz.zza(), zzgz.currentTimeMillis());
                    String zzb4 = this.zzb.zzb();
                    zzho.zzd("Logged passthrough event " + zzb4 + " to Firebase.");
                } catch (RemoteException e10) {
                    zzgv.zzb("Error logging event with measurement proxy:", e10, this.zza.zza);
                }
            } else {
                zzho.zzd("Discarded non-passthrough event ".concat(String.valueOf(zzgz.zzb())));
            }
        }
    }
}
