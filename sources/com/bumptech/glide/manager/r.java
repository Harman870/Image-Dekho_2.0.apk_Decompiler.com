package com.bumptech.glide.manager;

import com.bumptech.glide.manager.q;
import j2.l;

public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f2655a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q.c.a f2656b;

    public r(q.c.a aVar, boolean z9) {
        this.f2656b = aVar;
        this.f2655a = z9;
    }

    public final void run() {
        q.c.a aVar = this.f2656b;
        boolean z9 = this.f2655a;
        aVar.getClass();
        l.a();
        q.c cVar = q.c.this;
        boolean z10 = cVar.f2650a;
        cVar.f2650a = z9;
        if (z10 != z9) {
            cVar.f2651b.a(z9);
        }
    }
}
