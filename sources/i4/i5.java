package i4;

import y3.a;

public final class i5 extends w7 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7385b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5(int i10, Class cls) {
        super(cls);
        this.f7385b = i10;
    }

    public final Object a(b2 b2Var) {
        boolean z9;
        switch (this.f7385b) {
            case 0:
                String y9 = ((mc) b2Var).z().y();
                return f4.a(y9).zza(y9);
            default:
                xb xbVar = (xb) b2Var;
                if (xbVar.B().g() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    tb w = xbVar.w();
                    return new k4(xbVar, a.Q(w), a.V(w), a.I(w));
                }
                throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
    }
}
