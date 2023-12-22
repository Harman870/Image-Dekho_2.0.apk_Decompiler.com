package x1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import o1.h;
import o1.j;
import q1.w;

public final class g implements j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f12857a = new c();

    public final /* bridge */ /* synthetic */ boolean a(Object obj, h hVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }

    public final w b(Object obj, int i10, int i11, h hVar) {
        return this.f12857a.b(ImageDecoder.createSource((ByteBuffer) obj), i10, i11, hVar);
    }
}
