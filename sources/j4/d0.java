package j4;

import java.util.ArrayList;
import o.c;

public final class d0 extends w {
    public d0() {
        this.f8532a.add(g0.ADD);
        this.f8532a.add(g0.DIVIDE);
        this.f8532a.add(g0.MODULUS);
        this.f8532a.add(g0.MULTIPLY);
        this.f8532a.add(g0.NEGATE);
        this.f8532a.add(g0.POST_DECREMENT);
        this.f8532a.add(g0.POST_INCREMENT);
        this.f8532a.add(g0.PRE_DECREMENT);
        this.f8532a.add(g0.PRE_INCREMENT);
        this.f8532a.add(g0.SUBTRACT);
    }

    public final p a(String str, c cVar, ArrayList arrayList) {
        g0 g0Var = g0.ADD;
        int ordinal = j4.e(str).ordinal();
        if (ordinal == 0) {
            j4.h("ADD", 2, arrayList);
            p b10 = cVar.b((p) arrayList.get(0));
            p b11 = cVar.b((p) arrayList.get(1));
            if ((b10 instanceof l) || (b10 instanceof t) || (b11 instanceof l) || (b11 instanceof t)) {
                return new t(String.valueOf(b10.zzi()).concat(String.valueOf(b11.zzi())));
            }
            return new i(Double.valueOf(b11.b().doubleValue() + b10.b().doubleValue()));
        } else if (ordinal == 21) {
            j4.h("DIVIDE", 2, arrayList);
            return new i(Double.valueOf(cVar.b((p) arrayList.get(0)).b().doubleValue() / cVar.b((p) arrayList.get(1)).b().doubleValue()));
        } else if (ordinal == 59) {
            j4.h("SUBTRACT", 2, arrayList);
            p b12 = cVar.b((p) arrayList.get(0));
            Double valueOf = Double.valueOf(-cVar.b((p) arrayList.get(1)).b().doubleValue());
            if (valueOf == null) {
                valueOf = Double.valueOf(Double.NaN);
            }
            return new i(Double.valueOf(valueOf.doubleValue() + b12.b().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            j4.h(str, 2, arrayList);
            p b13 = cVar.b((p) arrayList.get(0));
            cVar.b((p) arrayList.get(1));
            return b13;
        } else if (ordinal == 55 || ordinal == 56) {
            j4.h(str, 1, arrayList);
            return cVar.b((p) arrayList.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    j4.h("MODULUS", 2, arrayList);
                    return new i(Double.valueOf(cVar.b((p) arrayList.get(0)).b().doubleValue() % cVar.b((p) arrayList.get(1)).b().doubleValue()));
                case 45:
                    j4.h("MULTIPLY", 2, arrayList);
                    return new i(Double.valueOf(cVar.b((p) arrayList.get(1)).b().doubleValue() * cVar.b((p) arrayList.get(0)).b().doubleValue()));
                case 46:
                    j4.h("NEGATE", 1, arrayList);
                    return new i(Double.valueOf(-cVar.b((p) arrayList.get(0)).b().doubleValue()));
                default:
                    b(str);
                    throw null;
            }
        }
    }
}
