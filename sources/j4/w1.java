package j4;

import android.os.SystemClock;

public abstract class w1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f8533a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    public final long f8534b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8535c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c2 f8536d;

    public w1(c2 c2Var, boolean z9) {
        this.f8536d = c2Var;
        c2Var.f8074b.getClass();
        c2Var.f8074b.getClass();
        this.f8534b = SystemClock.elapsedRealtime();
        this.f8535c = z9;
    }

    public abstract void a();

    public void b() {
    }

    public final void run() {
        if (this.f8536d.f8079g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f8536d.a(e10, false, this.f8535c);
            b();
        }
    }
}
