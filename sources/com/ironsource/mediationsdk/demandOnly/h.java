package com.ironsource.mediationsdk.demandOnly;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.v0;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.C0182e;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.r;
import com.ironsource.mediationsdk.events.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.q;
import com.ironsource.mediationsdk.sdk.b;
import com.ironsource.mediationsdk.services.MediationServices;
import com.ironsource.mediationsdk.services.a;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.c;
import com.ironsource.mediationsdk.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, i> f4427a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final a f4428b = MediationServices.getProvider().getSessionDepthService();

    /* renamed from: c  reason: collision with root package name */
    public final a.C0056a f4429c = MediationServices.getEditor().getSessionDepthServiceEditor();

    public h(List<NetworkSettings> list, q qVar, String str, String str2) {
        c cVar = qVar.f4801m;
        for (NetworkSettings next : list) {
            if (next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a10 = C0180c.a().a(next, next.getRewardedVideoSettings(), true, false);
                if (a10 != null) {
                    this.f4427a.put(next.getSubProviderId(), new i(str, str2, next, this, (long) (qVar.f4794e * 1000), a10));
                }
            } else {
                c("cannot load " + next.getProviderTypeForReflection());
            }
        }
    }

    public static void a(int i10, i iVar, Object[][] objArr) {
        Map<String, Object> b10 = iVar.b();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    b10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "RV sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        i.d().a(new com.ironsource.environment.c.a(i10, new JSONObject(b10)));
    }

    public static void a(int i10, String str) {
        HashMap c10 = v0.c(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        c10.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        c10.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str);
        i.d().a(new com.ironsource.environment.c.a(IronSourceConstants.RV_INSTANCE_NOT_FOUND, new JSONObject(c10)));
    }

    public static void b(i iVar, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRvManager " + iVar.e() + " : " + str, 0);
    }

    public static void c(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "DemandOnlyRvManager " + str, 0);
    }

    public void a(int i10, i iVar) {
        a(i10, iVar, (Object[][]) null);
    }

    public final void a(i iVar) {
        b(iVar, "onRewardedVideoAdOpened");
        a(1005, iVar, (Object[][]) null);
        r a10 = r.a();
        String g10 = iVar.g();
        if (a10.f4474a != null) {
            new Handler(Looper.getMainLooper()).post(new r.c(g10));
        }
        if (iVar.k()) {
            for (String a11 : iVar.f4441i) {
                C0182e.a();
                String a12 = C0182e.a(a11, iVar.e(), iVar.f(), iVar.f4442j, "", "", "", "");
                C0182e.a();
                C0182e.a("onRewardedVideoAdOpened", iVar.e(), a12);
            }
        }
    }

    public final void a(i iVar, long j10) {
        b(iVar, "onRewardedVideoLoadSuccess");
        a(1002, iVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        r a10 = r.a();
        String g10 = iVar.g();
        if (a10.f4474a != null) {
            new Handler(Looper.getMainLooper()).post(new r.a(g10));
        }
    }

    public final void a(IronSourceError ironSourceError, i iVar) {
        b(iVar, "onRewardedVideoAdShowFailed error=" + ironSourceError);
        a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, iVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        r.a().b(iVar.g(), ironSourceError);
    }

    public final void a(IronSourceError ironSourceError, i iVar, long j10) {
        b(iVar, "onRewardedVideoAdLoadFailed error=" + ironSourceError);
        a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, iVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        if (ironSourceError.getErrorCode() == 1058) {
            a((int) IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, iVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        } else {
            a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, iVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        }
        r.a().a(iVar.g(), ironSourceError);
    }

    public final void a(String str, String str2, boolean z9) {
        IronSourceError buildLoadFailedError;
        r a10;
        try {
            if (!this.f4427a.containsKey(str)) {
                a((int) IronSourceConstants.RV_INSTANCE_NOT_FOUND, str);
                r.a().a(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            i iVar = this.f4427a.get(str);
            if (z9) {
                if (!iVar.k()) {
                    buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm in IAB flow must be called by bidder instances");
                    c(buildLoadFailedError.getErrorMessage());
                    a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, iVar, (Object[][]) null);
                    a10 = r.a();
                } else {
                    C0182e.a();
                    JSONObject a11 = C0182e.a(str2);
                    C0182e.a();
                    C0182e.a a12 = C0182e.a(a11);
                    C0182e.a();
                    com.ironsource.mediationsdk.adunit.a.a a13 = C0182e.a(iVar.e(), a12.f4494b);
                    if (a13 != null) {
                        iVar.a(a13.b());
                        iVar.b(a12.f4493a);
                        iVar.a(a12.f4496d);
                        a(1001, iVar, (Object[][]) null);
                        iVar.a(a13.b(), a12.f4493a, a12.f4496d, a13.g());
                        return;
                    }
                    buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                    c(buildLoadFailedError.getErrorMessage());
                    a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, iVar, (Object[][]) null);
                    a10 = r.a();
                }
                a10.a(str, buildLoadFailedError);
            } else if (!iVar.k()) {
                a(1001, iVar, (Object[][]) null);
                iVar.a("", "", (JSONObject) null, (List<String>) null);
            } else {
                IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm in non IAB flow must be called by non bidder instances");
                c(buildLoadFailedError2.getErrorMessage());
                a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, iVar, (Object[][]) null);
                r.a().a(str, buildLoadFailedError2);
            }
        } catch (Exception e10) {
            c("loadRewardedVideoWithAdm exception " + e10.getMessage());
            r.a().a(str, ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm exception"));
        }
    }

    public final void b(i iVar) {
        b(iVar, "onRewardedVideoAdClosed");
        a aVar = this.f4428b;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        a((int) IronSourceConstants.RV_INSTANCE_CLOSED, iVar, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aVar.a(ad_unit))}});
        this.f4429c.b(ad_unit);
        r a10 = r.a();
        String g10 = iVar.g();
        if (a10.f4474a != null) {
            new Handler(Looper.getMainLooper()).post(new r.d(g10));
        }
    }

    public final void c(i iVar) {
        b(iVar, "onRewardedVideoAdClicked");
        a(1006, iVar, (Object[][]) null);
        r a10 = r.a();
        String g10 = iVar.g();
        if (a10.f4474a != null) {
            new Handler(Looper.getMainLooper()).post(new r.f(g10));
        }
    }

    public final void d(i iVar) {
        b(iVar, "onRewardedVideoAdVisible");
        a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, iVar, (Object[][]) null);
    }

    public final void e(i iVar) {
        b(iVar, "onRewardedVideoAdRewarded");
        Map<String, Object> b10 = iVar.b();
        if (!TextUtils.isEmpty(z.a().f5059i)) {
            b10.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, z.a().f5059i);
        }
        if (z.a().f5061j != null) {
            for (String next : z.a().f5061j.keySet()) {
                b10.put(com.ironsource.adapters.ironsource.a.j("custom_", next), z.a().f5061j.get(next));
            }
        }
        Placement a10 = z.a().f5053f.f5019c.a().a();
        if (a10 != null) {
            b10.put("placement", a10.getPlacementName());
            b10.put(IronSourceConstants.EVENTS_REWARD_NAME, a10.getRewardName());
            b10.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(a10.getRewardAmount()));
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "defaultPlacement is null", 3);
        }
        com.ironsource.environment.c.a aVar = new com.ironsource.environment.c.a(1010, new JSONObject(b10));
        aVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(aVar.b(), iVar.e()));
        i.d().a(aVar);
        r a11 = r.a();
        String g10 = iVar.g();
        if (a11.f4474a != null) {
            new Handler(Looper.getMainLooper()).post(new r.g(g10));
        }
    }
}
