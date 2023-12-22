package n4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import i4.b7;
import java.util.concurrent.atomic.AtomicReference;
import r3.o;

public final class u4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10158a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10159b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10160c;

    public /* synthetic */ u4(Object obj, int i10, Object obj2) {
        this.f10158a = i10;
        this.f10160c = obj;
        this.f10159b = obj2;
    }

    public final void run() {
        switch (this.f10158a) {
            case 0:
                ((z4) this.f10160c).f10346a.b();
                w7 w7Var = ((z4) this.f10160c).f10346a;
                g8 g8Var = (g8) this.f10159b;
                w7Var.d().g();
                w7Var.g();
                o.e(g8Var.f9768a);
                f5 b10 = f5.b(100, g8Var.f9787v);
                f5 M = w7Var.M(g8Var.f9768a);
                w7Var.a().f9835n.c("Setting consent, package, consent", g8Var.f9768a, b10);
                w7Var.r(g8Var.f9768a, b10);
                if (b10.g(M, (e5[]) b10.f9744a.keySet().toArray(new e5[0]))) {
                    w7Var.p(g8Var);
                    return;
                }
                return;
            case 1:
                a6 a6Var = (a6) this.f10160c;
                Bundle bundle = (Bundle) this.f10159b;
                a6Var.g();
                a6Var.h();
                o.h(bundle);
                String string = bundle.getString("name");
                o.e(string);
                if (!a6Var.f9600a.g()) {
                    a6Var.f9600a.a().f9835n.a("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                z7 z7Var = new z7(0, (Object) null, string, "");
                try {
                    d8 x9 = a6Var.f9600a.x();
                    bundle.getString("app_id");
                    c cVar = r4;
                    c cVar2 = new c(bundle.getString("app_id"), "", z7Var, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (r) null, bundle.getLong("trigger_timeout"), (r) null, bundle.getLong("time_to_live"), x9.n0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true));
                    a6Var.f9600a.v().l(cVar);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 2:
                synchronized (((AtomicReference) this.f10159b)) {
                    try {
                        Object obj = this.f10160c;
                        ((AtomicReference) this.f10159b).set(Long.valueOf(((a6) obj).f9600a.f9992g.l(((a6) obj).f9600a.o().l(), w2.M)));
                        ((AtomicReference) this.f10159b).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f10159b).notify();
                        throw th;
                    }
                }
                return;
            case 3:
                a7 a7Var = (a7) this.f10160c;
                z2 z2Var = a7Var.f9613d;
                if (z2Var == null) {
                    a7Var.f9600a.a().f9828f.a("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    o.h((g8) this.f10159b);
                    z2Var.v((g8) this.f10159b);
                } catch (RemoteException e10) {
                    ((a7) this.f10160c).f9600a.a().f9828f.b("Failed to reset data on the service: remote exception", e10);
                }
                ((a7) this.f10160c).r();
                return;
            case 4:
                synchronized (((z6) this.f10160c)) {
                    ((z6) this.f10160c).f10350a = false;
                    if (!((z6) this.f10160c).f10352c.m()) {
                        ((z6) this.f10160c).f10352c.f9600a.a().f9835n.a("Connected to service");
                        a7 a7Var2 = ((z6) this.f10160c).f10352c;
                        z2 z2Var2 = (z2) this.f10159b;
                        a7Var2.g();
                        o.h(z2Var2);
                        a7Var2.f9613d = z2Var2;
                        a7Var2.r();
                        a7Var2.q();
                    }
                }
                return;
            default:
                ((AppMeasurementDynamiteService) this.f10160c).f2841a.t().v((b7) this.f10159b);
                return;
        }
    }
}
