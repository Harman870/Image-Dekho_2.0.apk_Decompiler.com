package i4;

import java.security.GeneralSecurityException;

public final class h5 extends l7 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7356d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h5(int i10) {
        super(sa.class, new f5(0, p3.class));
        this.f7356d = i10;
        if (i10 != 1) {
            return;
        }
        super(fb.class, new d6(0, s3.class));
    }

    public final k7 a() {
        switch (this.f7356d) {
            case 0:
                return new g5(ua.class, 0);
            default:
                throw new UnsupportedOperationException("Creating keys is not supported.");
        }
    }

    public final int b() {
        switch (this.f7356d) {
            case 0:
                return 2;
            default:
                return 4;
        }
    }

    public final b2 c(e0 e0Var) {
        switch (this.f7356d) {
            case 0:
                return sa.y(e0Var, p0.f7582b);
            default:
                return fb.A(e0Var, p0.f7582b);
        }
    }

    public final String d() {
        switch (this.f7356d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
        }
    }

    public final /* bridge */ /* synthetic */ void e(b2 b2Var) {
        switch (this.f7356d) {
            case 0:
                sa saVar = (sa) b2Var;
                vd.c(saVar.v());
                if (saVar.z().g() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                fb fbVar = (fb) b2Var;
                vd.c(fbVar.v());
                k6.a(fbVar.w());
                return;
        }
    }
}
