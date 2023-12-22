package t9;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class w extends h {

    /* renamed from: f  reason: collision with root package name */
    public final transient byte[][] f12088f;

    /* renamed from: g  reason: collision with root package name */
    public final transient int[] f12089g;

    public w(e eVar, int i10) {
        super((byte[]) null);
        a0.a(eVar.f12045b, 0, (long) i10);
        u uVar = eVar.f12044a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = uVar.f12081c;
            int i15 = uVar.f12080b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                uVar = uVar.f12084f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f12088f = new byte[i13][];
        this.f12089g = new int[(i13 * 2)];
        u uVar2 = eVar.f12044a;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f12088f;
            bArr[i16] = uVar2.f12079a;
            int i17 = uVar2.f12081c;
            int i18 = uVar2.f12080b;
            int i19 = (i17 - i18) + i11;
            i11 = i19 > i10 ? i10 : i19;
            int[] iArr = this.f12089g;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            uVar2.f12082d = true;
            i16++;
            uVar2 = uVar2.f12084f;
        }
    }

    public final String a() {
        return p().a();
    }

    public final byte e(int i10) {
        a0.a((long) this.f12089g[this.f12088f.length - 1], (long) i10, 1);
        int o10 = o(i10);
        int i11 = o10 == 0 ? 0 : this.f12089g[o10 - 1];
        int[] iArr = this.f12089g;
        byte[][] bArr = this.f12088f;
        return bArr[o10][(i10 - i11) + iArr[bArr.length + o10]];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.j() == j() && i(hVar, j())) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return p().f();
    }

    public final boolean h(int i10, int i11, int i12, byte[] bArr) {
        if (i10 < 0 || i10 > j() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int o10 = o(i10);
        while (true) {
            boolean z9 = true;
            if (i12 <= 0) {
                return true;
            }
            int i13 = o10 == 0 ? 0 : this.f12089g[o10 - 1];
            int min = Math.min(i12, ((this.f12089g[o10] - i13) + i13) - i10);
            int[] iArr = this.f12089g;
            byte[][] bArr2 = this.f12088f;
            int i14 = (i10 - i13) + iArr[bArr2.length + o10];
            byte[] bArr3 = bArr2[o10];
            Charset charset = a0.f12033a;
            int i15 = 0;
            while (true) {
                if (i15 >= min) {
                    break;
                } else if (bArr3[i15 + i14] != bArr[i15 + i11]) {
                    z9 = false;
                    break;
                } else {
                    i15++;
                }
            }
            if (!z9) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            o10++;
        }
    }

    public final int hashCode() {
        int i10 = this.f12050b;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f12088f.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f12088f[i11];
            int[] iArr = this.f12089g;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f12050b = i12;
        return i12;
    }

    public final boolean i(h hVar, int i10) {
        if (j() - i10 < 0) {
            return false;
        }
        int o10 = o(0);
        int i11 = 0;
        int i12 = 0;
        while (i10 > 0) {
            int i13 = o10 == 0 ? 0 : this.f12089g[o10 - 1];
            int min = Math.min(i10, ((this.f12089g[o10] - i13) + i13) - i11);
            int[] iArr = this.f12089g;
            byte[][] bArr = this.f12088f;
            if (!hVar.h(i12, (i11 - i13) + iArr[bArr.length + o10], min, bArr[o10])) {
                return false;
            }
            i11 += min;
            i12 += min;
            i10 -= min;
            o10++;
        }
        return true;
    }

    public final int j() {
        return this.f12089g[this.f12088f.length - 1];
    }

    public final h k() {
        return p().k();
    }

    public final h l() {
        return p().l();
    }

    public final String m() {
        return p().m();
    }

    public final void n(e eVar) {
        int length = this.f12088f.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f12089g;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            u uVar = new u(this.f12088f[i10], i12, (i12 + i13) - i11);
            u uVar2 = eVar.f12044a;
            if (uVar2 == null) {
                uVar.f12085g = uVar;
                uVar.f12084f = uVar;
                eVar.f12044a = uVar;
            } else {
                uVar2.f12085g.b(uVar);
            }
            i10++;
            i11 = i13;
        }
        eVar.f12045b += (long) i11;
    }

    public final int o(int i10) {
        int binarySearch = Arrays.binarySearch(this.f12089g, 0, this.f12088f.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public final h p() {
        int[] iArr = this.f12089g;
        byte[][] bArr = this.f12088f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f12089g;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f12088f[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return new h(bArr2);
    }

    public final String toString() {
        return p().toString();
    }
}
