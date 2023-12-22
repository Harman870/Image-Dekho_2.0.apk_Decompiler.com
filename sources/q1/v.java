package q1;

import k2.a;
import k2.d;

public final class v<Z> implements w<Z>, a.d {

    /* renamed from: e  reason: collision with root package name */
    public static final a.c f11143e = k2.a.a(20, new a());

    /* renamed from: a  reason: collision with root package name */
    public final d.a f11144a = new d.a();

    /* renamed from: b  reason: collision with root package name */
    public w<Z> f11145b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11146c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11147d;

    public class a implements a.b<v<?>> {
        public final Object a() {
            return new v();
        }
    }

    public final int a() {
        return this.f11145b.a();
    }

    public final Class<Z> b() {
        return this.f11145b.b();
    }

    public final synchronized void c() {
        this.f11144a.a();
        this.f11147d = true;
        if (!this.f11146c) {
            this.f11145b.c();
            this.f11145b = null;
            f11143e.a(this);
        }
    }

    public final d.a d() {
        return this.f11144a;
    }

    public final synchronized void e() {
        this.f11144a.a();
        if (this.f11146c) {
            this.f11146c = false;
            if (this.f11147d) {
                c();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public final Z get() {
        return this.f11145b.get();
    }
}
