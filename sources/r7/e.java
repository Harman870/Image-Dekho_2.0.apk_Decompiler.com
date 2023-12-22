package r7;

import androidx.fragment.app.v0;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.N;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.a;
import com.ironsource.mediationsdk.bidding.b;
import com.ironsource.mediationsdk.bidding.d;
import com.ironsource.mediationsdk.c0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ c0 f11776a;

    public e(c0 c0Var) {
        this.f11776a = c0Var;
    }

    public final void run() {
        boolean z9;
        boolean z10;
        StringBuilder sb;
        c0 c0Var = this.f11776a;
        c0Var.f4352m = "";
        c0Var.f4353n = null;
        long b10 = c0Var.w - (v0.b() - c0Var.f4360v);
        if (b10 > 0) {
            IronLog.INTERNAL.verbose("delaying auction by " + b10);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new c0.b(), b10);
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            this.f11776a.d(2000, (Object[][]) null, false);
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            c0 c0Var2 = this.f11776a;
            for (N next : c0Var2.f4347g.values()) {
                IronLog.INTERNAL.verbose();
                if (next != null && !next.k() && !c0Var2.f4345e.b(next)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (!next.h()) {
                        arrayList.add(next.n());
                        sb = new StringBuilder();
                    } else if (c0Var2.f4356q) {
                        arrayList2.add(new a(next.l(), next.n(), (AdData) null, next, (b) null, (NetworkSettings) null));
                    } else {
                        Map<String, Object> a10 = next.a((AdData) null);
                        if (a10 != null) {
                            hashMap.put(next.n(), a10);
                            sb = new StringBuilder();
                        } else {
                            c0Var2.c(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, next, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}}, false);
                        }
                    }
                    sb.append(next.l());
                    sb.append(next.n());
                    sb.append(",");
                    sb2.append(sb.toString());
                }
            }
            c0 c0Var3 = this.f11776a;
            if (!c0Var3.f4356q) {
                c0Var3.g(hashMap, arrayList, sb2.toString());
            } else if (arrayList2.isEmpty()) {
                c0Var3.g(hashMap, arrayList, sb2.toString());
            } else {
                d dVar = new d();
                c0.a aVar = new c0.a(hashMap, sb2, arrayList);
                c0Var3.d(IronSourceConstants.IS_COLLECT_TOKENS, (Object[][]) null, false);
                dVar.a(arrayList2, aVar, c0Var3.f4357r, TimeUnit.MILLISECONDS);
            }
        }
    }
}
