package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.c;
import com.ironsource.sdk.controller.x;
import java.util.ArrayList;
import java.util.Iterator;
import x8.f;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f4753a;

    /* renamed from: b  reason: collision with root package name */
    public long f4754b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4755c;

    /* renamed from: d  reason: collision with root package name */
    public int f4756d;

    /* renamed from: e  reason: collision with root package name */
    public c f4757e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4758f;

    /* renamed from: g  reason: collision with root package name */
    public long f4759g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4760h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4761i;

    /* renamed from: j  reason: collision with root package name */
    public x f4762j;
    public final ArrayList<j> k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public j f4763l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    static {
        new a((byte) 0);
    }

    public i(int i10, long j10, boolean z9, x xVar, c cVar, int i11, boolean z10, long j11, boolean z11, boolean z12) {
        f.f(xVar, "events");
        f.f(cVar, "auctionSettings");
        this.f4753a = i10;
        this.f4754b = j10;
        this.f4755c = z9;
        this.f4762j = xVar;
        this.f4756d = i11;
        this.f4757e = cVar;
        this.f4758f = z10;
        this.f4759g = j11;
        this.f4760h = z11;
        this.f4761i = z12;
    }

    public final j a(String str) {
        f.f(str, "placementName");
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (f.a(next.getPlacementName(), str)) {
                return next;
            }
        }
        return null;
    }

    public final x a() {
        return this.f4762j;
    }

    public final void a(j jVar) {
        if (jVar != null) {
            this.k.add(jVar);
            if (this.f4763l == null) {
                this.f4763l = jVar;
            } else if (jVar.getPlacementId() == 0) {
                this.f4763l = jVar;
            }
        }
    }

    public final j b() {
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f4763l;
    }
}
