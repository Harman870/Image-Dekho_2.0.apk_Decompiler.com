package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;

final class ImmLeaksCleaner implements j {

    /* renamed from: a  reason: collision with root package name */
    public static int f248a;

    public ImmLeaksCleaner() {
        throw null;
    }

    public final void b(l lVar, g.b bVar) {
        if (bVar == g.b.ON_DESTROY) {
            if (f248a == 0) {
                try {
                    f248a = 2;
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    f248a = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (f248a == 1) {
                throw null;
            }
        }
    }
}
