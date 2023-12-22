package com.google.android.gms.internal.gtm;

import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import r3.o;

public final class zzoc extends zzjy {
    private static final Pattern zza = Pattern.compile("(.+)/(.+)/(.+)");

    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        int length = zzqzArr.length;
        o.b(length >= 3);
        o.b(zzqzArr[1] instanceof zzrk);
        String zzd = zzjx.zzd(zzqzArr[0]);
        String zzd2 = zzjx.zzd(zzqzArr[1]);
        String zzd3 = zzjx.zzd(zzqzArr[2]);
        String zzd4 = length < 4 ? "AES/CBC/NoPadding" : zzjx.zzd(zzqzArr[3]);
        Matcher matcher = zza.matcher(zzd4);
        if (matcher.matches()) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(zzd2.getBytes(), matcher.group(1));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(zzd3.getBytes());
            try {
                Cipher instance = Cipher.getInstance(zzd4);
                if (zzd == null || zzd.length() == 0) {
                    throw new RuntimeException("Encrypt: empty input string");
                }
                try {
                    instance.init(1, secretKeySpec, ivParameterSpec);
                    return new zzrk(zzgh.zza(instance.doFinal(zzd.getBytes())));
                } catch (Exception e10) {
                    throw new RuntimeException("Encrypt: ".concat(String.valueOf(e10.getMessage())));
                }
            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
                throw new RuntimeException("Encrypt: invalid transformation:".concat(String.valueOf(zzd4)));
            }
        } else {
            throw new RuntimeException("Encrypt: invalid transformation:".concat(String.valueOf(zzd4)));
        }
    }
}
