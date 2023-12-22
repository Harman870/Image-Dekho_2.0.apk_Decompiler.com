package j4;

import java.util.ArrayList;
import java.util.Iterator;
import o.c;

public final class g implements p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8157a;

    public g(Boolean bool) {
        this.f8157a = bool == null ? false : bool.booleanValue();
    }

    public final p a() {
        return new g(Boolean.valueOf(this.f8157a));
    }

    public final Double b() {
        return Double.valueOf(true != this.f8157a ? 0.0d : 1.0d);
    }

    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f8157a == ((g) obj).f8157a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f8157a).hashCode();
    }

    public final Boolean k() {
        return Boolean.valueOf(this.f8157a);
    }

    public final p l(String str, c cVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new t(Boolean.toString(this.f8157a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f8157a), str}));
    }

    public final String toString() {
        return String.valueOf(this.f8157a);
    }

    public final String zzi() {
        return Boolean.toString(this.f8157a);
    }
}
