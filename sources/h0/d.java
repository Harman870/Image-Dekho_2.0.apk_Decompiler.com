package h0;

import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.activity.f;
import g0.b;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f6695a;

    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public d(DisplayCutout displayCutout) {
        this.f6695a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return b.a(this.f6695a, ((d) obj).f6695a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f6695a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("DisplayCutoutCompat{");
        g10.append(this.f6695a);
        g10.append("}");
        return g10.toString();
    }
}
