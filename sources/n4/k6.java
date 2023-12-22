package n4;

import c4.f;

public final class k6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g6 f9892a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f9893b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l6 f9894c;

    public k6(l6 l6Var, g6 g6Var, long j10) {
        this.f9894c = l6Var;
        this.f9892a = g6Var;
        this.f9893b = j10;
    }

    public final void run() {
        this.f9894c.l(this.f9892a, false, this.f9893b);
        l6 l6Var = this.f9894c;
        l6Var.f9921e = null;
        a7 v10 = l6Var.f9600a.v();
        v10.g();
        v10.h();
        v10.s(new f(v10, (Object) null, 2));
    }
}
