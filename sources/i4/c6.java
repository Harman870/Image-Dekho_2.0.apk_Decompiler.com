package i4;

import c.a;
import java.security.GeneralSecurityException;
import o.g;

public final class c6 extends x7 {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f7226d = new byte[0];

    public c6() {
        super(db.class, new a5(2, r3.class));
    }

    public static j7 i(int i10, a4 a4Var, byte[] bArr, int i11) {
        int i12;
        xa v10 = ya.v();
        gb v11 = hb.v();
        v11.j();
        hb.C((hb) v11.f7833b);
        v11.j();
        ((hb) v11.f7833b).zze = a.m(5);
        d0 q10 = e0.q(bArr, 0, bArr.length);
        v11.j();
        ((hb) v11.f7833b).zzf = q10;
        hb hbVar = (hb) v11.d();
        ac v12 = bc.v();
        v12.l(a4Var.f7180a.A());
        v12.m(e0.p(a4Var.f7180a.z().r()));
        int b10 = g.b(a4Var.f7180a.y());
        int i13 = 3;
        if (b10 == 1) {
            i12 = 1;
        } else if (b10 == 2) {
            i12 = 2;
        } else if (b10 == 3) {
            i12 = 3;
        } else if (b10 == 4) {
            i12 = 4;
        } else {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        int i14 = i12 - 1;
        if (i14 == 0) {
            i13 = 2;
        } else if (i14 != 1) {
            if (i14 != 2) {
                i13 = 5;
            } else {
                i13 = 4;
            }
        }
        v12.k(i13);
        va v13 = wa.v();
        v13.j();
        wa.z((wa) v13.f7833b, (bc) v12.d());
        za w = bb.w();
        w.j();
        ((bb) w.f7833b).zzd = hbVar;
        w.j();
        ((bb) w.f7833b).zze = (wa) v13.d();
        w.j();
        bb.D((bb) w.f7833b, i10);
        v10.j();
        ((ya) v10.f7833b).zzd = (bb) w.d();
        return new j7(i11, (ya) v10.d());
    }

    public final k7 a() {
        return new b5(ya.class, 2);
    }

    public final int b() {
        return 3;
    }

    public final b2 c(e0 e0Var) {
        return db.y(e0Var, p0.f7582b);
    }

    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final void e(b2 b2Var) {
        boolean z9;
        db dbVar = (db) b2Var;
        if (dbVar.A().g() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            vd.c(dbVar.v());
            k6.a(dbVar.z().w());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final /* synthetic */ b2 h(b2 b2Var) {
        return ((db) b2Var).z();
    }
}
