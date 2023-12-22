package j4;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import o.c;

public final class td extends j {

    /* renamed from: c  reason: collision with root package name */
    public final w5 f8483c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f8484d = new HashMap();

    public td(w5 w5Var) {
        super("require");
        this.f8483c = w5Var;
    }

    public final p c(c cVar, List list) {
        p pVar;
        j4.h("require", 1, list);
        String zzi = cVar.b((p) list.get(0)).zzi();
        if (this.f8484d.containsKey(zzi)) {
            return (p) this.f8484d.get(zzi);
        }
        w5 w5Var = this.f8483c;
        if (w5Var.f8538a.containsKey(zzi)) {
            try {
                pVar = (p) ((Callable) w5Var.f8538a.get(zzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(zzi)));
            }
        } else {
            pVar = p.f8373c0;
        }
        if (pVar instanceof j) {
            this.f8484d.put(zzi, (j) pVar);
        }
        return pVar;
    }
}
