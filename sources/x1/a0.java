package x1;

import android.graphics.Bitmap;
import j2.l;
import o1.h;
import o1.j;
import q1.w;

public final class a0 implements j<Bitmap, Bitmap> {

    public static final class a implements w<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f12839a;

        public a(Bitmap bitmap) {
            this.f12839a = bitmap;
        }

        public final int a() {
            return l.c(this.f12839a);
        }

        public final Class<Bitmap> b() {
            return Bitmap.class;
        }

        public final void c() {
        }

        public final Object get() {
            return this.f12839a;
        }
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, h hVar) {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }

    public final w b(Object obj, int i10, int i11, h hVar) {
        return new a((Bitmap) obj);
    }
}
