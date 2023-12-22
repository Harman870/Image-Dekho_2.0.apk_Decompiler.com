package t9;

import androidx.activity.f;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f12043c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public u f12044a;

    /* renamed from: b  reason: collision with root package name */
    public long f12045b;

    public class a extends InputStream {
        public a() {
        }

        public final int available() {
            return (int) Math.min(e.this.f12045b, 2147483647L);
        }

        public final void close() {
        }

        public final int read() {
            e eVar = e.this;
            if (eVar.f12045b > 0) {
                return eVar.readByte() & 255;
            }
            return -1;
        }

        public final int read(byte[] bArr, int i10, int i11) {
            return e.this.read(bArr, i10, i11);
        }

        public final String toString() {
            return e.this + ".inputStream()";
        }
    }

    public final long A(byte b10, long j10, long j11) {
        u uVar;
        long j12 = 0;
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f12045b), Long.valueOf(j10), Long.valueOf(j11)}));
        }
        long j13 = this.f12045b;
        long j14 = j11 > j13 ? j13 : j11;
        if (j10 == j14 || (uVar = this.f12044a) == null) {
            return -1;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                uVar = uVar.f12085g;
                j13 -= (long) (uVar.f12081c - uVar.f12080b);
            }
        } else {
            while (true) {
                long j15 = ((long) (uVar.f12081c - uVar.f12080b)) + j12;
                if (j15 >= j10) {
                    break;
                }
                uVar = uVar.f12084f;
                j12 = j15;
            }
            j13 = j12;
        }
        long j16 = j10;
        while (j13 < j14) {
            byte[] bArr = uVar.f12079a;
            int min = (int) Math.min((long) uVar.f12081c, (((long) uVar.f12080b) + j14) - j13);
            for (int i10 = (int) ((((long) uVar.f12080b) + j16) - j13); i10 < min; i10++) {
                if (bArr[i10] == b10) {
                    return ((long) (i10 - uVar.f12080b)) + j13;
                }
            }
            byte b11 = b10;
            j13 += (long) (uVar.f12081c - uVar.f12080b);
            uVar = uVar.f12084f;
            j16 = j13;
        }
        return -1;
    }

    public final void D(long j10) {
        if (this.f12045b < j10) {
            throw new EOFException();
        }
    }

    public final byte[] E(long j10) {
        a0.a(this.f12045b, 0, j10);
        if (j10 <= 2147483647L) {
            int i10 = (int) j10;
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = read(bArr, i11, i10 - i11);
                if (read != -1) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    public final f F(String str) {
        W(0, str.length(), str);
        return this;
    }

    public final /* bridge */ /* synthetic */ f G(long j10) {
        S(j10);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0086, code lost:
        if (r8 != r9) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        r14.f12044a = r6.a();
        t9.v.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        r6.f12080b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r1 != false) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long H() {
        /*
            r14 = this;
            long r0 = r14.f12045b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a1
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            t9.u r6 = r14.f12044a
            byte[] r7 = r6.f12079a
            int r8 = r6.f12080b
            int r9 = r6.f12081c
        L_0x0013:
            if (r8 >= r9) goto L_0x0086
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x0039
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002d
            int r11 = r10 + -97
            goto L_0x0037
        L_0x002d:
            r11 = 65
            if (r10 < r11) goto L_0x006b
            r11 = 70
            if (r10 > r11) goto L_0x006b
            int r11 = r10 + -65
        L_0x0037:
            int r11 = r11 + 10
        L_0x0039:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0049
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0049:
            t9.e r0 = new t9.e
            r0.<init>()
            r0.T(r4)
            r0.R(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = androidx.activity.f.g(r2)
            java.lang.String r0 = r0.M()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006b:
            if (r0 == 0) goto L_0x006f
            r1 = 1
            goto L_0x0086
        L_0x006f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = androidx.activity.f.g(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0086:
            if (r8 != r9) goto L_0x0092
            t9.u r7 = r6.a()
            r14.f12044a = r7
            t9.v.a(r6)
            goto L_0x0094
        L_0x0092:
            r6.f12080b = r8
        L_0x0094:
            if (r1 != 0) goto L_0x009a
            t9.u r6 = r14.f12044a
            if (r6 != 0) goto L_0x000b
        L_0x009a:
            long r1 = r14.f12045b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f12045b = r1
            return r4
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.e.H():long");
    }

    public final int I(r rVar) {
        int O = O(rVar, false);
        if (O == -1) {
            return -1;
        }
        try {
            skip((long) rVar.f12070a[O].j());
            return O;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public final String J(Charset charset) {
        try {
            return L(this.f12045b, charset);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final InputStream K() {
        return new a();
    }

    public final String L(long j10, Charset charset) {
        a0.a(this.f12045b, 0, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
        } else if (j10 == 0) {
            return "";
        } else {
            u uVar = this.f12044a;
            int i10 = uVar.f12080b;
            if (((long) i10) + j10 > ((long) uVar.f12081c)) {
                return new String(E(j10), charset);
            }
            String str = new String(uVar.f12079a, i10, (int) j10, charset);
            int i11 = (int) (((long) uVar.f12080b) + j10);
            uVar.f12080b = i11;
            this.f12045b -= j10;
            if (i11 == uVar.f12081c) {
                this.f12044a = uVar.a();
                v.a(uVar);
            }
            return str;
        }
    }

    public final String M() {
        try {
            return L(this.f12045b, a0.f12033a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String N(long j10) {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (v(j11) == 13) {
                String L = L(j11, a0.f12033a);
                skip(2);
                return L;
            }
        }
        String L2 = L(j10, a0.f12033a);
        skip(1);
        return L2;
    }

    public final int O(r rVar, boolean z9) {
        int i10;
        int i11;
        int i12;
        u uVar;
        int i13;
        r rVar2 = rVar;
        u uVar2 = this.f12044a;
        int i14 = -2;
        if (uVar2 != null) {
            byte[] bArr = uVar2.f12079a;
            int i15 = uVar2.f12080b;
            int i16 = uVar2.f12081c;
            int[] iArr = rVar2.f12071b;
            u uVar3 = uVar2;
            int i17 = 0;
            int i18 = -1;
            loop0:
            while (true) {
                int i19 = i17 + 1;
                int i20 = iArr[i17];
                int i21 = i19 + 1;
                int i22 = iArr[i19];
                if (i22 != -1) {
                    i18 = i22;
                }
                if (uVar3 == null) {
                    break;
                }
                if (i20 < 0) {
                    int i23 = (i20 * -1) + i21;
                    while (true) {
                        int i24 = i15 + 1;
                        int i25 = i21 + 1;
                        if ((bArr[i15] & 255) != iArr[i21]) {
                            return i18;
                        }
                        boolean z10 = i25 == i23;
                        if (i24 == i16) {
                            u uVar4 = uVar3.f12084f;
                            i13 = uVar4.f12080b;
                            byte[] bArr2 = uVar4.f12079a;
                            i12 = uVar4.f12081c;
                            if (uVar4 != uVar2) {
                                byte[] bArr3 = bArr2;
                                uVar = uVar4;
                                bArr = bArr3;
                            } else if (!z10) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                uVar = null;
                            }
                        } else {
                            u uVar5 = uVar3;
                            i12 = i16;
                            i13 = i24;
                            uVar = uVar5;
                        }
                        if (z10) {
                            i10 = iArr[i25];
                            i11 = i13;
                            i16 = i12;
                            uVar3 = uVar;
                            break;
                        }
                        i15 = i13;
                        i16 = i12;
                        i21 = i25;
                        uVar3 = uVar;
                    }
                } else {
                    int i26 = i15 + 1;
                    byte b10 = bArr[i15] & 255;
                    int i27 = i21 + i20;
                    while (i21 != i27) {
                        if (b10 == iArr[i21]) {
                            i10 = iArr[i21 + i20];
                            if (i26 == i16) {
                                uVar3 = uVar3.f12084f;
                                i11 = uVar3.f12080b;
                                bArr = uVar3.f12079a;
                                i16 = uVar3.f12081c;
                                if (uVar3 == uVar2) {
                                    uVar3 = null;
                                }
                            } else {
                                i11 = i26;
                            }
                        } else {
                            i21++;
                        }
                    }
                    return i18;
                }
                if (i10 >= 0) {
                    return i10;
                }
                i17 = -i10;
                i15 = i11;
                i14 = -2;
            }
            return z9 ? i14 : i18;
        } else if (z9) {
            return -2;
        } else {
            return rVar2.indexOf(h.f12048e);
        }
    }

    public final u P(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException();
        }
        u uVar = this.f12044a;
        if (uVar == null) {
            u b10 = v.b();
            this.f12044a = b10;
            b10.f12085g = b10;
            b10.f12084f = b10;
            return b10;
        }
        u uVar2 = uVar.f12085g;
        if (uVar2.f12081c + i10 <= 8192 && uVar2.f12083e) {
            return uVar2;
        }
        u b11 = v.b();
        uVar2.b(b11);
        return b11;
    }

    public final void Q(h hVar) {
        if (hVar != null) {
            hVar.n(this);
            return;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public final void R(int i10) {
        u P = P(1);
        byte[] bArr = P.f12079a;
        int i11 = P.f12081c;
        P.f12081c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f12045b++;
    }

    public final e S(long j10) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            R(48);
            return this;
        }
        boolean z9 = false;
        int i11 = 1;
        if (i10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                W(0, 20, "-9223372036854775808");
                return this;
            }
            z9 = true;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 < 100) {
                    if (j10 >= 10) {
                        i11 = 2;
                    }
                } else if (j10 < 1000) {
                    i11 = 3;
                } else {
                    i11 = 4;
                }
            } else if (j10 < 1000000) {
                if (j10 < 100000) {
                    i11 = 5;
                } else {
                    i11 = 6;
                }
            } else if (j10 < 10000000) {
                i11 = 7;
            } else {
                i11 = 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < 10000000000L) {
                if (j10 < 1000000000) {
                    i11 = 9;
                } else {
                    i11 = 10;
                }
            } else if (j10 < 100000000000L) {
                i11 = 11;
            } else {
                i11 = 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i11 = 13;
            } else if (j10 < 100000000000000L) {
                i11 = 14;
            } else {
                i11 = 15;
            }
        } else if (j10 < 100000000000000000L) {
            if (j10 < 10000000000000000L) {
                i11 = 16;
            } else {
                i11 = 17;
            }
        } else if (j10 < 1000000000000000000L) {
            i11 = 18;
        } else {
            i11 = 19;
        }
        if (z9) {
            i11++;
        }
        u P = P(i11);
        byte[] bArr = P.f12079a;
        int i12 = P.f12081c + i11;
        while (j10 != 0) {
            i12--;
            bArr[i12] = f12043c[(int) (j10 % 10)];
            j10 /= 10;
        }
        if (z9) {
            bArr[i12 - 1] = 45;
        }
        P.f12081c += i11;
        this.f12045b += (long) i11;
        return this;
    }

    public final e T(long j10) {
        if (j10 == 0) {
            R(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        u P = P(numberOfTrailingZeros);
        byte[] bArr = P.f12079a;
        int i10 = P.f12081c;
        int i11 = i10 + numberOfTrailingZeros;
        while (true) {
            i11--;
            if (i11 >= i10) {
                bArr[i11] = f12043c[(int) (15 & j10)];
                j10 >>>= 4;
            } else {
                P.f12081c += numberOfTrailingZeros;
                this.f12045b += (long) numberOfTrailingZeros;
                return this;
            }
        }
    }

    public final void U(int i10) {
        u P = P(4);
        byte[] bArr = P.f12079a;
        int i11 = P.f12081c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        P.f12081c = i14 + 1;
        this.f12045b += 4;
    }

    public final void V(int i10) {
        u P = P(2);
        byte[] bArr = P.f12079a;
        int i11 = P.f12081c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        P.f12081c = i12 + 1;
        this.f12045b += 2;
    }

    public final void W(int i10, int i11, String str) {
        int i12;
        char c10;
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i10 < 0) {
            throw new IllegalArgumentException(androidx.activity.e.a("beginIndex < 0: ", i10));
        } else if (i11 < i10) {
            throw new IllegalArgumentException(f.f("endIndex < beginIndex: ", i11, " < ", i10));
        } else if (i11 <= str.length()) {
            while (i10 < i11) {
                char charAt2 = str.charAt(i10);
                if (charAt2 < 128) {
                    u P = P(1);
                    byte[] bArr = P.f12079a;
                    int i13 = P.f12081c - i10;
                    int min = Math.min(i11, 8192 - i13);
                    int i14 = i10 + 1;
                    bArr[i10 + i13] = (byte) charAt2;
                    while (true) {
                        i10 = i14;
                        if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                            int i15 = P.f12081c;
                            int i16 = (i13 + i10) - i15;
                            P.f12081c = i15 + i16;
                            this.f12045b += (long) i16;
                        } else {
                            i14 = i10 + 1;
                            bArr[i10 + i13] = (byte) charAt;
                        }
                    }
                    int i152 = P.f12081c;
                    int i162 = (i13 + i10) - i152;
                    P.f12081c = i152 + i162;
                    this.f12045b += (long) i162;
                } else {
                    if (charAt2 < 2048) {
                        i12 = (charAt2 >> 6) | 192;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        R((charAt2 >> 12) | 224);
                        i12 = ((charAt2 >> 6) & 63) | 128;
                    } else {
                        int i17 = i10 + 1;
                        if (i17 < i11) {
                            c10 = str.charAt(i17);
                        } else {
                            c10 = 0;
                        }
                        if (charAt2 > 56319 || c10 < 56320 || c10 > 57343) {
                            R(63);
                            i10 = i17;
                        } else {
                            int i18 = (((charAt2 & 10239) << 10) | (9215 & c10)) + 0;
                            R((i18 >> 18) | 240);
                            R(((i18 >> 12) & 63) | 128);
                            R(((i18 >> 6) & 63) | 128);
                            R((i18 & 63) | 128);
                            i10 += 2;
                        }
                    }
                    R(i12);
                    R((charAt2 & '?') | 128);
                    i10++;
                }
            }
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        }
    }

    public final void X(int i10) {
        int i11;
        int i12;
        if (i10 >= 128) {
            if (i10 < 2048) {
                i11 = (i10 >> 6) | 192;
            } else {
                if (i10 < 65536) {
                    if (i10 < 55296 || i10 > 57343) {
                        i12 = (i10 >> 12) | 224;
                    } else {
                        R(63);
                        return;
                    }
                } else if (i10 <= 1114111) {
                    R((i10 >> 18) | 240);
                    i12 = ((i10 >> 12) & 63) | 128;
                } else {
                    StringBuilder g10 = f.g("Unexpected code point: ");
                    g10.append(Integer.toHexString(i10));
                    throw new IllegalArgumentException(g10.toString());
                }
                R(i12);
                i11 = ((i10 >> 6) & 63) | 128;
            }
            R(i11);
            i10 = (i10 & 63) | 128;
        }
        R(i10);
    }

    public final h b(long j10) {
        return new h(E(j10));
    }

    public final void c() {
        try {
            skip(this.f12045b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final Object clone() {
        e eVar = new e();
        if (this.f12045b != 0) {
            u c10 = this.f12044a.c();
            eVar.f12044a = c10;
            c10.f12085g = c10;
            c10.f12084f = c10;
            u uVar = this.f12044a;
            while (true) {
                uVar = uVar.f12084f;
                if (uVar == this.f12044a) {
                    break;
                }
                eVar.f12044a.f12085g.b(uVar.c());
            }
            eVar.f12045b = this.f12045b;
        }
        return eVar;
    }

    public final void close() {
    }

    public final e d() {
        return this;
    }

    public final z e() {
        return z.f12090d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        long j10 = this.f12045b;
        if (j10 != eVar.f12045b) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        u uVar = this.f12044a;
        u uVar2 = eVar.f12044a;
        int i10 = uVar.f12080b;
        int i11 = uVar2.f12080b;
        while (j11 < this.f12045b) {
            long min = (long) Math.min(uVar.f12081c - i10, uVar2.f12081c - i11);
            int i12 = 0;
            while (((long) i12) < min) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (uVar.f12079a[i10] != uVar2.f12079a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == uVar.f12081c) {
                uVar = uVar.f12084f;
                i10 = uVar.f12080b;
            }
            if (i11 == uVar2.f12081c) {
                uVar2 = uVar2.f12084f;
                i11 = uVar2.f12080b;
            }
            j11 += min;
        }
        return true;
    }

    public final void flush() {
    }

    public final void g(e eVar, long j10) {
        u uVar;
        u uVar2;
        int i10;
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (eVar != this) {
            a0.a(eVar.f12045b, 0, j10);
            while (j10 > 0) {
                u uVar3 = eVar.f12044a;
                int i11 = uVar3.f12081c - uVar3.f12080b;
                int i12 = 0;
                if (j10 < ((long) i11)) {
                    u uVar4 = this.f12044a;
                    if (uVar4 != null) {
                        uVar = uVar4.f12085g;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null && uVar.f12083e) {
                        long j11 = ((long) uVar.f12081c) + j10;
                        if (uVar.f12082d) {
                            i10 = 0;
                        } else {
                            i10 = uVar.f12080b;
                        }
                        if (j11 - ((long) i10) <= 8192) {
                            uVar3.d(uVar, (int) j10);
                            eVar.f12045b -= j10;
                            this.f12045b += j10;
                            return;
                        }
                    }
                    int i13 = (int) j10;
                    if (i13 <= 0 || i13 > i11) {
                        throw new IllegalArgumentException();
                    }
                    if (i13 >= 1024) {
                        uVar2 = uVar3.c();
                    } else {
                        uVar2 = v.b();
                        System.arraycopy(uVar3.f12079a, uVar3.f12080b, uVar2.f12079a, 0, i13);
                    }
                    uVar2.f12081c = uVar2.f12080b + i13;
                    uVar3.f12080b += i13;
                    uVar3.f12085g.b(uVar2);
                    eVar.f12044a = uVar2;
                }
                u uVar5 = eVar.f12044a;
                long j12 = (long) (uVar5.f12081c - uVar5.f12080b);
                eVar.f12044a = uVar5.a();
                u uVar6 = this.f12044a;
                if (uVar6 == null) {
                    this.f12044a = uVar5;
                    uVar5.f12085g = uVar5;
                    uVar5.f12084f = uVar5;
                } else {
                    uVar6.f12085g.b(uVar5);
                    u uVar7 = uVar5.f12085g;
                    if (uVar7 == uVar5) {
                        throw new IllegalStateException();
                    } else if (uVar7.f12083e) {
                        int i14 = uVar5.f12081c - uVar5.f12080b;
                        int i15 = 8192 - uVar7.f12081c;
                        if (!uVar7.f12082d) {
                            i12 = uVar7.f12080b;
                        }
                        if (i14 <= i15 + i12) {
                            uVar5.d(uVar7, i14);
                            uVar5.a();
                            v.a(uVar5);
                        }
                    }
                }
                eVar.f12045b -= j12;
                this.f12045b += j12;
                j10 -= j12;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final int hashCode() {
        u uVar = this.f12044a;
        if (uVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = uVar.f12081c;
            for (int i12 = uVar.f12080b; i12 < i11; i12++) {
                i10 = (i10 * 31) + uVar.f12079a[i12];
            }
            uVar = uVar.f12084f;
        } while (uVar != this.f12044a);
        return i10;
    }

    public final /* bridge */ /* synthetic */ f i(long j10) {
        T(j10);
        return this;
    }

    public final boolean isOpen() {
        return true;
    }

    public final long j() {
        long j10 = this.f12045b;
        if (j10 == 0) {
            return 0;
        }
        u uVar = this.f12044a.f12085g;
        int i10 = uVar.f12081c;
        return (i10 >= 8192 || !uVar.f12083e) ? j10 : j10 - ((long) (i10 - uVar.f12080b));
    }

    public final String l() {
        return w(Long.MAX_VALUE);
    }

    public final void o(e eVar, long j10, long j11) {
        if (eVar != null) {
            a0.a(this.f12045b, j10, j11);
            if (j11 != 0) {
                eVar.f12045b += j11;
                u uVar = this.f12044a;
                while (true) {
                    long j12 = (long) (uVar.f12081c - uVar.f12080b);
                    if (j10 < j12) {
                        break;
                    }
                    j10 -= j12;
                    uVar = uVar.f12084f;
                }
                while (j11 > 0) {
                    u c10 = uVar.c();
                    int i10 = (int) (((long) c10.f12080b) + j10);
                    c10.f12080b = i10;
                    c10.f12081c = Math.min(i10 + ((int) j11), c10.f12081c);
                    u uVar2 = eVar.f12044a;
                    if (uVar2 == null) {
                        c10.f12085g = c10;
                        c10.f12084f = c10;
                        eVar.f12044a = c10;
                    } else {
                        uVar2.f12085g.b(c10);
                    }
                    j11 -= (long) (c10.f12081c - c10.f12080b);
                    uVar = uVar.f12084f;
                    j10 = 0;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final boolean p() {
        return this.f12045b == 0;
    }

    public final int read(ByteBuffer byteBuffer) {
        u uVar = this.f12044a;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f12081c - uVar.f12080b);
        byteBuffer.put(uVar.f12079a, uVar.f12080b, min);
        int i10 = uVar.f12080b + min;
        uVar.f12080b = i10;
        this.f12045b -= (long) min;
        if (i10 == uVar.f12081c) {
            this.f12044a = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        a0.a((long) bArr.length, (long) i10, (long) i11);
        u uVar = this.f12044a;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i11, uVar.f12081c - uVar.f12080b);
        System.arraycopy(uVar.f12079a, uVar.f12080b, bArr, i10, min);
        int i12 = uVar.f12080b + min;
        uVar.f12080b = i12;
        this.f12045b -= (long) min;
        if (i12 == uVar.f12081c) {
            this.f12044a = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    public final byte readByte() {
        long j10 = this.f12045b;
        if (j10 != 0) {
            u uVar = this.f12044a;
            int i10 = uVar.f12080b;
            int i11 = uVar.f12081c;
            int i12 = i10 + 1;
            byte b10 = uVar.f12079a[i10];
            this.f12045b = j10 - 1;
            if (i12 == i11) {
                this.f12044a = uVar.a();
                v.a(uVar);
            } else {
                uVar.f12080b = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    public final int readInt() {
        long j10 = this.f12045b;
        if (j10 >= 4) {
            u uVar = this.f12044a;
            int i10 = uVar.f12080b;
            int i11 = uVar.f12081c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = uVar.f12079a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i14 = i13 + 1;
            byte b11 = b10 | ((bArr[i13] & 255) << 8);
            int i15 = i14 + 1;
            byte b12 = b11 | (bArr[i14] & 255);
            this.f12045b = j10 - 4;
            if (i15 == i11) {
                this.f12044a = uVar.a();
                v.a(uVar);
            } else {
                uVar.f12080b = i15;
            }
            return b12;
        }
        StringBuilder g10 = f.g("size < 4: ");
        g10.append(this.f12045b);
        throw new IllegalStateException(g10.toString());
    }

    public final short readShort() {
        long j10 = this.f12045b;
        if (j10 >= 2) {
            u uVar = this.f12044a;
            int i10 = uVar.f12080b;
            int i11 = uVar.f12081c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = uVar.f12079a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            this.f12045b = j10 - 2;
            if (i13 == i11) {
                this.f12044a = uVar.a();
                v.a(uVar);
            } else {
                uVar.f12080b = i13;
            }
            return (short) b10;
        }
        StringBuilder g10 = f.g("size < 2: ");
        g10.append(this.f12045b);
        throw new IllegalStateException(g10.toString());
    }

    public final void skip(long j10) {
        while (j10 > 0) {
            u uVar = this.f12044a;
            if (uVar != null) {
                int min = (int) Math.min(j10, (long) (uVar.f12081c - uVar.f12080b));
                long j11 = (long) min;
                this.f12045b -= j11;
                j10 -= j11;
                u uVar2 = this.f12044a;
                int i10 = uVar2.f12080b + min;
                uVar2.f12080b = i10;
                if (i10 == uVar2.f12081c) {
                    this.f12044a = uVar2.a();
                    v.a(uVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final String toString() {
        h hVar;
        long j10 = this.f12045b;
        if (j10 <= 2147483647L) {
            int i10 = (int) j10;
            if (i10 == 0) {
                hVar = h.f12048e;
            } else {
                hVar = new w(this, i10);
            }
            return hVar.toString();
        }
        StringBuilder g10 = f.g("size > Integer.MAX_VALUE: ");
        g10.append(this.f12045b);
        throw new IllegalArgumentException(g10.toString());
    }

    public final byte v(long j10) {
        int i10;
        a0.a(this.f12045b, j10, 1);
        long j11 = this.f12045b;
        if (j11 - j10 > j10) {
            u uVar = this.f12044a;
            while (true) {
                int i11 = uVar.f12081c;
                int i12 = uVar.f12080b;
                long j12 = (long) (i11 - i12);
                if (j10 < j12) {
                    return uVar.f12079a[i12 + ((int) j10)];
                }
                j10 -= j12;
                uVar = uVar.f12084f;
            }
        } else {
            long j13 = j10 - j11;
            u uVar2 = this.f12044a;
            do {
                uVar2 = uVar2.f12085g;
                int i13 = uVar2.f12081c;
                i10 = uVar2.f12080b;
                j13 += (long) (i13 - i10);
            } while (j13 < 0);
            return uVar2.f12079a[i10 + ((int) j13)];
        }
    }

    public final String w(long j10) {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long A = A((byte) 10, 0, j11);
            if (A != -1) {
                return N(A);
            }
            if (j11 < this.f12045b && v(j11 - 1) == 13 && v(j11) == 10) {
                return N(j11);
            }
            e eVar = new e();
            o(eVar, 0, Math.min(32, this.f12045b));
            StringBuilder g10 = f.g("\\n not found: limit=");
            g10.append(Math.min(this.f12045b, j10));
            g10.append(" content=");
            try {
                g10.append(new h(eVar.E(eVar.f12045b)).f());
                g10.append(8230);
                throw new EOFException(g10.toString());
            } catch (EOFException e10) {
                throw new AssertionError(e10);
            }
        } else {
            throw new IllegalArgumentException("limit < 0: " + j10);
        }
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                u P = P(1);
                int min = Math.min(i10, 8192 - P.f12081c);
                byteBuffer.get(P.f12079a, P.f12081c, min);
                i10 -= min;
                P.f12081c += min;
            }
            this.f12045b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final f write(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void write(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = (long) i11;
            a0.a((long) bArr.length, (long) i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                u P = P(1);
                int min = Math.min(i12 - i10, 8192 - P.f12081c);
                System.arraycopy(bArr, i10, P.f12079a, P.f12081c, min);
                i10 += min;
                P.f12081c += min;
            }
            this.f12045b += j10;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final /* bridge */ /* synthetic */ f writeByte(int i10) {
        R(i10);
        return this;
    }

    public final /* bridge */ /* synthetic */ f writeInt(int i10) {
        U(i10);
        return this;
    }

    public final /* bridge */ /* synthetic */ f writeShort(int i10) {
        V(i10);
        return this;
    }

    public final long x(e eVar) {
        long j10 = this.f12045b;
        if (j10 > 0) {
            eVar.g(this, j10);
        }
        return j10;
    }

    public final /* bridge */ /* synthetic */ f y(h hVar) {
        Q(hVar);
        return this;
    }

    public final long z(e eVar, long j10) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j10 >= 0) {
            long j11 = this.f12045b;
            if (j11 == 0) {
                return -1;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            eVar.g(this, j10);
            return j10;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
    }
}
