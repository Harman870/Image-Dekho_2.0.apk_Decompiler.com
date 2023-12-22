package r7;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.I;
import com.ironsource.mediationsdk.K;
import com.ironsource.mediationsdk.events.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ NetworkSettings f11769a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ I f11770b;

    public c(I i10, NetworkSettings networkSettings) {
        this.f11770b = i10;
        this.f11769a = networkSettings;
    }

    public final void run() {
        char c10;
        boolean z9;
        I i10 = this.f11770b;
        NetworkSettings networkSettings = this.f11769a;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}));
        AbstractAdapter a10 = C0180c.a().a(networkSettings, networkSettings.getBannerSettings(), false, false);
        if (a10 != null) {
            d dVar = i10.f3896g;
            int i11 = i10.f3902n;
            int i12 = i10.f3897h;
            if (i12 == 7 || i12 == 5) {
                z9 = true;
            } else {
                z9 = false;
            }
            K k = r1;
            c10 = 0;
            K k10 = new K(dVar, i10, networkSettings, a10, i11, "", (JSONObject) null, 0, "", z9);
            i10.f3903o.put(k.n(), k);
        } else {
            c10 = 0;
            ironLog.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
        }
        Object[] objArr = new Object[2];
        objArr[c10] = networkSettings.getProviderInstanceName();
        objArr[1] = Thread.currentThread().getName();
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", objArr));
    }
}
