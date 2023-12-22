package a7;

import b7.a;
import b7.b;
import java.util.HashMap;
import q6.g;
import q6.h;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final h f205a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        g gVar = h.a.f11361a;
        Class<t> cls = t.class;
        hashMap.put(cls, c.f103a);
        hashMap2.remove(cls);
        Class<b> cls2 = b.class;
        hashMap.put(cls2, b.f99a);
        hashMap2.remove(cls2);
        Class<a> cls3 = a.class;
        hashMap.put(cls3, a.f82a);
        hashMap2.remove(cls3);
        f205a = new h(new HashMap(hashMap), new HashMap(hashMap2), gVar);
    }

    public abstract b a();
}
