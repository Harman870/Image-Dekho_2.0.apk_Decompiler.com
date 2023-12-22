package i4;

import java.util.Iterator;
import java.util.Map;

public final class x1 {
    public static final void a(Object obj, Object obj2) {
        w1 w1Var = (w1) obj;
        v1 v1Var = (v1) obj2;
        if (!w1Var.isEmpty()) {
            Iterator it = w1Var.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public static final boolean b(Object obj) {
        return !((w1) obj).f7756a;
    }

    public static final w1 c(Object obj, Object obj2) {
        w1 w1Var = (w1) obj;
        w1 w1Var2 = (w1) obj2;
        if (!w1Var2.isEmpty()) {
            if (!w1Var.f7756a) {
                w1Var = w1Var.c();
            }
            w1Var.f();
            if (!w1Var2.isEmpty()) {
                w1Var.putAll(w1Var2);
            }
        }
        return w1Var;
    }
}
