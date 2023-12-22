package com.ironsource.sdk.b;

import android.annotation.TargetApi;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.sdk.c.f;
import com.ironsource.sdk.utils.Logger;

public class c extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final f.a f5141a;

    static {
        Class<c> cls = c.class;
    }

    public c(f.a aVar) {
        this.f5141a = aVar;
    }

    public static String a(String str, String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        try {
            this.f5141a.a(a("onReceivedError", String.valueOf(i10)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f5141a.a(a("onReceivedErrorM", String.valueOf(webResourceError.getErrorCode())));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f5141a.a(a("onReceivedHttpError", String.valueOf(webResourceResponse.getStatusCode())));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            Logger.e("c", "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            this.f5141a.b(renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system");
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }
}
