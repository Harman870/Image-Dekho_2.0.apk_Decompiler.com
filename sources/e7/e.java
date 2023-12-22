package e7;

import k7.a;
import k7.b;

public final class e extends t<Number> {
    public final Object a(a aVar) {
        if (aVar.W() != 9) {
            return Float.valueOf((float) aVar.N());
        }
        aVar.S();
        return null;
    }

    public final void b(b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.v();
            return;
        }
        h.a((double) number.floatValue());
        bVar.N(number);
    }
}
