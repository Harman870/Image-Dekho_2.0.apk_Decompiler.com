package androidx.fragment.app;

import androidx.fragment.app.t0;

public final class r0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t0.a f1616a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t0 f1617b;

    public r0(t0 t0Var, t0.a aVar) {
        this.f1617b = t0Var;
        this.f1616a = aVar;
    }

    public final void run() {
        if (this.f1617b.f1623b.contains(this.f1616a)) {
            t0.a aVar = this.f1616a;
            w0.a(aVar.f1628a, aVar.f1630c.F);
        }
    }
}
