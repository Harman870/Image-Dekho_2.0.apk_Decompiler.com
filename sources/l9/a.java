package l9;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j9.b0;
import j9.c;
import j9.p;
import j9.r;
import j9.u;
import j9.v;
import j9.x;
import java.util.ArrayList;
import java.util.Collections;
import k9.e;
import n9.f;

public final class a implements r {
    public static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static boolean c(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public static b0 d(b0 b0Var) {
        if (b0Var == null || b0Var.f8827g == null) {
            return b0Var;
        }
        b0.a aVar = new b0.a(b0Var);
        aVar.f8839g = null;
        return aVar.a();
    }

    public final b0 a(f fVar) {
        System.currentTimeMillis();
        x xVar = fVar.f10393e;
        b bVar = new b(xVar, (b0) null);
        if (xVar != null) {
            c cVar = xVar.f9021f;
            if (cVar == null) {
                cVar = c.a(xVar.f9018c);
                xVar.f9021f = cVar;
            }
            if (cVar.f8854j) {
                bVar = new b((x) null, (b0) null);
            }
        }
        x xVar2 = bVar.f9255a;
        b0 b0Var = bVar.f9256b;
        if (xVar2 == null && b0Var == null) {
            b0.a aVar = new b0.a();
            aVar.f8833a = fVar.f10393e;
            aVar.f8834b = v.HTTP_1_1;
            aVar.f8835c = 504;
            aVar.f8836d = "Unsatisfiable Request (only-if-cached)";
            aVar.f8839g = e.f9155d;
            aVar.k = -1;
            aVar.f8843l = System.currentTimeMillis();
            return aVar.a();
        } else if (xVar2 == null) {
            b0Var.getClass();
            b0.a aVar2 = new b0.a(b0Var);
            b0 d10 = d(b0Var);
            if (d10 != null) {
                b0.a.b("cacheResponse", d10);
            }
            aVar2.f8841i = d10;
            return aVar2.a();
        } else {
            b0 a10 = fVar.a(xVar2);
            if (b0Var != null) {
                if (a10.f8823c == 304) {
                    b0.a aVar3 = new b0.a(b0Var);
                    p pVar = b0Var.f8826f;
                    p pVar2 = a10.f8826f;
                    ArrayList arrayList = new ArrayList(20);
                    int length = pVar.f8939a.length / 2;
                    for (int i10 = 0; i10 < length; i10++) {
                        String d11 = pVar.d(i10);
                        String g10 = pVar.g(i10);
                        if ((!"Warning".equalsIgnoreCase(d11) || !g10.startsWith(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) && (b(d11) || !c(d11) || pVar2.c(d11) == null)) {
                            k9.a.f9148a.getClass();
                            arrayList.add(d11);
                            arrayList.add(g10.trim());
                        }
                    }
                    int length2 = pVar2.f8939a.length / 2;
                    for (int i11 = 0; i11 < length2; i11++) {
                        String d12 = pVar2.d(i11);
                        if (!b(d12) && c(d12)) {
                            u.a aVar4 = k9.a.f9148a;
                            String g11 = pVar2.g(i11);
                            aVar4.getClass();
                            arrayList.add(d12);
                            arrayList.add(g11.trim());
                        }
                    }
                    p.a aVar5 = new p.a();
                    Collections.addAll(aVar5.f8940a, (String[]) arrayList.toArray(new String[arrayList.size()]));
                    aVar3.f8838f = aVar5;
                    aVar3.k = a10.k;
                    aVar3.f8843l = a10.f8831l;
                    b0 d13 = d(b0Var);
                    if (d13 != null) {
                        b0.a.b("cacheResponse", d13);
                    }
                    aVar3.f8841i = d13;
                    b0 d14 = d(a10);
                    if (d14 != null) {
                        b0.a.b("networkResponse", d14);
                    }
                    aVar3.f8840h = d14;
                    aVar3.a();
                    a10.f8827g.close();
                    throw null;
                }
                e.c(b0Var.f8827g);
            }
            b0.a aVar6 = new b0.a(a10);
            b0 d15 = d(b0Var);
            if (d15 != null) {
                b0.a.b("cacheResponse", d15);
            }
            aVar6.f8841i = d15;
            b0 d16 = d(a10);
            if (d16 != null) {
                b0.a.b("networkResponse", d16);
            }
            aVar6.f8840h = d16;
            return aVar6.a();
        }
    }
}
