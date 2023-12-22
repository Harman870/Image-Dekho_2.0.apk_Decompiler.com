package x1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import java.security.MessageDigest;
import o1.l;
import q1.w;
import r1.d;

public final class o implements l<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f12884b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12885c;

    public o(l<Bitmap> lVar, boolean z9) {
        this.f12884b = lVar;
        this.f12885c = z9;
    }

    public final w a(h hVar, w wVar, int i10, int i11) {
        d dVar = b.b(hVar).f2546a;
        Drawable drawable = (Drawable) wVar.get();
        d a10 = n.a(dVar, drawable, i10, i11);
        if (a10 != null) {
            w a11 = this.f12884b.a(hVar, a10, i10, i11);
            if (!a11.equals(a10)) {
                return new u(hVar.getResources(), a11);
            }
            a11.c();
            return wVar;
        } else if (!this.f12885c) {
            return wVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public final void b(MessageDigest messageDigest) {
        this.f12884b.b(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f12884b.equals(((o) obj).f12884b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12884b.hashCode();
    }
}
