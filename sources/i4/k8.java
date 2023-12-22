package i4;

import androidx.activity.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

public final class k8 {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public Integer f7444a = null;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Integer f7445b = null;

    /* renamed from: c  reason: collision with root package name */
    public l8 f7446c = l8.f7480e;

    public final void a(int i10) {
        if (i10 == 16 || i10 == 32) {
            this.f7444a = Integer.valueOf(i10);
        } else {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i10 * 8)}));
        }
    }

    public final void b(int i10) {
        if (i10 < 10 || i10 > 16) {
            throw new GeneralSecurityException(e.a("Invalid tag size for AesCmacParameters: ", i10));
        }
        this.f7445b = Integer.valueOf(i10);
    }

    public final m8 c() {
        Integer num = this.f7444a;
        if (num != null && this.f7445b != null) {
            return new m8(num.intValue(), this.f7445b.intValue(), this.f7446c);
        }
        throw new GeneralSecurityException("Key size and/or tag size not set");
    }
}
