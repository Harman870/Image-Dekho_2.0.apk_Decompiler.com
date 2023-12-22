package j4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.c;
import y3.a;

public abstract class j implements p, l {

    /* renamed from: a  reason: collision with root package name */
    public final String f8268a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8269b = new HashMap();

    public j(String str) {
        this.f8268a = str;
    }

    public p a() {
        return this;
    }

    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    public abstract p c(c cVar, List list);

    public final Iterator d() {
        return new k(this.f8269b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f8268a;
        if (str != null) {
            return str.equals(jVar.f8268a);
        }
        return false;
    }

    public final boolean g(String str) {
        return this.f8269b.containsKey(str);
    }

    public final p h(String str) {
        return this.f8269b.containsKey(str) ? (p) this.f8269b.get(str) : p.f8373c0;
    }

    public final int hashCode() {
        String str = this.f8268a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void i(String str, p pVar) {
        if (pVar == null) {
            this.f8269b.remove(str);
        } else {
            this.f8269b.put(str, pVar);
        }
    }

    public final Boolean k() {
        return Boolean.TRUE;
    }

    public final p l(String str, c cVar, ArrayList arrayList) {
        return "toString".equals(str) ? new t(this.f8268a) : a.J(this, new t(str), cVar, arrayList);
    }

    public final String zzi() {
        return this.f8268a;
    }
}
