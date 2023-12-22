package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import r3.o;

public final class zzmr extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        boolean z9;
        zzqz zzqz;
        int length = zzqzArr.length;
        if (length <= 0 || length > 3) {
            z9 = false;
        } else {
            z9 = true;
        }
        o.b(z9);
        o.b(zzqzArr[0] instanceof zzrk);
        String zzk = zzqzArr[0].zzk();
        if (length == 1) {
            return new zzrk(zzk);
        }
        String zzd = zzjx.zzd(zzqzArr[1]);
        if (length < 3) {
            zzqz = zzrd.zze;
        } else {
            zzqz = zzqzArr[2];
        }
        int indexOf = zzk.indexOf(zzd);
        if (indexOf == -1) {
            return new zzrk(zzk);
        }
        if (zzqz instanceof zzrc) {
            zzqz = ((zzrc) zzqz).zzi().zzd(zzie, new zzrk(zzd), new zzrb(Double.valueOf((double) indexOf)), new zzrk(zzk));
        }
        return new zzrk(w0.d(zzk.substring(0, indexOf), zzjx.zzd(zzqz), zzk.substring(zzd.length() + indexOf)));
    }
}
