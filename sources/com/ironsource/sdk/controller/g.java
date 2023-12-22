package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.A;
import com.ironsource.sdk.controller.B;
import com.ironsource.sdk.controller.h;
import com.ironsource.sdk.controller.n;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class g implements z7.b, n {

    /* renamed from: a  reason: collision with root package name */
    public n f5398a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, n.b> f5399b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5400c = "g";

    /* renamed from: d  reason: collision with root package name */
    public d.b f5401d = d.b.None;

    /* renamed from: e  reason: collision with root package name */
    public CountDownTimer f5402e;

    /* renamed from: f  reason: collision with root package name */
    public final C0200b f5403f = new C0200b("NativeCommandExecutor");

    /* renamed from: g  reason: collision with root package name */
    public final C0200b f5404g = new C0200b("ControllerCommandsExecutor");

    /* renamed from: h  reason: collision with root package name */
    public final com.ironsource.environment.thread.a f5405h;

    /* renamed from: i  reason: collision with root package name */
    public final B f5406i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f5407j;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ n.a f5408a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ h.b f5409b;

        public a(n.a aVar, h.b bVar) {
            this.f5408a = aVar;
            this.f5409b = bVar;
        }

        public final void run() {
            g gVar = g.this;
            if (gVar.f5398a != null) {
                if (this.f5408a != null) {
                    gVar.f5407j.put(this.f5409b.b(), this.f5408a);
                }
                g.this.f5398a.a(this.f5409b, this.f5408a);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ JSONObject f5411a;

        public b(JSONObject jSONObject) {
            this.f5411a = jSONObject;
        }

        public final void run() {
            n nVar = g.this.f5398a;
            if (nVar != null) {
                nVar.a(this.f5411a);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            n nVar = g.this.f5398a;
            if (nVar != null) {
                nVar.destroy();
                g.this.f5398a = null;
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Context f5414a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ C0201c f5415b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.service.d f5416c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ k f5417d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ int f5418e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.l.d f5419f;

        /* renamed from: g  reason: collision with root package name */
        public /* synthetic */ String f5420g;

        /* renamed from: h  reason: collision with root package name */
        public /* synthetic */ String f5421h;

        /* renamed from: i  reason: collision with root package name */
        public /* synthetic */ String f5422i;

        public d(Context context, C0201c cVar, com.ironsource.sdk.service.d dVar, k kVar, int i10, com.ironsource.sdk.l.d dVar2, String str, String str2, String str3) {
            this.f5414a = context;
            this.f5415b = cVar;
            this.f5416c = dVar;
            this.f5417d = kVar;
            this.f5418e = i10;
            this.f5419f = dVar2;
            this.f5420g = str;
            this.f5421h = str2;
            this.f5422i = str3;
        }

        public final void run() {
            try {
                g gVar = g.this;
                gVar.f5398a = g.a(gVar, this.f5414a, this.f5415b, this.f5416c, this.f5417d, this.f5418e, this.f5419f, this.f5420g, this.f5421h, this.f5422i);
                g.this.f5398a.g();
            } catch (Throwable th) {
                g.this.d(Log.getStackTraceString(th));
            }
        }
    }

    public class e extends CountDownTimer {
        public e() {
            super(200000, 1000);
        }

        public final void onFinish() {
            Logger.i(g.this.f5400c, "Global Controller Timer Finish");
            g.this.d("controller html - download timeout");
        }

        public final void onTick(long j10) {
            String str = g.this.f5400c;
            Logger.i(str, "Global Controller Timer Tick " + j10);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        public final void run() {
            g.this.b();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$g  reason: collision with other inner class name */
    public class C0062g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f5426a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5427b;

        public C0062g(String str, String str2) {
            this.f5426a = str;
            this.f5427b = str2;
        }

        public final void run() {
            try {
                g gVar = g.this;
                B b10 = gVar.f5406i;
                gVar.f5398a = g.a(gVar, b10.f5324b, b10.f5326d, b10.f5325c, b10.f5327e, b10.f5328f, b10.f5329g, b10.f5323a, this.f5426a, this.f5427b);
                g.this.f5398a.g();
            } catch (Throwable th) {
                g.this.d(Log.getStackTraceString(th));
            }
        }
    }

    public class h extends CountDownTimer {
        public h() {
            super(200000, 1000);
        }

        public final void onFinish() {
            Logger.i(g.this.f5400c, "Recovered Controller | Global Controller Timer Finish");
            g.this.d("controller html - download timeout");
        }

        public final void onTick(long j10) {
            String str = g.this.f5400c;
            Logger.i(str, "Recovered Controller | Global Controller Timer Tick " + j10);
        }
    }

    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f5430a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5431b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Map f5432c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.e f5433d;

        public i(String str, String str2, Map map, com.ironsource.sdk.j.e eVar) {
            this.f5430a = str;
            this.f5431b = str2;
            this.f5432c = map;
            this.f5433d = eVar;
        }

        public final void run() {
            n nVar = g.this.f5398a;
            if (nVar != null) {
                nVar.a(this.f5430a, this.f5431b, (Map<String, String>) this.f5432c, this.f5433d);
            }
        }
    }

    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Map f5435a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.e f5436b;

        public j(Map map, com.ironsource.sdk.j.e eVar) {
            this.f5435a = map;
            this.f5436b = eVar;
        }

        public final void run() {
            n nVar = g.this.f5398a;
            if (nVar != null) {
                nVar.a((Map<String, String>) this.f5435a, this.f5436b);
            }
        }
    }

    public class k implements n.a {
        public k() {
        }

        public final void onReceive(h.a aVar) {
            n.a aVar2 = (n.a) g.this.f5407j.remove(aVar.a());
            if (aVar2 != null) {
                aVar2.onReceive(aVar);
            }
        }
    }

    public class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f5439a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5440b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.e f5441c;

        public l(String str, String str2, com.ironsource.sdk.j.e eVar) {
            this.f5439a = str;
            this.f5440b = str2;
            this.f5441c = eVar;
        }

        public final void run() {
            n nVar = g.this.f5398a;
            if (nVar != null) {
                nVar.a(this.f5439a, this.f5440b, this.f5441c);
            }
        }
    }

    public class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f5443a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5444b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.c f5445c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.a.c f5446d;

        public m(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
            this.f5443a = str;
            this.f5444b = str2;
            this.f5445c = cVar;
            this.f5446d = cVar2;
        }

        public final void run() {
            n nVar = g.this.f5398a;
            if (nVar != null) {
                nVar.a(this.f5443a, this.f5444b, this.f5445c, this.f5446d);
            }
        }
    }

    public class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.c f5448a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Map f5449b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.a.c f5450c;

        public n(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.c cVar2) {
            this.f5448a = cVar;
            this.f5449b = map;
            this.f5450c = cVar2;
        }

        public final void run() {
            com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("demandsourcename", this.f5448a.f5618a).a("producttype", com.ironsource.sdk.a.g.a(this.f5448a, d.e.f5649c)).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.g.a(this.f5448a)));
            com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f5745a;
            com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5112j, (Map<String, Object>) a10.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(this.f5448a.f5619b))).f5086a);
            n nVar = g.this.f5398a;
            if (nVar != null) {
                nVar.a(this.f5448a, (Map<String, String>) this.f5449b, this.f5450c);
            }
        }
    }

    public class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.c f5452a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Map f5453b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.a.c f5454c;

        public o(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.c cVar2) {
            this.f5452a = cVar;
            this.f5453b = map;
            this.f5454c = cVar2;
        }

        public final void run() {
            n nVar = g.this.f5398a;
            if (nVar != null) {
                nVar.b(this.f5452a, this.f5453b, this.f5454c);
            }
        }
    }

    public class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f5456a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ String f5457b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.c f5458c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.a.b f5459d;

        public p(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
            this.f5456a = str;
            this.f5457b = str2;
            this.f5458c = cVar;
            this.f5459d = bVar;
        }

        public final void run() {
            n nVar = g.this.f5398a;
            if (nVar != null) {
                nVar.a(this.f5456a, this.f5457b, this.f5458c, this.f5459d);
            }
        }
    }

    public class q implements n.b {
        public q() {
        }

        public final void onReceive(r rVar) {
            n.b bVar = g.this.f5399b.get(rVar.a());
            if (bVar != null) {
                bVar.onReceive(rVar);
            }
        }
    }

    public class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.c f5462a;

        public r(com.ironsource.sdk.g.c cVar) {
            this.f5462a = cVar;
        }

        public final void run() {
            n nVar = g.this.f5398a;
            if (nVar != null) {
                nVar.a(this.f5462a);
            }
        }
    }

    public class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.c f5464a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Map f5465b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.a.b f5466c;

        public s(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.b bVar) {
            this.f5464a = cVar;
            this.f5465b = map;
            this.f5466c = bVar;
        }

        public final void run() {
            n nVar = g.this.f5398a;
            if (nVar != null) {
                nVar.a(this.f5464a, (Map<String, String>) this.f5465b, this.f5466c);
            }
        }
    }

    public g(Context context, C0201c cVar, com.ironsource.sdk.service.d dVar, k kVar, com.ironsource.environment.thread.a aVar, int i10, JSONObject jSONObject, String str, String str2) {
        com.ironsource.environment.thread.a aVar2 = aVar;
        this.f5405h = aVar2;
        this.f5407j = new HashMap();
        this.f5399b = new HashMap();
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        Context context2 = context;
        C0201c cVar2 = cVar;
        com.ironsource.sdk.service.d dVar2 = dVar;
        k kVar2 = kVar;
        int i11 = i10;
        com.ironsource.sdk.l.d a10 = com.ironsource.sdk.l.d.a(networkStorageDir, aVar2, jSONObject);
        String str3 = networkStorageDir;
        this.f5406i = new B(context2, cVar2, dVar2, kVar2, i11, a10, str3);
        d dVar3 = new d(context2, cVar2, dVar2, kVar2, i11, a10, str3, str, str2);
        if (aVar2 != null) {
            aVar2.a(dVar3);
        } else {
            Logger.e("g", "mThreadManager = null");
        }
        this.f5402e = new e().start();
    }

    public static /* synthetic */ A a(g gVar, Context context, C0201c cVar, com.ironsource.sdk.service.d dVar, k kVar, int i10, com.ironsource.sdk.l.d dVar2, String str, String str2, String str3) {
        g gVar2 = gVar;
        Context context2 = context;
        com.ironsource.sdk.l.d dVar3 = dVar2;
        com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5105c);
        A a10 = new A(context, kVar, cVar, gVar2, gVar2.f5405h, i10, dVar2, str, new k(), new q(), str2, str3);
        com.ironsource.sdk.h.b bVar = new com.ironsource.sdk.h.b(context2, dVar3, new com.ironsource.sdk.h.a(com.ironsource.environment.thread.a.a()), new com.ironsource.sdk.h.d(dVar3.f5732b));
        a10.N = new y(context2, dVar);
        a10.L = new t(context2);
        a10.M = new u(context2);
        a10.O = new l(context2);
        C0199a aVar = new C0199a(context2);
        a10.P = aVar;
        if (a10.R == null) {
            a10.R = new A.a();
        }
        aVar.f5368a = a10.R;
        a10.Q = new m(dVar3.f5732b, bVar);
        return a10;
    }

    public final void a() {
        Logger.i(this.f5400c, "handleControllerLoaded");
        this.f5401d = d.b.Loaded;
        this.f5403f.a();
        this.f5403f.c();
    }

    public final void a(Activity activity) {
        this.f5398a.a(activity);
    }

    public final void a(Context context) {
        n nVar;
        if (d.b.Ready.equals(this.f5401d) && (nVar = this.f5398a) != null) {
            nVar.a(context);
        }
    }

    public final void a(h.b bVar, n.a aVar) {
        this.f5404g.a(new a(aVar, bVar));
    }

    public final void a(com.ironsource.sdk.g.c cVar) {
        this.f5404g.a(new r(cVar));
    }

    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        this.f5404g.a(new s(cVar, map, bVar));
    }

    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        this.f5404g.a(new n(cVar, map, cVar2));
    }

    public final void a(Runnable runnable) {
        this.f5403f.a(runnable);
    }

    public final void a(String str) {
        Logger.i(this.f5400c, "handleControllerFailed ");
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        aVar.a("callfailreason", str);
        aVar.a("generalmessage", String.valueOf(this.f5406i.a()));
        com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5116o, (Map<String, Object>) aVar.f5086a);
        this.f5406i.a(false);
        com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new com.ironsource.sdk.g.e(1001, str));
            IronSourceNetwork.setInitListener((com.ironsource.sdk.j.d) null);
        }
        if (this.f5402e != null) {
            Logger.i(this.f5400c, "cancel timer mControllerReadyTimer");
            this.f5402e.cancel();
        }
        d(str);
    }

    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        if (this.f5406i.a(c(), this.f5401d)) {
            b(d.e.f5647a, cVar, str, str2);
        }
        this.f5404g.a(new p(str, str2, cVar, bVar));
    }

    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        if (this.f5406i.a(c(), this.f5401d)) {
            b(d.e.f5649c, cVar, str, str2);
        }
        this.f5404g.a(new m(str, str2, cVar, cVar2));
    }

    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.f5404g.a(new l(str, str2, eVar));
    }

    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f5404g.a(new i(str, str2, map, eVar));
    }

    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f5404g.a(new j(map, eVar));
    }

    public final void a(JSONObject jSONObject) {
        this.f5404g.a(new b(jSONObject));
    }

    public final void b() {
        Logger.i(this.f5400c, "handleControllerReady ");
        if (d.c.Web.equals(c())) {
            com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5107e, (Map<String, Object>) new com.ironsource.sdk.a.a().a("generalmessage", String.valueOf(this.f5406i.a())).f5086a);
            com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
            if (initListener != null) {
                initListener.onSuccess();
                IronSourceNetwork.setInitListener((com.ironsource.sdk.j.d) null);
            }
        }
        Logger.i(this.f5400c, "handleReadyState");
        this.f5401d = d.b.Ready;
        CountDownTimer countDownTimer = this.f5402e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f5406i.a(true);
        n nVar = this.f5398a;
        if (nVar != null) {
            nVar.b(this.f5406i.b());
        }
        this.f5404g.a();
        this.f5404g.c();
        n nVar2 = this.f5398a;
        if (nVar2 != null) {
            nVar2.f();
        }
    }

    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        this.f5404g.a(new o(cVar, map, cVar2));
    }

    public final void b(d.e eVar, com.ironsource.sdk.g.c cVar, String str, String str2) {
        Logger.i(this.f5400c, "recoverWebController for product: " + eVar.toString());
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        aVar.a("producttype", eVar.toString());
        aVar.a("demandsourcename", cVar.f5618a);
        com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5104b, (Map<String, Object>) aVar.f5086a);
        B b10 = this.f5406i;
        int i10 = b10.k;
        int i11 = B.a.f5335c;
        if (i10 != i11) {
            b10.f5330h++;
            Logger.i(b10.f5332j, "recoveringStarted - trial number " + b10.f5330h);
            b10.k = i11;
        }
        destroy();
        C0062g gVar = new C0062g(str, str2);
        com.ironsource.environment.thread.a aVar2 = this.f5405h;
        if (aVar2 != null) {
            aVar2.a(gVar);
        } else {
            Logger.e(this.f5400c, "mThreadManager = null");
        }
        this.f5402e = new h().start();
    }

    public final void b(String str) {
        com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5123x, (Map<String, Object>) new com.ironsource.sdk.a.a().a("generalmessage", str).f5086a);
        CountDownTimer countDownTimer = this.f5402e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    public final void b(JSONObject jSONObject) {
    }

    public final d.c c() {
        n nVar = this.f5398a;
        return nVar != null ? nVar.c() : d.c.None;
    }

    public final void d() {
        n nVar;
        if (d.b.Ready.equals(this.f5401d) && (nVar = this.f5398a) != null) {
            nVar.d();
        }
    }

    public final void d(String str) {
        com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5106d, (Map<String, Object>) new com.ironsource.sdk.a.a().a("callfailreason", str).f5086a);
        this.f5401d = d.b.Loading;
        this.f5398a = new s(str, this.f5405h);
        this.f5403f.a();
        this.f5403f.c();
        com.ironsource.environment.thread.a aVar = this.f5405h;
        if (aVar != null) {
            aVar.c(new f());
        }
    }

    public void destroy() {
        Logger.i(this.f5400c, "destroy controller");
        CountDownTimer countDownTimer = this.f5402e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f5404g.b();
        this.f5402e = null;
        c cVar = new c();
        com.ironsource.environment.thread.a aVar = this.f5405h;
        if (aVar != null) {
            aVar.a(cVar);
        } else {
            Logger.e(this.f5400c, "mThreadManager = null");
        }
    }

    public final void e() {
        n nVar;
        if (d.b.Ready.equals(this.f5401d) && (nVar = this.f5398a) != null) {
            nVar.e();
        }
    }

    @Deprecated
    public final void f() {
    }

    public final void g() {
    }

    public final void b(Context context) {
        n nVar;
        if (d.b.Ready.equals(this.f5401d) && (nVar = this.f5398a) != null) {
            nVar.b(context);
        }
    }
}
