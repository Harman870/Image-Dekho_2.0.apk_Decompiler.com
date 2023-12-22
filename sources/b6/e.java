package b6;

public final class e implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2286c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile h f2287a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f2288b = f2286c;

    public e(f fVar) {
        this.f2287a = fVar;
    }

    public final Object a() {
        Object obj = this.f2288b;
        Object obj2 = f2286c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f2288b;
                if (obj == obj2) {
                    obj = this.f2287a.a();
                    Object obj3 = this.f2288b;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f2288b = obj;
                    this.f2287a = null;
                }
            }
        }
        return obj;
    }
}
