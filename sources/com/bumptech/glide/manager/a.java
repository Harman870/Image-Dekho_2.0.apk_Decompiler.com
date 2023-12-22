package com.bumptech.glide.manager;

import j2.l;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Set<i> f2614a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f2615b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2616c;

    public final void a() {
        this.f2616c = true;
        Iterator it = l.e(this.f2614a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onDestroy();
        }
    }

    public final void b() {
        this.f2615b = true;
        Iterator it = l.e(this.f2614a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStart();
        }
    }

    public final void c() {
        this.f2615b = false;
        Iterator it = l.e(this.f2614a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStop();
        }
    }

    public final void g(i iVar) {
        this.f2614a.add(iVar);
        if (this.f2616c) {
            iVar.onDestroy();
        } else if (this.f2615b) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    public final void i(i iVar) {
        this.f2614a.remove(iVar);
    }
}
