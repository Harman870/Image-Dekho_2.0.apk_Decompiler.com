package l8;

import android.os.Handler;
import androidx.activity.b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import j8.c;
import java.util.concurrent.Callable;

public final class d implements LevelPlayRewardedVideoManualListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f9253a;

    public d(c cVar) {
        this.f9253a = cVar;
    }

    public final void onAdClicked(Placement placement, AdInfo adInfo) {
    }

    public final void onAdClosed(AdInfo adInfo) {
        IronSource.loadRewardedVideo();
    }

    public final void onAdLoadFailed(IronSourceError ironSourceError) {
    }

    public final void onAdOpened(AdInfo adInfo) {
    }

    public final void onAdReady(AdInfo adInfo) {
    }

    public final void onAdRewarded(Placement placement, AdInfo adInfo) {
        new Handler().post(new b(3, this.f9253a));
    }

    public final void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
    }
}
