package i4;

import c2.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

public final class o8 {

    /* renamed from: a  reason: collision with root package name */
    public u8 f7561a = null;

    /* renamed from: b  reason: collision with root package name */
    public b f7562b = null;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Integer f7563c = null;

    public final p8 a() {
        b bVar;
        boolean z9;
        boolean z10;
        xd xdVar;
        u8 u8Var = this.f7561a;
        if (u8Var == null || (bVar = this.f7562b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (u8Var.f7725o == ((xd) bVar.f2371a).f7793a.length) {
            t8 t8Var = u8Var.f7727q;
            t8 t8Var2 = t8.f7686e;
            if (t8Var != t8Var2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9 || this.f7563c != null) {
                if (t8Var != t8Var2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || this.f7563c == null) {
                    if (t8Var == t8Var2) {
                        xdVar = xd.a(new byte[0]);
                    } else if (t8Var == t8.f7685d || t8Var == t8.f7684c) {
                        xdVar = xd.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f7563c.intValue()).array());
                    } else if (t8Var == t8.f7683b) {
                        xdVar = xd.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f7563c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f7561a.f7727q)));
                    }
                    return new p8(this.f7561a, xdVar);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else {
            throw new GeneralSecurityException("Key size mismatch");
        }
    }
}
