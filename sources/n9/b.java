package n9;

import j9.b0;
import j9.r;
import j9.x;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.logging.Logger;
import k9.e;
import m9.c;
import t9.q;
import t9.s;
import t9.t;
import y3.a;

public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10387a;

    public b(boolean z9) {
        this.f10387a = z9;
    }

    public final b0 a(f fVar) {
        boolean z9;
        b0.a aVar;
        b0.a aVar2;
        c cVar = fVar.f10391c;
        if (cVar != null) {
            x xVar = fVar.f10393e;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                cVar.f9383b.getClass();
                cVar.f9385d.e(xVar);
                cVar.f9383b.getClass();
                b0.a aVar3 = null;
                boolean z10 = true;
                if (!a.q(xVar.f9017b) || xVar.f9019d == null) {
                    cVar.f9382a.c(cVar, true, false, (IOException) null);
                    z9 = false;
                } else {
                    if ("100-continue".equalsIgnoreCase(xVar.a("Expect"))) {
                        try {
                            cVar.f9385d.c();
                            cVar.f9383b.getClass();
                            aVar2 = cVar.b(true);
                            z9 = true;
                        } catch (IOException e10) {
                            cVar.f9383b.getClass();
                            cVar.c(e10);
                            throw e10;
                        }
                    } else {
                        aVar2 = null;
                        z9 = false;
                    }
                    if (aVar2 == null) {
                        xVar.f9019d.getClass();
                        cVar.f9386e = false;
                        long a10 = xVar.f9019d.a();
                        cVar.f9383b.getClass();
                        c.a aVar4 = new c.a(cVar.f9385d.d(xVar, a10), a10);
                        Logger logger = q.f12068a;
                        s sVar = new s(aVar4);
                        xVar.f9019d.c(sVar);
                        sVar.close();
                    } else {
                        cVar.f9382a.c(cVar, true, false, (IOException) null);
                        if (cVar.a().f9412h == null) {
                            z10 = false;
                        }
                        if (!z10) {
                            cVar.f9385d.h().h();
                        }
                    }
                    aVar3 = aVar2;
                }
                try {
                    cVar.f9385d.b();
                    if (!z9) {
                        cVar.f9383b.getClass();
                    }
                    if (aVar3 == null) {
                        aVar3 = cVar.b(false);
                    }
                    aVar3.f8833a = xVar;
                    aVar3.f8837e = cVar.a().f9410f;
                    aVar3.k = currentTimeMillis;
                    aVar3.f8843l = System.currentTimeMillis();
                    b0 a11 = aVar3.a();
                    int i10 = a11.f8823c;
                    if (i10 == 100) {
                        b0.a b10 = cVar.b(false);
                        b10.f8833a = xVar;
                        b10.f8837e = cVar.a().f9410f;
                        b10.k = currentTimeMillis;
                        b10.f8843l = System.currentTimeMillis();
                        a11 = b10.a();
                        i10 = a11.f8823c;
                    }
                    cVar.f9383b.getClass();
                    if (!this.f10387a || i10 != 101) {
                        aVar = new b0.a(a11);
                        try {
                            cVar.f9383b.getClass();
                            String a12 = a11.a("Content-Type");
                            long a13 = cVar.f9385d.a(a11);
                            c.b bVar = new c.b(cVar.f9385d.f(a11), a13);
                            Logger logger2 = q.f12068a;
                            aVar.f8839g = new g(a12, a13, new t(bVar));
                        } catch (IOException e11) {
                            cVar.f9383b.getClass();
                            cVar.c(e11);
                            throw e11;
                        }
                    } else {
                        aVar = new b0.a(a11);
                        aVar.f8839g = e.f9155d;
                    }
                    b0 a14 = aVar.a();
                    if ("close".equalsIgnoreCase(a14.f8821a.a("Connection")) || "close".equalsIgnoreCase(a14.a("Connection"))) {
                        cVar.f9385d.h().h();
                    }
                    if ((i10 != 204 && i10 != 205) || a14.f8827g.a() <= 0) {
                        return a14;
                    }
                    throw new ProtocolException("HTTP " + i10 + " had non-zero Content-Length: " + a14.f8827g.a());
                } catch (IOException e12) {
                    cVar.f9383b.getClass();
                    cVar.c(e12);
                    throw e12;
                }
            } catch (IOException e13) {
                cVar.f9383b.getClass();
                cVar.c(e13);
                throw e13;
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
