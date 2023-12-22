package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.c;
import com.ironsource.sdk.controller.x;
import java.util.ArrayList;
import java.util.Iterator;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<InterstitialPlacement> f4741a;

    /* renamed from: b  reason: collision with root package name */
    public x f4742b;

    /* renamed from: c  reason: collision with root package name */
    public int f4743c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4744d;

    /* renamed from: e  reason: collision with root package name */
    public int f4745e;

    /* renamed from: f  reason: collision with root package name */
    public int f4746f;

    /* renamed from: g  reason: collision with root package name */
    public c f4747g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4748h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4749i;

    /* renamed from: j  reason: collision with root package name */
    public long f4750j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4751l;

    /* renamed from: m  reason: collision with root package name */
    public InterstitialPlacement f4752m;

    public h() {
        this.f4741a = new ArrayList<>();
        this.f4742b = new x();
    }

    public h(int i10, boolean z9, int i11, x xVar, c cVar, int i12, boolean z10, boolean z11, long j10, boolean z12, boolean z13) {
        this.f4741a = new ArrayList<>();
        this.f4743c = i10;
        this.f4744d = z9;
        this.f4745e = i11;
        this.f4742b = xVar;
        this.f4747g = cVar;
        this.k = z12;
        this.f4751l = z13;
        this.f4746f = i12;
        this.f4748h = z10;
        this.f4749i = z11;
        this.f4750j = j10;
    }

    public final InterstitialPlacement a() {
        Iterator<InterstitialPlacement> it = this.f4741a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f4752m;
    }
}
