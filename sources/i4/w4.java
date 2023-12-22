package i4;

import c.a;
import java.security.GeneralSecurityException;

public final class w4 extends l7 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7759d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w4(int i10) {
        super(o9.class, new u4(0));
        this.f7759d = i10;
        if (i10 == 1) {
            super(fa.class, new u4(1));
        } else if (i10 == 2) {
            super(vc.class, new u4(2));
        } else if (i10 != 3) {
        } else {
            super(xb.class, new i5(1, s3.class));
        }
    }

    public static j7 h(int i10, int i11) {
        ga w = ha.w();
        w.j();
        ((ha) w.f7833b).zzd = i10;
        return new j7(i11, (ha) w.d());
    }

    public static j7 i(int i10, int i11, int i12) {
        u9 w = v9.w();
        w9 w10 = x9.w();
        w10.j();
        ((x9) w10.f7833b).zzd = 16;
        w.j();
        ((v9) w.f7833b).zzd = (x9) w10.d();
        w.j();
        ((v9) w.f7833b).zze = i10;
        mb w11 = nb.w();
        ob w12 = pb.w();
        w12.j();
        ((pb) w12.f7833b).zzd = a.m(5);
        w12.j();
        ((pb) w12.f7833b).zze = i11;
        w11.j();
        ((nb) w11.f7833b).zzd = (pb) w12.d();
        w11.j();
        ((nb) w11.f7833b).zze = 32;
        p9 v10 = q9.v();
        v10.j();
        ((q9) v10.f7833b).zzd = (v9) w.d();
        v10.j();
        ((q9) v10.f7833b).zze = (nb) w11.d();
        return new j7(i12, (q9) v10.d());
    }

    public final k7 a() {
        switch (this.f7759d) {
            case 0:
                return new v4(q9.class, 0);
            case 1:
                return new v4(ha.class, 1);
            case 2:
                return new v4(xc.class, 2);
            default:
                throw new UnsupportedOperationException("Creating keys is not supported.");
        }
    }

    public final int b() {
        switch (this.f7759d) {
            case 0:
            case 1:
            case 2:
                return 2;
            default:
                return 4;
        }
    }

    public final b2 c(e0 e0Var) {
        switch (this.f7759d) {
            case 0:
                return o9.y(e0Var, p0.f7582b);
            case 1:
                return fa.y(e0Var, p0.f7582b);
            case 2:
                return vc.y(e0Var, p0.f7582b);
            default:
                return xb.A(e0Var, p0.f7582b);
        }
    }

    public final String d() {
        switch (this.f7759d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
        }
    }

    public final void e(b2 b2Var) {
        switch (this.f7759d) {
            case 0:
                o9 o9Var = (o9) b2Var;
                vd.c(o9Var.v());
                new z4(0);
                t9 z9 = o9Var.z();
                vd.c(z9.v());
                vd.b(z9.B().g());
                x9 A = z9.A();
                if (A.v() < 12 || A.v() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                new j8(1);
                j8.h(o9Var.A());
                return;
            case 1:
                fa faVar = (fa) b2Var;
                vd.c(faVar.v());
                vd.b(faVar.z().g());
                return;
            case 2:
                vc vcVar = (vc) b2Var;
                vd.c(vcVar.v());
                if (vcVar.z().g() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                xb xbVar = (xb) b2Var;
                vd.c(xbVar.v());
                if (xbVar.F()) {
                    u6.a(xbVar.w());
                    return;
                }
                throw new GeneralSecurityException("Missing HPKE key params.");
        }
    }

    public final int f() {
        switch (this.f7759d) {
            case 0:
            case 1:
                return 2;
            default:
                return 1;
        }
    }
}
