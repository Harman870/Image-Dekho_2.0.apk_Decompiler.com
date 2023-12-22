package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.y;
import androidx.lifecycle.m;
import com.bumptech.glide.b;
import com.bumptech.glide.manager.n;
import com.bumptech.glide.o;
import j2.l;
import java.util.HashMap;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2621a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final n.b f2622b;

    public final class a implements o {
        public a(k kVar, y yVar) {
        }
    }

    public k(n.b bVar) {
        this.f2622b = bVar;
    }

    public final o a(Context context, b bVar, m mVar, y yVar, boolean z9) {
        l.a();
        l.a();
        o oVar = (o) this.f2621a.get(mVar);
        if (oVar != null) {
            return oVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(mVar);
        n.b bVar2 = this.f2622b;
        a aVar = new a(this, yVar);
        ((n.a) bVar2).getClass();
        o oVar2 = new o(bVar, lifecycleLifecycle, aVar, context);
        this.f2621a.put(mVar, oVar2);
        lifecycleLifecycle.g(new j(this, mVar));
        if (z9) {
            oVar2.onStart();
        }
        return oVar2;
    }
}
