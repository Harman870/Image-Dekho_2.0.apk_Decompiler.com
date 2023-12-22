package com.ironsource.sdk.controller;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.w0;
import com.ironsource.environment.StringUtils;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.h;
import com.ironsource.sdk.controller.n;
import com.ironsource.sdk.controller.q;
import com.ironsource.sdk.f.a;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class A extends WebView implements DownloadListener, n, com.ironsource.sdk.l.f {

    /* renamed from: b  reason: collision with root package name */
    public static String f5180b = "is_store";

    /* renamed from: c  reason: collision with root package name */
    public static String f5181c = "external_url";

    /* renamed from: d  reason: collision with root package name */
    public static String f5182d = "secondary_web_view";

    /* renamed from: q0  reason: collision with root package name */
    public static int f5183q0;
    public com.ironsource.sdk.j.a.c A;
    public com.ironsource.sdk.j.e B;
    public com.ironsource.sdk.j.a.b C;
    public Boolean D = null;
    public String E;
    public f F;
    public ControllerActivity G;
    public com.ironsource.sdk.g.b H;
    public Object I = new Object();
    public boolean J = false;
    public k K;
    public t L;
    public u M;
    public y N;
    public l O;
    public C0199a P;
    public m Q;
    public a R;
    public z7.b S;
    public j T;
    public JSONObject U;
    public n.a V;
    public n.b W;

    /* renamed from: a  reason: collision with root package name */
    public final com.ironsource.environment.thread.a f5184a;

    /* renamed from: e  reason: collision with root package name */
    public String f5185e = "A";

    /* renamed from: f  reason: collision with root package name */
    public CountDownTimer f5186f;

    /* renamed from: g  reason: collision with root package name */
    public String f5187g = IronSourceConstants.IRONSOURCE_CONFIG_NAME;

    /* renamed from: h  reason: collision with root package name */
    public String f5188h;

    /* renamed from: i  reason: collision with root package name */
    public String f5189i;

    /* renamed from: j  reason: collision with root package name */
    public Map<String, String> f5190j;
    public final com.ironsource.sdk.l.d k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5191l;

    /* renamed from: m  reason: collision with root package name */
    public t f5192m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5193n;

    /* renamed from: o  reason: collision with root package name */
    public CountDownTimer f5194o;

    /* renamed from: o0  reason: collision with root package name */
    public C0201c f5195o0;

    /* renamed from: p  reason: collision with root package name */
    public int f5196p = 50;
    public com.ironsource.sdk.j.f p0;

    /* renamed from: q  reason: collision with root package name */
    public int f5197q = 50;

    /* renamed from: r  reason: collision with root package name */
    public String f5198r = "top-right";

    /* renamed from: s  reason: collision with root package name */
    public final s f5199s;

    /* renamed from: t  reason: collision with root package name */
    public View f5200t;
    public FrameLayout u;

    /* renamed from: v  reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f5201v;
    public FrameLayout w;

    /* renamed from: x  reason: collision with root package name */
    public g f5202x;

    /* renamed from: y  reason: collision with root package name */
    public String f5203y;

    /* renamed from: z  reason: collision with root package name */
    public com.ironsource.sdk.j.a.d f5204z;

    public class a implements C {
        public a() {
        }

        public final void a(String str, JSONObject jSONObject) {
            A.this.b(A.b(str, jSONObject.toString()));
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ JSONObject f5206a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5207b;

        public b(JSONObject jSONObject, String str) {
            this.f5206a = jSONObject;
            this.f5207b = str;
        }

        public final void run() {
            JSONObject jSONObject = this.f5206a;
            int i10 = A.f5183q0;
            if (jSONObject.optBoolean("inspectWebview")) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            A.p(A.this, "about:blank");
            A.p(A.this, this.f5207b);
        }
    }

    public class c extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ int f5209a;

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                A.this.S.a("controller html - failed to load into web-view");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i10) {
            super(50000, 1000);
            this.f5209a = i10;
        }

        public final void onFinish() {
            Logger.i(A.this.f5185e, "Loading Controller Timer Finish");
            int i10 = this.f5209a;
            if (i10 == 3) {
                A.this.m(new a());
            } else {
                A.this.a(i10 + 1);
            }
        }

        public final void onTick(long j10) {
            String str = A.this.f5185e;
            Logger.i(str, "Loading Controller Timer Tick " + j10);
        }
    }

    public class d {

        public class a {
            public a() {
            }

            public final void a(boolean z9, String str, com.ironsource.sdk.g.f fVar) {
                int i10 = A.f5183q0;
                fVar.a(z9 ? "success" : "fail", str);
                A.d(A.this, fVar.toString(), z9, (String) null, (String) null);
            }

            public final void a(boolean z9, String str, JSONObject jSONObject) {
                String str2;
                if (z9) {
                    try {
                        int i10 = A.f5183q0;
                        str2 = "success";
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                        e10.getMessage();
                        return;
                    }
                } else {
                    int i11 = A.f5183q0;
                    str2 = "fail";
                }
                jSONObject.put(str2, str);
                A.d(A.this, jSONObject.toString(), z9, (String) null, (String) null);
            }
        }

        public class a0 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5214a;

            public a0(String str) {
                this.f5214a = str;
            }

            public final void run() {
                String str = this.f5214a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                A.this.B.onOWShowFail(str);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            public final void run() {
                Log.d(A.this.f5185e, "onOfferWallInitSuccess()");
                A.this.B.onOfferwallInitSuccess();
            }
        }

        public class b0 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5217a;

            public b0(String str) {
                this.f5217a = str;
            }

            public final void run() {
                Log.d(A.this.f5185e, "onInterstitialInitSuccess()");
                A.this.A.a(d.e.f5649c, this.f5217a, (com.ironsource.sdk.g.a) null);
            }
        }

        public class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5219a;

            public c(String str) {
                this.f5219a = str;
            }

            public final void run() {
                String str = this.f5219a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = A.this.f5185e;
                Log.d(str2, "onOfferWallInitFail(message:" + str + ")");
                A.this.B.onOfferwallInitFail(str);
            }
        }

        public class c0 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5221a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ String f5222b;

            public c0(String str, String str2) {
                this.f5221a = str;
                this.f5222b = str2;
            }

            public final void run() {
                String str = this.f5221a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = A.this.f5185e;
                Log.d(str2, "onInterstitialInitFail(message:" + str + ")");
                A.this.A.a(d.e.f5649c, this.f5222b, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.A$d$d  reason: collision with other inner class name */
        public class C0060d implements Runnable {
            public C0060d() {
            }

            public final void run() {
                A.this.i();
            }
        }

        public class d0 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ com.ironsource.sdk.j.a.a f5225a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ d.e f5226b;

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ String f5227c;

            public d0(com.ironsource.sdk.j.a.a aVar, d.e eVar, String str) {
                this.f5225a = aVar;
                this.f5226b = eVar;
                this.f5227c = str;
            }

            public final void run() {
                this.f5225a.b(this.f5226b, this.f5227c);
            }
        }

        public class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5228a;

            public e(String str) {
                this.f5228a = str;
            }

            public final void run() {
                A.this.A.b(this.f5228a);
            }
        }

        public class e0 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5230a;

            public e0(String str) {
                this.f5230a = str;
            }

            public final void run() {
                A.this.A.c(d.e.f5649c, this.f5230a);
                A.this.A.c(this.f5230a);
            }
        }

        public class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5232a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ String f5233b;

            public f(String str, String str2) {
                this.f5232a = str;
                this.f5233b = str2;
            }

            public final void run() {
                String str = this.f5232a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                A.this.A.b(this.f5233b, str);
            }
        }

        public class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5235a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ String f5236b;

            public g(String str, String str2) {
                this.f5235a = str;
                this.f5236b = str2;
            }

            public final void run() {
                String str = this.f5235a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                A.this.A.c(this.f5236b, str);
            }
        }

        public class h implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5238a;

            public h(String str) {
                this.f5238a = str;
            }

            public final void run() {
                Log.d(A.this.f5185e, "onBannerInitSuccess()");
                A.this.C.a(d.e.f5647a, this.f5238a, (com.ironsource.sdk.g.a) null);
            }
        }

        public class i implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5240a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ String f5241b;

            public i(String str, String str2) {
                this.f5240a = str;
                this.f5241b = str2;
            }

            public final void run() {
                String str = this.f5240a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = A.this.f5185e;
                Log.d(str2, "onBannerInitFail(message:" + str + ")");
                A.this.C.a(d.e.f5647a, this.f5241b, str);
            }
        }

        public class j implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5243a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ com.ironsource.sdk.c.b f5244b;

            public j(String str, com.ironsource.sdk.c.b bVar) {
                this.f5243a = str;
                this.f5244b = bVar;
            }

            public final void run() {
                Log.d(A.this.f5185e, "onBannerLoadSuccess()");
                A.this.C.a(this.f5243a, this.f5244b);
            }
        }

        public class k implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5246a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ String f5247b;

            public k(String str, String str2) {
                this.f5246a = str;
                this.f5247b = str2;
            }

            public final void run() {
                Log.d(A.this.f5185e, "onLoadBannerFail()");
                String str = this.f5246a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                A.this.C.d(this.f5247b, str);
            }
        }

        public class l implements Runnable {
            public l() {
            }

            public final void run() {
                A.this.j();
            }
        }

        public class m implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5250a;

            public m(String str) {
                this.f5250a = str;
            }

            public final void run() {
                try {
                    if (new JSONObject(this.f5250a).has("msgId")) {
                        A.this.V.onReceive(h.a.a(this.f5250a));
                        return;
                    }
                    A.this.W.onReceive(r.a(this.f5250a));
                } catch (JSONException e10) {
                    Logger.e(A.this.f5185e, "failed to parse received message");
                    e10.printStackTrace();
                }
            }
        }

        public class n implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5252a;

            public n(String str) {
                this.f5252a = str;
            }

            public final void run() {
                String str = this.f5252a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                A.this.B.onGetOWCreditsFailed(str);
            }
        }

        public class o implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ d.e f5254a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ String f5255b;

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ String f5256c;

            /* renamed from: d  reason: collision with root package name */
            public /* synthetic */ JSONObject f5257d;

            public o(d.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f5254a = eVar;
                this.f5255b = str;
                this.f5256c = str2;
                this.f5257d = jSONObject;
            }

            public final void run() {
                d.e eVar = this.f5254a;
                if (eVar == d.e.f5649c || eVar == d.e.RewardedVideo || eVar == d.e.f5647a) {
                    A a10 = A.this;
                    int i10 = A.f5183q0;
                    com.ironsource.sdk.j.a.a j10 = a10.j(eVar);
                    if (j10 != null) {
                        j10.a(this.f5254a, this.f5255b, this.f5256c, this.f5257d);
                    }
                } else if (eVar == d.e.OfferWall) {
                    A.this.B.onOfferwallEventNotificationReceived(this.f5256c, this.f5257d);
                }
            }
        }

        public class p implements Runnable {
            public p() {
            }

            public final void run() {
                A.this.removeJavascriptInterface("GenerateTokenForMessaging");
            }
        }

        public class q implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5260a;

            public q(String str) {
                this.f5260a = str;
            }

            public final void run() {
                try {
                    String str = A.this.f5185e;
                    Logger.i(str, "omidAPI(" + this.f5260a + ")");
                    A.this.L.a(new com.ironsource.sdk.g.f(this.f5260a).toString(), new a());
                } catch (Exception e10) {
                    e10.printStackTrace();
                    String str2 = A.this.f5185e;
                    Logger.i(str2, "omidAPI failed with exception " + e10.getMessage());
                }
            }
        }

        public class r implements Runnable {
            public r() {
            }

            public final void run() {
                A.this.getSettings().setMixedContentMode(0);
            }
        }

        public class s implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ int f5263a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ String f5264b;

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ com.ironsource.sdk.g.a f5265c;

            public s(int i10, String str, com.ironsource.sdk.g.a aVar) {
                this.f5263a = i10;
                this.f5264b = str;
                this.f5265c = aVar;
            }

            public final void run() {
                if (this.f5263a > 0) {
                    Log.d(A.this.f5185e, "onRVInitSuccess()");
                    A.this.f5204z.a(d.e.RewardedVideo, this.f5264b, this.f5265c);
                    return;
                }
                A.this.f5204z.a(this.f5264b);
            }
        }

        public class t implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5267a;

            public t(String str) {
                this.f5267a = str;
            }

            public final void run() {
                try {
                    A.this.Q.b(new JSONObject(this.f5267a), new a());
                } catch (Exception e10) {
                    e10.printStackTrace();
                    String str = A.this.f5185e;
                    Logger.i(str, "fileSystemAPI failed with exception " + e10.getMessage());
                }
            }
        }

        public class u implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5269a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ String f5270b;

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ int f5271c;

            /* renamed from: d  reason: collision with root package name */
            public /* synthetic */ boolean f5272d;

            /* renamed from: e  reason: collision with root package name */
            public /* synthetic */ int f5273e;

            /* renamed from: f  reason: collision with root package name */
            public /* synthetic */ boolean f5274f;

            /* renamed from: g  reason: collision with root package name */
            public /* synthetic */ String f5275g;

            /* renamed from: h  reason: collision with root package name */
            public /* synthetic */ String f5276h;

            public u(String str, String str2, int i10, boolean z9, int i11, boolean z10, String str3, String str4) {
                this.f5269a = str;
                this.f5270b = str2;
                this.f5271c = i10;
                this.f5272d = z9;
                this.f5273e = i11;
                this.f5274f = z10;
                this.f5275g = str3;
                this.f5276h = str4;
            }

            public final void run() {
                if (this.f5269a.equalsIgnoreCase(d.e.RewardedVideo.toString())) {
                    A.this.f5204z.a(this.f5270b, this.f5271c);
                } else if (this.f5269a.equalsIgnoreCase(d.e.OfferWall.toString()) && this.f5272d && A.this.B.onOWAdCredited(this.f5271c, this.f5273e, this.f5274f) && !TextUtils.isEmpty(this.f5275g)) {
                    com.ironsource.sdk.utils.b a10 = com.ironsource.sdk.utils.b.a();
                    String str = this.f5275g;
                    A a11 = A.this;
                    if (a10.a(str, a11.f5188h, a11.f5189i)) {
                        A.d(A.this, this.f5276h, true, (String) null, (String) null);
                    } else {
                        A.d(A.this, this.f5276h, false, "Time Stamp could not be stored", (String) null);
                    }
                }
            }
        }

        public class v implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5278a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ int f5279b;

            public v(String str, int i10) {
                this.f5278a = str;
                this.f5279b = i10;
            }

            public final void run() {
                A.this.A.b(this.f5278a, this.f5279b);
            }
        }

        public class w implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5281a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ String f5282b;

            public w(String str, String str2) {
                this.f5281a = str;
                this.f5282b = str2;
            }

            public final void run() {
                String str = this.f5281a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = A.this.f5185e;
                Log.d(str2, "onRVInitFail(message:" + str + ")");
                A.this.f5204z.a(d.e.RewardedVideo, this.f5282b, str);
            }
        }

        public class x implements Runnable {
            public x() {
            }

            public final void run() {
                A a10 = A.this;
                a10.setOnTouchListener(new w());
            }
        }

        public class y implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5285a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ String f5286b;

            public y(String str, String str2) {
                this.f5285a = str;
                this.f5286b = str2;
            }

            public final void run() {
                String str = this.f5285a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = A.this.f5185e;
                Log.d(str2, "onRVShowFail(message:" + this.f5285a + ")");
                A.this.f5204z.a(this.f5286b, str);
            }
        }

        public class z implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ String f5288a;

            public z(String str) {
                this.f5288a = str;
            }

            public final void run() {
                A.this.B.onOWShowSuccess(this.f5288a);
            }
        }

        public d() {
        }

        public final void a(String str, boolean z9) {
            com.ironsource.sdk.g.c a10 = A.this.K.a(d.e.f5649c, str);
            if (a10 != null) {
                a10.f5623f = z9;
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "adClicked(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                d.e n2 = A.n(d10);
                com.ironsource.sdk.j.a.a j10 = A.this.j(n2);
                if (n2 != null && j10 != null) {
                    A.this.m(new d0(j10, n2, fetchDemandSourceId));
                }
            }
        }

        @JavascriptInterface
        public void adCredited(String str) {
            int i10;
            int i11;
            String str2;
            boolean z9;
            boolean z10;
            com.ironsource.sdk.g.c a10;
            Log.d(A.this.f5187g, "adCredited(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("credits");
            boolean z11 = false;
            if (d10 != null) {
                i10 = Integer.parseInt(d10);
            } else {
                i10 = 0;
            }
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d11 = fVar.d("productType");
            if (TextUtils.isEmpty(d11)) {
                Log.d(A.this.f5187g, "adCredited | product type is missing");
            }
            d.e eVar = d.e.f5649c;
            if (!eVar.toString().equalsIgnoreCase(d11)) {
                String d12 = fVar.d("total");
                if (d12 != null) {
                    i11 = Integer.parseInt(d12);
                } else {
                    i11 = 0;
                }
                if (!d.e.OfferWall.toString().equalsIgnoreCase(d11)) {
                    z10 = false;
                    z9 = false;
                    str2 = null;
                } else if (fVar.b("signature") || fVar.b("timestamp") || fVar.b("totalCreditsFlag")) {
                    A.d(A.this, str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", (String) null);
                    return;
                } else {
                    String d13 = fVar.d("signature");
                    StringBuilder g10 = androidx.activity.f.g(d12);
                    g10.append(A.this.f5188h);
                    g10.append(A.this.f5189i);
                    if (d13.equalsIgnoreCase(SDKUtils.getMD5(g10.toString()))) {
                        z11 = true;
                    } else {
                        A.d(A.this, str, false, "Controller signature is not equal to SDK signature", (String) null);
                    }
                    boolean e10 = fVar.e("totalCreditsFlag");
                    str2 = fVar.d("timestamp");
                    z9 = e10;
                    z10 = z11;
                }
                if (A.this.i(d11)) {
                    A.this.m(new u(d11, fetchDemandSourceId, i10, z10, i11, z9, str2, str));
                }
            } else if (A.this.i(eVar.toString()) && (a10 = A.this.K.a(eVar, fetchDemandSourceId)) != null) {
                Map<String, String> map = a10.f5621d;
                if (map != null && map.containsKey("rewarded")) {
                    z11 = Boolean.parseBoolean(a10.f5621d.get("rewarded"));
                }
                if (z11) {
                    A.this.m(new v(fetchDemandSourceId, i10));
                }
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "adUnitsReady(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            com.ironsource.sdk.g.a aVar = new com.ironsource.sdk.g.a(str);
            if (!aVar.f5604c) {
                A.d(A.this, str, false, "Num Of Ad Units Do Not Exist", (String) null);
                return;
            }
            A.d(A.this, str, true, (String) null, (String) null);
            String str3 = aVar.f5602a;
            if (d.e.RewardedVideo.toString().equalsIgnoreCase(str3) && A.this.i(str3)) {
                A.this.m(new s(Integer.parseInt(aVar.f5603b), fetchDemandSourceId, aVar));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                String str2 = A.this.f5185e;
                Logger.i(str2, "adViewAPI(" + str + ")");
                A.this.P.a(new com.ironsource.sdk.g.f(str).toString(), new a());
            } catch (Exception e10) {
                e10.printStackTrace();
                String str3 = A.this.f5185e;
                Logger.i(str3, "adViewAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(A.this.f5185e, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            d.e n2;
            LinkedHashMap c10;
            com.ironsource.sdk.g.c cVar;
            try {
                String str2 = A.this.f5185e;
                Logger.i(str2, "cleanAdInstance(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("productType");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (!TextUtils.isEmpty(fetchDemandSourceId) && (n2 = A.n(d10)) != null) {
                    k kVar = A.this.K;
                    if (!TextUtils.isEmpty(fetchDemandSourceId) && (c10 = kVar.c(n2)) != null && (cVar = (com.ironsource.sdk.g.c) c10.remove(fetchDemandSourceId)) != null) {
                        cVar.f5624g = null;
                        Map<String, String> map = cVar.f5621d;
                        if (map != null) {
                            map.clear();
                        }
                        cVar.f5621d = null;
                    }
                }
            } catch (Exception e10) {
                A.d(A.this, str, false, e10.getMessage(), (String) null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                com.ironsource.sdk.utils.b a10 = com.ironsource.sdk.utils.b.a();
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) a10.f5770a.getAll().keySet().toArray(new String[0]);
                SharedPreferences.Editor edit = a10.f5770a.edit();
                for (String str2 : strArr) {
                    if (com.ironsource.sdk.utils.b.b(str2)) {
                        arrayList.add(str2);
                        edit.remove(str2);
                    }
                }
                edit.apply();
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                if (!arrayList.isEmpty()) {
                    fVar.a("removedAdsLastUpdateTime", arrayList.toString());
                }
                A.d(A.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                A.d(A.this, str, false, e10.getMessage(), (String) null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                String str2 = A.this.f5185e;
                Logger.i(str2, "deleteFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("file");
                String d11 = fVar.d("path");
                if (d11 != null) {
                    if (!TextUtils.isEmpty(d10)) {
                        com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(A.this.E, d11), d10);
                        IronSourceStorageUtils.ensurePathSafety(cVar, A.this.E);
                        if (!cVar.exists()) {
                            A.d(A.this, str, false, "File not exist", IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
                            return;
                        }
                        A.d(A.this, str, IronSourceStorageUtils.deleteFile(cVar), (String) null, (String) null);
                        return;
                    }
                }
                A.d(A.this, str, false, "Missing parameters for file", IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
            } catch (Exception e10) {
                A.d(A.this, str, false, e10.getMessage(), (String) null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                String str2 = A.this.f5185e;
                Logger.i(str2, "deleteFolder(" + str + ")");
                String d10 = new com.ironsource.sdk.g.f(str).d("path");
                if (d10 == null) {
                    A.d(A.this, str, false, "Missing parameters for file", IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(A.this.E, d10));
                IronSourceStorageUtils.ensurePathSafety(cVar, A.this.E);
                if (!cVar.exists()) {
                    A.d(A.this, str, false, "Folder not exist", IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
                    return;
                }
                A.d(A.this, str, IronSourceStorageUtils.deleteFolder(cVar.getPath()), (String) null, (String) null);
            } catch (Exception e10) {
                A.d(A.this, str, false, e10.getMessage(), (String) null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                String str2 = A.this.f5185e;
                Logger.i(str2, "deviceDataAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                l lVar = A.this.O;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                String optString = jSONObject.optString("deviceDataFunction");
                jSONObject.optJSONObject("deviceDataParams");
                String optString2 = jSONObject.optString("success");
                jSONObject.optString("fail");
                if ("getDeviceData".equals(optString)) {
                    com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                    fVar3.a(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.d())));
                    fVar3.a(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.d(lVar.f5482a))));
                    fVar3.a(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.e(lVar.f5482a))));
                    fVar3.a(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.f(lVar.f5482a))));
                    fVar3.a(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.g(lVar.f5482a))));
                    fVar3.a(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.h(lVar.f5482a))));
                    aVar.a(true, optString2, fVar3);
                    return;
                }
                Logger.i("l", "unhandled API request " + fVar2);
            } catch (Exception e10) {
                e10.printStackTrace();
                String str3 = A.this.f5185e;
                Logger.i(str3, "deviceDataAPI failed with exception " + e10.getMessage());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d7, code lost:
            if (r0 <= 0) goto L_0x00da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0112, code lost:
            if (r3 > 0) goto L_0x0116;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x011a A[Catch:{ Exception -> 0x012a }] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void displayWebView(java.lang.String r15) {
            /*
                r14 = this;
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                java.lang.String r0 = r0.f5185e
                java.lang.String r1 = "displayWebView("
                java.lang.String r2 = ")"
                androidx.fragment.app.w0.e(r1, r15, r2, r0)
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                r1 = 1
                r2 = 0
                com.ironsource.sdk.controller.A.d(r0, r15, r1, r2, r2)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r15)
                java.lang.String r15 = "display"
                java.lang.Object r15 = r0.c(r15)
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                java.lang.String r2 = "productType"
                java.lang.String r3 = r0.d(r2)
                java.lang.String r4 = "standaloneView"
                boolean r4 = r0.e(r4)
                java.lang.String r5 = "adViewId"
                java.lang.String r6 = r0.d(r5)
                java.lang.String r7 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.g.f) r0)
                java.lang.String r8 = "ctrWVPauseResume"
                boolean r9 = r0.e(r8)
                if (r15 == 0) goto L_0x0213
                com.ironsource.sdk.controller.A r15 = com.ironsource.sdk.controller.A.this
                java.lang.String r10 = "immersive"
                boolean r11 = r0.e(r10)
                r15.J = r11
                java.lang.String r15 = "activityThemeTranslucent"
                boolean r15 = r0.e(r15)
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                com.ironsource.sdk.controller.A$g r11 = r0.f5202x
                com.ironsource.sdk.controller.A$g r12 = com.ironsource.sdk.controller.A.g.Display
                java.lang.String r13 = "State: "
                if (r11 == r12) goto L_0x01fd
                r0.f5202x = r12
                java.lang.String r0 = r0.f5185e
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>(r13)
                com.ironsource.sdk.controller.A r12 = com.ironsource.sdk.controller.A.this
                com.ironsource.sdk.controller.A$g r12 = r12.f5202x
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r11)
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                com.ironsource.sdk.controller.c r0 = r0.f5195o0
                android.app.Activity r0 = r0.a()
                com.ironsource.sdk.controller.A r11 = com.ironsource.sdk.controller.A.this
                java.lang.String r11 = r11.f5203y
                int r12 = com.ironsource.environment.h.k(r0)
                if (r4 == 0) goto L_0x0138
                com.ironsource.sdk.controller.j r15 = new com.ironsource.sdk.controller.j
                r15.<init>(r0)
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                android.widget.FrameLayout r0 = r0.w
                r15.addView(r0)
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                r15.f5476b = r0
                r0.p0 = r15
                r0.requestFocus()
                com.ironsource.sdk.controller.A r0 = r15.f5476b
                com.ironsource.sdk.controller.c r0 = r0.f5195o0
                android.app.Activity r0 = r0.a()
                r15.f5475a = r0
                android.view.Window r0 = r0.getWindow()
                android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
                int r0 = r0.flags
                r0 = r0 & 1024(0x400, float:1.435E-42)
                r2 = 0
                if (r0 == 0) goto L_0x00b4
                r0 = r1
                goto L_0x00b5
            L_0x00b4:
                r0 = r2
            L_0x00b5:
                if (r0 != 0) goto L_0x00da
                android.content.Context r0 = r15.f5475a     // Catch:{ Exception -> 0x00d6 }
                if (r0 == 0) goto L_0x00d6
                android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x00d6 }
                java.lang.String r3 = "status_bar_height"
                java.lang.String r4 = "dimen"
                java.lang.String r5 = "android"
                int r0 = r0.getIdentifier(r3, r4, r5)     // Catch:{ Exception -> 0x00d6 }
                if (r0 <= 0) goto L_0x00d6
                android.content.Context r3 = r15.f5475a     // Catch:{ Exception -> 0x00d6 }
                android.content.res.Resources r3 = r3.getResources()     // Catch:{ Exception -> 0x00d6 }
                int r0 = r3.getDimensionPixelSize(r0)     // Catch:{ Exception -> 0x00d6 }
                goto L_0x00d7
            L_0x00d6:
                r0 = r2
            L_0x00d7:
                if (r0 <= 0) goto L_0x00da
                goto L_0x00db
            L_0x00da:
                r0 = r2
            L_0x00db:
                android.content.Context r3 = r15.f5475a
                android.app.Activity r3 = (android.app.Activity) r3
                android.graphics.Rect r4 = new android.graphics.Rect     // Catch:{ Exception -> 0x0115 }
                r4.<init>()     // Catch:{ Exception -> 0x0115 }
                android.view.Window r5 = r3.getWindow()     // Catch:{ Exception -> 0x0115 }
                android.view.View r5 = r5.getDecorView()     // Catch:{ Exception -> 0x0115 }
                r5.getDrawingRect(r4)     // Catch:{ Exception -> 0x0115 }
                android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0115 }
                r5.<init>()     // Catch:{ Exception -> 0x0115 }
                android.view.Window r6 = r3.getWindow()     // Catch:{ Exception -> 0x0115 }
                android.view.View r6 = r6.getDecorView()     // Catch:{ Exception -> 0x0115 }
                r6.getWindowVisibleDisplayFrame(r5)     // Catch:{ Exception -> 0x0115 }
                int r3 = com.ironsource.environment.h.o(r3)     // Catch:{ Exception -> 0x0115 }
                if (r3 != r1) goto L_0x010d
                int r3 = r4.bottom     // Catch:{ Exception -> 0x0115 }
                int r4 = r5.bottom     // Catch:{ Exception -> 0x0115 }
                int r3 = r3 - r4
                if (r3 <= 0) goto L_0x0115
                goto L_0x0116
            L_0x010d:
                int r3 = r4.right     // Catch:{ Exception -> 0x0115 }
                int r4 = r5.right     // Catch:{ Exception -> 0x0115 }
                int r3 = r3 - r4
                if (r3 <= 0) goto L_0x0115
                goto L_0x0116
            L_0x0115:
                r3 = r2
            L_0x0116:
                android.content.Context r4 = r15.f5475a     // Catch:{ Exception -> 0x012a }
                if (r4 == 0) goto L_0x012a
                int r4 = com.ironsource.environment.h.o(r4)     // Catch:{ Exception -> 0x012a }
                if (r4 != r1) goto L_0x0124
                r15.setPadding(r2, r0, r2, r3)     // Catch:{ Exception -> 0x012a }
                goto L_0x012a
            L_0x0124:
                r1 = 2
                if (r4 != r1) goto L_0x012a
                r15.setPadding(r2, r0, r3, r2)     // Catch:{ Exception -> 0x012a }
            L_0x012a:
                android.content.Context r0 = r15.f5475a
                android.app.Activity r0 = (android.app.Activity) r0
                com.ironsource.sdk.controller.j$a r1 = new com.ironsource.sdk.controller.j$a
                r1.<init>()
                r0.runOnUiThread(r1)
                goto L_0x0212
            L_0x0138:
                if (r15 == 0) goto L_0x0142
                android.content.Intent r15 = new android.content.Intent
                java.lang.Class<com.ironsource.sdk.controller.InterstitialActivity> r1 = com.ironsource.sdk.controller.InterstitialActivity.class
                r15.<init>(r0, r1)
                goto L_0x0149
            L_0x0142:
                android.content.Intent r15 = new android.content.Intent
                java.lang.Class<com.ironsource.sdk.controller.ControllerActivity> r1 = com.ironsource.sdk.controller.ControllerActivity.class
                r15.<init>(r0, r1)
            L_0x0149:
                com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.g.d.e.RewardedVideo
                java.lang.String r4 = r1.toString()
                boolean r4 = r4.equalsIgnoreCase(r3)
                java.lang.String r13 = "application"
                if (r4 == 0) goto L_0x018e
                boolean r4 = r13.equals(r11)
                if (r4 == 0) goto L_0x0165
                int r4 = com.ironsource.environment.h.m(r0)
                java.lang.String r11 = com.ironsource.sdk.utils.SDKUtils.translateRequestedOrientation(r4)
            L_0x0165:
                java.lang.String r4 = r1.toString()
                r15.putExtra(r2, r4)
                com.ironsource.sdk.controller.A r2 = com.ironsource.sdk.controller.A.this
                com.ironsource.sdk.g.b r2 = r2.H
                int r4 = r1.ordinal()
                r2.f5609e = r4
                com.ironsource.sdk.controller.A r2 = com.ironsource.sdk.controller.A.this
                com.ironsource.sdk.g.b r4 = r2.H
                r4.f5607c = r7
                java.lang.String r4 = r1.toString()
                boolean r2 = r2.i(r4)
                if (r2 == 0) goto L_0x01ce
                com.ironsource.sdk.controller.A r2 = com.ironsource.sdk.controller.A.this
                com.ironsource.sdk.j.a.d r2 = r2.f5204z
                r2.c(r1, r7)
                goto L_0x01ce
            L_0x018e:
                com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.g.d.e.OfferWall
                java.lang.String r4 = r1.toString()
                boolean r4 = r4.equalsIgnoreCase(r3)
                if (r4 == 0) goto L_0x01ac
                java.lang.String r4 = r1.toString()
                r15.putExtra(r2, r4)
                com.ironsource.sdk.controller.A r2 = com.ironsource.sdk.controller.A.this
                com.ironsource.sdk.g.b r2 = r2.H
                int r1 = r1.ordinal()
                r2.f5609e = r1
                goto L_0x01ce
            L_0x01ac:
                com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.g.d.e.f5649c
                java.lang.String r4 = r1.toString()
                boolean r4 = r4.equalsIgnoreCase(r3)
                if (r4 == 0) goto L_0x01ce
                boolean r4 = r13.equals(r11)
                if (r4 == 0) goto L_0x01c7
                int r4 = com.ironsource.environment.h.m(r0)
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.translateRequestedOrientation(r4)
                r11 = r4
            L_0x01c7:
                java.lang.String r1 = r1.toString()
                r15.putExtra(r2, r1)
            L_0x01ce:
                if (r6 == 0) goto L_0x01d3
                r15.putExtra(r5, r6)
            L_0x01d3:
                r15.putExtra(r8, r9)
                r1 = 536870912(0x20000000, float:1.0842022E-19)
                r15.setFlags(r1)
                com.ironsource.sdk.controller.A r1 = com.ironsource.sdk.controller.A.this
                boolean r1 = r1.J
                r15.putExtra(r10, r1)
                java.lang.String r1 = "orientation_set_flag"
                r15.putExtra(r1, r11)
                java.lang.String r1 = "rotation_set_flag"
                r15.putExtra(r1, r12)
                com.ironsource.sdk.controller.A r1 = com.ironsource.sdk.controller.A.this
                com.ironsource.sdk.controller.A$t r2 = new com.ironsource.sdk.controller.A$t
                com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.controller.A.n(r3)
                r2.<init>(r3, r7)
                r1.f5192m = r2
                r0.startActivity(r15)
                goto L_0x0220
            L_0x01fd:
                java.lang.String r15 = r0.f5185e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r13)
                com.ironsource.sdk.controller.A r1 = com.ironsource.sdk.controller.A.this
                com.ironsource.sdk.controller.A$g r1 = r1.f5202x
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.ironsource.sdk.utils.Logger.i(r15, r0)
            L_0x0212:
                return
            L_0x0213:
                com.ironsource.sdk.controller.A r15 = com.ironsource.sdk.controller.A.this
                com.ironsource.sdk.controller.A$g r0 = com.ironsource.sdk.controller.A.g.Gone
                r15.f5202x = r0
                com.ironsource.sdk.j.f r15 = r15.p0
                if (r15 == 0) goto L_0x0220
                r15.onCloseRequested()
            L_0x0220:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.A.d.displayWebView(java.lang.String):void");
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            w0.e("fileSystemAPI(", str, ")", A.this.f5185e);
            A a10 = A.this;
            t tVar = new t(str);
            com.ironsource.environment.thread.a aVar = a10.f5184a;
            if (aVar != null) {
                aVar.b(tVar);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0156, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x015a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0160  */
        /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getApplicationInfo(java.lang.String r13) {
            /*
                r12 = this;
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                java.lang.String r0 = r0.f5185e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getApplicationInfo("
                r1.<init>(r2)
                r1.append(r13)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                java.lang.String r0 = new com.ironsource.sdk.g.f(r13).d("success")
                com.ironsource.sdk.g.f r1 = new com.ironsource.sdk.g.f
                r1.<init>(r13)
                java.lang.String r2 = "fail"
                java.lang.String r1 = r1.d(r2)
                com.ironsource.sdk.g.f r2 = new com.ironsource.sdk.g.f
                r2.<init>(r13)
                java.lang.String r13 = "productType"
                java.lang.String r3 = r2.d(r13)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.g.f) r2)
                com.ironsource.sdk.controller.A r4 = com.ironsource.sdk.controller.A.this
                r4.getClass()
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                boolean r6 = android.text.TextUtils.isEmpty(r3)
                r7 = 1
                r8 = 0
                r9 = 0
                if (r6 != 0) goto L_0x0090
                com.ironsource.sdk.g.d$e r6 = com.ironsource.sdk.controller.A.n(r3)
                com.ironsource.sdk.g.d$e r10 = com.ironsource.sdk.g.d.e.OfferWall
                if (r6 != r10) goto L_0x0056
                java.util.Map<java.lang.String, java.lang.String> r2 = r4.f5190j
                goto L_0x0071
            L_0x0056:
                com.ironsource.sdk.controller.k r10 = r4.K
                com.ironsource.sdk.g.c r2 = r10.a((com.ironsource.sdk.g.d.e) r6, (java.lang.String) r2)
                if (r2 == 0) goto L_0x0070
                java.util.Map<java.lang.String, java.lang.String> r6 = r2.f5621d
                java.lang.String r10 = r2.f5618a
                java.lang.String r11 = "demandSourceName"
                r6.put(r11, r10)
                java.lang.String r2 = r2.f5619b
                java.lang.String r10 = "demandSourceId"
                r6.put(r10, r2)
                r2 = r6
                goto L_0x0071
            L_0x0070:
                r2 = r9
            L_0x0071:
                r5.put(r13, r3)     // Catch:{ JSONException -> 0x0075 }
                goto L_0x0079
            L_0x0075:
                r13 = move-exception
                r13.printStackTrace()
            L_0x0079:
                java.util.Map r13 = com.ironsource.sdk.utils.SDKUtils.getInitSDKParams()     // Catch:{ Exception -> 0x008a }
                if (r13 == 0) goto L_0x008e
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x008a }
                r3.<init>(r13)     // Catch:{ Exception -> 0x008a }
                org.json.JSONObject r13 = com.ironsource.sdk.utils.SDKUtils.mergeJSONObjects(r5, r3)     // Catch:{ Exception -> 0x008a }
                r5 = r13
                goto L_0x008e
            L_0x008a:
                r13 = move-exception
                r13.printStackTrace()
            L_0x008e:
                r13 = r8
                goto L_0x0092
            L_0x0090:
                r13 = r7
                r2 = r9
            L_0x0092:
                java.lang.String r3 = r4.f5189i
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x00ae
                java.lang.String r3 = "applicationUserId"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x00aa }
                java.lang.String r6 = r4.f5189i     // Catch:{ JSONException -> 0x00aa }
                java.lang.String r6 = com.ironsource.sdk.utils.SDKUtils.encodeString(r6)     // Catch:{ JSONException -> 0x00aa }
                r5.put(r3, r6)     // Catch:{ JSONException -> 0x00aa }
                goto L_0x00ae
            L_0x00aa:
                r3 = move-exception
                r3.printStackTrace()
            L_0x00ae:
                java.lang.String r3 = r4.f5188h
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x00cb
                java.lang.String r3 = "applicationKey"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x00c6 }
                java.lang.String r6 = r4.f5188h     // Catch:{ JSONException -> 0x00c6 }
                java.lang.String r6 = com.ironsource.sdk.utils.SDKUtils.encodeString(r6)     // Catch:{ JSONException -> 0x00c6 }
                r5.put(r3, r6)     // Catch:{ JSONException -> 0x00c6 }
                goto L_0x00cc
            L_0x00c6:
                r3 = move-exception
                r3.printStackTrace()
                goto L_0x00cc
            L_0x00cb:
                r13 = r7
            L_0x00cc:
                r3 = 2
                if (r2 == 0) goto L_0x0132
                boolean r6 = r2.isEmpty()
                if (r6 != 0) goto L_0x0132
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x00dd:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0132
                java.lang.Object r6 = r2.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r10 = r6.getKey()
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r11 = "sdkWebViewCache"
                boolean r10 = r10.equalsIgnoreCase(r11)
                if (r10 == 0) goto L_0x0115
                java.lang.Object r10 = r6.getValue()
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r11 = "0"
                boolean r10 = r10.equalsIgnoreCase(r11)
                if (r10 == 0) goto L_0x010d
                android.webkit.WebSettings r10 = r4.getSettings()
                r10.setCacheMode(r3)
                goto L_0x0115
            L_0x010d:
                android.webkit.WebSettings r10 = r4.getSettings()
                r11 = -1
                r10.setCacheMode(r11)
            L_0x0115:
                java.lang.Object r10 = r6.getKey()     // Catch:{ JSONException -> 0x012d }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ JSONException -> 0x012d }
                java.lang.String r10 = com.ironsource.sdk.utils.SDKUtils.encodeString(r10)     // Catch:{ JSONException -> 0x012d }
                java.lang.Object r6 = r6.getValue()     // Catch:{ JSONException -> 0x012d }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x012d }
                java.lang.String r6 = com.ironsource.sdk.utils.SDKUtils.encodeString(r6)     // Catch:{ JSONException -> 0x012d }
                r5.put(r10, r6)     // Catch:{ JSONException -> 0x012d }
                goto L_0x00dd
            L_0x012d:
                r6 = move-exception
                r6.printStackTrace()
                goto L_0x00dd
            L_0x0132:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.String r3 = r5.toString()
                r2[r8] = r3
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
                r2[r7] = r13
                r2 = r2[r8]
                java.lang.String r2 = (java.lang.String) r2
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x0152
                boolean r13 = android.text.TextUtils.isEmpty(r1)
                if (r13 != 0) goto L_0x0159
                r0 = r1
                goto L_0x015a
            L_0x0152:
                boolean r13 = android.text.TextUtils.isEmpty(r0)
                if (r13 != 0) goto L_0x0159
                goto L_0x015a
            L_0x0159:
                r0 = r9
            L_0x015a:
                boolean r13 = android.text.TextUtils.isEmpty(r0)
                if (r13 != 0) goto L_0x016d
                java.lang.String r13 = "onGetApplicationInfoSuccess"
                java.lang.String r1 = "onGetApplicationInfoFail"
                java.lang.String r13 = com.ironsource.sdk.controller.A.b(r0, r2, r13, r1)
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                r0.b((java.lang.String) r13)
            L_0x016d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.A.d.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            String str2;
            A a10;
            String str3 = A.this.f5185e;
            Logger.i(str3, "getCachedFilesMap(" + str + ")");
            String k10 = new com.ironsource.sdk.g.f(str).d("success");
            if (!TextUtils.isEmpty(k10)) {
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                if (!fVar.a("path")) {
                    a10 = A.this;
                    str2 = "path key does not exist";
                } else {
                    String str4 = (String) fVar.c("path");
                    if (!IronSourceStorageUtils.isPathExist(A.this.E, str4)) {
                        a10 = A.this;
                        str2 = "path file does not exist on disk";
                    } else {
                        A.this.b(A.b(k10, IronSourceStorageUtils.getCachedFilesMap(A.this.E, str4), "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
                        return;
                    }
                }
                A.d(a10, str, false, str2, (String) null);
            }
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String str2;
            String str3 = A.this.f5185e;
            Logger.i(str3, "getConnectivityInfo(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            int i10 = A.f5183q0;
            String d10 = fVar.d("success");
            String d11 = fVar.d("fail");
            JSONObject jSONObject = new JSONObject();
            A a10 = A.this;
            j jVar = a10.T;
            if (jVar != null) {
                jSONObject = jVar.f5738a.c(a10.getContext());
            }
            if (jSONObject.length() > 0) {
                str2 = A.b(d10, jSONObject.toString());
            } else {
                str2 = A.b(d11, A.a("errMsg", "failed to retrieve connection info", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
            }
            A.this.b(str2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0 A[SYNTHETIC, Splitter:B:24:0x00b0] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getControllerConfig(java.lang.String r7) {
            /*
                r6 = this;
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                java.lang.String r0 = r0.f5185e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getControllerConfig("
                r1.<init>(r2)
                r1.append(r7)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r7)
                int r7 = com.ironsource.sdk.controller.A.f5183q0
                java.lang.String r7 = "success"
                java.lang.String r7 = r0.d(r7)
                boolean r0 = android.text.TextUtils.isEmpty(r7)
                if (r0 != 0) goto L_0x00eb
                org.json.JSONObject r0 = com.ironsource.sdk.utils.SDKUtils.getControllerConfigAsJSONObject()
                com.ironsource.sdk.controller.FeaturesManager r1 = com.ironsource.sdk.controller.FeaturesManager.getInstance()     // Catch:{ Exception -> 0x0058 }
                r1.getClass()     // Catch:{ Exception -> 0x0058 }
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0058 }
                com.ironsource.sdk.controller.FeaturesManager$a r3 = r1.f5354b     // Catch:{ Exception -> 0x0058 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0058 }
                boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0058 }
                if (r2 == 0) goto L_0x0046
                goto L_0x0078
            L_0x0046:
                java.lang.String r2 = "nativeFeatures"
                org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x0058 }
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0058 }
                com.ironsource.sdk.controller.FeaturesManager$a r1 = r1.f5354b     // Catch:{ Exception -> 0x0058 }
                r4.<init>(r1)     // Catch:{ Exception -> 0x0058 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0058 }
                r0.put(r2, r3)     // Catch:{ Exception -> 0x0058 }
                goto L_0x0078
            L_0x0058:
                r1 = move-exception
                com.ironsource.sdk.a.a r2 = new com.ironsource.sdk.a.a
                r2.<init>()
                java.lang.String r1 = r1.getMessage()
                java.lang.String r3 = "callfailreason"
                com.ironsource.sdk.a.a r1 = r2.a(r3, r1)
                com.ironsource.sdk.a.h$a r2 = com.ironsource.sdk.a.h.f5117p
                java.util.HashMap<java.lang.String, java.lang.Object> r1 = r1.f5086a
                com.ironsource.sdk.a.f.a((com.ironsource.sdk.a.h.a) r2, (java.util.Map<java.lang.String, java.lang.Object>) r1)
                com.ironsource.sdk.controller.A r1 = com.ironsource.sdk.controller.A.this
                java.lang.String r1 = r1.f5185e
                java.lang.String r2 = "getControllerConfig Error while adding supported features data from FeaturesManager"
                com.ironsource.sdk.utils.Logger.d(r1, r2)
            L_0x0078:
                java.lang.String r1 = com.ironsource.sdk.utils.SDKUtils.getTesterParameters()
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                java.lang.String r3 = "testFriendlyName"
                java.lang.String r4 = "testerABGroup"
                if (r2 != 0) goto L_0x00ad
                java.lang.String r2 = "-1"
                boolean r2 = r1.contains(r2)
                if (r2 != 0) goto L_0x00ad
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a9 }
                r2.<init>(r1)     // Catch:{ JSONException -> 0x00a9 }
                java.lang.String r5 = r2.getString(r4)     // Catch:{ JSONException -> 0x00a9 }
                boolean r5 = r5.isEmpty()     // Catch:{ JSONException -> 0x00a9 }
                if (r5 != 0) goto L_0x00ad
                java.lang.String r2 = r2.getString(r3)     // Catch:{ JSONException -> 0x00a9 }
                boolean r2 = r2.isEmpty()     // Catch:{ JSONException -> 0x00a9 }
                if (r2 != 0) goto L_0x00ad
                r2 = 1
                goto L_0x00ae
            L_0x00a9:
                r2 = move-exception
                r2.printStackTrace()
            L_0x00ad:
                r2 = 0
            L_0x00ae:
                if (r2 == 0) goto L_0x00cd
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c4 }
                r2.<init>(r1)     // Catch:{ JSONException -> 0x00c4 }
                java.lang.Object r1 = r2.get(r4)     // Catch:{ JSONException -> 0x00c4 }
                r0.putOpt(r4, r1)     // Catch:{ JSONException -> 0x00c4 }
                java.lang.Object r1 = r2.get(r3)     // Catch:{ JSONException -> 0x00c4 }
                r0.putOpt(r3, r1)     // Catch:{ JSONException -> 0x00c4 }
                goto L_0x00cd
            L_0x00c4:
                com.ironsource.sdk.controller.A r1 = com.ironsource.sdk.controller.A.this
                java.lang.String r1 = r1.f5185e
                java.lang.String r2 = "getControllerConfig Error while parsing Tester AB Group parameters"
                com.ironsource.sdk.utils.Logger.d(r1, r2)
            L_0x00cd:
                java.lang.String r1 = "controllerSourceData"
                com.ironsource.sdk.controller.A r2 = com.ironsource.sdk.controller.A.this     // Catch:{ Exception -> 0x00de }
                com.ironsource.sdk.controller.f r2 = r2.F     // Catch:{ Exception -> 0x00de }
                r2.getClass()     // Catch:{ Exception -> 0x00de }
                com.ironsource.sdk.controller.i r3 = new com.ironsource.sdk.controller.i     // Catch:{ Exception -> 0x00de }
                r3.<init>(r2)     // Catch:{ Exception -> 0x00de }
                r0.put(r1, r3)     // Catch:{ Exception -> 0x00de }
            L_0x00de:
                java.lang.String r0 = r0.toString()
                java.lang.String r7 = com.ironsource.sdk.controller.A.b(r7, r0)
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                r0.b((java.lang.String) r7)
            L_0x00eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.A.d.getControllerConfig(java.lang.String):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x007f A[Catch:{ Exception -> 0x0089 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDemandSourceState(java.lang.String r9) {
            /*
                r8 = this;
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                java.lang.String r0 = r0.f5185e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getMediationState("
                r1.<init>(r2)
                r1.append(r9)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r9)
                java.lang.String r1 = "demandSourceName"
                java.lang.String r2 = r0.d(r1)
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.g.f) r0)
                java.lang.String r4 = "productType"
                java.lang.String r0 = r0.d(r4)
                if (r0 == 0) goto L_0x0097
                if (r2 == 0) goto L_0x0097
                r5 = 0
                com.ironsource.sdk.g.d$e r6 = com.ironsource.sdk.utils.SDKUtils.getProductType(r0)     // Catch:{ Exception -> 0x0089 }
                if (r6 == 0) goto L_0x0097
                com.ironsource.sdk.controller.A r7 = com.ironsource.sdk.controller.A.this     // Catch:{ Exception -> 0x0089 }
                com.ironsource.sdk.controller.k r7 = r7.K     // Catch:{ Exception -> 0x0089 }
                com.ironsource.sdk.g.c r6 = r7.a((com.ironsource.sdk.g.d.e) r6, (java.lang.String) r3)     // Catch:{ Exception -> 0x0089 }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0089 }
                r7.<init>()     // Catch:{ Exception -> 0x0089 }
                r7.put(r4, r0)     // Catch:{ Exception -> 0x0089 }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x0089 }
                java.lang.String r0 = "demandSourceId"
                r7.put(r0, r3)     // Catch:{ Exception -> 0x0089 }
                if (r6 == 0) goto L_0x006a
                int r0 = r6.f5620c     // Catch:{ Exception -> 0x0089 }
                r1 = -1
                if (r0 != r1) goto L_0x005b
                r0 = 1
                goto L_0x005c
            L_0x005b:
                r0 = r5
            L_0x005c:
                if (r0 != 0) goto L_0x006a
                java.lang.String r0 = new com.ironsource.sdk.g.f(r9).d("success")     // Catch:{ Exception -> 0x0089 }
                java.lang.String r1 = "state"
                int r2 = r6.f5620c     // Catch:{ Exception -> 0x0089 }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x0089 }
                goto L_0x0075
            L_0x006a:
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f     // Catch:{ Exception -> 0x0089 }
                r0.<init>(r9)     // Catch:{ Exception -> 0x0089 }
                java.lang.String r1 = "fail"
                java.lang.String r0 = r0.d(r1)     // Catch:{ Exception -> 0x0089 }
            L_0x0075:
                java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x0089 }
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0089 }
                if (r2 != 0) goto L_0x0097
                java.lang.String r0 = com.ironsource.sdk.controller.A.b(r0, r1)     // Catch:{ Exception -> 0x0089 }
                com.ironsource.sdk.controller.A r1 = com.ironsource.sdk.controller.A.this     // Catch:{ Exception -> 0x0089 }
                r1.b((java.lang.String) r0)     // Catch:{ Exception -> 0x0089 }
                goto L_0x0097
            L_0x0089:
                r0 = move-exception
                com.ironsource.sdk.controller.A r1 = com.ironsource.sdk.controller.A.this
                java.lang.String r2 = r0.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.A.d(r1, r9, r5, r2, r3)
                r0.printStackTrace()
            L_0x0097:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.A.d.getDemandSourceState(java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0336, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x033a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x032a  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0332  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0340  */
        /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDeviceStatus(java.lang.String r14) {
            /*
                r13 = this;
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                java.lang.String r0 = r0.f5185e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getDeviceStatus("
                r1.<init>(r2)
                r1.append(r14)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                java.lang.String r0 = new com.ironsource.sdk.g.f(r14).d("success")
                com.ironsource.sdk.g.f r1 = new com.ironsource.sdk.g.f
                r1.<init>(r14)
                java.lang.String r14 = "fail"
                java.lang.String r14 = r1.d(r14)
                com.ironsource.sdk.controller.A r1 = com.ironsource.sdk.controller.A.this
                android.content.Context r2 = r1.getContext()
                java.lang.String r3 = "none"
                com.ironsource.sdk.utils.a r4 = com.ironsource.sdk.utils.a.a(r2)
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                r6 = 1
                r7 = 0
                java.lang.String r8 = "appOrientation"
                r5.put(r8, r3)     // Catch:{ JSONException -> 0x030b }
                java.lang.String r8 = "deviceOrientation"
                int r9 = com.ironsource.environment.h.o(r2)     // Catch:{ JSONException -> 0x030b }
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.translateDeviceOrientation(r9)     // Catch:{ JSONException -> 0x030b }
                r5.put(r8, r9)     // Catch:{ JSONException -> 0x030b }
                java.lang.String r8 = r4.f5762a     // Catch:{ JSONException -> 0x030b }
                if (r8 == 0) goto L_0x005f
                java.lang.String r9 = "deviceOEM"
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.encodeString(r9)     // Catch:{ JSONException -> 0x030b }
                java.lang.String r8 = com.ironsource.sdk.utils.SDKUtils.encodeString(r8)     // Catch:{ JSONException -> 0x030b }
                r5.put(r9, r8)     // Catch:{ JSONException -> 0x030b }
            L_0x005f:
                java.lang.String r8 = r4.f5763b     // Catch:{ JSONException -> 0x030b }
                if (r8 == 0) goto L_0x0072
                java.lang.String r9 = "deviceModel"
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.encodeString(r9)     // Catch:{ JSONException -> 0x030b }
                java.lang.String r8 = com.ironsource.sdk.utils.SDKUtils.encodeString(r8)     // Catch:{ JSONException -> 0x030b }
                r5.put(r9, r8)     // Catch:{ JSONException -> 0x030b }
                r8 = r7
                goto L_0x0073
            L_0x0072:
                r8 = r6
            L_0x0073:
                com.ironsource.sdk.utils.SDKUtils.loadGoogleAdvertiserInfo(r2)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.getAdvertiserId()     // Catch:{ JSONException -> 0x0309 }
                boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x0309 }
                if (r10 != 0) goto L_0x0090
                java.lang.String r10 = r1.f5185e     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r11 = "add AID"
                com.ironsource.sdk.utils.Logger.i(r10, r11)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r10 = "deviceIds[AID]"
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.encodeString(r9)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r10, r9)     // Catch:{ JSONException -> 0x0309 }
            L_0x0090:
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.getLimitAdTracking()     // Catch:{ JSONException -> 0x0309 }
                boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x0309 }
                if (r10 != 0) goto L_0x00aa
                java.lang.String r10 = r1.f5185e     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r11 = "add LAT"
                com.ironsource.sdk.utils.Logger.i(r10, r11)     // Catch:{ JSONException -> 0x0309 }
                boolean r9 = java.lang.Boolean.parseBoolean(r9)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r10 = "isLimitAdTrackingEnabled"
                r5.put(r10, r9)     // Catch:{ JSONException -> 0x0309 }
            L_0x00aa:
                java.lang.String r9 = r4.f5764c     // Catch:{ JSONException -> 0x0309 }
                if (r9 == 0) goto L_0x00bc
                java.lang.String r10 = "deviceOs"
                java.lang.String r10 = com.ironsource.sdk.utils.SDKUtils.encodeString(r10)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.encodeString(r9)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r10, r9)     // Catch:{ JSONException -> 0x0309 }
                goto L_0x00bd
            L_0x00bc:
                r8 = r6
            L_0x00bd:
                java.lang.String r9 = r4.f5765d     // Catch:{ JSONException -> 0x0309 }
                if (r9 == 0) goto L_0x00d3
                java.lang.String r10 = "[^0-9/.]"
                java.lang.String r11 = ""
                java.lang.String r9 = r9.replaceAll(r10, r11)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r10 = "deviceOSVersion"
                java.lang.String r10 = com.ironsource.sdk.utils.SDKUtils.encodeString(r10)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r10, r9)     // Catch:{ JSONException -> 0x0309 }
                goto L_0x00d4
            L_0x00d3:
                r8 = r6
            L_0x00d4:
                java.lang.String r9 = r4.f5765d     // Catch:{ JSONException -> 0x0309 }
                if (r9 == 0) goto L_0x00e5
                java.lang.String r10 = "deviceOSVersionFull"
                java.lang.String r10 = com.ironsource.sdk.utils.SDKUtils.encodeString(r10)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.encodeString(r9)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r10, r9)     // Catch:{ JSONException -> 0x0309 }
            L_0x00e5:
                int r9 = r4.f5766e     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ JSONException -> 0x0309 }
                if (r9 == 0) goto L_0x00f7
                java.lang.String r10 = "deviceApiLevel"
                java.lang.String r10 = com.ironsource.sdk.utils.SDKUtils.encodeString(r10)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r10, r9)     // Catch:{ JSONException -> 0x0309 }
                goto L_0x00f8
            L_0x00f7:
                r8 = r6
            L_0x00f8:
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.getSDKVersion()     // Catch:{ JSONException -> 0x0309 }
                if (r9 == 0) goto L_0x010b
                java.lang.String r10 = "SDKVersion"
                java.lang.String r10 = com.ironsource.sdk.utils.SDKUtils.encodeString(r10)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.encodeString(r9)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r10, r9)     // Catch:{ JSONException -> 0x0309 }
            L_0x010b:
                java.lang.String r9 = r4.f5767f     // Catch:{ JSONException -> 0x0309 }
                if (r9 == 0) goto L_0x0124
                int r9 = r9.length()     // Catch:{ JSONException -> 0x0309 }
                if (r9 <= 0) goto L_0x0124
                java.lang.String r9 = "mobileCarrier"
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.encodeString(r9)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r4 = r4.f5767f     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.encodeString(r4)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r9, r4)     // Catch:{ JSONException -> 0x0309 }
            L_0x0124:
                java.lang.String r4 = com.ironsource.d.a.a((android.content.Context) r2)     // Catch:{ JSONException -> 0x0309 }
                boolean r3 = r4.equals(r3)     // Catch:{ JSONException -> 0x0309 }
                if (r3 != 0) goto L_0x013c
                java.lang.String r3 = "connectionType"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.encodeString(r4)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0309 }
                goto L_0x013d
            L_0x013c:
                r8 = r6
            L_0x013d:
                java.lang.String r3 = "hasVPN"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                boolean r4 = com.ironsource.d.a.c(r2)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = "uxt"
                boolean r4 = com.ironsource.sdk.utils.IronSourceStorageUtils.isUxt()     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0309 }
                android.content.res.Resources r3 = r2.getResources()     // Catch:{ JSONException -> 0x0309 }
                android.content.res.Configuration r3 = r3.getConfiguration()     // Catch:{ JSONException -> 0x0309 }
                java.util.Locale r3 = r3.locale     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = r3.getLanguage()     // Catch:{ JSONException -> 0x0309 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0309 }
                if (r4 != 0) goto L_0x0178
                java.lang.String r4 = "deviceLanguage"
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.encodeString(r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = r3.toUpperCase()     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r4, r3)     // Catch:{ JSONException -> 0x0309 }
            L_0x0178:
                boolean r3 = com.ironsource.sdk.utils.SDKUtils.isExternalStorageAvailable()     // Catch:{ JSONException -> 0x0309 }
                if (r3 == 0) goto L_0x0196
                java.lang.String r3 = r1.E     // Catch:{ JSONException -> 0x0309 }
                long r3 = com.ironsource.environment.h.a((java.lang.String) r3)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r9 = "diskFreeSize"
                java.lang.String r9 = com.ironsource.sdk.utils.SDKUtils.encodeString(r9)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r9, r3)     // Catch:{ JSONException -> 0x0309 }
                goto L_0x0197
            L_0x0196:
                r8 = r6
            L_0x0197:
                int r3 = com.ironsource.environment.h.m()     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x0309 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r9 = "]"
                java.lang.String r10 = "["
                java.lang.String r11 = "deviceScreenSize"
                if (r4 != 0) goto L_0x01d2
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0309 }
                r4.<init>()     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r12 = com.ironsource.sdk.utils.SDKUtils.encodeString(r11)     // Catch:{ JSONException -> 0x0309 }
                r4.append(r12)     // Catch:{ JSONException -> 0x0309 }
                r4.append(r10)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r12 = "width"
                java.lang.String r12 = com.ironsource.sdk.utils.SDKUtils.encodeString(r12)     // Catch:{ JSONException -> 0x0309 }
                r4.append(r12)     // Catch:{ JSONException -> 0x0309 }
                r4.append(r9)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r4, r3)     // Catch:{ JSONException -> 0x0309 }
                goto L_0x01d3
            L_0x01d2:
                r8 = r6
            L_0x01d3:
                int r3 = com.ironsource.environment.h.n()     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x0309 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0309 }
                r4.<init>()     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r11 = com.ironsource.sdk.utils.SDKUtils.encodeString(r11)     // Catch:{ JSONException -> 0x0309 }
                r4.append(r11)     // Catch:{ JSONException -> 0x0309 }
                r4.append(r10)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r10 = "height"
                java.lang.String r10 = com.ironsource.sdk.utils.SDKUtils.encodeString(r10)     // Catch:{ JSONException -> 0x0309 }
                r4.append(r10)     // Catch:{ JSONException -> 0x0309 }
                r4.append(r9)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r4, r3)     // Catch:{ JSONException -> 0x0309 }
                android.content.Context r3 = r1.getContext()     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = r3.getPackageName()     // Catch:{ JSONException -> 0x0309 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0309 }
                if (r4 != 0) goto L_0x021c
                java.lang.String r4 = "bundleId"
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.encodeString(r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r4, r3)     // Catch:{ JSONException -> 0x0309 }
            L_0x021c:
                float r3 = com.ironsource.environment.h.o()     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x0309 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0309 }
                if (r4 != 0) goto L_0x0237
                java.lang.String r4 = "deviceScreenScale"
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.encodeString(r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r4, r3)     // Catch:{ JSONException -> 0x0309 }
            L_0x0237:
                boolean r3 = com.ironsource.environment.h.j()     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x0309 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0309 }
                if (r4 != 0) goto L_0x0252
                java.lang.String r4 = "unLocked"
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.encodeString(r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r4, r3)     // Catch:{ JSONException -> 0x0309 }
            L_0x0252:
                com.ironsource.sdk.utils.a.a(r2)     // Catch:{ JSONException -> 0x0309 }
                float r3 = com.ironsource.sdk.utils.a.b(r2)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r4 = "deviceVolume"
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.encodeString(r4)     // Catch:{ JSONException -> 0x0309 }
                double r9 = (double) r3     // Catch:{ JSONException -> 0x0309 }
                r5.put(r4, r9)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = "batteryLevel"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                int r4 = com.ironsource.environment.h.v(r2)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = "mcc"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                int r4 = com.ironsource.environment.a.AnonymousClass1.c(r2)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = "mnc"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                int r4 = com.ironsource.environment.a.AnonymousClass1.d(r2)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = "phoneType"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                int r4 = com.ironsource.environment.a.AnonymousClass1.f(r2)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = "simOperator"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r4 = com.ironsource.environment.a.AnonymousClass1.e(r2)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.encodeString(r4)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = "lastUpdateTime"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                long r9 = com.ironsource.environment.c.b(r2)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r9)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = "firstInstallTime"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                long r9 = com.ironsource.environment.c.a(r2)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r9)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = "appVersion"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r4 = com.ironsource.environment.c.c(r2)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.encodeString(r4)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = com.ironsource.environment.c.d(r2)     // Catch:{ JSONException -> 0x0309 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0309 }
                if (r4 != 0) goto L_0x02ea
                java.lang.String r4 = "installerPackageName"
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.encodeString(r4)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r4, r3)     // Catch:{ JSONException -> 0x0309 }
            L_0x02ea:
                java.lang.String r3 = "gpi"
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.encodeString(r3)     // Catch:{ JSONException -> 0x0309 }
                android.content.Context r1 = r1.getContext()     // Catch:{ JSONException -> 0x0309 }
                boolean r1 = com.ironsource.environment.k.a(r1)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r3, r1)     // Catch:{ JSONException -> 0x0309 }
                java.lang.String r1 = "screenBrightness"
                java.lang.String r1 = com.ironsource.sdk.utils.SDKUtils.encodeString(r1)     // Catch:{ JSONException -> 0x0309 }
                int r2 = com.ironsource.environment.h.z(r2)     // Catch:{ JSONException -> 0x0309 }
                r5.put(r1, r2)     // Catch:{ JSONException -> 0x0309 }
                goto L_0x0310
            L_0x0309:
                r1 = move-exception
                goto L_0x030d
            L_0x030b:
                r1 = move-exception
                r8 = r7
            L_0x030d:
                r1.printStackTrace()
            L_0x0310:
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = r5.toString()
                r1[r7] = r2
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
                r1[r6] = r2
                r1 = r1[r7]
                java.lang.String r1 = (java.lang.String) r1
                boolean r2 = r2.booleanValue()
                r3 = 0
                if (r2 == 0) goto L_0x0332
                boolean r0 = android.text.TextUtils.isEmpty(r14)
                if (r0 != 0) goto L_0x0339
                r0 = r14
                goto L_0x033a
            L_0x0332:
                boolean r14 = android.text.TextUtils.isEmpty(r0)
                if (r14 != 0) goto L_0x0339
                goto L_0x033a
            L_0x0339:
                r0 = r3
            L_0x033a:
                boolean r14 = android.text.TextUtils.isEmpty(r0)
                if (r14 != 0) goto L_0x034d
                java.lang.String r14 = "onGetDeviceStatusSuccess"
                java.lang.String r2 = "onGetDeviceStatusFail"
                java.lang.String r14 = com.ironsource.sdk.controller.A.b(r0, r1, r14, r2)
                com.ironsource.sdk.controller.A r0 = com.ironsource.sdk.controller.A.this
                r0.b((java.lang.String) r14)
            L_0x034d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.A.d.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            w0.e("getDeviceVolume(", str, ")", A.this.f5185e);
            try {
                Context context = A.this.getContext();
                com.ironsource.sdk.utils.a.a(context);
                float b10 = com.ironsource.sdk.utils.a.b(context);
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                fVar.a("deviceVolume", String.valueOf(b10));
                A.d(A.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "getInitSummery(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            fVar.a("recoveryInfo", A.this.U);
            A.d(A.this, fVar.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5124y, (Map<String, Object>) new com.ironsource.sdk.a.a().a("generalmessage", str).f5086a);
            String k10 = new com.ironsource.sdk.g.f(str).d("success");
            String jSONObject = SDKUtils.getOrientation(A.this.getContext()).toString();
            if (!TextUtils.isEmpty(k10)) {
                A.this.b(A.b(k10, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
            }
        }

        @JavascriptInterface
        public void getUserData(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "getUserData(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (!fVar.a("key")) {
                A.d(A.this, str, false, "key does not exist", (String) null);
                return;
            }
            String k10 = new com.ironsource.sdk.g.f(str).d("success");
            String d10 = fVar.d("key");
            String string = com.ironsource.sdk.utils.b.a().f5770a.getString(d10, (String) null);
            if (string == null) {
                string = "{}";
            }
            A.this.b(A.b(k10, A.a(d10, string, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            JSONObject jSONObject;
            try {
                String str2 = A.this.f5185e;
                Logger.i(str2, "iabTokenAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                y yVar = A.this.N;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject2 = new JSONObject(fVar2);
                String optString = jSONObject2.optString("functionName");
                JSONObject optJSONObject = jSONObject2.optJSONObject("functionParams");
                String optString2 = jSONObject2.optString("success");
                String optString3 = jSONObject2.optString("fail");
                if ("updateToken".equals(optString)) {
                    com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                    try {
                        com.ironsource.sdk.service.c cVar = yVar.f5539b;
                        com.ironsource.environment.c.e.a("ctgp", optJSONObject);
                        yVar.f5538a.a(optJSONObject);
                        aVar.a(true, optString2, fVar3);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Logger.i("y", "updateToken exception " + e10.getMessage());
                        aVar.a(false, optString3, fVar3);
                    }
                } else if ("getToken".equals(optString)) {
                    try {
                        if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken")) {
                            jSONObject = yVar.f5541d.a();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                Object obj = jSONObject.get(next);
                                if (obj instanceof String) {
                                    jSONObject.put(next, StringUtils.encodeURI((String) obj));
                                }
                            }
                        } else {
                            jSONObject = yVar.f5538a.b(yVar.f5540c);
                        }
                        aVar.a(true, optString2, jSONObject);
                    } catch (Exception e11) {
                        String message = e11.getMessage();
                        com.ironsource.sdk.g.f fVar4 = new com.ironsource.sdk.g.f();
                        int i10 = A.f5183q0;
                        fVar4.a("fail", optString3);
                        fVar4.a("data", message);
                        A.d(A.this, fVar4.toString(), false, (String) null, (String) null);
                    }
                } else {
                    Logger.i("y", "unhandled API request " + fVar2);
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                String str3 = A.this.f5185e;
                Logger.i(str3, "iabTokenAPI failed with exception " + e12.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "initController(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            CountDownTimer countDownTimer = A.this.f5186f;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                A.this.f5186f = null;
            }
            if (fVar.a("stage")) {
                String d10 = fVar.d("stage");
                if ("ready".equalsIgnoreCase(d10)) {
                    A a10 = A.this;
                    a10.f5191l = true;
                    a10.S.b();
                } else if ("loaded".equalsIgnoreCase(d10)) {
                    A.this.S.a();
                } else if ("failed".equalsIgnoreCase(d10)) {
                    String d11 = fVar.d("errMsg");
                    z7.b bVar = A.this.S;
                    bVar.a("controller js failed to initialize : " + d11);
                } else {
                    Logger.i(A.this.f5185e, "No STAGE mentioned! should not get here!");
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            A.this.e((Runnable) new q(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            w0.e("onAdWindowsClosed(", str, ")", A.this.f5185e);
            A a10 = A.this;
            com.ironsource.sdk.g.b bVar = a10.H;
            bVar.f5609e = -1;
            bVar.f5607c = null;
            a10.f5192m = null;
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            d.e n2 = A.n(d10);
            String str2 = A.this.f5187g;
            Log.d(str2, "onAdClosed() with type " + n2);
            if (A.this.i(d10)) {
                A a11 = A.this;
                a11.getClass();
                a11.m(new z7.a(a11, n2, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            w0.e("onGetApplicationInfoFail(", str, ")", A.this.f5185e);
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            w0.e("onGetApplicationInfoSuccess(", str, ")", A.this.f5185e);
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            w0.e("onGetCachedFilesMapFail(", str, ")", A.this.f5185e);
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            w0.e("onGetCachedFilesMapSuccess(", str, ")", A.this.f5185e);
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            w0.e("onGetDeviceStatusFail(", str, ")", A.this.f5185e);
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            w0.e("onGetDeviceStatusSuccess(", str, ")", A.this.f5185e);
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "onGetUserCreditsFail(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (A.this.i(d.e.OfferWall.toString())) {
                A.this.m(new n(d10));
            }
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "onInitBannerFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(A.this.f5185e, "onInitBannerFail failed with no demand source");
                return;
            }
            k kVar = A.this.K;
            d.e eVar = d.e.f5647a;
            com.ironsource.sdk.g.c a10 = kVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.a(3);
            }
            if (A.this.i(eVar.toString())) {
                A.this.m(new i(d10, fetchDemandSourceId));
            }
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onInitBannerFail", str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(A.this.f5185e, "onInitBannerSuccess()");
            A.l(A.this, "onInitBannerSuccess", "true");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(A.this.f5185e, "onInitBannerSuccess failed with no demand source");
            } else if (A.this.i(d.e.f5647a.toString())) {
                A.this.m(new h(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "onInitInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(A.this.f5185e, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            k kVar = A.this.K;
            d.e eVar = d.e.f5649c;
            com.ironsource.sdk.g.c a10 = kVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.a(3);
            }
            if (A.this.i(eVar.toString())) {
                A.this.m(new c0(d10, fetchDemandSourceId));
            }
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onInitInterstitialFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(A.this.f5185e, "onInitInterstitialSuccess()");
            A.l(A.this, "onInitInterstitialSuccess", "true");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(A.this.f5185e, "onInitInterstitialSuccess failed with no demand source");
            } else if (A.this.i(d.e.f5649c.toString())) {
                A.this.m(new b0(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            w0.e("onInitOfferWallFail(", str, ")", A.this.f5185e);
            A.this.H.f5614j = false;
            String d10 = new com.ironsource.sdk.g.f(str).d("errMsg");
            A a10 = A.this;
            com.ironsource.sdk.g.b bVar = a10.H;
            if (bVar.f5613i) {
                bVar.f5613i = false;
                if (a10.i(d.e.OfferWall.toString())) {
                    A.this.m(new c(d10));
                }
            }
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            A.l(A.this, "onInitOfferWallSuccess", "true");
            A a10 = A.this;
            com.ironsource.sdk.g.b bVar = a10.H;
            bVar.f5614j = true;
            if (bVar.f5613i) {
                bVar.f5613i = false;
                if (a10.i(d.e.OfferWall.toString())) {
                    A.this.m(new b());
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "onInitRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            k kVar = A.this.K;
            d.e eVar = d.e.RewardedVideo;
            com.ironsource.sdk.g.c a10 = kVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.a(3);
            }
            if (A.this.i(eVar.toString())) {
                A.this.m(new w(d10, fetchDemandSourceId));
            }
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(A.this.f5185e, "onLoadBannerFail()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            A.d(A.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && A.this.i(d.e.f5647a.toString())) {
                A.this.m(new k(d10, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(A.this.f5185e, "onLoadBannerSuccess()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d10 = fVar.d("adViewId");
            A.d(A.this, str, true, (String) null, (String) null);
            com.ironsource.sdk.c.f a10 = com.ironsource.sdk.c.e.a().a(d10);
            if (a10 == null) {
                com.ironsource.sdk.j.a.b bVar = A.this.C;
                bVar.d(fetchDemandSourceId, "not found view for the current adViewId= " + d10);
            } else if (a10 instanceof com.ironsource.sdk.c.b) {
                com.ironsource.sdk.c.b bVar2 = (com.ironsource.sdk.c.b) a10;
                if (A.this.i(d.e.f5647a.toString())) {
                    A.this.m(new j(fetchDemandSourceId, bVar2));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "onLoadInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            A.d(A.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                a(fetchDemandSourceId, false);
                if (A.this.i(d.e.f5649c.toString())) {
                    A.this.m(new f(d10, fetchDemandSourceId));
                }
                A.l(A.this, "onLoadInterstitialFail", "true");
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "onLoadInterstitialSuccess(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            a(fetchDemandSourceId, true);
            A.d(A.this, str, true, (String) null, (String) null);
            if (A.this.i(d.e.f5649c.toString())) {
                A.this.m(new e(fetchDemandSourceId));
            }
            A.l(A.this, "onLoadInterstitialSuccess", "true");
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            w0.e("onOfferWallGeneric(", str, ")", A.this.f5185e);
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            w0.e("onReceivedMessage(", str, ")", A.this.f5185e);
            com.ironsource.environment.thread.a.f3770a.b(new m(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "onShowInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            A.d(A.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                a(fetchDemandSourceId, false);
                if (A.this.i(d.e.f5649c.toString())) {
                    A.this.m(new g(d10, fetchDemandSourceId));
                }
                A.l(A.this, "onShowInterstitialFail", str);
            }
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            w0.e("onShowInterstitialSuccess(", str, ")", A.this.f5185e);
            A.d(A.this, str, true, (String) null, (String) null);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(A.this.f5185e, "onShowInterstitialSuccess called with no demand");
                return;
            }
            com.ironsource.sdk.g.b bVar = A.this.H;
            d.e eVar = d.e.f5649c;
            bVar.f5609e = eVar.ordinal();
            A a10 = A.this;
            a10.H.f5607c = fetchDemandSourceId;
            if (a10.i(eVar.toString())) {
                A.this.m(new e0(fetchDemandSourceId));
                A.l(A.this, "onShowInterstitialSuccess", str);
            }
            a(fetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "onShowOfferWallFail(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (A.this.i(d.e.OfferWall.toString())) {
                A.this.m(new a0(d10));
            }
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            w0.e("onShowOfferWallSuccess(", str, ")", A.this.f5185e);
            com.ironsource.sdk.g.b bVar = A.this.H;
            d.e eVar = d.e.OfferWall;
            bVar.f5609e = eVar.ordinal();
            String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, "placementId");
            if (A.this.i(eVar.toString())) {
                A.this.m(new z(valueFromJsonObject));
            }
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "onShowRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (A.this.i(d.e.RewardedVideo.toString())) {
                A.this.m(new y(d10, fetchDemandSourceId));
            }
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            w0.e("onShowRewardedVideoSuccess(", str, ")", A.this.f5185e);
            A.d(A.this, str, true, (String) null, (String) null);
            A.l(A.this, "onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String str2 = A.this.f5185e;
            Log.d(str2, "onVideoStatusChanged(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("productType");
            if (A.this.G != null && !TextUtils.isEmpty(d10)) {
                String d11 = fVar.d(IronSourceConstants.EVENTS_STATUS);
                if ("started".equalsIgnoreCase(d11)) {
                    A.this.G.onVideoStarted();
                } else if ("paused".equalsIgnoreCase(d11)) {
                    A.this.G.onVideoPaused();
                } else if ("playing".equalsIgnoreCase(d11)) {
                    A.this.G.onVideoResumed();
                } else if ("ended".equalsIgnoreCase(d11)) {
                    A.this.G.onVideoEnded();
                } else if ("stopped".equalsIgnoreCase(d11)) {
                    A.this.G.onVideoStopped();
                } else {
                    String str3 = A.this.f5185e;
                    Logger.i(str3, "onVideoStatusChanged: unknown status: " + d11);
                }
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            A a10;
            Class<OpenUrlActivity> cls = OpenUrlActivity.class;
            Logger.i(A.this.f5185e, "openUrl(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("url");
            String d11 = fVar.d("method");
            String d12 = fVar.d("package_name");
            try {
                Activity a11 = A.this.f5195o0.a();
                String lowerCase = d11.toLowerCase();
                char c10 = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != -1455867212) {
                    if (hashCode != 109770977) {
                        if (hashCode == 1224424441) {
                            if (lowerCase.equals("webview")) {
                                c10 = 1;
                            }
                        }
                    } else if (lowerCase.equals("store")) {
                        c10 = 2;
                    }
                } else if (lowerCase.equals("external_browser")) {
                    c10 = 0;
                }
                if (c10 == 0) {
                    a.AnonymousClass1.a(a11, d10, d12);
                    a10 = A.this;
                } else if (c10 == 1) {
                    Intent intent = new Intent(a11, cls);
                    intent.putExtra(A.f5181c, d10);
                    intent.putExtra(A.f5182d, true);
                    intent.putExtra("immersive", A.this.J);
                    a11.startActivity(intent);
                    a10 = A.this;
                } else if (c10 != 2) {
                    A.d(A.this, str, false, "method " + d11 + " is unsupported", (String) null);
                    return;
                } else {
                    Intent intent2 = new Intent(a11, cls);
                    intent2.putExtra(A.f5181c, d10);
                    intent2.putExtra(A.f5180b, true);
                    intent2.putExtra(A.f5182d, true);
                    a11.startActivity(intent2);
                    a10 = A.this;
                }
                A.d(a10, str, true, (String) null, (String) null);
            } catch (Exception e10) {
                A.d(A.this, str, false, e10.getMessage(), (String) null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            A.this.e((Runnable) new C0060d());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                String str2 = A.this.f5185e;
                Logger.i(str2, "permissionsAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                u uVar = A.this.M;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                String optString = jSONObject.optString("functionName");
                JSONObject optJSONObject = jSONObject.optJSONObject("functionParams");
                String optString2 = jSONObject.optString("success");
                String optString3 = jSONObject.optString("fail");
                if ("getPermissions".equals(optString)) {
                    com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                    try {
                        fVar3.a("permissions", com.ironsource.environment.c.a(uVar.f5524a, optJSONObject.getJSONArray("permissions")));
                        aVar.a(true, optString2, fVar3);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Logger.i("u", "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e10.getMessage());
                        fVar3.a("errMsg", e10.getMessage());
                        aVar.a(false, optString3, fVar3);
                    }
                } else if ("isPermissionGranted".equals(optString)) {
                    com.ironsource.sdk.g.f fVar4 = new com.ironsource.sdk.g.f();
                    try {
                        String string = optJSONObject.getString("permission");
                        fVar4.a("permission", string);
                        if (com.ironsource.environment.c.a(uVar.f5524a, string)) {
                            fVar4.a(IronSourceConstants.EVENTS_STATUS, String.valueOf(com.ironsource.environment.c.b(uVar.f5524a, string)));
                            aVar.a(true, optString2, fVar4);
                            return;
                        }
                        fVar4.a(IronSourceConstants.EVENTS_STATUS, "unhandledPermission");
                        aVar.a(false, optString3, fVar4);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        fVar4.a("errMsg", e11.getMessage());
                        aVar.a(false, optString3, fVar4);
                    }
                } else {
                    Logger.i("u", "PermissionsJSAdapter unhandled API request " + fVar2);
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                String str3 = A.this.f5185e;
                Logger.i(str3, "permissionsAPI failed with exception " + e12.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            String str2;
            try {
                String str3 = A.this.f5185e;
                Logger.i(str3, "postAdEventNotification(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("eventName");
                if (TextUtils.isEmpty(d10)) {
                    A.d(A.this, str, false, "eventName does not exist", (String) null);
                    return;
                }
                String d11 = fVar.d("dsName");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                    str2 = fetchDemandSourceId;
                } else {
                    str2 = d11;
                }
                JSONObject jSONObject = (JSONObject) fVar.c("extData");
                String d12 = fVar.d("productType");
                d.e n2 = A.n(d12);
                if (A.this.i(d12)) {
                    String k10 = new com.ironsource.sdk.g.f(str).d("success");
                    if (!TextUtils.isEmpty(k10)) {
                        A.this.b(A.b(k10, A.a("productType", d12, "eventName", d10, "demandSourceName", d11, "demandSourceId", str2, (String) null, false), "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                    }
                    A.this.m(new o(n2, str2, d10, jSONObject));
                    return;
                }
                A.d(A.this, str, false, "productType does not exist", (String) null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            w0.e("removeCloseEventHandler(", str, ")", A.this.f5185e);
            CountDownTimer countDownTimer = A.this.f5194o;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            A.this.f5193n = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            A.this.e((Runnable) new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            A.this.e((Runnable) new l());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                String str2 = A.this.f5185e;
                Logger.i(str2, "saveFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("path");
                String d11 = fVar.d("file");
                if (TextUtils.isEmpty(d11)) {
                    A.d(A.this, str, false, "Missing parameters for file", IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(A.this.E, d10), SDKUtils.getFileName(d11));
                IronSourceStorageUtils.ensurePathSafety(cVar, A.this.E);
                if (com.ironsource.environment.h.a(A.this.E) <= 0) {
                    A.d(A.this, str, false, "no_disk_space", (String) null);
                } else if (!SDKUtils.isExternalStorageAvailable()) {
                    A.d(A.this, str, false, "storage_unavailable", (String) null);
                } else if (cVar.exists()) {
                    A.d(A.this, str, false, "file_already_exist", (String) null);
                } else if (!a.AnonymousClass1.b(A.this.getContext())) {
                    A.d(A.this, str, false, "no_network_connection", (String) null);
                } else {
                    A.d(A.this, str, true, (String) null, (String) null);
                    int a10 = fVar.a("connectionTimeout", 0);
                    int a11 = fVar.a("readTimeout", 0);
                    com.ironsource.sdk.l.d dVar = A.this.k;
                    dVar.a(cVar, d11, a10, a11, dVar.f5731a).start();
                }
            } catch (Exception e10) {
                A.d(A.this, str, false, e10.getMessage(), (String) null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "setBackButtonState(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d("state");
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f5770a.edit();
            edit.putString("back_button_state", d10);
            edit.apply();
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "setForceClose(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("width");
            String d11 = fVar.d("height");
            A.this.f5196p = Integer.parseInt(d10);
            A.this.f5197q = Integer.parseInt(d11);
            A.this.f5198r = fVar.d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            w0.e("setMixedContentAlwaysAllow(", str, ")", A.this.f5185e);
            A.this.e((Runnable) new r());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "setOrientation(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d("orientation");
            A a10 = A.this;
            a10.f5203y = d10;
            com.ironsource.sdk.j.f fVar = a10.p0;
            if (fVar != null) {
                fVar.onOrientationChanged(d10, com.ironsource.environment.h.k(a10.getContext()));
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            String str2 = A.this.f5185e;
            Logger.i(str2, "setStoreSearchKeys(" + str + ")");
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f5770a.edit();
            edit.putString("search_keys", str);
            edit.apply();
        }

        @JavascriptInterface
        public void setTouchListener(String str) {
            w0.e("removeCloseEventHandler(", str, ")", A.this.f5185e);
            A.this.e((Runnable) new x());
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2;
            A a10;
            String str3 = A.this.f5185e;
            Logger.i(str3, "setUserData(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (!fVar.a("key")) {
                a10 = A.this;
                str2 = "key does not exist";
            } else if (!fVar.a("value")) {
                a10 = A.this;
                str2 = "value does not exist";
            } else {
                String d10 = fVar.d("key");
                String d11 = fVar.d("value");
                SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f5770a.edit();
                edit.putString(d10, d11);
                edit.apply();
                A.this.b(A.b(new com.ironsource.sdk.g.f(str).d("success"), A.a(d10, d11, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                return;
            }
            A.d(a10, str, false, str2, (String) null);
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            int i10;
            w0.e("setWebviewBackgroundColor(", str, ")", A.this.f5185e);
            View view = A.this;
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("color");
            String d11 = fVar.d("adViewId");
            if (!"transparent".equalsIgnoreCase(d10)) {
                i10 = Color.parseColor(d10);
            } else {
                i10 = 0;
            }
            if (d11 == null || (view = com.ironsource.sdk.c.e.a().a(d11).a()) != null) {
                view.setBackgroundColor(i10);
            }
        }
    }

    public class e implements v {
        public e() {
        }

        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            A a10 = A.this;
            int i10 = A.f5183q0;
            a10.f(str, eVar, cVar);
        }
    }

    public class f implements v {
        public f() {
        }

        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            A a10 = A.this;
            int i10 = A.f5183q0;
            a10.f(str, eVar, cVar);
        }
    }

    public enum g {
        Display,
        Gone
    }

    public class h implements v {
        public h() {
        }

        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            A a10 = A.this;
            int i10 = A.f5183q0;
            a10.f(str, eVar, cVar);
        }
    }

    public class i implements v {
        public i() {
        }

        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            A a10 = A.this;
            int i10 = A.f5183q0;
            a10.f(str, eVar, cVar);
        }
    }

    public class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ d.e f5298a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.c f5299b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ String f5300c;

        public k(com.ironsource.sdk.g.c cVar, d.e eVar, String str) {
            this.f5298a = eVar;
            this.f5299b = cVar;
            this.f5300c = str;
        }

        public final void run() {
            d.e eVar = d.e.RewardedVideo;
            d.e eVar2 = this.f5298a;
            if (eVar == eVar2 || d.e.f5649c == eVar2 || d.e.f5647a == eVar2) {
                com.ironsource.sdk.g.c cVar = this.f5299b;
                if (cVar != null && !TextUtils.isEmpty(cVar.f5619b)) {
                    A a10 = A.this;
                    d.e eVar3 = this.f5298a;
                    int i10 = A.f5183q0;
                    com.ironsource.sdk.j.a.a j10 = a10.j(eVar3);
                    String str = A.this.f5185e;
                    Log.d(str, "onAdProductInitFailed (message:" + this.f5300c + ")(" + this.f5298a + ")");
                    if (j10 != null) {
                        j10.a(this.f5298a, this.f5299b.f5619b, this.f5300c);
                    }
                }
            } else if (d.e.OfferWall == eVar2) {
                A.this.B.onOfferwallInitFail(this.f5300c);
            } else if (d.e.OfferWallCredits == eVar2) {
                A.this.B.onGetOWCreditsFailed(this.f5300c);
            }
        }
    }

    public class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ StringBuilder f5302a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5303b;

        public l(StringBuilder sb, String str) {
            this.f5302a = sb;
            this.f5303b = str;
        }

        public final void run() {
            try {
                A a10 = A.this;
                Boolean bool = a10.D;
                if (bool == null) {
                    a10.evaluateJavascript(this.f5302a.toString(), (ValueCallback) null);
                    A.this.D = Boolean.TRUE;
                } else if (bool.booleanValue()) {
                    A.this.evaluateJavascript(this.f5302a.toString(), (ValueCallback) null);
                } else {
                    A.this.loadUrl(this.f5303b);
                }
            } catch (Throwable th) {
                String str = A.this.f5185e;
                Logger.e(str, "injectJavascript: " + th.toString());
            }
        }
    }

    public class m implements Runnable {
        public m() {
        }

        public final void run() {
            A.this.a(1);
        }
    }

    public class n implements Runnable {
        public n() {
        }

        public final void run() {
            A.this.a(1);
        }
    }

    public class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.e f5307a;

        public o(com.ironsource.sdk.g.e eVar) {
            this.f5307a = eVar;
        }

        public final void run() {
            z7.b bVar = A.this.S;
            bVar.a("controller html - failed to download - " + this.f5307a.f5654a);
        }
    }

    public class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f5309a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5310b;

        public p(String str, String str2) {
            this.f5309a = str;
            this.f5310b = str2;
        }

        public final void run() {
            if (A.a() == d.C0067d.MODE_3.f5646d) {
                Activity a10 = A.this.f5195o0.a();
                Toast.makeText(a10, this.f5309a + " : " + this.f5310b, 1).show();
            }
        }
    }

    public class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Context f5312a;

        public q(Context context) {
            this.f5312a = context;
        }

        public final void run() {
            A a10 = A.this;
            Context context = this.f5312a;
            int i10 = A.f5183q0;
            try {
                j jVar = a10.T;
                if (jVar != null) {
                    jVar.f5738a.a(context);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Context f5314a;

        public r(Context context) {
            this.f5314a = context;
        }

        public final void run() {
            A a10 = A.this;
            Context context = this.f5314a;
            int i10 = A.f5183q0;
            try {
                j jVar = a10.T;
                if (jVar != null) {
                    jVar.f5738a.b(context);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class s extends WebChromeClient {
        public s() {
        }

        public final View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(A.this.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        public final boolean onCreateWindow(WebView webView, boolean z9, boolean z10, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new u());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        public final void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            View view = A.this.f5200t;
            if (view != null) {
                view.setVisibility(8);
                A a10 = A.this;
                a10.u.removeView(a10.f5200t);
                A a11 = A.this;
                a11.f5200t = null;
                a11.u.setVisibility(8);
                A.this.f5201v.onCustomViewHidden();
                A.this.setVisibility(0);
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            A.this.setVisibility(8);
            if (A.this.f5200t != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            A.this.u.addView(view);
            A a10 = A.this;
            a10.f5200t = view;
            a10.f5201v = customViewCallback;
            a10.u.setVisibility(0);
        }
    }

    public static class t {

        /* renamed from: a  reason: collision with root package name */
        public d.e f5317a;

        /* renamed from: b  reason: collision with root package name */
        public String f5318b;

        public t(d.e eVar, String str) {
            this.f5317a = eVar;
            this.f5318b = str;
        }
    }

    public class u extends WebViewClient {
        public u() {
        }

        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str = A.this.f5185e;
            Logger.e(str, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Activity a10 = A.this.f5195o0.a();
            Intent intent = new Intent(a10, OpenUrlActivity.class);
            intent.putExtra(A.f5181c, str);
            intent.putExtra(A.f5182d, false);
            a10.startActivity(intent);
            return true;
        }
    }

    public interface v {
        void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar);
    }

    public class w implements View.OnTouchListener {

        public class a extends CountDownTimer {
            public a() {
                super(2000, 500);
            }

            public final void onFinish() {
                Logger.i(A.this.f5185e, "Close Event Timer Finish");
                A a10 = A.this;
                if (a10.f5193n) {
                    a10.f5193n = false;
                } else {
                    a10.d("forceClose");
                }
            }

            public final void onTick(long j10) {
                String str = A.this.f5185e;
                Logger.i(str, "Close Event Timer Tick " + j10);
            }
        }

        public w() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x9 = motionEvent.getX();
                float y9 = motionEvent.getY();
                String str = A.this.f5185e;
                StringBuilder sb = new StringBuilder("X:");
                int i10 = (int) x9;
                sb.append(i10);
                sb.append(" Y:");
                int i11 = (int) y9;
                sb.append(i11);
                Logger.i(str, sb.toString());
                int m2 = com.ironsource.environment.h.m();
                int n2 = com.ironsource.environment.h.n();
                Logger.i(A.this.f5185e, "Width:" + m2 + " Height:" + n2);
                int dpToPx = SDKUtils.dpToPx((long) A.this.f5196p);
                int dpToPx2 = SDKUtils.dpToPx((long) A.this.f5197q);
                if ("top-right".equalsIgnoreCase(A.this.f5198r)) {
                    i10 = m2 - i10;
                } else if (!"top-left".equalsIgnoreCase(A.this.f5198r)) {
                    if ("bottom-right".equalsIgnoreCase(A.this.f5198r)) {
                        i10 = m2 - i10;
                    } else if (!"bottom-left".equalsIgnoreCase(A.this.f5198r)) {
                        i10 = 0;
                        i11 = 0;
                    }
                    i11 = n2 - i11;
                }
                if (i10 <= dpToPx && i11 <= dpToPx2) {
                    A a10 = A.this;
                    a10.f5193n = false;
                    CountDownTimer countDownTimer = a10.f5194o;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    A.this.f5194o = new a().start();
                }
            }
            return false;
        }
    }

    public class x extends WebViewClient {
        public x() {
        }

        public final void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                A a10 = A.this;
                int i10 = A.f5183q0;
                a10.b(new q.a("pageFinished").a());
            }
            super.onPageFinished(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            z7.b bVar;
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains("mobileController.html") && (bVar = A.this.S) != null) {
                bVar.a("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i10 + ")");
            }
            super.onReceivedError(webView, i10, str, str2);
        }

        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str;
            String str2 = A.this.f5185e;
            Log.e(str2, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            if (renderProcessGoneDetail.didCrash()) {
                str = "Render process was observed to crash";
            } else {
                str = "Render process was killed by the system";
            }
            z7.b bVar = A.this.S;
            if (bVar != null) {
                bVar.b(str);
            }
            A a10 = A.this;
            if (a10.f5192m == null) {
                return true;
            }
            com.ironsource.sdk.j.f fVar = a10.p0;
            if (fVar != null) {
                fVar.onCloseRequested();
            }
            t tVar = a10.f5192m;
            d.e eVar = tVar.f5317a;
            String str3 = tVar.f5318b;
            if (!a10.i(eVar.toString())) {
                return true;
            }
            a10.m(new z7.a(a10, eVar, str3));
            return true;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z9;
            Logger.i("shouldInterceptRequest", str);
            try {
                z9 = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z9 = false;
            }
            if (z9) {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(A.this.E);
                String c10 = androidx.activity.e.c(sb, File.separator, "mraid.js");
                try {
                    new FileInputStream(new File(c10));
                    return new WebResourceResponse("text/javascript", "UTF-8", x.class.getResourceAsStream(c10));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (A.this.e(str)) {
                    A.this.b();
                    return true;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public A(Context context, k kVar, C0201c cVar, z7.b bVar, com.ironsource.environment.thread.a aVar, int i10, com.ironsource.sdk.l.d dVar, String str, n.a aVar2, n.b bVar2, String str2, String str3) {
        super(context);
        Class<A> cls = A.class;
        Logger.i("A", "C'tor");
        this.f5195o0 = cVar;
        this.S = bVar;
        this.f5184a = aVar;
        this.K = kVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.w = new FrameLayout(context);
        this.u = new FrameLayout(context);
        this.u.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.u.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this);
        this.w.addView(this.u, layoutParams);
        this.w.addView(frameLayout);
        this.E = str;
        this.H = new com.ironsource.sdk.g.b();
        this.U = new JSONObject();
        this.k = dVar;
        dVar.f5731a.f5729a = this;
        this.V = aVar2;
        this.W = bVar2;
        this.F = new f(SDKUtils.getNetworkConfiguration(), this.E, SDKUtils.getControllerUrl(), dVar);
        s sVar = new s();
        this.f5199s = sVar;
        setWebViewClient(new x());
        setWebChromeClient(sVar);
        com.ironsource.sdk.utils.d.a(this);
        z7.e eVar = new z7.e(UUID.randomUUID().toString(), 0);
        addJavascriptInterface(new z7.c(new e(new d()), eVar), "Android");
        addJavascriptInterface(new z7.d(eVar), "GenerateTokenForMessaging");
        setDownloadListener(this);
        this.T = new j(SDKUtils.getControllerConfigAsJSONObject(), context);
        a(context);
        f5183q0 = i10;
        this.f5188h = str2;
        this.f5189i = str3;
    }

    public static int a() {
        return f5183q0;
    }

    public static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z9) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z9);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static String b(String str, String str2) {
        return new q.a(str, str2).a();
    }

    public static String b(String str, String str2, String str3, String str4) {
        return new q.a(str, str2, str3, str4).a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void d(com.ironsource.sdk.controller.A r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
            r0.<init>(r4)
            java.lang.String r1 = "success"
            java.lang.String r1 = r0.d(r1)
            java.lang.String r2 = "fail"
            java.lang.String r0 = r0.d(r2)
            if (r5 == 0) goto L_0x001a
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0022
            goto L_0x0023
        L_0x001a:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0022
            r1 = r0
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x005a
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x003e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003e }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x003e }
            java.lang.String r0 = "errMsg"
            org.json.JSONObject r5 = r5.put(r0, r6)     // Catch:{ JSONException -> 0x003e }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x003e }
        L_0x003e:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x0053
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0053 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r6 = "errCode"
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x0053 }
        L_0x0053:
            java.lang.String r4 = b(r1, r4)
            r3.b((java.lang.String) r4)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.A.d(com.ironsource.sdk.controller.A, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    public static /* synthetic */ void l(A a10, String str, String str2) {
        String d10 = new com.ironsource.sdk.g.f(str2).d("errMsg");
        if (!TextUtils.isEmpty(d10)) {
            a10.e((Runnable) new p(str, d10));
        }
    }

    public static d.e n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d.e eVar = d.e.f5649c;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        d.e eVar2 = d.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        d.e eVar3 = d.e.OfferWall;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        d.e eVar4 = d.e.f5647a;
        if (str.equalsIgnoreCase(eVar4.toString())) {
            return eVar4;
        }
        return null;
    }

    public static /* synthetic */ void p(A a10, String str) {
        try {
            String str2 = a10.f5185e;
            Logger.i(str2, "load(): " + str);
            a10.loadUrl(str);
        } catch (Throwable th) {
            String str3 = a10.f5185e;
            Logger.e(str3, "WebViewController::load: " + th);
        }
    }

    public final void a(int i10) {
        if (this.F.f5381d != f.b.NONE) {
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            com.ironsource.sdk.utils.a a10 = com.ironsource.sdk.utils.a.a(getContext());
            StringBuilder sb = new StringBuilder();
            String sDKVersion = SDKUtils.getSDKVersion();
            if (!TextUtils.isEmpty(sDKVersion)) {
                sb.append("SDKVersion=");
                sb.append(sDKVersion);
                sb.append("&");
            }
            String str = a10.f5764c;
            if (!TextUtils.isEmpty(str)) {
                sb.append("deviceOs=");
                sb.append(str);
            }
            Uri parse = Uri.parse(SDKUtils.getControllerUrl());
            if (parse != null) {
                String str2 = parse.getScheme() + ":";
                String host = parse.getHost();
                int port = parse.getPort();
                if (port != -1) {
                    host = host + ":" + port;
                }
                sb.append("&protocol");
                sb.append("=");
                sb.append(str2);
                sb.append("&domain");
                sb.append("=");
                sb.append(host);
                if (controllerConfigAsJSONObject.keys().hasNext()) {
                    try {
                        String jSONObject = new JSONObject(controllerConfigAsJSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                        if (!TextUtils.isEmpty(jSONObject)) {
                            sb.append("&controllerConfig");
                            sb.append("=");
                            sb.append(jSONObject);
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
                sb.append("&debug");
                sb.append("=");
                sb.append(f5183q0);
            }
            String sb2 = sb.toString();
            Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
            if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
                sb2 = String.format("%s&sessionid=%s", new Object[]{sb2, initSDKParams.get("sessionid")});
            }
            this.f5184a.a(new b(controllerConfigAsJSONObject, w0.d(this.F.c().toURI().toString(), "?", sb2)));
            this.f5186f = new c(i10).start();
            return;
        }
        Logger.i(this.f5185e, "load(): Mobile Controller HTML Does not exist");
    }

    public final void a(Activity activity) {
        this.f5195o0.a(activity);
    }

    public final void a(h.b bVar, n.a aVar) {
        b(b(bVar.a(), bVar.c(), "onReceivedMessage", "onReceivedMessage"));
    }

    public final void a(com.ironsource.sdk.g.c cVar) {
        b(b("destroyBanner", SDKUtils.flatMapToJsonAsString(cVar.a()), "onDestroyBannersSuccess", "onDestroyBannersFail"));
    }

    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        if (map != null) {
            b(b("loadBanner", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadBannerSuccess", "onLoadBannerFail"));
        }
    }

    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        com.ironsource.sdk.g.b bVar = this.H;
        String str = cVar.f5619b;
        if (!TextUtils.isEmpty(str) && bVar.f5610f.indexOf(str) == -1) {
            bVar.f5610f.add(str);
        }
        b(b("loadInterstitial", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    public final void a(String str, String str2) {
        b(b("onNativeLifeCycleEvent", a("lifeCycleEvent", str2, "productType", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        this.f5188h = str;
        this.f5189i = str2;
        this.C = bVar;
        g(str, d.e.f5647a, cVar, new i());
    }

    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        this.f5188h = str;
        this.f5189i = str2;
        this.A = cVar2;
        com.ironsource.sdk.g.b bVar = this.H;
        bVar.f5611g = str;
        bVar.f5612h = str2;
        g(str, d.e.f5649c, cVar, new e());
    }

    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.f5188h = str;
        this.f5189i = str2;
        this.B = eVar;
        if (TextUtils.isEmpty(str2)) {
            f("UserId missing", d.e.OfferWallCredits, (com.ironsource.sdk.g.c) null);
        } else {
            g(this.f5188h, d.e.OfferWallCredits, (com.ironsource.sdk.g.c) null, new h());
        }
    }

    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f5188h = str;
        this.f5189i = str2;
        this.f5190j = map;
        this.B = eVar;
        com.ironsource.sdk.g.b bVar = this.H;
        bVar.k = map;
        bVar.f5613i = true;
        if (TextUtils.isEmpty(str2)) {
            f("UserId missing", d.e.OfferWall, (com.ironsource.sdk.g.c) null);
        } else {
            g(this.f5188h, d.e.OfferWall, (com.ironsource.sdk.g.c) null, new f());
        }
    }

    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f5190j = map;
        b(new q.a("showOfferWall", (String) null, "onShowOfferWallSuccess", "onShowOfferWallFail").a());
    }

    public final void a(JSONObject jSONObject) {
        b(b("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    public final void a(boolean z9, String str) {
        b(b("viewableChange", a("webview", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "isViewable", z9)));
    }

    public final void b() {
        b(new q.a("interceptedUrlToStore").a());
    }

    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i10 = f5183q0;
            String str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
            if (i10 != d.C0067d.MODE_0.f5646d && (i10 < d.C0067d.MODE_1.f5646d || i10 > d.C0067d.MODE_3.f5646d)) {
                str2 = "empty";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("try{");
            sb.append(str);
            sb.append("}catch(e){");
            sb.append(str2);
            sb.append("}");
            String str3 = "javascript:" + sb.toString();
            Logger.i(this.f5185e, str3);
            e((Runnable) new l(sb, str3));
        }
    }

    public final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.U = jSONObject;
        }
    }

    public final d.c c() {
        return d.c.Web;
    }

    public final void c(String str) {
        String str2 = this.f5185e;
        Logger.i(str2, "device status changed, connection type " + str);
        com.ironsource.sdk.a.d.a(str);
        b(b("deviceStatusChanged", a("connectionType", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    public final void d() {
        b(new q.a("enterForeground").a());
    }

    public void destroy() {
        super.destroy();
        com.ironsource.sdk.l.d dVar = this.k;
        if (dVar != null) {
            dVar.a();
        }
        j jVar = this.T;
        if (jVar != null) {
            jVar.f5738a.a();
        }
        CountDownTimer countDownTimer = this.f5186f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void e() {
        b(new q.a("enterBackground").a());
    }

    public final void e(Runnable runnable) {
        com.ironsource.environment.thread.a aVar = this.f5184a;
        if (aVar != null) {
            aVar.a(runnable);
        }
    }

    public final boolean e(String str) {
        List<String> b10 = com.ironsource.sdk.utils.b.a().b();
        try {
            if (b10.isEmpty()) {
                return false;
            }
            for (String contains : b10) {
                if (str.contains(contains)) {
                    a.AnonymousClass1.a(this.f5195o0.a(), str, (String) null);
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final void f() {
        a(this.H);
    }

    public final void f(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
        if (i(eVar.toString())) {
            m(new k(cVar, eVar, str));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r14v1 */
    /* JADX WARNING: type inference failed for: r14v3, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r14v9 */
    /* JADX WARNING: type inference failed for: r14v10 */
    /* JADX WARNING: type inference failed for: r14v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(java.lang.String r11, com.ironsource.sdk.g.d.e r12, com.ironsource.sdk.g.c r13, com.ironsource.sdk.controller.A.v r14) {
        /*
            r10 = this;
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x000c
            java.lang.String r11 = "Application key are missing"
            r14.a(r11, r12, r13)
            return
        L_0x000c:
            com.ironsource.sdk.g.d$e r11 = com.ironsource.sdk.g.d.e.RewardedVideo
            r14 = 0
            if (r12 == r11) goto L_0x0042
            com.ironsource.sdk.g.d$e r0 = com.ironsource.sdk.g.d.e.f5649c
            if (r12 == r0) goto L_0x0042
            com.ironsource.sdk.g.d$e r0 = com.ironsource.sdk.g.d.e.OfferWall
            if (r12 == r0) goto L_0x0042
            com.ironsource.sdk.g.d$e r0 = com.ironsource.sdk.g.d.e.f5647a
            if (r12 != r0) goto L_0x001e
            goto L_0x0042
        L_0x001e:
            com.ironsource.sdk.g.d$e r11 = com.ironsource.sdk.g.d.e.OfferWallCredits
            if (r12 != r11) goto L_0x00dc
            java.lang.String r3 = r10.f5188h
            java.lang.String r5 = r10.f5189i
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r0 = "productType"
            java.lang.String r1 = "OfferWall"
            java.lang.String r2 = "applicationKey"
            java.lang.String r4 = "applicationUserId"
            java.lang.String r11 = a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r12 = "getUserCredits"
            java.lang.String r13 = "null"
            java.lang.String r14 = "onGetUserCreditsFail"
            java.lang.String r14 = b(r12, r11, r13, r14)
            goto L_0x00dc
        L_0x0042:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r10.f5188h
            java.lang.String r2 = "applicationKey"
            r0.put(r2, r1)
            java.lang.String r1 = r10.f5189i
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x005d
            java.lang.String r1 = r10.f5189i
            java.lang.String r2 = "applicationUserId"
            r0.put(r2, r1)
        L_0x005d:
            if (r13 == 0) goto L_0x0085
            java.util.Map<java.lang.String, java.lang.String> r1 = r13.f5621d
            if (r1 == 0) goto L_0x0077
            r0.putAll(r1)
            com.ironsource.sdk.service.a r1 = com.ironsource.sdk.service.a.f5745a
            java.lang.String r1 = r13.f5619b
            long r1 = com.ironsource.sdk.service.a.a(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "loadStartTime"
            r0.put(r2, r1)
        L_0x0077:
            java.lang.String r1 = r13.f5618a
            java.lang.String r2 = "demandSourceName"
            r0.put(r2, r1)
            java.lang.String r13 = r13.f5619b
            java.lang.String r1 = "demandSourceId"
            r0.put(r1, r13)
        L_0x0085:
            com.ironsource.sdk.g.d$e r13 = com.ironsource.sdk.g.d.e.OfferWall
            if (r12 != r13) goto L_0x008b
            java.util.Map<java.lang.String, java.lang.String> r14 = r10.f5190j
        L_0x008b:
            if (r14 == 0) goto L_0x0090
            r0.putAll(r14)
        L_0x0090:
            java.lang.String r14 = com.ironsource.sdk.utils.SDKUtils.flatMapToJsonAsString(r0)
            com.ironsource.sdk.f.a$a r0 = new com.ironsource.sdk.f.a$a
            r0.<init>()
            if (r12 != r11) goto L_0x00a6
            java.lang.String r11 = "initRewardedVideo"
            r0.f5597a = r11
            java.lang.String r11 = "onInitRewardedVideoSuccess"
            r0.f5598b = r11
            java.lang.String r11 = "onInitRewardedVideoFail"
            goto L_0x00d0
        L_0x00a6:
            com.ironsource.sdk.g.d$e r11 = com.ironsource.sdk.g.d.e.f5649c
            if (r12 != r11) goto L_0x00b5
            java.lang.String r11 = "initInterstitial"
            r0.f5597a = r11
            java.lang.String r11 = "onInitInterstitialSuccess"
            r0.f5598b = r11
            java.lang.String r11 = "onInitInterstitialFail"
            goto L_0x00d0
        L_0x00b5:
            if (r12 != r13) goto L_0x00c2
            java.lang.String r11 = "initOfferWall"
            r0.f5597a = r11
            java.lang.String r11 = "onInitOfferWallSuccess"
            r0.f5598b = r11
            java.lang.String r11 = "onInitOfferWallFail"
            goto L_0x00d0
        L_0x00c2:
            com.ironsource.sdk.g.d$e r11 = com.ironsource.sdk.g.d.e.f5647a
            if (r12 != r11) goto L_0x00d2
            java.lang.String r11 = "initBanner"
            r0.f5597a = r11
            java.lang.String r11 = "onInitBannerSuccess"
            r0.f5598b = r11
            java.lang.String r11 = "onInitBannerFail"
        L_0x00d0:
            r0.f5599c = r11
        L_0x00d2:
            java.lang.String r11 = r0.f5597a
            java.lang.String r12 = r0.f5598b
            java.lang.String r13 = r0.f5599c
            java.lang.String r14 = b(r11, r14, r12, r13)
        L_0x00dc:
            r10.b((java.lang.String) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.A.g(java.lang.String, com.ironsource.sdk.g.d$e, com.ironsource.sdk.g.c, com.ironsource.sdk.controller.A$v):void");
    }

    public final void h(String str, String str2, String str3) {
        try {
            b(b("assetCachedFailed", a("file", str, "path", o(str2), "errMsg", str3, (String) null, (String) null, (String) null, false)));
        } catch (Exception unused) {
        }
    }

    public final void i() {
        try {
            onPause();
        } catch (Throwable th) {
            String str = this.f5185e;
            Logger.i(str, "WebViewController: onPause() - " + th);
        }
    }

    public final boolean i(String str) {
        boolean z9 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.f5185e, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(d.e.f5649c.toString()) ? !str.equalsIgnoreCase(d.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(d.e.f5647a.toString()) ? (str.equalsIgnoreCase(d.e.OfferWall.toString()) || str.equalsIgnoreCase(d.e.OfferWallCredits.toString())) && this.B != null : this.C != null : this.f5204z != null : this.A != null) {
            z9 = true;
        }
        if (!z9) {
            Logger.d(this.f5185e, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z9;
    }

    public final com.ironsource.sdk.j.a.a j(d.e eVar) {
        if (eVar == d.e.f5649c) {
            return this.A;
        }
        if (eVar == d.e.RewardedVideo) {
            return this.f5204z;
        }
        if (eVar == d.e.f5647a) {
            return this.C;
        }
        return null;
    }

    public final void j() {
        try {
            onResume();
        } catch (Throwable th) {
            String str = this.f5185e;
            Logger.i(str, "WebViewController: onResume() - " + th);
        }
    }

    public final void m(Runnable runnable) {
        com.ironsource.environment.thread.a aVar = this.f5184a;
        if (aVar != null) {
            aVar.c(runnable);
        }
    }

    public final String o(String str) {
        String str2 = this.E + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        String str5 = this.f5185e;
        Logger.i(str5, str + " " + str4);
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        com.ironsource.sdk.j.f fVar;
        if (i10 != 4 || (fVar = this.p0) == null || !fVar.onBackButtonPressed()) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }

    public class j extends com.ironsource.sdk.service.Connectivity.b {
        public j(JSONObject jSONObject, Context context) {
            super(context, jSONObject);
        }

        public final void a() {
            A a10 = A.this;
            if (a10.f5191l) {
                a10.c("none");
            }
        }

        public final void a(String str) {
            A a10 = A.this;
            if (a10.f5191l) {
                a10.c(str);
            }
        }

        public final void a(String str, JSONObject jSONObject) {
            if (jSONObject != null && A.this.f5191l) {
                try {
                    jSONObject.put("connectionType", str);
                    A a10 = A.this;
                    String str2 = a10.f5185e;
                    Logger.i(str2, "device connection info changed: " + jSONObject.toString());
                    a10.b(A.b("connectionInfoChanged", A.a("connectionInfo", jSONObject.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public final void b(Context context) {
        r rVar = new r(context);
        com.ironsource.environment.thread.a aVar = this.f5184a;
        if (aVar != null) {
            aVar.b(rVar);
        }
    }

    public final void d(String str) {
        com.ironsource.sdk.j.f fVar;
        if (str.equals("forceClose") && (fVar = this.p0) != null) {
            fVar.onCloseRequested();
        }
        b(b("engageEnd", a("action", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r6 = this;
            java.lang.String r0 = "next_mobileController.html"
            com.ironsource.sdk.a.a r1 = new com.ironsource.sdk.a.a
            r1.<init>()
            com.ironsource.sdk.controller.f r2 = r6.F
            int r3 = r2.f5379b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "generalmessage"
            r1.a(r4, r3)
            com.ironsource.sdk.a.h$a r3 = com.ironsource.sdk.a.h.u
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r1.f5086a
            com.ironsource.sdk.a.f.a((com.ironsource.sdk.a.h.a) r3, (java.util.Map<java.lang.String, java.lang.Object>) r1)
            long r3 = java.lang.System.currentTimeMillis()
            r2.f5378a = r3
            com.ironsource.sdk.controller.f r1 = r6.F
            r1.getClass()
            int[] r2 = com.ironsource.sdk.controller.f.c.f5397a
            int r3 = r1.f5380c
            r4 = 1
            int r3 = r3 - r4
            r2 = r2[r3]
            if (r2 == r4) goto L_0x00f7
            r3 = 2
            if (r2 == r3) goto L_0x00e6
            r3 = 3
            if (r2 == r3) goto L_0x0038
            goto L_0x010e
        L_0x0038:
            com.ironsource.sdk.h.c r2 = r1.c()     // Catch:{ Exception -> 0x010e }
            com.ironsource.sdk.h.c r3 = new com.ironsource.sdk.h.c     // Catch:{ Exception -> 0x010e }
            java.lang.String r5 = r1.f5382e     // Catch:{ Exception -> 0x010e }
            r3.<init>(r5, r0)     // Catch:{ Exception -> 0x010e }
            boolean r5 = r3.exists()     // Catch:{ Exception -> 0x010e }
            if (r5 != 0) goto L_0x005e
            boolean r5 = r2.exists()     // Catch:{ Exception -> 0x010e }
            if (r5 != 0) goto L_0x005e
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch:{ Exception -> 0x010e }
            java.lang.String r2 = r1.f5382e     // Catch:{ Exception -> 0x010e }
            java.lang.String r3 = r1.f5383f     // Catch:{ Exception -> 0x010e }
            java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.getFileName(r3)     // Catch:{ Exception -> 0x010e }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x010e }
            goto L_0x00e2
        L_0x005e:
            boolean r5 = r3.exists()     // Catch:{ Exception -> 0x010e }
            if (r5 != 0) goto L_0x007d
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x010e }
            if (r2 == 0) goto L_0x007d
            com.ironsource.sdk.controller.f$b r0 = com.ironsource.sdk.controller.f.b.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER     // Catch:{ Exception -> 0x010e }
            r1.f5381d = r0     // Catch:{ Exception -> 0x010e }
            r1.a(r0)     // Catch:{ Exception -> 0x010e }
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch:{ Exception -> 0x010e }
            java.lang.String r2 = r1.f5382e     // Catch:{ Exception -> 0x010e }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x010e }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x010e }
            goto L_0x00d0
        L_0x007d:
            r1.e()     // Catch:{ Exception -> 0x010e }
            com.ironsource.sdk.h.c r2 = new com.ironsource.sdk.h.c     // Catch:{ Exception -> 0x010e }
            java.lang.String r5 = r1.f5382e     // Catch:{ Exception -> 0x010e }
            r2.<init>(r5, r0)     // Catch:{ Exception -> 0x010e }
            java.lang.String r0 = r2.getPath()     // Catch:{ Exception -> 0x010e }
            com.ironsource.sdk.h.c r2 = r1.c()     // Catch:{ Exception -> 0x010e }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x010e }
            boolean r0 = com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(r0, r2)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x00b8
            com.ironsource.sdk.controller.f$b r0 = com.ironsource.sdk.controller.f.b.PREPARED_CONTROLLER_LOADED     // Catch:{ Exception -> 0x010e }
            r1.f5381d = r0     // Catch:{ Exception -> 0x010e }
            r1.a(r0)     // Catch:{ Exception -> 0x010e }
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch:{ Exception -> 0x010e }
            java.lang.String r2 = r1.f5382e     // Catch:{ Exception -> 0x010e }
            java.lang.String r5 = "fallback_mobileController.html"
            r0.<init>(r2, r5)     // Catch:{ Exception -> 0x010e }
            com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFile(r0)     // Catch:{ Exception -> 0x010e }
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch:{ Exception -> 0x010e }
            java.lang.String r2 = r1.f5382e     // Catch:{ Exception -> 0x010e }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x010e }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x010e }
            goto L_0x00d0
        L_0x00b8:
            boolean r0 = r1.d()     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x00d5
            com.ironsource.sdk.controller.f$b r0 = com.ironsource.sdk.controller.f.b.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER     // Catch:{ Exception -> 0x010e }
            r1.f5381d = r0     // Catch:{ Exception -> 0x010e }
            r1.a(r0)     // Catch:{ Exception -> 0x010e }
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch:{ Exception -> 0x010e }
            java.lang.String r2 = r1.f5382e     // Catch:{ Exception -> 0x010e }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x010e }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x010e }
        L_0x00d0:
            r1.b(r0)     // Catch:{ Exception -> 0x010e }
            r0 = r4
            goto L_0x010f
        L_0x00d5:
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch:{ Exception -> 0x010e }
            java.lang.String r2 = r1.f5382e     // Catch:{ Exception -> 0x010e }
            java.lang.String r3 = r1.f5383f     // Catch:{ Exception -> 0x010e }
            java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.getFileName(r3)     // Catch:{ Exception -> 0x010e }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x010e }
        L_0x00e2:
            r1.b(r0)     // Catch:{ Exception -> 0x010e }
            goto L_0x010e
        L_0x00e6:
            r1.e()
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c
            java.lang.String r2 = r1.f5382e
            java.lang.String r3 = r1.f5383f
            java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.getFileName(r3)
            r0.<init>(r2, r3)
            goto L_0x010b
        L_0x00f7:
            com.ironsource.sdk.h.c r0 = r1.c()
            com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFile(r0)
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c
            java.lang.String r2 = r1.f5382e
            java.lang.String r3 = r1.f5383f
            java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.getFileName(r3)
            r0.<init>(r2, r3)
        L_0x010b:
            r1.b(r0)
        L_0x010e:
            r0 = 0
        L_0x010f:
            if (r0 == 0) goto L_0x0114
            r6.a((int) r4)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.A.g():void");
    }

    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        String str;
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        d.e eVar = d.e.f5649c;
        JSONObject jSONObject = new JSONObject(mergeHashMaps);
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.toString(jSONObject.optInt(IronSourceConstants.KEY_SESSION_DEPTH)));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        com.ironsource.sdk.g.c a10 = this.K.a(eVar, fetchDemandSourceId);
        if (a10 != null) {
            Map<String, String> map2 = a10.f5621d;
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        Map<String, String> map3 = eVar == d.e.OfferWall ? this.f5190j : null;
        if (map3 != null) {
            hashMap.putAll(map3);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        a.C0066a aVar = new a.C0066a();
        if (eVar == d.e.RewardedVideo) {
            aVar.f5597a = "showRewardedVideo";
            aVar.f5598b = "onShowRewardedVideoSuccess";
            str = "onShowRewardedVideoFail";
        } else {
            aVar.f5597a = "showInterstitial";
            aVar.f5598b = "onShowInterstitialSuccess";
            str = "onShowInterstitialFail";
        }
        aVar.f5599c = str;
        b(b(aVar.f5597a, flatMapToJsonAsString, aVar.f5598b, str));
    }

    public final void a(Context context) {
        q qVar = new q(context);
        com.ironsource.environment.thread.a aVar = this.f5184a;
        if (aVar != null) {
            aVar.b(qVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ironsource.sdk.g.b r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.I
            monitor-enter(r0)
            boolean r1 = r11.f5608d     // Catch:{ all -> 0x0151 }
            if (r1 == 0) goto L_0x014d
            boolean r1 = r10.f5191l     // Catch:{ all -> 0x0151 }
            if (r1 == 0) goto L_0x014d
            java.lang.String r1 = r10.f5185e     // Catch:{ all -> 0x0151 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
            java.lang.String r3 = "restoreState(state:"
            r2.<init>(r3)     // Catch:{ all -> 0x0151 }
            r2.append(r11)     // Catch:{ all -> 0x0151 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0151 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0151 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0151 }
            int r1 = r11.f5609e     // Catch:{ all -> 0x0151 }
            r2 = -1
            if (r1 == r2) goto L_0x0083
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.g.d.e.RewardedVideo     // Catch:{ all -> 0x0151 }
            int r4 = r3.ordinal()     // Catch:{ all -> 0x0151 }
            if (r1 != r4) goto L_0x0049
            java.lang.String r1 = r10.f5185e     // Catch:{ all -> 0x0151 }
            java.lang.String r4 = "onRVAdClosed()"
            android.util.Log.d(r1, r4)     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = r11.f5607c     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.j.a.a r4 = r10.j(r3)     // Catch:{ all -> 0x0151 }
            if (r4 == 0) goto L_0x007d
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0151 }
            if (r5 != 0) goto L_0x007d
        L_0x0045:
            r4.a(r3, r1)     // Catch:{ all -> 0x0151 }
            goto L_0x007d
        L_0x0049:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.g.d.e.f5649c     // Catch:{ all -> 0x0151 }
            int r4 = r3.ordinal()     // Catch:{ all -> 0x0151 }
            if (r1 != r4) goto L_0x0067
            java.lang.String r1 = r10.f5185e     // Catch:{ all -> 0x0151 }
            java.lang.String r4 = "onInterstitialAdClosed()"
            android.util.Log.d(r1, r4)     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = r11.f5607c     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.j.a.a r4 = r10.j(r3)     // Catch:{ all -> 0x0151 }
            if (r4 == 0) goto L_0x007d
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0151 }
            if (r5 != 0) goto L_0x007d
            goto L_0x0045
        L_0x0067:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.g.d.e.OfferWall     // Catch:{ all -> 0x0151 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0151 }
            if (r1 != r3) goto L_0x007d
            java.lang.String r1 = r10.f5185e     // Catch:{ all -> 0x0151 }
            java.lang.String r3 = "onOWAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.j.e r1 = r10.B     // Catch:{ all -> 0x0151 }
            if (r1 == 0) goto L_0x007d
            r1.onOWAdClosed()     // Catch:{ all -> 0x0151 }
        L_0x007d:
            r11.f5609e = r2     // Catch:{ all -> 0x0151 }
            r1 = 0
            r11.f5607c = r1     // Catch:{ all -> 0x0151 }
            goto L_0x008a
        L_0x0083:
            java.lang.String r1 = r10.f5185e     // Catch:{ all -> 0x0151 }
            java.lang.String r2 = "No ad was opened"
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0151 }
        L_0x008a:
            java.lang.String r1 = r11.f5611g     // Catch:{ all -> 0x0151 }
            java.lang.String r2 = r11.f5612h     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.controller.k r3 = r10.K     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.g.d.e.f5649c     // Catch:{ all -> 0x0151 }
            java.util.Collection r3 = r3.b(r4)     // Catch:{ all -> 0x0151 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0151 }
        L_0x009a:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0151 }
            r5 = 2
            if (r4 == 0) goto L_0x00db
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.g.c) r4     // Catch:{ all -> 0x0151 }
            int r6 = r4.f5622e     // Catch:{ all -> 0x0151 }
            if (r6 != r5) goto L_0x009a
            java.lang.String r5 = r10.f5185e     // Catch:{ all -> 0x0151 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
            java.lang.String r7 = "initInterstitial(appKey:"
            r6.<init>(r7)     // Catch:{ all -> 0x0151 }
            r6.append(r1)     // Catch:{ all -> 0x0151 }
            java.lang.String r7 = ", userId:"
            r6.append(r7)     // Catch:{ all -> 0x0151 }
            r6.append(r2)     // Catch:{ all -> 0x0151 }
            java.lang.String r7 = ", demandSource:"
            r6.append(r7)     // Catch:{ all -> 0x0151 }
            java.lang.String r7 = r4.f5618a     // Catch:{ all -> 0x0151 }
            r6.append(r7)     // Catch:{ all -> 0x0151 }
            java.lang.String r7 = ")"
            r6.append(r7)     // Catch:{ all -> 0x0151 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0151 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.j.a.c r5 = r10.A     // Catch:{ all -> 0x0151 }
            r10.a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.g.c) r4, (com.ironsource.sdk.j.a.c) r5)     // Catch:{ all -> 0x0151 }
            goto L_0x009a
        L_0x00db:
            java.lang.String r1 = r11.f5605a     // Catch:{ all -> 0x0151 }
            java.lang.String r2 = r11.f5606b     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.controller.k r3 = r10.K     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.g.d.e.RewardedVideo     // Catch:{ all -> 0x0151 }
            java.util.Collection r3 = r3.b(r4)     // Catch:{ all -> 0x0151 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0151 }
        L_0x00eb:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0151 }
            if (r4 == 0) goto L_0x014a
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.g.c) r4     // Catch:{ all -> 0x0151 }
            int r6 = r4.f5622e     // Catch:{ all -> 0x0151 }
            if (r6 != r5) goto L_0x00eb
            java.lang.String r6 = r4.f5618a     // Catch:{ all -> 0x0151 }
            java.lang.String r7 = r10.f5185e     // Catch:{ all -> 0x0151 }
            java.lang.String r8 = "onRVNoMoreOffers()"
            android.util.Log.d(r7, r8)     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.j.a.d r7 = r10.f5204z     // Catch:{ all -> 0x0151 }
            r7.a(r6)     // Catch:{ all -> 0x0151 }
            java.lang.String r7 = r10.f5185e     // Catch:{ all -> 0x0151 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
            java.lang.String r9 = "initRewardedVideo(appKey:"
            r8.<init>(r9)     // Catch:{ all -> 0x0151 }
            r8.append(r1)     // Catch:{ all -> 0x0151 }
            java.lang.String r9 = ", userId:"
            r8.append(r9)     // Catch:{ all -> 0x0151 }
            r8.append(r2)     // Catch:{ all -> 0x0151 }
            java.lang.String r9 = ", demandSource:"
            r8.append(r9)     // Catch:{ all -> 0x0151 }
            r8.append(r6)     // Catch:{ all -> 0x0151 }
            java.lang.String r6 = ")"
            r8.append(r6)     // Catch:{ all -> 0x0151 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0151 }
            android.util.Log.d(r7, r6)     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.j.a.d r6 = r10.f5204z     // Catch:{ all -> 0x0151 }
            r10.f5188h = r1     // Catch:{ all -> 0x0151 }
            r10.f5189i = r2     // Catch:{ all -> 0x0151 }
            r10.f5204z = r6     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.g.b r6 = r10.H     // Catch:{ all -> 0x0151 }
            r6.f5605a = r1     // Catch:{ all -> 0x0151 }
            r6.f5606b = r2     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.g.d$e r6 = com.ironsource.sdk.g.d.e.RewardedVideo     // Catch:{ all -> 0x0151 }
            com.ironsource.sdk.controller.d r7 = new com.ironsource.sdk.controller.d     // Catch:{ all -> 0x0151 }
            r7.<init>(r10)     // Catch:{ all -> 0x0151 }
            r10.g(r1, r6, r4, r7)     // Catch:{ all -> 0x0151 }
            goto L_0x00eb
        L_0x014a:
            r1 = 0
            r11.f5608d = r1     // Catch:{ all -> 0x0151 }
        L_0x014d:
            r10.H = r11     // Catch:{ all -> 0x0151 }
            monitor-exit(r0)     // Catch:{ all -> 0x0151 }
            return
        L_0x0151:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0151 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.A.a(com.ironsource.sdk.g.b):void");
    }

    public final void a(com.ironsource.sdk.h.c cVar) {
        if (cVar.getName().contains("mobileController.html")) {
            f fVar = this.F;
            m mVar = new m();
            if (!(fVar.f5381d != f.b.NONE)) {
                if (fVar.f5380c == f.a.f5386b) {
                    IronSourceStorageUtils.deleteFile(new com.ironsource.sdk.h.c(fVar.f5382e, "fallback_mobileController.html"));
                }
                f.b bVar = f.b.CONTROLLER_FROM_SERVER;
                fVar.f5381d = bVar;
                fVar.a(bVar);
                mVar.run();
                return;
            }
            return;
        }
        String name = cVar.getName();
        String parent = cVar.getParent();
        try {
            b(b("assetCached", a("file", name, "path", o(parent), (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        } catch (Exception e10) {
            h(name, parent, e10.getMessage());
        }
    }

    public final void a(com.ironsource.sdk.h.c cVar, com.ironsource.sdk.g.e eVar) {
        if (cVar.getName().contains("mobileController.html")) {
            f fVar = this.F;
            n nVar = new n();
            o oVar = new o(eVar);
            if (fVar.f5381d != f.b.NONE) {
                return;
            }
            if (fVar.f5380c != f.a.f5386b || !fVar.d()) {
                com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(fVar.f5379b));
                if (fVar.f5378a > 0) {
                    a10.a("timingvalue", Long.valueOf(System.currentTimeMillis() - fVar.f5378a));
                }
                com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.w, (Map<String, Object>) a10.f5086a);
                oVar.run();
                return;
            }
            f.b bVar = f.b.FALLBACK_CONTROLLER_RECOVERY;
            fVar.f5381d = bVar;
            fVar.a(bVar);
            nVar.run();
            return;
        }
        h(cVar.getName(), cVar.getParent(), eVar.f5654a);
    }
}
