package i4;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public final class u5 extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7710a;

    public /* synthetic */ u5(int i10) {
        this.f7710a = i10;
    }

    public final Object initialValue() {
        switch (this.f7710a) {
            case 0:
                try {
                    return (Cipher) kd.f7450e.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            default:
                try {
                    return (Cipher) kd.f7450e.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
        }
    }
}
