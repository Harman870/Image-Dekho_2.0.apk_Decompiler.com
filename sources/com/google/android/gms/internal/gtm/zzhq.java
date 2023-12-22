package com.google.android.gms.internal.gtm;

final class zzhq implements zzip {
    public final /* synthetic */ zzhs zza;

    public zzhq(zzhs zzhs) {
        this.zza = zzhs;
    }

    public final void zza(zzhb zzhb) {
        this.zza.zzo(zzhb.zzb());
        long zzb = zzhb.zzb();
        zzho.zzd("Permanent failure dispatching hitId: " + zzb);
    }

    public final void zzb(zzhb zzhb) {
        long zza2 = zzhb.zza();
        if (zza2 == 0) {
            zzhs.zzl(this.zza, zzhb.zzb(), this.zza.zzj.currentTimeMillis());
        } else if (zza2 + 14400000 < this.zza.zzj.currentTimeMillis()) {
            this.zza.zzo(zzhb.zzb());
            long zzb = zzhb.zzb();
            zzho.zzd("Giving up on failed hitId: " + zzb);
        }
    }
}
