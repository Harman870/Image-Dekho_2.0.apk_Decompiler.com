package n4;

import android.os.Handler;
import j4.p0;
import n3.n;
import r3.o;

public abstract class k {

    /* renamed from: d  reason: collision with root package name */
    public static volatile p0 f9880d;

    /* renamed from: a  reason: collision with root package name */
    public final c5 f9881a;

    /* renamed from: b  reason: collision with root package name */
    public final n f9882b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f9883c;

    public k(c5 c5Var) {
        o.h(c5Var);
        this.f9881a = c5Var;
        this.f9882b = new n(this, 1, c5Var);
    }

    public final void a() {
        this.f9883c = 0;
        d().removeCallbacks(this.f9882b);
    }

    public abstract void b();

    public final void c(long j10) {
        a();
        if (j10 >= 0) {
            this.f9883c = this.f9881a.c().currentTimeMillis();
            if (!d().postDelayed(this.f9882b, j10)) {
                this.f9881a.a().f9828f.b("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    public final Handler d() {
        p0 p0Var;
        if (f9880d != null) {
            return f9880d;
        }
        synchronized (k.class) {
            if (f9880d == null) {
                f9880d = new p0(this.f9881a.f().getMainLooper());
            }
            p0Var = f9880d;
        }
        return p0Var;
    }
}
