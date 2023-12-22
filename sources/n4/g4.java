package n4;

import j4.r0;
import j4.x2;
import java.util.LinkedHashMap;
import m.f;
import r3.o;

public final class g4 extends f {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h4 f9760f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g4(h4 h4Var) {
        super(20);
        this.f9760f = h4Var;
    }

    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        o.e(str);
        h4 h4Var = this.f9760f;
        h4Var.h();
        o.e(str);
        if (!h4Var.r(str)) {
            return null;
        }
        if (!h4Var.f9800h.containsKey(str) || h4Var.f9800h.getOrDefault(str, null) == null) {
            h4Var.m(str);
        } else {
            h4Var.n(str, (x2) h4Var.f9800h.getOrDefault(str, null));
        }
        g4 g4Var = h4Var.f9802j;
        synchronized (g4Var) {
            linkedHashMap = new LinkedHashMap(g4Var.f9275a);
        }
        return (r0) linkedHashMap.get(str);
    }
}
