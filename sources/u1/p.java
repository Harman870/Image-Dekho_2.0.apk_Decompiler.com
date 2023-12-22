package u1;

import java.util.HashMap;
import java.util.List;
import k2.a;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final r f12138a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12139b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f12140a = new HashMap();

        /* renamed from: u1.p$a$a  reason: collision with other inner class name */
        public static class C0154a<Model> {

            /* renamed from: a  reason: collision with root package name */
            public final List<n<Model, ?>> f12141a;

            public C0154a(List<n<Model, ?>> list) {
                this.f12141a = list;
            }
        }

        public final <Model> void a(Class<Model> cls, List<n<Model, ?>> list) {
            if (((C0154a) this.f12140a.put(cls, new C0154a(list))) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public p(a.c cVar) {
        r rVar = new r(cVar);
        this.f12138a = rVar;
    }
}
