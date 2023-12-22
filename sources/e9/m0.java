package e9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o8.h;
import w8.l;

public final class m0 extends p0 {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6252f = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: e  reason: collision with root package name */
    public final l<Throwable, h> f6253e;

    public m0(q0 q0Var) {
        this.f6253e = q0Var;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return h.f10610a;
    }

    public final void k(Throwable th) {
        if (f6252f.compareAndSet(this, 0, 1)) {
            this.f6253e.invoke(th);
        }
    }
}
