package s1;

import j2.i;
import o1.f;
import q1.m;
import q1.w;
import s1.h;

public final class g extends i<f, w<?>> implements h {

    /* renamed from: d  reason: collision with root package name */
    public h.a f11839d;

    public g(long j10) {
        super(j10);
    }

    public final int b(Object obj) {
        w wVar = (w) obj;
        if (wVar == null) {
            return 1;
        }
        return wVar.a();
    }

    public final void c(Object obj, Object obj2) {
        f fVar = (f) obj;
        w wVar = (w) obj2;
        h.a aVar = this.f11839d;
        if (aVar != null && wVar != null) {
            ((m) aVar).f11064e.a(wVar, true);
        }
    }
}
