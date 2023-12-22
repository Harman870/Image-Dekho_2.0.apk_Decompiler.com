package com.ironsource.mediationsdk.adunit.c.a;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.i;
import java.util.List;
import x8.f;

public final class d extends a {

    /* renamed from: o  reason: collision with root package name */
    public final String f4200o;

    /* renamed from: p  reason: collision with root package name */
    public final List<NetworkSettings> f4201p;

    /* renamed from: q  reason: collision with root package name */
    public final i f4202q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(java.lang.String r25, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> r26, com.ironsource.mediationsdk.model.i r27) {
        /*
            r24 = this;
            r15 = r24
            r14 = r27
            java.lang.String r0 = "configs"
            x8.f.f(r14, r0)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD
            com.ironsource.mediationsdk.utils.c r4 = r14.f4757e
            int r5 = r14.f4753a
            long r2 = r14.f4754b
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            int r6 = (int) r2
            boolean r7 = r14.f4755c
            int r8 = r14.f4756d
            com.ironsource.mediationsdk.adunit.c.c.a r10 = new com.ironsource.mediationsdk.adunit.c.c.a
            com.ironsource.mediationsdk.adunit.c.c.a$a r17 = com.ironsource.mediationsdk.adunit.c.c.a.C0048a.MANUAL
            long r2 = r4.f4983i
            long r11 = r4.f4982h
            r22 = -1
            r16 = r10
            r18 = r2
            r20 = r11
            r16.<init>(r17, r18, r20, r22)
            boolean r11 = r14.f4758f
            long r12 = r14.f4759g
            boolean r9 = r14.f4760h
            boolean r3 = r14.f4761i
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
            r0.f4200o = r1
            r1 = r26
            r0.f4201p = r1
            r1 = r27
            r0.f4202q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.a.d.<init>(java.lang.String, java.util.List, com.ironsource.mediationsdk.model.i):void");
    }

    public final String b() {
        return this.f4200o;
    }

    public final List<NetworkSettings> c() {
        return this.f4201p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.a(this.f4200o, dVar.f4200o) && f.a(this.f4201p, dVar.f4201p) && f.a(this.f4202q, dVar.f4202q);
    }

    public final int hashCode() {
        String str = this.f4200o;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f4201p;
        if (list != null) {
            i10 = list.hashCode();
        }
        return this.f4202q.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        return "NativeAdManagerData(userId=" + this.f4200o + ", providerList=" + this.f4201p + ", configs=" + this.f4202q + ')';
    }
}
