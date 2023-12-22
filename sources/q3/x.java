package q3;

import java.util.Arrays;
import o3.d;
import r3.m;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final a<?> f11299a;

    /* renamed from: b  reason: collision with root package name */
    public final d f11300b;

    public /* synthetic */ x(a aVar, d dVar) {
        this.f11299a = aVar;
        this.f11300b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x)) {
            x xVar = (x) obj;
            return m.a(this.f11299a, xVar.f11299a) && m.a(this.f11300b, xVar.f11300b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11299a, this.f11300b});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(this.f11299a, "key");
        aVar.a(this.f11300b, "feature");
        return aVar.toString();
    }
}
