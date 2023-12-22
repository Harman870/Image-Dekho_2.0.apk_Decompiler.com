package h7;

import androidx.activity.f;
import e7.h;
import e7.r;
import e7.t;
import e7.u;
import k7.b;

public final class s implements u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f7016a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f7017b;

    public class a extends t<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Class f7018a;

        public a(Class cls) {
            this.f7018a = cls;
        }

        public final Object a(k7.a aVar) {
            Object a10 = s.this.f7017b.a(aVar);
            if (a10 == null || this.f7018a.isInstance(a10)) {
                return a10;
            }
            StringBuilder g10 = f.g("Expected a ");
            g10.append(this.f7018a.getName());
            g10.append(" but was ");
            g10.append(a10.getClass().getName());
            throw new r(g10.toString());
        }

        public final void b(b bVar, Object obj) {
            s.this.f7017b.b(bVar, obj);
        }
    }

    public s(Class cls, t tVar) {
        this.f7016a = cls;
        this.f7017b = tVar;
    }

    public final <T2> t<T2> b(h hVar, j7.a<T2> aVar) {
        Class<? super T> cls = aVar.f8776a;
        if (!this.f7016a.isAssignableFrom(cls)) {
            return null;
        }
        return new a(cls);
    }

    public final String toString() {
        StringBuilder g10 = f.g("Factory[typeHierarchy=");
        g10.append(this.f7016a.getName());
        g10.append(",adapter=");
        g10.append(this.f7017b);
        g10.append("]");
        return g10.toString();
    }
}
