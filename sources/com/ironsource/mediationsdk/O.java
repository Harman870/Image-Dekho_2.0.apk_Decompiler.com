package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class O implements m.a {

    /* renamed from: a  reason: collision with root package name */
    public AbstractAdapter f3985a;

    /* renamed from: b  reason: collision with root package name */
    public a f3986b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3987c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f3988d;

    /* renamed from: e  reason: collision with root package name */
    public String f3989e;

    /* renamed from: f  reason: collision with root package name */
    public int f3990f;

    /* renamed from: g  reason: collision with root package name */
    public Long f3991g = null;

    public O(a aVar, AbstractAdapter abstractAdapter) {
        this.f3986b = aVar;
        this.f3985a = abstractAdapter;
        this.f3988d = aVar.f4704b;
    }

    public final void a(String str) {
        C0182e.a();
        this.f3989e = C0182e.d(str);
    }

    public final void b(String str, int i10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, e() + " " + n() + " : " + str, i10);
    }

    public int c() {
        return 1;
    }

    public abstract IronSource.AD_UNIT d();

    public abstract String e();

    public void f() {
        try {
            AbstractAdapter abstractAdapter = this.f3985a;
            if (abstractAdapter != null) {
                abstractAdapter.releaseMemory(this.f3986b.f4705c, this.f3988d);
            }
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception - " + th.getMessage());
        }
        this.f3985a = null;
    }

    public final boolean h() {
        return this.f3986b.f4706d;
    }

    public final boolean i() {
        return this.f3986b.f4707e;
    }

    public final boolean j() {
        if (k()) {
            return false;
        }
        return h() || i();
    }

    public final boolean k() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f3985a.isUsingActivityBeforeImpression(d())) {
                return false;
            }
            ironLog.verbose(this.f3986b.f4703a.getProviderName() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th) {
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th.getLocalizedMessage(), 3);
            return true;
        }
    }

    public final int l() {
        return this.f3986b.f4708f;
    }

    public final int m() {
        return this.f3986b.f4709g;
    }

    public final String n() {
        return this.f3986b.f4703a.getProviderName();
    }

    public final String o() {
        return this.f3986b.f4703a.getProviderTypeForReflection();
    }

    public final int p() {
        return this.f3990f;
    }

    public final Map<String, Object> q() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f3985a;
            String str = "";
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : str);
            AbstractAdapter abstractAdapter2 = this.f3985a;
            if (abstractAdapter2 != null) {
                str = abstractAdapter2.getCoreSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str);
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f3986b.f4703a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f3986b.f4703a.getAdSourceNameForEvents());
            hashMap.put("instanceType", Integer.valueOf(h() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(c()));
            if (!TextUtils.isEmpty(this.f3989e)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f3989e);
            }
        } catch (Throwable th) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + n() + ")", th);
        }
        return hashMap;
    }

    public final Long r() {
        return this.f3991g;
    }

    public final String s() {
        String str;
        Object[] objArr = new Object[2];
        if (this.f3986b.f4703a.isMultipleInstances()) {
            str = this.f3986b.f4703a.getProviderTypeForReflection();
        } else {
            str = this.f3986b.f4703a.getProviderName();
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(hashCode());
        return String.format("%s %s", objArr);
    }
}
