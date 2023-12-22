package b3;

import androidx.activity.f;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import java.util.logging.Logger;
import w2.n;
import w2.s;
import w2.u;
import x2.m;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2249a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2250b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2251c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f2252d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f2253e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2249a = i10;
        this.f2250b = obj;
        this.f2251c = obj2;
        this.f2252d = obj3;
        this.f2253e = obj4;
    }

    public final void run() {
        switch (this.f2249a) {
            case 0:
                c cVar = (c) this.f2250b;
                s sVar = (s) this.f2251c;
                u uVar = (u) this.f2252d;
                n nVar = (n) this.f2253e;
                cVar.getClass();
                try {
                    m a10 = cVar.f2260c.a(sVar.b());
                    if (a10 == null) {
                        String format = String.format("Transport backend '%s' is not registered", new Object[]{sVar.b()});
                        c.f2257f.warning(format);
                        new IllegalArgumentException(format);
                    } else {
                        cVar.f2262e.c(new b(cVar, sVar, a10.b(nVar)));
                    }
                    uVar.getClass();
                    return;
                } catch (Exception e10) {
                    Logger logger = c.f2257f;
                    StringBuilder g10 = f.g("Error scheduling event ");
                    g10.append(e10.getMessage());
                    logger.warning(g10.toString());
                    uVar.getClass();
                    return;
                }
            default:
                LevelPlayNativeAd levelPlayNativeAd = (LevelPlayNativeAd) this.f2250b;
                AdapterNativeAdData adapterNativeAdData = (AdapterNativeAdData) this.f2251c;
                AdapterNativeAdViewBinder adapterNativeAdViewBinder = (AdapterNativeAdViewBinder) this.f2252d;
                AdInfo adInfo = (AdInfo) this.f2253e;
                x8.f.f(levelPlayNativeAd, "this$0");
                x8.f.f(adapterNativeAdData, "$adapterNativeAdData");
                x8.f.f(adapterNativeAdViewBinder, "$nativeAdViewBinder");
                levelPlayNativeAd.f4097e = adapterNativeAdData;
                levelPlayNativeAd.f4098f = adapterNativeAdViewBinder;
                LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.f4095c;
                if (levelPlayNativeAdListener != null) {
                    levelPlayNativeAdListener.onAdLoaded(levelPlayNativeAd, adInfo);
                    return;
                }
                return;
        }
    }
}
