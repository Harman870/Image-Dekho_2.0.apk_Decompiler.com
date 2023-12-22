package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzlw extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzqz zzi;
        boolean z9 = false;
        o.b(zzqzArr.length == 2);
        zzrg zzrg = zzqzArr[0];
        boolean z10 = zzrg instanceof zzrk;
        zzqz zzqz = zzqzArr[1];
        if (z10 || !zzrl.zzj(zzrg)) {
            z9 = true;
        }
        o.b(z9);
        o.b(!zzrl.zzi(zzrg));
        o.b(!zzrl.zzi(zzqz));
        String zzd = zzjx.zzd(zzqz);
        if (zzrg instanceof zzrg) {
            zzrg zzrg2 = zzrg;
            if ("length".equals(zzd)) {
                return new zzrb(Double.valueOf((double) zzrg2.zzk().size()));
            }
            double zzb = zzjx.zzb(zzqz);
            if (zzb == Math.floor(zzb)) {
                int i10 = (int) zzb;
                if (zzd.equals(Integer.toString(i10)) && (zzi = zzrg2.zzi(i10)) != zzrd.zze) {
                    return zzi;
                }
            }
        } else if (z10) {
            zzrk zzrk = (zzrk) zzrg;
            if ("length".equals(zzd)) {
                return new zzrb(Double.valueOf((double) zzrk.zzk().length()));
            }
            double zzb2 = zzjx.zzb(zzqz);
            if (zzb2 == Math.floor(zzb2)) {
                int i11 = (int) zzb2;
                if (zzd.equals(Integer.toString(i11))) {
                    return zzrk.zzi(i11);
                }
            }
            return zzrd.zze;
        }
        return zzrg.zzb(zzd);
    }
}
