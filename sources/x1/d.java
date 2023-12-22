package x1;

import android.graphics.Bitmap;
import j2.l;
import q1.s;
import q1.w;

public final class d implements w<Bitmap>, s {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f12853a;

    /* renamed from: b  reason: collision with root package name */
    public final r1.d f12854b;

    public d(Bitmap bitmap, r1.d dVar) {
        if (bitmap != null) {
            this.f12853a = bitmap;
            if (dVar != null) {
                this.f12854b = dVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static d d(Bitmap bitmap, r1.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, dVar);
    }

    public final int a() {
        return l.c(this.f12853a);
    }

    public final Class<Bitmap> b() {
        return Bitmap.class;
    }

    public final void c() {
        this.f12854b.e(this.f12853a);
    }

    public final Object get() {
        return this.f12853a;
    }

    public final void initialize() {
        this.f12853a.prepareToDraw();
    }
}
