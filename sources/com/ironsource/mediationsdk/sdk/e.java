package com.ironsource.mediationsdk.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.v0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements InterstitialListener, RewardedVideoListener, SegmentListener, d {

    /* renamed from: a  reason: collision with root package name */
    public RewardedVideoListener f4837a;

    /* renamed from: b  reason: collision with root package name */
    public InterstitialListener f4838b;

    /* renamed from: c  reason: collision with root package name */
    public OfferwallListener f4839c;

    /* renamed from: d  reason: collision with root package name */
    public SegmentListener f4840d;

    /* renamed from: e  reason: collision with root package name */
    public v f4841e;

    /* renamed from: f  reason: collision with root package name */
    public long f4842f = new Date().getTime();

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4843a;

        public a(IronSourceError ironSourceError) {
            this.f4843a = ironSourceError;
        }

        public final void run() {
            e.this.f4839c.onOfferwallShowFailed(this.f4843a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4845a;

        public b(IronSourceError ironSourceError) {
            this.f4845a = ironSourceError;
        }

        public final void run() {
            e.this.f4839c.onGetOfferwallCreditsFailed(this.f4845a);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            e.this.f4837a.onRewardedVideoAdOpened();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public final void run() {
            e.this.f4839c.onOfferwallClosed();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.e$e  reason: collision with other inner class name */
    public class C0055e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ boolean f4849a;

        public C0055e(boolean z9) {
            this.f4849a = z9;
        }

        public final void run() {
            e.this.f4839c.onOfferwallAvailable(this.f4849a);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        public final void run() {
            e.this.f4837a.onRewardedVideoAdClosed();
        }
    }

    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ boolean f4852a;

        public g(boolean z9) {
            this.f4852a = z9;
        }

        public final void run() {
            e.this.f4837a.onRewardedVideoAvailabilityChanged(this.f4852a);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        public final void run() {
            e.this.f4837a.onRewardedVideoAdStarted();
        }
    }

    public class i implements Runnable {
        public i() {
        }

        public final void run() {
            e.this.f4837a.onRewardedVideoAdEnded();
        }
    }

    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Placement f4856a;

        public j(Placement placement) {
            this.f4856a = placement;
        }

        public final void run() {
            e.this.f4837a.onRewardedVideoAdRewarded(this.f4856a);
        }
    }

    public class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4858a;

        public k(String str) {
            this.f4858a = str;
        }

        public final void run() {
            if (!TextUtils.isEmpty(this.f4858a)) {
                e.this.f4840d.onSegmentReceived(this.f4858a);
            }
        }
    }

    public class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Placement f4860a;

        public l(Placement placement) {
            this.f4860a = placement;
        }

        public final void run() {
            e.this.f4837a.onRewardedVideoAdClicked(this.f4860a);
        }
    }

    public class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4862a;

        public m(IronSourceError ironSourceError) {
            this.f4862a = ironSourceError;
        }

        public final void run() {
            e.this.f4837a.onRewardedVideoAdShowFailed(this.f4862a);
        }
    }

    public class n implements Runnable {
        public n() {
        }

        public final void run() {
            e.this.f4838b.onInterstitialAdReady();
        }
    }

    public class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4865a;

        public o(IronSourceError ironSourceError) {
            this.f4865a = ironSourceError;
        }

        public final void run() {
            e.this.f4838b.onInterstitialAdLoadFailed(this.f4865a);
        }
    }

    public class p implements Runnable {
        public p() {
        }

        public final void run() {
            e.this.f4838b.onInterstitialAdOpened();
        }
    }

    public class q implements Runnable {
        public q() {
        }

        public final void run() {
            e.this.f4838b.onInterstitialAdShowSucceeded();
        }
    }

    public class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4869a;

        public r(IronSourceError ironSourceError) {
            this.f4869a = ironSourceError;
        }

        public final void run() {
            e.this.f4838b.onInterstitialAdShowFailed(this.f4869a);
        }
    }

    public class s implements Runnable {
        public s() {
        }

        public final void run() {
            e.this.f4838b.onInterstitialAdClicked();
        }
    }

    public class t implements Runnable {
        public t() {
        }

        public final void run() {
            e.this.f4838b.onInterstitialAdClosed();
        }
    }

    public class u implements Runnable {
        public u() {
        }

        public final void run() {
            e.this.f4839c.onOfferwallOpened();
        }
    }

    public class v extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public Handler f4874a;

        public final void run() {
            Looper.prepare();
            this.f4874a = new Handler();
            Looper.loop();
        }
    }

    public e() {
        v vVar = new v();
        this.f4841e = vVar;
        vVar.start();
    }

    public final void a(Runnable runnable) {
        Handler handler;
        v vVar = this.f4841e;
        if (vVar != null && (handler = vVar.f4874a) != null) {
            handler.post(runnable);
        }
    }

    public final void a(boolean z9, IronSourceError ironSourceError) {
        String str = "onOfferwallAvailable(isAvailable: " + z9 + ")";
        if (ironSourceError != null) {
            StringBuilder h10 = com.ironsource.adapters.ironsource.a.h(str, ", error: ");
            h10.append(ironSourceError.getErrorMessage());
            str = h10.toString();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_STATUS, String.valueOf(z9));
            if (ironSourceError != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.events.i.d().a(new com.ironsource.environment.c.a(IronSourceConstants.OFFERWALL_AVAILABLE, mediationAdditionalData));
        if (b(this.f4839c)) {
            a(new C0055e(z9));
        }
    }

    public final boolean b(Object obj) {
        return (obj == null || this.f4841e == null) ? false : true;
    }

    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        if (b(this.f4839c)) {
            a(new b(ironSourceError));
        }
    }

    public final void onInterstitialAdClicked() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
        if (b(this.f4838b)) {
            a(new s());
        }
    }

    public final void onInterstitialAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
        if (b(this.f4838b)) {
            a(new t());
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        if (b(this.f4838b)) {
            a(new o(ironSourceError));
        }
    }

    public final void onInterstitialAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
        if (b(this.f4838b)) {
            a(new p());
        }
    }

    public final void onInterstitialAdReady() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
        if (b(this.f4838b)) {
            a(new n());
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            if (ironSourceError.getErrorMessage() != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.events.e.d().a(new com.ironsource.environment.c.a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, mediationAdditionalData));
        if (b(this.f4838b)) {
            a(new r(ironSourceError));
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
        if (b(this.f4838b)) {
            a(new q());
        }
    }

    public final boolean onOfferwallAdCredited(int i10, int i11, boolean z9) {
        OfferwallListener offerwallListener = this.f4839c;
        boolean onOfferwallAdCredited = offerwallListener != null ? offerwallListener.onOfferwallAdCredited(i10, i11, z9) : false;
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallAdCredited(credits:" + i10 + ", totalCredits:" + i11 + ", totalCreditsFlag:" + z9 + "):" + onOfferwallAdCredited, 1);
        return onOfferwallAdCredited;
    }

    public final void onOfferwallAvailable(boolean z9) {
        a(z9, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallClosed()", 1);
        if (b(this.f4839c)) {
            a(new d());
        }
    }

    public final void onOfferwallOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallOpened()", 1);
        if (b(this.f4839c)) {
            a(new u());
        }
    }

    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        if (b(this.f4839c)) {
            a(new a(ironSourceError));
        }
    }

    public final void onRewardedVideoAdClicked(Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdClicked(" + placement.getPlacementName() + ")", 1);
        if (b(this.f4837a)) {
            a(new l(placement));
        }
    }

    public final void onRewardedVideoAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
        if (b(this.f4837a)) {
            a(new f());
        }
    }

    public final void onRewardedVideoAdEnded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
        if (b(this.f4837a)) {
            a(new i());
        }
    }

    public final void onRewardedVideoAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
        if (b(this.f4837a)) {
            a(new c());
        }
    }

    public final void onRewardedVideoAdRewarded(Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdRewarded(" + placement.toString() + ")", 1);
        if (b(this.f4837a)) {
            a(new j(placement));
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "onRewardedVideoAdShowFailed(" + ironSourceError.toString() + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            if (!TextUtils.isEmpty((CharSequence) null)) {
                mediationAdditionalData.put("placement", (Object) null);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.events.i.d().a(new com.ironsource.environment.c.a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, mediationAdditionalData));
        if (b(this.f4837a)) {
            a(new m(ironSourceError));
        }
    }

    public final void onRewardedVideoAdStarted() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
        if (b(this.f4837a)) {
            a(new h());
        }
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z9) {
        int i10;
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAvailabilityChanged(available:" + z9 + ")", 1);
        long time = new Date().getTime() - this.f4842f;
        this.f4842f = v0.b();
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, time);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (z9) {
            i10 = IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE;
        } else {
            i10 = IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE;
        }
        com.ironsource.mediationsdk.events.i.d().a(new com.ironsource.environment.c.a(i10, mediationAdditionalData));
        if (b(this.f4837a)) {
            a(new g(z9));
        }
    }

    public final void onSegmentReceived(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onSegmentReceived(" + str + ")", 1);
        if (b(this.f4840d)) {
            a(new k(str));
        }
    }
}
