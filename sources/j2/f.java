package j2;

import y3.a;

public final class f implements g<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f8016a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f8017b;

    public f(g gVar) {
        this.f8017b = gVar;
    }

    public final Object get() {
        if (this.f8016a == null) {
            synchronized (this) {
                if (this.f8016a == null) {
                    Object obj = this.f8017b.get();
                    a.h(obj);
                    this.f8016a = obj;
                }
            }
        }
        return this.f8016a;
    }
}
