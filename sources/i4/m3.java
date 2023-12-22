package i4;

import androidx.activity.f;
import y3.a;

public final class m3 {

    /* renamed from: a  reason: collision with root package name */
    public static final k3 f7487a = new k3();

    static {
        if (h3.f7349e && h3.f7348d) {
            int i10 = v.f7729a;
        }
    }

    public static int a(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char charAt;
        int length = charSequence.length();
        int i15 = i11 + i10;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i10) < i15 && (charAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) charAt;
            i16++;
        }
        if (i16 == length) {
            return i10 + length;
        }
        int i17 = i10 + i16;
        while (i16 < length) {
            char charAt2 = charSequence.charAt(i16);
            if (charAt2 < 128 && i17 < i15) {
                i13 = i17 + 1;
                bArr[i17] = (byte) charAt2;
            } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                int i18 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                i17 = i18 + 1;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
                i16++;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i17 <= i15 - 3) {
                int i19 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 12) | 480);
                int i20 = i19 + 1;
                bArr[i19] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i13 = i20 + 1;
                bArr[i20] = (byte) ((charAt2 & '?') | 128);
            } else if (i17 <= i15 - 4) {
                int i21 = i16 + 1;
                if (i21 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i21);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i22 = i17 + 1;
                        bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                        int i23 = i22 + 1;
                        bArr[i22] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i24 = i23 + 1;
                        bArr[i23] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i17 = i24 + 1;
                        bArr[i24] = (byte) ((codePoint & 63) | 128);
                        i16 = i21;
                        i16++;
                    } else {
                        i16 = i21;
                    }
                }
                throw new l3(i16 - 1, length);
            } else if (charAt2 < 55296 || charAt2 > 57343 || ((i12 = i16 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
            } else {
                throw new l3(i16, length);
            }
            i17 = i13;
            i16++;
        }
        return i17;
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new l3(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder g10 = f.g("UTF-8 length does not fit in int: ");
        g10.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(g10.toString());
    }

    public static String c(byte[] bArr, int i10, int i11) {
        int i12;
        boolean z9;
        boolean z10;
        boolean z11;
        int length = bArr.length;
        if ((i10 | i11 | ((length - i10) - i11)) >= 0) {
            int i13 = i10 + i11;
            char[] cArr = new char[i11];
            int i14 = 0;
            while (r11 < i13) {
                byte b10 = bArr[r11];
                if (b10 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
                i10 = r11 + 1;
                cArr[i12] = (char) b10;
                i14 = i12 + 1;
            }
            while (r11 < i13) {
                int i15 = r11 + 1;
                byte b11 = bArr[r11];
                if (b11 >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    int i16 = i12 + 1;
                    cArr[i12] = (char) b11;
                    r11 = i15;
                    while (true) {
                        i12 = i16;
                        if (r11 >= i13) {
                            break;
                        }
                        byte b12 = bArr[r11];
                        if (b12 >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            break;
                        }
                        r11++;
                        i16 = i12 + 1;
                        cArr[i12] = (char) b12;
                    }
                } else if (b11 < -32) {
                    if (i15 < i13) {
                        int i17 = i15 + 1;
                        int i18 = i12 + 1;
                        byte b13 = bArr[i15];
                        if (b11 < -62 || a.X(b13)) {
                            throw i1.b();
                        }
                        cArr[i12] = (char) (((b11 & 31) << 6) | (b13 & 63));
                        r11 = i17;
                        i12 = i18;
                    } else {
                        throw i1.b();
                    }
                } else if (b11 < -16) {
                    if (i15 < i13 - 1) {
                        int i19 = i15 + 1;
                        int i20 = i19 + 1;
                        int i21 = i12 + 1;
                        byte b14 = bArr[i15];
                        byte b15 = bArr[i19];
                        if (!a.X(b14)) {
                            if (b11 == -32) {
                                if (b14 >= -96) {
                                    b11 = -32;
                                }
                            }
                            if (b11 == -19) {
                                if (b14 < -96) {
                                    b11 = -19;
                                }
                            }
                            if (!a.X(b15)) {
                                cArr[i12] = (char) (((b11 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                                r11 = i20;
                                i12 = i21;
                            }
                        }
                        throw i1.b();
                    }
                    throw i1.b();
                } else if (i15 < i13 - 2) {
                    int i22 = i15 + 1;
                    int i23 = i22 + 1;
                    int i24 = i23 + 1;
                    byte b16 = bArr[i15];
                    byte b17 = bArr[i22];
                    byte b18 = bArr[i23];
                    if (!a.X(b16)) {
                        if ((((b16 + 112) + (b11 << 28)) >> 30) == 0 && !a.X(b17) && !a.X(b18)) {
                            byte b19 = ((b11 & 7) << 18) | ((b16 & 63) << 12) | ((b17 & 63) << 6) | (b18 & 63);
                            cArr[i12] = (char) ((b19 >>> 10) + 55232);
                            cArr[i12 + 1] = (char) ((b19 & 1023) + 56320);
                            i12 += 2;
                            r11 = i24;
                        }
                    }
                    throw i1.b();
                } else {
                    throw i1.b();
                }
            }
            return new String(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)}));
    }

    public static boolean d(byte[] bArr, int i10, int i11) {
        f7487a.getClass();
        return i3.a(bArr, i10, i11);
    }
}
