package i3;

import android.annotation.TargetApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import r3.o;
import w3.b;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final g f7147a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7148b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7149c;

    /* renamed from: d  reason: collision with root package name */
    public long f7150d;

    /* renamed from: e  reason: collision with root package name */
    public long f7151e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7152f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f7153g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f7154h;

    public l(g gVar, b bVar) {
        o.h(gVar);
        o.h(bVar);
        this.f7147a = gVar;
        this.f7148b = bVar;
        this.f7153g = new HashMap();
        this.f7154h = new ArrayList();
    }

    public l(l lVar) {
        this.f7147a = lVar.f7147a;
        this.f7148b = lVar.f7148b;
        this.f7150d = lVar.f7150d;
        this.f7151e = lVar.f7151e;
        this.f7154h = new ArrayList(lVar.f7154h);
        this.f7153g = new HashMap(lVar.f7153g.size());
        for (Map.Entry entry : lVar.f7153g.entrySet()) {
            n d10 = d((Class) entry.getKey());
            ((n) entry.getValue()).zzc(d10);
            this.f7153g.put((Class) entry.getKey(), d10);
        }
    }

    @TargetApi(19)
    public static n d(Class cls) {
        try {
            return (n) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            if (e10 instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e10);
            } else if (e10 instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e10);
            } else if (e10 instanceof ReflectiveOperationException) {
                throw new IllegalArgumentException("Linkage exception", e10);
            } else {
                throw new RuntimeException(e10);
            }
        }
    }

    public final n a(Class cls) {
        n nVar = (n) this.f7153g.get(cls);
        if (nVar != null) {
            return nVar;
        }
        n d10 = d(cls);
        this.f7153g.put(cls, d10);
        return d10;
    }

    public final n b(Class cls) {
        return (n) this.f7153g.get(cls);
    }

    public final void c(n nVar) {
        o.h(nVar);
        Class<?> cls = nVar.getClass();
        if (cls.getSuperclass() == n.class) {
            nVar.zzc(a(cls));
            return;
        }
        throw new IllegalArgumentException();
    }
}
