package r3;

import android.content.Context;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f11584a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static e1 f11585b;

    /* renamed from: c  reason: collision with root package name */
    public static HandlerThread f11586c;

    public static e1 a(Context context) {
        synchronized (f11584a) {
            if (f11585b == null) {
                f11585b = new e1(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return f11585b;
    }

    public final void b(String str, String str2, u0 u0Var, boolean z9) {
        b1 b1Var = new b1(str, str2, z9);
        e1 e1Var = (e1) this;
        synchronized (e1Var.f11575d) {
            c1 c1Var = (c1) e1Var.f11575d.get(b1Var);
            if (c1Var == null) {
                String b1Var2 = b1Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + b1Var2);
            } else if (c1Var.f11539a.containsKey(u0Var)) {
                c1Var.f11539a.remove(u0Var);
                if (c1Var.f11539a.isEmpty()) {
                    e1Var.f11577f.sendMessageDelayed(e1Var.f11577f.obtainMessage(0, b1Var), e1Var.f11579h);
                }
            } else {
                String b1Var3 = b1Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + b1Var3);
            }
        }
    }

    public abstract boolean c(b1 b1Var, u0 u0Var, String str, Executor executor);
}
