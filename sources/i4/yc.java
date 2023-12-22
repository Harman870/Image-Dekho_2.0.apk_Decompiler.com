package i4;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public final class yc extends ThreadLocal {
    public final Object initialValue() {
        try {
            return (Cipher) kd.f7450e.a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
