package n4;

import android.os.SystemClock;

public final class r6 extends k {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f10104e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f10105f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6(Object obj, c5 c5Var, int i10) {
        super(c5Var);
        this.f10104e = i10;
        this.f10105f = obj;
    }

    public final void b() {
        switch (this.f10104e) {
            case 0:
                a7 a7Var = (a7) this.f10105f;
                a7Var.g();
                if (a7Var.m()) {
                    a7Var.f9600a.a().f9835n.a("Inactivity, disconnecting from the service");
                    a7Var.v();
                    return;
                }
                return;
            default:
                j7 j7Var = (j7) this.f10105f;
                j7Var.f9871d.g();
                j7Var.f9871d.f9600a.f9998n.getClass();
                j7Var.a(false, SystemClock.elapsedRealtime(), false);
                q1 l6 = j7Var.f9871d.f9600a.l();
                j7Var.f9871d.f9600a.f9998n.getClass();
                l6.j(SystemClock.elapsedRealtime());
                return;
        }
    }
}
