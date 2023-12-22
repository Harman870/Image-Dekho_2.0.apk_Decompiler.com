package com.ironsource.sdk.g;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.sdk.b;
import com.ironsource.sdk.j.a;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f5618a;

    /* renamed from: b  reason: collision with root package name */
    public String f5619b;

    /* renamed from: c  reason: collision with root package name */
    public int f5620c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f5621d;

    /* renamed from: e  reason: collision with root package name */
    public int f5622e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5623f;

    /* renamed from: g  reason: collision with root package name */
    public a f5624g;

    /* renamed from: h  reason: collision with root package name */
    public b f5625h;

    public c() {
        throw null;
    }

    public c(b bVar) {
        String str = bVar.f5128b;
        String str2 = bVar.f5129c;
        HashMap hashMap = new HashMap();
        hashMap.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, bVar.f5128b);
        hashMap.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_NAME, bVar.f5129c);
        hashMap.put("rewarded", Boolean.toString(bVar.f5127a));
        hashMap.put("inAppBidding", Boolean.toString(bVar.f5130d));
        hashMap.put("isOneFlow", Boolean.toString(bVar.f5134h));
        hashMap.put("apiVersion", "2");
        com.ironsource.sdk.a aVar = bVar.f5131e;
        String str3 = "0";
        hashMap.put("width", aVar != null ? Integer.toString(aVar.f5083a) : str3);
        com.ironsource.sdk.a aVar2 = bVar.f5131e;
        hashMap.put("height", aVar2 != null ? Integer.toString(aVar2.f5084b) : str3);
        com.ironsource.sdk.a aVar3 = bVar.f5131e;
        hashMap.put("label", aVar3 != null ? aVar3.f5085c : "");
        hashMap.put("isBanner", Boolean.toString(bVar.a()));
        Map<String, String> map = bVar.f5132f;
        if (map != null) {
            hashMap.putAll(map);
        }
        a aVar4 = bVar.f5133g;
        this.f5620c = -1;
        this.f5619b = str;
        this.f5618a = str2;
        this.f5621d = hashMap;
        this.f5624g = aVar4;
        this.f5622e = 0;
        this.f5623f = false;
        this.f5625h = bVar;
    }

    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f5619b);
        hashMap.put("demandSourceName", this.f5618a);
        Map<String, String> map = this.f5621d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final synchronized void a(int i10) {
        this.f5622e = i10;
    }
}
