package androidx.fragment.app;

import androidx.lifecycle.e0;
import androidx.lifecycle.f;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import d1.b;
import d1.c;
import d1.d;

public final class p0 implements f, d, f0 {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f1604a;

    /* renamed from: b  reason: collision with root package name */
    public m f1605b = null;

    /* renamed from: c  reason: collision with root package name */
    public c f1606c = null;

    public p0(e0 e0Var) {
        this.f1604a = e0Var;
    }

    public final void a(g.b bVar) {
        this.f1605b.f(bVar);
    }

    public final b c() {
        d();
        return this.f1606c.f6042b;
    }

    public final void d() {
        if (this.f1605b == null) {
            this.f1605b = new m(this);
            this.f1606c = new c(this);
        }
    }

    public final e0 p() {
        d();
        return this.f1604a;
    }

    public final m r() {
        d();
        return this.f1605b;
    }
}
