package com.ironsource.adapters.facebook.nativead;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.activity.f;
import androidx.fragment.app.w0;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.ironsource.adapters.facebook.FacebookAdapter;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FacebookNativeAdListener implements NativeAdListener {
    private final AdOptionsPosition mAdOptionsPosition;
    /* access modifiers changed from: private */
    public final Context mContext;
    private final NativeAdSmashListener mListener;
    private final String mPlacementId;

    public FacebookNativeAdListener(Context context, String str, AdOptionsPosition adOptionsPosition, NativeAdSmashListener nativeAdSmashListener) {
        this.mListener = nativeAdSmashListener;
        this.mPlacementId = str;
        this.mAdOptionsPosition = adOptionsPosition;
        this.mContext = context;
    }

    private void downloadDrawableFromUrlAndSendOnAdLoaded(final NativeAd nativeAd) {
        WorkerManager workerManager = new WorkerManager(Executors.newSingleThreadExecutor());
        workerManager.addCallable(new Callable<Drawable>() {
            public Drawable call() {
                if (nativeAd.getAdIcon() == null || nativeAd.getAdIcon().getUrl() == null) {
                    return null;
                }
                return new BitmapDrawable(FacebookNativeAdListener.this.mContext.getResources(), BitmapFactory.decodeStream(new URL(nativeAd.getAdIcon().getUrl()).openStream()));
            }
        });
        workerManager.startWork(new WorkerManager.WorkEndedListener<Drawable>() {
            public void onWorkCompleted(List<WorkerResult<Drawable>> list, long j10) {
                WorkerResult workerResult = list.get(0);
                FacebookNativeAdListener.this.handleOnAdLoaded(workerResult instanceof WorkerResult.Completed ? (Drawable) ((WorkerResult.Completed) workerResult).data : null, nativeAd);
            }

            public void onWorkFailed(String str) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("error while trying to download the native ad icon resource - " + str);
                FacebookNativeAdListener.this.handleOnAdLoaded((Drawable) null, nativeAd);
            }
        }, 3, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    public void handleOnAdLoaded(Drawable drawable, NativeAd nativeAd) {
        this.mListener.onNativeAdLoaded(new FacebookNativeAdData(nativeAd, drawable), new FacebookNativeAdViewBinder(nativeAd, this.mAdOptionsPosition));
    }

    public void onAdClicked(Ad ad) {
        w0.f(f.g("mPlacementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        NativeAdSmashListener nativeAdSmashListener = this.mListener;
        if (nativeAdSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            nativeAdSmashListener.onNativeAdClicked();
        }
    }

    public void onAdLoaded(Ad ad) {
        w0.f(f.g("mPlacementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else if (ad instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) ad;
            nativeAd.unregisterView();
            downloadDrawableFromUrlAndSendOnAdLoaded(nativeAd);
        } else {
            StringBuilder g10 = f.g("Expected an instance of ");
            g10.append(NativeAd.class.getName());
            g10.append(", received ");
            g10.append(ad.getClass().getName());
            this.mListener.onNativeAdLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, g10.toString()));
        }
    }

    public void onError(Ad ad, AdError adError) {
        int i10;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder g10 = f.g("error = ");
        g10.append(adError.getErrorCode());
        g10.append(", ");
        g10.append(adError.getErrorMessage());
        ironLog.error(g10.toString());
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (FacebookAdapter.isNoFillError(adError)) {
            i10 = IronSourceError.ERROR_NT_LOAD_NO_FILL;
        } else {
            i10 = adError.getErrorCode();
        }
        this.mListener.onNativeAdLoadFailed(new IronSourceError(i10, adError.getErrorMessage()));
    }

    public void onLoggingImpression(Ad ad) {
        w0.f(f.g("mPlacementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        NativeAdSmashListener nativeAdSmashListener = this.mListener;
        if (nativeAdSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            nativeAdSmashListener.onNativeAdShown();
        }
    }

    public void onMediaDownloaded(Ad ad) {
        w0.f(f.g("mPlacementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
    }
}
