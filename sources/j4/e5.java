package j4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class e5 {
    public static p a(h4 h4Var) {
        if (h4Var == null) {
            return p.f8373c0;
        }
        int C = h4Var.C() - 1;
        if (C == 1) {
            return h4Var.B() ? new t(h4Var.w()) : p.f8380j0;
        }
        if (C == 2) {
            return h4Var.A() ? new i(Double.valueOf(h4Var.t())) : new i((Double) null);
        }
        if (C == 3) {
            return h4Var.z() ? new g(Boolean.valueOf(h4Var.y())) : new g((Boolean) null);
        }
        if (C == 4) {
            r7<h4> x9 = h4Var.x();
            ArrayList arrayList = new ArrayList();
            for (h4 a10 : x9) {
                arrayList.add(a(a10));
            }
            return new q(h4Var.v(), arrayList);
        }
        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
    }

    public static p b(Object obj) {
        if (obj == null) {
            return p.f8374d0;
        }
        if (obj instanceof String) {
            return new t((String) obj);
        }
        if (obj instanceof Double) {
            return new i((Double) obj);
        }
        if (obj instanceof Long) {
            return new i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new g((Boolean) obj);
        }
        if (obj instanceof Map) {
            m mVar = new m();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                p b10 = b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    mVar.i((String) next, b10);
                }
            }
            return mVar;
        } else if (obj instanceof List) {
            f fVar = new f();
            for (Object b11 : (List) obj) {
                fVar.r(fVar.j(), b(b11));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
