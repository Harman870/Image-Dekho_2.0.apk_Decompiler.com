package n4;

import x2.l;

public final class m5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9958a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f9959b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o3 f9960c;

    public /* synthetic */ m5(o3 o3Var, long j10, int i10) {
        this.f9958a = i10;
        this.f9960c = o3Var;
        this.f9959b = j10;
    }

    public final void run() {
        switch (this.f9958a) {
            case 0:
                ((a6) this.f9960c).f9600a.r().f10260j.b(this.f9959b);
                ((a6) this.f9960c).f9600a.a().f9834m.b("Session timeout duration set", Long.valueOf(this.f9959b));
                return;
            default:
                l7 l7Var = (l7) this.f9960c;
                long j10 = this.f9959b;
                l7Var.g();
                l7Var.k();
                l7Var.f9600a.a().f9835n.b("Activity resumed, time", Long.valueOf(j10));
                if (!l7Var.f9600a.f9992g.o((String) null, w2.f10249y0) ? l7Var.f9600a.f9992g.p() || l7Var.f9600a.r().f10266q.b() : l7Var.f9600a.f9992g.p() || l7Var.f9929d) {
                    j7 j7Var = l7Var.f9931f;
                    j7Var.f9871d.g();
                    j7Var.f9870c.a();
                    j7Var.f9868a = j10;
                    j7Var.f9869b = j10;
                }
                l lVar = l7Var.f9932g;
                ((l7) lVar.f12946b).g();
                i7 i7Var = (i7) lVar.f12945a;
                if (i7Var != null) {
                    ((l7) lVar.f12946b).f9928c.removeCallbacks(i7Var);
                }
                ((l7) lVar.f12946b).f9600a.r().f10266q.a(false);
                l7 l7Var2 = (l7) lVar.f12946b;
                l7Var2.g();
                l7Var2.f9929d = false;
                k7 k7Var = l7Var.f9930e;
                k7Var.f9895a.g();
                if (k7Var.f9895a.f9600a.g()) {
                    k7Var.f9895a.f9600a.f9998n.getClass();
                    k7Var.b(System.currentTimeMillis(), false);
                    return;
                }
                return;
        }
    }
}
