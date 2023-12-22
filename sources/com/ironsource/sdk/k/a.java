package com.ironsource.sdk.k;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.a.h;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.k.d;
import com.ironsource.sdk.k.e;
import com.ironsource.sdk.k.g;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import x8.f;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0069a f5670a = new C0069a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final g f5671b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ironsource.sdk.a.b f5672c;

    /* renamed from: d  reason: collision with root package name */
    public String f5673d;

    /* renamed from: e  reason: collision with root package name */
    public String f5674e;

    /* renamed from: f  reason: collision with root package name */
    public Long f5675f;

    /* renamed from: g  reason: collision with root package name */
    public d.a f5676g;

    /* renamed from: h  reason: collision with root package name */
    public e f5677h;

    /* renamed from: i  reason: collision with root package name */
    public c f5678i;

    /* renamed from: com.ironsource.sdk.k.a$a  reason: collision with other inner class name */
    public static final class C0069a {
        private C0069a() {
        }

        public /* synthetic */ C0069a(byte b10) {
            this();
        }
    }

    public static final class b implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ a f5679a;

        public b(a aVar) {
            this.f5679a = aVar;
        }

        public final void a() {
            d.a aVar = this.f5679a.f5676g;
            if (aVar != null) {
                aVar.onNativeAdClicked();
            }
        }

        public final void a(c cVar) {
            f.f(cVar, "adData");
            this.f5679a.f5678i = cVar;
            com.ironsource.sdk.a.b a10 = this.f5679a.f5672c;
            h.a aVar = h.f5113l;
            f.e(aVar, "loadAdSuccess");
            HashMap<String, Object> hashMap = this.f5679a.b().f5086a;
            f.e(hashMap, "baseEventParams().data");
            a10.a(aVar, hashMap);
            d.a aVar2 = this.f5679a.f5676g;
            if (aVar2 != null) {
                aVar2.onNativeAdLoadSuccess(cVar);
            }
        }

        public final void a(String str) {
            f.f(str, IronSourceConstants.EVENTS_ERROR_REASON);
            com.ironsource.sdk.a.a a10 = this.f5679a.b().a("callfailreason", str);
            com.ironsource.sdk.a.b a11 = this.f5679a.f5672c;
            h.a aVar = h.f5109g;
            f.e(aVar, "loadAdFailed");
            HashMap<String, Object> hashMap = a10.f5086a;
            f.e(hashMap, "eventParams.data");
            a11.a(aVar, hashMap);
            d.a aVar2 = this.f5679a.f5676g;
            if (aVar2 != null) {
                aVar2.onNativeAdLoadFailed(str);
            }
        }

        public final void b() {
            d.a aVar = this.f5679a.f5676g;
            if (aVar != null) {
                aVar.onNativeAdShown();
            }
        }
    }

    public static final class c implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ a f5680a;

        /* renamed from: com.ironsource.sdk.k.a$c$a  reason: collision with other inner class name */
        public /* synthetic */ class C0070a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f5681a;

            static {
                int[] iArr = new int[e.b.values().length];
                iArr[e.b.PrivacyIcon.ordinal()] = 1;
                f5681a = iArr;
            }
        }

        public c(a aVar) {
            this.f5680a = aVar;
        }

        public final void a(com.ironsource.sdk.g.g gVar) {
            f.f(gVar, "viewVisibilityParams");
            this.f5680a.f5671b.a(gVar);
        }

        public final void a(e.b bVar) {
            f.f(bVar, "viewName");
            if (C0070a.f5681a[bVar.ordinal()] == 1) {
                this.f5680a.f5671b.b();
                return;
            }
            JSONObject put = new JSONObject().put("viewName", bVar.f5718a);
            g c10 = this.f5680a.f5671b;
            f.e(put, "clickParams");
            c10.a(put);
        }
    }

    public a(String str, g gVar, com.ironsource.sdk.a.b bVar) {
        f.f(str, "id");
        f.f(gVar, "controller");
        f.f(bVar, "eventTracker");
        this.f5671b = gVar;
        this.f5672c = bVar;
        gVar.a((g.a) new b(this));
    }

    public final c a() {
        return this.f5678i;
    }

    public final void a(e eVar) {
        f.f(eVar, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> hashMap = b().f5086a;
        f.e(hashMap, "baseEventParams().data");
        linkedHashMap.putAll(hashMap);
        String jSONObject = eVar.a().toString();
        f.e(jSONObject, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put("generalmessage", jSONObject);
        com.ironsource.sdk.a.b bVar = this.f5672c;
        h.a aVar = h.f5115n;
        f.e(aVar, "registerAd");
        bVar.a(aVar, linkedHashMap);
        this.f5677h = eVar;
        eVar.f5701a = new c(this);
        this.f5671b.a(eVar);
    }

    public final com.ironsource.sdk.a.a b() {
        long j10;
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("isbiddinginstance", this.f5674e).a("demandsourcename", this.f5673d).a("producttype", d.e.NativeAd.toString());
        Long l6 = this.f5675f;
        if (l6 != null) {
            j10 = Calendar.getInstance().getTimeInMillis() - l6.longValue();
        } else {
            j10 = -1;
        }
        com.ironsource.sdk.a.a a11 = a10.a("custom_c", Long.valueOf(j10));
        f.e(a11, "ISNEventParams()\n\t\t\t.add…CUSTOM_C, loadDuration())");
        return a11;
    }
}
