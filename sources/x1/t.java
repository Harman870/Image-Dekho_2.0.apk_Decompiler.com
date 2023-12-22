package x1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import j2.a;
import java.io.InputStream;
import o1.h;
import o1.j;
import q1.w;

public final class t implements j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f12906a = new c();

    public final /* bridge */ /* synthetic */ boolean a(Object obj, h hVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }

    public final w b(Object obj, int i10, int i11, h hVar) {
        return this.f12906a.b(ImageDecoder.createSource(a.b((InputStream) obj)), i10, i11, hVar);
    }
}
