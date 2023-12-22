package com.bumptech.glide.manager;

import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import java.util.HashSet;
import java.util.Iterator;

final class LifecycleLifecycle implements h, k {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f2612a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final g f2613b;

    public LifecycleLifecycle(m mVar) {
        this.f2613b = mVar;
        mVar.a(this);
    }

    public final void g(i iVar) {
        this.f2612a.add(iVar);
        if (this.f2613b.b() == g.c.DESTROYED) {
            iVar.onDestroy();
        } else if (this.f2613b.b().a(g.c.STARTED)) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    public final void i(i iVar) {
        this.f2612a.remove(iVar);
    }

    @s(g.b.ON_DESTROY)
    public void onDestroy(l lVar) {
        Iterator it = j2.l.e(this.f2612a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onDestroy();
        }
        lVar.r().c(this);
    }

    @s(g.b.ON_START)
    public void onStart(l lVar) {
        Iterator it = j2.l.e(this.f2612a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStart();
        }
    }

    @s(g.b.ON_STOP)
    public void onStop(l lVar) {
        Iterator it = j2.l.e(this.f2612a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStop();
        }
    }
}
