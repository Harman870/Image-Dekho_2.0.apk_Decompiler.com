package y2;

public final class a<T> implements n8.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f13016c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile n8.a<T> f13017a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f13018b = f13016c;

    public a(b bVar) {
        this.f13017a = bVar;
    }

    public static n8.a a(b bVar) {
        return bVar instanceof a ? bVar : new a(bVar);
    }

    public static void b(Object obj, Object obj2) {
        if ((obj != f13016c) && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
    }

    public final T get() {
        T t10 = this.f13018b;
        T t11 = f13016c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f13018b;
                if (t10 == t11) {
                    t10 = this.f13017a.get();
                    b(this.f13018b, t10);
                    this.f13018b = t10;
                    this.f13017a = null;
                }
            }
        }
        return t10;
    }
}
