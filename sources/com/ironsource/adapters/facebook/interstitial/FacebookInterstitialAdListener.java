package com.ironsource.adapters.facebook.interstitial;

import androidx.activity.f;
import androidx.fragment.app.w0;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.ironsource.adapters.facebook.FacebookAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.lang.ref.WeakReference;

public class FacebookInterstitialAdListener implements InterstitialAdExtendedListener {
    private WeakReference<FacebookInterstitialAdapter> mAdapter;
    private boolean mDidCallClosed;
    private InterstitialSmashListener mListener;
    private String mPlacementId;

    public FacebookInterstitialAdListener(FacebookInterstitialAdapter facebookInterstitialAdapter, String str, InterstitialSmashListener interstitialSmashListener) {
        this.mAdapter = new WeakReference<>(facebookInterstitialAdapter);
        this.mListener = interstitialSmashListener;
        this.mPlacementId = str;
    }

    public void onAdClicked(Ad ad) {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    public void onAdLoaded(Ad ad) {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookInterstitialAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        this.mAdapter.get().mAdsAvailability.put(this.mPlacementId, Boolean.TRUE);
        this.mListener.onInterstitialAdReady();
    }

    public void onError(Ad ad, AdError adError) {
        String str;
        IronLog ironLog;
        int i10;
        IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
        StringBuilder g10 = f.g("placementId = ");
        g10.append(this.mPlacementId);
        g10.append(" error = ");
        g10.append(adError.getErrorCode());
        g10.append(", ");
        g10.append(adError.getErrorMessage());
        ironLog2.verbose(g10.toString());
        if (this.mListener == null) {
            ironLog = IronLog.INTERNAL;
            str = "listener is null";
        } else {
            WeakReference<FacebookInterstitialAdapter> weakReference = this.mAdapter;
            if (weakReference == null || weakReference.get() == null) {
                ironLog = IronLog.INTERNAL;
                str = "adapter is null";
            } else {
                this.mAdapter.get().mAdsAvailability.put(this.mPlacementId, Boolean.FALSE);
                if (FacebookAdapter.isNoFillError(adError)) {
                    i10 = IronSourceError.ERROR_IS_LOAD_NO_FILL;
                } else {
                    i10 = adError.getErrorCode();
                }
                IronSourceError ironSourceError = new IronSourceError(i10, adError.getErrorMessage());
                if (this.mAdapter.get().mPlacementIdToShowAttempts.get(this.mPlacementId).booleanValue()) {
                    this.mListener.onInterstitialAdShowFailed(ironSourceError);
                    return;
                } else {
                    this.mListener.onInterstitialAdLoadFailed(ironSourceError);
                    return;
                }
            }
        }
        ironLog.verbose(str);
    }

    public void onInterstitialActivityDestroyed() {
        String str;
        IronLog ironLog;
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            ironLog = IronLog.INTERNAL;
            str = "listener is null";
        } else {
            WeakReference<FacebookInterstitialAdapter> weakReference = this.mAdapter;
            if (weakReference == null || weakReference.get() == null) {
                ironLog = IronLog.INTERNAL;
                str = "adapter is null";
            } else if (!this.mDidCallClosed) {
                this.mListener.onInterstitialAdClosed();
                return;
            } else {
                return;
            }
        }
        ironLog.verbose(str);
    }

    public void onInterstitialDismissed(Ad ad) {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookInterstitialAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        this.mDidCallClosed = true;
        this.mListener.onInterstitialAdClosed();
    }

    public void onInterstitialDisplayed(Ad ad) {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
    }

    public void onLoggingImpression(Ad ad) {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookInterstitialAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        this.mDidCallClosed = false;
        this.mListener.onInterstitialAdOpened();
        this.mListener.onInterstitialAdShowSucceeded();
    }

    public void onRewardedAdCompleted() {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
    }

    public void onRewardedAdServerFailed() {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
    }

    public void onRewardedAdServerSucceeded() {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
    }
}
