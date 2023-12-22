package j4;

import java.util.Iterator;
import java.util.Map;

public final class j8 {
    public static final void a(Object obj, Object obj2) {
        i8 i8Var = (i8) obj;
        h8 h8Var = (h8) obj2;
        if (!i8Var.isEmpty()) {
            Iterator it = i8Var.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public static final i8 b(Object obj, Object obj2) {
        i8 i8Var = (i8) obj;
        i8 i8Var2 = (i8) obj2;
        if (!i8Var2.isEmpty()) {
            if (!i8Var.f8240a) {
                i8Var = i8Var.c();
            }
            i8Var.f();
            if (!i8Var2.isEmpty()) {
                i8Var.putAll(i8Var2);
            }
        }
        return i8Var;
    }
}
