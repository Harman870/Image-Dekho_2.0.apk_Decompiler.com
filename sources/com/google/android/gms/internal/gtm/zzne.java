package com.google.android.gms.internal.gtm;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import r3.o;

public final class zzne extends zzjy {
    public static String zzb(String str, String str2) {
        int i10;
        StringBuilder sb = new StringBuilder();
        Charset forName = Charset.forName("UTF-8");
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (str2.indexOf(charAt) != -1) {
                sb.append(charAt);
                i11++;
            } else {
                if (Character.isHighSurrogate(charAt)) {
                    int i12 = i11 + 1;
                    if (i12 >= str.length()) {
                        throw new UnsupportedEncodingException();
                    } else if (Character.isLowSurrogate(str.charAt(i12))) {
                        i10 = 2;
                    } else {
                        throw new UnsupportedEncodingException();
                    }
                } else {
                    i10 = 1;
                }
                int i13 = i10 + i11;
                byte[] bytes = str.substring(i11, i13).getBytes(forName);
                for (int i14 = 0; i14 < bytes.length; i14++) {
                    sb.append("%");
                    sb.append(Character.toUpperCase(Character.forDigit((bytes[i14] >> 4) & 15, 16)));
                    sb.append(Character.toUpperCase(Character.forDigit(bytes[i14] & 15, 16)));
                }
                i11 = i13;
            }
        }
        return sb.toString().replaceAll(" ", "%20");
    }

    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzrd zzrd;
        if (zzqzArr.length > 0) {
            zzrd = zzqzArr[0];
            o.h(zzrd);
        } else {
            zzrd = zzrd.zze;
        }
        try {
            return new zzrk(zzb(zzjx.zzd(zzrd), "#;/?:@&=+$,abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_.!~*'()0123456789"));
        } catch (UnsupportedEncodingException unused) {
            return zzrd.zze;
        }
    }
}
