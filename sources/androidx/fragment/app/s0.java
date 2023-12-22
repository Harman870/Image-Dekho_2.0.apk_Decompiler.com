package androidx.fragment.app;

import androidx.fragment.app.t0;

public final class s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t0.a f1619a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t0 f1620b;

    public s0(t0 t0Var, t0.a aVar) {
        this.f1620b = t0Var;
        this.f1619a = aVar;
    }

    public final void run() {
        this.f1620b.f1623b.remove(this.f1619a);
        this.f1620b.f1624c.remove(this.f1619a);
    }
}
