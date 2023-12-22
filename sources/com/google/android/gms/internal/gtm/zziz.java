package com.google.android.gms.internal.gtm;

final class zziz implements Runnable {
    public final /* synthetic */ zzja zza;

    public zziz(zzja zzja) {
        this.zza = zzja;
    }

    public final void run() {
        zzho.zzd("App's UI deactivated. Dispatching hits.");
        this.zza.zza.zzf.zza();
    }
}
