package g1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final z f6555a = (Build.VERSION.SDK_INT >= 29 ? new a0() : new z());

    /* renamed from: b  reason: collision with root package name */
    public static final a f6556b = new a();

    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        public final Object get(Object obj) {
            return Float.valueOf(v.f6555a.U((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            float floatValue = ((Float) obj2).floatValue();
            v.f6555a.V((View) obj, floatValue);
        }
    }

    public class b extends Property<View, Rect> {
        public b(Class cls) {
            super(cls, "clipBounds");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            return y.f.a((View) obj);
        }

        public final void set(Object obj, Object obj2) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.f.c((View) obj, (Rect) obj2);
        }
    }

    static {
        new b(Rect.class);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f6555a.Y(view, i10, i11, i12, i13);
    }
}
