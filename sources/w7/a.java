package w7;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0181d;
import com.ironsource.mediationsdk.C0187k;
import com.ironsource.mediationsdk.demandOnly.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ C0187k f12759a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ d f12760b;

    public a(d dVar, C0187k kVar) {
        this.f12760b = dVar;
        this.f12759a = kVar;
    }

    public final void run() {
        this.f12760b.l(83500, (Object[][]) null);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + this.f12759a.j());
        this.f12760b.l(83510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f12759a.j()}});
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        d dVar = this.f12760b;
        dVar.f4406r.a(applicationContext, this.f12759a, (C0181d) dVar);
    }
}
