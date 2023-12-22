package x1;

import com.bumptech.glide.load.ImageHeaderParser;
import j2.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import r1.b;
import t0.a;

public final class p implements ImageHeaderParser {
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public final int b(InputStream inputStream, b bVar) {
        a aVar = new a(inputStream);
        a.c c10 = aVar.c("Orientation");
        int i10 = 1;
        if (c10 != null) {
            try {
                i10 = c10.f(aVar.f11951f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 == 0) {
            return -1;
        }
        return i10;
    }

    public final int c(ByteBuffer byteBuffer, b bVar) {
        AtomicReference<byte[]> atomicReference = j2.a.f8002a;
        return b(new a.C0103a(byteBuffer), bVar);
    }

    public final ImageHeaderParser.ImageType d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
