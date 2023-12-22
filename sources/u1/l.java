package u1;

import j2.i;
import java.util.ArrayDeque;
import u1.m;

public final class l extends i<m.a<Object>, Object> {
    public l() {
        super(500);
    }

    public final void c(Object obj, Object obj2) {
        m.a aVar = (m.a) obj;
        aVar.getClass();
        ArrayDeque arrayDeque = m.a.f12131d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar);
        }
    }
}
