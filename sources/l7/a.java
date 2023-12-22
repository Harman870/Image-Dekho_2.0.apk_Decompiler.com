package l7;

import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import org.json.JSONObject;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IronSourceNativeAdAdapter f9241a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JSONObject f9242b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ NativeAdSmashListener f9243c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f9244d;

    public /* synthetic */ a(IronSourceNativeAdAdapter ironSourceNativeAdAdapter, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener, String str) {
        this.f9241a = ironSourceNativeAdAdapter;
        this.f9242b = jSONObject;
        this.f9243c = nativeAdSmashListener;
        this.f9244d = str;
    }

    public final void run() {
        IronSourceNativeAdAdapter.m11loadNativeAdForBidding$lambda0(this.f9241a, this.f9242b, this.f9243c, this.f9244d);
    }
}
