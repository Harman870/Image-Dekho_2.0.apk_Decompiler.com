package com.google.android.gms.internal.gtm;

import java.util.Locale;

public final class zzgh {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b10 : bArr) {
            if ((b10 & 240) == 0) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b10 & 255));
        }
        return sb.toString().toUpperCase(Locale.ENGLISH);
    }

    public static byte[] zzb(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            for (int i10 = 0; i10 < length; i10 += 2) {
                int digit = Character.digit(str.charAt(i10), 16);
                int digit2 = Character.digit(str.charAt(i10 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("purported base16 string has illegal char");
                }
                bArr[i10 / 2] = (byte) ((digit << 4) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("purported base16 string has odd number of characters");
    }
}
