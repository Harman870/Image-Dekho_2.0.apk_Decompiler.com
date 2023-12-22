package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.o;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2617a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f2618b;

    public d(Context context, o.b bVar) {
        this.f2617a = context.getApplicationContext();
        this.f2618b = bVar;
    }

    public final void onDestroy() {
    }

    public final void onStart() {
        q a10 = q.a(this.f2617a);
        b.a aVar = this.f2618b;
        synchronized (a10) {
            a10.f2646b.add(aVar);
            a10.b();
        }
    }

    public final void onStop() {
        q a10 = q.a(this.f2617a);
        b.a aVar = this.f2618b;
        synchronized (a10) {
            a10.f2646b.remove(aVar);
            if (a10.f2647c) {
                if (a10.f2646b.isEmpty()) {
                    q.c cVar = a10.f2645a;
                    cVar.f2652c.get().unregisterNetworkCallback(cVar.f2653d);
                    a10.f2647c = false;
                }
            }
        }
    }
}
