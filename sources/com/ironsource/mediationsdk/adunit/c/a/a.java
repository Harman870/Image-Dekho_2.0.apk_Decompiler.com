package com.ironsource.mediationsdk.adunit.c.a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.c;
import java.util.Iterator;
import java.util.List;
import x8.f;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final IronSource.AD_UNIT f4180a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4181b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4182c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4183d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4184e;

    /* renamed from: f  reason: collision with root package name */
    public final List<NetworkSettings> f4185f;

    /* renamed from: g  reason: collision with root package name */
    public final c f4186g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4187h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4188i;

    /* renamed from: j  reason: collision with root package name */
    public final com.ironsource.mediationsdk.adunit.c.c.a f4189j;
    public final boolean k;

    /* renamed from: l  reason: collision with root package name */
    public final long f4190l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f4191m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f4192n;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.a.a$a  reason: collision with other inner class name */
    public static final class C0047a {
        private C0047a() {
        }

        public /* synthetic */ C0047a(byte b10) {
            this();
        }
    }

    static {
        new C0047a((byte) 0);
    }

    public a(IronSource.AD_UNIT ad_unit, String str, List<? extends NetworkSettings> list, c cVar, int i10, int i11, boolean z9, int i12, int i13, com.ironsource.mediationsdk.adunit.c.c.a aVar, boolean z10, long j10, boolean z11, boolean z12) {
        f.f(ad_unit, "adUnit");
        f.f(cVar, "auctionSettings");
        f.f(aVar, "loadingData");
        this.f4180a = ad_unit;
        this.f4184e = str;
        this.f4185f = list;
        this.f4186g = cVar;
        this.f4181b = i10;
        this.f4182c = i11;
        this.f4183d = z9;
        this.f4187h = i12;
        this.f4188i = i13;
        this.f4189j = aVar;
        this.k = z10;
        this.f4190l = j10;
        this.f4191m = z11;
        this.f4192n = z12;
    }

    public final IronSource.AD_UNIT a() {
        return this.f4180a;
    }

    public final NetworkSettings a(String str) {
        f.f(str, ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_NAME);
        List<NetworkSettings> c10 = c();
        T t10 = null;
        if (c10 == null) {
            return null;
        }
        Iterator<T> it = c10.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(str)) {
                t10 = next;
                break;
            }
        }
        return (NetworkSettings) t10;
    }

    public String b() {
        return this.f4184e;
    }

    public List<NetworkSettings> c() {
        return this.f4185f;
    }

    public final c d() {
        return this.f4186g;
    }

    public final int e() {
        return this.f4182c;
    }

    public final int f() {
        return this.f4187h;
    }

    public final int g() {
        return this.f4188i;
    }

    public final com.ironsource.mediationsdk.adunit.c.c.a h() {
        return this.f4189j;
    }

    public final boolean i() {
        return this.k;
    }

    public final long j() {
        return this.f4190l;
    }

    public final boolean k() {
        return this.f4191m;
    }

    public final boolean l() {
        return this.f4192n;
    }

    public final boolean m() {
        return this.f4186g.f4977c > 0;
    }
}
