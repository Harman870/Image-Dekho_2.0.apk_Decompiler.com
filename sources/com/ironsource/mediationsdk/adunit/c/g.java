package com.ironsource.mediationsdk.adunit.c;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.b.b;
import com.ironsource.mediationsdk.adunit.b.h;
import com.ironsource.mediationsdk.adunit.c.d;
import com.ironsource.mediationsdk.adunit.c.d.e;
import com.ironsource.mediationsdk.adunit.d.a;
import com.ironsource.mediationsdk.adunit.d.d;
import com.ironsource.mediationsdk.d.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.i;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.j;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import x8.f;

public final class g extends d<d, AdapterAdListener> {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f4252a = UUID.randomUUID();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(List<? extends NetworkSettings> list, i iVar, String str, c cVar, IronSourceSegment ironSourceSegment, boolean z9) {
        super(new com.ironsource.mediationsdk.adunit.c.a.d(str, list, iVar), cVar, ironSourceSegment, z9);
        f.f(iVar, "configs");
        f.f(cVar, "publisherDataHolder");
    }

    public final /* synthetic */ com.ironsource.mediationsdk.adunit.d.a.c a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i10, String str) {
        f.f(networkSettings, "providerSettings");
        f.f(str, "currentAuctionId");
        return new d(new a(IronSource.AD_UNIT.NATIVE_AD, this.f4231q.b(), i10, this.f4224i, str, this.f4222g, this.f4223h, networkSettings, this.f4231q.f4182c), baseAdAdapter, this.k, this);
    }

    public final Map<String, Object> a(b bVar) {
        f.f(bVar, "event");
        Map<String, Object> a10 = super.a(bVar);
        Placement placement = this.k;
        if (placement != null) {
            f.e(a10, "data");
            a10.put("placement", placement.getPlacementName());
        }
        UUID uuid = this.f4252a;
        if (uuid != null) {
            f.e(a10, "data");
            a10.put(IronSourceConstants.EVENTS_OBJECT_ID, uuid);
        }
        f.e(a10, "data");
        return a10;
    }

    public final void a(InternalNativeAdListener internalNativeAdListener) {
        f.f(internalNativeAdListener, "nativeAdListener");
        this.f4235v = new e(internalNativeAdListener);
    }

    public final void a(Placement placement) {
        String str;
        int i10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placement = " + placement);
        if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            Object[] objArr = new Object[1];
            objArr[0] = placement == null ? "placement is null" : "placement name is empty";
            str = String.format("can't load native ad - %s", Arrays.copyOf(objArr, 1));
            f.e(str, "format(format, *args)");
            i10 = com.ironsource.mediationsdk.adunit.a.a.b(this.f4231q.f4180a);
        } else if (j.a(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.f4231q.f4180a)) {
            str = String.format("placement %s is capped", Arrays.copyOf(new Object[]{placement.getPlacementName()}, 1));
            f.e(str, "format(format, *args)");
            i10 = com.ironsource.mediationsdk.adunit.a.a.f(this.f4231q.f4180a);
        } else {
            str = null;
            i10 = IronSourceError.ERROR_CODE_GENERIC;
        }
        if (!TextUtils.isEmpty(str)) {
            IronLog.API.error(b(str));
            f(i10, str, false);
            return;
        }
        this.k = placement;
        i();
    }

    public final JSONObject e(NetworkSettings networkSettings) {
        JSONObject nativeAdSettings = networkSettings.getNativeAdSettings();
        f.e(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    public final void h() {
        com.ironsource.mediationsdk.adunit.b.j jVar;
        h hVar;
        IronLog.INTERNAL.verbose();
        try {
            d dVar = (d) this.f4217b.f4291c;
            if (dVar != null) {
                Integer t10 = dVar.t();
                int a10 = t10 == null ? this.C.a(this.f4231q.f4180a) : t10.intValue();
                com.ironsource.mediationsdk.adunit.b.d dVar2 = this.u;
                if (!(dVar2 == null || (hVar = dVar2.f4159c) == null)) {
                    hVar.a(a10);
                }
                dVar.c();
                this.f4217b.a((com.ironsource.mediationsdk.adunit.d.a.c<?>) null);
            }
            this.k = null;
            h(d.a.NONE);
        } catch (Throwable th) {
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(b(str));
            com.ironsource.mediationsdk.adunit.b.d dVar3 = this.u;
            if (dVar3 != null && (jVar = dVar3.f4163g) != null) {
                jVar.n(str);
            }
        }
    }

    public final void i(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar, AdInfo adInfo) {
        if (cVar instanceof com.ironsource.mediationsdk.adunit.d.d) {
            com.ironsource.mediationsdk.adunit.d.d dVar = (com.ironsource.mediationsdk.adunit.d.d) cVar;
            this.f4235v.a(dVar.f4286a, dVar.f4287b, adInfo);
        }
    }

    public final void j(IronSourceError ironSourceError, boolean z9) {
        this.f4235v.a(ironSourceError);
    }

    public final com.ironsource.mediationsdk.adunit.c.d.a n() {
        return new com.ironsource.mediationsdk.adunit.c.d.c();
    }

    public final boolean p() {
        return false;
    }

    public final String s() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    public final String u() {
        return "NA";
    }

    public final void w() {
    }
}
