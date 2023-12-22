package m;

import androidx.lifecycle.c0;

public final class i<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f9302e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f9303a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f9304b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f9305c;

    /* renamed from: d  reason: collision with root package name */
    public int f9306d;

    public i() {
        this(10);
    }

    public i(int i10) {
        this.f9303a = false;
        if (i10 == 0) {
            this.f9304b = c0.f1721e;
            this.f9305c = c0.f1722f;
            return;
        }
        int i11 = i10 * 4;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f9304b = new int[i14];
        this.f9305c = new Object[i14];
    }

    public final void b(int i10, E e10) {
        int i11 = this.f9306d;
        if (i11 == 0 || i10 > this.f9304b[i11 - 1]) {
            if (this.f9303a && i11 >= this.f9304b.length) {
                d();
            }
            int i12 = this.f9306d;
            if (i12 >= this.f9304b.length) {
                int i13 = (i12 + 1) * 4;
                int i14 = 4;
                while (true) {
                    if (i14 >= 32) {
                        break;
                    }
                    int i15 = (1 << i14) - 12;
                    if (i13 <= i15) {
                        i13 = i15;
                        break;
                    }
                    i14++;
                }
                int i16 = i13 / 4;
                int[] iArr = new int[i16];
                Object[] objArr = new Object[i16];
                int[] iArr2 = this.f9304b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f9305c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f9304b = iArr;
                this.f9305c = objArr;
            }
            this.f9304b[i12] = i10;
            this.f9305c[i12] = e10;
            this.f9306d = i12 + 1;
            return;
        }
        f(i10, e10);
    }

    /* renamed from: c */
    public final i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f9304b = (int[]) this.f9304b.clone();
            iVar.f9305c = (Object[]) this.f9305c.clone();
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d() {
        int i10 = this.f9306d;
        int[] iArr = this.f9304b;
        Object[] objArr = this.f9305c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f9302e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f9303a = false;
        this.f9306d = i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f9305c[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(int r3, java.lang.Integer r4) {
        /*
            r2 = this;
            int[] r0 = r2.f9304b
            int r1 = r2.f9306d
            int r3 = androidx.lifecycle.c0.c(r1, r3, r0)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r0 = r2.f9305c
            r3 = r0[r3]
            java.lang.Object r0 = f9302e
            if (r3 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m.i.e(int, java.lang.Integer):java.lang.Object");
    }

    public final void f(int i10, E e10) {
        int c10 = c0.c(this.f9306d, i10, this.f9304b);
        if (c10 >= 0) {
            this.f9305c[c10] = e10;
            return;
        }
        int i11 = ~c10;
        int i12 = this.f9306d;
        if (i11 < i12) {
            Object[] objArr = this.f9305c;
            if (objArr[i11] == f9302e) {
                this.f9304b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f9303a && i12 >= this.f9304b.length) {
            d();
            i11 = ~c0.c(this.f9306d, i10, this.f9304b);
        }
        int i13 = this.f9306d;
        if (i13 >= this.f9304b.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] iArr = new int[i17];
            Object[] objArr2 = new Object[i17];
            int[] iArr2 = this.f9304b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f9305c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f9304b = iArr;
            this.f9305c = objArr2;
        }
        int i18 = this.f9306d - i11;
        if (i18 != 0) {
            int[] iArr3 = this.f9304b;
            int i19 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i19, i18);
            Object[] objArr4 = this.f9305c;
            System.arraycopy(objArr4, i11, objArr4, i19, this.f9306d - i11);
        }
        this.f9304b[i11] = i10;
        this.f9305c[i11] = e10;
        this.f9306d++;
    }

    public final int g() {
        if (this.f9303a) {
            d();
        }
        return this.f9306d;
    }

    public final E h(int i10) {
        if (this.f9303a) {
            d();
        }
        return this.f9305c[i10];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9306d * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f9306d; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            if (this.f9303a) {
                d();
            }
            sb.append(this.f9304b[i10]);
            sb.append('=');
            Object h10 = h(i10);
            if (h10 != this) {
                sb.append(h10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
