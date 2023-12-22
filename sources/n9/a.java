package n9;

import j9.a0;
import j9.b0;
import j9.i;
import j9.j;
import j9.p;
import j9.r;
import j9.s;
import j9.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import k9.e;
import t9.l;
import t9.q;
import t9.t;

public final class a implements r {

    /* renamed from: a  reason: collision with root package name */
    public final j f10386a;

    public a(j.a aVar) {
        this.f10386a = aVar;
    }

    public final b0 a(f fVar) {
        boolean z9;
        x xVar = fVar.f10393e;
        xVar.getClass();
        x.a aVar = new x.a(xVar);
        a0 a0Var = xVar.f9019d;
        if (a0Var != null) {
            s b10 = a0Var.b();
            if (b10 != null) {
                aVar.f9024c.d("Content-Type", b10.f8961a);
            }
            long a10 = a0Var.a();
            if (a10 != -1) {
                aVar.f9024c.d("Content-Length", Long.toString(a10));
                aVar.c("Transfer-Encoding");
            } else {
                aVar.f9024c.d("Transfer-Encoding", "chunked");
                aVar.c("Content-Length");
            }
        }
        if (xVar.a("Host") == null) {
            aVar.f9024c.d("Host", e.k(xVar.f9016a, false));
        }
        if (xVar.a("Connection") == null) {
            aVar.f9024c.d("Connection", "Keep-Alive");
        }
        if (xVar.a("Accept-Encoding") == null && xVar.a("Range") == null) {
            aVar.f9024c.d("Accept-Encoding", "gzip");
            z9 = true;
        } else {
            z9 = false;
        }
        ((j.a) this.f10386a).getClass();
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = emptyList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb.append("; ");
                }
                i iVar = (i) emptyList.get(i10);
                sb.append(iVar.f8912a);
                sb.append('=');
                sb.append(iVar.f8913b);
            }
            aVar.f9024c.d("Cookie", sb.toString());
        }
        if (xVar.a("User-Agent") == null) {
            aVar.f9024c.d("User-Agent", "okhttp/3.14.9");
        }
        b0 a11 = fVar.a(aVar.a());
        e.d(this.f10386a, xVar.f9016a, a11.f8826f);
        b0.a aVar2 = new b0.a(a11);
        aVar2.f8833a = xVar;
        if (z9 && "gzip".equalsIgnoreCase(a11.a("Content-Encoding")) && e.b(a11)) {
            l lVar = new l(a11.f8827g.j());
            p.a e10 = a11.f8826f.e();
            e10.c("Content-Encoding");
            e10.c("Content-Length");
            ArrayList arrayList = e10.f8940a;
            p.a aVar3 = new p.a();
            Collections.addAll(aVar3.f8940a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            aVar2.f8838f = aVar3;
            String a12 = a11.a("Content-Type");
            Logger logger = q.f12068a;
            aVar2.f8839g = new g(a12, -1, new t(lVar));
        }
        return aVar2.a();
    }
}
