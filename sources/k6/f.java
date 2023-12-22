package k6;

import k6.l;
import z.g;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f9084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f9085b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l.b f9086c;

    public /* synthetic */ f(k kVar, Runnable runnable, l.a aVar) {
        this.f9084a = kVar;
        this.f9085b = runnable;
        this.f9086c = aVar;
    }

    public final void run() {
        this.f9084a.f9099a.execute(new g(this.f9085b, 2, this.f9086c));
    }
}
