package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

@Keep
public class RewardedVideoAd implements FullScreenAd {
    public static final int UNSET_VIDEO_DURATION = -1;
    private final RewardedVideoAdApi mRewardedVideoAdApi;

    @Keep
    public interface RewardedVideoAdLoadConfigBuilder extends Ad.LoadConfigBuilder {
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoLoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withAdCompanionView(boolean z9);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withAdExperience(AdExperienceType adExperienceType);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withAdListener(RewardedVideoAdListener rewardedVideoAdListener);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withBid(String str);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z9);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withRewardData(RewardData rewardData);
    }

    @Keep
    public interface RewardedVideoAdShowConfigBuilder extends FullScreenAd.ShowConfigBuilder {
        RewardedVideoShowAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdShowConfigBuilder withAppOrientation(int i10);
    }

    @Keep
    public interface RewardedVideoLoadAdConfig extends Ad.LoadAdConfig {
    }

    @Keep
    public interface RewardedVideoShowAdConfig extends FullScreenAd.ShowAdConfig {
    }

    @Benchmark
    public RewardedVideoAd(Context context, String str) {
        this.mRewardedVideoAdApi = DynamicLoaderFactory.makeLoader(context).createRewardedVideoAd(context, str, this);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public RewardedVideoAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mRewardedVideoAdApi.buildLoadAdConfig();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public RewardedVideoAdShowConfigBuilder buildShowAdConfig() {
        return this.mRewardedVideoAdApi.buildShowAdConfig();
    }

    public void destroy() {
        this.mRewardedVideoAdApi.destroy();
    }

    public String getPlacementId() {
        return this.mRewardedVideoAdApi.getPlacementId();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public int getVideoDuration() {
        return this.mRewardedVideoAdApi.getVideoDuration();
    }

    public boolean isAdInvalidated() {
        return this.mRewardedVideoAdApi.isAdInvalidated();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public boolean isAdLoaded() {
        return this.mRewardedVideoAdApi.isAdLoaded();
    }

    public void loadAd() {
        this.mRewardedVideoAdApi.loadAd();
    }

    @Benchmark
    public void loadAd(RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        this.mRewardedVideoAdApi.loadAd(rewardedVideoLoadAdConfig);
    }

    public void registerAdCompanionView(AdCompanionView adCompanionView) {
        Preconditions.checkIsOnMainThread();
        this.mRewardedVideoAdApi.registerAdCompanionView(adCompanionView);
    }

    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mRewardedVideoAdApi.setExtraHints(extraHints);
    }

    public boolean show() {
        return this.mRewardedVideoAdApi.show();
    }

    @Benchmark
    public boolean show(RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        return this.mRewardedVideoAdApi.show(rewardedVideoShowAdConfig);
    }

    public void unregisterAdCompanionView() {
        Preconditions.checkIsOnMainThread();
        this.mRewardedVideoAdApi.unregisterAdCompanionView();
    }
}
