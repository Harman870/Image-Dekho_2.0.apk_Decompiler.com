package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.adsession.media.MediaEvents;
import com.iab.omid.library.ironsrc.internal.g;
import com.iab.omid.library.ironsrc.utils.c;
import com.iab.omid.library.ironsrc.utils.f;
import com.iab.omid.library.ironsrc.weakreference.b;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a  reason: collision with root package name */
    private b f3570a = new b((WebView) null);

    /* renamed from: b  reason: collision with root package name */
    private AdEvents f3571b;

    /* renamed from: c  reason: collision with root package name */
    private MediaEvents f3572c;

    /* renamed from: d  reason: collision with root package name */
    private a f3573d;

    /* renamed from: e  reason: collision with root package name */
    private long f3574e;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        a();
    }

    public void a() {
        this.f3574e = f.b();
        this.f3573d = a.AD_STATE_IDLE;
    }

    public void a(float f10) {
        g.a().a(getWebView(), f10);
    }

    public void a(WebView webView) {
        this.f3570a = new b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f3571b = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        g.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        g.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, (JSONObject) null);
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.ironsrc.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.ironsrc.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        c.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.4.2-Ironsrc");
        c.a(jSONObject4, "appId", com.iab.omid.library.ironsrc.internal.f.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        g.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f3572c = mediaEvents;
    }

    public void a(String str) {
        g.a().a(getWebView(), str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        a aVar;
        if (j10 >= this.f3574e && this.f3573d != (aVar = a.AD_STATE_NOTVISIBLE)) {
            this.f3573d = aVar;
            g.a().a(getWebView(), str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        g.a().a(getWebView(), str, jSONObject);
    }

    public void a(Date date) {
        if (date != null) {
            JSONObject jSONObject = new JSONObject();
            c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
            g.a().c(getWebView(), jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        g.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z9) {
        if (e()) {
            g.a().b(getWebView(), z9 ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.f3570a.clear();
    }

    public void b(String str, long j10) {
        if (j10 >= this.f3574e) {
            this.f3573d = a.AD_STATE_VISIBLE;
            g.a().a(getWebView(), str);
        }
    }

    public AdEvents c() {
        return this.f3571b;
    }

    public MediaEvents d() {
        return this.f3572c;
    }

    public boolean e() {
        return this.f3570a.get() != null;
    }

    public void f() {
        g.a().a(getWebView());
    }

    public void g() {
        g.a().b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f3570a.get();
    }

    public void h() {
        g.a().c(getWebView());
    }

    public void i() {
    }
}
