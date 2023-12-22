package q1;

import o1.f;

public final class q<Z> implements w<Z> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11123a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11124b;

    /* renamed from: c  reason: collision with root package name */
    public final w<Z> f11125c;

    /* renamed from: d  reason: collision with root package name */
    public final a f11126d;

    /* renamed from: e  reason: collision with root package name */
    public final f f11127e;

    /* renamed from: f  reason: collision with root package name */
    public int f11128f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11129g;

    public interface a {
        void a(f fVar, q<?> qVar);
    }

    public q(w<Z> wVar, boolean z9, boolean z10, f fVar, a aVar) {
        y3.a.h(wVar);
        this.f11125c = wVar;
        this.f11123a = z9;
        this.f11124b = z10;
        this.f11127e = fVar;
        y3.a.h(aVar);
        this.f11126d = aVar;
    }

    public final int a() {
        return this.f11125c.a();
    }

    public final Class<Z> b() {
        return this.f11125c.b();
    }

    public final synchronized void c() {
        if (this.f11128f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f11129g) {
            this.f11129g = true;
            if (this.f11124b) {
                this.f11125c.c();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public final synchronized void d() {
        if (!this.f11129g) {
            this.f11128f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final void e() {
        boolean z9;
        synchronized (this) {
            int i10 = this.f11128f;
            if (i10 > 0) {
                z9 = true;
                int i11 = i10 - 1;
                this.f11128f = i11;
                if (i11 != 0) {
                    z9 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z9) {
            this.f11126d.a(this.f11127e, this);
        }
    }

    public final Z get() {
        return this.f11125c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f11123a + ", listener=" + this.f11126d + ", key=" + this.f11127e + ", acquired=" + this.f11128f + ", isRecycled=" + this.f11129g + ", resource=" + this.f11125c + '}';
    }
}
