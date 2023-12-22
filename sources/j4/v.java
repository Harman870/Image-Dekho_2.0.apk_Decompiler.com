package j4;

import java.util.ArrayList;
import o.c;

public final class v extends w {
    public v() {
        this.f8532a.add(g0.BITWISE_AND);
        this.f8532a.add(g0.BITWISE_LEFT_SHIFT);
        this.f8532a.add(g0.BITWISE_NOT);
        this.f8532a.add(g0.BITWISE_OR);
        this.f8532a.add(g0.BITWISE_RIGHT_SHIFT);
        this.f8532a.add(g0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f8532a.add(g0.BITWISE_XOR);
    }

    public final p a(String str, c cVar, ArrayList arrayList) {
        g0 g0Var = g0.ADD;
        switch (j4.e(str).ordinal()) {
            case 4:
                j4.h("BITWISE_AND", 2, arrayList);
                return new i(Double.valueOf((double) (j4.b(cVar.b((p) arrayList.get(0)).b().doubleValue()) & j4.b(cVar.b((p) arrayList.get(1)).b().doubleValue()))));
            case 5:
                j4.h("BITWISE_LEFT_SHIFT", 2, arrayList);
                return new i(Double.valueOf((double) (j4.b(cVar.b((p) arrayList.get(0)).b().doubleValue()) << ((int) (j4.d(cVar.b((p) arrayList.get(1)).b().doubleValue()) & 31)))));
            case 6:
                j4.h("BITWISE_NOT", 1, arrayList);
                return new i(Double.valueOf((double) (~j4.b(cVar.b((p) arrayList.get(0)).b().doubleValue()))));
            case 7:
                j4.h("BITWISE_OR", 2, arrayList);
                return new i(Double.valueOf((double) (j4.b(cVar.b((p) arrayList.get(0)).b().doubleValue()) | j4.b(cVar.b((p) arrayList.get(1)).b().doubleValue()))));
            case 8:
                j4.h("BITWISE_RIGHT_SHIFT", 2, arrayList);
                return new i(Double.valueOf((double) (j4.b(cVar.b((p) arrayList.get(0)).b().doubleValue()) >> ((int) (j4.d(cVar.b((p) arrayList.get(1)).b().doubleValue()) & 31)))));
            case 9:
                j4.h("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
                return new i(Double.valueOf((double) (j4.d(cVar.b((p) arrayList.get(0)).b().doubleValue()) >>> ((int) (j4.d(cVar.b((p) arrayList.get(1)).b().doubleValue()) & 31)))));
            case 10:
                j4.h("BITWISE_XOR", 2, arrayList);
                return new i(Double.valueOf((double) (j4.b(cVar.b((p) arrayList.get(0)).b().doubleValue()) ^ j4.b(cVar.b((p) arrayList.get(1)).b().doubleValue()))));
            default:
                b(str);
                throw null;
        }
    }
}
