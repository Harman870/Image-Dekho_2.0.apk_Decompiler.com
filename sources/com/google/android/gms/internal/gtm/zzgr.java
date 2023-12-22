package com.google.android.gms.internal.gtm;

final class zzgr implements Runnable {
    public final /* synthetic */ zzgs zza;
    private final zzpv zzb;

    public zzgr(zzgs zzgs, zzpv zzpv) {
        this.zza = zzgs;
        this.zzb = zzpv;
    }

    public final void run() {
        zzgs zzgs;
        long max;
        zzqj zzc = this.zzb.zzb().zzc();
        zzqs zzc2 = this.zzb.zzc();
        zzgs zzgs2 = this.zza;
        zzic zzf = zzgs2.zzl;
        zzgs2.zzl = zzgs2.zze.zza(zzc, zzc2);
        this.zza.zzm = 2;
        String zzi = this.zza.zzb;
        zzho.zzd("Container " + zzi + " loaded during runtime initialization.");
        zzgs zzgs3 = this.zza;
        if (zzgs3.zzn != null) {
            for (zzgz zzgz : zzgs3.zzn) {
                zzho.zzd("Evaluating tags for pending event ".concat(String.valueOf(zzgz.zzb())));
                this.zza.zzl.zzf(zzgz);
            }
            this.zza.zzn = null;
        }
        this.zza.zzl.zze();
        zzho.zzd("Runtime initialized successfully for container ".concat(String.valueOf(this.zza.zzb)));
        long zzb2 = this.zza.zzk.zzb() + this.zzb.zzb().zza();
        if (zzf == null) {
            zzgs zzgs4 = this.zza;
            if (zzgs4.zzp && this.zzb.zza() == 1 && zzb2 < zzgs4.zzj.currentTimeMillis()) {
                zzgs = this.zza;
                max = zzgs.zzk.zza();
                zzgs.zzr(zzgs, max);
            }
        }
        zzgs = this.zza;
        max = Math.max(900000, zzb2 - zzgs.zzj.currentTimeMillis());
        zzgs.zzr(zzgs, max);
    }
}
