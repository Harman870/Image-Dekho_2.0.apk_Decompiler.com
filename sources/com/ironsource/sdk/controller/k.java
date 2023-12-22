package com.ironsource.sdk.controller;

import android.text.TextUtils;
import com.ironsource.sdk.b;
import com.ironsource.sdk.g.c;
import com.ironsource.sdk.g.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f5479a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f5480b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f5481c = new LinkedHashMap();

    public final c a(d.e eVar, b bVar) {
        LinkedHashMap c10;
        c cVar = new c(bVar);
        String str = bVar.f5128b;
        if (!TextUtils.isEmpty(str) && (c10 = c(eVar)) != null) {
            c10.put(str, cVar);
        }
        return cVar;
    }

    public final c a(d.e eVar, String str) {
        LinkedHashMap c10;
        if (TextUtils.isEmpty(str) || (c10 = c(eVar)) == null) {
            return null;
        }
        return (c) c10.get(str);
    }

    public final Collection<c> b(d.e eVar) {
        LinkedHashMap c10 = c(eVar);
        return c10 != null ? c10.values() : new ArrayList();
    }

    public final LinkedHashMap c(d.e eVar) {
        if (eVar.name().equalsIgnoreCase(d.e.RewardedVideo.name())) {
            return this.f5479a;
        }
        if (eVar.name().equalsIgnoreCase(d.e.f5649c.name())) {
            return this.f5480b;
        }
        if (eVar.name().equalsIgnoreCase(d.e.f5647a.name())) {
            return this.f5481c;
        }
        return null;
    }
}
