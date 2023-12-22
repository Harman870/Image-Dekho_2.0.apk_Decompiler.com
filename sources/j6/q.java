package j6;

import u6.a;

public final class q<T> implements a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f8758c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f8759a = f8758c;

    /* renamed from: b  reason: collision with root package name */
    public volatile a<T> f8760b;

    public q(a<T> aVar) {
        this.f8760b = aVar;
    }

    public final T get() {
        T t10 = this.f8759a;
        T t11 = f8758c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f8759a;
                if (t10 == t11) {
                    t10 = this.f8760b.get();
                    this.f8759a = t10;
                    this.f8760b = null;
                }
            }
        }
        return t10;
    }
}
