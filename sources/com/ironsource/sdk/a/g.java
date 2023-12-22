package com.ironsource.sdk.a;

import com.ironsource.mediationsdk.model.c;
import com.ironsource.mediationsdk.model.r;
import com.ironsource.mediationsdk.utils.b;
import com.ironsource.mediationsdk.utils.i;
import com.ironsource.mediationsdk.utils.n;
import com.ironsource.sdk.f.a;
import com.ironsource.sdk.g.d;
import java.util.Map;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public d f5094a;

    /* renamed from: b  reason: collision with root package name */
    public r f5095b;

    /* renamed from: c  reason: collision with root package name */
    public n f5096c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5097d;

    /* renamed from: e  reason: collision with root package name */
    public a f5098e;

    /* renamed from: f  reason: collision with root package name */
    public b f5099f;

    /* renamed from: g  reason: collision with root package name */
    public c f5100g;

    /* renamed from: h  reason: collision with root package name */
    public i f5101h;

    /* renamed from: i  reason: collision with root package name */
    public com.ironsource.mediationsdk.model.b f5102i;

    public g() {
        this.f5094a = new d();
    }

    public g(d dVar, r rVar, n nVar, boolean z9, a aVar, b bVar, c cVar, i iVar, com.ironsource.mediationsdk.model.b bVar2) {
        this.f5094a = dVar;
        this.f5095b = rVar;
        this.f5096c = nVar;
        this.f5097d = z9;
        this.f5098e = aVar;
        this.f5099f = bVar;
        this.f5100g = cVar;
        this.f5101h = iVar;
        this.f5102i = bVar2;
    }

    public static d.e a(com.ironsource.sdk.g.c cVar, d.e eVar) {
        Map<String, String> map;
        return (cVar == null || (map = cVar.f5621d) == null || map.get("rewarded") == null) ? eVar : Boolean.parseBoolean(cVar.f5621d.get("rewarded")) ? d.e.RewardedVideo : d.e.f5649c;
    }

    public static boolean a(com.ironsource.sdk.g.c cVar) {
        if (cVar == null || cVar.f5621d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.f5621d.get("inAppBidding"));
    }

    public d a() {
        return this.f5094a;
    }

    public r b() {
        return this.f5095b;
    }

    public n c() {
        return this.f5096c;
    }

    public boolean d() {
        return this.f5097d;
    }

    public a e() {
        return this.f5098e;
    }

    public b f() {
        return this.f5099f;
    }

    public c g() {
        return this.f5100g;
    }

    public i h() {
        return this.f5101h;
    }

    public com.ironsource.mediationsdk.model.b i() {
        return this.f5102i;
    }
}
