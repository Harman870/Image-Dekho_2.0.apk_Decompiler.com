package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x8.f;

/* renamed from: com.ironsource.mediationsdk.k  reason: case insensitive filesystem */
public final class C0187k {

    /* renamed from: a  reason: collision with root package name */
    public final IronSource.AD_UNIT f4615a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<C0185i> f4616b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f4617c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4618d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, Object> f4619e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public List<String> f4620f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public int f4621g = -1;

    /* renamed from: h  reason: collision with root package name */
    public h f4622h;

    /* renamed from: i  reason: collision with root package name */
    public IronSourceSegment f4623i;

    /* renamed from: j  reason: collision with root package name */
    public String f4624j = "";
    public ISBannerSize k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4625l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4626m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4627n;

    public C0187k(IronSource.AD_UNIT ad_unit) {
        f.f(ad_unit, "adUnit");
        this.f4615a = ad_unit;
    }

    public final IronSource.AD_UNIT a() {
        return this.f4615a;
    }

    public final void a(int i10) {
        this.f4621g = i10;
    }

    public final void a(ISBannerSize iSBannerSize) {
        this.k = iSBannerSize;
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.f4623i = ironSourceSegment;
    }

    public final void a(h hVar) {
        this.f4622h = hVar;
    }

    public final void a(C0185i iVar) {
        f.f(iVar, "instanceInfo");
        this.f4616b.add(iVar);
    }

    public final void a(String str) {
        f.f(str, "<set-?>");
    }

    public final void a(List<String> list) {
        f.f(list, "<set-?>");
        this.f4620f = list;
    }

    public final void a(Map<String, Object> map) {
        f.f(map, "<set-?>");
        this.f4619e = map;
    }

    public final void a(boolean z9) {
        this.f4617c = true;
    }

    public final ArrayList<C0185i> b() {
        return this.f4616b;
    }

    public final void b(String str) {
        f.f(str, "<set-?>");
        this.f4624j = str;
    }

    public final void b(boolean z9) {
        this.f4618d = z9;
    }

    public final void c(boolean z9) {
        this.f4625l = true;
    }

    public final boolean c() {
        return this.f4617c;
    }

    public final void d(boolean z9) {
        this.f4626m = z9;
    }

    public final boolean d() {
        return this.f4618d;
    }

    public final Map<String, Object> e() {
        return this.f4619e;
    }

    public final void e(boolean z9) {
        this.f4627n = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0187k) && this.f4615a == ((C0187k) obj).f4615a;
    }

    public final List<String> f() {
        return this.f4620f;
    }

    public final int g() {
        return this.f4621g;
    }

    public final h h() {
        return this.f4622h;
    }

    public final int hashCode() {
        return this.f4615a.hashCode();
    }

    public final IronSourceSegment i() {
        return this.f4623i;
    }

    public final String j() {
        return this.f4624j;
    }

    public final ISBannerSize k() {
        return this.k;
    }

    public final boolean l() {
        return this.f4625l;
    }

    public final boolean m() {
        return this.f4626m;
    }

    public final boolean n() {
        return this.f4627n;
    }

    public final String toString() {
        return "AuctionRequestParams(adUnit=" + this.f4615a + ')';
    }
}
