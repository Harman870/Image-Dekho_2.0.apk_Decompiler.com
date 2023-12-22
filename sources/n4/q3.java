package n4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class q3 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final w7 f10072a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10073b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10074c;

    static {
        Class<q3> cls = q3.class;
    }

    public q3(w7 w7Var) {
        this.f10072a = w7Var;
    }

    public final void a() {
        this.f10072a.g();
        this.f10072a.d().g();
        this.f10072a.d().g();
        if (this.f10073b) {
            this.f10072a.a().f9835n.a("Unregistering connectivity change receiver");
            this.f10073b = false;
            this.f10074c = false;
            try {
                this.f10072a.f10292l.f9986a.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f10072a.a().f9828f.b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f10072a.g();
        String action = intent.getAction();
        this.f10072a.a().f9835n.b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            n3 n3Var = this.f10072a.f10283b;
            w7.H(n3Var);
            boolean k = n3Var.k();
            if (this.f10074c != k) {
                this.f10074c = k;
                this.f10072a.d().o(new p3(this, k));
                return;
            }
            return;
        }
        this.f10072a.a().f9831i.b("NetworkBroadcastReceiver received unknown action", action);
    }
}
