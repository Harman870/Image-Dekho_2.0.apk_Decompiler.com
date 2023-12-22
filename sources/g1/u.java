package g1;

import android.os.Build;
import android.view.ViewGroup;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f6554a = true;

    public static void a(ViewGroup viewGroup, boolean z9) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z9);
        } else if (f6554a) {
            try {
                viewGroup.suppressLayout(z9);
            } catch (NoSuchMethodError unused) {
                f6554a = false;
            }
        }
    }
}
