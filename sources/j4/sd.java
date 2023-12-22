package j4;

import java.util.List;
import java.util.TreeMap;
import o.c;

public final class sd extends j {

    /* renamed from: c  reason: collision with root package name */
    public final vd f8468c;

    public sd(vd vdVar) {
        super("internal.registerCallback");
        this.f8468c = vdVar;
    }

    public final p c(c cVar, List list) {
        int i10;
        TreeMap treeMap;
        j4.h(this.f8268a, 3, list);
        cVar.b((p) list.get(0)).zzi();
        p b10 = cVar.b((p) list.get(1));
        if (b10 instanceof o) {
            p b11 = cVar.b((p) list.get(2));
            if (b11 instanceof m) {
                m mVar = (m) b11;
                if (mVar.g("type")) {
                    String zzi = mVar.h("type").zzi();
                    if (mVar.g("priority")) {
                        i10 = j4.b(mVar.h("priority").b().doubleValue());
                    } else {
                        i10 = 1000;
                    }
                    vd vdVar = this.f8468c;
                    o oVar = (o) b10;
                    vdVar.getClass();
                    if ("create".equals(zzi)) {
                        treeMap = vdVar.f8531b;
                    } else if ("edit".equals(zzi)) {
                        treeMap = vdVar.f8530a;
                    } else {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(zzi)));
                    }
                    if (treeMap.containsKey(Integer.valueOf(i10))) {
                        i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
                    }
                    treeMap.put(Integer.valueOf(i10), oVar);
                    return p.f8373c0;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
