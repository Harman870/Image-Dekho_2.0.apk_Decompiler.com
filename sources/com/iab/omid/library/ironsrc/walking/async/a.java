package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class a extends b {

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<String> f3617c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f3618d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3619e;

    public a(b.C0036b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar);
        this.f3617c = new HashSet<>(hashSet);
        this.f3618d = jSONObject;
        this.f3619e = j10;
    }
}
