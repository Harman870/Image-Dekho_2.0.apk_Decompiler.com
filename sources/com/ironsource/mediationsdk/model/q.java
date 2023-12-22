package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.c;
import com.ironsource.sdk.controller.x;
import java.util.ArrayList;
import java.util.Iterator;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<Placement> f4790a;

    /* renamed from: b  reason: collision with root package name */
    public x f4791b;

    /* renamed from: c  reason: collision with root package name */
    public int f4792c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4793d;

    /* renamed from: e  reason: collision with root package name */
    public int f4794e;

    /* renamed from: f  reason: collision with root package name */
    public int f4795f;

    /* renamed from: g  reason: collision with root package name */
    public int f4796g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4797h;

    /* renamed from: i  reason: collision with root package name */
    public long f4798i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4799j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public Placement f4800l;

    /* renamed from: m  reason: collision with root package name */
    public c f4801m;

    public q() {
        this.f4790a = new ArrayList<>();
        this.f4791b = new x();
    }

    public q(int i10, boolean z9, int i11, int i12, int i13, x xVar, c cVar, int i14, boolean z10, long j10, boolean z11, boolean z12) {
        this.f4790a = new ArrayList<>();
        this.f4792c = i10;
        this.f4793d = z9;
        this.f4794e = i11;
        this.f4791b = xVar;
        this.f4795f = i13;
        this.f4801m = cVar;
        this.f4796g = i14;
        this.f4797h = z10;
        this.f4798i = j10;
        this.f4799j = z11;
        this.k = z12;
    }

    public final Placement a() {
        Iterator<Placement> it = this.f4790a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f4800l;
    }
}
