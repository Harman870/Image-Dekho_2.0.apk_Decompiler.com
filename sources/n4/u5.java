package n4;

import android.os.RemoteException;
import r3.o;
import s3.a;

public final class u5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10161a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10162b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o3 f10163c;

    public /* synthetic */ u5(o3 o3Var, Object obj, int i10) {
        this.f10161a = i10;
        this.f10163c = o3Var;
        this.f10162b = obj;
    }

    public final void run() {
        switch (this.f10161a) {
            case 0:
                ((a6) this.f10163c).z((Boolean) this.f10162b, true);
                return;
            default:
                a7 a7Var = (a7) this.f10163c;
                z2 z2Var = a7Var.f9613d;
                if (z2Var == null) {
                    a7Var.f9600a.a().f9828f.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    o.h((g8) this.f10162b);
                    z2Var.y((g8) this.f10162b);
                    ((a7) this.f10163c).f9600a.p().m();
                    ((a7) this.f10163c).k(z2Var, (a) null, (g8) this.f10162b);
                    ((a7) this.f10163c).r();
                    return;
                } catch (RemoteException e10) {
                    ((a7) this.f10163c).f9600a.a().f9828f.b("Failed to send app launch to the service", e10);
                    return;
                }
        }
    }
}
