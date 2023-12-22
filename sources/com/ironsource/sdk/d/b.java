package com.ironsource.sdk.d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.ironsource.sdk.controller.C0201c;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements c, com.ironsource.sdk.e, com.ironsource.sdk.f, com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d {
    public static b k;

    /* renamed from: a  reason: collision with root package name */
    public com.ironsource.sdk.controller.g f5543a;

    /* renamed from: b  reason: collision with root package name */
    public com.ironsource.sdk.j.e f5544b;

    /* renamed from: c  reason: collision with root package name */
    public String f5545c;

    /* renamed from: d  reason: collision with root package name */
    public String f5546d;

    /* renamed from: e  reason: collision with root package name */
    public k f5547e;

    /* renamed from: f  reason: collision with root package name */
    public com.ironsource.sdk.service.d f5548f;

    /* renamed from: g  reason: collision with root package name */
    public com.ironsource.sdk.service.c f5549g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5550h = false;

    /* renamed from: i  reason: collision with root package name */
    public C0201c f5551i;

    /* renamed from: j  reason: collision with root package name */
    public FeaturesManager f5552j = FeaturesManager.getInstance();

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ JSONObject f5553a;

        public a(JSONObject jSONObject) {
            this.f5553a = jSONObject;
        }

        public final void run() {
            b.this.f5543a.a(this.f5553a);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$b  reason: collision with other inner class name */
    public class C0064b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.b f5555a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Map f5556b;

        public C0064b(com.ironsource.sdk.b bVar, Map map) {
            this.f5555a = bVar;
            this.f5556b = map;
        }

        public final void run() {
            d.e eVar = this.f5555a.a() ? d.e.f5647a : d.e.f5649c;
            com.ironsource.sdk.g.c a10 = b.this.f5547e.a(eVar, this.f5555a);
            com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
            com.ironsource.sdk.a.a a11 = aVar.a("isbiddinginstance", Boolean.valueOf(this.f5555a.f5130d)).a("isoneflow", Boolean.valueOf(this.f5555a.f5134h)).a("demandsourcename", this.f5555a.f5129c).a("producttype", com.ironsource.sdk.d.a(this.f5555a));
            com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.f5745a;
            a11.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(this.f5555a.f5128b)));
            com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5110h, (Map<String, Object>) aVar.f5086a);
            if (eVar == d.e.f5647a) {
                b bVar = b.this;
                bVar.f5543a.a(bVar.f5545c, bVar.f5546d, a10, (com.ironsource.sdk.j.a.b) bVar);
                b bVar2 = b.this;
                bVar2.f5543a.a(a10, (Map<String, String>) this.f5556b, (com.ironsource.sdk.j.a.b) bVar2);
                return;
            }
            b bVar3 = b.this;
            bVar3.f5543a.a(bVar3.f5545c, bVar3.f5546d, a10, (com.ironsource.sdk.j.a.c) bVar3);
            b bVar4 = b.this;
            bVar4.f5543a.a(a10, (Map<String, String>) this.f5556b, (com.ironsource.sdk.j.a.c) bVar4);
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.c f5558a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Map f5559b;

        public c(com.ironsource.sdk.g.c cVar, Map map) {
            this.f5558a = cVar;
            this.f5559b = map;
        }

        public final void run() {
            b bVar = b.this;
            bVar.f5543a.b(this.f5558a, this.f5559b, bVar);
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.b f5561a;

        public d(com.ironsource.sdk.b bVar) {
            this.f5561a = bVar;
        }

        public final void run() {
            com.ironsource.sdk.g.c a10 = b.this.f5547e.a(d.e.f5647a, this.f5561a);
            com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
            aVar.a("isbiddinginstance", Boolean.valueOf(this.f5561a.f5130d)).a("demandsourcename", this.f5561a.f5129c).a("producttype", com.ironsource.sdk.d.a(this.f5561a));
            com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5114m, (Map<String, Object>) aVar.f5086a);
            b.this.f5543a.a(a10);
        }
    }

    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f5563a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5564b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Map f5565c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.e f5566d;

        public e(String str, String str2, Map map, com.ironsource.sdk.j.e eVar) {
            this.f5563a = str;
            this.f5564b = str2;
            this.f5565c = map;
            this.f5566d = eVar;
        }

        public final void run() {
            b.this.f5543a.a(this.f5563a, this.f5564b, (Map<String, String>) this.f5565c, this.f5566d);
        }
    }

    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Map f5568a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.e f5569b;

        public f(Map map, com.ironsource.sdk.j.e eVar) {
            this.f5568a = map;
            this.f5569b = eVar;
        }

        public final void run() {
            b bVar = b.this;
            bVar.f5543a.a(bVar.f5545c, bVar.f5546d, (Map<String, String>) this.f5568a, this.f5569b);
        }
    }

    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Map f5571a;

        public g(Map map) {
            this.f5571a = map;
        }

        public final void run() {
            b bVar = b.this;
            bVar.f5543a.a((Map<String, String>) this.f5571a, bVar.f5544b);
        }
    }

    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f5573a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5574b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.e f5575c;

        public h(String str, String str2, com.ironsource.sdk.j.e eVar) {
            this.f5573a = str;
            this.f5574b = str2;
            this.f5575c = eVar;
        }

        public final void run() {
            b.this.f5543a.a(this.f5573a, this.f5574b, this.f5575c);
        }
    }

    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.e f5577a;

        public i(com.ironsource.sdk.j.e eVar) {
            this.f5577a = eVar;
        }

        public final void run() {
            b bVar = b.this;
            bVar.f5543a.a(bVar.f5545c, bVar.f5546d, this.f5577a);
        }
    }

    public b(Context context) {
        e(context);
    }

    public b(Context context, String str, String str2) {
        this.f5545c = str;
        this.f5546d = str2;
        e(context);
    }

    public static synchronized b a(Context context) {
        b a10;
        synchronized (b.class) {
            a10 = a(context, 0);
        }
        return a10;
    }

    public static synchronized b a(Context context, int i10) {
        b bVar;
        synchronized (b.class) {
            Logger.i("IronSourceAdsPublisherAgent", "getInstance()");
            if (k == null) {
                k = new b(context);
            }
            bVar = k;
        }
        return bVar;
    }

    public static synchronized com.ironsource.sdk.e a(String str, String str2, Context context) {
        b bVar;
        synchronized (b.class) {
            if (k == null) {
                com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5103a);
                k = new b(context, str, str2);
            } else {
                com.ironsource.sdk.service.d.a().b(str);
                com.ironsource.sdk.service.d.a().a(str2);
            }
            bVar = k;
        }
        return bVar;
    }

    public static com.ironsource.sdk.j.c b(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.c) cVar.f5624g;
    }

    public static com.ironsource.sdk.j.b d(com.ironsource.sdk.g.c cVar) {
        return (com.ironsource.sdk.j.b) cVar.f5624g;
    }

    public final com.ironsource.sdk.controller.g a() {
        return this.f5543a;
    }

    public final void a(Activity activity) {
        try {
            Logger.i("IronSourceAdsPublisherAgent", "release()");
            com.ironsource.sdk.utils.a.a();
            this.f5551i.b();
            this.f5543a.b((Context) activity);
            this.f5543a.destroy();
            this.f5543a = null;
        } catch (Exception unused) {
        }
        k = null;
    }

    public final void a(Activity activity, com.ironsource.sdk.b bVar, Map<String, String> map) {
        this.f5551i.a(activity);
        a(bVar, map);
    }

    public final void a(Activity activity, Map<String, String> map) {
        if (activity != null) {
            this.f5551i.a(activity);
        }
        this.f5543a.a((Runnable) new g(map));
    }

    public final void a(com.ironsource.sdk.b bVar) {
        Logger.d("IronSourceAdsPublisherAgent", "destroyInstance " + bVar.f5128b);
        this.f5543a.a((Runnable) new d(bVar));
    }

    public final void a(com.ironsource.sdk.b bVar, Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis();
        map.put("loadStartTime", String.valueOf(currentTimeMillis));
        com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f5745a;
        com.ironsource.sdk.service.a.a(bVar.f5128b, currentTimeMillis);
        com.ironsource.sdk.a.a aVar2 = new com.ironsource.sdk.a.a();
        aVar2.a("isbiddinginstance", Boolean.valueOf(bVar.f5130d)).a("isoneflow", Boolean.valueOf(bVar.f5134h)).a("demandsourcename", bVar.f5129c).a("producttype", com.ironsource.sdk.d.a(bVar)).a("custom_c", Long.valueOf(currentTimeMillis));
        com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5108f, (Map<String, Object>) aVar2.f5086a);
        Logger.d("IronSourceAdsPublisherAgent", "loadAd " + bVar.f5128b);
        if (bVar.f5130d || bVar.f5134h) {
            try {
                map.put("adm", SDKUtils.decodeString(map.get("adm")));
            } catch (Exception e10) {
                com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).a("isbiddinginstance", Boolean.valueOf(bVar.f5130d)).a("isoneflow", Boolean.valueOf(bVar.f5134h)).a("demandsourcename", bVar.f5129c).a("producttype", com.ironsource.sdk.d.a(bVar));
                com.ironsource.sdk.service.a aVar3 = com.ironsource.sdk.service.a.f5745a;
                com.ironsource.sdk.a.a a11 = a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(bVar.f5128b)));
                com.ironsource.sdk.service.a.b(bVar.f5128b);
                com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.k, (Map<String, Object>) a11.f5086a);
                e10.printStackTrace();
                Logger.d("IronSourceAdsPublisherAgent", "loadInAppBiddingAd failed decoding  ADM " + e10.getMessage());
            }
            f(bVar, map);
            return;
        }
        f(bVar, map);
    }

    public final void a(d.e eVar, String str) {
        com.ironsource.sdk.j.c b10;
        com.ironsource.sdk.g.c g10 = g(eVar, str);
        if (g10 != null && eVar != d.e.RewardedVideo && eVar == d.e.f5649c && (b10 = b(g10)) != null) {
            b10.onInterstitialClose();
        }
    }

    public final void a(d.e eVar, String str, com.ironsource.sdk.g.a aVar) {
        com.ironsource.sdk.j.b d10;
        com.ironsource.sdk.g.c g10 = g(eVar, str);
        if (g10 != null) {
            g10.a(2);
            if (eVar == d.e.RewardedVideo) {
                return;
            }
            if (eVar == d.e.f5649c) {
                com.ironsource.sdk.j.c b10 = b(g10);
                if (b10 != null) {
                    b10.onInterstitialInitSuccess();
                }
            } else if (eVar == d.e.f5647a && (d10 = d(g10)) != null) {
                d10.onBannerInitSuccess();
            }
        }
    }

    public final void a(d.e eVar, String str, String str2) {
        com.ironsource.sdk.j.b d10;
        com.ironsource.sdk.g.c g10 = g(eVar, str);
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("demandsourcename", str).a("producttype", eVar).a("callfailreason", str2);
        if (g10 != null) {
            com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f5745a;
            a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(g10.f5619b)));
            a10.a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.g.a(g10)));
            com.ironsource.sdk.service.a.b(g10.f5619b);
            g10.a(3);
            if (eVar != d.e.RewardedVideo) {
                if (eVar == d.e.f5649c) {
                    com.ironsource.sdk.j.c b10 = b(g10);
                    if (b10 != null) {
                        b10.onInterstitialInitFailed(str2);
                    }
                } else if (eVar == d.e.f5647a && (d10 = d(g10)) != null) {
                    d10.onBannerLoadFail(str2);
                }
            }
        }
        com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5111i, (Map<String, Object>) a10.f5086a);
    }

    public final void a(d.e eVar, String str, String str2, JSONObject jSONObject) {
        com.ironsource.sdk.j.b d10;
        com.ironsource.sdk.g.c g10 = g(eVar, str);
        if (g10 != null && !TextUtils.isEmpty(str2)) {
            try {
                Logger.i("IronSourceAdsPublisherAgent", "Received Event Notification: " + str2 + " for demand source: " + g10.f5618a);
                if (eVar == d.e.f5649c) {
                    com.ironsource.sdk.j.c b10 = b(g10);
                    if (b10 != null) {
                        jSONObject.put("demandSourceName", str);
                        b10.onInterstitialEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == d.e.RewardedVideo) {
                    if (((IronSourceBannerLayout.a) g10.f5624g) != null) {
                        jSONObject.put("demandSourceName", str);
                    }
                } else if (eVar == d.e.f5647a && (d10 = d(g10)) != null) {
                    jSONObject.put("demandSourceName", str);
                    if (str2.equalsIgnoreCase("impressions")) {
                        d10.onBannerShowSuccess();
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void a(com.ironsource.sdk.j.e eVar) {
        this.f5543a.a((Runnable) new i(eVar));
    }

    public final void a(String str) {
        g(d.e.RewardedVideo, str);
    }

    public final void a(String str, int i10) {
        g(d.e.RewardedVideo, str);
    }

    public final void a(String str, com.ironsource.sdk.c.b bVar) {
        com.ironsource.sdk.j.b d10;
        com.ironsource.sdk.g.c g10 = g(d.e.f5647a, str);
        if (g10 != null && (d10 = d(g10)) != null) {
            d10.onBannerLoadSuccess(g10.f5625h, bVar);
        }
    }

    public final void a(String str, String str2) {
        g(d.e.RewardedVideo, str);
    }

    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.f5545c = str;
        this.f5546d = str2;
        this.f5543a.a((Runnable) new h(str, str2, eVar));
    }

    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f5545c = str;
        this.f5546d = str2;
        this.f5544b = eVar;
        this.f5543a.a((Runnable) new e(str, str2, map, eVar));
    }

    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f5544b = eVar;
        this.f5543a.a((Runnable) new f(map, eVar));
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gdprConsentStatus")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("consent", Boolean.parseBoolean(jSONObject.getString("gdprConsentStatus")));
                this.f5548f.a(jSONObject2);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        this.f5543a.a((Runnable) new a(jSONObject));
    }

    public final void b(Activity activity) {
        if (!this.f5550h) {
            d(activity);
        }
    }

    public final void b(Activity activity, com.ironsource.sdk.b bVar, Map<String, String> map) {
        this.f5551i.a(activity);
        Logger.i("IronSourceAdsPublisherAgent", "showAd " + bVar.f5128b);
        com.ironsource.sdk.g.c a10 = this.f5547e.a(d.e.f5649c, bVar.f5128b);
        if (a10 != null) {
            this.f5543a.a((Runnable) new c(a10, map));
        }
    }

    public final void b(d.e eVar, String str) {
        com.ironsource.sdk.j.b d10;
        com.ironsource.sdk.g.c g10 = g(eVar, str);
        if (g10 != null && eVar != d.e.RewardedVideo) {
            if (eVar == d.e.f5649c) {
                com.ironsource.sdk.j.c b10 = b(g10);
                if (b10 != null) {
                    b10.onInterstitialClick();
                }
            } else if (eVar == d.e.f5647a && (d10 = d(g10)) != null) {
                d10.onBannerClick();
            }
        }
    }

    public final void b(String str) {
        d.e eVar = d.e.f5649c;
        com.ironsource.sdk.g.c g10 = g(eVar, str);
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("demandsourcename", str);
        if (g10 != null) {
            com.ironsource.sdk.a.a a11 = a10.a("producttype", com.ironsource.sdk.a.g.a(g10, eVar)).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.g.a(g10)));
            com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f5745a;
            a11.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(g10.f5619b)));
            com.ironsource.sdk.service.a.b(g10.f5619b);
            com.ironsource.sdk.j.c b10 = b(g10);
            if (b10 != null) {
                b10.onInterstitialLoadSuccess();
            }
        }
        com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5113l, (Map<String, Object>) a10.f5086a);
    }

    public final void b(String str, int i10) {
        com.ironsource.sdk.g.c g10 = g(d.e.f5649c, str);
        com.ironsource.sdk.j.c b10 = b(g10);
        if (g10 != null && b10 != null) {
            b10.onInterstitialAdRewarded(str, i10);
        }
    }

    public final void b(String str, String str2) {
        d.e eVar = d.e.f5649c;
        com.ironsource.sdk.g.c g10 = g(eVar, str);
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        aVar.a("callfailreason", str2).a("demandsourcename", str);
        if (g10 != null) {
            com.ironsource.sdk.a.a a10 = aVar.a("producttype", com.ironsource.sdk.a.g.a(g10, eVar)).a("generalmessage", g10.f5622e == 2 ? com.ironsource.sdk.f.b.f5600a : com.ironsource.sdk.f.b.f5601b).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.g.a(g10)));
            com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.f5745a;
            a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(g10.f5619b)));
            com.ironsource.sdk.service.a.b(g10.f5619b);
            com.ironsource.sdk.j.c b10 = b(g10);
            if (b10 != null) {
                b10.onInterstitialLoadFailed(str2);
            }
        }
        com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5109g, (Map<String, Object>) aVar.f5086a);
    }

    public final boolean b(com.ironsource.sdk.b bVar) {
        Logger.d("IronSourceAdsPublisherAgent", "isAdAvailable " + bVar.f5128b);
        com.ironsource.sdk.g.c a10 = this.f5547e.a(d.e.f5649c, bVar.f5128b);
        if (a10 == null) {
            return false;
        }
        return a10.f5623f;
    }

    public final void c(Activity activity) {
        if (!this.f5550h) {
            e(activity);
        }
    }

    public final void c(Context context, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableLifeCycleListeners", false);
        this.f5550h = optBoolean;
        if (optBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new a(this));
            } catch (Throwable th) {
                com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
                aVar.a("generalmessage", th.getMessage());
                com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5121t, (Map<String, Object>) aVar.f5086a);
            }
        }
    }

    public final void c(d.e eVar, String str) {
        com.ironsource.sdk.j.c b10;
        com.ironsource.sdk.g.c g10 = g(eVar, str);
        if (g10 != null && eVar == d.e.f5649c && (b10 = b(g10)) != null) {
            b10.onInterstitialOpen();
        }
    }

    public final void c(String str) {
        com.ironsource.sdk.j.c b10;
        com.ironsource.sdk.g.c g10 = g(d.e.f5649c, str);
        if (g10 != null && (b10 = b(g10)) != null) {
            b10.onInterstitialShowSuccess();
        }
    }

    public final void c(String str, String str2) {
        com.ironsource.sdk.j.c b10;
        com.ironsource.sdk.g.c g10 = g(d.e.f5649c, str);
        if (g10 != null && (b10 = b(g10)) != null) {
            b10.onInterstitialShowFailed(str2);
        }
    }

    public final void d(Activity activity) {
        try {
            this.f5543a.e();
            this.f5543a.b((Context) activity);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void d(String str, String str2) {
        com.ironsource.sdk.j.b d10;
        com.ironsource.sdk.g.c g10 = g(d.e.f5647a, str);
        if (g10 != null && (d10 = d(g10)) != null) {
            d10.onBannerLoadFail(str2);
        }
    }

    public final void e(Activity activity) {
        this.f5551i.a(activity);
        this.f5543a.d();
        this.f5543a.a((Context) activity);
    }

    public final void e(Context context) {
        try {
            JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
            com.ironsource.sdk.utils.b.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new com.ironsource.sdk.h.e(SDKUtils.getNetworkConfiguration().optJSONObject("storage")));
            com.ironsource.sdk.utils.b.a().a(SDKUtils.getSDKVersion());
            com.ironsource.sdk.service.d a10 = com.ironsource.sdk.service.d.a();
            a10.b();
            a10.a(context, this.f5545c, this.f5546d);
            this.f5548f = a10;
            this.f5547e = new k();
            C0201c cVar = new C0201c();
            this.f5551i = cVar;
            if (context instanceof Activity) {
                cVar.a((Activity) context);
            }
            int debugMode = this.f5552j.getDebugMode();
            this.f5543a = new com.ironsource.sdk.controller.g(context, this.f5551i, this.f5548f, this.f5547e, com.ironsource.environment.thread.a.f3770a, debugMode, this.f5552j.getDataManagerConfig(), this.f5545c, this.f5546d);
            Logger.enableLogging(debugMode);
            Logger.i("IronSourceAdsPublisherAgent", "C'tor");
            c(context, networkConfiguration);
            this.f5549g = new com.ironsource.sdk.service.c();
            com.ironsource.environment.c.e.a("sdkv", (Object) VersionInfo.VERSION);
            this.f5549g.a();
            this.f5549g.a(context);
            this.f5549g.b();
            this.f5549g.c();
            this.f5549g.b(context);
            this.f5549g.d();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void f(com.ironsource.sdk.b bVar, Map<String, String> map) {
        Logger.d("IronSourceAdsPublisherAgent", "loadOnNewInstance " + bVar.f5128b);
        this.f5543a.a((Runnable) new C0064b(bVar, map));
    }

    public final com.ironsource.sdk.g.c g(d.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f5547e.a(eVar, str);
    }
}
