package f1;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f6316a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f6317b;

    @SuppressLint({"NewApi"})
    public static boolean a() {
        try {
            if (f6317b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f6317b == null) {
                f6316a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f6317b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f6317b.invoke((Object) null, new Object[]{Long.valueOf(f6316a)})).booleanValue();
        } catch (Exception e10) {
            if (e10 instanceof InvocationTargetException) {
                Throwable cause = e10.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
            return false;
        }
    }
}
