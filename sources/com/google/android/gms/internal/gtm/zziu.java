package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import androidx.activity.e;

final class zziu implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ String zze;
    public final /* synthetic */ zziv zzf;
    private boolean zzg = false;

    public zziu(zziv zziv, String str, Bundle bundle, String str2, long j10, String str3) {
        this.zzf = zziv;
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
        this.zzd = j10;
        this.zze = str3;
    }

    public final void run() {
        zzjh zzjh = this.zzf.zza;
        if (zzjh.zzn == 3) {
            zzjh.zzf.zzb(this.zza, this.zzb, this.zzc, this.zzd, false);
        } else if (zzjh.zzn == 1 || zzjh.zzn == 2) {
            if (!this.zzg) {
                zzho.zzd(String.format("Container not loaded yet: deferring event listener by enqueuing the event: name = %s, origin = %s, params = %s.", new Object[]{this.zza, this.zze, this.zzb}));
                this.zzg = true;
                this.zzf.zza.zzo.add(this);
                return;
            }
            zzho.zze("Invalid state - not expecting to see a deferred event during container loading.");
        } else if (zzjh.zzn == 4) {
            zzho.zzd(String.format("Container failed to load: skipping event listener by ignoring the event: name = %s, origin = %s, params = %s.", new Object[]{this.zza, this.zze, this.zzb}));
        } else {
            zzgv.zzc(e.a("Unexpected state:", zzjh.zzn), this.zzf.zza.zzd);
        }
    }
}
