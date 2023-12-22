package com.google.android.gms.internal.gtm;

import android.os.Build;
import androidx.fragment.app.w0;
import r3.o;

public final class zzoa implements zzjw {
    private final String zza = Build.MANUFACTURER;
    private final String zzb = Build.MODEL;

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9;
        boolean z10 = true;
        if (zzqzArr != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o.b(z9);
        if (zzqzArr.length != 0) {
            z10 = false;
        }
        o.b(z10);
        String str = this.zza;
        String str2 = this.zzb;
        if (!str2.startsWith(str) && !str.equals("unknown")) {
            str2 = w0.d(str, " ", str2);
        }
        return new zzrk(str2);
    }
}
