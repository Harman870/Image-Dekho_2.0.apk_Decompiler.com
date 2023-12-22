package i4;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import javax.crypto.spec.SecretKeySpec;
import v.a;

public final class d6 extends w7 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7251b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(int i10, Class cls) {
        super(cls);
        this.f7251b = i10;
    }

    public final Object a(b2 b2Var) {
        switch (this.f7251b) {
            case 0:
                fb fbVar = (fb) b2Var;
                bb w = fbVar.w();
                hb z9 = w.z();
                int c10 = k6.c(z9.A());
                byte[] r4 = fbVar.B().r();
                byte[] r10 = fbVar.C().r();
                ECParameterSpec i10 = id.i(c10);
                ECPoint eCPoint = new ECPoint(new BigInteger(1, r4), new BigInteger(1, r10));
                id.d(eCPoint, i10.getCurve());
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, i10);
                l6 l6Var = new l6(w.v().y());
                byte[] r11 = z9.y().r();
                String b10 = k6.b(z9.B());
                k6.d(w.C());
                return new a((ECPublicKey) ((KeyFactory) kd.f7454i.a("EC")).generatePublic(eCPublicKeySpec), r11, b10, l6Var);
            case 1:
                i9 i9Var = (i9) b2Var;
                return new rd(new od(i9Var.A().r()), i9Var.z().v());
            default:
                lb lbVar = (lb) b2Var;
                int A = lbVar.A().A();
                SecretKeySpec secretKeySpec = new SecretKeySpec(lbVar.B().r(), "HMAC");
                int v10 = lbVar.A().v();
                int i11 = A - 2;
                if (i11 == 1) {
                    return new rd(new qd("HMACSHA1", secretKeySpec), v10);
                }
                if (i11 == 2) {
                    return new rd(new qd("HMACSHA384", secretKeySpec), v10);
                }
                if (i11 == 3) {
                    return new rd(new qd("HMACSHA256", secretKeySpec), v10);
                }
                if (i11 == 4) {
                    return new rd(new qd("HMACSHA512", secretKeySpec), v10);
                }
                if (i11 == 5) {
                    return new rd(new qd("HMACSHA224", secretKeySpec), v10);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
