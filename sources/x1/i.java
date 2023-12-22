package x1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import o1.f;
import r1.d;

public final class i extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f12859b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f.f10513a);

    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12859b);
    }

    public final Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = z.f12922a;
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return z.b(dVar, bitmap, i10, i11);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    public final int hashCode() {
        return -670243078;
    }
}
