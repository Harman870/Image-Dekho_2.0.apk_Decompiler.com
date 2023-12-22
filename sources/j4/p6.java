package j4;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import n4.c4;
import o.c;

public final class p6 extends j {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8386c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8387d;

    public p6(c cVar) {
        super("internal.eventLogger");
        this.f8387d = cVar;
    }

    public final p c(c cVar, List list) {
        HashMap hashMap;
        switch (this.f8386c) {
            case 0:
                j4.h(this.f8268a, 3, list);
                String zzi = cVar.b((p) list.get(0)).zzi();
                long a10 = (long) j4.a(cVar.b((p) list.get(1)).b().doubleValue());
                p b10 = cVar.b((p) list.get(2));
                if (b10 instanceof m) {
                    hashMap = j4.g((m) b10);
                } else {
                    hashMap = new HashMap();
                }
                ((c) this.f8387d).f8071c.add(new b(hashMap, a10, zzi));
                return p.f8373c0;
            default:
                try {
                    return e5.b(((Callable) this.f8387d).call());
                } catch (Exception unused) {
                    return p.f8373c0;
                }
        }
    }

    public p6(c4 c4Var) {
        super("internal.appMetadata");
        this.f8387d = c4Var;
    }
}
