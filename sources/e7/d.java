package e7;

import k7.a;
import k7.b;

public final class d extends t<Number> {
    public final Object a(a aVar) {
        if (aVar.W() != 9) {
            return Double.valueOf(aVar.N());
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
        h.a(number.doubleValue());
        bVar.N(number);
    }
}
