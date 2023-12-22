package i4;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class n2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f7515a;

    /* renamed from: b  reason: collision with root package name */
    public static final x2 f7516b = v(false);

    /* renamed from: c  reason: collision with root package name */
    public static final x2 f7517c = v(true);

    /* renamed from: d  reason: collision with root package name */
    public static final z2 f7518d = new z2();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f7515a = cls;
    }

    public static int A(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l0.C(i10 << 3) + 4) * size;
    }

    public static int B(List list) {
        return list.size() * 4;
    }

    public static int C(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l0.C(i10 << 3) + 8) * size;
    }

    public static int D(List list) {
        return list.size() * 8;
    }

    public static int E(int i10, List list, m2 m2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += l0.V(i10, (b2) list.get(i12), m2Var);
        }
        return i11;
    }

    public static int F(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l0.B(i10) * size) + G(list);
    }

    public static int G(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            i10 = 0;
            while (i11 < size) {
                d1Var.g(i11);
                i10 += l0.W(d1Var.f7247b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l0.W(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int H(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (l0.B(i10) * list.size()) + I(list);
    }

    public static int I(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            i10 = 0;
            while (i11 < size) {
                q1Var.g(i11);
                i10 += l0.D(q1Var.f7606b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l0.D(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int J(int i10, m2 m2Var, Object obj) {
        int i11;
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            int C = l0.C(i10 << 3);
            if (k1Var.f7432b != null) {
                i11 = ((d0) k1Var.f7432b).f7246c.length;
            } else if (k1Var.f7431a != null) {
                i11 = k1Var.f7431a.h();
            } else {
                i11 = 0;
            }
            return l0.C(i11) + i11 + C;
        }
        int C2 = l0.C(i10 << 3);
        int a10 = ((t) ((b2) obj)).a(m2Var);
        return l0.C(a10) + a10 + C2;
    }

    public static int K(int i10, List list, m2 m2Var) {
        int a10;
        int C;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B = l0.B(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                if (k1Var.f7432b != null) {
                    a10 = ((d0) k1Var.f7432b).f7246c.length;
                } else if (k1Var.f7431a != null) {
                    a10 = k1Var.f7431a.h();
                } else {
                    a10 = 0;
                }
                C = l0.C(a10);
            } else {
                a10 = ((t) ((b2) obj)).a(m2Var);
                C = l0.C(a10);
            }
            B = C + a10 + B;
        }
        return B;
    }

    public static int L(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l0.B(i10) * size) + M(list);
    }

    public static int M(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            i10 = 0;
            while (i11 < size) {
                d1Var.g(i11);
                int i12 = d1Var.f7247b[i11];
                i10 += l0.C((i12 >> 31) ^ (i12 + i12));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i13 = i10 + l0.C((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int N(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l0.B(i10) * size) + O(list);
    }

    public static int O(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            i10 = 0;
            while (i11 < size) {
                q1Var.g(i11);
                long j10 = q1Var.f7606b[i11];
                i10 += l0.D((j10 >> 63) ^ (j10 + j10));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 = i10 + l0.D((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int P(List list, int i10) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int B = l0.B(i10) * size;
        if (list instanceof m1) {
            m1 m1Var = (m1) list;
            while (i13 < size) {
                Object e10 = m1Var.e(i13);
                if (e10 instanceof e0) {
                    int g10 = ((e0) e10).g();
                    i12 = l0.C(g10) + g10;
                } else {
                    i12 = l0.A((String) e10);
                }
                B += i12;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof e0) {
                    int g11 = ((e0) obj).g();
                    i11 = l0.C(g11) + g11;
                } else {
                    i11 = l0.A((String) obj);
                }
                B += i11;
                i13++;
            }
        }
        return B;
    }

    public static int Q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l0.B(i10) * size) + R(list);
    }

    public static int R(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            i10 = 0;
            while (i11 < size) {
                d1Var.g(i11);
                i10 += l0.C(d1Var.f7247b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l0.C(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int S(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l0.B(i10) * size) + T(list);
    }

    public static int T(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            i10 = 0;
            while (i11 < size) {
                q1Var.g(i11);
                i10 += l0.D(q1Var.f7606b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l0.D(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static Object a(Object obj, int i10, List list, e1 e1Var, Object obj2, x2 x2Var) {
        if (e1Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (e1Var.zza()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    if (obj2 == null) {
                        obj2 = x2Var.c(obj);
                    }
                    x2Var.l(i10, (long) intValue, obj2);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!e1Var.zza()) {
                    if (obj2 == null) {
                        obj2 = x2Var.c(obj);
                    }
                    x2Var.l(i10, (long) intValue2, obj2);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void c(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).booleanValue();
                    i12++;
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.F(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.G(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static void d(int i10, List list, m0 m0Var) {
        if (list != null && !list.isEmpty()) {
            m0Var.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                m0Var.f7486a.H(i10, (e0) list.get(i11));
            }
        }
    }

    public static void e(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    i12 += 8;
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.L(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.K(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        }
    }

    public static void f(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += l0.W(((Integer) list.get(i13)).intValue());
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.N(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.M(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void g(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    i12 += 4;
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.J(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.I(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void h(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    i12 += 8;
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.L(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.K(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void i(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    i12 += 4;
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.J(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.I(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
        }
    }

    public static void j(int i10, List list, m0 m0Var, m2 m2Var) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                m0Var.l(i10, m2Var, list.get(i11));
            }
        }
    }

    public static void k(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += l0.W(((Integer) list.get(i13)).intValue());
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.N(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.M(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void l(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += l0.D(((Long) list.get(i13)).longValue());
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.U(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.T(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void m(int i10, List list, m0 m0Var, m2 m2Var) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                m0Var.o(i10, m2Var, list.get(i11));
            }
        }
    }

    public static void n(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    i12 += 4;
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.J(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.I(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void o(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    i12 += 8;
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.L(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.K(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void p(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += l0.C((intValue >> 31) ^ (intValue + intValue));
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    l0 l0Var = m0Var.f7486a;
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    l0Var.S((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                l0 l0Var2 = m0Var.f7486a;
                int intValue3 = ((Integer) list.get(i11)).intValue();
                l0Var2.R(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
        }
    }

    public static void q(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += l0.D((longValue >> 63) ^ (longValue + longValue));
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    l0 l0Var = m0Var.f7486a;
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    l0Var.U((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                l0 l0Var2 = m0Var.f7486a;
                long longValue3 = ((Long) list.get(i11)).longValue();
                l0Var2.T(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
        }
    }

    public static void r(int i10, List list, m0 m0Var) {
        if (list != null && !list.isEmpty()) {
            m0Var.getClass();
            int i11 = 0;
            if (list instanceof m1) {
                m1 m1Var = (m1) list;
                while (i11 < list.size()) {
                    Object e10 = m1Var.e(i11);
                    if (e10 instanceof String) {
                        m0Var.f7486a.P(i10, (String) e10);
                    } else {
                        m0Var.f7486a.H(i10, (e0) e10);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                m0Var.f7486a.P(i10, (String) list.get(i11));
                i11++;
            }
        }
    }

    public static void s(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += l0.C(((Integer) list.get(i13)).intValue());
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.S(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.R(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static int t(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l0.C(i10 << 3) + 1) * size;
    }

    public static void u(int i10, List list, m0 m0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                m0Var.f7486a.Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += l0.D(((Long) list.get(i13)).longValue());
                }
                m0Var.f7486a.S(i12);
                while (i11 < list.size()) {
                    m0Var.f7486a.U(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            m0Var.getClass();
            while (i11 < list.size()) {
                m0Var.f7486a.T(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static x2 v(boolean z9) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (x2) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z9)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int w(List list) {
        return list.size();
    }

    public static int x(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B = l0.B(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int g10 = ((e0) list.get(i11)).g();
            B += l0.C(g10) + g10;
        }
        return B;
    }

    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l0.B(i10) * size) + z(list);
    }

    public static int z(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            i10 = 0;
            while (i11 < size) {
                d1Var.g(i11);
                i10 += l0.W(d1Var.f7247b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l0.W(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }
}
