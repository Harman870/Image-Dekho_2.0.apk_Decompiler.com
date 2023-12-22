package com.ironsource.mediationsdk.adunit.c.a;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.q;
import java.util.List;
import x8.f;

public final class e extends a {

    /* renamed from: o  reason: collision with root package name */
    public final String f4203o;

    /* renamed from: p  reason: collision with root package name */
    public final List<NetworkSettings> f4204p;

    /* renamed from: q  reason: collision with root package name */
    public final q f4205q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f4206r;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(java.lang.String r25, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> r26, com.ironsource.mediationsdk.model.q r27, boolean r28) {
        /*
            r24 = this;
            r15 = r24
            r14 = r27
            r12 = r28
            java.lang.String r0 = "configs"
            x8.f.f(r14, r0)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            com.ironsource.mediationsdk.utils.c r4 = r14.f4801m
            java.lang.String r0 = "configs.rewardedVideoAuctionSettings"
            x8.f.e(r4, r0)
            int r5 = r14.f4792c
            int r6 = r14.f4794e
            boolean r7 = r14.f4793d
            int r8 = r14.f4796g
            int r9 = r14.f4795f
            if (r12 == 0) goto L_0x0025
            com.ironsource.mediationsdk.adunit.c.c.a$a r0 = com.ironsource.mediationsdk.adunit.c.c.a.C0048a.MANUAL
        L_0x0022:
            r17 = r0
            goto L_0x0031
        L_0x0025:
            com.ironsource.mediationsdk.utils.c r0 = r14.f4801m
            boolean r0 = r0.f4984j
            if (r0 == 0) goto L_0x002e
            com.ironsource.mediationsdk.adunit.c.c.a$a r0 = com.ironsource.mediationsdk.adunit.c.c.a.C0048a.AUTOMATIC_LOAD_WHILE_SHOW
            goto L_0x0022
        L_0x002e:
            com.ironsource.mediationsdk.adunit.c.c.a$a r0 = com.ironsource.mediationsdk.adunit.c.c.a.C0048a.AUTOMATIC_LOAD_AFTER_CLOSE
            goto L_0x0022
        L_0x0031:
            com.ironsource.mediationsdk.adunit.c.c.a r10 = new com.ironsource.mediationsdk.adunit.c.c.a
            com.ironsource.mediationsdk.utils.c r0 = r14.f4801m
            long r2 = r0.f4983i
            long r11 = r0.f4982h
            r22 = -1
            r16 = r10
            r18 = r2
            r20 = r11
            r16.<init>(r17, r18, r20, r22)
            boolean r11 = r14.f4797h
            long r12 = r14.f4798i
            boolean r3 = r14.f4799j
            boolean r2 = r14.k
            r0 = r24
            r16 = r2
            r2 = r25
            r17 = r3
            r3 = r26
            r14 = r17
            r15 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15)
            r1 = r25
            r0.f4203o = r1
            r1 = r26
            r0.f4204p = r1
            r1 = r27
            r0.f4205q = r1
            r1 = r28
            r0.f4206r = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.a.e.<init>(java.lang.String, java.util.List, com.ironsource.mediationsdk.model.q, boolean):void");
    }

    public final String b() {
        return this.f4203o;
    }

    public final List<NetworkSettings> c() {
        return this.f4204p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f.a(this.f4203o, eVar.f4203o) && f.a(this.f4204p, eVar.f4204p) && f.a(this.f4205q, eVar.f4205q) && this.f4206r == eVar.f4206r;
    }

    public final int hashCode() {
        String str = this.f4203o;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f4204p;
        if (list != null) {
            i10 = list.hashCode();
        }
        int hashCode2 = (this.f4205q.hashCode() + ((hashCode + i10) * 31)) * 31;
        boolean z9 = this.f4206r;
        if (z9) {
            z9 = true;
        }
        return hashCode2 + (z9 ? 1 : 0);
    }

    public final String toString() {
        return "RewardedVideoAdDataManager(userId=" + this.f4203o + ", providerList=" + this.f4204p + ", configs=" + this.f4205q + ", isManual=" + this.f4206r + ')';
    }
}
