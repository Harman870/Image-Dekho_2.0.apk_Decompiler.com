package com.ironsource.mediationsdk.adunit.c.a;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.d;
import java.util.List;
import x8.f;

public final class b extends a {

    /* renamed from: o  reason: collision with root package name */
    public final String f4194o;

    /* renamed from: p  reason: collision with root package name */
    public final List<NetworkSettings> f4195p;

    /* renamed from: q  reason: collision with root package name */
    public final d f4196q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(java.lang.String r27, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> r28, com.ironsource.mediationsdk.model.d r29) {
        /*
            r26 = this;
            r15 = r26
            r14 = r29
            java.lang.String r0 = "configs"
            x8.f.f(r14, r0)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER
            com.ironsource.mediationsdk.utils.c r4 = r14.f4720i
            java.lang.String r0 = "configs.bannerAuctionSettings"
            x8.f.e(r4, r0)
            int r5 = r14.f4713b
            long r2 = r14.f4714c
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            int r8 = (int) r2
            boolean r9 = r14.f4715d
            int r10 = r14.f4719h
            com.ironsource.mediationsdk.adunit.c.c.a r11 = new com.ironsource.mediationsdk.adunit.c.c.a
            com.ironsource.mediationsdk.adunit.c.c.a$a r17 = com.ironsource.mediationsdk.adunit.c.c.a.C0048a.MANUAL_WITH_AUTOMATIC_RELOAD
            com.ironsource.mediationsdk.utils.c r0 = r14.f4720i
            long r2 = r0.f4983i
            long r12 = r0.f4982h
            int r0 = r14.f4718g
            r24 = r9
            r25 = r10
            long r9 = (long) r0
            long r22 = r9 * r6
            r16 = r11
            r18 = r2
            r20 = r12
            r16.<init>(r17, r18, r20, r22)
            boolean r12 = r14.k
            long r9 = r14.f4722l
            boolean r13 = r14.f4723m
            boolean r7 = r14.f4724n
            r16 = -1
            r0 = r26
            r2 = r27
            r3 = r28
            r6 = r8
            r17 = r7
            r7 = r24
            r8 = r25
            r18 = r9
            r9 = r16
            r10 = r11
            r11 = r12
            r16 = r13
            r12 = r18
            r14 = r16
            r15 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15)
            r1 = r27
            r0.f4194o = r1
            r1 = r28
            r0.f4195p = r1
            r1 = r29
            r0.f4196q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.a.b.<init>(java.lang.String, java.util.List, com.ironsource.mediationsdk.model.d):void");
    }

    public final String b() {
        return this.f4194o;
    }

    public final List<NetworkSettings> c() {
        return this.f4195p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.a(this.f4194o, bVar.f4194o) && f.a(this.f4195p, bVar.f4195p) && f.a(this.f4196q, bVar.f4196q);
    }

    public final int hashCode() {
        String str = this.f4194o;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f4195p;
        if (list != null) {
            i10 = list.hashCode();
        }
        return this.f4196q.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        return "BannerAdManagerData(userId=" + this.f4194o + ", providerList=" + this.f4195p + ", configs=" + this.f4196q + ')';
    }
}
