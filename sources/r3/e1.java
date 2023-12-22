package r3;

import android.content.Context;
import android.os.Looper;
import h4.b;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import v3.a;

public final class e1 extends g {
    @GuardedBy("connectionStatus")

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f11575d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Context f11576e;

    /* renamed from: f  reason: collision with root package name */
    public volatile b f11577f;

    /* renamed from: g  reason: collision with root package name */
    public final a f11578g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11579h;

    /* renamed from: i  reason: collision with root package name */
    public final long f11580i;

    /* renamed from: j  reason: collision with root package name */
    public volatile Executor f11581j;

    public e1(Context context, Looper looper) {
        d1 d1Var = new d1(this);
        this.f11576e = context.getApplicationContext();
        this.f11577f = new b(looper, d1Var);
        this.f11578g = a.b();
        this.f11579h = 5000;
        this.f11580i = 300000;
        this.f11581j = null;
    }

    public final boolean c(b1 b1Var, u0 u0Var, String str, Executor executor) {
        boolean z9;
        synchronized (this.f11575d) {
            try {
                c1 c1Var = (c1) this.f11575d.get(b1Var);
                if (executor == null) {
                    executor = this.f11581j;
                }
                if (c1Var == null) {
                    c1Var = new c1(this, b1Var);
                    c1Var.f11539a.put(u0Var, u0Var);
                    c1Var.a(str, executor);
                    this.f11575d.put(b1Var, c1Var);
                } else {
                    this.f11577f.removeMessages(0, b1Var);
                    if (!c1Var.f11539a.containsKey(u0Var)) {
                        c1Var.f11539a.put(u0Var, u0Var);
                        int i10 = c1Var.f11540b;
                        if (i10 == 1) {
                            u0Var.onServiceConnected(c1Var.f11544f, c1Var.f11542d);
                        } else if (i10 == 2) {
                            c1Var.a(str, executor);
                        }
                    } else {
                        String b1Var2 = b1Var.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + b1Var2);
                    }
                }
                z9 = c1Var.f11541c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }
}
