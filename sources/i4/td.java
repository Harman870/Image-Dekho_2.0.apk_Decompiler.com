package i4;

import java.security.SecureRandom;

public final class td {

    /* renamed from: a  reason: collision with root package name */
    public static final sd f7689a = new sd();

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f7689a.get()).nextBytes(bArr);
        return bArr;
    }
}
