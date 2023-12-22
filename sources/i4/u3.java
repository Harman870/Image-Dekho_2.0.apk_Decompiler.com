package i4;

import java.security.GeneralSecurityException;

public class u3 implements t3 {

    /* renamed from: a  reason: collision with root package name */
    public final l7 f7707a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f7708b;

    public u3(l7 l7Var, Class cls) {
        if (l7Var.f7475b.keySet().contains(cls) || Void.class.equals(cls)) {
            this.f7707a = l7Var;
            this.f7708b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{l7Var.toString(), cls.getName()}));
    }

    public final zb a(e0 e0Var) {
        try {
            k7 a10 = this.f7707a.a();
            b2 b10 = a10.b(e0Var);
            a10.d(b10);
            b2 a11 = a10.a(b10);
            yb v10 = zb.v();
            String d10 = this.f7707a.d();
            v10.j();
            ((zb) v10.f7833b).zzd = d10;
            d0 i10 = a11.i();
            v10.j();
            ((zb) v10.f7833b).zze = i10;
            int b11 = this.f7707a.b();
            v10.j();
            zb.D((zb) v10.f7833b, b11);
            return (zb) v10.d();
        } catch (i1 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public final b2 c(e0 e0Var) {
        try {
            k7 a10 = this.f7707a.a();
            b2 b10 = a10.b(e0Var);
            a10.d(b10);
            return a10.a(b10);
        } catch (i1 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f7707a.a().f7443a.getName()), e10);
        }
    }

    public final Object d(e0 e0Var) {
        try {
            return f(this.f7707a.c(e0Var));
        } catch (i1 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f7707a.f7474a.getName()), e10);
        }
    }

    public final Object e(c1 c1Var) {
        String concat = "Expected proto of type ".concat(this.f7707a.f7474a.getName());
        if (this.f7707a.f7474a.isInstance(c1Var)) {
            return f(c1Var);
        }
        throw new GeneralSecurityException(concat);
    }

    public final Object f(b2 b2Var) {
        if (!Void.class.equals(this.f7708b)) {
            this.f7707a.e(b2Var);
            return this.f7707a.g(b2Var, this.f7708b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final String zze() {
        return this.f7707a.d();
    }
}
