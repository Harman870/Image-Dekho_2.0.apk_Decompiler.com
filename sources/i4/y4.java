package i4;

import java.security.GeneralSecurityException;

public final class y4 extends k7 {
    public y4(z4 z4Var) {
        super(v9.class);
    }

    public static final t9 e(v9 v9Var) {
        s9 w = t9.w();
        x9 A = v9Var.A();
        w.j();
        t9.D((t9) w.f7833b, A);
        byte[] a10 = td.a(v9Var.v());
        d0 q10 = e0.q(a10, 0, a10.length);
        w.j();
        ((t9) w.f7833b).zzf = q10;
        w.j();
        ((t9) w.f7833b).zzd = 0;
        return (t9) w.d();
    }

    public final /* bridge */ /* synthetic */ b2 a(b2 b2Var) {
        return e((v9) b2Var);
    }

    public final b2 b(e0 e0Var) {
        return v9.z(e0Var, p0.f7582b);
    }

    public final void d(b2 b2Var) {
        v9 v9Var = (v9) b2Var;
        vd.b(v9Var.v());
        x9 A = v9Var.A();
        if (A.v() < 12 || A.v() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
