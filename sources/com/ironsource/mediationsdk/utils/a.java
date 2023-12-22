package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4965a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4966b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4967c = false;

    public final void a(IronSource.AD_UNIT ad_unit, boolean z9) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f4965a = z9;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f4966b = z9;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f4967c = z9;
        }
    }

    public final boolean a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f4965a;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f4966b;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f4967c;
        }
        return false;
    }
}
