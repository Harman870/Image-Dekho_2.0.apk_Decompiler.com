package com.google.android.gms.internal.gtm;

import java.util.Map;

final class zzhe implements Runnable {
    public final /* synthetic */ zzhd zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ String zze;
    public final /* synthetic */ Map zzf;
    public final /* synthetic */ String zzg;
    public final /* synthetic */ zzhf zzh;

    public zzhe(zzhf zzhf, zzhd zzhd, long j10, String str, String str2, String str3, Map map, String str4) {
        this.zzh = zzhf;
        this.zza = zzhd;
        this.zzb = j10;
        this.zzc = str;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = map;
        this.zzg = str4;
    }

    public final void run() {
        if (this.zzh.zze == null) {
            zzin zzf2 = zzin.zzf();
            zzf2.zzj(this.zzh.zzf, this.zza);
            this.zzh.zze = zzf2.zze();
        }
        this.zzh.zze.zzb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }
}
