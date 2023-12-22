package b2;

import android.graphics.Bitmap;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import java.security.MessageDigest;
import o1.l;
import q1.w;
import x1.d;
import y3.a;

public final class e implements l<c> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f2221b;

    public e(l<Bitmap> lVar) {
        a.h(lVar);
        this.f2221b = lVar;
    }

    public final w a(h hVar, w wVar, int i10, int i11) {
        c cVar = (c) wVar.get();
        d dVar = new d(cVar.f2210a.f2220a.f2232l, b.b(hVar).f2546a);
        w a10 = this.f2221b.a(hVar, dVar, i10, i11);
        if (!dVar.equals(a10)) {
            dVar.c();
        }
        l<Bitmap> lVar = this.f2221b;
        cVar.f2210a.f2220a.c(lVar, (Bitmap) a10.get());
        return wVar;
    }

    public final void b(MessageDigest messageDigest) {
        this.f2221b.b(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f2221b.equals(((e) obj).f2221b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2221b.hashCode();
    }
}
