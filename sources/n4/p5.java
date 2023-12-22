package n4;

import java.util.concurrent.atomic.AtomicReference;

public final class p5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10060b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a6 f10061c;

    public p5(a6 a6Var, AtomicReference atomicReference) {
        this.f10061c = a6Var;
        this.f10059a = atomicReference;
    }

    public final void run() {
        a7 v10 = this.f10061c.f9600a.v();
        AtomicReference atomicReference = this.f10059a;
        boolean z9 = this.f10060b;
        v10.g();
        v10.h();
        v10.s(new o6(v10, atomicReference, v10.p(false), z9));
    }
}
