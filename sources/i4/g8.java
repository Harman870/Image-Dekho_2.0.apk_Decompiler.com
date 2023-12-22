package i4;

import c2.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

public final class g8 {

    /* renamed from: a  reason: collision with root package name */
    public m8 f7329a = null;

    /* renamed from: b  reason: collision with root package name */
    public b f7330b = null;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Integer f7331c = null;

    public final h8 a() {
        b bVar;
        boolean z9;
        boolean z10;
        xd xdVar;
        m8 m8Var = this.f7329a;
        if (m8Var == null || (bVar = this.f7330b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (m8Var.f7491o == ((xd) bVar.f2371a).f7793a.length) {
            l8 l8Var = m8Var.f7493q;
            l8 l8Var2 = l8.f7480e;
            if (l8Var != l8Var2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9 || this.f7331c != null) {
                if (l8Var != l8Var2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || this.f7331c == null) {
                    if (l8Var == l8Var2) {
                        xdVar = xd.a(new byte[0]);
                    } else if (l8Var == l8.f7479d || l8Var == l8.f7478c) {
                        xdVar = xd.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f7331c.intValue()).array());
                    } else if (l8Var == l8.f7477b) {
                        xdVar = xd.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f7331c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f7329a.f7493q)));
                    }
                    return new h8(this.f7329a, xdVar);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else {
            throw new GeneralSecurityException("Key size mismatch");
        }
    }
}
