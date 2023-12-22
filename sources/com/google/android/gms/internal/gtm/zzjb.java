package com.google.android.gms.internal.gtm;

import android.net.Uri;

final class zzjb implements Runnable {
    public final /* synthetic */ Uri zza;
    public final /* synthetic */ zzjh zzb;

    public zzjb(zzjh zzjh, Uri uri) {
        this.zzb = zzjh;
        this.zza = uri;
    }

    public final void run() {
        zzho.zzd("Preview requested to uri ".concat(String.valueOf(this.zza)));
        synchronized (this.zzb.zzk) {
            zzjh zzjh = this.zzb;
            if (zzjh.zzn != 2) {
                String str = (String) zzjh.zzp((String[]) null).first;
                if (str == null) {
                    zzho.zze("Preview failed (no container found)");
                } else if (!this.zzb.zzi.zzf(str, this.zza)) {
                    String valueOf = String.valueOf(this.zza);
                    zzho.zze("Cannot preview the app with the uri: " + valueOf + ". Launching current version instead.");
                } else if (!this.zzb.zzp) {
                    String valueOf2 = String.valueOf(this.zza);
                    zzho.zzd("Deferring container loading for preview uri: " + valueOf2 + "(Tag Manager has not been initialized).");
                } else {
                    String valueOf3 = String.valueOf(this.zza);
                    zzho.zzc("Starting to load preview container: " + valueOf3);
                    if (!this.zzb.zzf.zze()) {
                        zzho.zze("Failed to reset TagManager service for preview");
                        return;
                    }
                    this.zzb.zzp = false;
                    this.zzb.zzn = 1;
                    this.zzb.zzm((String[]) null);
                }
            } else {
                zzho.zzd("Still initializing. Defer preview container loading.");
                this.zzb.zzo.add(this);
            }
        }
    }
}
