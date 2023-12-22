package j4;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.logging.Logger;

public final class k9 {

    /* renamed from: f  reason: collision with root package name */
    public static final k9 f8298f = new k9(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f8299a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f8300b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f8301c;

    /* renamed from: d  reason: collision with root package name */
    public int f8302d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8303e;

    public k9() {
        this(0, new int[8], new Object[8], true);
    }

    public k9(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f8302d = -1;
        this.f8299a = i10;
        this.f8300b = iArr;
        this.f8301c = objArr;
        this.f8303e = z9;
    }

    public static k9 b() {
        return new k9(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f8302d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f8299a; i15++) {
            int i16 = this.f8300b[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 == 1) {
                    ((Long) this.f8301c[i15]).longValue();
                    i10 = u6.m0(i17 << 3) + 8;
                } else if (i18 == 2) {
                    Logger logger = u6.f8492x;
                    int g10 = ((q6) this.f8301c[i15]).g();
                    i10 = u6.m0(i17 << 3) + u6.m0(g10) + g10;
                } else if (i18 == 3) {
                    int i19 = i17 << 3;
                    Logger logger2 = u6.f8492x;
                    i11 = ((k9) this.f8301c[i15]).a();
                    int m02 = u6.m0(i19);
                    i12 = m02 + m02;
                } else if (i18 == 5) {
                    ((Integer) this.f8301c[i15]).intValue();
                    i10 = u6.m0(i17 << 3) + 4;
                } else {
                    int i20 = u7.f8494a;
                    throw new IllegalStateException(new t7());
                }
                i14 += i10;
            } else {
                int i21 = i17 << 3;
                i11 = u6.n0(((Long) this.f8301c[i15]).longValue());
                i12 = u6.m0(i21);
            }
            i10 = i12 + i11;
            i14 += i10;
        }
        this.f8302d = i14;
        return i14;
    }

    public final void c(int i10, Object obj) {
        if (this.f8303e) {
            e(this.f8299a + 1);
            int[] iArr = this.f8300b;
            int i11 = this.f8299a;
            iArr[i11] = i10;
            this.f8301c[i11] = obj;
            this.f8299a = i11 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(v6 v6Var) {
        if (this.f8299a != 0) {
            for (int i10 = 0; i10 < this.f8299a; i10++) {
                int i11 = this.f8300b[i10];
                Object obj = this.f8301c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    v6Var.n(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    v6Var.j(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    v6Var.f(i13, (q6) obj);
                } else if (i12 == 3) {
                    v6Var.f8509a.e0(i13, 3);
                    ((k9) obj).d(v6Var);
                    v6Var.f8509a.e0(i13, 4);
                } else if (i12 == 5) {
                    v6Var.i(i13, ((Integer) obj).intValue());
                } else {
                    int i14 = u7.f8494a;
                    throw new RuntimeException(new t7());
                }
            }
        }
    }

    public final void e(int i10) {
        int[] iArr = this.f8300b;
        if (i10 > iArr.length) {
            int i11 = this.f8299a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f8300b = Arrays.copyOf(iArr, i10);
            this.f8301c = Arrays.copyOf(this.f8301c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k9)) {
            return false;
        }
        k9 k9Var = (k9) obj;
        int i10 = this.f8299a;
        if (i10 == k9Var.f8299a) {
            int[] iArr = this.f8300b;
            int[] iArr2 = k9Var.f8300b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f8301c;
                    Object[] objArr2 = k9Var.f8301c;
                    int i12 = this.f8299a;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (objArr[i13].equals(objArr2[i13])) {
                            i13++;
                        }
                    }
                    return true;
                } else if (iArr[i11] != iArr2[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f8299a;
        int i11 = i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.f8300b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 * 31) + i13;
        Object[] objArr = this.f8301c;
        int i16 = this.f8299a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + i12;
    }
}
