package u9;

import o8.h;
import w8.l;
import x8.g;

public final class q extends g implements l<Throwable, h> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f12294c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(b bVar) {
        super(1);
        this.f12294c = bVar;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f12294c.cancel();
        return h.f10610a;
    }
}
