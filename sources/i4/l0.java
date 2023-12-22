package i4;

import androidx.activity.result.c;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class l0 extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f7459c = Logger.getLogger(l0.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7460d = h3.f7349e;

    /* renamed from: b  reason: collision with root package name */
    public m0 f7461b;

    public l0() {
        super(0);
    }

    public /* synthetic */ l0(int i10) {
        super(0);
    }

    public static int A(String str) {
        int i10;
        try {
            i10 = m3.b(str);
        } catch (l3 unused) {
            i10 = str.getBytes(g1.f7324a).length;
        }
        return C(i10) + i10;
    }

    public static int B(int i10) {
        return C(i10 << 3);
    }

    public static int C(int i10) {
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

    public static int D(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    @Deprecated
    public static int V(int i10, b2 b2Var, m2 m2Var) {
        int C = C(i10 << 3);
        return ((t) b2Var).a(m2Var) + C + C;
    }

    public static int W(int i10) {
        if (i10 >= 0) {
            return C(i10);
        }
        return 10;
    }

    public final void E(String str, l3 l3Var) {
        f7459c.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", l3Var);
        byte[] bytes = str.getBytes(g1.f7324a);
        try {
            int length = bytes.length;
            S(length);
            q(bytes, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new j0(e10);
        }
    }

    public abstract void F(byte b10);

    public abstract void G(int i10, boolean z9);

    public abstract void H(int i10, e0 e0Var);

    public abstract void I(int i10, int i11);

    public abstract void J(int i10);

    public abstract void K(int i10, long j10);

    public abstract void L(long j10);

    public abstract void M(int i10, int i11);

    public abstract void N(int i10);

    public abstract void O(int i10, b2 b2Var, m2 m2Var);

    public abstract void P(int i10, String str);

    public abstract void Q(int i10, int i11);

    public abstract void R(int i10, int i11);

    public abstract void S(int i10);

    public abstract void T(int i10, long j10);

    public abstract void U(long j10);
}
