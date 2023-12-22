package com.ironsource.adapters.facebook.banner;

import android.widget.FrameLayout;
import androidx.activity.f;
import androidx.fragment.app.w0;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.ironsource.adapters.facebook.FacebookAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.lang.ref.WeakReference;

public class FacebookBannerAdListener implements AdListener {
    private final WeakReference<FacebookBannerAdapter> mAdapter;
    private final FrameLayout.LayoutParams mBannerLayoutParams;
    private final BannerSmashListener mListener;
    private final String mPlacementId;

    public FacebookBannerAdListener(FacebookBannerAdapter facebookBannerAdapter, FrameLayout.LayoutParams layoutParams, String str, BannerSmashListener bannerSmashListener) {
        this.mAdapter = new WeakReference<>(facebookBannerAdapter);
        this.mListener = bannerSmashListener;
        this.mPlacementId = str;
        this.mBannerLayoutParams = layoutParams;
    }

    public void onAdClicked(Ad ad) {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    public void onAdLoaded(Ad ad) {
        IronLog ironLog;
        String str;
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            ironLog = IronLog.INTERNAL;
            str = "listener is null";
        } else {
            WeakReference<FacebookBannerAdapter> weakReference = this.mAdapter;
            if (weakReference == null || weakReference.get() == null) {
                ironLog = IronLog.INTERNAL;
                str = "adapter is null";
            } else {
                AdView adView = this.mAdapter.get().mPlacementIdToAd.get(this.mPlacementId);
                if (adView != null) {
                    this.mListener.onBannerAdLoaded(adView, this.mBannerLayoutParams);
                    return;
                }
                return;
            }
        }
        ironLog.verbose(str);
    }

    public void onError(Ad ad, AdError adError) {
        int i10;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder g10 = f.g("placementId = ");
        g10.append(this.mPlacementId);
        g10.append(" error = ");
        g10.append(adError.getErrorCode());
        g10.append(", ");
        g10.append(adError.getErrorMessage());
        ironLog.verbose(g10.toString());
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (FacebookAdapter.isNoFillError(adError)) {
            i10 = IronSourceError.ERROR_BN_LOAD_NO_FILL;
        } else {
            i10 = adError.getErrorCode();
        }
        this.mListener.onBannerAdLoadFailed(new IronSourceError(i10, adError.getErrorMessage()));
    }

    public void onLoggingImpression(Ad ad) {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
