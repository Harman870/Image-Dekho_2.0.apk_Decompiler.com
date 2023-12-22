package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.v0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.bidding.c;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.events.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.services.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

public final class B extends O implements c, RewardedVideoSmashListener {

    /* renamed from: h  reason: collision with root package name */
    public a f3820h;

    /* renamed from: i  reason: collision with root package name */
    public C f3821i;

    /* renamed from: j  reason: collision with root package name */
    public Timer f3822j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public String f3823l;

    /* renamed from: m  reason: collision with root package name */
    public String f3824m;

    /* renamed from: n  reason: collision with root package name */
    public Placement f3825n;

    /* renamed from: o  reason: collision with root package name */
    public long f3826o;

    /* renamed from: p  reason: collision with root package name */
    public String f3827p;

    /* renamed from: q  reason: collision with root package name */
    public JSONObject f3828q;

    /* renamed from: r  reason: collision with root package name */
    public int f3829r;

    /* renamed from: s  reason: collision with root package name */
    public String f3830s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f3831t;
    public final Object u;

    /* renamed from: v  reason: collision with root package name */
    public long f3832v;
    public final a.C0056a w;

    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public class b extends TimerTask {
        public b() {
        }

        public final void run() {
            int i10;
            boolean z9;
            B b10 = B.this;
            a aVar = b10.f3820h;
            a aVar2 = a.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (aVar == aVar2 || aVar == a.INIT_IN_PROGRESS) {
                if (aVar == aVar2) {
                    i10 = 1025;
                } else {
                    i10 = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                    str = "Rewarded Video - init instance time out";
                }
                b10.t(a.NOT_LOADED);
                z9 = true;
            } else {
                z9 = false;
                i10 = 0;
            }
            B.this.b(str, 0);
            if (z9) {
                B.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(B.this.x())}});
                B.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(B.this.x())}});
                B b11 = B.this;
                b11.f3821i.b(b11);
                return;
            }
            B.this.b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(B.this.x())}, new Object[]{IronSourceConstants.EVENTS_EXT1, B.this.f3820h.name()}});
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public B(com.ironsource.mediationsdk.B r10, com.ironsource.mediationsdk.C r11, com.ironsource.mediationsdk.AbstractAdapter r12, int r13, java.lang.String r14, org.json.JSONObject r15, int r16, java.lang.String r17) {
        /*
            r9 = this;
            r8 = r9
            r0 = r10
            java.lang.String r1 = r0.f3823l
            java.lang.String r2 = r0.f3824m
            com.ironsource.mediationsdk.model.a r3 = r0.f3986b
            com.ironsource.mediationsdk.model.NetworkSettings r3 = r3.f4703a
            int r5 = r0.k
            r0 = r9
            r4 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r14
            r8.f3827p = r0
            r0 = r15
            r8.f3828q = r0
            r0 = r16
            r8.f3829r = r0
            r0 = r17
            r8.f3830s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.B.<init>(com.ironsource.mediationsdk.B, com.ironsource.mediationsdk.C, com.ironsource.mediationsdk.AbstractAdapter, int, java.lang.String, org.json.JSONObject, int, java.lang.String):void");
    }

    public B(String str, String str2, NetworkSettings networkSettings, C c10, int i10, AbstractAdapter abstractAdapter, int i11) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f3831t = new Object();
        this.u = new Object();
        this.w = MediationServices.getEditor().getSessionDepthServiceEditor();
        this.f3823l = str;
        this.f3824m = str2;
        this.f3821i = c10;
        this.f3822j = null;
        this.k = i10;
        this.f3990f = i11;
        this.f3820h = a.NO_INIT;
        this.f3832v = 0;
        if (j()) {
            b("isBidder = " + h() + ", shouldEarlyInit = " + i(), 0);
            t(a.INIT_IN_PROGRESS);
            v();
            try {
                this.f3985a.initRewardedVideoWithCallback(this.f3823l, this.f3824m, this.f3988d, this);
            } catch (Throwable th) {
                b("initForBidding exception: " + th.getLocalizedMessage(), 3);
                th.printStackTrace();
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
            }
        }
    }

    public static boolean u(int i10) {
        return i10 == 1001 || i10 == 1002 || i10 == 1200 || i10 == 1212 || i10 == 1213 || i10 == 1005 || i10 == 1203 || i10 == 1201 || i10 == 1202 || i10 == 1006 || i10 == 1010;
    }

    public final Map<String, Object> a(AdData adData) {
        JSONObject a10 = adData != null ? com.ironsource.mediationsdk.d.c.a(adData.getAdUnitData()) : null;
        try {
            if (h()) {
                return this.f3985a.getRewardedVideoBiddingData(this.f3988d, a10);
            }
            return null;
        } catch (Throwable th) {
            b("getBiddingData exception: " + th.getLocalizedMessage(), 3);
            th.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    public final void a(int i10) {
        g(i10, (Object[][]) null, false);
    }

    public final void a(int i10, Object[][] objArr) {
        g(i10, objArr, true);
    }

    public final void a(AdData adData, BiddingDataCallback biddingDataCallback) {
        JSONObject jSONObject = null;
        g(1020, (Object[][]) null, false);
        if (adData != null) {
            jSONObject = com.ironsource.mediationsdk.d.c.a(adData.getAdUnitData());
        }
        try {
            this.f3985a.collectRewardedVideoBiddingData(this.f3988d, jSONObject, biddingDataCallback);
        } catch (Throwable th) {
            b("collectBiddingData exception: " + th.getLocalizedMessage(), 3);
            th.printStackTrace();
        }
    }

    public final void a(Placement placement) {
        w();
        b("showVideo()", 0);
        this.f3825n = placement;
        t(a.SHOW_IN_PROGRESS);
        a((int) IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f3985a.showRewardedVideo(this.f3988d, this);
        } catch (Throwable th) {
            b("showVideo exception: " + th.getLocalizedMessage(), 3);
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        a aVar;
        a aVar2;
        int i10;
        b("loadVideo() auctionId: " + this.f3827p + " state: " + this.f3820h, 0);
        this.f3991g = null;
        this.f3987c = false;
        synchronized (this.f3831t) {
            aVar = this.f3820h;
            aVar2 = a.LOAD_IN_PROGRESS;
            if (!(aVar == aVar2 || aVar == a.SHOW_IN_PROGRESS)) {
                t(aVar2);
            }
        }
        if (aVar == aVar2) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
        } else if (aVar == a.SHOW_IN_PROGRESS) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
        } else {
            synchronized (this.u) {
                Timer timer = new Timer();
                this.f3822j = timer;
                timer.schedule(new b(), (long) (this.k * 1000));
            }
            this.f3826o = v0.b();
            a(1001);
            try {
                if (h()) {
                    this.f3985a.loadRewardedVideoForBidding(this.f3988d, jSONObject, str, this);
                    return;
                }
                v();
                this.f3985a.initAndLoadRewardedVideo(this.f3823l, this.f3824m, this.f3988d, jSONObject, this);
            } catch (Throwable th) {
                b("loadVideo exception: " + th.getLocalizedMessage(), 3);
                th.printStackTrace();
                if (h()) {
                    i10 = IronSourceConstants.errorCode_loadException;
                } else {
                    i10 = IronSourceConstants.errorCode_initFailed;
                }
                b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    public final void a(boolean z9) {
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_STATUS;
        objArr2[1] = z9 ? "true" : "false";
        objArr[0] = objArr2;
        g(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    public final boolean a() {
        if (this.f3820h != a.LOADED) {
            return false;
        }
        try {
            return this.f3985a.isRewardedVideoAvailable(this.f3988d);
        } catch (Throwable th) {
            b("isReadyToShow exception: " + th.getLocalizedMessage(), 3);
            th.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return false;
        }
    }

    public final LoadWhileShowSupportState b() {
        try {
            return this.f3985a.getLoadWhileShowSupportState(this.f3988d);
        } catch (Throwable th) {
            b("Exception while calling adapter.getLoadWhileShowSupportState() - " + th.getLocalizedMessage(), 3);
            return LoadWhileShowSupportState.NONE;
        }
    }

    public final void b(int i10, Object[][] objArr) {
        g(i10, objArr, false);
    }

    public final int c() {
        return 2;
    }

    public final IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    public final String e() {
        return "LWSProgRvSmash";
    }

    public final void g(int i10, Object[][] objArr, boolean z9) {
        Placement placement;
        Map<String, Object> q10 = q();
        if (!TextUtils.isEmpty(this.f3827p)) {
            q10.put("auctionId", this.f3827p);
        }
        JSONObject jSONObject = this.f3828q;
        if (jSONObject != null && jSONObject.length() > 0) {
            q10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f3828q);
        }
        if (z9 && (placement = this.f3825n) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            q10.put("placement", this.f3825n.getPlacementName());
        }
        if (u(i10)) {
            i.d();
            com.ironsource.mediationsdk.events.b.a(q10, this.f3829r, this.f3830s);
        }
        q10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f3990f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    q10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, n() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        i.d().a(new com.ironsource.environment.c.a(i10, new JSONObject(q10)));
        if (i10 == 1203) {
            this.w.b(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
    }

    public final void onRewardedVideoAdClicked() {
        b("onRewardedVideoAdClicked", 0);
        this.f3821i.b(this, this.f3825n);
        a(1006, (Object[][]) null);
    }

    public final void onRewardedVideoAdClosed() {
        b("onRewardedVideoAdClosed", 0);
        synchronized (this.f3831t) {
            if (this.f3820h != a.SHOW_IN_PROGRESS) {
                a((int) IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)};
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "adClosed: " + this.f3820h}});
                return;
            }
            t(a.ENDED);
            this.f3832v = v0.b();
            this.f3821i.d(this);
        }
    }

    public final void onRewardedVideoAdEnded() {
        b("onRewardedVideoAdEnded", 0);
        this.f3821i.f(this);
        a((int) IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    public final void onRewardedVideoAdOpened() {
        b("onRewardedVideoAdOpened", 0);
        this.f3821i.c(this);
        a(1005, (Object[][]) null);
    }

    public final void onRewardedVideoAdRewarded() {
        b("onRewardedVideoAdRewarded", 0);
        long time = new Date().getTime();
        this.f3821i.a(this, this.f3825n);
        Map<String, Object> q10 = q();
        Placement placement = this.f3825n;
        if (placement != null) {
            q10.put("placement", placement.getPlacementName());
            q10.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f3825n.getRewardName());
            q10.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f3825n.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(z.a().f5059i)) {
            q10.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, z.a().f5059i);
        }
        if (z.a().f5061j != null) {
            for (String next : z.a().f5061j.keySet()) {
                q10.put(com.ironsource.adapters.ironsource.a.j("custom_", next), z.a().f5061j.get(next));
            }
        }
        if (!TextUtils.isEmpty(this.f3827p)) {
            q10.put("auctionId", this.f3827p);
        }
        JSONObject jSONObject = this.f3828q;
        if (jSONObject != null && jSONObject.length() > 0) {
            q10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f3828q);
        }
        if (u(1010)) {
            i.d();
            com.ironsource.mediationsdk.events.b.a(q10, this.f3829r, this.f3830s);
        }
        q10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f3990f));
        com.ironsource.environment.c.a aVar = new com.ironsource.environment.c.a(1010, new JSONObject(q10));
        aVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(aVar.b(), n()));
        long j10 = this.f3832v;
        if (j10 != 0) {
            long j11 = time - j10;
            b("onRewardedVideoAdRewarded timeAfterClosed=" + j11, 0);
            aVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j11));
        }
        i.d().a(aVar);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        b("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage(), 0);
        a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f3831t) {
            if (this.f3820h != a.SHOW_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)};
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f3820h}});
                return;
            }
            t(a.ENDED);
            this.f3821i.a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        b("onRewardedVideoAdStarted", 0);
        this.f3821i.e(this);
        a((int) IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    public final void onRewardedVideoAdVisible() {
        b("onRewardedVideoAdVisible", 0);
        a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z9) {
        boolean z10;
        b("onRewardedVideoAvailabilityChanged available=" + z9 + " state=" + this.f3820h.name(), 0);
        synchronized (this.f3831t) {
            if (this.f3820h == a.LOAD_IN_PROGRESS) {
                t(z9 ? a.LOADED : a.NOT_LOADED);
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (!z10) {
            w();
            b(z9 ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(x())}});
            if (z9) {
                this.f3821i.a(this);
            } else {
                this.f3821i.b(this);
            }
        } else if (z9) {
            b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f3820h.name()}});
        } else {
            b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(x())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f3820h.name()}});
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        b("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage(), 0);
        w();
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(x())}});
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(x())}});
        synchronized (this.f3831t) {
            if (this.f3820h != a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)};
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f3820h}});
                return;
            }
            t(a.NO_INIT);
            this.f3821i.b(this);
        }
    }

    public final void onRewardedVideoInitSuccess() {
        b("onRewardedVideoInitSuccess", 0);
        synchronized (this.f3831t) {
            if (this.f3820h != a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)};
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f3820h}});
                return;
            }
            t(a.NOT_LOADED);
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            g(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(x())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f3991g = Long.valueOf(System.currentTimeMillis());
        }
        g(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(x())}}, false);
    }

    public final void onRewardedVideoLoadSuccess() {
    }

    public final void t(a aVar) {
        b("current state=" + this.f3820h + ", new state=" + aVar, 0);
        synchronized (this.f3831t) {
            this.f3820h = aVar;
        }
    }

    public final void v() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f3985a.setPluginData(pluginType);
            }
        } catch (Throwable th) {
            b("setCustomParams() " + th.getMessage(), 0);
        }
    }

    public final void w() {
        synchronized (this.u) {
            Timer timer = this.f3822j;
            if (timer != null) {
                timer.cancel();
                this.f3822j = null;
            }
        }
    }

    public final long x() {
        return v0.b() - this.f3826o;
    }
}
