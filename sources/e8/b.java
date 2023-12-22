package e8;

import android.view.View;
import android.view.ViewGroup;
import h0.g;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public final class b {
    public static int a(View view, boolean z9) {
        if (view == null) {
            return 0;
        }
        if (g(view)) {
            if (!z9) {
                return view.getLeft();
            }
            int left = view.getLeft();
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            return y.e.e(view) + left;
        } else if (!z9) {
            return view.getRight();
        } else {
            int right = view.getRight();
            WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
            return right - y.e.e(view);
        }
    }

    public static int b(View view) {
        if (view == null) {
            return 0;
        }
        return g.b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        return g.c((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    public static int d(View view, boolean z9) {
        if (view == null) {
            return 0;
        }
        if (g(view)) {
            if (!z9) {
                return view.getRight();
            }
            int right = view.getRight();
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            return right - y.e.f(view);
        } else if (!z9) {
            return view.getLeft();
        } else {
            int left = view.getLeft();
            WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
            return y.e.f(view) + left;
        }
    }

    public static int e(View view) {
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    public static int f(View view) {
        int i10;
        int e10 = e(view);
        if (view == null) {
            i10 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            i10 = g.b(marginLayoutParams) + g.c(marginLayoutParams);
        }
        return i10 + e10;
    }

    public static boolean g(View view) {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        return y.e.d(view) == 1;
    }
}
