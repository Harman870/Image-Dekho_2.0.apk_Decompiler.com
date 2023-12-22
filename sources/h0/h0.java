package h0;

import android.view.ViewGroup;

public final class h0 {
    public static int a(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static boolean b(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    public static void c(ViewGroup viewGroup, boolean z9) {
        viewGroup.setTransitionGroup(z9);
    }
}
