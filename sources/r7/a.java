package r7;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.B;
import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.a0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.q;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ NetworkSettings f11763a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ q f11764b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ String f11765c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ String f11766d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ a0 f11767e;

    public a(a0 a0Var, NetworkSettings networkSettings, q qVar, String str, String str2) {
        this.f11767e = a0Var;
        this.f11763a = networkSettings;
        this.f11764b = qVar;
        this.f11765c = str;
        this.f11766d = str2;
    }

    public final void run() {
        a0 a0Var = this.f11767e;
        NetworkSettings networkSettings = this.f11763a;
        q qVar = this.f11764b;
        String str = this.f11765c;
        String str2 = this.f11766d;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}));
        AbstractAdapter a10 = C0180c.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), false, false);
        if (a10 != null) {
            B b10 = new B(str, str2, networkSettings, a0Var, qVar.f4794e, a10, a0Var.u);
            a0Var.f4080s.put(b10.n(), b10);
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}));
    }
}
