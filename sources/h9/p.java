package h9;

import e9.x0;
import q8.f;
import x8.g;
import z7.e;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final e f7069a = new e("NO_THREAD_ELEMENTS", 1);

    /* renamed from: b  reason: collision with root package name */
    public static final a f7070b = a.f7073c;

    /* renamed from: c  reason: collision with root package name */
    public static final b f7071c = b.f7074c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f7072d = c.f7075c;

    public static final class a extends g implements w8.p<Object, f.b, Object> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f7073c = new a();

        public a() {
            super(2);
        }

        public final Object a(Object obj, Object obj2) {
            f.b bVar = (f.b) obj2;
            if (!(bVar instanceof x0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    public static final class b extends g implements w8.p<x0<?>, f.b, x0<?>> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f7074c = new b();

        public b() {
            super(2);
        }

        public final Object a(Object obj, Object obj2) {
            x0 x0Var = (x0) obj;
            f.b bVar = (f.b) obj2;
            if (x0Var != null) {
                return x0Var;
            }
            if (bVar instanceof x0) {
                return (x0) bVar;
            }
            return null;
        }
    }

    public static final class c extends g implements w8.p<s, f.b, s> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f7075c = new c();

        public c() {
            super(2);
        }

        public final Object a(Object obj, Object obj2) {
            s sVar = (s) obj;
            f.b bVar = (f.b) obj2;
            if (bVar instanceof x0) {
                x0<Object> x0Var = (x0) bVar;
                String E = x0Var.E(sVar.f7077a);
                Object[] objArr = sVar.f7078b;
                int i10 = sVar.f7080d;
                objArr[i10] = E;
                x0<Object>[] x0VarArr = sVar.f7079c;
                sVar.f7080d = i10 + 1;
                x0VarArr[i10] = x0Var;
            }
            return sVar;
        }
    }

    public static final void a(f fVar, Object obj) {
        if (obj != f7069a) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                int length = sVar.f7079c.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i10 = length - 1;
                        x0<Object> x0Var = sVar.f7079c[length];
                        x8.f.c(x0Var);
                        x0Var.s(sVar.f7078b[length]);
                        if (i10 >= 0) {
                            length = i10;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object fold = fVar.fold(null, f7071c);
                if (fold != null) {
                    ((x0) fold).s(obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
        }
    }

    public static final Object b(f fVar) {
        Object fold = fVar.fold(0, f7070b);
        x8.f.c(fold);
        return fold;
    }

    public static final Object c(f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        return obj == 0 ? f7069a : obj instanceof Integer ? fVar.fold(new s(fVar, ((Number) obj).intValue()), f7072d) : ((x0) obj).E(fVar);
    }
}
