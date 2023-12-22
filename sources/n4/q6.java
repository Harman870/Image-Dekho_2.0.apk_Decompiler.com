package n4;

import android.os.Bundle;
import android.os.RemoteException;
import r3.o;

public final class q6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g8 f10081a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f10082b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a7 f10083c;

    public q6(a7 a7Var, g8 g8Var, Bundle bundle) {
        this.f10083c = a7Var;
        this.f10081a = g8Var;
        this.f10082b = bundle;
    }

    public final void run() {
        a7 a7Var = this.f10083c;
        z2 z2Var = a7Var.f9613d;
        if (z2Var == null) {
            a7Var.f9600a.a().f9828f.a("Failed to send default event parameters to service");
            return;
        }
        try {
            o.h(this.f10081a);
            z2Var.i(this.f10082b, this.f10081a);
        } catch (RemoteException e10) {
            this.f10083c.f9600a.a().f9828f.b("Failed to send default event parameters to service", e10);
        }
    }
}
