package n4;

import android.os.RemoteException;
import r3.o;

public final class u6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10164a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10165b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10166c;

    public /* synthetic */ u6(Object obj, int i10, Object obj2) {
        this.f10164a = i10;
        this.f10166c = obj;
        this.f10165b = obj2;
    }

    public final void run() {
        switch (this.f10164a) {
            case 0:
                a7 a7Var = (a7) this.f10166c;
                z2 z2Var = a7Var.f9613d;
                if (z2Var == null) {
                    a7Var.f9600a.a().f9828f.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    o.h((g8) this.f10165b);
                    z2Var.r((g8) this.f10165b);
                    ((a7) this.f10166c).r();
                    return;
                } catch (RemoteException e10) {
                    ((a7) this.f10166c).f9600a.a().f9828f.b("Failed to send consent settings to the service", e10);
                    return;
                }
            default:
                synchronized (((z6) this.f10166c)) {
                    ((z6) this.f10166c).f10350a = false;
                    if (!((z6) this.f10166c).f10352c.m()) {
                        ((z6) this.f10166c).f10352c.f9600a.a().f9834m.a("Connected to remote service");
                        a7 a7Var2 = ((z6) this.f10166c).f10352c;
                        z2 z2Var2 = (z2) this.f10165b;
                        a7Var2.g();
                        o.h(z2Var2);
                        a7Var2.f9613d = z2Var2;
                        a7Var2.r();
                        a7Var2.q();
                    }
                }
                return;
        }
    }
}
