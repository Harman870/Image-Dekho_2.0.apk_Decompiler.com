package r1;

import java.util.ArrayDeque;
import r1.l;

public abstract class c<T extends l> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f11459a = new ArrayDeque(20);

    public c() {
        char[] cArr = j2.l.f8029a;
    }

    public abstract T a();

    public final T b() {
        T t10 = (l) this.f11459a.poll();
        return t10 == null ? a() : t10;
    }

    public final void c(T t10) {
        if (this.f11459a.size() < 20) {
            this.f11459a.offer(t10);
        }
    }
}
