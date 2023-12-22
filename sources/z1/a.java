package z1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser;
import j2.l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o1.h;
import o1.j;
import q1.w;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f13137a;

    /* renamed from: b  reason: collision with root package name */
    public final r1.b f13138b;

    /* renamed from: z1.a$a  reason: collision with other inner class name */
    public static final class C0175a implements w<Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final AnimatedImageDrawable f13139a;

        public C0175a(AnimatedImageDrawable animatedImageDrawable) {
            this.f13139a = animatedImageDrawable;
        }

        public final int a() {
            return l.d(Bitmap.Config.ARGB_8888) * this.f13139a.getIntrinsicHeight() * this.f13139a.getIntrinsicWidth() * 2;
        }

        public final Class<Drawable> b() {
            return Drawable.class;
        }

        public final void c() {
            this.f13139a.stop();
            this.f13139a.clearAnimationCallbacks();
        }

        public final Object get() {
            return this.f13139a;
        }
    }

    public static final class b implements j<ByteBuffer, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final a f13140a;

        public b(a aVar) {
            this.f13140a = aVar;
        }

        public final boolean a(Object obj, h hVar) {
            if (com.bumptech.glide.load.a.b(this.f13140a.f13137a, (ByteBuffer) obj) == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return true;
            }
            return false;
        }

        public final w b(Object obj, int i10, int i11, h hVar) {
            ImageDecoder.Source createSource = ImageDecoder.createSource((ByteBuffer) obj);
            this.f13140a.getClass();
            return a.a(createSource, i10, i11, hVar);
        }
    }

    public static final class c implements j<InputStream, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final a f13141a;

        public c(a aVar) {
            this.f13141a = aVar;
        }

        public final boolean a(Object obj, h hVar) {
            a aVar = this.f13141a;
            List<ImageHeaderParser> list = aVar.f13137a;
            if (com.bumptech.glide.load.a.c(aVar.f13138b, (InputStream) obj, list) == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return true;
            }
            return false;
        }

        public final w b(Object obj, int i10, int i11, h hVar) {
            ImageDecoder.Source createSource = ImageDecoder.createSource(j2.a.b((InputStream) obj));
            this.f13141a.getClass();
            return a.a(createSource, i10, i11, hVar);
        }
    }

    public a(List<ImageHeaderParser> list, r1.b bVar) {
        this.f13137a = list;
        this.f13138b = bVar;
    }

    public static C0175a a(ImageDecoder.Source source, int i10, int i11, h hVar) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new w1.a(i10, i11, hVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C0175a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }
}
