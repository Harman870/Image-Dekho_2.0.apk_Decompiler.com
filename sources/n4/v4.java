package n4;

import android.os.RemoteException;
import j4.x0;
import r3.o;
import s3.a;

public final class v4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10186a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f10187b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10188c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f10189d;

    public /* synthetic */ v4(Object obj, a aVar, Object obj2, int i10) {
        this.f10186a = i10;
        this.f10189d = obj;
        this.f10187b = aVar;
        this.f10188c = obj2;
    }

    public final void run() {
        switch (this.f10186a) {
            case 0:
                ((z4) this.f10189d).f10346a.b();
                ((z4) this.f10189d).f10346a.j((r) this.f10187b, (String) this.f10188c);
                return;
            default:
                String str = null;
                try {
                    if (!((a7) this.f10189d).f9600a.r().m().f(e5.ANALYTICS_STORAGE)) {
                        ((a7) this.f10189d).f9600a.a().k.a("Analytics storage consent denied; will not get app instance id");
                        ((a7) this.f10189d).f9600a.t().f9605g.set((Object) null);
                        ((a7) this.f10189d).f9600a.r().f10256f.b((String) null);
                    } else {
                        a7 a7Var = (a7) this.f10189d;
                        z2 z2Var = a7Var.f9613d;
                        if (z2Var == null) {
                            a7Var.f9600a.a().f9828f.a("Failed to get app instance id");
                        } else {
                            o.h((g8) this.f10187b);
                            str = z2Var.t((g8) this.f10187b);
                            if (str != null) {
                                ((a7) this.f10189d).f9600a.t().f9605g.set(str);
                                ((a7) this.f10189d).f9600a.r().f10256f.b(str);
                            }
                            ((a7) this.f10189d).r();
                        }
                    }
                } catch (RemoteException e10) {
                    ((a7) this.f10189d).f9600a.a().f9828f.b("Failed to get app instance id", e10);
                } catch (Throwable th) {
                    ((a7) this.f10189d).f9600a.x().F((String) null, (x0) this.f10188c);
                    throw th;
                }
                ((a7) this.f10189d).f9600a.x().F(str, (x0) this.f10188c);
                return;
        }
    }
}
