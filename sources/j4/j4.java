package j4;

import androidx.activity.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.c;

public final class j4 {
    public static double a(double d10) {
        int i10;
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || i10 == 0) {
            return d10;
        }
        return ((double) (i10 > 0 ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static int b(double d10) {
        int i10;
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i10 > 0 ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d));
    }

    public static void c(c cVar) {
        int b10 = b(cVar.d("runtime.counter").b().doubleValue() + 1.0d);
        if (b10 <= 1000000) {
            cVar.f("runtime.counter", new i(Double.valueOf((double) b10)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static long d(double d10) {
        return ((long) b(d10)) & 4294967295L;
    }

    public static g0 e(String str) {
        g0 g0Var;
        if (str == null || str.isEmpty()) {
            g0Var = null;
        } else {
            g0Var = (g0) g0.f8189z0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    public static Object f(p pVar) {
        boolean z9;
        if (p.f8374d0.equals(pVar)) {
            return null;
        }
        if (p.f8373c0.equals(pVar)) {
            return "";
        }
        if (pVar instanceof m) {
            return g((m) pVar);
        }
        if (pVar instanceof f) {
            ArrayList arrayList = new ArrayList();
            f fVar = (f) pVar;
            fVar.getClass();
            int i10 = 0;
            while (true) {
                if (i10 < fVar.j()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    return arrayList;
                }
                if (i10 < fVar.j()) {
                    int i11 = i10 + 1;
                    Object f10 = f(fVar.m(i10));
                    if (f10 != null) {
                        arrayList.add(f10);
                    }
                    i10 = i11;
                } else {
                    throw new NoSuchElementException(e.a("Out of bounds index: ", i10));
                }
            }
        } else if (!pVar.b().isNaN()) {
            return pVar.b();
        } else {
            return pVar.zzi();
        }
    }

    public static HashMap g(m mVar) {
        HashMap hashMap = new HashMap();
        mVar.getClass();
        Iterator it = new ArrayList(mVar.f8322a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object f10 = f(mVar.h(str));
            if (f10 != null) {
                hashMap.put(str, f10);
            }
        }
        return hashMap;
    }

    public static void h(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static void i(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static void j(String str, int i10, ArrayList arrayList) {
        if (arrayList.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(arrayList.size())}));
        }
    }

    public static boolean k(p pVar) {
        if (pVar == null) {
            return false;
        }
        Double b10 = pVar.b();
        return !b10.isNaN() && b10.doubleValue() >= 0.0d && b10.equals(Double.valueOf(Math.floor(b10.doubleValue())));
    }

    public static boolean l(p pVar, p pVar2) {
        if (!pVar.getClass().equals(pVar2.getClass())) {
            return false;
        }
        if ((pVar instanceof u) || (pVar instanceof n)) {
            return true;
        }
        if (!(pVar instanceof i)) {
            return pVar instanceof t ? pVar.zzi().equals(pVar2.zzi()) : pVar instanceof g ? pVar.k().equals(pVar2.k()) : pVar == pVar2;
        }
        if (Double.isNaN(pVar.b().doubleValue()) || Double.isNaN(pVar2.b().doubleValue())) {
            return false;
        }
        return pVar.b().equals(pVar2.b());
    }
}
