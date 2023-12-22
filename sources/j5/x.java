package j5;

import android.graphics.PorterDuff;
import android.view.View;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public final class x {

    public interface a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f8712a;

        /* renamed from: b  reason: collision with root package name */
        public int f8713b;

        /* renamed from: c  reason: collision with root package name */
        public int f8714c;

        public b(int i10, int i11, int i12, int i13) {
            this.f8712a = i10;
            this.f8713b = i12;
            this.f8714c = i13;
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        return y.e.d(view) == 1;
    }

    public static PorterDuff.Mode b(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
