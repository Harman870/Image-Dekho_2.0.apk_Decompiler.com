package x1;

import android.graphics.Bitmap;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import o1.l;
import q1.w;
import r1.d;

public abstract class e implements l<Bitmap> {
    public final w a(h hVar, w wVar, int i10, int i11) {
        if (j2.l.j(i10, i11)) {
            d dVar = b.b(hVar).f2546a;
            Bitmap bitmap = (Bitmap) wVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(dVar, bitmap, i10, i11);
            if (bitmap.equals(c10)) {
                return wVar;
            }
            return d.d(c10, dVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(d dVar, Bitmap bitmap, int i10, int i11);
}
