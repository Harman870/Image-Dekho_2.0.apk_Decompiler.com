package n4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j4.k0;
import j4.l0;
import j4.m0;

public final class y3 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final String f10324a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z3 f10325b;

    public y3(z3 z3Var, String str) {
        this.f10325b = z3Var;
        this.f10324a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m0 m0Var;
        if (iBinder != null) {
            try {
                int i10 = l0.f8308a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof m0) {
                    m0Var = (m0) queryLocalInterface;
                } else {
                    m0Var = new k0(iBinder);
                }
                if (m0Var == null) {
                    this.f10325b.f10345a.a().f9831i.a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f10325b.f10345a.a().f9835n.a("Install Referrer Service connected");
                this.f10325b.f10345a.d().o(new x3(this, m0Var, this));
            } catch (RuntimeException e10) {
                this.f10325b.f10345a.a().f9831i.b("Exception occurred while calling Install Referrer API", e10);
            }
        } else {
            this.f10325b.f10345a.a().f9831i.a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10325b.f10345a.a().f9835n.a("Install Referrer Service disconnected");
    }
}
