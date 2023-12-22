package i4;

import java.security.GeneralSecurityException;

public final class n4 extends u3 implements m4 {

    /* renamed from: c  reason: collision with root package name */
    public final x7 f7521c;

    /* renamed from: d  reason: collision with root package name */
    public final l7 f7522d;

    public n4(x7 x7Var, l7 l7Var, Class cls) {
        super(x7Var, cls);
        this.f7521c = x7Var;
        this.f7522d = l7Var;
    }

    public final zb b(e0 e0Var) {
        try {
            b2 c10 = this.f7521c.c(e0Var);
            this.f7521c.e(c10);
            b2 h10 = this.f7521c.h(c10);
            this.f7522d.e(h10);
            yb v10 = zb.v();
            String d10 = this.f7522d.d();
            v10.j();
            ((zb) v10.f7833b).zzd = d10;
            d0 i10 = h10.i();
            v10.j();
            ((zb) v10.f7833b).zze = i10;
            int b10 = this.f7522d.b();
            v10.j();
            zb.D((zb) v10.f7833b, b10);
            return (zb) v10.d();
        } catch (i1 e10) {
            throw new GeneralSecurityException("expected serialized proto of type ", e10);
        }
    }
}
