package i4;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class y2 {

    /* renamed from: f  reason: collision with root package name */
    public static final y2 f7804f = new y2(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f7805a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f7806b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f7807c;

    /* renamed from: d  reason: collision with root package name */
    public int f7808d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7809e;

    public y2() {
        this(0, new int[8], new Object[8], true);
    }

    public y2(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f7808d = -1;
        this.f7805a = i10;
        this.f7806b = iArr;
        this.f7807c = objArr;
        this.f7809e = z9;
    }

    public static y2 b() {
        return new y2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f7808d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f7805a; i15++) {
            int i16 = this.f7806b[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 == 1) {
                    ((Long) this.f7807c[i15]).longValue();
                    i12 = l0.C(i17 << 3) + 8;
                } else if (i18 == 2) {
                    int C = l0.C(i17 << 3);
                    int g10 = ((e0) this.f7807c[i15]).g();
                    i14 = l0.C(g10) + g10 + C + i14;
                } else if (i18 == 3) {
                    int B = l0.B(i17);
                    i11 = B + B;
                    i10 = ((y2) this.f7807c[i15]).a();
                } else if (i18 == 5) {
                    ((Integer) this.f7807c[i15]).intValue();
                    i12 = l0.C(i17 << 3) + 4;
                } else {
                    throw new IllegalStateException(i1.a());
                }
                i14 = i12 + i14;
            } else {
                long longValue = ((Long) this.f7807c[i15]).longValue();
                i11 = l0.C(i17 << 3);
                i10 = l0.D(longValue);
            }
            i14 = i10 + i11 + i14;
        }
        this.f7808d = i14;
        return i14;
    }

    public final void c(int i10, Object obj) {
        if (this.f7809e) {
            e(this.f7805a + 1);
            int[] iArr = this.f7806b;
            int i11 = this.f7805a;
            iArr[i11] = i10;
            this.f7807c[i11] = obj;
            this.f7805a = i11 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(m0 m0Var) {
        if (this.f7805a != 0) {
            for (int i10 = 0; i10 < this.f7805a; i10++) {
                int i11 = this.f7806b[i10];
                Object obj = this.f7807c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    m0Var.n(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    m0Var.j(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    m0Var.f(i12, (e0) obj);
                } else if (i13 == 3) {
                    m0Var.f7486a.Q(i12, 3);
                    ((y2) obj).d(m0Var);
                    m0Var.f7486a.Q(i12, 4);
                } else if (i13 == 5) {
                    m0Var.i(i12, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(i1.a());
                }
            }
        }
    }

    public final void e(int i10) {
        int[] iArr = this.f7806b;
        if (i10 > iArr.length) {
            int i11 = this.f7805a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f7806b = Arrays.copyOf(iArr, i10);
            this.f7807c = Arrays.copyOf(this.f7807c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        int i10 = this.f7805a;
        if (i10 == y2Var.f7805a) {
            int[] iArr = this.f7806b;
            int[] iArr2 = y2Var.f7806b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f7807c;
                    Object[] objArr2 = y2Var.f7807c;
                    int i12 = this.f7805a;
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
        int i10 = this.f7805a;
        int i11 = (i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f7806b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f7807c;
        int i16 = this.f7805a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
