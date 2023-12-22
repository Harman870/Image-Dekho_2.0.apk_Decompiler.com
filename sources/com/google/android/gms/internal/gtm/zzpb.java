package com.google.android.gms.internal.gtm;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import r3.o;

public final class zzpb extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        boolean z9;
        int i10;
        int length = zzqzArr.length;
        if (length != 2) {
            if (length == 3) {
                length = 3;
            } else {
                z9 = false;
                o.b(z9);
                String zzd = zzjx.zzd(zzqzArr[0]);
                String zzd2 = zzjx.zzd(zzqzArr[1]);
                i10 = 64;
                if (length >= 3 && "true".equalsIgnoreCase(zzjx.zzd(zzqzArr[2]))) {
                    i10 = 66;
                }
                return new zzra(Boolean.valueOf(Pattern.compile(zzd2, i10).matcher(zzd).find()));
            }
        }
        z9 = true;
        o.b(z9);
        String zzd3 = zzjx.zzd(zzqzArr[0]);
        String zzd22 = zzjx.zzd(zzqzArr[1]);
        i10 = 64;
        i10 = 66;
        try {
            return new zzra(Boolean.valueOf(Pattern.compile(zzd22, i10).matcher(zzd3).find()));
        } catch (PatternSyntaxException unused) {
            return new zzra(Boolean.FALSE);
        }
    }
}
