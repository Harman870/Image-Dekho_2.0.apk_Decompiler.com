package x1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import o1.f;
import r1.d;

public final class j extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f12860b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(f.f10513a);

    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12860b);
    }

    public final Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        Bitmap bitmap2;
        Paint paint = z.f12922a;
        int min = Math.min(i10, i11);
        float f10 = (float) min;
        float f11 = f10 / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f10 / width, f10 / height);
        float f12 = width * max;
        float f13 = max * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap.Config c10 = z.c(bitmap);
        if (c10.equals(bitmap.getConfig())) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = dVar.d(bitmap.getWidth(), bitmap.getHeight(), c10);
            new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap d10 = dVar.d(min, min, z.c(bitmap));
        d10.setHasAlpha(true);
        Lock lock = z.f12925d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d10);
            canvas.drawCircle(f11, f11, f11, z.f12923b);
            canvas.drawBitmap(bitmap2, (Rect) null, rectF, z.f12924c);
            canvas.setBitmap((Bitmap) null);
            lock.unlock();
            if (!bitmap2.equals(bitmap)) {
                dVar.e(bitmap2);
            }
            return d10;
        } catch (Throwable th) {
            z.f12925d.unlock();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    public final int hashCode() {
        return 1101716364;
    }
}
