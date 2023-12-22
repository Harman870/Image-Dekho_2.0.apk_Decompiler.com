package w2;

import d3.s;
import java.util.Set;
import t2.b;
import t2.e;

public final class t implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f12722a;

    /* renamed from: b  reason: collision with root package name */
    public final s f12723b;

    /* renamed from: c  reason: collision with root package name */
    public final w f12724c;

    public t(Set set, j jVar, x xVar) {
        this.f12722a = set;
        this.f12723b = jVar;
        this.f12724c = xVar;
    }

    public final v a(b bVar, s sVar) {
        if (this.f12722a.contains(bVar)) {
            return new v(this.f12723b, bVar, sVar, this.f12724c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f12722a}));
    }
}
