package com.ironsource.adapters.ironsource.nativeAd;

import android.net.Uri;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.sdk.k.c;
import x8.f;

public final class IronSourceNativeAdData extends AdapterNativeAdData {
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final NativeAdDataInterface.Image icon;
    private final String title;

    public IronSourceNativeAdData(c cVar) {
        f.f(cVar, "nativeAdData");
        this.title = cVar.f5684a;
        this.advertiser = cVar.f5685b;
        this.body = cVar.f5686c;
        this.callToAction = cVar.f5687d;
        this.icon = new NativeAdDataInterface.Image(cVar.f5688e, (Uri) null);
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final NativeAdDataInterface.Image getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }
}
