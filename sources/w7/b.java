package w7;

import com.ironsource.mediationsdk.demandOnly.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.TimerTask;

public final class b extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ d f12761a;

    public b(d dVar) {
        this.f12761a = dVar;
    }

    public final void run() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("load timed out state=" + this.f12761a.i());
        this.f12761a.m(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "load timed out"));
    }
}
