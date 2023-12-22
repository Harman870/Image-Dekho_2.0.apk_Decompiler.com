package i4;

import java.security.GeneralSecurityException;

public final class t6 extends x7 {
    public t6() {
        super(vb.class, new f5(1, r3.class));
    }

    public static j7 i(int i10, int i11, int i12, int i13) {
        sb v10 = tb.v();
        v10.j();
        ((tb) v10.f7833b).zzd = i10 - 2;
        v10.j();
        ((tb) v10.f7833b).zze = i11 - 2;
        v10.j();
        ((tb) v10.f7833b).zzf = i12 - 2;
        qb v11 = rb.v();
        v11.j();
        ((rb) v11.f7833b).zzd = (tb) v10.d();
        return new j7(i13, (rb) v11.d());
    }

    public final k7 a() {
        return new g5(rb.class, 1);
    }

    public final int b() {
        return 3;
    }

    public final b2 c(e0 e0Var) {
        return vb.y(e0Var, p0.f7582b);
    }

    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public final void e(b2 b2Var) {
        boolean z9;
        vb vbVar = (vb) b2Var;
        if (vbVar.A().g() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (vbVar.E()) {
            vd.c(vbVar.v());
            u6.a(vbVar.z().w());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    public final /* synthetic */ b2 h(b2 b2Var) {
        return ((vb) b2Var).z();
    }
}
