package h7;

import androidx.activity.f;
import e7.h;
import e7.t;
import e7.u;
import j7.a;

public final class p implements u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f7008a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f7009b;

    public p(Class cls, t tVar) {
        this.f7008a = cls;
        this.f7009b = tVar;
    }

    public final <T> t<T> b(h hVar, a<T> aVar) {
        if (aVar.f8776a == this.f7008a) {
            return this.f7009b;
        }
        return null;
    }

    public final String toString() {
        StringBuilder g10 = f.g("Factory[type=");
        g10.append(this.f7008a.getName());
        g10.append(",adapter=");
        g10.append(this.f7009b);
        g10.append("]");
        return g10.toString();
    }
}
