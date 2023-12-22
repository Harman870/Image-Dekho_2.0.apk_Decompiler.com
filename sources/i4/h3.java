package i4;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

public final class h3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f7345a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f7346b = v.a();

    /* renamed from: c  reason: collision with root package name */
    public static final g3 f7347c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7348d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f7349e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f7350f = ((long) v(byte[].class));

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f7351g;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0046  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = k()
            f7345a = r7
            java.lang.Class r8 = i4.v.a()
            f7346b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = t(r8)
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = t(r10)
            if (r7 != 0) goto L_0x0029
            goto L_0x0039
        L_0x0029:
            if (r9 == 0) goto L_0x0031
            i4.f3 r9 = new i4.f3
            r9.<init>(r7)
            goto L_0x003a
        L_0x0031:
            if (r10 == 0) goto L_0x0039
            i4.e3 r9 = new i4.e3
            r9.<init>(r7)
            goto L_0x003a
        L_0x0039:
            r9 = 0
        L_0x003a:
            f7347c = r9
            java.lang.String r7 = "getLong"
            java.lang.String r10 = "objectFieldOffset"
            r11 = 2
            r12 = 1
            r13 = 0
            if (r9 != 0) goto L_0x0046
            goto L_0x006b
        L_0x0046:
            sun.misc.Unsafe r9 = r9.f7326a
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x0067 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0067 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0067 }
            r9.getMethod(r10, r14)     // Catch:{ all -> 0x0067 }
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ all -> 0x0067 }
            r14[r13] = r6     // Catch:{ all -> 0x0067 }
            r14[r12] = r8     // Catch:{ all -> 0x0067 }
            r9.getMethod(r7, r14)     // Catch:{ all -> 0x0067 }
            java.lang.reflect.Field r8 = b()     // Catch:{ all -> 0x0067 }
            if (r8 != 0) goto L_0x0065
            goto L_0x006b
        L_0x0065:
            r8 = r12
            goto L_0x006c
        L_0x0067:
            r8 = move-exception
            java.util.logging.Logger.getLogger(i4.h3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
        L_0x006b:
            r8 = r13
        L_0x006c:
            f7348d = r8
            i4.g3 r8 = f7347c
            if (r8 != 0) goto L_0x0073
            goto L_0x00e9
        L_0x0073:
            sun.misc.Unsafe r8 = r8.f7326a
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00e5 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e5 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r9[r13] = r14     // Catch:{ all -> 0x00e5 }
            r8.getMethod(r10, r9)     // Catch:{ all -> 0x00e5 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e5 }
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            r9[r13] = r10     // Catch:{ all -> 0x00e5 }
            java.lang.String r10 = "arrayBaseOffset"
            r8.getMethod(r10, r9)     // Catch:{ all -> 0x00e5 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e5 }
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            r9[r13] = r10     // Catch:{ all -> 0x00e5 }
            java.lang.String r10 = "arrayIndexScale"
            r8.getMethod(r10, r9)     // Catch:{ all -> 0x00e5 }
            java.lang.Class[] r9 = new java.lang.Class[r11]     // Catch:{ all -> 0x00e5 }
            r9[r13] = r6     // Catch:{ all -> 0x00e5 }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e5 }
            r9[r12] = r10     // Catch:{ all -> 0x00e5 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00e5 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e5 }
            r14[r13] = r6     // Catch:{ all -> 0x00e5 }
            r14[r12] = r10     // Catch:{ all -> 0x00e5 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e5 }
            r14[r11] = r15     // Catch:{ all -> 0x00e5 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00e5 }
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ all -> 0x00e5 }
            r14[r13] = r6     // Catch:{ all -> 0x00e5 }
            r14[r12] = r10     // Catch:{ all -> 0x00e5 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00e5 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e5 }
            r7[r13] = r6     // Catch:{ all -> 0x00e5 }
            r7[r12] = r10     // Catch:{ all -> 0x00e5 }
            r7[r11] = r10     // Catch:{ all -> 0x00e5 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e5 }
            java.lang.Class[] r7 = new java.lang.Class[r11]     // Catch:{ all -> 0x00e5 }
            r7[r13] = r6     // Catch:{ all -> 0x00e5 }
            r7[r12] = r10     // Catch:{ all -> 0x00e5 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e5 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e5 }
            r7[r13] = r6     // Catch:{ all -> 0x00e5 }
            r7[r12] = r10     // Catch:{ all -> 0x00e5 }
            r7[r11] = r6     // Catch:{ all -> 0x00e5 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00e5 }
            r6 = r12
            goto L_0x00ea
        L_0x00e5:
            r6 = move-exception
            java.util.logging.Logger.getLogger(i4.h3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
        L_0x00e9:
            r6 = r13
        L_0x00ea:
            f7349e = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = v(r6)
            long r6 = (long) r6
            f7350f = r6
            v(r5)
            a(r5)
            v(r4)
            a(r4)
            v(r3)
            a(r3)
            v(r2)
            a(r2)
            v(r1)
            a(r1)
            v(r0)
            a(r0)
            java.lang.reflect.Field r0 = b()
            if (r0 == 0) goto L_0x0126
            i4.g3 r1 = f7347c
            if (r1 == 0) goto L_0x0126
            r1.l(r0)
        L_0x0126:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            r12 = r13
        L_0x0130:
            f7351g = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.h3.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f7349e) {
            f7347c.i(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i10 = v.f7729a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void c(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        g3 g3Var = f7347c;
        int j12 = g3Var.j(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        g3Var.n(((255 & b10) << i10) | (j12 & (~(255 << i10))), j11, obj);
    }

    public static void d(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        g3 g3Var = f7347c;
        int i10 = (((int) j10) & 3) << 3;
        g3Var.n(((255 & b10) << i10) | (g3Var.j(j11, obj) & (~(255 << i10))), j11, obj);
    }

    public static double e(long j10, Object obj) {
        return f7347c.a(j10, obj);
    }

    public static float f(long j10, Object obj) {
        return f7347c.b(j10, obj);
    }

    public static int g(long j10, Object obj) {
        return f7347c.j(j10, obj);
    }

    public static long h(long j10, Object obj) {
        return f7347c.k(j10, obj);
    }

    public static Object i(Class cls) {
        try {
            return f7345a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(long j10, Object obj) {
        return f7347c.m(j10, obj);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new d3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(Object obj, long j10, boolean z9) {
        f7347c.c(obj, j10, z9);
    }

    public static void n(byte[] bArr, long j10, byte b10) {
        f7347c.d(bArr, f7350f + j10, b10);
    }

    public static void o(Object obj, long j10, double d10) {
        f7347c.e(obj, j10, d10);
    }

    public static void p(Object obj, long j10, float f10) {
        f7347c.f(obj, j10, f10);
    }

    public static void q(int i10, long j10, Object obj) {
        f7347c.n(i10, j10, obj);
    }

    public static void r(Object obj, long j10, long j11) {
        f7347c.o(obj, j10, j11);
    }

    public static void s(long j10, Object obj, Object obj2) {
        f7347c.p(j10, obj, obj2);
    }

    public static boolean t(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i10 = v.f7729a;
        try {
            Class cls3 = f7346b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean u(long j10, Object obj) {
        return f7347c.g(j10, obj);
    }

    public static int v(Class cls) {
        if (f7349e) {
            return f7347c.h(cls);
        }
        return -1;
    }
}
