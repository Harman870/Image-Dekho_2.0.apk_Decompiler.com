package com.google.android.gms.internal.gtm;

import android.util.Base64;
import r3.o;

public final class zzob extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        byte[] bArr;
        String str;
        int length = zzqzArr.length;
        o.b(length > 0);
        String zzd = zzjx.zzd(zzqzArr[0]);
        String zzd2 = length > 1 ? zzjx.zzd(zzqzArr[1]) : "text";
        int i10 = 2;
        String zzd3 = length > 2 ? zzjx.zzd(zzqzArr[2]) : "base16";
        if (length > 3 && zzjx.zzg(zzqzArr[3])) {
            i10 = 3;
        }
        try {
            if ("text".equals(zzd2)) {
                bArr = zzd.getBytes();
            } else if ("base16".equals(zzd2)) {
                bArr = zzgh.zzb(zzd);
            } else if ("base64".equals(zzd2)) {
                bArr = Base64.decode(zzd, i10);
            } else if ("base64url".equals(zzd2)) {
                bArr = Base64.decode(zzd, i10 | 8);
            } else {
                throw new UnsupportedOperationException("Encode: unknown input format: " + zzd2);
            }
            if ("base16".equals(zzd3)) {
                str = zzgh.zza(bArr);
            } else if ("base64".equals(zzd3)) {
                str = Base64.encodeToString(bArr, i10);
            } else if ("base64url".equals(zzd3)) {
                str = Base64.encodeToString(bArr, i10 | 8);
            } else {
                throw new RuntimeException("Encode: unknown output format: ".concat(String.valueOf(zzd3)));
            }
            return new zzrk(str);
        } catch (IllegalArgumentException unused) {
            throw new RuntimeException("Encode: invalid input:".concat(String.valueOf(zzd2)));
        }
    }
}
