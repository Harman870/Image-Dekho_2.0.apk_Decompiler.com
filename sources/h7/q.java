package h7;

import androidx.activity.f;
import e7.h;
import e7.t;
import e7.u;
import j7.a;

public final class q implements u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f7010a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f7011b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f7012c;

    public q(Class cls, Class cls2, t tVar) {
        this.f7010a = cls;
        this.f7011b = cls2;
        this.f7012c = tVar;
    }

    public final <T> t<T> b(h hVar, a<T> aVar) {
        Class<? super T> cls = aVar.f8776a;
        if (cls == this.f7010a || cls == this.f7011b) {
            return this.f7012c;
        }
        return null;
    }

    public final String toString() {
        StringBuilder g10 = f.g("Factory[type=");
        g10.append(this.f7011b.getName());
        g10.append("+");
        g10.append(this.f7010a.getName());
        g10.append(",adapter=");
        g10.append(this.f7012c);
        g10.append("]");
        return g10.toString();
    }
}
