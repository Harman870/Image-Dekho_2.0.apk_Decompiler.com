package h7;

import e7.h;
import e7.j;
import e7.l;
import e7.n;
import e7.o;
import e7.p;
import e7.r;
import e7.t;
import e7.u;
import g7.c;
import g7.m;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import k7.b;

public final class g implements u {

    /* renamed from: a  reason: collision with root package name */
    public final c f6946a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6947b = false;

    public final class a<K, V> extends t<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final n f6948a;

        /* renamed from: b  reason: collision with root package name */
        public final n f6949b;

        /* renamed from: c  reason: collision with root package name */
        public final m<? extends Map<K, V>> f6950c;

        public a(h hVar, Type type, t<K> tVar, Type type2, t<V> tVar2, m<? extends Map<K, V>> mVar) {
            this.f6948a = new n(hVar, tVar, type);
            this.f6949b = new n(hVar, tVar2, type2);
            this.f6950c = mVar;
        }

        public final Object a(k7.a aVar) {
            int W = aVar.W();
            if (W == 9) {
                aVar.S();
                return null;
            }
            Map map = (Map) this.f6950c.j();
            if (W == 1) {
                aVar.a();
                while (aVar.A()) {
                    aVar.a();
                    Object a10 = this.f6948a.a(aVar);
                    if (map.put(a10, this.f6949b.a(aVar)) == null) {
                        aVar.s();
                    } else {
                        throw new r("duplicate key: " + a10);
                    }
                }
                aVar.s();
            } else {
                aVar.c();
                while (aVar.A()) {
                    androidx.activity.result.c.f290a.A(aVar);
                    Object a11 = this.f6948a.a(aVar);
                    if (map.put(a11, this.f6949b.a(aVar)) != null) {
                        throw new r("duplicate key: " + a11);
                    }
                }
                aVar.t();
            }
            return map;
        }

        public final void b(b bVar, Object obj) {
            String str;
            boolean z9;
            Map map = (Map) obj;
            if (map == null) {
                bVar.v();
                return;
            }
            if (!g.this.f6947b) {
                bVar.j();
                for (Map.Entry entry : map.entrySet()) {
                    bVar.u(String.valueOf(entry.getKey()));
                    this.f6949b.b(bVar, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    n nVar = this.f6948a;
                    Object key = entry2.getKey();
                    nVar.getClass();
                    try {
                        f fVar = new f();
                        nVar.b(fVar, key);
                        if (fVar.f6944i.isEmpty()) {
                            l lVar = fVar.k;
                            arrayList.add(lVar);
                            arrayList2.add(entry2.getValue());
                            lVar.getClass();
                            if ((lVar instanceof j) || (lVar instanceof o)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            z10 |= z9;
                        } else {
                            throw new IllegalStateException("Expected one JSON element but was " + fVar.f6944i);
                        }
                    } catch (IOException e10) {
                        throw new e7.m((Exception) e10);
                    }
                }
                if (z10) {
                    bVar.c();
                    int size = arrayList.size();
                    while (i10 < size) {
                        bVar.c();
                        o.A.b(bVar, (l) arrayList.get(i10));
                        this.f6949b.b(bVar, arrayList2.get(i10));
                        bVar.s();
                        i10++;
                    }
                    bVar.s();
                    return;
                }
                bVar.j();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    l lVar2 = (l) arrayList.get(i10);
                    lVar2.getClass();
                    if (lVar2 instanceof p) {
                        p a10 = lVar2.a();
                        Object obj2 = a10.f6212a;
                        if (obj2 instanceof Number) {
                            str = String.valueOf(a10.g());
                        } else if (obj2 instanceof Boolean) {
                            str = Boolean.toString(a10.d());
                        } else if (obj2 instanceof String) {
                            str = a10.h();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (lVar2 instanceof n) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    bVar.u(str);
                    this.f6949b.b(bVar, arrayList2.get(i10));
                    i10++;
                }
            }
            bVar.t();
        }
    }

    public g(c cVar) {
        this.f6946a = cVar;
    }

    public final <T> t<T> b(h hVar, j7.a<T> aVar) {
        Type[] typeArr;
        t tVar;
        Type type = aVar.f8777b;
        if (!Map.class.isAssignableFrom(aVar.f8776a)) {
            return null;
        }
        Class<?> e10 = g7.a.e(type);
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        if (type == Properties.class) {
            typeArr = new Type[]{cls2, cls2};
        } else {
            Class<Map> cls3 = Map.class;
            c6.b.m(cls3.isAssignableFrom(e10));
            Type f10 = g7.a.f(type, e10, g7.a.d(type, e10, cls3), new HashSet());
            typeArr = f10 instanceof ParameterizedType ? ((ParameterizedType) f10).getActualTypeArguments() : new Type[]{cls, cls};
        }
        Type type2 = typeArr[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            tVar = o.f6984c;
        } else {
            tVar = hVar.b(new j7.a(type2));
        }
        return new a(hVar, typeArr[0], tVar, typeArr[1], hVar.b(new j7.a(typeArr[1])), this.f6946a.a(aVar));
    }
}
