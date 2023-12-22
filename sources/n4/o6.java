package n4;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import r3.o;

public final class o6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10041a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g8 f10042b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f10043c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a7 f10044d;

    public o6(a7 a7Var, AtomicReference atomicReference, g8 g8Var, boolean z9) {
        this.f10044d = a7Var;
        this.f10041a = atomicReference;
        this.f10042b = g8Var;
        this.f10043c = z9;
    }

    public final void run() {
        synchronized (this.f10041a) {
            try {
                a7 a7Var = this.f10044d;
                z2 z2Var = a7Var.f9613d;
                if (z2Var == null) {
                    a7Var.f9600a.a().f9828f.a("Failed to get all user properties; not connected to service");
                    this.f10041a.notify();
                    return;
                }
                o.h(this.f10042b);
                this.f10041a.set(z2Var.p(this.f10042b, this.f10043c));
                this.f10044d.r();
                this.f10041a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f10044d.f9600a.a().f9828f.b("Failed to get all user properties; remote exception", e10);
                } catch (Throwable th) {
                    this.f10041a.notify();
                    throw th;
                }
            }
        }
    }
}
