package l8;

import a5.a;
import android.os.Handler;
import android.util.Log;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import java.util.concurrent.Callable;

public final class b implements LevelPlayInterstitialListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f9249a;

    public b(Callable callable) {
        this.f9249a = callable;
    }

    public final void onAdClicked(AdInfo adInfo) {
    }

    public final void onAdClosed(AdInfo adInfo) {
        new Handler().post(new a(2, this.f9249a));
        IronSource.loadInterstitial();
    }

    public final void onAdLoadFailed(IronSourceError ironSourceError) {
        Log.d("errorAd", ironSourceError.getErrorMessage());
    }

    public final void onAdOpened(AdInfo adInfo) {
    }

    public final void onAdReady(AdInfo adInfo) {
    }

    public final void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
        Log.d("errorAd", ironSourceError.getErrorMessage());
    }

    public final void onAdShowSucceeded(AdInfo adInfo) {
    }
}
