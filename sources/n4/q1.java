package n4;

import android.os.Bundle;
import java.util.Iterator;
import m.b;
import m.g;

public final class q1 extends r2 {

    /* renamed from: b  reason: collision with root package name */
    public final b f10068b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final b f10069c = new b();

    /* renamed from: d  reason: collision with root package name */
    public long f10070d;

    public q1(n4 n4Var) {
        super(n4Var);
    }

    public final void h(long j10, String str) {
        if (str == null || str.length() == 0) {
            this.f9600a.a().f9828f.a("Ad unit id must be a non-empty string");
        } else {
            this.f9600a.d().o(new a(this, str, j10));
        }
    }

    public final void i(long j10, String str) {
        if (str == null || str.length() == 0) {
            this.f9600a.a().f9828f.a("Ad unit id must be a non-empty string");
        } else {
            this.f9600a.d().o(new u(this, str, j10));
        }
    }

    public final void j(long j10) {
        g6 m2 = this.f9600a.u().m(false);
        Iterator it = ((g.c) this.f10068b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            l(str, j10 - ((Long) this.f10068b.getOrDefault(str, null)).longValue(), m2);
        }
        if (!this.f10068b.isEmpty()) {
            k(j10 - this.f10070d, m2);
        }
        m(j10);
    }

    public final void k(long j10, g6 g6Var) {
        if (g6Var == null) {
            this.f9600a.a().f9835n.a("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            this.f9600a.a().f9835n.b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            d8.t(g6Var, bundle, true);
            this.f9600a.t().n("am", "_xa", bundle);
        }
    }

    public final void l(String str, long j10, g6 g6Var) {
        if (g6Var == null) {
            this.f9600a.a().f9835n.a("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            this.f9600a.a().f9835n.b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            d8.t(g6Var, bundle, true);
            this.f9600a.t().n("am", "_xu", bundle);
        }
    }

    public final void m(long j10) {
        Iterator it = ((g.c) this.f10068b.keySet()).iterator();
        while (it.hasNext()) {
            this.f10068b.put((String) it.next(), Long.valueOf(j10));
        }
        if (!this.f10068b.isEmpty()) {
            this.f10070d = j10;
        }
    }
}
