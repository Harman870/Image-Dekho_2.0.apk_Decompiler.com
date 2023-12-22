package com.ironsource.sdk.c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.a.h;
import com.ironsource.sdk.b.c;
import com.ironsource.sdk.c.f;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public String f5158a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5159b;

    /* renamed from: c  reason: collision with root package name */
    public WebView f5160c;

    /* renamed from: d  reason: collision with root package name */
    public com.ironsource.sdk.a f5161d;

    /* renamed from: e  reason: collision with root package name */
    public com.ironsource.sdk.b.b f5162e;

    /* renamed from: f  reason: collision with root package name */
    public Context f5163f;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f5168a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5169b;

        public a(String str, String str2) {
            this.f5168a = str;
            this.f5169b = str2;
        }

        public final void run() {
            try {
                WebView webView = d.this.f5160c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", d.this.f5159b);
                com.ironsource.sdk.b.b bVar = d.this.f5162e;
                if (bVar != null) {
                    bVar.a(this.f5168a, jSONObject);
                    com.ironsource.sdk.b.b bVar2 = d.this.f5162e;
                    bVar2.f5135a = null;
                    bVar2.f5136b = null;
                }
                d dVar = d.this;
                dVar.f5162e = null;
                dVar.f5163f = null;
            } catch (Exception e10) {
                Log.e("d", "performCleanup | could not destroy ISNAdView webView ID: " + d.this.f5159b);
                f.a(h.f5119r, (Map<String, Object>) new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).f5086a);
                d.this.b(this.f5169b, e10.getMessage());
            }
        }
    }

    public class b implements f.a {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f5171a;

        public b(String str) {
            this.f5171a = str;
        }

        public final void a(String str) {
            Logger.i("d", "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            d.this.b(this.f5171a, str);
        }

        public final void b(String str) {
            Logger.i("d", "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) d.this.f5160c.getParent()).removeView(d.this.f5160c);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            d dVar = d.this;
            synchronized (dVar) {
                dVar.a("", "");
            }
        }
    }

    public d(com.ironsource.sdk.b.a aVar, Context context, String str, com.ironsource.sdk.a aVar2) {
        this.f5163f = context;
        com.ironsource.sdk.b.b bVar = new com.ironsource.sdk.b.b();
        this.f5162e = bVar;
        bVar.f5138d = str;
        this.f5159b = str;
        bVar.f5135a = aVar;
        this.f5161d = aVar2;
    }

    public static /* synthetic */ void b(d dVar, String str) {
        Logger.i("d", "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(dVar.f5163f);
        dVar.f5160c = webView;
        webView.addJavascriptInterface(new c(dVar), "containerMsgHandler");
        dVar.f5160c.setWebViewClient(new c(new b(str)));
        com.ironsource.sdk.utils.d.a(dVar.f5160c);
        dVar.f5162e.f5137c = dVar.f5160c;
    }

    public final WebView a() {
        return this.f5160c;
    }

    public final synchronized void a(String str, String str2) {
        if (this.f5163f != null) {
            Logger.i("d", "performCleanup");
            com.ironsource.environment.thread.a.f3770a.a(new a(str, str2));
        }
    }

    public final void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, "action parameter empty");
            return;
        }
        Logger.i("d", "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.f5160c.onPause();
            } else if (str.equals("onResume")) {
                this.f5160c.onResume();
            } else {
                b(str3, "action not supported");
                return;
            }
            this.f5162e.a(str2);
        } catch (Exception unused) {
            b(str3, "failed to perform action");
        }
    }

    public final void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f5162e.b(str);
        } catch (Exception e10) {
            Logger.i("d", "sendHandleGetViewVisibility fail with reason: " + e10.getMessage());
        }
    }

    public final void b(String str, String str2) {
        com.ironsource.sdk.b.b bVar = this.f5162e;
        if (bVar != null) {
            bVar.a(str, str2);
        }
    }

    public final void b(JSONObject jSONObject, String str, String str2) {
        try {
            this.f5162e.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e10) {
            Logger.i("d", "sendMessageToAd fail message: " + e10.getMessage());
            throw e10;
        }
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        com.ironsource.sdk.b.b bVar = this.f5162e;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !bVar.c(optString)) {
                bVar.a(jSONObject.optString("controllerMsgTopic", "containerSendMessage"), jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                bVar.a(bVar.a(jSONObject).toString(), (String) null, (String) null);
            }
        } catch (JSONException e10) {
            String str2 = bVar.f5139e;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e10.printStackTrace();
        }
    }
}
