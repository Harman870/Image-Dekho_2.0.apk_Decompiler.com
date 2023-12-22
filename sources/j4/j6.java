package j4;

import c6.b;

public final class j6 {
    public static int a(byte[] bArr, int i10, i6 i6Var) {
        int i11 = i(bArr, i10, i6Var);
        int i12 = i6Var.f8233a;
        if (i12 < 0) {
            throw u7.b();
        } else if (i12 > bArr.length - i11) {
            throw u7.d();
        } else if (i12 == 0) {
            i6Var.f8235c = q6.f8402b;
            return i11;
        } else {
            i6Var.f8235c = q6.n(bArr, i11, i12);
            return i11 + i12;
        }
    }

    public static int b(int i10, byte[] bArr) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int c(y8 y8Var, byte[] bArr, int i10, int i11, int i12, i6 i6Var) {
        m7 zze = y8Var.zze();
        int m2 = m(zze, y8Var, bArr, i10, i11, i12, i6Var);
        y8Var.a(zze);
        i6Var.f8235c = zze;
        return m2;
    }

    public static int d(y8 y8Var, int i10, byte[] bArr, int i11, int i12, r7 r7Var, i6 i6Var) {
        m7 zze = y8Var.zze();
        int n2 = n(zze, y8Var, bArr, i11, i12, i6Var);
        y8Var.a(zze);
        i6Var.f8235c = zze;
        while (true) {
            r7Var.add(i6Var.f8235c);
            if (n2 >= i12) {
                break;
            }
            int i13 = i(bArr, n2, i6Var);
            if (i10 != i6Var.f8233a) {
                break;
            }
            m7 zze2 = y8Var.zze();
            int n10 = n(zze2, y8Var, bArr, i13, i12, i6Var);
            y8Var.a(zze2);
            i6Var.f8235c = zze2;
            n2 = n10;
        }
        return n2;
    }

    public static int e(byte[] bArr, int i10, r7 r7Var, i6 i6Var) {
        n7 n7Var = (n7) r7Var;
        int i11 = i(bArr, i10, i6Var);
        int i12 = i6Var.f8233a + i11;
        while (i11 < i12) {
            i11 = i(bArr, i11, i6Var);
            n7Var.d(i6Var.f8233a);
        }
        if (i11 == i12) {
            return i11;
        }
        throw u7.d();
    }

    public static int f(byte[] bArr, int i10, i6 i6Var) {
        int i11 = i(bArr, i10, i6Var);
        int i12 = i6Var.f8233a;
        if (i12 < 0) {
            throw u7.b();
        } else if (i12 == 0) {
            i6Var.f8235c = "";
            return i11;
        } else {
            i6Var.f8235c = new String(bArr, i11, i12, s7.f8462a);
            return i11 + i12;
        }
    }

    public static int g(byte[] bArr, int i10, i6 i6Var) {
        int i11;
        int i12;
        boolean z9;
        boolean z10;
        boolean z11;
        int i13 = i(bArr, i10, i6Var);
        int i14 = i6Var.f8233a;
        if (i14 < 0) {
            throw u7.b();
        } else if (i14 == 0) {
            i6Var.f8235c = "";
            return i13;
        } else {
            v9 v9Var = x9.f8559a;
            int length = bArr.length;
            if ((((length - i13) - i14) | i13 | i14) >= 0) {
                int i15 = i13 + i14;
                char[] cArr = new char[i14];
                int i16 = 0;
                while (i11 < i15) {
                    byte b10 = bArr[i11];
                    if (b10 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        break;
                    }
                    i13 = i11 + 1;
                    cArr[i12] = (char) b10;
                    i16 = i12 + 1;
                }
                while (i11 < i15) {
                    int i17 = i11 + 1;
                    byte b11 = bArr[i11];
                    if (b11 >= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        int i18 = i12 + 1;
                        cArr[i12] = (char) b11;
                        i11 = i17;
                        while (true) {
                            i12 = i18;
                            if (i11 < i15) {
                                byte b12 = bArr[i11];
                                if (b12 >= 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    break;
                                }
                                i11++;
                                i18 = i12 + 1;
                                cArr[i12] = (char) b12;
                            } else {
                                break;
                            }
                        }
                    } else if (b11 < -32) {
                        if (i17 < i15) {
                            int i19 = i17 + 1;
                            byte b13 = bArr[i17];
                            int i20 = i12 + 1;
                            if (b11 < -62 || b.O(b13)) {
                                throw u7.a();
                            }
                            cArr[i12] = (char) (((b11 & 31) << 6) | (b13 & 63));
                            i11 = i19;
                            i12 = i20;
                        } else {
                            throw u7.a();
                        }
                    } else if (b11 < -16) {
                        if (i17 < i15 - 1) {
                            int i21 = i17 + 1;
                            byte b14 = bArr[i17];
                            int i22 = i21 + 1;
                            byte b15 = bArr[i21];
                            int i23 = i12 + 1;
                            if (!b.O(b14)) {
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
                                if (!b.O(b15)) {
                                    cArr[i12] = (char) (((b11 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                                    i11 = i22;
                                    i12 = i23;
                                }
                            }
                            throw u7.a();
                        }
                        throw u7.a();
                    } else if (i17 < i15 - 2) {
                        int i24 = i17 + 1;
                        byte b16 = bArr[i17];
                        int i25 = i24 + 1;
                        byte b17 = bArr[i24];
                        int i26 = i25 + 1;
                        byte b18 = bArr[i25];
                        if (!b.O(b16)) {
                            if ((((b16 + 112) + (b11 << 28)) >> 30) == 0 && !b.O(b17) && !b.O(b18)) {
                                byte b19 = ((b11 & 7) << 18) | ((b16 & 63) << 12) | ((b17 & 63) << 6) | (b18 & 63);
                                cArr[i12] = (char) ((b19 >>> 10) + 55232);
                                cArr[i12 + 1] = (char) ((b19 & 1023) + 56320);
                                i12 += 2;
                                i11 = i26;
                            }
                        }
                        throw u7.a();
                    } else {
                        throw u7.a();
                    }
                }
                i6Var.f8235c = new String(cArr, 0, i12);
                return i15;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i13), Integer.valueOf(i14)}));
        }
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, k9 k9Var, i6 i6Var) {
        o6 o6Var;
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int l6 = l(bArr, i11, i6Var);
                k9Var.c(i10, Long.valueOf(i6Var.f8234b));
                return l6;
            } else if (i13 == 1) {
                k9Var.c(i10, Long.valueOf(o(i11, bArr)));
                return i11 + 8;
            } else if (i13 == 2) {
                int i14 = i(bArr, i11, i6Var);
                int i15 = i6Var.f8233a;
                if (i15 < 0) {
                    throw u7.b();
                } else if (i15 <= bArr.length - i14) {
                    if (i15 == 0) {
                        o6Var = q6.f8402b;
                    } else {
                        o6Var = q6.n(bArr, i14, i15);
                    }
                    k9Var.c(i10, o6Var);
                    return i14 + i15;
                } else {
                    throw u7.d();
                }
            } else if (i13 == 3) {
                int i16 = (i10 & -8) | 4;
                k9 b10 = k9.b();
                int i17 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int i18 = i(bArr, i11, i6Var);
                    int i19 = i6Var.f8233a;
                    i17 = i19;
                    if (i19 == i16) {
                        i11 = i18;
                        break;
                    }
                    int h10 = h(i17, bArr, i18, i12, b10, i6Var);
                    i17 = i19;
                    i11 = h10;
                }
                if (i11 > i12 || i17 != i16) {
                    throw u7.c();
                }
                k9Var.c(i10, b10);
                return i11;
            } else if (i13 == 5) {
                k9Var.c(i10, Integer.valueOf(b(i11, bArr)));
                return i11 + 4;
            } else {
                throw new u7("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new u7("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int i(byte[] bArr, int i10, i6 i6Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return j(b10, bArr, i11, i6Var);
        }
        i6Var.f8233a = b10;
        return i11;
    }

    public static int j(int i10, byte[] bArr, int i11, i6 i6Var) {
        int i12;
        int i13;
        byte b10 = bArr[i11];
        int i14 = i11 + 1;
        int i15 = i10 & 127;
        if (b10 >= 0) {
            i13 = b10 << 7;
        } else {
            int i16 = i15 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i14 + 1;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i15 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i14 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i14 + 1;
                    byte b13 = bArr[i14];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] < 0) {
                                i17 = i19;
                            } else {
                                i6Var.f8233a = i18;
                                return i19;
                            }
                        }
                    }
                }
            }
            i6Var.f8233a = i16 | i12;
            return i17;
        }
        i6Var.f8233a = i15 | i13;
        return i14;
    }

    public static int k(int i10, byte[] bArr, int i11, int i12, r7 r7Var, i6 i6Var) {
        n7 n7Var = (n7) r7Var;
        int i13 = i(bArr, i11, i6Var);
        while (true) {
            n7Var.d(i6Var.f8233a);
            if (i13 >= i12) {
                break;
            }
            int i14 = i(bArr, i13, i6Var);
            if (i10 != i6Var.f8233a) {
                break;
            }
            i13 = i(bArr, i14, i6Var);
        }
        return i13;
    }

    public static int l(byte[] bArr, int i10, i6 i6Var) {
        long j10 = (long) bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            i6Var.f8234b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
            byte b12 = b11;
            i12 = i14;
            b10 = b12;
        }
        i6Var.f8234b = j11;
        return i12;
    }

    public static int m(Object obj, y8 y8Var, byte[] bArr, int i10, int i11, int i12, i6 i6Var) {
        int z9 = ((q8) y8Var).z(obj, bArr, i10, i11, i12, i6Var);
        i6Var.f8235c = obj;
        return z9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int n(java.lang.Object r6, j4.y8 r7, byte[] r8, int r9, int r10, j4.i6 r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = j(r9, r8, r0, r11)
            int r9 = r11.f8233a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.h(r1, r2, r3, r4, r5)
            r11.f8235c = r6
            return r9
        L_0x001e:
            j4.u7 r6 = j4.u7.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.j6.n(java.lang.Object, j4.y8, byte[], int, int, j4.i6):int");
    }

    public static long o(int i10, byte[] bArr) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
