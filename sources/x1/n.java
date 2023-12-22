package x1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import r1.d;
import r1.e;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12883a = new a();

    public class a extends e {
        public final void e(Bitmap bitmap) {
        }
    }

    /* JADX INFO: finally extract failed */
    public static d a(d dVar, Drawable drawable, int i10, int i11) {
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z9 = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i10 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder();
                    sb.append("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                }
                z9 = true;
            } else if (i11 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                if (current.getIntrinsicWidth() > 0) {
                    i10 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i11 = current.getIntrinsicHeight();
                }
                Lock lock = z.f12925d;
                lock.lock();
                Bitmap d10 = dVar.d(i10, i11, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(d10);
                    current.setBounds(0, 0, i10, i11);
                    current.draw(canvas);
                    canvas.setBitmap((Bitmap) null);
                    lock.unlock();
                    bitmap = d10;
                    z9 = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            } else {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder();
                    sb.append("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                }
                z9 = true;
            }
            sb.append(str);
            Log.w("DrawableToBitmap", sb.toString());
            z9 = true;
        }
        if (!z9) {
            dVar = f12883a;
        }
        return d.d(bitmap, dVar);
    }
}
