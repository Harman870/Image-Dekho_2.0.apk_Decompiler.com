package com.ironsource.mediationsdk.adunit.e;

import com.ironsource.mediationsdk.adunit.d.a.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import x8.f;

public abstract class h<Smash extends c<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4306a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final int f4307b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Smash> f4308c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, com.ironsource.mediationsdk.adunit.a.a> f4309d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f4310e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f4311f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f4312g = new ArrayList();

    public static final class a {

        /* renamed from: com.ironsource.mediationsdk.adunit.e.h$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0049a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f4313a;

            static {
                int[] iArr = new int[e.values().length];
                iArr[e.DEFAULT.ordinal()] = 1;
                iArr[e.BIDDER_SENSITIVE.ordinal()] = 2;
                f4313a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    public h(int i10, List<? extends Smash> list, Map<String, ? extends com.ironsource.mediationsdk.adunit.a.a> map) {
        f.f(list, "waterfall");
        f.f(map, "waterfallFromServer");
        this.f4307b = i10;
        this.f4308c = list;
        this.f4309d = map;
    }

    public abstract void a(Smash smash);

    public boolean a() {
        return b() >= this.f4307b;
    }

    public final int b() {
        return this.f4312g.size() + this.f4311f.size() + this.f4310e.size();
    }

    public final int c(Smash smash) {
        com.ironsource.mediationsdk.adunit.a.a aVar = this.f4309d.get(smash.n());
        if (aVar != null) {
            return aVar.e();
        }
        return Integer.MAX_VALUE;
    }
}
