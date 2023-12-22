package h7;

import e7.b;
import e7.r;
import e7.t;
import e7.u;
import g7.c;
import g7.m;
import java.util.LinkedHashMap;
import java.util.Map;

public final class j implements u {

    /* renamed from: a  reason: collision with root package name */
    public final c f6960a;

    /* renamed from: b  reason: collision with root package name */
    public final e7.c f6961b;

    /* renamed from: c  reason: collision with root package name */
    public final g7.j f6962c;

    /* renamed from: d  reason: collision with root package name */
    public final d f6963d;

    public static final class a<T> extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        public final m<T> f6964a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, b> f6965b;

        public a(m mVar, LinkedHashMap linkedHashMap) {
            this.f6964a = mVar;
            this.f6965b = linkedHashMap;
        }

        public final T a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            T j10 = this.f6964a.j();
            try {
                aVar.c();
                while (aVar.A()) {
                    b bVar = this.f6965b.get(aVar.Q());
                    if (bVar != null) {
                        if (bVar.f6968c) {
                            bVar.a(aVar, j10);
                        }
                    }
                    aVar.b0();
                }
                aVar.t();
                return j10;
            } catch (IllegalStateException e10) {
                throw new r((Exception) e10);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public final void b(k7.b bVar, T t10) {
            if (t10 == null) {
                bVar.v();
                return;
            }
            bVar.j();
            try {
                for (b next : this.f6965b.values()) {
                    if (next.c(t10)) {
                        bVar.u(next.f6966a);
                        next.b(bVar, t10);
                    }
                }
                bVar.t();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f6966a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6967b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f6968c;

        public b(String str, boolean z9, boolean z10) {
            this.f6966a = str;
            this.f6967b = z9;
            this.f6968c = z10;
        }

        public abstract void a(k7.a aVar, Object obj);

        public abstract void b(k7.b bVar, Object obj);

        public abstract boolean c(Object obj);
    }

    public j(c cVar, g7.j jVar, d dVar) {
        b.a aVar = e7.b.f6198a;
        this.f6960a = cVar;
        this.f6961b = aVar;
        this.f6962c = jVar;
        this.f6963d = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r1 == false) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.reflect.Field r9, boolean r10) {
        /*
            r8 = this;
            g7.j r0 = r8.f6962c
            java.lang.Class r1 = r9.getType()
            boolean r1 = r0.c(r1, r10)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x00a9
            int r1 = r0.f6601b
            int r4 = r9.getModifiers()
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0019
            goto L_0x00a3
        L_0x0019:
            double r4 = r0.f6600a
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0039
            java.lang.Class<f7.c> r1 = f7.c.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            f7.c r1 = (f7.c) r1
            java.lang.Class<f7.d> r4 = f7.d.class
            java.lang.annotation.Annotation r4 = r9.getAnnotation(r4)
            f7.d r4 = (f7.d) r4
            boolean r1 = r0.d(r1, r4)
            if (r1 != 0) goto L_0x0039
            goto L_0x00a3
        L_0x0039:
            boolean r1 = r9.isSynthetic()
            if (r1 == 0) goto L_0x0041
            goto L_0x00a3
        L_0x0041:
            boolean r1 = r0.f6602c
            if (r1 != 0) goto L_0x0062
            java.lang.Class r1 = r9.getType()
            boolean r4 = r1.isMemberClass()
            if (r4 == 0) goto L_0x005e
            int r1 = r1.getModifiers()
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0059
            r1 = r3
            goto L_0x005a
        L_0x0059:
            r1 = r2
        L_0x005a:
            if (r1 != 0) goto L_0x005e
            r1 = r3
            goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            if (r1 == 0) goto L_0x0062
            goto L_0x00a3
        L_0x0062:
            java.lang.Class r9 = r9.getType()
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            boolean r1 = r1.isAssignableFrom(r9)
            if (r1 != 0) goto L_0x007c
            boolean r1 = r9.isAnonymousClass()
            if (r1 != 0) goto L_0x007a
            boolean r9 = r9.isLocalClass()
            if (r9 == 0) goto L_0x007c
        L_0x007a:
            r9 = r3
            goto L_0x007d
        L_0x007c:
            r9 = r2
        L_0x007d:
            if (r9 == 0) goto L_0x0080
            goto L_0x00a3
        L_0x0080:
            if (r10 == 0) goto L_0x0085
            java.util.List<e7.a> r9 = r0.f6603d
            goto L_0x0087
        L_0x0085:
            java.util.List<e7.a> r9 = r0.f6604e
        L_0x0087:
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L_0x00a5
            java.util.Iterator r9 = r9.iterator()
        L_0x0091:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00a5
            java.lang.Object r10 = r9.next()
            e7.a r10 = (e7.a) r10
            boolean r10 = r10.b()
            if (r10 == 0) goto L_0x0091
        L_0x00a3:
            r9 = r3
            goto L_0x00a6
        L_0x00a5:
            r9 = r2
        L_0x00a6:
            if (r9 != 0) goto L_0x00a9
            r2 = r3
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.j.a(java.lang.reflect.Field, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0194 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> e7.t<T> b(e7.h r33, j7.a<T> r34) {
        /*
            r32 = this;
            r0 = r32
            r11 = r33
            r1 = r34
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            java.lang.Class<? super T> r2 = r1.f8776a
            boolean r3 = r12.isAssignableFrom(r2)
            r13 = 0
            if (r3 != 0) goto L_0x0012
            return r13
        L_0x0012:
            g7.c r3 = r0.f6960a
            g7.m r14 = r3.a(r1)
            h7.j$a r15 = new h7.j$a
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            boolean r3 = r2.isInterface()
            if (r3 == 0) goto L_0x002c
        L_0x0025:
            r28 = r14
            r21 = r15
            r15 = r10
            goto L_0x01e2
        L_0x002c:
            java.lang.reflect.Type r9 = r1.f8777b
            r8 = r1
            r7 = r2
        L_0x0030:
            if (r7 == r12) goto L_0x0025
            java.lang.reflect.Field[] r6 = r7.getDeclaredFields()
            int r5 = r6.length
            r4 = 0
            r3 = r4
        L_0x0039:
            if (r3 >= r5) goto L_0x01b0
            r2 = r6[r3]
            r1 = 1
            boolean r16 = r0.a(r2, r1)
            boolean r17 = r0.a(r2, r4)
            if (r16 != 0) goto L_0x005f
            if (r17 != 0) goto L_0x005f
            r19 = r3
            r29 = r4
            r20 = r5
            r31 = r6
            r34 = r7
            r13 = r8
            r22 = r12
            r28 = r14
            r21 = r15
            r14 = r9
            r15 = r10
            goto L_0x017a
        L_0x005f:
            r2.setAccessible(r1)
            java.lang.reflect.Type r4 = r8.f8777b
            java.lang.reflect.Type r13 = r2.getGenericType()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.reflect.Type r13 = g7.a.f(r4, r7, r13, r1)
            java.lang.Class<f7.b> r1 = f7.b.class
            java.lang.annotation.Annotation r1 = r2.getAnnotation(r1)
            f7.b r1 = (f7.b) r1
            if (r1 != 0) goto L_0x0088
            e7.c r1 = r0.f6961b
            java.lang.String r1 = r1.a(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r19 = r3
            goto L_0x0099
        L_0x0088:
            java.lang.String r4 = r1.value()
            java.lang.String[] r1 = r1.alternate()
            r19 = r3
            int r3 = r1.length
            if (r3 != 0) goto L_0x009f
            java.util.List r1 = java.util.Collections.singletonList(r4)
        L_0x0099:
            r20 = r5
            r18 = 1
            r5 = r1
            goto L_0x00bf
        L_0x009f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r20 = r5
            int r5 = r1.length
            r18 = 1
            int r5 = r5 + 1
            r3.<init>(r5)
            r3.add(r4)
            int r4 = r1.length
            r5 = 0
        L_0x00b0:
            if (r5 >= r4) goto L_0x00be
            r21 = r4
            r4 = r1[r5]
            r3.add(r4)
            int r5 = r5 + 1
            r4 = r21
            goto L_0x00b0
        L_0x00be:
            r5 = r3
        L_0x00bf:
            int r4 = r5.size()
            r1 = 0
            r3 = 0
        L_0x00c5:
            if (r3 >= r4) goto L_0x0168
            java.lang.Object r21 = r5.get(r3)
            r22 = r12
            r12 = r21
            java.lang.String r12 = (java.lang.String) r12
            r21 = r9
            if (r3 == 0) goto L_0x00d7
            r16 = 0
        L_0x00d7:
            j7.a r9 = new j7.a
            r9.<init>(r13)
            r23 = r1
            java.lang.Class<? super T> r1 = r9.f8776a
            r24 = r3
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r3 = g7.n.f6634a
            boolean r25 = r3.containsKey(r1)
            java.lang.Class<f7.a> r1 = f7.a.class
            java.lang.annotation.Annotation r1 = r2.getAnnotation(r1)
            f7.a r1 = (f7.a) r1
            if (r1 == 0) goto L_0x0100
            h7.d r3 = r0.f6963d
            r26 = r2
            g7.c r2 = r0.f6960a
            r3.getClass()
            e7.t r1 = h7.d.a(r2, r11, r9, r1)
            goto L_0x0103
        L_0x0100:
            r26 = r2
            r1 = 0
        L_0x0103:
            if (r1 == 0) goto L_0x0108
            r27 = r18
            goto L_0x010a
        L_0x0108:
            r27 = 0
        L_0x010a:
            if (r1 != 0) goto L_0x0110
            e7.t r1 = r11.b(r9)
        L_0x0110:
            r28 = r1
            h7.i r3 = new h7.i
            r2 = r23
            r1 = r3
            r0 = r2
            r23 = r26
            r2 = r12
            r11 = r3
            r3 = r16
            r26 = r4
            r29 = 0
            r4 = r17
            r30 = r5
            r5 = r23
            r31 = r6
            r6 = r27
            r34 = r7
            r7 = r28
            r27 = r13
            r13 = r8
            r8 = r33
            r28 = r14
            r14 = r21
            r21 = r15
            r15 = r10
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r15.put(r12, r11)
            h7.j$b r1 = (h7.j.b) r1
            if (r0 != 0) goto L_0x014a
            goto L_0x014b
        L_0x014a:
            r1 = r0
        L_0x014b:
            int r3 = r24 + 1
            r0 = r32
            r11 = r33
            r7 = r34
            r8 = r13
            r9 = r14
            r10 = r15
            r15 = r21
            r12 = r22
            r2 = r23
            r4 = r26
            r13 = r27
            r14 = r28
            r5 = r30
            r6 = r31
            goto L_0x00c5
        L_0x0168:
            r0 = r1
            r31 = r6
            r34 = r7
            r13 = r8
            r22 = r12
            r28 = r14
            r21 = r15
            r29 = 0
            r14 = r9
            r15 = r10
            if (r0 != 0) goto L_0x0194
        L_0x017a:
            int r3 = r19 + 1
            r0 = r32
            r11 = r33
            r7 = r34
            r8 = r13
            r9 = r14
            r10 = r15
            r5 = r20
            r15 = r21
            r12 = r22
            r14 = r28
            r4 = r29
            r6 = r31
            r13 = 0
            goto L_0x0039
        L_0x0194:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            java.lang.String r3 = " declares multiple JSON fields named "
            r2.append(r3)
            java.lang.String r0 = r0.f6966a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x01b0:
            r34 = r7
            r13 = r8
            r22 = r12
            r28 = r14
            r21 = r15
            r14 = r9
            r15 = r10
            java.lang.reflect.Type r0 = r13.f8777b
            java.lang.reflect.Type r1 = r34.getGenericSuperclass()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3 = r34
            java.lang.reflect.Type r0 = g7.a.f(r0, r3, r1, r2)
            j7.a r8 = new j7.a
            r8.<init>(r0)
            java.lang.Class<? super T> r7 = r8.f8776a
            r0 = r32
            r11 = r33
            r9 = r14
            r10 = r15
            r15 = r21
            r12 = r22
            r14 = r28
            r13 = 0
            goto L_0x0030
        L_0x01e2:
            r1 = r21
            r0 = r28
            r1.<init>(r0, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.j.b(e7.h, j7.a):e7.t");
    }
}
