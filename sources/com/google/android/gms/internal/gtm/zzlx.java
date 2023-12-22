package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzlx extends zzjy {
    public static final zzlx zza = new zzlx();

    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.b(zzqzArr.length == 2);
        zzrg zzrg = zzqzArr[0];
        zzqz zzqz = zzqzArr[1];
        o.b(!zzrl.zzi(zzrg));
        o.b(!zzrl.zzi(zzqz));
        String zzd = zzjx.zzd(zzqz);
        if (zzrg instanceof zzrg) {
            if ("length".equals(zzd)) {
                return new zzra(Boolean.TRUE);
            }
            double zzb = zzjx.zzb(zzqz);
            if (zzb == Math.floor(zzb)) {
                int i10 = (int) zzb;
                if (zzd.equals(Integer.toString(i10)) && i10 >= 0 && i10 < zzrg.zzk().size()) {
                    return new zzra(Boolean.TRUE);
                }
            }
        } else if (zzrg instanceof zzrk) {
            if ("length".equals(zzd)) {
                return new zzra(Boolean.TRUE);
            }
            double zzb2 = zzjx.zzb(zzqz);
            if (zzb2 == Math.floor(zzb2)) {
                int i11 = (int) zzb2;
                if (zzd.equals(Integer.toString(i11)) && i11 >= 0 && i11 < ((zzrk) zzrg).zzk().length()) {
                    return new zzra(Boolean.TRUE);
                }
            }
            return new zzra(Boolean.FALSE);
        }
        return new zzra(Boolean.valueOf(zzrg.zzh(zzd)));
    }
}
