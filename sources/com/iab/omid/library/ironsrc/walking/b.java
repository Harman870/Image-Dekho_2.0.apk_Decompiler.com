package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.async.b;
import com.iab.omid.library.ironsrc.walking.async.c;
import com.iab.omid.library.ironsrc.walking.async.d;
import com.iab.omid.library.ironsrc.walking.async.e;
import com.iab.omid.library.ironsrc.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

public class b implements b.C0036b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f3626a;

    /* renamed from: b  reason: collision with root package name */
    private final c f3627b;

    public b(c cVar) {
        this.f3627b = cVar;
    }

    public JSONObject a() {
        return this.f3626a;
    }

    public void a(JSONObject jSONObject) {
        this.f3626a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f3627b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f3627b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f3627b.b(new f(this, hashSet, jSONObject, j10));
    }
}
