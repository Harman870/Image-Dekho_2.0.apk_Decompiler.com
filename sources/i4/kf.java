package i4;

import c6.b;
import c6.f;
import i6.e0;
import i6.h0;
import i6.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import r3.o;

public final class kf extends eg {
    public kf(f fVar) {
        this.f7292a = new nf(fVar);
        this.f7293b = Executors.newCachedThreadPool();
    }

    public static h0 b(f fVar, rg rgVar) {
        o.h(fVar);
        o.h(rgVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e0(rgVar));
        List list = rgVar.f7656f.f7268a;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                arrayList.add(new e0((c) list.get(i10)));
            }
        }
        h0 h0Var = new h0(fVar, arrayList);
        h0Var.f7904i = new j0(rgVar.f7660j, rgVar.f7659i);
        h0Var.f7905j = rgVar.k;
        h0Var.k = rgVar.f7661l;
        h0Var.J(b.G(rgVar.f7662m));
        return h0Var;
    }
}
