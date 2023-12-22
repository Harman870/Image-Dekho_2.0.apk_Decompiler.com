package i4;

import java.util.Arrays;

public final class z2 extends x2 {
    public final /* synthetic */ int a(Object obj) {
        return ((y2) obj).a();
    }

    public final int b(Object obj) {
        y2 y2Var = (y2) obj;
        int i10 = y2Var.f7808d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < y2Var.f7805a; i12++) {
            int i13 = y2Var.f7806b[i12];
            int C = l0.C(8);
            int g10 = ((e0) y2Var.f7807c[i12]).g();
            i11 += l0.C(g10) + g10 + l0.C(24) + l0.C(i13 >>> 3) + l0.C(16) + C + C;
        }
        y2Var.f7808d = i11;
        return i11;
    }

    public final /* bridge */ /* synthetic */ y2 c(Object obj) {
        c1 c1Var = (c1) obj;
        y2 y2Var = c1Var.zzc;
        if (y2Var != y2.f7804f) {
            return y2Var;
        }
        y2 b10 = y2.b();
        c1Var.zzc = b10;
        return b10;
    }

    public final /* synthetic */ y2 d(Object obj) {
        return ((c1) obj).zzc;
    }

    public final Object e(Object obj, Object obj2) {
        y2 y2Var = y2.f7804f;
        if (y2Var.equals(obj2)) {
            return obj;
        }
        y2 y2Var2 = (y2) obj2;
        if (y2Var.equals(obj)) {
            y2 y2Var3 = (y2) obj;
            int i10 = y2Var3.f7805a + y2Var2.f7805a;
            int[] copyOf = Arrays.copyOf(y2Var3.f7806b, i10);
            System.arraycopy(y2Var2.f7806b, 0, copyOf, y2Var3.f7805a, y2Var2.f7805a);
            Object[] copyOf2 = Arrays.copyOf(y2Var3.f7807c, i10);
            System.arraycopy(y2Var2.f7807c, 0, copyOf2, y2Var3.f7805a, y2Var2.f7805a);
            return new y2(i10, copyOf, copyOf2, true);
        }
        y2 y2Var4 = (y2) obj;
        y2Var4.getClass();
        if (y2Var2.equals(y2Var)) {
            return obj;
        }
        if (y2Var4.f7809e) {
            int i11 = y2Var4.f7805a + y2Var2.f7805a;
            y2Var4.e(i11);
            System.arraycopy(y2Var2.f7806b, 0, y2Var4.f7806b, y2Var4.f7805a, y2Var2.f7805a);
            System.arraycopy(y2Var2.f7807c, 0, y2Var4.f7807c, y2Var4.f7805a, y2Var2.f7805a);
            y2Var4.f7805a = i11;
            return obj;
        }
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ y2 f() {
        return y2.b();
    }

    public final Object g(Object obj) {
        ((y2) obj).f7809e = false;
        return obj;
    }

    public final /* bridge */ /* synthetic */ void h(int i10, int i11, Object obj) {
        ((y2) obj).c((i10 << 3) | 5, Integer.valueOf(i11));
    }

    public final /* bridge */ /* synthetic */ void i(int i10, long j10, Object obj) {
        ((y2) obj).c((i10 << 3) | 1, Long.valueOf(j10));
    }

    public final /* bridge */ /* synthetic */ void j(Object obj, int i10, Object obj2) {
        ((y2) obj).c((i10 << 3) | 3, obj2);
    }

    public final /* bridge */ /* synthetic */ void k(Object obj, int i10, d0 d0Var) {
        ((y2) obj).c((i10 << 3) | 2, d0Var);
    }

    public final /* bridge */ /* synthetic */ void l(int i10, long j10, Object obj) {
        ((y2) obj).c(i10 << 3, Long.valueOf(j10));
    }

    public final void m(Object obj) {
        ((c1) obj).zzc.f7809e = false;
    }

    public final /* synthetic */ void n(Object obj, Object obj2) {
        ((c1) obj).zzc = (y2) obj2;
    }

    public final /* synthetic */ void o(Object obj, Object obj2) {
        ((c1) obj).zzc = (y2) obj2;
    }

    public final void q() {
    }

    public final /* synthetic */ void r(Object obj, m0 m0Var) {
        ((y2) obj).d(m0Var);
    }
}
