package i4;

import c6.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class rd implements g4 {

    /* renamed from: a  reason: collision with root package name */
    public final g9 f7644a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7645b;

    public rd(g9 g9Var, int i10) {
        this.f7644a = g9Var;
        this.f7645b = i10;
        if (i10 >= 10) {
            g9Var.a(i10, new byte[0]);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        if (!b.J(this.f7644a.a(this.f7645b, bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
