package i4;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7324a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f7325b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f7325b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = 0 + 0;
        if (i10 < 0) {
            throw i1.d();
        } else if (i10 > Integer.MAX_VALUE) {
            try {
                throw i1.e();
            } catch (i1 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
    }

    public static int a(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
