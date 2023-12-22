package com.google.android.gms.internal.gtm;

import java.util.Comparator;
import r3.o;

final class zzkp implements Comparator {
    public final /* synthetic */ zzrc zza;
    public final /* synthetic */ zzie zzb;

    public zzkp(zzks zzks, zzrc zzrc, zzie zzie) {
        this.zza = zzrc;
        this.zzb = zzie;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzqz zzqz = (zzqz) obj;
        zzqz zzqz2 = (zzqz) obj2;
        if (zzqz == null) {
            return zzqz2 != null ? 1 : 0;
        }
        if (zzqz2 == null) {
            return -1;
        }
        zzqz zzd = this.zza.zzi().zzd(this.zzb, zzqz, zzqz2);
        o.k(zzd instanceof zzrb);
        return (int) ((zzrb) zzd).zzi().doubleValue();
    }
}
