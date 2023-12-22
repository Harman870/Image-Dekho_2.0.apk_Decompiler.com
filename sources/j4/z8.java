package j4;

import java.util.List;
import java.util.logging.Logger;

public final class z8 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f8581a;

    /* renamed from: b  reason: collision with root package name */
    public static final j9 f8582b;

    /* renamed from: c  reason: collision with root package name */
    public static final l9 f8583c = new l9();

    static {
        Class<?> cls;
        Class<?> cls2;
        j9 j9Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f8581a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                j9Var = (j9) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f8582b = j9Var;
    }

    public static int A(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u6.m0(i10 << 3) + 8) * size;
    }

    public static int B(List list) {
        return list.size() * 8;
    }

    public static int C(int i10, List list, y8 y8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += u6.j0(i10, (n8) list.get(i12), y8Var);
        }
        return i11;
    }

    public static int D(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u6.m0(i10 << 3) * size) + E(list);
    }

    public static int E(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n7) {
            n7 n7Var = (n7) list;
            i10 = 0;
            while (i11 < size) {
                n7Var.g(i11);
                i10 += u6.k0(n7Var.f8339b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + u6.k0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int F(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (u6.m0(i10 << 3) * list.size()) + G(list);
    }

    public static int G(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c8) {
            c8 c8Var = (c8) list;
            i10 = 0;
            while (i11 < size) {
                c8Var.g(i11);
                i10 += u6.n0(c8Var.f8086b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + u6.n0(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int H(int i10, y8 y8Var, Object obj) {
        int i11;
        int a10;
        int m02;
        if (obj instanceof w7) {
            w7 w7Var = (w7) obj;
            i11 = i10 << 3;
            Logger logger = u6.f8492x;
            if (w7Var.f8542b != null) {
                a10 = ((o6) w7Var.f8542b).f8365c.length;
            } else if (w7Var.f8541a != null) {
                a10 = w7Var.f8541a.e();
            } else {
                a10 = 0;
            }
            m02 = u6.m0(a10);
        } else {
            i11 = i10 << 3;
            Logger logger2 = u6.f8492x;
            a10 = ((f6) ((n8) obj)).a(y8Var);
            m02 = u6.m0(a10);
        }
        return u6.m0(i11) + m02 + a10;
    }

    public static int I(int i10, List list, y8 y8Var) {
        int a10;
        int m02;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m03 = u6.m0(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof w7) {
                w7 w7Var = (w7) obj;
                if (w7Var.f8542b != null) {
                    a10 = ((o6) w7Var.f8542b).f8365c.length;
                } else if (w7Var.f8541a != null) {
                    a10 = w7Var.f8541a.e();
                } else {
                    a10 = 0;
                }
                m02 = u6.m0(a10);
            } else {
                a10 = ((f6) ((n8) obj)).a(y8Var);
                m02 = u6.m0(a10);
            }
            m03 = m02 + a10 + m03;
        }
        return m03;
    }

    public static int J(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u6.m0(i10 << 3) * size) + K(list);
    }

    public static int K(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n7) {
            n7 n7Var = (n7) list;
            i10 = 0;
            while (i11 < size) {
                n7Var.g(i11);
                int i12 = n7Var.f8339b[i11];
                i10 += u6.m0((i12 >> 31) ^ (i12 + i12));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i13 = i10 + u6.m0((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int L(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u6.m0(i10 << 3) * size) + M(list);
    }

    public static int M(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c8) {
            c8 c8Var = (c8) list;
            i10 = 0;
            while (i11 < size) {
                c8Var.g(i11);
                long j10 = c8Var.f8086b[i11];
                i10 += u6.n0((j10 >> 63) ^ (j10 + j10));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 = i10 + u6.n0((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int N(List list, int i10) {
        int l02;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z9 = list instanceof y7;
        int m02 = u6.m0(i10 << 3) * size;
        if (z9) {
            y7 y7Var = (y7) list;
            while (i11 < size) {
                Object e10 = y7Var.e(i11);
                if (e10 instanceof q6) {
                    int g10 = ((q6) e10).g();
                    m02 = u6.m0(g10) + g10 + m02;
                } else {
                    m02 = u6.l0((String) e10) + m02;
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof q6) {
                    int g11 = ((q6) obj).g();
                    l02 = u6.m0(g11) + g11 + m02;
                } else {
                    l02 = u6.l0((String) obj) + m02;
                }
                i11++;
            }
        }
        return m02;
    }

    public static int O(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u6.m0(i10 << 3) * size) + P(list);
    }

    public static int P(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n7) {
            n7 n7Var = (n7) list;
            i10 = 0;
            while (i11 < size) {
                n7Var.g(i11);
                i10 += u6.m0(n7Var.f8339b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + u6.m0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int Q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u6.m0(i10 << 3) * size) + R(list);
    }

    public static int R(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c8) {
            c8 c8Var = (c8) list;
            i10 = 0;
            while (i11 < size) {
                c8Var.g(i11);
                i10 += u6.n0(c8Var.f8086b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + u6.n0(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static Object a(Object obj, int i10, int i11, Object obj2, j9 j9Var) {
        if (obj2 == null) {
            obj2 = j9Var.c(obj);
        }
        j9Var.f(i10, (long) i11, obj2);
        return obj2;
    }

    public static void b(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).booleanValue();
                    i12++;
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.U(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.V(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static void c(int i10, List list, v6 v6Var) {
        if (list != null && !list.isEmpty()) {
            v6Var.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                v6Var.f8509a.W(i10, (q6) list.get(i11));
            }
        }
    }

    public static void d(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    i12 += 8;
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.a0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.Z(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        }
    }

    public static void e(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += u6.k0(((Integer) list.get(i13)).intValue());
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.c0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.b0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void f(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    i12 += 4;
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.Y(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.X(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void g(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    i12 += 8;
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.a0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.Z(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void h(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    i12 += 4;
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.Y(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.X(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
        }
    }

    public static void i(int i10, List list, v6 v6Var, y8 y8Var) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                v6Var.l(i10, y8Var, list.get(i11));
            }
        }
    }

    public static void j(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += u6.k0(((Integer) list.get(i13)).intValue());
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.c0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.b0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void k(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += u6.n0(((Long) list.get(i13)).longValue());
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.i0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void l(int i10, List list, v6 v6Var, y8 y8Var) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                v6Var.o(i10, y8Var, list.get(i11));
            }
        }
    }

    public static void m(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    i12 += 4;
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.Y(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.X(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void n(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    i12 += 8;
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.a0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.Z(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void o(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += u6.m0((intValue >> 31) ^ (intValue + intValue));
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    u6 u6Var = v6Var.f8509a;
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    u6Var.g0((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                u6 u6Var2 = v6Var.f8509a;
                int intValue3 = ((Integer) list.get(i11)).intValue();
                u6Var2.f0(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
        }
    }

    public static void p(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += u6.n0((longValue >> 63) ^ (longValue + longValue));
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    u6 u6Var = v6Var.f8509a;
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    u6Var.i0((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                u6 u6Var2 = v6Var.f8509a;
                long longValue3 = ((Long) list.get(i11)).longValue();
                u6Var2.h0(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
        }
    }

    public static void q(int i10, List list, v6 v6Var) {
        if (list != null && !list.isEmpty()) {
            v6Var.getClass();
            int i11 = 0;
            if (list instanceof y7) {
                y7 y7Var = (y7) list;
                while (i11 < list.size()) {
                    Object e10 = y7Var.e(i11);
                    if (e10 instanceof String) {
                        v6Var.f8509a.d0(i10, (String) e10);
                    } else {
                        v6Var.f8509a.W(i10, (q6) e10);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                v6Var.f8509a.d0(i10, (String) list.get(i11));
                i11++;
            }
        }
    }

    public static void r(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += u6.m0(((Integer) list.get(i13)).intValue());
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.g0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void s(int i10, List list, v6 v6Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z9) {
                v6Var.f8509a.e0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += u6.n0(((Long) list.get(i13)).longValue());
                }
                v6Var.f8509a.g0(i12);
                while (i11 < list.size()) {
                    v6Var.f8509a.i0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            v6Var.getClass();
            while (i11 < list.size()) {
                v6Var.f8509a.h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static boolean t(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int u(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u6.m0(i10 << 3) + 1) * size;
    }

    public static int v(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m02 = u6.m0(i10 << 3) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int g10 = ((q6) list.get(i11)).g();
            m02 += u6.m0(g10) + g10;
        }
        return m02;
    }

    public static int w(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u6.m0(i10 << 3) * size) + x(list);
    }

    public static int x(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n7) {
            n7 n7Var = (n7) list;
            i10 = 0;
            while (i11 < size) {
                n7Var.g(i11);
                i10 += u6.k0(n7Var.f8339b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + u6.k0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u6.m0(i10 << 3) + 4) * size;
    }

    public static int z(List list) {
        return list.size() * 4;
    }
}
