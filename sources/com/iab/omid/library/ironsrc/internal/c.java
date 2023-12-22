package com.iab.omid.library.ironsrc.internal;

import com.iab.omid.library.ironsrc.adsession.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f3545c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<a> f3546a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<a> f3547b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f3545c;
    }

    public Collection<a> a() {
        return Collections.unmodifiableCollection(this.f3547b);
    }

    public void a(a aVar) {
        this.f3546a.add(aVar);
    }

    public Collection<a> b() {
        return Collections.unmodifiableCollection(this.f3546a);
    }

    public void b(a aVar) {
        boolean d10 = d();
        this.f3546a.remove(aVar);
        this.f3547b.remove(aVar);
        if (d10 && !d()) {
            h.c().e();
        }
    }

    public void c(a aVar) {
        boolean d10 = d();
        this.f3547b.add(aVar);
        if (!d10) {
            h.c().d();
        }
    }

    public boolean d() {
        return this.f3547b.size() > 0;
    }
}
