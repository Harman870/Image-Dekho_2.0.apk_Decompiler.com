package e9;

import e1.c;
import q8.d;
import q8.f;

public abstract class a<T> extends r0 implements d<T> {
    public final void D(Object obj) {
        if (obj instanceof m) {
            Throwable th = ((m) obj).f6251a;
        }
    }

    public void J(Object obj) {
        g(obj);
    }

    public final boolean a() {
        return super.a();
    }

    public final f b() {
        return null;
    }

    public final void e(Object obj) {
        Throwable a10 = o8.f.a(obj);
        if (a10 != null) {
            obj = new m(a10, false);
        }
        Object y9 = y(obj);
        if (y9 != c.a.f2342c) {
            J(y9);
        }
    }

    public final String k() {
        return x8.f.j(" was cancelled", getClass().getSimpleName());
    }

    public final void w(c cVar) {
        y3.a.k((f) null, cVar);
    }

    public final String z() {
        return super.z();
    }
}
