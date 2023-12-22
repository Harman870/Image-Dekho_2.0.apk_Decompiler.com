package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, ArrayList<a>> f4583a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public int f4584b;

    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public h(List<NetworkSettings> list, int i10) {
        this.f4584b = i10;
        for (NetworkSettings providerName : list) {
            this.f4583a.put(providerName.getProviderName(), new ArrayList());
        }
    }

    public final String a(String str) {
        ArrayList arrayList = this.f4583a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(str2);
                sb.append(((a) it.next()).ordinal());
                str2 = sb.toString();
                if (!it.hasNext()) {
                    break;
                }
                str2 = com.ironsource.adapters.ironsource.a.g(str2, ",");
                sb = new StringBuilder();
            }
        }
        return str2;
    }

    public final void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.f4584b != 0) {
            for (String next : this.f4583a.keySet()) {
                a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
                if (concurrentHashMap.containsKey(next)) {
                    aVar = concurrentHashMap.get(next);
                }
                ArrayList arrayList = this.f4583a.get(next);
                if (this.f4584b != -1 && arrayList.size() == this.f4584b) {
                    arrayList.remove(0);
                }
                arrayList.add(aVar);
            }
        }
    }
}
