package i4;

import java.security.GeneralSecurityException;

public final class z4 extends l7 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7838d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z4(int i10) {
        super(t9.class, new x4(0, nd.class));
        this.f7838d = i10;
        if (i10 != 1) {
            return;
        }
        super(mc.class, new i5(0, p3.class));
    }

    public final k7 a() {
        switch (this.f7838d) {
            case 0:
                return new y4(this);
            default:
                return new j5();
        }
    }

    public final int b() {
        switch (this.f7838d) {
            case 0:
                return 2;
            default:
                return 5;
        }
    }

    public final b2 c(e0 e0Var) {
        switch (this.f7838d) {
            case 0:
                return t9.z(e0Var, p0.f7582b);
            default:
                return mc.y(e0Var, p0.f7582b);
        }
    }

    public final String d() {
        switch (this.f7838d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrKey";
            default:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
        }
    }

    public final void e(b2 b2Var) {
        switch (this.f7838d) {
            case 0:
                t9 t9Var = (t9) b2Var;
                vd.c(t9Var.v());
                vd.b(t9Var.B().g());
                x9 A = t9Var.A();
                if (A.v() < 12 || A.v() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                return;
            default:
                vd.c(((mc) b2Var).v());
                return;
        }
    }
}
