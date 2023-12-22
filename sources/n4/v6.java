package n4;

import r3.o;

public final class v6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g8 f10196a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10197b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f10198c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a7 f10199d;

    public v6(a7 a7Var, g8 g8Var, boolean z9, c cVar) {
        this.f10199d = a7Var;
        this.f10196a = g8Var;
        this.f10197b = z9;
        this.f10198c = cVar;
    }

    public final void run() {
        c cVar;
        a7 a7Var = this.f10199d;
        z2 z2Var = a7Var.f9613d;
        if (z2Var == null) {
            a7Var.f9600a.a().f9828f.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        o.h(this.f10196a);
        a7 a7Var2 = this.f10199d;
        if (this.f10197b) {
            cVar = null;
        } else {
            cVar = this.f10198c;
        }
        a7Var2.k(z2Var, cVar, this.f10196a);
        this.f10199d.r();
    }
}
