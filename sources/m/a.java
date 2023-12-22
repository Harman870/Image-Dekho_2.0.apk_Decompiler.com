package m;

import java.util.Map;

public final class a extends g<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f9257d;

    public a(b bVar) {
        this.f9257d = bVar;
    }

    public final void a() {
        this.f9257d.clear();
    }

    public final Object b(int i10, int i11) {
        return this.f9257d.f9300b[(i10 << 1) + i11];
    }

    public final Map<Object, Object> c() {
        return this.f9257d;
    }

    public final int d() {
        return this.f9257d.f9301c;
    }

    public final int e(Object obj) {
        return this.f9257d.e(obj);
    }

    public final int f(Object obj) {
        return this.f9257d.g(obj);
    }

    public final void g(Object obj, Object obj2) {
        this.f9257d.put(obj, obj2);
    }

    public final void h(int i10) {
        this.f9257d.j(i10);
    }

    public final Object i(int i10, Object obj) {
        return this.f9257d.k(i10, obj);
    }
}
