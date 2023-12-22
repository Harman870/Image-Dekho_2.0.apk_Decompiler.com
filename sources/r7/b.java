package r7;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.I;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.K;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.a;
import com.ironsource.mediationsdk.bidding.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.j;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ I f11768a;

    public b(I i10) {
        this.f11768a = i10;
    }

    public final void run() {
        boolean z9;
        StringBuilder sb;
        I i10 = this.f11768a;
        if (!i10.f3911y.isEmpty()) {
            i10.w.a(i10.f3911y);
            i10.f3911y.clear();
        }
        I i11 = this.f11768a;
        long d10 = i11.f3896g.d() - (new Date().getTime() - i11.f3912z);
        if (d10 > 0) {
            IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + d10);
            new Timer().schedule(new I.e(), d10);
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            this.f11768a.d(IronSourceConstants.BN_AUCTION_REQUEST, (Object[][]) null);
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            I i12 = this.f11768a;
            if (!j.b(ContextProvider.getInstance().getApplicationContext(), i12.o())) {
                for (K next : i12.f3903o.values()) {
                    AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(next.f3988d, IronSource.AD_UNIT.BANNER, (String) null, i12.f3899j);
                    if (next.h()) {
                        if (i12.C) {
                            arrayList2.add(new a(next.l(), next.n(), createAdDataForNetworkAdapter, next, (com.ironsource.mediationsdk.bidding.b) null, (NetworkSettings) null));
                        } else {
                            Map<String, Object> a10 = next.a(createAdDataForNetworkAdapter);
                            if (a10 != null) {
                                hashMap.put(next.n(), a10);
                                sb = new StringBuilder();
                            } else {
                                next.a((int) IronSourceConstants.TROUBLESHOOTING_BN_BIDDING_DATA_MISSING, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
                            }
                        }
                    } else if (!next.h()) {
                        arrayList.add(next.n());
                        sb = new StringBuilder();
                    }
                    sb.append(next.l());
                    sb.append(next.n());
                    sb.append(",");
                    sb2.append(sb.toString());
                }
            }
            I i13 = this.f11768a;
            if (!i13.C) {
                i13.g(hashMap, arrayList, sb2);
            } else if (arrayList2.isEmpty()) {
                i13.g(hashMap, arrayList, sb2);
            } else {
                d dVar = new d();
                I.d dVar2 = new I.d(sb2, arrayList, hashMap);
                i13.d(IronSourceConstants.BN_COLLECT_TOKENS, (Object[][]) null);
                dVar.a(arrayList2, dVar2, i13.D, TimeUnit.MILLISECONDS);
            }
        }
    }
}
