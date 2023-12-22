package com.ironsource.sdk;

import com.ironsource.sdk.j.a;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5127a;

    /* renamed from: b  reason: collision with root package name */
    public String f5128b;

    /* renamed from: c  reason: collision with root package name */
    public String f5129c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5130d;

    /* renamed from: e  reason: collision with root package name */
    public a f5131e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f5132f;

    /* renamed from: g  reason: collision with root package name */
    public a f5133g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5134h;

    public b(String str, String str2, boolean z9, boolean z10, boolean z11, Map<String, String> map, a aVar, a aVar2) {
        this.f5128b = str;
        this.f5129c = str2;
        this.f5127a = z9;
        this.f5130d = z10;
        this.f5132f = map;
        this.f5133g = aVar;
        this.f5131e = aVar2;
        this.f5134h = z11;
    }

    public final boolean a() {
        a aVar = this.f5131e;
        if (aVar != null) {
            if (aVar.f5084b > 0 && aVar.f5083a > 0) {
                return true;
            }
        }
        return false;
    }
}
