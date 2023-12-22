package z1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import q1.s;
import q1.w;
import y3.a;

public abstract class c<T extends Drawable> implements w<T>, s {

    /* renamed from: a  reason: collision with root package name */
    public final T f13143a;

    public c(T t10) {
        a.h(t10);
        this.f13143a = t10;
    }

    public final Object get() {
        Drawable.ConstantState constantState = this.f13143a.getConstantState();
        return constantState == null ? this.f13143a : constantState.newDrawable();
    }

    public void initialize() {
        Bitmap bitmap;
        T t10 = this.f13143a;
        if (t10 instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) t10).getBitmap();
        } else if (t10 instanceof b2.c) {
            bitmap = ((b2.c) t10).f2210a.f2220a.f2232l;
        } else {
            return;
        }
        bitmap.prepareToDraw();
    }
}
