package x8;

import b9.b;
import c.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w8.d;
import w8.e;
import w8.f;
import w8.g;
import w8.h;
import w8.i;
import w8.j;
import w8.k;
import w8.l;
import w8.m;
import w8.n;
import w8.o;
import w8.p;
import w8.q;
import w8.r;
import w8.s;
import w8.t;
import w8.u;
import w8.v;
import w8.w;

public final class c implements b<Object>, b {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<Object>, Integer> f13000b;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f13001a;

    static {
        int i10 = 0;
        List f10 = a.f(w8.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, w8.b.class, w8.c.class, d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(p8.a.u(f10));
        for (Object next : f10) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new o8.e((Class) next, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f13000b = p8.j.z(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        f.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            f.e(str, "kotlinName");
            sb.append(d9.g.F(str));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            hashMap3.put(sb2, str + ".Companion");
        }
        for (Map.Entry next2 : f13000b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z5.c.m(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), d9.g.F((String) entry.getValue()));
        }
    }

    public c(Class<?> cls) {
        f.f(cls, "jClass");
        this.f13001a = cls;
    }

    public final Class<?> a() {
        return this.f13001a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && f.a(z5.c.i(this), z5.c.i((b) obj));
    }

    public final int hashCode() {
        return z5.c.i(this).hashCode();
    }

    public final String toString() {
        return this.f13001a.toString() + " (Kotlin reflection is not available)";
    }
}
