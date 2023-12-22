package com.bumptech.glide.manager;

import f2.d;
import j2.l;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Set<d> f2641a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f2642b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2643c;

    public final boolean a(d dVar) {
        boolean z9 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f2641a.remove(dVar);
        if (!this.f2642b.remove(dVar) && !remove) {
            z9 = false;
        }
        if (z9) {
            dVar.clear();
        }
        return z9;
    }

    public final void b() {
        Iterator it = l.e(this.f2641a).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (!dVar.i() && !dVar.f()) {
                dVar.clear();
                if (!this.f2643c) {
                    dVar.h();
                } else {
                    this.f2642b.add(dVar);
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f2641a.size() + ", isPaused=" + this.f2643c + "}";
    }
}
