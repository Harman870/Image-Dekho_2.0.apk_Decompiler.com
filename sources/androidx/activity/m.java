package androidx.activity;

import android.text.TextUtils;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.timepicker.c;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.c.g;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.i;
import com.ironsource.mediationsdk.model.j;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.z;
import java.util.concurrent.Callable;
import o8.h;
import v6.e;
import x8.f;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f281a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f282b;

    public /* synthetic */ m(int i10, Object obj) {
        this.f281a = i10;
        this.f282b = obj;
    }

    public final void run() {
        LevelPlayNativeAdListener levelPlayNativeAdListener;
        j jVar;
        switch (this.f281a) {
            case 0:
                ((OnBackPressedDispatcher) this.f282b).b();
                return;
            case 1:
                ((Toolbar) this.f282b).l();
                return;
            case 2:
                ((c) this.f282b).k();
                return;
            case 3:
                Object obj = e.f12626m;
                ((e) this.f282b).b(false);
                return;
            case 4:
                LevelPlayNativeAd levelPlayNativeAd = (LevelPlayNativeAd) this.f282b;
                f.f(levelPlayNativeAd, "this$0");
                h hVar = null;
                if (levelPlayNativeAd.f4099g.compareAndSet(false, true)) {
                    g b10 = z.a().b();
                    levelPlayNativeAd.f4096d = b10;
                    if (b10 != null) {
                        b10.a((InternalNativeAdListener) levelPlayNativeAd);
                        z a10 = z.a();
                        String str = levelPlayNativeAd.f4093a;
                        i iVar = a10.f5053f.f5019c.f4725a;
                        if (iVar == null) {
                            jVar = null;
                        } else if (TextUtils.isEmpty(str) || (jVar = iVar.a(str)) == null) {
                            jVar = iVar.b();
                        }
                        f.e(jVar, "getInstance().getNativeAdPlacement(mPlacementName)");
                        levelPlayNativeAd.f4094b = new Placement(jVar);
                    }
                }
                g gVar = levelPlayNativeAd.f4096d;
                if (gVar != null) {
                    gVar.a(levelPlayNativeAd.f4094b);
                    hVar = h.f10610a;
                }
                if (hVar == null && (levelPlayNativeAdListener = levelPlayNativeAd.f4095c) != null) {
                    levelPlayNativeAdListener.onAdLoadFailed(levelPlayNativeAd, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
                    return;
                }
                return;
            default:
                try {
                    ((Callable) this.f282b).call();
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
        }
    }
}
