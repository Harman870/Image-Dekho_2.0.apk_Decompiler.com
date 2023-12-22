package t9;

import androidx.activity.f;
import androidx.lifecycle.c0;
import com.ironsource.adapters.ironsource.a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class h implements Serializable, Comparable<h> {

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f12047d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e  reason: collision with root package name */
    public static final h f12048e = g(new byte[0]);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12049a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f12050b;

    /* renamed from: c  reason: collision with root package name */
    public transient String f12051c;

    public h(byte[] bArr) {
        this.f12049a = bArr;
    }

    public static h b(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (c(str.charAt(i11 + 1)) + (c(str.charAt(i11)) << 4));
            }
            return g(bArr);
        }
        throw new IllegalArgumentException(a.g("Unexpected hex string: ", str));
    }

    public static int c(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static h d(String str) {
        if (str != null) {
            h hVar = new h(str.getBytes(a0.f12033a));
            hVar.f12051c = str;
            return hVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static h g(byte... bArr) {
        if (bArr != null) {
            return new h((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        byte[] bArr = this.f12049a;
        byte[] bArr2 = c0.f1726j;
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int i12 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[i11] & 255) >> 2];
            int i13 = i12 + 1;
            int i14 = i11 + 1;
            bArr3[i12] = bArr2[((bArr[i11] & 3) << 4) | ((bArr[i14] & 255) >> 4)];
            int i15 = i13 + 1;
            int i16 = i11 + 2;
            bArr3[i13] = bArr2[((bArr[i14] & 15) << 2) | ((bArr[i16] & 255) >> 6)];
            i10 = i15 + 1;
            bArr3[i15] = bArr2[bArr[i16] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i17 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            int i18 = i17 + 1;
            bArr3[i17] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i18] = 61;
            bArr3[i18 + 1] = 61;
        } else if (length2 == 2) {
            int i19 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            int i20 = i19 + 1;
            int i21 = length + 1;
            bArr3[i19] = bArr2[((bArr[i21] & 255) >> 4) | ((bArr[length] & 3) << 4)];
            bArr3[i20] = bArr2[(bArr[i21] & 15) << 2];
            bArr3[i20 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r0 < r1) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r7 < r8) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            t9.h r10 = (t9.h) r10
            int r0 = r9.j()
            int r1 = r10.j()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0010:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.e(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.e(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0025:
            if (r7 >= r8) goto L_0x0029
        L_0x0027:
            r3 = r5
            goto L_0x0031
        L_0x0029:
            r3 = r6
            goto L_0x0031
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            if (r0 >= r1) goto L_0x0029
            goto L_0x0027
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.h.compareTo(java.lang.Object):int");
    }

    public byte e(int i10) {
        return this.f12049a[i10];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int j10 = hVar.j();
            byte[] bArr = this.f12049a;
            if (j10 == bArr.length && hVar.h(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.f12049a;
        char[] cArr = new char[(bArr.length * 2)];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f12047d;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean h(int i10, int i11, int i12, byte[] bArr) {
        boolean z9;
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f12049a;
        if (i10 > bArr2.length - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        Charset charset = a0.f12033a;
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                z9 = true;
                break;
            } else if (bArr2[i13 + i10] != bArr[i13 + i11]) {
                z9 = false;
                break;
            } else {
                i13++;
            }
        }
        return z9;
    }

    public int hashCode() {
        int i10 = this.f12050b;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f12049a);
        this.f12050b = hashCode;
        return hashCode;
    }

    public boolean i(h hVar, int i10) {
        return hVar.h(0, 0, i10, this.f12049a);
    }

    public int j() {
        return this.f12049a.length;
    }

    public h k() {
        byte[] bArr = this.f12049a;
        if (64 > bArr.length) {
            StringBuilder g10 = f.g("endIndex > length(");
            g10.append(this.f12049a.length);
            g10.append(")");
            throw new IllegalArgumentException(g10.toString());
        } else if (64 == bArr.length) {
            return this;
        } else {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new h(bArr2);
        }
    }

    public h l() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f12049a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 < 65 || b10 > 90) {
                i10++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new h(bArr2);
            }
        }
    }

    public String m() {
        String str = this.f12051c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f12049a, a0.f12033a);
        this.f12051c = str2;
        return str2;
    }

    public void n(e eVar) {
        byte[] bArr = this.f12049a;
        eVar.write(bArr, 0, bArr.length);
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f12049a.length == 0) {
            return "[size=0]";
        }
        String m2 = m();
        int length = m2.length();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = m2.length();
                break;
            } else if (i11 == 64) {
                break;
            } else {
                int codePointAt = m2.codePointAt(i10);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i11++;
                    i10 += Character.charCount(codePointAt);
                }
            }
        }
        i10 = -1;
        if (i10 == -1) {
            if (this.f12049a.length <= 64) {
                sb2 = f.g("[hex=");
                sb2.append(f());
                sb2.append("]");
            } else {
                sb2 = f.g("[size=");
                sb2.append(this.f12049a.length);
                sb2.append(" hex=");
                sb2.append(k().f());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = m2.substring(0, i10).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i10 < m2.length()) {
            sb = f.g("[size=");
            sb.append(this.f12049a.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }
}
