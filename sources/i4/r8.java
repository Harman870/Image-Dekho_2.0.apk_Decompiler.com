package i4;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

public final class r8 {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public Integer f7640a = null;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Integer f7641b = null;

    /* renamed from: c  reason: collision with root package name */
    public s8 f7642c = null;

    /* renamed from: d  reason: collision with root package name */
    public t8 f7643d = t8.f7686e;

    public final u8 a() {
        Integer num = this.f7640a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        } else if (this.f7641b == null) {
            throw new GeneralSecurityException("tag size is not set");
        } else if (this.f7642c == null) {
            throw new GeneralSecurityException("hash type is not set");
        } else if (num.intValue() >= 16) {
            int intValue = this.f7641b.intValue();
            s8 s8Var = this.f7642c;
            if (intValue >= 10) {
                if (s8Var == s8.f7670b) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (s8Var == s8.f7671c) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (s8Var == s8.f7672d) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (s8Var == s8.f7673e) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (s8Var != s8.f7674f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                } else if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                }
                return new u8(this.f7640a.intValue(), this.f7641b.intValue(), this.f7643d, this.f7642c);
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(intValue)}));
        } else {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.f7640a}));
        }
    }
}
