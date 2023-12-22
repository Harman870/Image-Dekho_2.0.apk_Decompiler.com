package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.activity.e;

final class zzis implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ String zze;
    public final /* synthetic */ zzit zzf;
    private boolean zzg = false;

    public zzis(zzit zzit, String str, Bundle bundle, String str2, long j10, String str3) {
        this.zzf = zzit;
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
        this.zzd = j10;
        this.zze = str3;
    }

    public final void run() {
        zzjh zzjh = this.zzf.zza;
        if (zzjh.zzn == 3) {
            zzjh.zzf.zzb(this.zza, this.zzb, this.zzc, this.zzd, true);
        } else if (zzjh.zzn == 4) {
            zzho.zzd(String.format("Container failed to load: skipping  event interceptor by logging event back to Firebase directly: name = %s, origin = %s, params = %s.", new Object[]{this.zza, this.zzc, this.zzb}));
            try {
                this.zzf.zza.zze.zzc(this.zzc, this.zza, this.zzb, this.zzd);
            } catch (RemoteException e10) {
                zzgv.zzb("Error logging event on measurement proxy: ", e10, this.zzf.zza.zzd);
            }
        } else if (zzjh.zzn != 1 && zzjh.zzn != 2) {
            zzgv.zzc(e.a("Unexpected state:", zzjh.zzn), this.zzf.zza.zzd);
        } else if (!this.zzg) {
            zzho.zzd(String.format("Container not loaded yet: deferring event interceptor by enqueuing the event: name = %s, origin = %s, params = %s.", new Object[]{this.zza, this.zze, this.zzb}));
            this.zzg = true;
            this.zzf.zza.zzo.add(this);
        } else {
            zzgv.zzc("Invalid state - not expecting to see a deferredevent during container loading.", zzjh.zzd);
        }
    }
}
