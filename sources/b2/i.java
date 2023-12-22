package b2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o1.h;
import o1.j;
import q1.w;
import r1.b;

public final class i implements j<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f2246a;

    /* renamed from: b  reason: collision with root package name */
    public final j<ByteBuffer, c> f2247b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2248c;

    public i(List list, a aVar, b bVar) {
        this.f2246a = list;
        this.f2247b = aVar;
        this.f2248c = bVar;
    }

    public final boolean a(Object obj, h hVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) hVar.c(h.f2245b)).booleanValue()) {
            if (a.c(this.f2248c, inputStream, this.f2246a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    public final w b(Object obj, int i10, int i11, h hVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f2247b.b(ByteBuffer.wrap(bArr), i10, i11, hVar);
    }
}
