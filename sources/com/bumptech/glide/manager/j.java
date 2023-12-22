package com.bumptech.glide.manager;

import androidx.lifecycle.g;
import androidx.lifecycle.m;

public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f2619a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2620b;

    public j(k kVar, m mVar) {
        this.f2620b = kVar;
        this.f2619a = mVar;
    }

    public final void onDestroy() {
        this.f2620b.f2621a.remove(this.f2619a);
    }

    public final void onStart() {
    }

    public final void onStop() {
    }
}
