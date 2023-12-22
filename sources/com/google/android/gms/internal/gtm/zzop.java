package com.google.android.gms.internal.gtm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import r3.o;

public final class zzop extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzrd zzrd;
        zzrd zzrd2;
        int length = zzqzArr.length;
        int i10 = 1;
        o.b(length >= 2);
        zzrd zzrd3 = zzqzArr[0];
        zzrd zzrd4 = zzrd.zze;
        if (zzrd3 == zzrd4 || zzqzArr[1] == zzrd4) {
            return zzrd4;
        }
        String zzd = zzjx.zzd(zzrd3);
        String zzd2 = zzjx.zzd(zzqzArr[1]);
        int i11 = 64;
        if (length > 2 && (zzrd2 = zzqzArr[2]) != zzrd4 && zzjx.zzg(zzrd2)) {
            i11 = 66;
        }
        if (length > 3 && (zzrd = zzqzArr[3]) != zzrd4) {
            if (!(zzrd instanceof zzrb)) {
                return zzrd4;
            }
            double zza = zzjx.zza(zzrd);
            if (Double.isInfinite(zza) || zza < 0.0d) {
                return zzrd4;
            }
            i10 = (int) zza;
        }
        try {
            Matcher matcher = Pattern.compile(zzd2, i11).matcher(zzd);
            String str = null;
            if (matcher.find() && matcher.groupCount() >= i10) {
                str = matcher.group(i10);
            }
            return str == null ? zzrd4 : new zzrk(str);
        } catch (PatternSyntaxException unused) {
            return zzrd.zze;
        }
    }
}
