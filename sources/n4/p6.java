package n4;

import r3.o;

public final class p6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g8 f10062a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10063b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z7 f10064c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a7 f10065d;

    public p6(a7 a7Var, g8 g8Var, boolean z9, z7 z7Var) {
        this.f10065d = a7Var;
        this.f10062a = g8Var;
        this.f10063b = z9;
        this.f10064c = z7Var;
    }

    public final void run() {
        z7 z7Var;
        a7 a7Var = this.f10065d;
        z2 z2Var = a7Var.f9613d;
        if (z2Var == null) {
            a7Var.f9600a.a().f9828f.a("Discarding data. Failed to set user property");
            return;
        }
        o.h(this.f10062a);
        a7 a7Var2 = this.f10065d;
        if (this.f10063b) {
            z7Var = null;
        } else {
            z7Var = this.f10064c;
        }
        a7Var2.k(z2Var, z7Var, this.f10062a);
        this.f10065d.r();
    }
}
