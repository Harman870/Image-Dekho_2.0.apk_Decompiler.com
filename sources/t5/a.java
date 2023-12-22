package t5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f12023b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f12024a = new Object();

    /* renamed from: t5.a$a  reason: collision with other inner class name */
    public class C0148a implements Handler.Callback {
        public C0148a() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            b bVar = (b) message.obj;
            synchronized (aVar.f12024a) {
                if (bVar == null || bVar == null) {
                    bVar.getClass();
                    throw null;
                }
            }
            return true;
        }
    }

    public static class b {
    }

    public a() {
        new Handler(Looper.getMainLooper(), new C0148a());
    }

    public static a a() {
        if (f12023b == null) {
            f12023b = new a();
        }
        return f12023b;
    }
}
