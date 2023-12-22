package j4;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class s7 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f8462a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f8463b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8463b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(boolean z9) {
        return z9 ? 1231 : 1237;
    }
}
