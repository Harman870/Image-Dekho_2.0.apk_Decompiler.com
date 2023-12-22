package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C0182e;
import com.ironsource.mediationsdk.d.b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public AbstractAdapter f4433a;

    /* renamed from: b  reason: collision with root package name */
    public com.ironsource.mediationsdk.model.a f4434b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f4435c;

    /* renamed from: d  reason: collision with root package name */
    public a f4436d;

    /* renamed from: e  reason: collision with root package name */
    public Timer f4437e;

    /* renamed from: f  reason: collision with root package name */
    public long f4438f;

    /* renamed from: g  reason: collision with root package name */
    public String f4439g;

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f4440h;

    /* renamed from: i  reason: collision with root package name */
    public List<String> f4441i;

    /* renamed from: j  reason: collision with root package name */
    public String f4442j;
    public final Object k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public final Object f4443l = new Object();

    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public j(com.ironsource.mediationsdk.model.a aVar, AbstractAdapter abstractAdapter) {
        this.f4434b = aVar;
        this.f4433a = abstractAdapter;
        this.f4435c = aVar.f4704b;
        this.f4436d = a.NOT_LOADED;
        this.f4437e = null;
        this.f4439g = "";
        this.f4440h = null;
        this.f4441i = new ArrayList();
    }

    public static void c(List<String> list, String str, int i10, String str2, String str3) {
        for (String a10 : (List) b.a(list, new ArrayList())) {
            C0182e.a();
            String a11 = C0182e.a(a10, str, i10, str2, "", "", "", "");
            C0182e.a();
            C0182e.a(str3, str, a11);
        }
    }

    public final a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.k) {
            aVar2 = this.f4436d;
            if (Arrays.asList(aVarArr).contains(this.f4436d)) {
                b(aVar);
            }
        }
        return aVar2;
    }

    public final void a(String str) {
        C0182e.a();
        this.f4442j = C0182e.d(str);
    }

    public final void a(JSONObject jSONObject) {
        this.f4440h = jSONObject;
    }

    public final void a(boolean z9) {
        try {
            this.f4435c.put("isOneFlow", z9);
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("Can't set isOneFlow = " + z9 + ". Error: " + e10.getMessage());
        }
    }

    public Map<String, Object> b() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f4433a;
            String str = "";
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : str);
            AbstractAdapter abstractAdapter2 = this.f4433a;
            if (abstractAdapter2 != null) {
                str = abstractAdapter2.getCoreSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str);
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f4434b.f4703a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f4434b.f4703a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (this.f4434b.f4706d) {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                hashMap.put("instanceType", 2);
                if (!TextUtils.isEmpty(this.f4439g)) {
                    hashMap.put("auctionId", this.f4439g);
                }
                JSONObject jSONObject = this.f4440h;
                if (jSONObject != null && jSONObject.length() > 0) {
                    hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f4440h);
                }
            } else {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 0);
                hashMap.put("instanceType", 1);
            }
            if (!TextUtils.isEmpty(this.f4442j)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f4442j);
            }
        } catch (Exception e10) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + e() + ")", e10);
        }
        return hashMap;
    }

    public final void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f4434b.f4703a.getProviderName() + ": current state=" + this.f4436d + ", new state=" + aVar);
        synchronized (this.k) {
            this.f4436d = aVar;
        }
    }

    public final void b(String str) {
        this.f4439g = str;
    }

    public final void d(TimerTask timerTask) {
        synchronized (this.f4443l) {
            j();
            Timer timer = new Timer();
            this.f4437e = timer;
            timer.schedule(timerTask, this.f4438f);
        }
    }

    public final String e() {
        return this.f4434b.f4703a.getProviderName();
    }

    public final boolean e(a aVar, a aVar2) {
        synchronized (this.k) {
            if (this.f4436d != aVar) {
                return false;
            }
            b(aVar2);
            return true;
        }
    }

    public final int f() {
        return this.f4434b.f4708f;
    }

    public final boolean f(a aVar) {
        boolean z9;
        synchronized (this.k) {
            z9 = this.f4436d == aVar;
        }
        return z9;
    }

    public final String g() {
        return this.f4434b.f4703a.getSubProviderId();
    }

    public final boolean h() {
        return this.f4435c.optBoolean("isOneFlow", false);
    }

    public final String i() {
        a aVar = this.f4436d;
        return aVar == null ? "null" : aVar.toString();
    }

    public final void j() {
        synchronized (this.f4443l) {
            Timer timer = this.f4437e;
            if (timer != null) {
                timer.cancel();
                this.f4437e = null;
            }
        }
    }

    public final boolean k() {
        return this.f4434b.f4706d;
    }
}
