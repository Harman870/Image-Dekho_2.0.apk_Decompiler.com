package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.List;

public final class zzjv extends zzjy {
    private zzie zza = null;
    private final String zzb;
    private final List zzc;
    private final List zzd;

    public zzjv(zzie zzie, String str, List list, List list2) {
        this.zzb = str;
        this.zzc = list;
        this.zzd = list2;
    }

    public final String toString() {
        String str = this.zzb;
        String obj = this.zzc.toString();
        String obj2 = this.zzd.toString();
        return str + "\n\tparams: " + obj + "\n\t: statements: " + obj2;
    }

    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        String str;
        zzrd zzrd;
        try {
            zzie zza2 = this.zza.zza();
            for (int i10 = 0; i10 < this.zzc.size(); i10++) {
                if (zzqzArr.length > i10) {
                    str = (String) this.zzc.get(i10);
                    zzrd = zzqzArr[i10];
                } else {
                    str = (String) this.zzc.get(i10);
                    zzrd = zzrd.zze;
                }
                zza2.zzc(str, zzrd);
            }
            zza2.zzc("arguments", new zzrg(Arrays.asList(zzqzArr)));
            for (zzri zzd2 : this.zzd) {
                zzqz zzd3 = zzrl.zzd(zza2, zzd2);
                if (zzd3 instanceof zzrd) {
                    zzrd zzrd2 = (zzrd) zzd3;
                    if (zzrd2.zzj()) {
                        return zzrd2.zzi();
                    }
                }
            }
        } catch (RuntimeException e10) {
            String str2 = this.zzb;
            String message = e10.getMessage();
            zzho.zza("Internal error - Function call: " + str2 + "\n" + message);
        }
        return zzrd.zze;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final void zzc(zzie zzie) {
        this.zza = zzie;
    }
}
