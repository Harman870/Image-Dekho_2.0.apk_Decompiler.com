package j4;

import java.util.Collections;
import java.util.Iterator;
import o.c;

public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final r2 f8425a;

    /* renamed from: b  reason: collision with root package name */
    public c f8426b;

    /* renamed from: c  reason: collision with root package name */
    public final c f8427c = new c();

    /* renamed from: d  reason: collision with root package name */
    public final vd f8428d = new vd();

    public r0() {
        r2 r2Var = new r2();
        this.f8425a = r2Var;
        this.f8426b = r2Var.f8436b.a();
        r2Var.f8438d.f8538a.put("internal.registerCallback", new a(this));
        r2Var.f8438d.f8538a.put("internal.eventLogger", new z(this));
    }

    public final void a(f4 f4Var) {
        j jVar;
        try {
            this.f8426b = this.f8425a.f8436b.a();
            if (!(this.f8425a.a(this.f8426b, (h4[]) f4Var.v().toArray(new h4[0])) instanceof h)) {
                for (e4 e4Var : f4Var.t().w()) {
                    r7 v10 = e4Var.v();
                    String u = e4Var.u();
                    Iterator it = v10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            p a10 = this.f8425a.a(this.f8426b, (h4) it.next());
                            if (a10 instanceof m) {
                                c cVar = this.f8426b;
                                if (!cVar.g(u)) {
                                    jVar = null;
                                } else {
                                    p d10 = cVar.d(u);
                                    if (d10 instanceof j) {
                                        jVar = (j) d10;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(u)));
                                    }
                                }
                                if (jVar != null) {
                                    jVar.c(this.f8426b, Collections.singletonList(a10));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(u)));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new m1(th);
        }
    }

    public final boolean b(b bVar) {
        try {
            c cVar = this.f8427c;
            cVar.f8069a = bVar;
            cVar.f8070b = bVar.clone();
            cVar.f8071c.clear();
            this.f8425a.f8437c.f("runtime.counter", new i(Double.valueOf(0.0d)));
            this.f8428d.a(this.f8426b.a(), this.f8427c);
            c cVar2 = this.f8427c;
            if ((!cVar2.f8070b.equals(cVar2.f8069a)) || (!this.f8427c.f8071c.isEmpty())) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw new m1(th);
        }
    }
}
