package e7;

import java.util.concurrent.atomic.AtomicLong;
import k7.a;
import k7.b;

public final class f extends t<AtomicLong> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f6200a;

    public f(t tVar) {
        this.f6200a = tVar;
    }

    public final Object a(a aVar) {
        return new AtomicLong(((Number) this.f6200a.a(aVar)).longValue());
    }

    public final void b(b bVar, Object obj) {
        this.f6200a.b(bVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
