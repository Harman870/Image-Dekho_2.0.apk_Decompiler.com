package t7;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.b.j;
import com.ironsource.mediationsdk.adunit.c.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ NetworkSettings f12026a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ d f12027b;

    public a(d dVar, NetworkSettings networkSettings) {
        this.f12027b = dVar;
        this.f12026a = networkSettings;
    }

    public final void run() {
        d dVar = this.f12027b;
        NetworkSettings networkSettings = this.f12026a;
        IronLog.INTERNAL.verbose(dVar.b(String.format("Start initializing provider %s on thread %s", new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()})));
        AdData a10 = dVar.a(networkSettings, dVar.f4231q.b());
        AdapterBaseInterface a11 = C0180c.a().a(networkSettings, dVar.f4231q.a());
        if (a11 != null) {
            try {
                a11.init(a10, ContextProvider.getInstance().getApplicationContext(), (NetworkInitializationListener) null);
            } catch (Exception e10) {
                j jVar = dVar.u.f4163g;
                jVar.n("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e10);
            }
        }
        IronLog.INTERNAL.verbose(dVar.b(String.format("Done initializing provider %s on thread %s", new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()})));
    }
}
