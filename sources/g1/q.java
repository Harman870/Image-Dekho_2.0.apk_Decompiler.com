package g1;

import android.os.Build;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f6543a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f6544b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f6545c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z9 = true;
        if (i10 < 28) {
            z9 = false;
        }
        f6545c = z9;
    }
}
