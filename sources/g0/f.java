package g0;

public final class f<T> extends e {

    /* renamed from: c  reason: collision with root package name */
    public final Object f6456c = new Object();

    public f(int i10) {
        super(i10);
    }

    public final boolean a(T t10) {
        boolean a10;
        synchronized (this.f6456c) {
            a10 = super.a(t10);
        }
        return a10;
    }

    public final T b() {
        T b10;
        synchronized (this.f6456c) {
            b10 = super.b();
        }
        return b10;
    }
}
