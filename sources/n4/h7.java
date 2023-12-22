package n4;

import x2.l;

public final class h7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f9811a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l7 f9812b;

    public h7(l7 l7Var, long j10) {
        this.f9812b = l7Var;
        this.f9811a = j10;
    }

    public final void run() {
        l7 l7Var = this.f9812b;
        long j10 = this.f9811a;
        l7Var.g();
        l7Var.k();
        l7Var.f9600a.a().f9835n.b("Activity paused, time", Long.valueOf(j10));
        l lVar = l7Var.f9932g;
        ((l7) lVar.f12946b).f9600a.f9998n.getClass();
        i7 i7Var = new i7(lVar, System.currentTimeMillis(), j10);
        lVar.f12945a = i7Var;
        ((l7) lVar.f12946b).f9928c.postDelayed(i7Var, 2000);
        if (l7Var.f9600a.f9992g.p()) {
            l7Var.f9931f.f9870c.a();
        }
    }
}
