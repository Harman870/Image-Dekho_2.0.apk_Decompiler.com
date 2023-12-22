package com.google.android.gms.internal.gtm;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import r3.o;

public final class zznc extends zzjy {
    public static String zzb(String str, String str2) {
        Charset forName = Charset.forName("UTF-8");
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt != '%') {
                sb.append(charAt);
                i10++;
            } else {
                byte zzc = zzc(str, i10);
                int i11 = i10 + 3;
                if ((zzc & 128) != 0) {
                    int i12 = 0;
                    while (((zzc << i12) & 128) != 0) {
                        i12++;
                    }
                    if (i12 < 2 || i12 > 4) {
                        throw new UnsupportedEncodingException();
                    }
                    byte[] bArr = new byte[i12];
                    bArr[0] = zzc;
                    int i13 = 1;
                    while (i13 < i12) {
                        byte zzc2 = zzc(str, i11);
                        i11 += 3;
                        if ((zzc2 & 192) == 128) {
                            bArr[i13] = zzc2;
                            i13++;
                        } else {
                            throw new UnsupportedEncodingException();
                        }
                    }
                    CharBuffer decode = forName.decode(ByteBuffer.wrap(bArr));
                    if (decode.length() != 1 || str2.indexOf(decode.charAt(0)) == -1) {
                        sb.append(decode);
                        i10 = i11;
                    }
                } else if (str2.indexOf(zzc) == -1) {
                    sb.append((char) zzc);
                    i10 = i11;
                } else {
                    i10 = i11 - 3;
                }
                sb.append(str.substring(i10, i11));
                i10 = i11;
            }
        }
        return sb.toString();
    }

    private static byte zzc(String str, int i10) {
        int i11 = i10 + 3;
        if (i11 > str.length() || str.charAt(i10) != '%') {
            throw new UnsupportedEncodingException();
        }
        String substring = str.substring(i10 + 1, i11);
        if (substring.charAt(0) == '+' || substring.charAt(0) == '-') {
            throw new UnsupportedEncodingException();
        }
        try {
            return (byte) Integer.parseInt(substring, 16);
        } catch (NumberFormatException unused) {
            throw new UnsupportedEncodingException();
        }
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
            return new zzrk(zzb(zzjx.zzd(zzrd), "#;/?:@&=+$,"));
        } catch (UnsupportedEncodingException unused) {
            return zzrd.zze;
        }
    }
}
