package com.ironsource.adapters.facebook.rewardedvideo;

import androidx.activity.f;
import androidx.fragment.app.w0;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.ironsource.adapters.facebook.FacebookAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.lang.ref.WeakReference;

public class FacebookRewardedVideoAdListener implements RewardedVideoAdExtendedListener {
    private WeakReference<FacebookRewardedVideoAdapter> mAdapter;
    private boolean mDidCallClosed;
    private RewardedVideoSmashListener mListener;
    private String mPlacementId;

    public FacebookRewardedVideoAdListener(FacebookRewardedVideoAdapter facebookRewardedVideoAdapter, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mAdapter = new WeakReference<>(facebookRewardedVideoAdapter);
        this.mPlacementId = str;
        this.mListener = rewardedVideoSmashListener;
    }

    public void onAdClicked(Ad ad) {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    public void onAdLoaded(Ad ad) {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookRewardedVideoAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        this.mAdapter.get().mAdsAvailability.put(this.mPlacementId, Boolean.TRUE);
        this.mListener.onRewardedVideoAvailabilityChanged(true);
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
            WeakReference<FacebookRewardedVideoAdapter> weakReference = this.mAdapter;
            if (weakReference == null || weakReference.get() == null) {
                ironLog = IronLog.INTERNAL;
                str = "adapter is null";
            } else {
                this.mAdapter.get().mAdsAvailability.put(this.mPlacementId, Boolean.FALSE);
                if (FacebookAdapter.isNoFillError(adError)) {
                    i10 = IronSourceError.ERROR_RV_LOAD_NO_FILL;
                } else {
                    i10 = adError.getErrorCode();
                }
                IronSourceError ironSourceError = new IronSourceError(i10, adError.getErrorMessage());
                if (this.mAdapter.get().mPlacementIdToShowAttempts.get(this.mPlacementId).booleanValue()) {
                    this.mListener.onRewardedVideoAdShowFailed(ironSourceError);
                    return;
                }
                this.mListener.onRewardedVideoAvailabilityChanged(false);
                this.mListener.onRewardedVideoLoadFailed(ironSourceError);
                return;
            }
        }
        ironLog.verbose(str);
    }

    public void onLoggingImpression(Ad ad) {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookRewardedVideoAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        this.mDidCallClosed = false;
        this.mListener.onRewardedVideoAdOpened();
        this.mListener.onRewardedVideoAdStarted();
    }

    public void onRewardedVideoActivityDestroyed() {
        String str;
        IronLog ironLog;
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            ironLog = IronLog.INTERNAL;
            str = "listener is null";
        } else {
            WeakReference<FacebookRewardedVideoAdapter> weakReference = this.mAdapter;
            if (weakReference == null || weakReference.get() == null) {
                ironLog = IronLog.INTERNAL;
                str = "adapter is null";
            } else if (!this.mDidCallClosed) {
                this.mListener.onRewardedVideoAdClosed();
                return;
            } else {
                return;
            }
        }
        ironLog.verbose(str);
    }

    public void onRewardedVideoClosed() {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookRewardedVideoAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        this.mDidCallClosed = true;
        this.mListener.onRewardedVideoAdClosed();
    }

    public void onRewardedVideoCompleted() {
        w0.f(f.g("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        rewardedVideoSmashListener.onRewardedVideoAdEnded();
        this.mListener.onRewardedVideoAdRewarded();
    }
}
