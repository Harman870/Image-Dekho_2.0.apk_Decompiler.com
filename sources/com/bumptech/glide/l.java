package com.bumptech.glide;

import android.os.Trace;
import d2.a;
import j2.g;
import java.util.ArrayList;
import java.util.List;

public final class l implements g<k> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2580a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f2581b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f2582c;

    public l(b bVar, ArrayList arrayList, a aVar) {
        this.f2581b = bVar;
        this.f2582c = arrayList;
    }

    public final Object get() {
        if (!this.f2580a) {
            this.f2580a = true;
            Trace.beginSection("Glide registry");
            try {
                return m.a(this.f2581b, this.f2582c);
            } finally {
                Trace.endSection();
            }
        } else {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
    }
}
