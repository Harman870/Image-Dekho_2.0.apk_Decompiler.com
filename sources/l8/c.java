package l8;

import android.os.Handler;
import android.util.Log;
import androidx.activity.m;
import androidx.appcompat.widget.j1;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import java.util.concurrent.Callable;
import s5.f;

public final class c implements LevelPlayInterstitialListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f9250a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f9251b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Callable f9252c;

    public c(Callable callable, Callable callable2, Callable callable3) {
        this.f9250a = callable;
        this.f9251b = callable2;
        this.f9252c = callable3;
    }

    public final void onAdClicked(AdInfo adInfo) {
        new Handler().post(new m(5, this.f9252c));
    }

    public final void onAdClosed(AdInfo adInfo) {
        new Handler().post(new f(5, this.f9251b));
        IronSource.loadInterstitial();
    }

    public final void onAdLoadFailed(IronSourceError ironSourceError) {
        Log.d("errorAd", ironSourceError.getErrorMessage());
    }

    public final void onAdOpened(AdInfo adInfo) {
        new Handler().post(new j1(4, this.f9250a));
    }

    public final void onAdReady(AdInfo adInfo) {
    }

    public final void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
        Log.d("errorAd", ironSourceError.getErrorMessage());
    }

    public final void onAdShowSucceeded(AdInfo adInfo) {
    }
}
