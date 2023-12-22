package i4;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import u1.t;
import x2.l;
import y3.a;

public final class f5 extends w7 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7305b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5(int i10, Class cls) {
        super(cls);
        this.f7305b = i10;
    }

    public final Object a(b2 b2Var) {
        boolean z9;
        int i10;
        l lVar;
        switch (this.f7305b) {
            case 0:
                return new ed(((sa) b2Var).z().r());
            default:
                vb vbVar = (vb) b2Var;
                if (!vbVar.E()) {
                    throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
                } else if (vbVar.z().F()) {
                    if (vbVar.A().g() == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        tb w = vbVar.z().w();
                        r6 Q = a.Q(w);
                        t V = a.V(w);
                        o6 I = a.I(w);
                        int A = w.A();
                        int i11 = A - 2;
                        int i12 = 2;
                        if (i11 == 1) {
                            i10 = 32;
                        } else if (i11 == 2) {
                            i10 = 65;
                        } else if (i11 == 3) {
                            i10 = 97;
                        } else if (i11 == 4) {
                            i10 = 133;
                        } else {
                            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(a.M(A)));
                        }
                        int A2 = vbVar.z().w().A() - 2;
                        if (A2 == 1) {
                            byte[] r4 = vbVar.A().r();
                            if (r4.length == 32) {
                                byte[] bArr = new byte[32];
                                bArr[0] = 9;
                                lVar = new w6(r4, a.P(r4, bArr));
                            } else {
                                throw new InvalidKeyException("Private key must have 32 bytes.");
                            }
                        } else if (A2 == 2 || A2 == 3 || A2 == 4) {
                            byte[] r10 = vbVar.A().r();
                            byte[] r11 = vbVar.z().B().r();
                            int A3 = vbVar.z().w().A();
                            byte[] bArr2 = u6.f7711a;
                            int i13 = A3 - 2;
                            if (i13 == 2) {
                                i12 = 1;
                            } else if (i13 != 3) {
                                if (i13 == 4) {
                                    i12 = 3;
                                } else {
                                    throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                                }
                            }
                            ECPublicKey h10 = id.h(id.i(i12), 1, r11);
                            ECPrivateKey g10 = id.g(i12, r10);
                            id.e(g10, h10);
                            id.d(h10.getW(), g10.getParams().getCurve());
                            lVar = new l(r10, r11);
                        } else {
                            throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                        }
                        return new q6(lVar, Q, V, I, i10);
                    }
                    throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
                } else {
                    throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
                }
        }
    }
}
