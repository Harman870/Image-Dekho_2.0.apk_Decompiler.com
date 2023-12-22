package i4;

public final class f0 extends g0 {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f7294c;

    /* renamed from: d  reason: collision with root package name */
    public int f7295d;

    /* renamed from: e  reason: collision with root package name */
    public int f7296e;

    /* renamed from: f  reason: collision with root package name */
    public int f7297f;

    /* renamed from: g  reason: collision with root package name */
    public int f7298g;

    /* renamed from: h  reason: collision with root package name */
    public int f7299h = Integer.MAX_VALUE;

    public /* synthetic */ f0(byte[] bArr, int i10) {
        this.f7294c = bArr;
        this.f7295d = i10;
        this.f7297f = 0;
    }

    public final int a(int i10) {
        if (i10 >= 0) {
            int i11 = i10 + this.f7297f;
            if (i11 >= 0) {
                int i12 = this.f7299h;
                if (i11 <= i12) {
                    this.f7299h = i11;
                    int i13 = this.f7295d + this.f7296e;
                    this.f7295d = i13;
                    if (i13 > i11) {
                        int i14 = i13 - i11;
                        this.f7296e = i14;
                        this.f7295d = i13 - i14;
                    } else {
                        this.f7296e = 0;
                    }
                    return i12;
                }
                throw i1.e();
            }
            throw i1.d();
        }
        throw i1.c();
    }

    public final int b() {
        if (c()) {
            this.f7298g = 0;
            return 0;
        }
        int i10 = i();
        this.f7298g = i10;
        if ((i10 >>> 3) != 0) {
            return i10;
        }
        throw new i1("Protocol message contained an invalid tag (zero).");
    }

    public final boolean c() {
        return this.f7297f == this.f7295d;
    }

    public final boolean d() {
        return k() != 0;
    }

    public final boolean e(int i10) {
        int i11;
        int b10;
        int i12 = i10 & 7;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 == 1) {
                i11 = 8;
            } else if (i12 == 2) {
                i11 = i();
            } else if (i12 == 3) {
                do {
                    b10 = b();
                    if (b10 == 0 || !e(b10)) {
                    }
                    b10 = b();
                    break;
                } while (!e(b10));
                if (this.f7298g == (((i10 >>> 3) << 3) | 4)) {
                    return true;
                }
                throw new i1("Protocol message end-group tag did not match expected tag.");
            } else if (i12 == 4) {
                return false;
            } else {
                if (i12 == 5) {
                    m(4);
                    return true;
                }
                int i14 = i1.f7378a;
                throw new h1();
            }
            m(i11);
            return true;
        }
        if (this.f7295d - this.f7297f >= 10) {
            while (i13 < 10) {
                byte[] bArr = this.f7294c;
                int i15 = this.f7297f;
                this.f7297f = i15 + 1;
                if (bArr[i15] < 0) {
                    i13++;
                }
            }
            throw new i1("CodedInputStream encountered a malformed varint.");
        }
        while (i13 < 10) {
            int i16 = this.f7297f;
            if (i16 != this.f7295d) {
                byte[] bArr2 = this.f7294c;
                this.f7297f = i16 + 1;
                if (bArr2[i16] < 0) {
                    i13++;
                }
            } else {
                throw i1.e();
            }
        }
        throw new i1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    public final int h() {
        int i10 = this.f7297f;
        if (this.f7295d - i10 >= 4) {
            byte[] bArr = this.f7294c;
            this.f7297f = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw i1.e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i() {
        /*
            r5 = this;
            int r0 = r5.f7297f
            int r1 = r5.f7295d
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f7294c
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f7297f = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f7297f = r1
            return r0
        L_0x006c:
            long r0 = r5.l()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.f0.i():int");
    }

    public final long j() {
        int i10 = this.f7297f;
        if (this.f7295d - i10 >= 8) {
            byte[] bArr = this.f7294c;
            this.f7297f = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }
        throw i1.e();
    }

    public final long k() {
        long j10;
        long j11;
        long j12;
        long j13;
        byte b10;
        int i10 = this.f7297f;
        int i11 = this.f7295d;
        if (i11 != i10) {
            byte[] bArr = this.f7294c;
            int i12 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                this.f7297f = i12;
                return (long) b11;
            } else if (i11 - i12 >= 9) {
                int i13 = i12 + 1;
                byte b12 = b11 ^ (bArr[i12] << 7);
                if (b12 < 0) {
                    b10 = b12 ^ Byte.MIN_VALUE;
                } else {
                    int i14 = i13 + 1;
                    byte b13 = b12 ^ (bArr[i13] << 14);
                    if (b13 >= 0) {
                        j11 = (long) (b13 ^ 16256);
                    } else {
                        i13 = i14 + 1;
                        byte b14 = b13 ^ (bArr[i14] << 21);
                        if (b14 < 0) {
                            b10 = b14 ^ -2080896;
                        } else {
                            i14 = i13 + 1;
                            long j14 = (((long) bArr[i13]) << 28) ^ ((long) b14);
                            if (j14 >= 0) {
                                j13 = 266354560;
                            } else {
                                int i15 = i14 + 1;
                                long j15 = j14 ^ (((long) bArr[i14]) << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i14 = i15 + 1;
                                    j14 = j15 ^ (((long) bArr[i15]) << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i15 = i14 + 1;
                                        j15 = j14 ^ (((long) bArr[i14]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i14 = i15 + 1;
                                            j11 = (j15 ^ (((long) bArr[i15]) << 56)) ^ 71499008037633920L;
                                            if (j11 < 0) {
                                                i15 = i14 + 1;
                                                if (((long) bArr[i14]) >= 0) {
                                                    j10 = j11;
                                                    i13 = i15;
                                                    this.f7297f = i13;
                                                    return j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j12 ^ j15;
                                i13 = i15;
                                this.f7297f = i13;
                                return j10;
                            }
                            j11 = j14 ^ j13;
                        }
                    }
                    i13 = i14;
                    j10 = j11;
                    this.f7297f = i13;
                    return j10;
                }
                j10 = (long) b10;
                this.f7297f = i13;
                return j10;
            }
        }
        return l();
    }

    public final long l() {
        long j10 = 0;
        int i10 = 0;
        while (i10 < 64) {
            int i11 = this.f7297f;
            if (i11 != this.f7295d) {
                byte[] bArr = this.f7294c;
                this.f7297f = i11 + 1;
                byte b10 = bArr[i11];
                j10 |= ((long) (b10 & Byte.MAX_VALUE)) << i10;
                if ((b10 & 128) == 0) {
                    return j10;
                }
                i10 += 7;
            } else {
                throw i1.e();
            }
        }
        throw new i1("CodedInputStream encountered a malformed varint.");
    }

    public final void m(int i10) {
        if (i10 >= 0) {
            int i11 = this.f7295d;
            int i12 = this.f7297f;
            if (i10 <= i11 - i12) {
                this.f7297f = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw i1.c();
        }
        throw i1.e();
    }
}
