package n4;

import j4.tc;

public final class w5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f5 f10272a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f10273b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f10274c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f5 f10275d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a6 f10276e;

    public w5(a6 a6Var, f5 f5Var, long j10, boolean z9, f5 f5Var2) {
        this.f10276e = a6Var;
        this.f10272a = f5Var;
        this.f10273b = j10;
        this.f10274c = z9;
        this.f10275d = f5Var2;
    }

    public final void run() {
        this.f10276e.w(this.f10272a);
        a6.D(this.f10276e, this.f10272a, this.f10273b, false, this.f10274c);
        tc.b();
        if (this.f10276e.f9600a.f9992g.o((String) null, w2.f10224j0)) {
            a6.C(this.f10276e, this.f10272a, this.f10275d);
        }
    }
}
