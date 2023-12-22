package n4;

import android.content.ServiceConnection;
import android.os.Bundle;
import j4.m0;

public final class x3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f10308a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y3 f10309b;

    public x3(y3 y3Var, m0 m0Var, ServiceConnection serviceConnection) {
        this.f10309b = y3Var;
        this.f10308a = m0Var;
    }

    public final void run() {
        y3 y3Var = this.f10309b;
        z3 z3Var = y3Var.f10325b;
        String str = y3Var.f10324a;
        m0 m0Var = this.f10308a;
        z3Var.f10345a.d().g();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            if (m0Var.z(bundle) == null) {
                z3Var.f10345a.a().f9828f.a("Install Referrer Service returned a null response");
            }
        } catch (Exception e10) {
            z3Var.f10345a.a().f9828f.b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        z3Var.f10345a.d().g();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
