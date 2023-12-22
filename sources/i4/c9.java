package i4;

import c2.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c9 {

    /* renamed from: b  reason: collision with root package name */
    public static final c9 f7230b;

    /* renamed from: a  reason: collision with root package name */
    public final Map f7231a;

    static {
        b bVar = new b();
        HashMap hashMap = (HashMap) bVar.f2371a;
        if (hashMap != null) {
            c9 c9Var = new c9(Collections.unmodifiableMap(hashMap));
            bVar.f2371a = null;
            f7230b = c9Var;
            return;
        }
        throw new IllegalStateException("cannot call build() twice");
    }

    public /* synthetic */ c9(Map map) {
        this.f7231a = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c9)) {
            return false;
        }
        return this.f7231a.equals(((c9) obj).f7231a);
    }

    public final int hashCode() {
        return this.f7231a.hashCode();
    }

    public final String toString() {
        return this.f7231a.toString();
    }
}
