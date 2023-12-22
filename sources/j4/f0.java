package j4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o.c;

public final class f0 extends w {
    public f0() {
        this.f8532a.add(g0.ASSIGN);
        this.f8532a.add(g0.CONST);
        this.f8532a.add(g0.CREATE_ARRAY);
        this.f8532a.add(g0.CREATE_OBJECT);
        this.f8532a.add(g0.EXPRESSION_LIST);
        this.f8532a.add(g0.GET);
        this.f8532a.add(g0.GET_INDEX);
        this.f8532a.add(g0.GET_PROPERTY);
        this.f8532a.add(g0.NULL);
        this.f8532a.add(g0.SET_PROPERTY);
        this.f8532a.add(g0.TYPEOF);
        this.f8532a.add(g0.UNDEFINED);
        this.f8532a.add(g0.VAR);
    }

    public final p a(String str, c cVar, ArrayList arrayList) {
        String str2;
        g0 g0Var = g0.ADD;
        int ordinal = j4.e(str).ordinal();
        int i10 = 0;
        if (ordinal == 3) {
            j4.h("ASSIGN", 2, arrayList);
            p b10 = cVar.b((p) arrayList.get(0));
            if (!(b10 instanceof t)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b10.getClass().getCanonicalName()}));
            } else if (cVar.g(b10.zzi())) {
                p b11 = cVar.b((p) arrayList.get(1));
                cVar.f(b10.zzi(), b11);
                return b11;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b10.zzi()}));
            }
        } else if (ordinal == 14) {
            j4.i("CONST", 2, arrayList);
            if (arrayList.size() % 2 == 0) {
                int i11 = 0;
                while (i11 < arrayList.size() - 1) {
                    p b12 = cVar.b((p) arrayList.get(i11));
                    if (b12 instanceof t) {
                        String zzi = b12.zzi();
                        cVar.e(zzi, cVar.b((p) arrayList.get(i11 + 1)));
                        ((Map) cVar.f10424d).put(zzi, Boolean.TRUE);
                        i11 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b12.getClass().getCanonicalName()}));
                    }
                }
                return p.f8373c0;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(arrayList.size())}));
        } else if (ordinal == 24) {
            j4.i("EXPRESSION_LIST", 1, arrayList);
            p pVar = p.f8373c0;
            while (i10 < arrayList.size()) {
                pVar = cVar.b((p) arrayList.get(i10));
                if (!(pVar instanceof h)) {
                    i10++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return pVar;
        } else if (ordinal == 33) {
            j4.h("GET", 1, arrayList);
            p b13 = cVar.b((p) arrayList.get(0));
            if (b13 instanceof t) {
                return cVar.d(b13.zzi());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b13.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            j4.h("NULL", 0, arrayList);
            return p.f8374d0;
        } else if (ordinal == 58) {
            j4.h("SET_PROPERTY", 3, arrayList);
            p b14 = cVar.b((p) arrayList.get(0));
            p b15 = cVar.b((p) arrayList.get(1));
            p b16 = cVar.b((p) arrayList.get(2));
            if (b14 == p.f8373c0 || b14 == p.f8374d0) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b15.zzi(), b14.zzi()}));
            }
            if ((b14 instanceof f) && (b15 instanceof i)) {
                ((f) b14).r(b15.b().intValue(), b16);
            } else if (b14 instanceof l) {
                ((l) b14).i(b15.zzi(), b16);
            }
            return b16;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    j4.h("GET_PROPERTY", 2, arrayList);
                    p b17 = cVar.b((p) arrayList.get(0));
                    p b18 = cVar.b((p) arrayList.get(1));
                    if ((b17 instanceof f) && j4.k(b18)) {
                        return ((f) b17).m(b18.b().intValue());
                    }
                    if (b17 instanceof l) {
                        return ((l) b17).h(b18.zzi());
                    }
                    if (b17 instanceof t) {
                        if ("length".equals(b18.zzi())) {
                            return new i(Double.valueOf((double) b17.zzi().length()));
                        }
                        if (j4.k(b18) && b18.b().doubleValue() < ((double) b17.zzi().length())) {
                            return new t(String.valueOf(b17.zzi().charAt(b18.b().intValue())));
                        }
                    }
                    return p.f8373c0;
                }
                switch (ordinal) {
                    case 62:
                        j4.h("TYPEOF", 1, arrayList);
                        p b19 = cVar.b((p) arrayList.get(0));
                        if (b19 instanceof u) {
                            str2 = "undefined";
                        } else if (b19 instanceof g) {
                            str2 = "boolean";
                        } else if (b19 instanceof i) {
                            str2 = "number";
                        } else if (b19 instanceof t) {
                            str2 = "string";
                        } else if (b19 instanceof o) {
                            str2 = "function";
                        } else if ((b19 instanceof q) || (b19 instanceof h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b19}));
                        } else {
                            str2 = "object";
                        }
                        return new t(str2);
                    case 63:
                        j4.h("UNDEFINED", 0, arrayList);
                        return p.f8373c0;
                    case 64:
                        j4.i("VAR", 1, arrayList);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            p b20 = cVar.b((p) it.next());
                            if (b20 instanceof t) {
                                cVar.e(b20.zzi(), p.f8373c0);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b20.getClass().getCanonicalName()}));
                            }
                        }
                        return p.f8373c0;
                    default:
                        b(str);
                        throw null;
                }
            } else if (arrayList.isEmpty()) {
                return new m();
            } else {
                if (arrayList.size() % 2 == 0) {
                    m mVar = new m();
                    while (i10 < arrayList.size() - 1) {
                        p b21 = cVar.b((p) arrayList.get(i10));
                        p b22 = cVar.b((p) arrayList.get(i10 + 1));
                        if ((b21 instanceof h) || (b22 instanceof h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        mVar.i(b21.zzi(), b22);
                        i10 += 2;
                    }
                    return mVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(arrayList.size())}));
            }
        } else if (arrayList.isEmpty()) {
            return new f();
        } else {
            f fVar = new f();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                p b23 = cVar.b((p) it2.next());
                if (!(b23 instanceof h)) {
                    fVar.r(i10, b23);
                    i10++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        }
    }
}
