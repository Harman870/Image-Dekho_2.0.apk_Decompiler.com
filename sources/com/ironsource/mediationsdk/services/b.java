package com.ironsource.mediationsdk.services;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.services.a;
import java.util.HashMap;

public final class b implements a, a.C0056a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4884a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final com.ironsource.d.b f4885b = new com.ironsource.d.b();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4886a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4886a = r0
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4886a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4886a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4886a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.services.b.a.<clinit>():void");
        }
    }

    public b() {
        for (IronSource.AD_UNIT b10 : IronSource.AD_UNIT.values()) {
            b(b10, 1);
        }
    }

    public final synchronized int a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return -1;
        }
        Integer num = (Integer) this.f4884a.get(ad_unit);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final synchronized void b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit != null) {
            b(ad_unit, ((Integer) this.f4884a.get(ad_unit)).intValue() + 1);
        }
    }

    public final void b(IronSource.AD_UNIT ad_unit, int i10) {
        this.f4884a.put(ad_unit, Integer.valueOf(i10));
        int i11 = a.f4886a[ad_unit.ordinal()];
        if (i11 == 1) {
            this.f4885b.b(i10);
        } else if (i11 == 2) {
            this.f4885b.a(i10);
        } else if (i11 == 3) {
            this.f4885b.c(i10);
        } else if (i11 == 4) {
            this.f4885b.d(i10);
        }
    }
}
