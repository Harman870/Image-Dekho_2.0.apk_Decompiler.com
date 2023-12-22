package e7;

import g7.c;
import g7.j;
import h7.d;
import h7.g;
import h7.k;
import h7.l;
import h7.o;
import h7.p;
import h7.q;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import k7.b;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Map<j7.a<?>, a<?>>> f6202a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f6203b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final List<u> f6204c;

    /* renamed from: d  reason: collision with root package name */
    public final c f6205d;

    /* renamed from: e  reason: collision with root package name */
    public final d f6206e;

    public static class a<T> extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        public t<T> f6207a;

        public final T a(k7.a aVar) {
            t<T> tVar = this.f6207a;
            if (tVar != null) {
                return tVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        public final void b(b bVar, T t10) {
            t<T> tVar = this.f6207a;
            if (tVar != null) {
                tVar.b(bVar, t10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        new j7.a(Object.class);
    }

    public h() {
        j jVar = j.f6599f;
        Map emptyMap = Collections.emptyMap();
        List emptyList = Collections.emptyList();
        c cVar = new c(emptyMap);
        this.f6205d = cVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o.B);
        arrayList.add(h7.h.f6952b);
        arrayList.add(jVar);
        arrayList.addAll(emptyList);
        arrayList.add(o.f6996p);
        arrayList.add(o.f6988g);
        arrayList.add(o.f6985d);
        arrayList.add(o.f6986e);
        arrayList.add(o.f6987f);
        o.b bVar = o.k;
        arrayList.add(new q(Long.TYPE, Long.class, bVar));
        arrayList.add(new q(Double.TYPE, Double.class, new d()));
        arrayList.add(new q(Float.TYPE, Float.class, new e()));
        arrayList.add(o.f6992l);
        arrayList.add(o.f6989h);
        arrayList.add(o.f6990i);
        arrayList.add(new p(AtomicLong.class, new s(new f(bVar))));
        arrayList.add(new p(AtomicLongArray.class, new s(new g(bVar))));
        arrayList.add(o.f6991j);
        arrayList.add(o.f6993m);
        arrayList.add(o.f6997q);
        arrayList.add(o.f6998r);
        arrayList.add(new p(BigDecimal.class, o.f6994n));
        arrayList.add(new p(BigInteger.class, o.f6995o));
        arrayList.add(o.f6999s);
        arrayList.add(o.f7000t);
        arrayList.add(o.f7001v);
        arrayList.add(o.w);
        arrayList.add(o.f7004z);
        arrayList.add(o.u);
        arrayList.add(o.f6983b);
        arrayList.add(h7.c.f6934c);
        arrayList.add(o.f7003y);
        arrayList.add(l.f6971b);
        arrayList.add(k.f6969b);
        arrayList.add(o.f7002x);
        arrayList.add(h7.a.f6928c);
        arrayList.add(o.f6982a);
        arrayList.add(new h7.b(cVar));
        arrayList.add(new g(cVar));
        d dVar = new d(cVar);
        this.f6206e = dVar;
        arrayList.add(dVar);
        arrayList.add(o.C);
        arrayList.add(new h7.j(cVar, jVar, dVar));
        this.f6204c = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> t<T> b(j7.a<T> aVar) {
        t<T> tVar = (t) this.f6203b.get(aVar);
        if (tVar != null) {
            return tVar;
        }
        Map map = this.f6202a.get();
        boolean z9 = false;
        if (map == null) {
            map = new HashMap();
            this.f6202a.set(map);
            z9 = true;
        }
        a aVar2 = (a) map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a aVar3 = new a();
            map.put(aVar, aVar3);
            for (u b10 : this.f6204c) {
                t<T> b11 = b10.b(this, aVar);
                if (b11 != null) {
                    if (aVar3.f6207a == null) {
                        aVar3.f6207a = b11;
                        this.f6203b.put(aVar, b11);
                        return b11;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z9) {
                this.f6202a.remove();
            }
        }
    }

    public final <T> t<T> c(u uVar, j7.a<T> aVar) {
        if (!this.f6204c.contains(uVar)) {
            uVar = this.f6206e;
        }
        boolean z9 = false;
        for (u next : this.f6204c) {
            if (z9) {
                t<T> b10 = next.b(this, aVar);
                if (b10 != null) {
                    return b10;
                }
            } else if (next == uVar) {
                z9 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final String toString() {
        return "{serializeNulls:" + false + ",factories:" + this.f6204c + ",instanceCreators:" + this.f6205d + "}";
    }
}
