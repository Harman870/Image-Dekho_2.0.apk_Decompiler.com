package s4;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public final class d extends Property<Drawable, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f11862a = new d();

    public d() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    public final void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
