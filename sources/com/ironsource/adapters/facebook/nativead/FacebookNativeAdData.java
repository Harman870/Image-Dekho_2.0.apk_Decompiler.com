package com.ironsource.adapters.facebook.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.activity.f;
import com.facebook.ads.NativeAd;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;

public class FacebookNativeAdData extends AdapterNativeAdData {
    private Drawable mIconDrawable;
    private final NativeAd mNativeAd;

    public FacebookNativeAdData(NativeAd nativeAd, Drawable drawable) {
        this.mNativeAd = nativeAd;
        this.mIconDrawable = drawable;
    }

    public String getAdvertiser() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder g10 = f.g("advertiser = ");
        g10.append(this.mNativeAd.getAdvertiserName());
        ironLog.verbose(g10.toString());
        return this.mNativeAd.getAdvertiserName();
    }

    public String getBody() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder g10 = f.g("body = ");
        g10.append(this.mNativeAd.getAdBodyText());
        ironLog.verbose(g10.toString());
        return this.mNativeAd.getAdBodyText();
    }

    public String getCallToAction() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder g10 = f.g("cta = ");
        g10.append(this.mNativeAd.getAdCallToAction());
        ironLog.verbose(g10.toString());
        return this.mNativeAd.getAdCallToAction();
    }

    public NativeAdDataInterface.Image getIcon() {
        Uri parse = this.mNativeAd.getAdIcon() != null ? Uri.parse(this.mNativeAd.getAdIcon().getUrl()) : null;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("icon uri = " + parse);
        if (this.mNativeAd.getPreloadedIconViewDrawable() != null) {
            this.mIconDrawable = this.mNativeAd.getPreloadedIconViewDrawable();
        }
        return new NativeAdDataInterface.Image(this.mIconDrawable, parse);
    }

    public String getTitle() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder g10 = f.g("headline = ");
        g10.append(this.mNativeAd.getAdHeadline());
        ironLog.verbose(g10.toString());
        return this.mNativeAd.getAdHeadline();
    }
}
