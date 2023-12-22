package k6;

import k6.l;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f9087a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f9088b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l.b f9089c;

    public /* synthetic */ g(k kVar, Runnable runnable, l.a aVar) {
        this.f9087a = kVar;
        this.f9088b = runnable;
        this.f9089c = aVar;
    }

    public final void run() {
        this.f9087a.f9099a.execute(new j(this.f9088b, this.f9089c, 0));
    }
}
