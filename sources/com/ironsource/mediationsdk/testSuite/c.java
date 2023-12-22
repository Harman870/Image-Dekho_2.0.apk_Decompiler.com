package com.ironsource.mediationsdk.testSuite;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import x8.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4900a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4901b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f4902c;

    public c(String str, boolean z9, Boolean bool) {
        this.f4900a = str;
        this.f4901b = z9;
        this.f4902c = bool;
    }

    public final boolean a() {
        return f.a(this.f4902c, Boolean.TRUE);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        f.f(networkSettings, "networkSettings");
        f.f(ad_unit, "adUnit");
        String str = this.f4900a;
        if (str == null || str.length() == 0) {
            return true;
        }
        return f.a(d.a(networkSettings), this.f4900a) && d.a(networkSettings, ad_unit) == this.f4901b;
    }
}
