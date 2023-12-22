package m;

import androidx.lifecycle.c0;

public final class e<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f9270e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f9271a = false;

    /* renamed from: b  reason: collision with root package name */
    public long[] f9272b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f9273c;

    /* renamed from: d  reason: collision with root package name */
    public int f9274d;

    public e() {
        int i10 = 80;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (80 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f9272b = new long[i13];
        this.f9273c = new Object[i13];
    }

    public final void b() {
        int i10 = this.f9274d;
        Object[] objArr = this.f9273c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f9274d = 0;
        this.f9271a = false;
    }

    /* renamed from: c */
    public final e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f9272b = (long[]) this.f9272b.clone();
            eVar.f9273c = (Object[]) this.f9273c.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d() {
        int i10 = this.f9274d;
        long[] jArr = this.f9272b;
        Object[] objArr = this.f9273c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f9270e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f9271a = false;
        this.f9274d = i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f9273c[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(long r3, java.lang.Long r5) {
        /*
            r2 = this;
            long[] r0 = r2.f9272b
            int r1 = r2.f9274d
            int r3 = androidx.lifecycle.c0.d(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r4 = r2.f9273c
            r3 = r4[r3]
            java.lang.Object r4 = f9270e
            if (r3 != r4) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m.e.e(long, java.lang.Long):java.lang.Object");
    }

    public final void f(long j10, E e10) {
        int d10 = c0.d(this.f9272b, this.f9274d, j10);
        if (d10 >= 0) {
            this.f9273c[d10] = e10;
            return;
        }
        int i10 = ~d10;
        int i11 = this.f9274d;
        if (i10 < i11) {
            Object[] objArr = this.f9273c;
            if (objArr[i10] == f9270e) {
                this.f9272b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f9271a && i11 >= this.f9272b.length) {
            d();
            i10 = ~c0.d(this.f9272b, this.f9274d, j10);
        }
        int i12 = this.f9274d;
        if (i12 >= this.f9272b.length) {
            int i13 = (i12 + 1) * 8;
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
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f9272b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f9273c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f9272b = jArr;
            this.f9273c = objArr2;
        }
        int i17 = this.f9274d - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f9272b;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f9273c;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f9274d - i10);
        }
        this.f9272b[i10] = j10;
        this.f9273c[i10] = e10;
        this.f9274d++;
    }

    public final E g(int i10) {
        if (this.f9271a) {
            d();
        }
        return this.f9273c[i10];
    }

    public final String toString() {
        if (this.f9271a) {
            d();
        }
        int i10 = this.f9274d;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        for (int i11 = 0; i11 < this.f9274d; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            if (this.f9271a) {
                d();
            }
            sb.append(this.f9272b[i11]);
            sb.append('=');
            Object g10 = g(i11);
            if (g10 != this) {
                sb.append(g10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
