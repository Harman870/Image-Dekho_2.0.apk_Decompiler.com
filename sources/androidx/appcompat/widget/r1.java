package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import h0.l0;
import h0.y;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f933a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f934b = (Build.VERSION.SDK_INT >= 27);

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f933a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f933a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        return y.e.d(view) == 1;
    }
}
