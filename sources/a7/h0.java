package a7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

public final class h0 {

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<h0> f132b;

    /* renamed from: a  reason: collision with root package name */
    public e0 f133a;

    public h0(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
    }

    public final synchronized g0 a() {
        String peek;
        g0 g0Var;
        e0 e0Var = this.f133a;
        synchronized (e0Var.f118d) {
            peek = e0Var.f118d.peek();
        }
        Pattern pattern = g0.f128d;
        g0Var = null;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                g0Var = new g0(split[0], split[1]);
            }
        }
        return g0Var;
    }
}
