package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzmc extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = false;
        o.b(zzqzArr.length == 3);
        zzrh zzrh = zzqzArr[0];
        zzqz zzqz = zzqzArr[1];
        zzqz zzqz2 = zzqzArr[2];
        o.b(zzrh != zzrd.zzd);
        o.b(zzrh != zzrd.zze);
        o.b(!zzrl.zzi(zzrh));
        o.b(!zzrl.zzi(zzqz));
        o.b(!zzrl.zzi(zzqz2));
        if (zzrl.zzj(zzrh)) {
            return zzqz2;
        }
        String zzd = zzjx.zzd(zzqz);
        if (zzrh instanceof zzrh) {
            zzrh zzrh2 = zzrh;
            if (!zzrh2.zzk()) {
                zzrh2.zzf(zzd, zzqz2);
            }
            return zzqz2;
        }
        if (zzrh instanceof zzrg) {
            zzrg zzrg = (zzrg) zzrh;
            if ("length".equals(zzd)) {
                double zzb = zzjx.zzb(zzqz2);
                if (!Double.isInfinite(zzb) && zzb == Math.floor(zzb)) {
                    z9 = true;
                }
                o.b(z9);
                zzrg.zzm((int) zzb);
                return zzqz2;
            }
            double zzb2 = zzjx.zzb(zzqz);
            if (!Double.isInfinite(zzb2) && zzb2 >= 0.0d) {
                int i10 = (int) zzb2;
                if (zzd.equals(Integer.toString(i10))) {
                    zzrg.zzl(i10, zzqz2);
                    return zzqz2;
                }
            }
        }
        zzrh.zzf(zzd, zzqz2);
        return zzqz2;
    }
}
