package q6;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import n6.b;
import n6.d;
import n6.f;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f11358a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f11359b;

    /* renamed from: c  reason: collision with root package name */
    public final d<Object> f11360c;

    public static final class a implements o6.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f11361a = new g();
    }

    public h(HashMap hashMap, HashMap hashMap2, g gVar) {
        this.f11358a = hashMap;
        this.f11359b = hashMap2;
        this.f11360c = gVar;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map<Class<?>, d<?>> map = this.f11358a;
        f fVar = new f(byteArrayOutputStream, map, this.f11359b, this.f11360c);
        if (obj != null) {
            d dVar = map.get(obj.getClass());
            if (dVar != null) {
                dVar.a(obj, fVar);
                return;
            }
            StringBuilder g10 = androidx.activity.f.g("No encoder for ");
            g10.append(obj.getClass());
            throw new b(g10.toString());
        }
    }
}
