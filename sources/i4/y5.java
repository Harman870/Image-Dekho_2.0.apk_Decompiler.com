package i4;

import java.security.InvalidKeyException;

public final class y5 extends l7 {
    public y5() {
        super(oa.class, new x4(2, q3.class));
    }

    public final k7 a() {
        return new x5();
    }

    public final int b() {
        return 2;
    }

    public final b2 c(e0 e0Var) {
        return oa.y(e0Var, p0.f7582b);
    }

    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final /* bridge */ /* synthetic */ void e(b2 b2Var) {
        oa oaVar = (oa) b2Var;
        vd.c(oaVar.v());
        if (oaVar.z().g() != 64) {
            int g10 = oaVar.z().g();
            throw new InvalidKeyException("invalid key size: " + g10 + ". Valid keys must have 64 bytes.");
        }
    }
}
