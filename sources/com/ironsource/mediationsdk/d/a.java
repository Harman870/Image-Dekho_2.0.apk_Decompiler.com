package com.ironsource.mediationsdk.d;

import com.ironsource.environment.c.a;
import com.ironsource.mediationsdk.IronSource;
import o8.d;
import x8.f;

public final class a {

    /* renamed from: com.ironsource.mediationsdk.d.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0050a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4374a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            iArr[IronSource.AD_UNIT.OFFERWALL.ordinal()] = 4;
            iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 5;
            f4374a = iArr;
        }
    }

    static {
        new a();
    }

    private a() {
    }

    public static final a.C0041a a(IronSource.AD_UNIT ad_unit) {
        f.f(ad_unit, "adUnit");
        int i10 = C0050a.f4374a[ad_unit.ordinal()];
        if (i10 == 1) {
            return a.C0041a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return a.C0041a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return a.C0041a.BANNER;
        }
        if (i10 == 4) {
            return a.C0041a.OFFERWALL;
        }
        if (i10 == 5) {
            return a.C0041a.NATIVE_AD;
        }
        throw new d();
    }
}
