package com.iab.omid.library.ironsrc.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.internal.g;
import com.iab.omid.library.ironsrc.utils.c;
import com.iab.omid.library.ironsrc.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public WebView f3579f;

    /* renamed from: g  reason: collision with root package name */
    private Long f3580g = null;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f3581h;

    /* renamed from: i  reason: collision with root package name */
    private final String f3582i;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WebView f3583a;

        public a() {
            this.f3583a = b.this.f3579f;
        }

        public void run() {
            this.f3583a.destroy();
        }
    }

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f3581h = map;
        this.f3582i = str;
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            c.a(jSONObject, next, injectedResourcesMap.get(next).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    public void b() {
        super.b();
        new Handler().postDelayed(new a(), Math.max(4000 - (this.f3580g == null ? 4000 : TimeUnit.MILLISECONDS.convert(f.b() - this.f3580g.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f3579f = null;
    }

    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.ironsrc.internal.f.b().a());
        this.f3579f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f3579f.getSettings().setAllowContentAccess(false);
        a(this.f3579f);
        g.a().c(this.f3579f, this.f3582i);
        for (String next : this.f3581h.keySet()) {
            g.a().a(this.f3579f, this.f3581h.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f3580g = Long.valueOf(f.b());
    }
}
