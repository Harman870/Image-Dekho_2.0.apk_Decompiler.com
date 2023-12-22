package f9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import c.a;
import o8.f;

public final class c {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new a(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            obj = a.d(th);
        }
        if (obj instanceof f.a) {
            obj = null;
        }
        b bVar = (b) obj;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
