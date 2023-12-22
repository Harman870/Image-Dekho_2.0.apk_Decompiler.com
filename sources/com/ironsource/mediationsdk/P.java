package com.ironsource.mediationsdk;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;

public final class P extends com.ironsource.mediationsdk.sdk.a {

    /* renamed from: e  reason: collision with root package name */
    public static final P f3992e = new P();

    /* renamed from: a  reason: collision with root package name */
    public RewardedVideoListener f3993a = null;

    /* renamed from: b  reason: collision with root package name */
    public LevelPlayRewardedVideoBaseListener f3994b;

    /* renamed from: c  reason: collision with root package name */
    public LevelPlayRewardedVideoBaseListener f3995c;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Placement f4001a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ AdInfo f4002b;

        public a(Placement placement, AdInfo adInfo) {
            this.f4001a = placement;
            this.f4002b = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3995c;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdRewarded(this.f4001a, p5.f(this.f4002b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdRewarded() placement = " + this.f4001a + ", adInfo = " + P.this.f(this.f4002b));
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Placement f4004a;

        public b(Placement placement) {
            this.f4004a = placement;
        }

        public final void run() {
            RewardedVideoListener rewardedVideoListener = P.this.f3993a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAdRewarded(this.f4004a);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded(" + this.f4004a + ")", 1);
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Placement f4006a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ AdInfo f4007b;

        public c(Placement placement, AdInfo adInfo) {
            this.f4006a = placement;
            this.f4007b = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3994b;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdRewarded(this.f4006a, p5.f(this.f4007b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdRewarded() placement = " + this.f4006a + ", adInfo = " + P.this.f(this.f4007b));
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4009a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ AdInfo f4010b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f4009a = ironSourceError;
            this.f4010b = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3995c;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdShowFailed(this.f4009a, p5.f(this.f4010b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + P.this.f(this.f4010b) + ", error = " + this.f4009a.getErrorMessage());
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4012a;

        public e(IronSourceError ironSourceError) {
            this.f4012a = ironSourceError;
        }

        public final void run() {
            RewardedVideoListener rewardedVideoListener = P.this.f3993a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAdShowFailed(this.f4012a);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() error=" + this.f4012a.getErrorMessage(), 1);
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4014a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ AdInfo f4015b;

        public f(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f4014a = ironSourceError;
            this.f4015b = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3994b;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdShowFailed(this.f4014a, p5.f(this.f4015b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + P.this.f(this.f4015b) + ", error = " + this.f4014a.getErrorMessage());
            }
        }
    }

    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Placement f4017a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ AdInfo f4018b;

        public g(Placement placement, AdInfo adInfo) {
            this.f4017a = placement;
            this.f4018b = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3995c;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdClicked(this.f4017a, p5.f(this.f4018b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() placement = " + this.f4017a + ", adInfo = " + P.this.f(this.f4018b));
            }
        }
    }

    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Placement f4020a;

        public h(Placement placement) {
            this.f4020a = placement;
        }

        public final void run() {
            RewardedVideoListener rewardedVideoListener = P.this.f3993a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAdClicked(this.f4020a);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked(" + this.f4020a + ")", 1);
            }
        }
    }

    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Placement f4022a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ AdInfo f4023b;

        public i(Placement placement, AdInfo adInfo) {
            this.f4022a = placement;
            this.f4023b = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3994b;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdClicked(this.f4022a, p5.f(this.f4023b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() placement = " + this.f4022a + ", adInfo = " + P.this.f(this.f4023b));
            }
        }
    }

    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4025a;

        public j(IronSourceError ironSourceError) {
            this.f4025a = ironSourceError;
        }

        public final void run() {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = P.this.f3995c;
            if (levelPlayRewardedVideoBaseListener != null) {
                ((LevelPlayRewardedVideoManualListener) levelPlayRewardedVideoBaseListener).onAdLoadFailed(this.f4025a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f4025a.getErrorMessage());
            }
        }
    }

    public class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4027a;

        public k(IronSourceError ironSourceError) {
            this.f4027a = ironSourceError;
        }

        public final void run() {
            RewardedVideoListener rewardedVideoListener = P.this.f3993a;
            if (rewardedVideoListener != null) {
                ((RewardedVideoManualListener) rewardedVideoListener).onRewardedVideoAdLoadFailed(this.f4027a);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() error=" + this.f4027a.getErrorMessage(), 1);
            }
        }
    }

    public class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4029a;

        public l(IronSourceError ironSourceError) {
            this.f4029a = ironSourceError;
        }

        public final void run() {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = P.this.f3994b;
            if (levelPlayRewardedVideoBaseListener != null) {
                ((LevelPlayRewardedVideoManualListener) levelPlayRewardedVideoBaseListener).onAdLoadFailed(this.f4029a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f4029a.getErrorMessage());
            }
        }
    }

    public class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4031a;

        public m(AdInfo adInfo) {
            this.f4031a = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3995c;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdOpened(p5.f(this.f4031a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + P.this.f(this.f4031a));
            }
        }
    }

    public class n implements Runnable {
        public n() {
        }

        public final void run() {
            RewardedVideoListener rewardedVideoListener = P.this.f3993a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAdOpened();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
            }
        }
    }

    public class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4034a;

        public o(AdInfo adInfo) {
            this.f4034a = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3994b;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdOpened(p5.f(this.f4034a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + P.this.f(this.f4034a));
            }
        }
    }

    public class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4036a;

        public p(AdInfo adInfo) {
            this.f4036a = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3995c;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdClosed(p5.f(this.f4036a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + P.this.f(this.f4036a));
            }
        }
    }

    public class q implements Runnable {
        public q() {
        }

        public final void run() {
            RewardedVideoListener rewardedVideoListener = P.this.f3993a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAdClosed();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
            }
        }
    }

    public class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AdInfo f4039a;

        public r(AdInfo adInfo) {
            this.f4039a = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3994b;
            if (levelPlayRewardedVideoBaseListener != null) {
                levelPlayRewardedVideoBaseListener.onAdClosed(p5.f(this.f4039a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + P.this.f(this.f4039a));
            }
        }
    }

    public class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ boolean f4041a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ AdInfo f4042b;

        public s(boolean z9, AdInfo adInfo) {
            this.f4041a = z9;
            this.f4042b = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3995c;
            if (levelPlayRewardedVideoBaseListener != null) {
                LevelPlayRewardedVideoListener levelPlayRewardedVideoListener = (LevelPlayRewardedVideoListener) levelPlayRewardedVideoBaseListener;
                if (this.f4041a) {
                    levelPlayRewardedVideoListener.onAdAvailable(p5.f(this.f4042b));
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onAdAvailable() adInfo = " + P.this.f(this.f4042b));
                    return;
                }
                levelPlayRewardedVideoListener.onAdUnavailable();
                IronLog.CALLBACK.info("onAdUnavailable()");
            }
        }
    }

    public class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ boolean f4044a;

        public t(boolean z9) {
            this.f4044a = z9;
        }

        public final void run() {
            RewardedVideoListener rewardedVideoListener = P.this.f3993a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAvailabilityChanged(this.f4044a);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAvailabilityChanged() available=" + this.f4044a, 1);
            }
        }
    }

    public class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ boolean f4046a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ AdInfo f4047b;

        public u(boolean z9, AdInfo adInfo) {
            this.f4046a = z9;
            this.f4047b = adInfo;
        }

        public final void run() {
            P p5 = P.this;
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = p5.f3994b;
            if (levelPlayRewardedVideoBaseListener != null) {
                LevelPlayRewardedVideoListener levelPlayRewardedVideoListener = (LevelPlayRewardedVideoListener) levelPlayRewardedVideoBaseListener;
                if (this.f4046a) {
                    levelPlayRewardedVideoListener.onAdAvailable(p5.f(this.f4047b));
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onAdAvailable() adInfo = " + P.this.f(this.f4047b));
                    return;
                }
                levelPlayRewardedVideoListener.onAdUnavailable();
                IronLog.CALLBACK.info("onAdUnavailable()");
            }
        }
    }

    public class v implements Runnable {
        public v() {
        }

        public final void run() {
            RewardedVideoListener rewardedVideoListener = P.this.f3993a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAdStarted();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
            }
        }
    }

    public class w implements Runnable {
        public w() {
        }

        public final void run() {
            RewardedVideoListener rewardedVideoListener = P.this.f3993a;
            if (rewardedVideoListener != null) {
                rewardedVideoListener.onRewardedVideoAdEnded();
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
            }
        }
    }

    private P() {
    }

    public static P a() {
        return f3992e;
    }

    public final void a(AdInfo adInfo) {
        if (this.f3995c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
            return;
        }
        if (this.f3993a != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n());
        }
        if (this.f3994b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public final void a(IronSourceError ironSourceError) {
        if (this.f3995c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        RewardedVideoListener rewardedVideoListener = this.f3993a;
        if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f3994b;
        if (levelPlayRewardedVideoBaseListener != null && (levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(ironSourceError));
        }
    }

    public final void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f3995c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
            return;
        }
        if (this.f3993a != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError));
        }
        if (this.f3994b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError, adInfo));
        }
    }

    public final void a(Placement placement, AdInfo adInfo) {
        if (this.f3995c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(placement, adInfo));
            return;
        }
        if (this.f3993a != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(placement));
        }
        if (this.f3994b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(placement, adInfo));
        }
    }

    public final void a(boolean z9, AdInfo adInfo) {
        if (this.f3995c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new s(z9, adInfo));
            return;
        }
        if (this.f3993a != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new t(z9));
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f3994b;
        if (levelPlayRewardedVideoBaseListener != null && (levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new u(z9, adInfo));
        }
    }

    public final void b() {
        if (this.f3995c == null && this.f3993a != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new v());
        }
    }

    public final void b(AdInfo adInfo) {
        if (this.f3995c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(adInfo));
            return;
        }
        if (this.f3993a != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new q());
        }
        if (this.f3994b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new r(adInfo));
        }
    }

    public final void b(Placement placement, AdInfo adInfo) {
        if (this.f3995c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(placement, adInfo));
            return;
        }
        if (this.f3993a != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(placement));
        }
        if (this.f3994b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(placement, adInfo));
        }
    }

    public final void c() {
        if (this.f3995c == null && this.f3993a != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new w());
        }
    }
}
