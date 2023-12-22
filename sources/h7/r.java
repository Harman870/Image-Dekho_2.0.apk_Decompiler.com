package h7;

import androidx.activity.f;
import e7.h;
import e7.t;
import e7.u;
import h7.o;
import j7.a;

public final class r implements u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f7013a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f7014b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f7015c;

    public r(Class cls, Class cls2, o.s sVar) {
        this.f7013a = cls;
        this.f7014b = cls2;
        this.f7015c = sVar;
    }

    public final <T> t<T> b(h hVar, a<T> aVar) {
        Class<? super T> cls = aVar.f8776a;
        if (cls == this.f7013a || cls == this.f7014b) {
            return this.f7015c;
        }
        return null;
    }

    public final String toString() {
        StringBuilder g10 = f.g("Factory[type=");
        g10.append(this.f7013a.getName());
        g10.append("+");
        g10.append(this.f7014b.getName());
        g10.append(",adapter=");
        g10.append(this.f7015c);
        g10.append("]");
        return g10.toString();
    }
}
