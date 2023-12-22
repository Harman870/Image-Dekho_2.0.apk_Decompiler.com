package com.ironsource.mediationsdk.adunit.c.a;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.h;
import java.util.List;
import x8.f;

public final class c extends a {

    /* renamed from: o  reason: collision with root package name */
    public final String f4197o;

    /* renamed from: p  reason: collision with root package name */
    public final List<NetworkSettings> f4198p;

    /* renamed from: q  reason: collision with root package name */
    public final h f4199q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.lang.String r25, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> r26, com.ironsource.mediationsdk.model.h r27) {
        /*
            r24 = this;
            r15 = r24
            r14 = r27
            java.lang.String r0 = "configs"
            x8.f.f(r14, r0)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL
            com.ironsource.mediationsdk.utils.c r4 = r14.f4747g
            java.lang.String r0 = "configs.interstitialAuctionSettings"
            x8.f.e(r4, r0)
            int r5 = r14.f4743c
            int r6 = r14.f4745e
            boolean r7 = r14.f4744d
            int r8 = r14.f4746f
            com.ironsource.mediationsdk.adunit.c.c.a r10 = new com.ironsource.mediationsdk.adunit.c.c.a
            com.ironsource.mediationsdk.adunit.c.c.a$a r17 = com.ironsource.mediationsdk.adunit.c.c.a.C0048a.MANUAL
            com.ironsource.mediationsdk.utils.c r0 = r14.f4747g
            long r2 = r0.f4983i
            long r11 = r0.f4982h
            r22 = -1
            r16 = r10
            r18 = r2
            r20 = r11
            r16.<init>(r17, r18, r20, r22)
            boolean r11 = r14.f4749i
            long r12 = r14.f4750j
            boolean r9 = r14.k
            boolean r3 = r14.f4751l
            r16 = -1
            r0 = r24
            r2 = r25
            r17 = r3
            r3 = r26
            r18 = r9
            r9 = r16
            r14 = r18
            r15 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15)
            r1 = r25
            r0.f4197o = r1
            r1 = r26
            r0.f4198p = r1
            r1 = r27
            r0.f4199q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.a.c.<init>(java.lang.String, java.util.List, com.ironsource.mediationsdk.model.h):void");
    }

    public final String b() {
        return this.f4197o;
    }

    public final List<NetworkSettings> c() {
        return this.f4198p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.a(this.f4197o, cVar.f4197o) && f.a(this.f4198p, cVar.f4198p) && f.a(this.f4199q, cVar.f4199q);
    }

    public final int hashCode() {
        String str = this.f4197o;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f4198p;
        if (list != null) {
            i10 = list.hashCode();
        }
        return this.f4199q.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        return "InterstitialAdManagerData(userId=" + this.f4197o + ", providerList=" + this.f4198p + ", configs=" + this.f4199q + ')';
    }
}
