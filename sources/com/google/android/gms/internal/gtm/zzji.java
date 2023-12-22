package com.google.android.gms.internal.gtm;

import android.os.RemoteException;

final class zzji implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzhj zzd;
    public final /* synthetic */ zzjl zze;

    public zzji(zzjl zzjl, String str, String str2, String str3, zzhj zzhj) {
        this.zze = zzjl;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzhj;
    }

    public final void run() {
        boolean z9 = true;
        try {
            if (!this.zze.zza.containsKey(this.zza)) {
                this.zze.zza.put(this.zza, this.zze.zzc.zza(this.zza, this.zzb, this.zzc));
            }
        } catch (Exception e10) {
            zzgv.zzb("Fail to load container: ", e10, this.zze.zze);
            z9 = false;
        }
        try {
            zzhj zzhj = this.zzd;
            if (zzhj != null) {
                zzhj.zze(z9, this.zza);
            }
        } catch (RemoteException e11) {
            zzgv.zzb("Error relaying callback: ", e11, this.zze.zze);
        }
    }
}
