package n3;

import android.os.Bundle;
import j4.nc;
import j4.oc;
import n4.a7;
import n4.i7;
import n4.l7;
import n4.w2;
import n4.z6;
import x2.l;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9547a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9548b;

    public /* synthetic */ m(int i10, Object obj) {
        this.f9547a = i10;
        this.f9548b = obj;
    }

    public final void run() {
        switch (this.f9547a) {
            case 0:
                p pVar = (p) this.f9548b;
                synchronized (pVar) {
                    if (pVar.f9555a == 1) {
                        pVar.a(1, "Timed out while binding");
                    }
                }
                return;
            case 1:
                a7 a7Var = ((z6) this.f9548b).f10352c;
                a7Var.f9613d = null;
                a7Var.q();
                return;
            default:
                i7 i7Var = (i7) this.f9548b;
                l lVar = i7Var.f9853c;
                long j10 = i7Var.f9851a;
                long j11 = i7Var.f9852b;
                ((l7) lVar.f12946b).g();
                ((l7) lVar.f12946b).f9600a.a().f9834m.a("Application going to the background");
                ((l7) lVar.f12946b).f9600a.r().f10266q.a(true);
                l7 l7Var = (l7) lVar.f12946b;
                l7Var.g();
                l7Var.f9929d = true;
                if (!((l7) lVar.f12946b).f9600a.f9992g.p()) {
                    ((l7) lVar.f12946b).f9931f.f9870c.a();
                    ((l7) lVar.f12946b).f9931f.a(false, j11, false);
                }
                ((oc) nc.f8343b.f8344a.zza()).zza();
                if (((l7) lVar.f12946b).f9600a.f9992g.o((String) null, w2.u0)) {
                    ((l7) lVar.f12946b).f9600a.a().f9833l.b("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
                    return;
                } else {
                    ((l7) lVar.f12946b).f9600a.t().o("auto", "_ab", new Bundle(), j10);
                    return;
                }
        }
    }
}
