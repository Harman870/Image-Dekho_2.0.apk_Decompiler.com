package com.ironsource.sdk.k;

import a8.b;
import android.app.Activity;
import com.ironsource.sdk.c.a;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.controller.g;
import com.ironsource.sdk.controller.h;
import com.ironsource.sdk.controller.n;
import com.ironsource.sdk.k.g;
import com.ironsource.sdk.utils.a.c;
import com.ironsource.sdk.utils.a.d;
import org.json.JSONObject;

public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f5720a;

    /* renamed from: b  reason: collision with root package name */
    public final g f5721b;

    /* renamed from: c  reason: collision with root package name */
    public final d f5722c;

    /* renamed from: d  reason: collision with root package name */
    public final a f5723d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5724e = "f";

    /* renamed from: f  reason: collision with root package name */
    public g.a f5725f;

    public f(String str, com.ironsource.sdk.controller.g gVar, d dVar, a aVar, int i10) {
        c cVar = new c((com.ironsource.sdk.utils.a.a) null, 1);
        e a10 = e.a();
        x8.f.e(a10, "getInstance()");
        x8.f.f(str, "id");
        x8.f.f(gVar, "controllerManager");
        this.f5720a = str;
        this.f5721b = gVar;
        this.f5722c = cVar;
        this.f5723d = a10;
        gVar.f5399b.put(str, new a8.d(this));
    }

    public final void a() {
        this.f5721b.a(new h.b(this.f5720a, "nativeAd.destroy", new JSONObject()), (n.a) null);
    }

    public final void a(Activity activity, JSONObject jSONObject) {
        x8.f.f(activity, "activity");
        x8.f.f(jSONObject, "loadParams");
        this.f5721b.a(activity);
        this.f5721b.a(new h.b(this.f5720a, "nativeAd.load", jSONObject), (n.a) new a8.c(this, activity));
    }

    public final void a(com.ironsource.sdk.g.g gVar) {
        x8.f.f(gVar, "viewVisibilityParams");
        String str = this.f5720a;
        JSONObject put = new JSONObject().put("isVisible", gVar.f5657a).put("isWindowVisible", gVar.f5658b).put("isShown", gVar.f5659c);
        x8.f.e(put, "JSONObject()\n\t\t\t.put(ISN…ts.IS_SHOWN_KEY, isShown)");
        this.f5721b.a(new h.b(str, "nativeAd.visibilityChanged", put), (n.a) new a8.e(this));
    }

    public final void a(e eVar) {
        x8.f.f(eVar, "viewHolder");
        JSONObject put = new JSONObject().put("assetViews", eVar.a());
        JSONObject put2 = new JSONObject().put("command", "nativeAd.click").put("sdkCallback", "onReceivedMessage");
        x8.f.e(put2, "JSONObject()\n\t\t\t.put(Con…hods.ON_RECEIVED_MESSAGE)");
        JSONObject put3 = put.put("adViewClickCommand", put2);
        String str = this.f5720a;
        x8.f.e(put3, "params");
        this.f5721b.a(new h.b(str, "nativeAd.register", put3), (n.a) null);
    }

    public final void a(g.a aVar) {
        this.f5725f = aVar;
    }

    public final void a(JSONObject jSONObject) {
        x8.f.f(jSONObject, "clickParams");
        this.f5721b.a(new h.b(this.f5720a, "nativeAd.click", jSONObject), (n.a) new b(this));
    }

    public final void b() {
        this.f5721b.a(new h.b(this.f5720a, "nativeAd.privacyClick", new JSONObject()), (n.a) null);
    }
}
