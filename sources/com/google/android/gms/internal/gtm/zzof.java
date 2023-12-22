package com.google.android.gms.internal.gtm;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import r3.o;

public final class zzof extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        byte[] bArr;
        zzrd zzrd;
        zzrd zzrd2;
        int length = zzqzArr.length;
        o.b(length > 0);
        zzrd zzrd3 = zzqzArr[0];
        zzrd zzrd4 = zzrd.zze;
        if (zzrd3 == zzrd4) {
            return zzrd4;
        }
        String zzd = zzjx.zzd(zzrd3);
        String str = "MD5";
        if (length > 1 && (zzrd2 = zzqzArr[1]) != zzrd4) {
            str = zzjx.zzd(zzrd2);
        }
        String zzd2 = (length <= 2 || (zzrd = zzqzArr[2]) == zzrd4) ? "text" : zzjx.zzd(zzrd);
        if ("text".equals(zzd2)) {
            bArr = zzd.getBytes();
        } else if ("base16".equals(zzd2)) {
            bArr = zzgh.zzb(zzd);
        } else {
            throw new RuntimeException("Hash: Unknown input format: ".concat(String.valueOf(zzd2)));
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return new zzrk(zzgh.zza(instance.digest()));
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Hash: Unknown algorithm: ".concat(String.valueOf(str)), e10);
        }
    }
}
