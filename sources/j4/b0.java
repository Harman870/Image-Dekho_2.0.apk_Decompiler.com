package j4;

import java.util.ArrayList;
import o.c;

public final class b0 extends w {
    public b0() {
        this.f8532a.add(g0.AND);
        this.f8532a.add(g0.NOT);
        this.f8532a.add(g0.OR);
    }

    public final p a(String str, c cVar, ArrayList arrayList) {
        g0 g0Var = g0.ADD;
        int ordinal = j4.e(str).ordinal();
        if (ordinal == 1) {
            j4.h("AND", 2, arrayList);
            p b10 = cVar.b((p) arrayList.get(0));
            if (!b10.k().booleanValue()) {
                return b10;
            }
        } else if (ordinal == 47) {
            j4.h("NOT", 1, arrayList);
            return new g(Boolean.valueOf(!cVar.b((p) arrayList.get(0)).k().booleanValue()));
        } else if (ordinal == 50) {
            j4.h("OR", 2, arrayList);
            p b11 = cVar.b((p) arrayList.get(0));
            if (b11.k().booleanValue()) {
                return b11;
            }
        } else {
            b(str);
            throw null;
        }
        return cVar.b((p) arrayList.get(1));
    }
}
