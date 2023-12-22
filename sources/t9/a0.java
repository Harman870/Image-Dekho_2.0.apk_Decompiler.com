package t9;

import java.nio.charset.Charset;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f12033a = Charset.forName("UTF-8");

    public static void a(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12)}));
        }
    }
}
