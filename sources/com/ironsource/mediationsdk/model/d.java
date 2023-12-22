package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.c;
import com.ironsource.sdk.controller.x;
import java.util.ArrayList;
import java.util.Iterator;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public x f4712a;

    /* renamed from: b  reason: collision with root package name */
    public int f4713b;

    /* renamed from: c  reason: collision with root package name */
    public long f4714c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4715d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<e> f4716e;

    /* renamed from: f  reason: collision with root package name */
    public e f4717f;

    /* renamed from: g  reason: collision with root package name */
    public int f4718g;

    /* renamed from: h  reason: collision with root package name */
    public int f4719h;

    /* renamed from: i  reason: collision with root package name */
    public c f4720i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4721j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public long f4722l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4723m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4724n;

    public d() {
        this.f4712a = new x();
        this.f4716e = new ArrayList<>();
    }

    public d(int i10, long j10, boolean z9, x xVar, int i11, c cVar, int i12, boolean z10, boolean z11, long j11, boolean z12, boolean z13) {
        this.f4716e = new ArrayList<>();
        this.f4713b = i10;
        this.f4714c = j10;
        this.f4715d = z9;
        this.f4712a = xVar;
        this.f4718g = i11;
        this.f4719h = i12;
        this.f4720i = cVar;
        this.f4721j = z10;
        this.k = z11;
        this.f4722l = j11;
        this.f4723m = z12;
        this.f4724n = z13;
    }

    public final e a() {
        Iterator<e> it = this.f4716e.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f4717f;
    }

    public final e a(String str) {
        Iterator<e> it = this.f4716e.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
