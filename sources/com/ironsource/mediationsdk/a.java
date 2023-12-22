package com.ironsource.mediationsdk;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.w0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.d.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public abstract class a<Listener extends AdapterAdListener> extends BaseAdAdapter<G, Listener> implements AdapterAdFullScreenInterface<Listener>, AdapterBannerInterface<Listener>, AdapterNativeAdInterface<Listener> {

    /* renamed from: c  reason: collision with root package name */
    public AbstractAdapter f4064c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<Listener> f4065d = new WeakReference<>((Object) null);

    public a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        super(ad_unit, networkSettings);
        this.f4064c = abstractAdapter;
    }

    public static a<?> a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return new Q(abstractAdapter, networkSettings);
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return new x(abstractAdapter, networkSettings);
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return new C0188m(abstractAdapter, networkSettings);
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return new F(abstractAdapter, networkSettings);
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.error("ad unit not supported - " + ad_unit);
        return null;
    }

    private void e(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.error(b("Method '" + str + "' is not supported for " + getClass().getName()));
    }

    public abstract IronSource.AD_UNIT a();

    public final String b(String str) {
        String ad_unit = a().toString();
        if (TextUtils.isEmpty(str)) {
            return ad_unit;
        }
        return w0.d(ad_unit, " - ", str);
    }

    public void c(JSONObject jSONObject) {
        e("showAd");
    }

    public abstract void d(JSONObject jSONObject, JSONObject jSONObject2, AdData adData);

    public void destroyAd(AdData adData) {
        g(c.a(adData.getConfiguration()));
    }

    public boolean f(JSONObject jSONObject) {
        e("isAdAvailable");
        return false;
    }

    public void g(JSONObject jSONObject) {
        e("destroyAd");
    }

    public boolean isAdAvailable(AdData adData) {
        return f(c.a(adData.getConfiguration()));
    }

    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, Listener listener) {
        this.f4065d = new WeakReference<>(listener);
        d(c.a(adData.getConfiguration()), c.a(adData.getAdUnitData()), adData);
    }

    public void releaseMemory() {
        IronLog.INTERNAL.verbose(b((String) null));
        AbstractAdapter abstractAdapter = this.f4064c;
        if (abstractAdapter != null) {
            abstractAdapter.releaseMemory(a(), new JSONObject());
            this.f4064c = null;
        }
    }

    public void showAd(AdData adData, Listener listener) {
        this.f4065d = new WeakReference<>(listener);
        c(c.a(adData.getConfiguration()));
    }

    public void loadAd(AdData adData, Activity activity, Listener listener) {
        this.f4065d = new WeakReference<>(listener);
        d(c.a(adData.getConfiguration()), c.a(adData.getAdUnitData()), adData);
    }
}
