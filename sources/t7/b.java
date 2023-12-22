package t7;

import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.b.j;
import com.ironsource.mediationsdk.adunit.c.d;
import com.ironsource.mediationsdk.bidding.a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.testSuite.c;
import com.ironsource.mediationsdk.utils.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ d f12028a;

    public b(d dVar) {
        this.f12028a = dVar;
    }

    public final void run() {
        j jVar;
        String str;
        String str2;
        StringBuilder sb;
        this.f12028a.f4224i = new JSONObject();
        this.f12028a.u.f4161e.a();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        d dVar = this.f12028a;
        for (NetworkSettings next : dVar.f4231q.c()) {
            c cVar = dVar.F;
            if (cVar == null || cVar.a(next, dVar.f4231q.a())) {
                if (!dVar.f4228n.b(new l(next.getProviderInstanceName(), next.getMaxAdsPerSession(dVar.f4231q.a()))) && dVar.q(next)) {
                    AdData a10 = dVar.a(next, (String) null);
                    if (next.isBidder(dVar.f4231q.a())) {
                        AdapterBaseInterface a11 = C0180c.a().a(next, dVar.f4231q.a());
                        if (!(a11 instanceof com.ironsource.mediationsdk.bidding.c)) {
                            if (a11 == null) {
                                sb = new StringBuilder("prepareAuctionCandidates - could not load network adapter ");
                                str2 = next.getProviderName();
                            } else {
                                sb = new StringBuilder("network adapter ");
                                sb.append(next.getProviderName());
                                str2 = " does not implementing BiddingDataInterface";
                            }
                            sb.append(str2);
                            str = sb.toString();
                            jVar = dVar.u.f4163g;
                            jVar.n(str);
                        } else if (dVar.f4231q.i()) {
                            arrayList2.add(new a(next.getInstanceType(dVar.f4231q.a()), next.getProviderInstanceName(), a10, (com.ironsource.mediationsdk.bidding.c) a11, dVar, next));
                        } else {
                            try {
                                Map<String, Object> a12 = ((com.ironsource.mediationsdk.bidding.c) a11).a(a10);
                                if (a12 != null) {
                                    hashMap.put(next.getProviderInstanceName(), a12);
                                    sb2.append(next.getInstanceType(dVar.f4231q.a()));
                                    sb2.append(next.getProviderInstanceName());
                                    sb2.append(",");
                                } else {
                                    dVar.u.f4163g.a((Map<String, Object>) dVar.d(a11, next), "Missing bidding data");
                                }
                            } catch (Exception e10) {
                                jVar = dVar.u.f4163g;
                                str = "prepareAuctionCandidates - exception for " + next.getProviderName() + " while calling networkAdapter.getBiddingData - " + e10;
                            }
                        }
                    } else {
                        arrayList.add(next.getProviderInstanceName());
                        sb2.append(next.getInstanceType(dVar.f4231q.a()));
                        sb2.append(next.getProviderInstanceName());
                        sb2.append(",");
                    }
                }
            }
        }
        if (this.f12028a.f4231q.i()) {
            d dVar2 = this.f12028a;
            if (arrayList2.isEmpty()) {
                dVar2.k(hashMap, arrayList, sb2.toString());
                return;
            }
            com.ironsource.mediationsdk.bidding.d dVar3 = new com.ironsource.mediationsdk.bidding.d();
            d.c cVar2 = new d.c(hashMap, sb2, arrayList);
            dVar2.u.f4160d.a();
            dVar3.a(arrayList2, cVar2, dVar2.f4231q.j(), TimeUnit.MILLISECONDS);
            return;
        }
        this.f12028a.k(hashMap, arrayList, sb2.toString());
    }
}
