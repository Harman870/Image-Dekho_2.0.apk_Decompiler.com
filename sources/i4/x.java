package i4;

public final class x {
    public static int a(byte[] bArr, int i10, w wVar) {
        int i11 = i(bArr, i10, wVar);
        int i12 = wVar.f7749a;
        if (i12 < 0) {
            throw i1.c();
        } else if (i12 > bArr.length - i11) {
            throw i1.e();
        } else if (i12 == 0) {
            wVar.f7751c = e0.f7269b;
            return i11;
        } else {
            wVar.f7751c = e0.q(bArr, i11, i12);
            return i11 + i12;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int c(m2 m2Var, byte[] bArr, int i10, int i11, int i12, w wVar) {
        c1 zze = m2Var.zze();
        int m2 = m(zze, m2Var, bArr, i10, i11, i12, wVar);
        m2Var.a(zze);
        wVar.f7751c = zze;
        return m2;
    }

    public static int d(m2 m2Var, int i10, byte[] bArr, int i11, int i12, f1 f1Var, w wVar) {
        c1 zze = m2Var.zze();
        int n2 = n(zze, m2Var, bArr, i11, i12, wVar);
        m2Var.a(zze);
        wVar.f7751c = zze;
        while (true) {
            f1Var.add(wVar.f7751c);
            if (n2 >= i12) {
                break;
            }
            int i13 = i(bArr, n2, wVar);
            if (i10 != wVar.f7749a) {
                break;
            }
            c1 zze2 = m2Var.zze();
            int n10 = n(zze2, m2Var, bArr, i13, i12, wVar);
            m2Var.a(zze2);
            wVar.f7751c = zze2;
            n2 = n10;
        }
        return n2;
    }

    public static int e(byte[] bArr, int i10, f1 f1Var, w wVar) {
        d1 d1Var = (d1) f1Var;
        int i11 = i(bArr, i10, wVar);
        int i12 = wVar.f7749a + i11;
        while (i11 < i12) {
            i11 = i(bArr, i11, wVar);
            d1Var.d(wVar.f7749a);
        }
        if (i11 == i12) {
            return i11;
        }
        throw i1.e();
    }

    public static int f(byte[] bArr, int i10, w wVar) {
        int i11 = i(bArr, i10, wVar);
        int i12 = wVar.f7749a;
        if (i12 < 0) {
            throw i1.c();
        } else if (i12 == 0) {
            wVar.f7751c = "";
            return i11;
        } else {
            wVar.f7751c = new String(bArr, i11, i12, g1.f7324a);
            return i11 + i12;
        }
    }

    public static int g(byte[] bArr, int i10, w wVar) {
        int i11 = i(bArr, i10, wVar);
        int i12 = wVar.f7749a;
        if (i12 < 0) {
            throw i1.c();
        } else if (i12 == 0) {
            wVar.f7751c = "";
            return i11;
        } else {
            wVar.f7751c = m3.c(bArr, i11, i12);
            return i11 + i12;
        }
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, y2 y2Var, w wVar) {
        d0 d0Var;
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int l6 = l(bArr, i11, wVar);
                y2Var.c(i10, Long.valueOf(wVar.f7750b));
                return l6;
            } else if (i13 == 1) {
                y2Var.c(i10, Long.valueOf(o(i11, bArr)));
                return i11 + 8;
            } else if (i13 == 2) {
                int i14 = i(bArr, i11, wVar);
                int i15 = wVar.f7749a;
                if (i15 < 0) {
                    throw i1.c();
                } else if (i15 <= bArr.length - i14) {
                    if (i15 == 0) {
                        d0Var = e0.f7269b;
                    } else {
                        d0Var = e0.q(bArr, i14, i15);
                    }
                    y2Var.c(i10, d0Var);
                    return i14 + i15;
                } else {
                    throw i1.e();
                }
            } else if (i13 == 3) {
                int i16 = (i10 & -8) | 4;
                y2 b10 = y2.b();
                int i17 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int i18 = i(bArr, i11, wVar);
                    int i19 = wVar.f7749a;
                    i17 = i19;
                    if (i19 == i16) {
                        i11 = i18;
                        break;
                    }
                    int h10 = h(i17, bArr, i18, i12, b10, wVar);
                    i17 = i19;
                    i11 = h10;
                }
                if (i11 > i12 || i17 != i16) {
                    throw i1.d();
                }
                y2Var.c(i10, b10);
                return i11;
            } else if (i13 == 5) {
                y2Var.c(i10, Integer.valueOf(b(i11, bArr)));
                return i11 + 4;
            } else {
                throw new i1("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new i1("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int i(byte[] bArr, int i10, w wVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return j(b10, bArr, i11, wVar);
        }
        wVar.f7749a = b10;
        return i11;
    }

    public static int j(int i10, byte[] bArr, int i11, w wVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i13 = b10 << 7;
        } else {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] < 0) {
                                i17 = i19;
                            } else {
                                wVar.f7749a = i18;
                                return i19;
                            }
                        }
                    }
                }
            }
            wVar.f7749a = i16 | i12;
            return i17;
        }
        wVar.f7749a = i14 | i13;
        return i15;
    }

    public static int k(int i10, byte[] bArr, int i11, int i12, f1 f1Var, w wVar) {
        d1 d1Var = (d1) f1Var;
        int i13 = i(bArr, i11, wVar);
        while (true) {
            d1Var.d(wVar.f7749a);
            if (i13 >= i12) {
                break;
            }
            int i14 = i(bArr, i13, wVar);
            if (i10 != wVar.f7749a) {
                break;
            }
            i13 = i(bArr, i14, wVar);
        }
        return i13;
    }

    public static int l(byte[] bArr, int i10, w wVar) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 >= 0) {
            wVar.f7750b = j10;
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
            int i15 = i14;
            b10 = b11;
            i12 = i15;
        }
        wVar.f7750b = j11;
        return i12;
    }

    public static int m(Object obj, m2 m2Var, byte[] bArr, int i10, int i11, int i12, w wVar) {
        int H = ((e2) m2Var).H(obj, bArr, i10, i11, i12, wVar);
        wVar.f7751c = obj;
        return H;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int n(java.lang.Object r6, i4.m2 r7, byte[] r8, int r9, int r10, i4.w r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = j(r9, r8, r0, r11)
            int r9 = r11.f7749a
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
            r0.g(r1, r2, r3, r4, r5)
            r11.f7751c = r6
            return r9
        L_0x001e:
            i4.i1 r6 = i4.i1.e()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.x.n(java.lang.Object, i4.m2, byte[], int, int, i4.w):int");
    }

    public static long o(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
