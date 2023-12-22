package com.bumptech.glide.manager;

import g2.g;
import j2.l;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class t implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Set<g<?>> f2658a = Collections.newSetFromMap(new WeakHashMap());

    public final void onDestroy() {
        Iterator it = l.e(this.f2658a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onDestroy();
        }
    }

    public final void onStart() {
        Iterator it = l.e(this.f2658a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onStart();
        }
    }

    public final void onStop() {
        Iterator it = l.e(this.f2658a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onStop();
        }
    }
}
