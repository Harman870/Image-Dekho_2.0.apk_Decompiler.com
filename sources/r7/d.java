package r7;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.N;
import com.ironsource.mediationsdk.c0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.h;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ NetworkSettings f11771a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ h f11772b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ String f11773c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ String f11774d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ c0 f11775e;

    public d(c0 c0Var, NetworkSettings networkSettings, h hVar, String str, String str2) {
        this.f11775e = c0Var;
        this.f11771a = networkSettings;
        this.f11772b = hVar;
        this.f11773c = str;
        this.f11774d = str2;
    }

    public final void run() {
        c0 c0Var = this.f11775e;
        NetworkSettings networkSettings = this.f11771a;
        h hVar = this.f11772b;
        String str = this.f11773c;
        String str2 = this.f11774d;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}));
        AbstractAdapter a10 = C0180c.a().a(networkSettings, networkSettings.getInterstitialSettings(), false, false);
        if (a10 != null) {
            N n2 = new N(str, str2, networkSettings, c0Var, hVar.f4745e, a10);
            c0Var.f4347g.put(n2.n(), n2);
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}));
    }
}
