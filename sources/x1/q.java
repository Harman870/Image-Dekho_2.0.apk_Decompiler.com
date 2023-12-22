package x1;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import o1.f;
import r1.d;

public final class q extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f12886b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f.f10513a);

    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12886b);
    }

    public final Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        return z.b(dVar, bitmap, i10, i11);
    }

    public final boolean equals(Object obj) {
        return obj instanceof q;
    }

    public final int hashCode() {
        return 1572326941;
    }
}
