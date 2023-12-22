package z;

import android.util.TypedValue;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f13081a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z.b.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r38, android.content.res.XmlResourceParser r39, android.util.AttributeSet r40, android.content.res.Resources.Theme r41) {
        /*
            r0 = r38
            r1 = r40
            r2 = r41
            java.lang.String r3 = r39.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0394
            int r3 = r39.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L_0x0020:
            int r9 = r39.next()
            if (r9 == r4) goto L_0x0383
            int r10 = r39.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x0383
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x0374
            if (r10 > r3) goto L_0x0374
            java.lang.String r9 = r39.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x0374
        L_0x0042:
            int[] r9 = c.a.f2359r0
            if (r2 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004f:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = 31
            r15 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r10) goto L_0x008d
            java.lang.ThreadLocal<android.util.TypedValue> r10 = f13081a
            java.lang.Object r16 = r10.get()
            android.util.TypedValue r16 = (android.util.TypedValue) r16
            if (r16 != 0) goto L_0x006e
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r10.set(r12)
            goto L_0x0070
        L_0x006e:
            r12 = r16
        L_0x0070:
            r0.getValue(r13, r12, r4)
            int r10 = r12.type
            r12 = 28
            if (r10 < r12) goto L_0x007d
            if (r10 > r14) goto L_0x007d
            r10 = r4
            goto L_0x007e
        L_0x007d:
            r10 = r7
        L_0x007e:
            if (r10 != 0) goto L_0x008d
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008d }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x008d }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008d }
            goto L_0x0091
        L_0x008d:
            int r10 = r9.getColor(r7, r15)
        L_0x0091:
            boolean r12 = r9.hasValue(r4)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x009e
            float r11 = r9.getFloat(r4, r13)
            goto L_0x00aa
        L_0x009e:
            boolean r12 = r9.hasValue(r11)
            if (r12 == 0) goto L_0x00a9
            float r11 = r9.getFloat(r11, r13)
            goto L_0x00aa
        L_0x00a9:
            r11 = r13
        L_0x00aa:
            int r12 = android.os.Build.VERSION.SDK_INT
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r14) goto L_0x00b9
            r12 = 2
            boolean r14 = r9.hasValue(r12)
            if (r14 == 0) goto L_0x00b9
            r12 = 2
            goto L_0x00ba
        L_0x00b9:
            r12 = 4
        L_0x00ba:
            float r12 = r9.getFloat(r12, r15)
            r9.recycle()
            int r9 = r40.getAttributeCount()
            int[] r14 = new int[r9]
            r4 = r7
            r15 = r4
        L_0x00c9:
            if (r15 >= r9) goto L_0x00f9
            int r13 = r1.getAttributeNameResource(r15)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r13 == r7) goto L_0x00f1
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r13 == r7) goto L_0x00f1
            r7 = 2130903096(0x7f030038, float:1.7413E38)
            if (r13 == r7) goto L_0x00f1
            r7 = 2130903678(0x7f03027e, float:1.741418E38)
            if (r13 == r7) goto L_0x00f1
            int r7 = r4 + 1
            r0 = 0
            boolean r18 = r1.getAttributeBooleanValue(r15, r0)
            if (r18 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            int r13 = -r13
        L_0x00ee:
            r14[r4] = r13
            r4 = r7
        L_0x00f1:
            int r15 = r15 + 1
            r0 = r38
            r7 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c9
        L_0x00f9:
            int[] r0 = android.util.StateSet.trimStateSet(r14, r4)
            r4 = 0
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r9 = 1120403456(0x42c80000, float:100.0)
            if (r7 < 0) goto L_0x010a
            int r7 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x010a
            r7 = 1
            goto L_0x010b
        L_0x010a:
            r7 = 0
        L_0x010b:
            r13 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 != 0) goto L_0x011a
            if (r7 != 0) goto L_0x011a
            r33 = r3
            r21 = r5
            r7 = 1
            goto L_0x0339
        L_0x011a:
            int r13 = android.graphics.Color.alpha(r10)
            float r13 = (float) r13
            float r13 = r13 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r11
            int r11 = (int) r13
            r13 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = z5.c.e(r11, r14, r13)
            if (r7 == 0) goto L_0x032c
            z.a r7 = z.a.a(r10)
            float r10 = r7.f13075a
            float r7 = r7.f13076b
            z.l r13 = z.l.k
            double r14 = (double) r7
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            r18 = 1147261687(0x4461d2f7, float:903.2963)
            r19 = 1122500608(0x42e80000, float:116.0)
            r20 = 1098907648(0x41800000, float:16.0)
            if (r14 < 0) goto L_0x02c5
            int r14 = java.lang.Math.round(r12)
            r21 = r5
            double r4 = (double) r14
            r23 = 0
            int r4 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r4 <= 0) goto L_0x02c2
            int r4 = java.lang.Math.round(r12)
            double r4 = (double) r4
            r23 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r4 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r4 < 0) goto L_0x015f
            goto L_0x02c2
        L_0x015f:
            r4 = 0
            int r5 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0166
            r4 = 0
            goto L_0x016c
        L_0x0166:
            r4 = 1135869952(0x43b40000, float:360.0)
            float r4 = java.lang.Math.min(r4, r10)
        L_0x016c:
            r10 = r7
            r14 = r10
            r5 = 0
            r7 = 0
            r23 = 1
        L_0x0172:
            float r25 = r7 - r10
            float r25 = java.lang.Math.abs(r25)
            r26 = 1053609165(0x3ecccccd, float:0.4)
            int r25 = (r25 > r26 ? 1 : (r25 == r26 ? 0 : -1))
            if (r25 < 0) goto L_0x02b7
            r25 = 1148846080(0x447a0000, float:1000.0)
            r28 = r9
            r26 = r25
            r27 = r26
            r25 = 0
            r29 = 0
        L_0x018b:
            float r30 = r25 - r28
            float r30 = java.lang.Math.abs(r30)
            r31 = 1008981770(0x3c23d70a, float:0.01)
            int r30 = (r30 > r31 ? 1 : (r30 == r31 ? 0 : -1))
            r31 = 1073741824(0x40000000, float:2.0)
            if (r30 <= 0) goto L_0x027b
            float r30 = r28 - r25
            float r30 = r30 / r31
            float r15 = r30 + r25
            z.a r9 = z.a.b(r15, r14, r4)
            z.l r1 = z.l.k
            int r1 = r9.c(r1)
            int r9 = android.graphics.Color.red(r1)
            float r9 = c6.b.w(r9)
            int r32 = android.graphics.Color.green(r1)
            float r32 = c6.b.w(r32)
            int r33 = android.graphics.Color.blue(r1)
            float r33 = c6.b.w(r33)
            float[][] r34 = c6.b.u
            r16 = 1
            r34 = r34[r16]
            r17 = 0
            r35 = r34[r17]
            float r9 = r9 * r35
            r35 = r34[r16]
            float r32 = r32 * r35
            float r32 = r32 + r9
            r9 = 2
            r34 = r34[r9]
            float r33 = r33 * r34
            float r33 = r33 + r32
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r33 / r9
            r30 = 1007753895(0x3c111aa7, float:0.008856452)
            int r32 = (r2 > r30 ? 1 : (r2 == r30 ? 0 : -1))
            if (r32 > 0) goto L_0x01eb
            float r2 = r2 * r18
            r30 = r10
            goto L_0x01f7
        L_0x01eb:
            r30 = r10
            double r9 = (double) r2
            double r9 = java.lang.Math.cbrt(r9)
            float r2 = (float) r9
            float r2 = r2 * r19
            float r2 = r2 - r20
        L_0x01f7:
            float r9 = r12 - r2
            float r9 = java.lang.Math.abs(r9)
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x0250
            z.a r1 = z.a.a(r1)
            float r10 = r1.f13077c
            r33 = r3
            float r3 = r1.f13076b
            z.a r3 = z.a.b(r10, r3, r4)
            float r10 = r1.f13078d
            r34 = r4
            float r4 = r3.f13078d
            float r10 = r10 - r4
            float r4 = r1.f13079e
            r35 = r9
            float r9 = r3.f13079e
            float r4 = r4 - r9
            float r9 = r1.f13080f
            float r3 = r3.f13080f
            float r9 = r9 - r3
            float r10 = r10 * r10
            float r4 = r4 * r4
            float r4 = r4 + r10
            float r9 = r9 * r9
            float r9 = r9 + r4
            double r3 = (double) r9
            double r3 = java.lang.Math.sqrt(r3)
            r9 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            r36 = r14
            r37 = r15
            r14 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r3 = java.lang.Math.pow(r3, r14)
            double r3 = r3 * r9
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0258
            r29 = r1
            r27 = r3
            r26 = r35
            goto L_0x0258
        L_0x0250:
            r33 = r3
            r34 = r4
            r36 = r14
            r37 = r15
        L_0x0258:
            r1 = 0
            int r3 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0262
            int r3 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0262
            goto L_0x0284
        L_0x0262:
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0269
            r25 = r37
            goto L_0x026b
        L_0x0269:
            r28 = r37
        L_0x026b:
            r1 = r40
            r2 = r41
            r10 = r30
            r3 = r33
            r4 = r34
            r14 = r36
            r9 = 1120403456(0x42c80000, float:100.0)
            goto L_0x018b
        L_0x027b:
            r33 = r3
            r34 = r4
            r30 = r10
            r36 = r14
            r1 = 0
        L_0x0284:
            r2 = r29
            if (r23 == 0) goto L_0x029b
            if (r2 == 0) goto L_0x0290
            int r10 = r2.c(r13)
            goto L_0x0330
        L_0x0290:
            float r10 = r30 - r7
            float r10 = r10 / r31
            float r10 = r10 + r7
            r14 = r10
            r10 = r30
            r23 = 0
            goto L_0x02ab
        L_0x029b:
            if (r2 != 0) goto L_0x02a0
            r10 = r36
            goto L_0x02a5
        L_0x02a0:
            r5 = r2
            r10 = r30
            r7 = r36
        L_0x02a5:
            float r2 = r10 - r7
            float r2 = r2 / r31
            float r2 = r2 + r7
            r14 = r2
        L_0x02ab:
            r1 = r40
            r2 = r41
            r3 = r33
            r4 = r34
            r9 = 1120403456(0x42c80000, float:100.0)
            goto L_0x0172
        L_0x02b7:
            r33 = r3
            if (r5 != 0) goto L_0x02bc
            goto L_0x02c9
        L_0x02bc:
            int r10 = r5.c(r13)
            goto L_0x0330
        L_0x02c2:
            r33 = r3
            goto L_0x02c9
        L_0x02c5:
            r33 = r3
            r21 = r5
        L_0x02c9:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x02d2
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0330
        L_0x02d2:
            r1 = 1120272384(0x42c60000, float:99.0)
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x02db
            r7 = 1
            r10 = -1
            goto L_0x0331
        L_0x02db:
            float r1 = r12 + r20
            float r1 = r1 / r19
            r2 = 1090519040(0x41000000, float:8.0)
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x02e7
            r2 = 1
            goto L_0x02e8
        L_0x02e7:
            r2 = 0
        L_0x02e8:
            if (r2 == 0) goto L_0x02ee
            float r2 = r1 * r1
            float r2 = r2 * r1
            goto L_0x02f0
        L_0x02ee:
            float r2 = r12 / r18
        L_0x02f0:
            float r3 = r1 * r1
            float r3 = r3 * r1
            r4 = 1007753895(0x3c111aa7, float:0.008856452)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x02fc
            r4 = 1
            goto L_0x02fd
        L_0x02fc:
            r4 = 0
        L_0x02fd:
            if (r4 == 0) goto L_0x0301
            r5 = r3
            goto L_0x0307
        L_0x0301:
            float r5 = r1 * r19
            float r5 = r5 - r20
            float r5 = r5 / r18
        L_0x0307:
            if (r4 == 0) goto L_0x030a
            goto L_0x0310
        L_0x030a:
            float r1 = r1 * r19
            float r1 = r1 - r20
            float r3 = r1 / r18
        L_0x0310:
            float[] r1 = c6.b.f2487t
            r4 = 0
            r7 = r1[r4]
            float r5 = r5 * r7
            double r4 = (double) r5
            r7 = 1
            r9 = r1[r7]
            float r2 = r2 * r9
            double r9 = (double) r2
            r2 = 2
            r1 = r1[r2]
            float r3 = r3 * r1
            double r1 = (double) r3
            r22 = r4
            r24 = r9
            r26 = r1
            int r10 = a0.a.a(r22, r24, r26)
            goto L_0x0331
        L_0x032c:
            r33 = r3
            r21 = r5
        L_0x0330:
            r7 = 1
        L_0x0331:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r10
            int r2 = r11 << 24
            r10 = r1 | r2
        L_0x0339:
            int r1 = r8 + 1
            r5 = r21
            int r2 = r5.length
            r3 = 8
            if (r1 <= r2) goto L_0x0350
            r2 = 4
            if (r8 > r2) goto L_0x0347
            r2 = r3
            goto L_0x0349
        L_0x0347:
            int r2 = r8 * 2
        L_0x0349:
            int[] r2 = new int[r2]
            r4 = 0
            java.lang.System.arraycopy(r5, r4, r2, r4, r8)
            r5 = r2
        L_0x0350:
            r5[r8] = r10
            int r2 = r6.length
            if (r1 <= r2) goto L_0x036e
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r2 = r2.getComponentType()
            r4 = 4
            if (r8 > r4) goto L_0x0361
            goto L_0x0363
        L_0x0361:
            int r3 = r8 * 2
        L_0x0363:
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 0
            java.lang.System.arraycopy(r6, r3, r2, r3, r8)
            r6 = r2
        L_0x036e:
            r6[r8] = r0
            int[][] r6 = (int[][]) r6
            r8 = r1
            goto L_0x0377
        L_0x0374:
            r33 = r3
            r7 = r4
        L_0x0377:
            r0 = r38
            r1 = r40
            r2 = r41
            r4 = r7
            r3 = r33
            r7 = 0
            goto L_0x0020
        L_0x0383:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0394:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r39.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.b.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
