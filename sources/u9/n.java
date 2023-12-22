package u9;

import o8.h;
import w8.l;
import x8.g;

public final class n extends g implements l<Throwable, h> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f12291c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(b bVar) {
        super(1);
        this.f12291c = bVar;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f12291c.cancel();
        return h.f10610a;
    }
}
