package j4;

import java.util.Arrays;
import java.util.logging.Logger;

public final class l9 extends j9 {
    public final /* synthetic */ int a(Object obj) {
        return ((k9) obj).a();
    }

    public final int b(Object obj) {
        k9 k9Var = (k9) obj;
        int i10 = k9Var.f8302d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < k9Var.f8299a; i12++) {
            Logger logger = u6.f8492x;
            int g10 = ((q6) k9Var.f8301c[i12]).g();
            int m02 = u6.m0(g10) + g10;
            int m03 = u6.m0(16);
            int m04 = u6.m0(k9Var.f8300b[i12] >>> 3);
            int m05 = u6.m0(8);
            i11 += u6.m0(24) + m02 + m03 + m04 + m05 + m05;
        }
        k9Var.f8302d = i11;
        return i11;
    }

    public final /* bridge */ /* synthetic */ k9 c(Object obj) {
        m7 m7Var = (m7) obj;
        k9 k9Var = m7Var.zzc;
        if (k9Var != k9.f8298f) {
            return k9Var;
        }
        k9 b10 = k9.b();
        m7Var.zzc = b10;
        return b10;
    }

    public final /* synthetic */ k9 d(Object obj) {
        return ((m7) obj).zzc;
    }

    public final Object e(Object obj, Object obj2) {
        k9 k9Var = k9.f8298f;
        if (k9Var.equals(obj2)) {
            return obj;
        }
        k9 k9Var2 = (k9) obj2;
        if (k9Var.equals(obj)) {
            k9 k9Var3 = (k9) obj;
            int i10 = k9Var3.f8299a + k9Var2.f8299a;
            int[] copyOf = Arrays.copyOf(k9Var3.f8300b, i10);
            System.arraycopy(k9Var2.f8300b, 0, copyOf, k9Var3.f8299a, k9Var2.f8299a);
            Object[] copyOf2 = Arrays.copyOf(k9Var3.f8301c, i10);
            System.arraycopy(k9Var2.f8301c, 0, copyOf2, k9Var3.f8299a, k9Var2.f8299a);
            return new k9(i10, copyOf, copyOf2, true);
        }
        k9 k9Var4 = (k9) obj;
        k9Var4.getClass();
        if (k9Var2.equals(k9Var)) {
            return obj;
        }
        if (k9Var4.f8303e) {
            int i11 = k9Var4.f8299a + k9Var2.f8299a;
            k9Var4.e(i11);
            System.arraycopy(k9Var2.f8300b, 0, k9Var4.f8300b, k9Var4.f8299a, k9Var2.f8299a);
            System.arraycopy(k9Var2.f8301c, 0, k9Var4.f8301c, k9Var4.f8299a, k9Var2.f8299a);
            k9Var4.f8299a = i11;
            return obj;
        }
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void f(int i10, long j10, Object obj) {
        ((k9) obj).c(i10 << 3, Long.valueOf(j10));
    }

    public final void g(Object obj) {
        k9 k9Var = ((m7) obj).zzc;
        if (k9Var.f8303e) {
            k9Var.f8303e = false;
        }
    }

    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((m7) obj).zzc = (k9) obj2;
    }

    public final /* synthetic */ void i(Object obj, v6 v6Var) {
        ((k9) obj).d(v6Var);
    }
}
