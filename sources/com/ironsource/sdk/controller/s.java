package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.h;
import com.ironsource.sdk.controller.n;
import com.ironsource.sdk.g.d;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class s implements n {

    /* renamed from: a  reason: collision with root package name */
    public final com.ironsource.environment.thread.a f5499a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5500b;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.e f5501a;

        public a(com.ironsource.sdk.j.e eVar) {
            this.f5501a = eVar;
        }

        public final void run() {
            this.f5501a.onOfferwallInitFail(s.this.f5500b);
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.a.c f5503a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.c f5504b;

        public b(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.f5503a = cVar;
            this.f5504b = cVar2;
        }

        public final void run() {
            this.f5503a.c(this.f5504b.f5619b, s.this.f5500b);
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.a.b f5506a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Map f5507b;

        public c(com.ironsource.sdk.j.a.b bVar, Map map) {
            this.f5506a = bVar;
            this.f5507b = map;
        }

        public final void run() {
            this.f5506a.d((String) this.f5507b.get("demandSourceName"), s.this.f5500b);
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ n.a f5509a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ h.b f5510b;

        public d(n.a aVar, h.b bVar) {
            this.f5509a = aVar;
            this.f5510b = bVar;
        }

        public final void run() {
            try {
                if (this.f5509a != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("success", false);
                    jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, s.this.f5500b);
                    this.f5509a.onReceive(new h.a(this.f5510b.b(), jSONObject));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.e f5512a;

        public e(com.ironsource.sdk.j.e eVar) {
            this.f5512a = eVar;
        }

        public final void run() {
            this.f5512a.onOWShowFail(s.this.f5500b);
            this.f5512a.onOfferwallInitFail(s.this.f5500b);
        }
    }

    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.e f5514a;

        public f(com.ironsource.sdk.j.e eVar) {
            this.f5514a = eVar;
        }

        public final void run() {
            this.f5514a.onGetOWCreditsFailed(s.this.f5500b);
        }
    }

    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.a.c f5516a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.c f5517b;

        public g(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.f5516a = cVar;
            this.f5517b = cVar2;
        }

        public final void run() {
            this.f5516a.a(d.e.f5649c, this.f5517b.f5619b, s.this.f5500b);
        }
    }

    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.j.a.c f5519a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ com.ironsource.sdk.g.c f5520b;

        public h(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.f5519a = cVar;
            this.f5520b = cVar2;
        }

        public final void run() {
            this.f5519a.b(this.f5520b.f5619b, s.this.f5500b);
        }
    }

    public s(String str, com.ironsource.environment.thread.a aVar) {
        this.f5499a = aVar;
        this.f5500b = str;
    }

    public final void a(Activity activity) {
    }

    public final void a(Context context) {
    }

    public final void a(h.b bVar, n.a aVar) {
        b((Runnable) new d(aVar, bVar));
    }

    public final void a(com.ironsource.sdk.g.c cVar) {
    }

    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        if (bVar != null) {
            b((Runnable) new c(bVar, map));
        }
    }

    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b((Runnable) new h(cVar2, cVar));
        }
    }

    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        if (bVar != null) {
            bVar.a(d.e.f5647a, cVar.f5619b, this.f5500b);
        }
    }

    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b((Runnable) new g(cVar2, cVar));
        }
    }

    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b((Runnable) new f(eVar));
        }
    }

    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b((Runnable) new a(eVar));
        }
    }

    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b((Runnable) new e(eVar));
        }
    }

    public final void a(JSONObject jSONObject) {
    }

    public final void b(Context context) {
    }

    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b((Runnable) new b(cVar2, cVar));
        }
    }

    public final void b(Runnable runnable) {
        com.ironsource.environment.thread.a aVar = this.f5499a;
        if (aVar != null) {
            aVar.c(runnable);
        }
    }

    public final void b(JSONObject jSONObject) {
    }

    public final d.c c() {
        return d.c.Native;
    }

    public final void d() {
    }

    public final void destroy() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }
}
