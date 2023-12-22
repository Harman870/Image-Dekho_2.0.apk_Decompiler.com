package u9;

import javax.annotation.Nullable;

public abstract class e0<T> {
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0980  */
    /* JADX WARNING: Removed duplicated region for block: B:555:0x0983 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static u9.k b(u9.d0 r23, java.lang.reflect.Method r24) {
        /*
            r0 = r23
            r1 = r24
            u9.a0$a r2 = new u9.a0$a
            r2.<init>(r0, r1)
            java.lang.annotation.Annotation[] r3 = r2.f12227c
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x000e:
            java.lang.String r7 = "HEAD"
            r8 = 0
            r9 = 1
            if (r6 >= r4) goto L_0x013d
            r10 = r3[r6]
            boolean r11 = r10 instanceof w9.b
            if (r11 == 0) goto L_0x0028
            w9.b r10 = (w9.b) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "DELETE"
        L_0x0022:
            r22 = r8
            r8 = r7
            r7 = r22
            goto L_0x0078
        L_0x0028:
            boolean r11 = r10 instanceof w9.f
            if (r11 == 0) goto L_0x0035
            w9.f r10 = (w9.f) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "GET"
            goto L_0x0022
        L_0x0035:
            boolean r11 = r10 instanceof w9.g
            if (r11 == 0) goto L_0x0040
            w9.g r10 = (w9.g) r10
            java.lang.String r8 = r10.value()
            goto L_0x0078
        L_0x0040:
            boolean r7 = r10 instanceof w9.n
            if (r7 == 0) goto L_0x004d
            w9.n r10 = (w9.n) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "PATCH"
            goto L_0x0066
        L_0x004d:
            boolean r7 = r10 instanceof w9.o
            if (r7 == 0) goto L_0x005a
            w9.o r10 = (w9.o) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "POST"
            goto L_0x0066
        L_0x005a:
            boolean r7 = r10 instanceof w9.p
            if (r7 == 0) goto L_0x006b
            w9.p r10 = (w9.p) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "PUT"
        L_0x0066:
            r2.b(r8, r7, r9)
            goto L_0x0139
        L_0x006b:
            boolean r7 = r10 instanceof w9.m
            if (r7 == 0) goto L_0x007d
            w9.m r10 = (w9.m) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "OPTIONS"
            goto L_0x0022
        L_0x0078:
            r2.b(r7, r8, r5)
            goto L_0x0139
        L_0x007d:
            boolean r7 = r10 instanceof w9.h
            if (r7 == 0) goto L_0x0094
            w9.h r10 = (w9.h) r10
            java.lang.String r7 = r10.method()
            java.lang.String r8 = r10.path()
            boolean r9 = r10.hasBody()
            r2.b(r7, r8, r9)
            goto L_0x0139
        L_0x0094:
            boolean r7 = r10 instanceof w9.k
            if (r7 == 0) goto L_0x010f
            w9.k r10 = (w9.k) r10
            java.lang.String[] r7 = r10.value()
            int r10 = r7.length
            if (r10 == 0) goto L_0x0104
            j9.p$a r10 = new j9.p$a
            r10.<init>()
            int r11 = r7.length
            r12 = r5
        L_0x00a8:
            if (r12 >= r11) goto L_0x00fc
            r13 = r7[r12]
            r14 = 58
            int r14 = r13.indexOf(r14)
            r15 = -1
            if (r14 == r15) goto L_0x00ef
            if (r14 == 0) goto L_0x00ef
            int r15 = r13.length()
            int r15 = r15 - r9
            if (r14 == r15) goto L_0x00ef
            java.lang.String r15 = r13.substring(r5, r14)
            int r14 = r14 + 1
            java.lang.String r13 = r13.substring(r14)
            java.lang.String r13 = r13.trim()
            java.lang.String r14 = "Content-Type"
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 == 0) goto L_0x00e9
            j9.s r14 = j9.s.a(r13)     // Catch:{ IllegalArgumentException -> 0x00db }
            r2.f12243t = r14     // Catch:{ IllegalArgumentException -> 0x00db }
            goto L_0x00ec
        L_0x00db:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r5] = r13
            java.lang.String r3 = "Malformed content type: %s"
            java.lang.IllegalArgumentException r0 = u9.h0.i(r1, r0, r3, r2)
            throw r0
        L_0x00e9:
            r10.a(r15, r13)
        L_0x00ec:
            int r12 = r12 + 1
            goto L_0x00a8
        L_0x00ef:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r5] = r13
            java.lang.String r2 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
            java.lang.IllegalArgumentException r0 = u9.h0.i(r0, r8, r2, r1)
            throw r0
        L_0x00fc:
            j9.p r7 = new j9.p
            r7.<init>((j9.p.a) r10)
            r2.f12242s = r7
            goto L_0x0139
        L_0x0104:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@Headers annotation is empty."
            java.lang.IllegalArgumentException r0 = u9.h0.i(r0, r8, r2, r1)
            throw r0
        L_0x010f:
            boolean r7 = r10 instanceof w9.l
            java.lang.String r11 = "Only one encoding annotation is allowed."
            if (r7 == 0) goto L_0x0125
            boolean r7 = r2.f12239p
            if (r7 != 0) goto L_0x011c
            r2.f12240q = r9
            goto L_0x0139
        L_0x011c:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = u9.h0.i(r0, r8, r11, r1)
            throw r0
        L_0x0125:
            boolean r7 = r10 instanceof w9.e
            if (r7 == 0) goto L_0x0139
            boolean r7 = r2.f12240q
            if (r7 != 0) goto L_0x0130
            r2.f12239p = r9
            goto L_0x0139
        L_0x0130:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = u9.h0.i(r0, r8, r11, r1)
            throw r0
        L_0x0139:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x013d:
            java.lang.String r3 = r2.f12237n
            if (r3 == 0) goto L_0x0b80
            boolean r3 = r2.f12238o
            if (r3 != 0) goto L_0x0164
            boolean r3 = r2.f12240q
            if (r3 != 0) goto L_0x0159
            boolean r3 = r2.f12239p
            if (r3 != 0) goto L_0x014e
            goto L_0x0164
        L_0x014e:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.IllegalArgumentException r0 = u9.h0.i(r0, r8, r2, r1)
            throw r0
        L_0x0159:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.IllegalArgumentException r0 = u9.h0.i(r0, r8, r2, r1)
            throw r0
        L_0x0164:
            java.lang.annotation.Annotation[][] r3 = r2.f12228d
            int r3 = r3.length
            u9.x[] r4 = new u9.x[r3]
            r2.f12244v = r4
            int r4 = r3 + -1
            r6 = r5
        L_0x016e:
            if (r5 >= r3) goto L_0x09e3
            u9.x<?>[] r10 = r2.f12244v
            java.lang.reflect.Type[] r11 = r2.f12229e
            r11 = r11[r5]
            java.lang.annotation.Annotation[][] r12 = r2.f12228d
            r12 = r12[r5]
            if (r5 != r4) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r9 = r6
        L_0x017e:
            if (r12 == 0) goto L_0x09aa
            int r13 = r12.length
        L_0x0181:
            if (r6 >= r13) goto L_0x09a1
            r14 = r12[r6]
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r16 = r3
            java.lang.Class<j9.t$b> r3 = j9.t.b.class
            r17 = r4
            boolean r4 = r14 instanceof w9.y
            r18 = r13
            java.lang.String r13 = "@Path parameters may not be used with @Url."
            if (r4 == 0) goto L_0x0233
            r2.c(r5, r11)
            boolean r3 = r2.f12236m
            if (r3 != 0) goto L_0x0227
            boolean r3 = r2.f12233i
            if (r3 != 0) goto L_0x021d
            boolean r3 = r2.f12234j
            if (r3 != 0) goto L_0x0211
            boolean r3 = r2.k
            if (r3 != 0) goto L_0x0205
            boolean r3 = r2.f12235l
            if (r3 != 0) goto L_0x01f9
            java.lang.String r3 = r2.f12241r
            if (r3 != 0) goto L_0x01e8
            r3 = 1
            r2.f12236m = r3
            java.lang.Class<j9.q> r3 = j9.q.class
            if (r11 == r3) goto L_0x01dd
            if (r11 == r15) goto L_0x01dd
            java.lang.Class<java.net.URI> r3 = java.net.URI.class
            if (r11 == r3) goto L_0x01dd
            boolean r3 = r11 instanceof java.lang.Class
            if (r3 == 0) goto L_0x01d1
            java.lang.String r3 = "android.net.Uri"
            r4 = r11
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d1
            goto L_0x01dd
        L_0x01d1:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r2, r1)
            throw r0
        L_0x01dd:
            u9.x$n r3 = new u9.x$n
            java.lang.reflect.Method r4 = r2.f12226b
            r3.<init>(r5, r4)
        L_0x01e4:
            r19 = r7
            goto L_0x073f
        L_0x01e8:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f12237n
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "@Url cannot be used with @%s URL"
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r2, r1)
            throw r0
        L_0x01f9:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @QueryMap."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x0205:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @QueryName."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x0211:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @Query."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x021d:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r13, r0)
            throw r0
        L_0x0227:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Multiple @Url method annotations found."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x0233:
            boolean r4 = r14 instanceof w9.s
            r1 = 2
            if (r4 == 0) goto L_0x02e7
            r2.c(r5, r11)
            boolean r3 = r2.f12234j
            if (r3 != 0) goto L_0x02db
            boolean r3 = r2.k
            if (r3 != 0) goto L_0x02cf
            boolean r3 = r2.f12235l
            if (r3 != 0) goto L_0x02c3
            boolean r3 = r2.f12236m
            if (r3 != 0) goto L_0x02b9
            java.lang.String r3 = r2.f12241r
            if (r3 == 0) goto L_0x02a8
            r3 = 1
            r2.f12233i = r3
            w9.s r14 = (w9.s) r14
            java.lang.String r3 = r14.value()
            java.util.regex.Pattern r4 = u9.a0.a.f12224y
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L_0x0291
            java.util.LinkedHashSet r4 = r2.u
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x027e
            u9.d0 r1 = r2.f12225a
            r1.e(r11, r12)
            u9.x$i r1 = new u9.x$i
            java.lang.reflect.Method r4 = r2.f12226b
            boolean r13 = r14.encoded()
            r1.<init>(r4, r5, r3, r13)
            goto L_0x0377
        L_0x027e:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f12241r
            r4 = 0
            r1[r4] = r2
            r2 = 1
            r1[r2] = r3
            java.lang.String r2 = "URL \"%s\" does not contain \"{%s}\"."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r2, r1)
            throw r0
        L_0x0291:
            r0 = 1
            r4 = 0
            java.lang.reflect.Method r2 = r2.f12226b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.regex.Pattern r6 = u9.a0.a.f12223x
            java.lang.String r6 = r6.pattern()
            r1[r4] = r6
            r1[r0] = r3
            java.lang.String r0 = "@Path parameter name must match %s. Found: %s"
            java.lang.IllegalArgumentException r0 = u9.h0.j(r2, r5, r0, r1)
            throw r0
        L_0x02a8:
            r0 = 1
            r1 = 0
            java.lang.reflect.Method r3 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r2.f12237n
            r0[r1] = r2
            java.lang.String r1 = "@Path can only be used with relative url on @%s"
            java.lang.IllegalArgumentException r0 = u9.h0.j(r3, r5, r1, r0)
            throw r0
        L_0x02b9:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r13, r0)
            throw r0
        L_0x02c3:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryMap."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x02cf:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryName."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x02db:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @Query."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x02e7:
            boolean r1 = r14 instanceof w9.t
            java.lang.String r4 = "<String>)"
            java.lang.String r13 = " must include generic type (e.g., "
            if (r1 == 0) goto L_0x037b
            r2.c(r5, r11)
            w9.t r14 = (w9.t) r14
            java.lang.String r1 = r14.value()
            boolean r3 = r14.encoded()
            java.lang.Class r14 = u9.h0.e(r11)
            r15 = 1
            r2.f12234j = r15
            java.lang.Class<java.lang.Iterable> r15 = java.lang.Iterable.class
            boolean r15 = r15.isAssignableFrom(r14)
            if (r15 == 0) goto L_0x034e
            boolean r15 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r15 == 0) goto L_0x0327
            r4 = r11
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r13 = 0
            java.lang.reflect.Type r4 = u9.h0.d(r13, r4)
            u9.d0 r13 = r2.f12225a
            r13.e(r4, r12)
            u9.x$j r4 = new u9.x$j
            r4.<init>(r1, r3)
            u9.v r1 = new u9.v
            r1.<init>(r4)
            goto L_0x0377
        L_0x0327:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r14.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r14.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r1, r2)
            throw r0
        L_0x034e:
            boolean r4 = r14.isArray()
            if (r4 == 0) goto L_0x036c
            java.lang.Class r4 = r14.getComponentType()
            java.lang.Class r4 = u9.a0.a.a(r4)
            u9.d0 r13 = r2.f12225a
            r13.e(r4, r12)
            u9.x$j r4 = new u9.x$j
            r4.<init>(r1, r3)
            u9.w r1 = new u9.w
            r1.<init>(r4)
            goto L_0x0377
        L_0x036c:
            u9.d0 r4 = r2.f12225a
            r4.e(r11, r12)
            u9.x$j r4 = new u9.x$j
            r4.<init>(r1, r3)
            r1 = r4
        L_0x0377:
            r19 = r7
            goto L_0x060a
        L_0x037b:
            boolean r1 = r14 instanceof w9.v
            if (r1 == 0) goto L_0x0405
            r2.c(r5, r11)
            w9.v r14 = (w9.v) r14
            boolean r1 = r14.encoded()
            java.lang.Class r3 = u9.h0.e(r11)
            r14 = 1
            r2.k = r14
            java.lang.Class<java.lang.Iterable> r14 = java.lang.Iterable.class
            boolean r14 = r14.isAssignableFrom(r3)
            if (r14 == 0) goto L_0x03da
            boolean r14 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L_0x03b3
            r3 = r11
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r4 = 0
            java.lang.reflect.Type r3 = u9.h0.d(r4, r3)
            u9.d0 r4 = r2.f12225a
            r4.e(r3, r12)
            u9.x$l r3 = new u9.x$l
            r3.<init>(r1)
            u9.v r1 = new u9.v
            r1.<init>(r3)
            goto L_0x0377
        L_0x03b3:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r1, r2)
            throw r0
        L_0x03da:
            boolean r4 = r3.isArray()
            if (r4 == 0) goto L_0x03f9
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Class r3 = u9.a0.a.a(r3)
            u9.d0 r4 = r2.f12225a
            r4.e(r3, r12)
            u9.x$l r3 = new u9.x$l
            r3.<init>(r1)
            u9.w r1 = new u9.w
            r1.<init>(r3)
            goto L_0x0377
        L_0x03f9:
            u9.d0 r3 = r2.f12225a
            r3.e(r11, r12)
            u9.x$l r3 = new u9.x$l
            r3.<init>(r1)
            goto L_0x01e4
        L_0x0405:
            boolean r1 = r14 instanceof w9.u
            r19 = r7
            java.lang.String r7 = "Map must include generic types (e.g., Map<String, String>)"
            if (r1 == 0) goto L_0x047b
            r2.c(r5, r11)
            java.lang.Class r1 = u9.h0.e(r11)
            r3 = 1
            r2.f12235l = r3
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L_0x046f
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            java.lang.reflect.Type r1 = u9.h0.f(r11, r1, r4)
            boolean r4 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x0465
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r4 = u9.h0.d(r4, r1)
            if (r15 != r4) goto L_0x044a
            java.lang.reflect.Type r1 = u9.h0.d(r3, r1)
            u9.d0 r3 = r2.f12225a
            r3.e(r1, r12)
            u9.x$k r1 = new u9.x$k
            java.lang.reflect.Method r3 = r2.f12226b
            w9.u r14 = (w9.u) r14
            boolean r4 = r14.encoded()
            r1.<init>(r3, r5, r4)
            goto L_0x060a
        L_0x044a:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@QueryMap keys must be of type String: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r1, r2)
            throw r0
        L_0x0465:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r7, r0)
            throw r0
        L_0x046f:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@QueryMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x047b:
            boolean r1 = r14 instanceof w9.i
            if (r1 == 0) goto L_0x0503
            r2.c(r5, r11)
            w9.i r14 = (w9.i) r14
            java.lang.String r1 = r14.value()
            java.lang.Class r3 = u9.h0.e(r11)
            java.lang.Class<java.lang.Iterable> r7 = java.lang.Iterable.class
            boolean r7 = r7.isAssignableFrom(r3)
            if (r7 == 0) goto L_0x04d8
            boolean r7 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L_0x04b1
            r3 = r11
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r4 = 0
            java.lang.reflect.Type r3 = u9.h0.d(r4, r3)
            u9.d0 r4 = r2.f12225a
            r4.e(r3, r12)
            u9.x$d r3 = new u9.x$d
            r3.<init>(r1)
            u9.v r1 = new u9.v
            r1.<init>(r3)
            goto L_0x060a
        L_0x04b1:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r1, r2)
            throw r0
        L_0x04d8:
            boolean r4 = r3.isArray()
            if (r4 == 0) goto L_0x04f7
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Class r3 = u9.a0.a.a(r3)
            u9.d0 r4 = r2.f12225a
            r4.e(r3, r12)
            u9.x$d r3 = new u9.x$d
            r3.<init>(r1)
            u9.w r1 = new u9.w
            r1.<init>(r3)
            goto L_0x060a
        L_0x04f7:
            u9.d0 r3 = r2.f12225a
            r3.e(r11, r12)
            u9.x$d r3 = new u9.x$d
            r3.<init>(r1)
            goto L_0x073f
        L_0x0503:
            boolean r1 = r14 instanceof w9.j
            if (r1 == 0) goto L_0x057a
            java.lang.Class<j9.p> r1 = j9.p.class
            if (r11 != r1) goto L_0x0514
            u9.x$f r1 = new u9.x$f
            java.lang.reflect.Method r3 = r2.f12226b
            r1.<init>(r5, r3)
            goto L_0x060a
        L_0x0514:
            r2.c(r5, r11)
            java.lang.Class r1 = u9.h0.e(r11)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x056e
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            java.lang.reflect.Type r1 = u9.h0.f(r11, r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0564
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r3 = 0
            java.lang.reflect.Type r3 = u9.h0.d(r3, r1)
            if (r15 != r3) goto L_0x0549
            r3 = 1
            java.lang.reflect.Type r1 = u9.h0.d(r3, r1)
            u9.d0 r3 = r2.f12225a
            r3.e(r1, r12)
            u9.x$e r1 = new u9.x$e
            java.lang.reflect.Method r3 = r2.f12226b
            r1.<init>(r3, r5)
            goto L_0x060a
        L_0x0549:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@HeaderMap keys must be of type String: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r1, r2)
            throw r0
        L_0x0564:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r7, r0)
            throw r0
        L_0x056e:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@HeaderMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x057a:
            boolean r1 = r14 instanceof w9.c
            if (r1 == 0) goto L_0x0619
            r2.c(r5, r11)
            boolean r1 = r2.f12239p
            if (r1 == 0) goto L_0x060d
            w9.c r14 = (w9.c) r14
            java.lang.String r1 = r14.value()
            boolean r3 = r14.encoded()
            r7 = 1
            r2.f12230f = r7
            java.lang.Class r7 = u9.h0.e(r11)
            java.lang.Class<java.lang.Iterable> r14 = java.lang.Iterable.class
            boolean r14 = r14.isAssignableFrom(r7)
            if (r14 == 0) goto L_0x05e1
            boolean r14 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L_0x05ba
            r4 = r11
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r7 = 0
            java.lang.reflect.Type r4 = u9.h0.d(r7, r4)
            u9.d0 r7 = r2.f12225a
            r7.e(r4, r12)
            u9.x$b r4 = new u9.x$b
            r4.<init>(r1, r3)
            u9.v r1 = new u9.v
            r1.<init>(r4)
            goto L_0x060a
        L_0x05ba:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r1, r2)
            throw r0
        L_0x05e1:
            boolean r4 = r7.isArray()
            if (r4 == 0) goto L_0x05ff
            java.lang.Class r4 = r7.getComponentType()
            java.lang.Class r4 = u9.a0.a.a(r4)
            u9.d0 r7 = r2.f12225a
            r7.e(r4, r12)
            u9.x$b r4 = new u9.x$b
            r4.<init>(r1, r3)
            u9.w r1 = new u9.w
            r1.<init>(r4)
            goto L_0x060a
        L_0x05ff:
            u9.d0 r4 = r2.f12225a
            r4.e(r11, r12)
            u9.x$b r4 = new u9.x$b
            r4.<init>(r1, r3)
            r1 = r4
        L_0x060a:
            r3 = r1
            goto L_0x073f
        L_0x060d:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@Field parameters can only be used with form encoding."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r2, r1)
            throw r0
        L_0x0619:
            boolean r1 = r14 instanceof w9.d
            if (r1 == 0) goto L_0x069a
            r2.c(r5, r11)
            boolean r1 = r2.f12239p
            if (r1 == 0) goto L_0x068e
            java.lang.Class r1 = u9.h0.e(r11)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x0682
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            java.lang.reflect.Type r1 = u9.h0.f(r11, r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0678
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r3 = 0
            java.lang.reflect.Type r3 = u9.h0.d(r3, r1)
            if (r15 != r3) goto L_0x065d
            r3 = 1
            java.lang.reflect.Type r1 = u9.h0.d(r3, r1)
            u9.d0 r4 = r2.f12225a
            r4.e(r1, r12)
            r2.f12230f = r3
            u9.x$c r1 = new u9.x$c
            java.lang.reflect.Method r3 = r2.f12226b
            w9.d r14 = (w9.d) r14
            boolean r4 = r14.encoded()
            r1.<init>(r3, r5, r4)
            goto L_0x060a
        L_0x065d:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@FieldMap keys must be of type String: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r1, r2)
            throw r0
        L_0x0678:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r7, r0)
            throw r0
        L_0x0682:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x068e:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameters can only be used with form encoding."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x069a:
            boolean r1 = r14 instanceof w9.q
            if (r1 == 0) goto L_0x083a
            r2.c(r5, r11)
            boolean r1 = r2.f12240q
            if (r1 == 0) goto L_0x082e
            w9.q r14 = (w9.q) r14
            r1 = 1
            r2.f12231g = r1
            java.lang.String r1 = r14.value()
            java.lang.Class r7 = u9.h0.e(r11)
            boolean r15 = r1.isEmpty()
            if (r15 == 0) goto L_0x074c
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r1 = r1.isAssignableFrom(r7)
            java.lang.String r14 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
            if (r1 == 0) goto L_0x0710
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x06e9
            r1 = r11
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r1 = u9.h0.d(r4, r1)
            java.lang.Class r1 = u9.h0.e(r1)
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x06e0
            u9.x$m r1 = u9.x.m.f12355a
            u9.v r3 = new u9.v
            r3.<init>(r1)
            goto L_0x073f
        L_0x06e0:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r14, r1)
            throw r0
        L_0x06e9:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r1, r2)
            throw r0
        L_0x0710:
            boolean r1 = r7.isArray()
            if (r1 == 0) goto L_0x0734
            java.lang.Class r1 = r7.getComponentType()
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x072a
            u9.x$m r1 = u9.x.m.f12355a
            u9.w r3 = new u9.w
            r3.<init>(r1)
            r1 = r3
            goto L_0x060a
        L_0x072a:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r14, r1)
            throw r0
        L_0x0734:
            r1 = 0
            boolean r3 = r3.isAssignableFrom(r7)
            if (r3 == 0) goto L_0x0743
            u9.x$m r1 = u9.x.m.f12355a
            goto L_0x060a
        L_0x073f:
            r20 = r10
            goto L_0x097d
        L_0x0743:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r14, r1)
            throw r0
        L_0x074c:
            r15 = 4
            java.lang.String[] r15 = new java.lang.String[r15]
            java.lang.String r20 = "Content-Disposition"
            r21 = 0
            r15[r21] = r20
            java.lang.String r0 = "form-data; name=\""
            r20 = r10
            java.lang.String r10 = "\""
            java.lang.String r0 = androidx.fragment.app.w0.d(r0, r1, r10)
            r1 = 1
            r15[r1] = r0
            java.lang.String r0 = "Content-Transfer-Encoding"
            r1 = 2
            r15[r1] = r0
            r0 = 3
            java.lang.String r1 = r14.encoding()
            r15[r0] = r1
            j9.p r0 = j9.p.f(r15)
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r1 = r1.isAssignableFrom(r7)
            java.lang.String r10 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
            if (r1 == 0) goto L_0x07d8
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x07b1
            r1 = r11
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r1 = u9.h0.d(r4, r1)
            java.lang.Class r4 = u9.h0.e(r1)
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 != 0) goto L_0x07a7
            u9.d0 r3 = r2.f12225a
            java.lang.annotation.Annotation[] r4 = r2.f12227c
            u9.f r1 = r3.c(r1, r12, r4)
            u9.x$g r3 = new u9.x$g
            java.lang.reflect.Method r4 = r2.f12226b
            r3.<init>(r4, r5, r0, r1)
            u9.v r0 = new u9.v
            r0.<init>(r3)
            goto L_0x0800
        L_0x07a7:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r10, r1)
            throw r0
        L_0x07b1:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r1, r2)
            throw r0
        L_0x07d8:
            boolean r1 = r7.isArray()
            if (r1 == 0) goto L_0x080d
            java.lang.Class r1 = r7.getComponentType()
            java.lang.Class r1 = u9.a0.a.a(r1)
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 != 0) goto L_0x0803
            u9.d0 r3 = r2.f12225a
            java.lang.annotation.Annotation[] r4 = r2.f12227c
            u9.f r1 = r3.c(r1, r12, r4)
            u9.x$g r3 = new u9.x$g
            java.lang.reflect.Method r4 = r2.f12226b
            r3.<init>(r4, r5, r0, r1)
            u9.w r0 = new u9.w
            r0.<init>(r3)
        L_0x0800:
            r3 = r0
            goto L_0x097d
        L_0x0803:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r10, r1)
            throw r0
        L_0x080d:
            boolean r1 = r3.isAssignableFrom(r7)
            if (r1 != 0) goto L_0x0824
            u9.d0 r1 = r2.f12225a
            java.lang.annotation.Annotation[] r3 = r2.f12227c
            u9.f r1 = r1.c(r11, r12, r3)
            u9.x$g r3 = new u9.x$g
            java.lang.reflect.Method r4 = r2.f12226b
            r3.<init>(r4, r5, r0, r1)
            goto L_0x097d
        L_0x0824:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r10, r1)
            throw r0
        L_0x082e:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Part parameters can only be used with multipart encoding."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x083a:
            r20 = r10
            boolean r0 = r14 instanceof w9.r
            if (r0 == 0) goto L_0x08d8
            r2.c(r5, r11)
            boolean r0 = r2.f12240q
            if (r0 == 0) goto L_0x08cc
            r0 = 1
            r2.f12231g = r0
            java.lang.Class r0 = u9.h0.e(r11)
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 == 0) goto L_0x08c0
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            java.lang.reflect.Type r0 = u9.h0.f(r11, r0, r1)
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x08b6
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r1 = 0
            java.lang.reflect.Type r1 = u9.h0.d(r1, r0)
            if (r15 != r1) goto L_0x089b
            r1 = 1
            java.lang.reflect.Type r0 = u9.h0.d(r1, r0)
            java.lang.Class r1 = u9.h0.e(r0)
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 != 0) goto L_0x088f
            u9.d0 r1 = r2.f12225a
            java.lang.annotation.Annotation[] r3 = r2.f12227c
            u9.f r0 = r1.c(r0, r12, r3)
            w9.r r14 = (w9.r) r14
            u9.x$h r3 = new u9.x$h
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.String r4 = r14.encoding()
            r3.<init>(r1, r5, r0, r4)
            goto L_0x097d
        L_0x088f:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r2, r1)
            throw r0
        L_0x089b:
            r0 = 0
            java.lang.reflect.Method r2 = r2.f12226b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "@PartMap keys must be of type String: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r2, r5, r1, r0)
            throw r0
        L_0x08b6:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r7, r0)
            throw r0
        L_0x08c0:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x08cc:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameters can only be used with multipart encoding."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x08d8:
            boolean r0 = r14 instanceof w9.a
            if (r0 == 0) goto L_0x0927
            r2.c(r5, r11)
            boolean r0 = r2.f12239p
            if (r0 != 0) goto L_0x091b
            boolean r0 = r2.f12240q
            if (r0 != 0) goto L_0x091b
            boolean r0 = r2.f12232h
            if (r0 != 0) goto L_0x090f
            u9.d0 r0 = r2.f12225a     // Catch:{ RuntimeException -> 0x08ff }
            java.lang.annotation.Annotation[] r1 = r2.f12227c     // Catch:{ RuntimeException -> 0x08ff }
            u9.f r0 = r0.c(r11, r12, r1)     // Catch:{ RuntimeException -> 0x08ff }
            r1 = 1
            r2.f12232h = r1
            u9.x$a r3 = new u9.x$a
            java.lang.reflect.Method r1 = r2.f12226b
            r3.<init>(r1, r5, r0)
            goto L_0x097d
        L_0x08ff:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f12226b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r11
            java.lang.String r3 = "Unable to create @Body converter for %s"
            java.lang.IllegalArgumentException r0 = u9.h0.k(r1, r0, r5, r3, r2)
            throw r0
        L_0x090f:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Multiple @Body method annotations found."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x091b:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Body parameters cannot be used with form or multi-part encoding."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r1, r5, r2, r0)
            throw r0
        L_0x0927:
            boolean r0 = r14 instanceof w9.x
            if (r0 == 0) goto L_0x097c
            r2.c(r5, r11)
            java.lang.Class r0 = u9.h0.e(r11)
            int r1 = r5 + -1
        L_0x0934:
            if (r1 < 0) goto L_0x0976
            u9.x<?>[] r3 = r2.f12244v
            r3 = r3[r1]
            boolean r4 = r3 instanceof u9.x.o
            if (r4 == 0) goto L_0x0973
            u9.x$o r3 = (u9.x.o) r3
            java.lang.Class<T> r3 = r3.f12358a
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0949
            goto L_0x0973
        L_0x0949:
            java.lang.reflect.Method r2 = r2.f12226b
            java.lang.String r3 = "@Tag type "
            java.lang.StringBuilder r3 = androidx.activity.f.g(r3)
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = " is duplicate of parameter #"
            r3.append(r0)
            int r1 = r1 + 1
            r3.append(r1)
            java.lang.String r0 = " and would always overwrite its value."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = u9.h0.j(r2, r5, r0, r1)
            throw r0
        L_0x0973:
            int r1 = r1 + -1
            goto L_0x0934
        L_0x0976:
            u9.x$o r3 = new u9.x$o
            r3.<init>(r0)
            goto L_0x097d
        L_0x097c:
            r3 = 0
        L_0x097d:
            if (r3 != 0) goto L_0x0980
            goto L_0x0983
        L_0x0980:
            if (r8 != 0) goto L_0x0995
            r8 = r3
        L_0x0983:
            int r6 = r6 + 1
            r0 = r23
            r1 = r24
            r3 = r16
            r4 = r17
            r13 = r18
            r7 = r19
            r10 = r20
            goto L_0x0181
        L_0x0995:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Multiple Retrofit annotations found, only one allowed."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r2, r1)
            throw r0
        L_0x09a1:
            r16 = r3
            r17 = r4
            r19 = r7
            r20 = r10
            goto L_0x09b3
        L_0x09aa:
            r16 = r3
            r17 = r4
            r19 = r7
            r20 = r10
            r8 = 0
        L_0x09b3:
            if (r8 != 0) goto L_0x09d0
            if (r9 == 0) goto L_0x09c4
            java.lang.Class r0 = u9.h0.e(r11)     // Catch:{ NoClassDefFoundError -> 0x09c4 }
            java.lang.Class<q8.d> r1 = q8.d.class
            if (r0 != r1) goto L_0x09c4
            r0 = 1
            r2.w = r0     // Catch:{ NoClassDefFoundError -> 0x09c4 }
            r8 = 0
            goto L_0x09d0
        L_0x09c4:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No Retrofit annotation found."
            java.lang.IllegalArgumentException r0 = u9.h0.j(r0, r5, r2, r1)
            throw r0
        L_0x09d0:
            r20[r5] = r8
            int r5 = r5 + 1
            r6 = 0
            r8 = 0
            r9 = 1
            r0 = r23
            r1 = r24
            r3 = r16
            r4 = r17
            r7 = r19
            goto L_0x016e
        L_0x09e3:
            r19 = r7
            java.lang.String r0 = r2.f12241r
            if (r0 != 0) goto L_0x0a00
            boolean r0 = r2.f12236m
            if (r0 == 0) goto L_0x09ee
            goto L_0x0a00
        L_0x09ee:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f12237n
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Missing either @%s URL or @Url parameter."
            r3 = 0
            java.lang.IllegalArgumentException r0 = u9.h0.i(r0, r3, r2, r1)
            throw r0
        L_0x0a00:
            boolean r0 = r2.f12239p
            if (r0 != 0) goto L_0x0a1e
            boolean r1 = r2.f12240q
            if (r1 != 0) goto L_0x0a1e
            boolean r1 = r2.f12238o
            if (r1 != 0) goto L_0x0a1e
            boolean r1 = r2.f12232h
            if (r1 != 0) goto L_0x0a11
            goto L_0x0a1e
        L_0x0a11:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Non-body HTTP method cannot contain @Body."
            r3 = 0
            java.lang.IllegalArgumentException r0 = u9.h0.i(r0, r3, r2, r1)
            throw r0
        L_0x0a1e:
            if (r0 == 0) goto L_0x0a32
            boolean r0 = r2.f12230f
            if (r0 == 0) goto L_0x0a25
            goto L_0x0a32
        L_0x0a25:
            java.lang.reflect.Method r0 = r2.f12226b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Form-encoded method must contain at least one @Field."
            r3 = 0
            java.lang.IllegalArgumentException r0 = u9.h0.i(r0, r3, r2, r1)
            throw r0
        L_0x0a32:
            r0 = 0
            r1 = 0
            boolean r3 = r2.f12240q
            if (r3 == 0) goto L_0x0a48
            boolean r3 = r2.f12231g
            if (r3 == 0) goto L_0x0a3d
            goto L_0x0a48
        L_0x0a3d:
            java.lang.reflect.Method r2 = r2.f12226b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "Multipart method must contain at least one @Part."
            java.lang.IllegalArgumentException r0 = u9.h0.i(r2, r1, r3, r0)
            throw r0
        L_0x0a48:
            u9.a0 r0 = new u9.a0
            r0.<init>(r2)
            java.lang.reflect.Type r1 = r24.getGenericReturnType()
            boolean r2 = u9.h0.g(r1)
            if (r2 != 0) goto L_0x0b70
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L_0x0b63
            java.lang.Class<u9.b0> r1 = u9.b0.class
            boolean r2 = r0.k
            java.lang.annotation.Annotation[] r3 = r24.getAnnotations()
            if (r2 == 0) goto L_0x0aba
            java.lang.reflect.Type[] r4 = r24.getGenericParameterTypes()
            int r5 = r4.length
            int r5 = r5 + -1
            r4 = r4[r5]
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            r5 = 0
            r4 = r4[r5]
            boolean r6 = r4 instanceof java.lang.reflect.WildcardType
            if (r6 == 0) goto L_0x0a83
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            r4 = r4[r5]
        L_0x0a83:
            java.lang.Class r6 = u9.h0.e(r4)
            if (r6 != r1) goto L_0x0a95
            boolean r6 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x0a95
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = u9.h0.d(r5, r4)
            r6 = 1
            goto L_0x0a96
        L_0x0a95:
            r6 = r5
        L_0x0a96:
            u9.h0$b r7 = new u9.h0$b
            java.lang.Class<u9.b> r8 = u9.b.class
            r9 = 1
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r9]
            r10[r5] = r4
            r4 = 0
            r7.<init>(r4, r8, r10)
            java.lang.Class<u9.f0> r4 = u9.f0.class
            boolean r4 = u9.h0.h(r3, r4)
            if (r4 == 0) goto L_0x0aac
            goto L_0x0abf
        L_0x0aac:
            int r4 = r3.length
            int r4 = r4 + r9
            java.lang.annotation.Annotation[] r4 = new java.lang.annotation.Annotation[r4]
            u9.g0 r8 = u9.g0.f12265a
            r4[r5] = r8
            int r8 = r3.length
            java.lang.System.arraycopy(r3, r5, r4, r9, r8)
            r3 = r4
            goto L_0x0abf
        L_0x0aba:
            java.lang.reflect.Type r7 = r24.getGenericReturnType()
            r6 = 0
        L_0x0abf:
            r4 = r23
            u9.c r3 = r4.a(r7, r3)     // Catch:{ RuntimeException -> 0x0b52 }
            java.lang.reflect.Type r5 = r3.b()
            java.lang.Class<j9.b0> r7 = j9.b0.class
            if (r5 == r7) goto L_0x0b2d
            if (r5 == r1) goto L_0x0b20
            java.lang.String r1 = r0.f12215c
            r7 = r19
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0aef
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0ae2
            goto L_0x0aef
        L_0x0ae2:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "HEAD method must use Void as response type."
            r2 = 0
            r8 = r24
            java.lang.IllegalArgumentException r0 = u9.h0.i(r8, r2, r1, r0)
            throw r0
        L_0x0aef:
            r8 = r24
            java.lang.annotation.Annotation[] r1 = r24.getAnnotations()
            u9.f r1 = r4.d(r5, r1)     // Catch:{ RuntimeException -> 0x0b11 }
            j9.d$a r4 = r4.f12252b
            if (r2 != 0) goto L_0x0b03
            u9.k$a r2 = new u9.k$a
            r2.<init>(r0, r4, r1, r3)
            goto L_0x0b10
        L_0x0b03:
            if (r6 == 0) goto L_0x0b0b
            u9.k$c r2 = new u9.k$c
            r2.<init>(r0, r4, r1, r3)
            goto L_0x0b10
        L_0x0b0b:
            u9.k$b r2 = new u9.k$b
            r2.<init>(r0, r4, r1, r3)
        L_0x0b10:
            return r2
        L_0x0b11:
            r0 = move-exception
            r1 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r5
            java.lang.String r2 = "Unable to create converter for %s"
            java.lang.IllegalArgumentException r0 = u9.h0.i(r8, r1, r2, r0)
            throw r0
        L_0x0b20:
            r8 = r24
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Response must include generic type (e.g., Response<String>)"
            r2 = 0
            java.lang.IllegalArgumentException r0 = u9.h0.i(r8, r2, r1, r0)
            throw r0
        L_0x0b2d:
            r8 = r24
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            java.lang.Class r1 = u9.h0.e(r5)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "' is not a valid response body type. Did you mean ResponseBody?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.IllegalArgumentException r0 = u9.h0.i(r8, r2, r0, r1)
            throw r0
        L_0x0b52:
            r0 = move-exception
            r8 = r24
            r1 = r0
            r0 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r7
            java.lang.String r0 = "Unable to create call adapter for %s"
            java.lang.IllegalArgumentException r0 = u9.h0.i(r8, r1, r0, r2)
            throw r0
        L_0x0b63:
            r8 = r24
            r0 = 0
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Service methods cannot return void."
            java.lang.IllegalArgumentException r0 = u9.h0.i(r8, r1, r2, r0)
            throw r0
        L_0x0b70:
            r8 = r24
            r0 = 1
            r2 = 0
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r1
            java.lang.String r1 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.IllegalArgumentException r0 = u9.h0.i(r8, r3, r1, r0)
            throw r0
        L_0x0b80:
            java.lang.reflect.Method r0 = r2.f12226b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
            java.lang.IllegalArgumentException r0 = u9.h0.i(r0, r8, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.e0.b(u9.d0, java.lang.reflect.Method):u9.k");
    }

    @Nullable
    public abstract T a(Object[] objArr);
}
