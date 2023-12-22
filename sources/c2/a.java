package c2;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import o1.h;
import q1.w;
import y1.b;

public final class a implements d<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap.CompressFormat f2369a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b  reason: collision with root package name */
    public final int f2370b = 100;

    public final w<byte[]> a(w<Bitmap> wVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.f2369a, this.f2370b, byteArrayOutputStream);
        wVar.c();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
