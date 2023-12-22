package j4;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

public final class t9 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f8473a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f8474b = Memory.class;

    /* renamed from: c  reason: collision with root package name */
    public static final s9 f8475c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f8476d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f8477e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f8478f = ((long) w(byte[].class));

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f8479g;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0046  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            sun.misc.Unsafe r0 = k()
            f8473a = r0
            int r8 = j4.h6.f8215a
            java.lang.Class<libcore.io.Memory> r8 = libcore.io.Memory.class
            f8474b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = u(r8)
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = u(r10)
            if (r0 != 0) goto L_0x0029
            goto L_0x0039
        L_0x0029:
            if (r9 == 0) goto L_0x0031
            j4.r9 r9 = new j4.r9
            r9.<init>(r0)
            goto L_0x003a
        L_0x0031:
            if (r10 == 0) goto L_0x0039
            j4.q9 r9 = new j4.q9
            r9.<init>(r0)
            goto L_0x003a
        L_0x0039:
            r9 = 0
        L_0x003a:
            f8475c = r9
            java.lang.String r10 = "getLong"
            java.lang.String r11 = "objectFieldOffset"
            r12 = 2
            r13 = 1
            r14 = 0
            if (r9 != 0) goto L_0x0046
            goto L_0x006b
        L_0x0046:
            sun.misc.Unsafe r0 = r9.f8464a
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0067 }
            java.lang.Class[] r9 = new java.lang.Class[r13]     // Catch:{ all -> 0x0067 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r9[r14] = r15     // Catch:{ all -> 0x0067 }
            r0.getMethod(r11, r9)     // Catch:{ all -> 0x0067 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x0067 }
            r9[r14] = r7     // Catch:{ all -> 0x0067 }
            r9[r13] = r8     // Catch:{ all -> 0x0067 }
            r0.getMethod(r10, r9)     // Catch:{ all -> 0x0067 }
            java.lang.reflect.Field r0 = b()     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0065
            goto L_0x006b
        L_0x0065:
            r0 = r13
            goto L_0x006c
        L_0x0067:
            r0 = move-exception
            java.util.logging.Logger.getLogger(j4.t9.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
        L_0x006b:
            r0 = r14
        L_0x006c:
            f8476d = r0
            j4.s9 r0 = f8475c
            if (r0 != 0) goto L_0x0073
            goto L_0x00e9
        L_0x0073:
            sun.misc.Unsafe r0 = r0.f8464a
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x00e5 }
            java.lang.Class[] r8 = new java.lang.Class[r13]     // Catch:{ all -> 0x00e5 }
            java.lang.Class<java.lang.reflect.Field> r9 = java.lang.reflect.Field.class
            r8[r14] = r9     // Catch:{ all -> 0x00e5 }
            r0.getMethod(r11, r8)     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = "arrayBaseOffset"
            java.lang.Class[] r9 = new java.lang.Class[r13]     // Catch:{ all -> 0x00e5 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r14] = r11     // Catch:{ all -> 0x00e5 }
            r0.getMethod(r8, r9)     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = "arrayIndexScale"
            java.lang.Class[] r9 = new java.lang.Class[r13]     // Catch:{ all -> 0x00e5 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r14] = r11     // Catch:{ all -> 0x00e5 }
            r0.getMethod(r8, r9)     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = "getInt"
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e5 }
            r9[r14] = r7     // Catch:{ all -> 0x00e5 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e5 }
            r9[r13] = r11     // Catch:{ all -> 0x00e5 }
            r0.getMethod(r8, r9)     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = "putInt"
            r9 = 3
            java.lang.Class[] r15 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e5 }
            r15[r14] = r7     // Catch:{ all -> 0x00e5 }
            r15[r13] = r11     // Catch:{ all -> 0x00e5 }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e5 }
            r15[r12] = r16     // Catch:{ all -> 0x00e5 }
            r0.getMethod(r8, r15)     // Catch:{ all -> 0x00e5 }
            java.lang.Class[] r8 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e5 }
            r8[r14] = r7     // Catch:{ all -> 0x00e5 }
            r8[r13] = r11     // Catch:{ all -> 0x00e5 }
            r0.getMethod(r10, r8)     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = "putLong"
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e5 }
            r10[r14] = r7     // Catch:{ all -> 0x00e5 }
            r10[r13] = r11     // Catch:{ all -> 0x00e5 }
            r10[r12] = r11     // Catch:{ all -> 0x00e5 }
            r0.getMethod(r8, r10)     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = "getObject"
            java.lang.Class[] r10 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e5 }
            r10[r14] = r7     // Catch:{ all -> 0x00e5 }
            r10[r13] = r11     // Catch:{ all -> 0x00e5 }
            r0.getMethod(r8, r10)     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = "putObject"
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e5 }
            r9[r14] = r7     // Catch:{ all -> 0x00e5 }
            r9[r13] = r11     // Catch:{ all -> 0x00e5 }
            r9[r12] = r7     // Catch:{ all -> 0x00e5 }
            r0.getMethod(r8, r9)     // Catch:{ all -> 0x00e5 }
            r0 = r13
            goto L_0x00ea
        L_0x00e5:
            r0 = move-exception
            java.util.logging.Logger.getLogger(j4.t9.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
        L_0x00e9:
            r0 = r14
        L_0x00ea:
            f8477e = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = w(r0)
            long r7 = (long) r0
            f8478f = r7
            w(r6)
            a(r6)
            w(r5)
            a(r5)
            w(r4)
            a(r4)
            w(r3)
            a(r3)
            w(r2)
            a(r2)
            w(r1)
            a(r1)
            java.lang.reflect.Field r0 = b()
            if (r0 == 0) goto L_0x0128
            j4.s9 r1 = f8475c
            if (r1 == 0) goto L_0x0128
            sun.misc.Unsafe r1 = r1.f8464a
            r1.objectFieldOffset(r0)
        L_0x0128:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r13 = r14
        L_0x0132:
            f8479g = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.t9.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f8477e) {
            f8475c.f8464a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i10 = h6.f8215a;
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
        s9 s9Var = f8475c;
        long j11 = -4 & j10;
        int i10 = s9Var.f8464a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        s9Var.f8464a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void d(Object obj, long j10, byte b10) {
        s9 s9Var = f8475c;
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        s9Var.f8464a.putInt(obj, j11, ((255 & b10) << i10) | (s9Var.f8464a.getInt(obj, j11) & (~(255 << i10))));
    }

    public static double e(long j10, Object obj) {
        return f8475c.a(j10, obj);
    }

    public static float f(long j10, Object obj) {
        return f8475c.b(j10, obj);
    }

    public static int g(long j10, Object obj) {
        return f8475c.f8464a.getInt(obj, j10);
    }

    public static long h(long j10, Object obj) {
        return f8475c.f8464a.getLong(obj, j10);
    }

    public static Object i(Class cls) {
        try {
            return f8473a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(long j10, Object obj) {
        return f8475c.f8464a.getObject(obj, j10);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new p9());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(Object obj, long j10, boolean z9) {
        f8475c.c(obj, j10, z9);
    }

    public static void n(Object obj, long j10, double d10) {
        f8475c.e(obj, j10, d10);
    }

    public static void o(Object obj, long j10, float f10) {
        f8475c.f(obj, j10, f10);
    }

    public static void p(int i10, long j10, Object obj) {
        f8475c.f8464a.putInt(obj, j10, i10);
    }

    public static void q(Object obj, long j10, long j11) {
        f8475c.f8464a.putLong(obj, j10, j11);
    }

    public static void r(long j10, Object obj, Object obj2) {
        f8475c.f8464a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean s(long j10, Object obj) {
        return ((byte) ((f8475c.f8464a.getInt(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean t(long j10, Object obj) {
        return ((byte) ((f8475c.f8464a.getInt(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static boolean u(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i10 = h6.f8215a;
        try {
            Class cls3 = f8474b;
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

    public static boolean v(long j10, Object obj) {
        return f8475c.g(j10, obj);
    }

    public static int w(Class cls) {
        if (f8477e) {
            return f8475c.f8464a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
