package i6;

import i4.yd;
import java.util.HashMap;
import java.util.Map;
import q1.t;
import u3.a;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7915a = new a("GetTokenResultFactory", new String[0]);

    public static t a(String str) {
        Map map;
        try {
            map = m.b(str);
        } catch (yd e10) {
            f7915a.b("Error parsing token claims", e10, new Object[0]);
            map = new HashMap();
        }
        return new t(str, map);
    }
}
