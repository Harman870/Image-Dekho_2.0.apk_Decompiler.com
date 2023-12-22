package n4;

import java.util.concurrent.atomic.AtomicReference;

public final class q5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f10079a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a6 f10080b;

    public q5(a6 a6Var, long j10) {
        this.f10080b = a6Var;
        this.f10079a = j10;
    }

    public final void run() {
        this.f10080b.r(this.f10079a, true);
        this.f10080b.f9600a.v().w(new AtomicReference());
    }
}
