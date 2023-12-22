package j4;

import c6.b;
import java.util.logging.Logger;

public abstract class u6 extends b {

    /* renamed from: x  reason: collision with root package name */
    public static final Logger f8492x = Logger.getLogger(u6.class.getName());

    /* renamed from: y  reason: collision with root package name */
    public static final boolean f8493y = t9.f8477e;
    public v6 w;

    public u6() {
    }

    public /* synthetic */ u6(int i10) {
    }

    @Deprecated
    public static int j0(int i10, n8 n8Var, y8 y8Var) {
        int a10 = ((f6) n8Var).a(y8Var);
        int m02 = m0(i10 << 3);
        return m02 + m02 + a10;
    }

    public static int k0(int i10) {
        if (i10 >= 0) {
            return m0(i10);
        }
        return 10;
    }

    public static int l0(String str) {
        int i10;
        try {
            i10 = x9.b(str);
        } catch (w9 unused) {
            i10 = str.getBytes(s7.f8462a).length;
        }
        return m0(i10) + i10;
    }

    public static int m0(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int n0(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public abstract void U(byte b10);

    public abstract void V(int i10, boolean z9);

    public abstract void W(int i10, q6 q6Var);

    public abstract void X(int i10, int i11);

    public abstract void Y(int i10);

    public abstract void Z(int i10, long j10);

    public abstract void a0(long j10);

    public abstract void b0(int i10, int i11);

    public abstract void c0(int i10);

    public abstract void d0(int i10, String str);

    public abstract void e0(int i10, int i11);

    public abstract void f0(int i10, int i11);

    public abstract void g0(int i10);

    public abstract void h0(int i10, long j10);

    public abstract void i0(long j10);
}
