package k6;

import j6.n;
import k6.l;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f9090a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f9091b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l.b f9092c;

    public /* synthetic */ h(k kVar, Runnable runnable, l.a aVar) {
        this.f9090a = kVar;
        this.f9091b = runnable;
        this.f9092c = aVar;
    }

    public final void run() {
        this.f9090a.f9099a.execute(new n(this.f9091b, 1, this.f9092c));
    }
}
