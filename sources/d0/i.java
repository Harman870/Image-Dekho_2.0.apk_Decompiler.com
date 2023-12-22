package d0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

@Deprecated
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f6035a = 0;

    public static class a {
        public static void a(String str) {
            Trace.beginSection(str);
        }

        public static void b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }
}
