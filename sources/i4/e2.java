package i4;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class e2<T> implements m2<T> {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f7271o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    public static final Unsafe f7272p = h3.k();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f7273a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f7274b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7275c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7276d;

    /* renamed from: e  reason: collision with root package name */
    public final b2 f7277e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7278f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7279g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7280h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f7281i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7282j;
    public final int k;

    /* renamed from: l  reason: collision with root package name */
    public final p1 f7283l;

    /* renamed from: m  reason: collision with root package name */
    public final x2 f7284m;

    /* renamed from: n  reason: collision with root package name */
    public final q0 f7285n;

    public e2(int[] iArr, Object[] objArr, int i10, int i11, b2 b2Var, boolean z9, int[] iArr2, int i12, int i13, p1 p1Var, x2 x2Var, q0 q0Var, x1 x1Var) {
        this.f7273a = iArr;
        this.f7274b = objArr;
        this.f7275c = i10;
        this.f7276d = i11;
        this.f7279g = b2Var instanceof c1;
        this.f7280h = z9;
        this.f7278f = q0Var != null && q0Var.h(b2Var);
        this.f7281i = iArr2;
        this.f7282j = i12;
        this.k = i13;
        this.f7283l = p1Var;
        this.f7284m = x2Var;
        this.f7285n = q0Var;
        this.f7277e = b2Var;
    }

    public static boolean D(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof c1) {
            return ((c1) obj).n();
        }
        return true;
    }

    public static final void G(int i10, Object obj, m0 m0Var) {
        if (obj instanceof String) {
            m0Var.f7486a.P(i10, (String) obj);
            return;
        }
        m0Var.f(i10, (e0) obj);
    }

    public static y2 I(Object obj) {
        c1 c1Var = (c1) obj;
        y2 y2Var = c1Var.zzc;
        if (y2Var != y2.f7804f) {
            return y2Var;
        }
        y2 b10 = y2.b();
        c1Var.zzc = b10;
        return b10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0370  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i4.e2 J(i4.l2 r32, i4.p1 r33, i4.x2 r34, i4.q0 r35, i4.x1 r36) {
        /*
            int r0 = r32.zzc()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r1
        L_0x000b:
            java.lang.String r0 = r32.a()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f7271o
            r8 = r1
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0166
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r31 = r14
            r14 = r12
            r12 = r31
        L_0x0166:
            sun.misc.Unsafe r15 = f7272p
            java.lang.Object[] r17 = r32.b()
            i4.b2 r18 = r32.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r14 = r14 + r12
            r21 = r12
            r22 = r14
            r19 = 0
            r20 = 0
        L_0x0184:
            if (r4 >= r3) goto L_0x03c2
            int r23 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ac
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r23
            r23 = 13
        L_0x0194:
            int r25 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a6
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r4 = r4 | r2
            int r23 = r23 + 13
            r2 = r25
            goto L_0x0194
        L_0x01a6:
            int r2 = r2 << r23
            r4 = r4 | r2
            r2 = r25
            goto L_0x01ae
        L_0x01ac:
            r2 = r23
        L_0x01ae:
            int r23 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01db
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r23
            r23 = 13
        L_0x01bc:
            int r26 = r5 + 1
            char r5 = r0.charAt(r5)
            r27 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d5
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r23
            r2 = r2 | r3
            int r23 = r23 + 13
            r5 = r26
            r3 = r27
            goto L_0x01bc
        L_0x01d5:
            int r3 = r5 << r23
            r2 = r2 | r3
            r3 = r26
            goto L_0x01df
        L_0x01db:
            r27 = r3
            r3 = r23
        L_0x01df:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r23 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ed
            int r14 = r19 + 1
            r13[r19] = r20
            r19 = r14
        L_0x01ed:
            r14 = 51
            if (r5 < r14) goto L_0x0294
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r26 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0223
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r26
            r26 = 13
        L_0x0204:
            int r29 = r14 + 1
            char r14 = r0.charAt(r14)
            r30 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021d
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r26
            r3 = r3 | r12
            int r26 = r26 + 13
            r14 = r29
            r12 = r30
            goto L_0x0204
        L_0x021d:
            int r12 = r14 << r26
            r3 = r3 | r12
            r14 = r29
            goto L_0x0227
        L_0x0223:
            r30 = r12
            r14 = r26
        L_0x0227:
            int r12 = r5 + -51
            r26 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0248
            r14 = 17
            if (r12 != r14) goto L_0x0234
            goto L_0x0248
        L_0x0234:
            r14 = 12
            if (r12 != r14) goto L_0x0257
            if (r10 != 0) goto L_0x0257
            int r12 = r20 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r24 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0255
        L_0x0248:
            int r12 = r20 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r24 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0255:
            r16 = r14
        L_0x0257:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0261
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0269
        L_0x0261:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = s(r1, r12)
            r17[r3] = r12
        L_0x0269:
            r14 = r8
            r29 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r8 = (int) r8
            int r3 = r3 + 1
            r9 = r17[r3]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027c
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0284
        L_0x027c:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = s(r1, r9)
            r17[r3] = r9
        L_0x0284:
            r3 = r8
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r12 = r0
            r25 = r1
            r0 = r8
            r24 = 1
            r8 = r3
            r3 = 0
            goto L_0x038b
        L_0x0294:
            r14 = r8
            r29 = r9
            r30 = r12
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = s(r1, r9)
            r12 = 9
            if (r5 == r12) goto L_0x0309
            r12 = 17
            if (r5 != r12) goto L_0x02ac
            goto L_0x0309
        L_0x02ac:
            r12 = 27
            if (r5 == r12) goto L_0x02fb
            r12 = 49
            if (r5 != r12) goto L_0x02b5
            goto L_0x02fb
        L_0x02b5:
            r12 = 12
            if (r5 == r12) goto L_0x02e8
            r12 = 30
            if (r5 == r12) goto L_0x02e8
            r12 = 44
            if (r5 != r12) goto L_0x02c2
            goto L_0x02e8
        L_0x02c2:
            r12 = 50
            if (r5 != r12) goto L_0x02f8
            int r12 = r21 + 1
            r13[r21] = r20
            int r21 = r20 / 3
            int r21 = r21 + r21
            int r26 = r8 + 1
            r8 = r17[r8]
            r11[r21] = r8
            r8 = r2 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02e3
            int r8 = r26 + 1
            int r21 = r21 + 1
            r26 = r17[r26]
            r11[r21] = r26
            r21 = r12
            goto L_0x02f8
        L_0x02e3:
            r21 = r12
        L_0x02e5:
            r24 = 1
            goto L_0x0318
        L_0x02e8:
            if (r10 != 0) goto L_0x02f8
            int r12 = r20 / 3
            int r26 = r8 + 1
            int r12 = r12 + r12
            r24 = 1
            int r12 = r12 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02e5
        L_0x02f8:
            r24 = 1
            goto L_0x0316
        L_0x02fb:
            int r12 = r20 / 3
            int r26 = r8 + 1
            int r12 = r12 + r12
            r24 = 1
            int r12 = r12 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x0318
        L_0x0309:
            r24 = 1
            int r12 = r20 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r26 = r9.getType()
            r11[r12] = r26
        L_0x0316:
            r26 = r8
        L_0x0318:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r2 & 4096(0x1000, float:5.74E-42)
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x0370
            r9 = 17
            if (r5 > r9) goto L_0x0370
            int r9 = r3 + 1
            char r3 = r0.charAt(r3)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r12) goto L_0x034c
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
        L_0x0336:
            int r28 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0348
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r25
            r3 = r3 | r9
            int r25 = r25 + 13
            r9 = r28
            goto L_0x0336
        L_0x0348:
            int r9 = r9 << r25
            r3 = r3 | r9
            goto L_0x034e
        L_0x034c:
            r28 = r9
        L_0x034e:
            int r9 = r6 + r6
            int r25 = r3 / 32
            int r25 = r25 + r9
            r9 = r17[r25]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x035d
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0365
        L_0x035d:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = s(r1, r9)
            r17[r25] = r9
        L_0x0365:
            r12 = r0
            r25 = r1
            long r0 = r15.objectFieldOffset(r9)
            int r0 = (int) r0
            int r3 = r3 % 32
            goto L_0x0379
        L_0x0370:
            r12 = r0
            r25 = r1
            r28 = r3
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0379:
            r1 = 18
            if (r5 < r1) goto L_0x0387
            r1 = 49
            if (r5 > r1) goto L_0x0387
            int r1 = r22 + 1
            r13[r22] = r8
            r22 = r1
        L_0x0387:
            r16 = r26
            r26 = r28
        L_0x038b:
            int r1 = r20 + 1
            r7[r20] = r4
            int r4 = r1 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x0398
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0399
        L_0x0398:
            r9 = 0
        L_0x0399:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a0
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a1
        L_0x03a0:
            r2 = 0
        L_0x03a1:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r7[r1] = r2
            int r20 = r4 + 1
            int r1 = r3 << 20
            r0 = r0 | r1
            r7[r4] = r0
            r0 = r12
            r8 = r14
            r14 = r23
            r1 = r25
            r4 = r26
            r3 = r27
            r9 = r29
            r12 = r30
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0184
        L_0x03c2:
            r29 = r9
            r30 = r12
            r23 = r14
            r14 = r8
            i4.e2 r0 = new i4.e2
            i4.b2 r9 = r32.zza()
            r4 = r0
            r5 = r7
            r6 = r11
            r7 = r14
            r8 = r29
            r11 = r13
            r13 = r23
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.J(i4.l2, i4.p1, i4.x2, i4.q0, i4.x1):i4.e2");
    }

    public static int M(long j10, Object obj) {
        return ((Integer) h3.j(j10, obj)).intValue();
    }

    public static long l(long j10, Object obj) {
        return ((Long) h3.j(j10, obj)).longValue();
    }

    public static Field s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static void t(Object obj) {
        if (!D(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public final void A(Object obj, int i10, int i11, Object obj2) {
        f7272p.putObject(obj, (long) (k(i11) & 1048575), obj2);
        y(i10, i11, obj);
    }

    public final boolean B(Object obj, int i10, Object obj2) {
        return C(i10, obj) == C(i10, obj2);
    }

    public final boolean C(int i10, Object obj) {
        int i11 = this.f7273a[i10 + 2];
        long j10 = (long) (i11 & 1048575);
        if (j10 == 1048575) {
            int k10 = k(i10);
            long j11 = (long) (k10 & 1048575);
            switch ((k10 >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(h3.e(j11, obj)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(h3.f(j11, obj)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (h3.h(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (h3.h(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (h3.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (h3.h(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (h3.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return h3.u(j11, obj);
                case 8:
                    Object j12 = h3.j(j11, obj);
                    if (j12 instanceof String) {
                        if (!((String) j12).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(j12 instanceof e0)) {
                        throw new IllegalArgumentException();
                    } else if (!e0.f7269b.equals(j12)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (h3.j(j11, obj) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!e0.f7269b.equals(h3.j(j11, obj))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (h3.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (h3.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (h3.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (h3.h(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (h3.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (h3.h(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (h3.j(j11, obj) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((h3.g(j10, obj) & (1 << (i11 >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean E(int i10, int i11, Object obj) {
        if (h3.g((long) (this.f7273a[i11 + 2] & 1048575), obj) == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0449, code lost:
        r8 = r8 + 3;
        r6 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019b, code lost:
        i4.n2.q(r11, r6, r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a5, code lost:
        i4.n2.p(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b5, code lost:
        i4.n2.o(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c5, code lost:
        i4.n2.n(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d5, code lost:
        i4.n2.f(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e5, code lost:
        i4.n2.s(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(java.lang.Object r17, i4.m0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f7278f
            r4 = 0
            if (r3 != 0) goto L_0x045a
            int[] r3 = r0.f7273a
            int r3 = r3.length
            sun.misc.Unsafe r5 = f7272p
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r6
            r8 = 0
            r10 = 0
        L_0x0016:
            if (r8 >= r3) goto L_0x0450
            int r11 = r0.k(r8)
            int[] r12 = r0.f7273a
            r13 = r12[r8]
            int r14 = r11 >>> 20
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 17
            r7 = 1
            if (r14 > r15) goto L_0x003c
            int r15 = r8 + 2
            r12 = r12[r15]
            r15 = r12 & r6
            if (r15 == r9) goto L_0x0037
            long r9 = (long) r15
            int r10 = r5.getInt(r1, r9)
            r9 = r15
        L_0x0037:
            int r12 = r12 >>> 20
            int r12 = r7 << r12
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            r11 = r11 & r6
            long r6 = (long) r11
            switch(r14) {
                case 0: goto L_0x043d;
                case 1: goto L_0x0430;
                case 2: goto L_0x0423;
                case 3: goto L_0x0416;
                case 4: goto L_0x0409;
                case 5: goto L_0x03fc;
                case 6: goto L_0x03ef;
                case 7: goto L_0x03e2;
                case 8: goto L_0x03d4;
                case 9: goto L_0x03c2;
                case 10: goto L_0x03b2;
                case 11: goto L_0x03a4;
                case 12: goto L_0x0396;
                case 13: goto L_0x0388;
                case 14: goto L_0x037a;
                case 15: goto L_0x036c;
                case 16: goto L_0x035e;
                case 17: goto L_0x034c;
                case 18: goto L_0x033c;
                case 19: goto L_0x032c;
                case 20: goto L_0x031c;
                case 21: goto L_0x030c;
                case 22: goto L_0x02fc;
                case 23: goto L_0x02ec;
                case 24: goto L_0x02dc;
                case 25: goto L_0x02cc;
                case 26: goto L_0x02be;
                case 27: goto L_0x02ac;
                case 28: goto L_0x029e;
                case 29: goto L_0x0294;
                case 30: goto L_0x028d;
                case 31: goto L_0x0286;
                case 32: goto L_0x027f;
                case 33: goto L_0x0278;
                case 34: goto L_0x026b;
                case 35: goto L_0x025c;
                case 36: goto L_0x024d;
                case 37: goto L_0x023e;
                case 38: goto L_0x022f;
                case 39: goto L_0x0220;
                case 40: goto L_0x0210;
                case 41: goto L_0x0200;
                case 42: goto L_0x01f0;
                case 43: goto L_0x01e0;
                case 44: goto L_0x01d0;
                case 45: goto L_0x01c0;
                case 46: goto L_0x01b0;
                case 47: goto L_0x01a0;
                case 48: goto L_0x0190;
                case 49: goto L_0x017d;
                case 50: goto L_0x016e;
                case 51: goto L_0x0159;
                case 52: goto L_0x0144;
                case 53: goto L_0x0135;
                case 54: goto L_0x0126;
                case 55: goto L_0x0117;
                case 56: goto L_0x0108;
                case 57: goto L_0x00f9;
                case 58: goto L_0x00e4;
                case 59: goto L_0x00d5;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b1;
                case 62: goto L_0x00a2;
                case 63: goto L_0x0093;
                case 64: goto L_0x0084;
                case 65: goto L_0x0075;
                case 66: goto L_0x0066;
                case 67: goto L_0x0057;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x029b
        L_0x0044:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            java.lang.Object r6 = r5.getObject(r1, r6)
            i4.m2 r7 = r0.n(r8)
            r2.l(r13, r7, r6)
            goto L_0x029b
        L_0x0057:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            long r6 = l(r6, r1)
            r2.b(r13, r6)
            goto L_0x029b
        L_0x0066:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            int r6 = M(r6, r1)
            r2.a(r13, r6)
            goto L_0x029b
        L_0x0075:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            long r6 = l(r6, r1)
            r2.q(r13, r6)
            goto L_0x029b
        L_0x0084:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            int r6 = M(r6, r1)
            r2.p(r13, r6)
            goto L_0x029b
        L_0x0093:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            int r6 = M(r6, r1)
            r2.h(r13, r6)
            goto L_0x029b
        L_0x00a2:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            int r6 = M(r6, r1)
            r2.c(r13, r6)
            goto L_0x029b
        L_0x00b1:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            java.lang.Object r6 = r5.getObject(r1, r6)
            i4.e0 r6 = (i4.e0) r6
            r2.f(r13, r6)
            goto L_0x029b
        L_0x00c2:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            java.lang.Object r6 = r5.getObject(r1, r6)
            i4.m2 r7 = r0.n(r8)
            r2.o(r13, r7, r6)
            goto L_0x029b
        L_0x00d5:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            java.lang.Object r6 = r5.getObject(r1, r6)
            G(r13, r6, r2)
            goto L_0x029b
        L_0x00e4:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            java.lang.Object r6 = i4.h3.j(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r2.e(r13, r6)
            goto L_0x029b
        L_0x00f9:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            int r6 = M(r6, r1)
            r2.i(r13, r6)
            goto L_0x029b
        L_0x0108:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            long r6 = l(r6, r1)
            r2.j(r13, r6)
            goto L_0x029b
        L_0x0117:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            int r6 = M(r6, r1)
            r2.m(r13, r6)
            goto L_0x029b
        L_0x0126:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            long r6 = l(r6, r1)
            r2.d(r13, r6)
            goto L_0x029b
        L_0x0135:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            long r6 = l(r6, r1)
            r2.n(r13, r6)
            goto L_0x029b
        L_0x0144:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            java.lang.Object r6 = i4.h3.j(r6, r1)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r2.k(r13, r6)
            goto L_0x029b
        L_0x0159:
            boolean r11 = r0.E(r13, r8, r1)
            if (r11 == 0) goto L_0x029b
            java.lang.Object r6 = i4.h3.j(r6, r1)
            java.lang.Double r6 = (java.lang.Double) r6
            double r6 = r6.doubleValue()
            r2.g(r6, r13)
            goto L_0x029b
        L_0x016e:
            java.lang.Object r6 = r5.getObject(r1, r6)
            if (r6 != 0) goto L_0x0176
            goto L_0x029b
        L_0x0176:
            java.lang.Object r1 = r0.p(r8)
            i4.v1 r1 = (i4.v1) r1
            throw r4
        L_0x017d:
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.m2 r7 = r0.n(r8)
            i4.n2.j(r11, r6, r2, r7)
            goto L_0x029b
        L_0x0190:
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 1
        L_0x019b:
            i4.n2.q(r11, r6, r2, r12)
            goto L_0x029b
        L_0x01a0:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
        L_0x01a5:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.p(r11, r6, r2, r12)
            goto L_0x029b
        L_0x01b0:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
        L_0x01b5:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.o(r11, r6, r2, r12)
            goto L_0x029b
        L_0x01c0:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
        L_0x01c5:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.n(r11, r6, r2, r12)
            goto L_0x029b
        L_0x01d0:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
        L_0x01d5:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.f(r11, r6, r2, r12)
            goto L_0x029b
        L_0x01e0:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
        L_0x01e5:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.s(r11, r6, r2, r12)
            goto L_0x029b
        L_0x01f0:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.c(r11, r6, r2, r12)
            goto L_0x029b
        L_0x0200:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.g(r11, r6, r2, r12)
            goto L_0x029b
        L_0x0210:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.h(r11, r6, r2, r12)
            goto L_0x029b
        L_0x0220:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.k(r11, r6, r2, r12)
            goto L_0x029b
        L_0x022f:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.u(r11, r6, r2, r12)
            goto L_0x029b
        L_0x023e:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.l(r11, r6, r2, r12)
            goto L_0x029b
        L_0x024d:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.i(r11, r6, r2, r12)
            goto L_0x029b
        L_0x025c:
            r12 = 1
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.e(r11, r6, r2, r12)
            goto L_0x029b
        L_0x026b:
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 0
            goto L_0x019b
        L_0x0278:
            r12 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            goto L_0x01a5
        L_0x027f:
            r12 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            goto L_0x01b5
        L_0x0286:
            r12 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            goto L_0x01c5
        L_0x028d:
            r12 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            goto L_0x01d5
        L_0x0294:
            r12 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            goto L_0x01e5
        L_0x029b:
            r14 = 0
            goto L_0x0449
        L_0x029e:
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.d(r11, r6, r2)
            goto L_0x029b
        L_0x02ac:
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.m2 r7 = r0.n(r8)
            i4.n2.m(r11, r6, r2, r7)
            goto L_0x029b
        L_0x02be:
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.r(r11, r6, r2)
            goto L_0x029b
        L_0x02cc:
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            i4.n2.c(r11, r6, r2, r14)
            goto L_0x0449
        L_0x02dc:
            r14 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.g(r11, r6, r2, r14)
            goto L_0x0449
        L_0x02ec:
            r14 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.h(r11, r6, r2, r14)
            goto L_0x0449
        L_0x02fc:
            r14 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.k(r11, r6, r2, r14)
            goto L_0x0449
        L_0x030c:
            r14 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.u(r11, r6, r2, r14)
            goto L_0x0449
        L_0x031c:
            r14 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.l(r11, r6, r2, r14)
            goto L_0x0449
        L_0x032c:
            r14 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.i(r11, r6, r2, r14)
            goto L_0x0449
        L_0x033c:
            r14 = 0
            int[] r11 = r0.f7273a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            i4.n2.e(r11, r6, r2, r14)
            goto L_0x0449
        L_0x034c:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            java.lang.Object r6 = r5.getObject(r1, r6)
            i4.m2 r7 = r0.n(r8)
            r2.l(r13, r7, r6)
            goto L_0x0449
        L_0x035e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            long r6 = r5.getLong(r1, r6)
            r2.b(r13, r6)
            goto L_0x0449
        L_0x036c:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            int r6 = r5.getInt(r1, r6)
            r2.a(r13, r6)
            goto L_0x0449
        L_0x037a:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            long r6 = r5.getLong(r1, r6)
            r2.q(r13, r6)
            goto L_0x0449
        L_0x0388:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            int r6 = r5.getInt(r1, r6)
            r2.p(r13, r6)
            goto L_0x0449
        L_0x0396:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            int r6 = r5.getInt(r1, r6)
            r2.h(r13, r6)
            goto L_0x0449
        L_0x03a4:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            int r6 = r5.getInt(r1, r6)
            r2.c(r13, r6)
            goto L_0x0449
        L_0x03b2:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            java.lang.Object r6 = r5.getObject(r1, r6)
            i4.e0 r6 = (i4.e0) r6
            r2.f(r13, r6)
            goto L_0x0449
        L_0x03c2:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            java.lang.Object r6 = r5.getObject(r1, r6)
            i4.m2 r7 = r0.n(r8)
            r2.o(r13, r7, r6)
            goto L_0x0449
        L_0x03d4:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            java.lang.Object r6 = r5.getObject(r1, r6)
            G(r13, r6, r2)
            goto L_0x0449
        L_0x03e2:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            boolean r6 = i4.h3.u(r6, r1)
            r2.e(r13, r6)
            goto L_0x0449
        L_0x03ef:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            int r6 = r5.getInt(r1, r6)
            r2.i(r13, r6)
            goto L_0x0449
        L_0x03fc:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            long r6 = r5.getLong(r1, r6)
            r2.j(r13, r6)
            goto L_0x0449
        L_0x0409:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            int r6 = r5.getInt(r1, r6)
            r2.m(r13, r6)
            goto L_0x0449
        L_0x0416:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            long r6 = r5.getLong(r1, r6)
            r2.d(r13, r6)
            goto L_0x0449
        L_0x0423:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            long r6 = r5.getLong(r1, r6)
            r2.n(r13, r6)
            goto L_0x0449
        L_0x0430:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            float r6 = i4.h3.f(r6, r1)
            r2.k(r13, r6)
            goto L_0x0449
        L_0x043d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0449
            double r6 = i4.h3.e(r6, r1)
            r2.g(r6, r13)
        L_0x0449:
            int r8 = r8 + 3
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0016
        L_0x0450:
            i4.x2 r3 = r0.f7284m
            i4.y2 r1 = r3.d(r1)
            r3.r(r1, r2)
            return
        L_0x045a:
            i4.q0 r2 = r0.f7285n
            r2.a(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.F(java.lang.Object, i4.m0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x031a, code lost:
        if (r0 != r15) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0371, code lost:
        if (r0 != r15) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0128, code lost:
        r14 = r32;
        r21 = r2;
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0169, code lost:
        r14 = r32;
        r13 = r0;
        r21 = r2;
        r2 = r3;
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018c, code lost:
        r9.putObject(r14, r4, r6.f7751c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b5, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01fa, code lost:
        r9.putInt(r14, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fd, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0215, code lost:
        r9.putLong(r32, r4, r22);
        r11 = r11 | r24;
        r0 = r8;
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0239, code lost:
        r0 = r13 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0253, code lost:
        r11 = r11 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0256, code lost:
        r13 = r35;
        r1 = r36;
        r4 = r3;
        r3 = r7;
        r5 = r10;
        r2 = r21;
        r30 = r11;
        r11 = r6;
        r6 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0266, code lost:
        r6 = r36;
        r16 = r3;
        r27 = r7;
        r29 = r9;
        r2 = r13;
        r14 = r15;
        r28 = r18;
        r7 = r21;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int H(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, i4.w r37) {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r37
            t(r32)
            sun.misc.Unsafe r9 = f7272p
            r0 = r34
            r1 = r36
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L_0x001a:
            if (r0 >= r13) goto L_0x03fb
            int r2 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = i4.x.j(r0, r12, r2, r11)
            int r2 = r11.f7749a
            goto L_0x002e
        L_0x0029:
            r30 = r2
            r2 = r0
            r0 = r30
        L_0x002e:
            int r7 = r2 >>> 3
            r8 = r2 & 7
            r10 = 3
            if (r7 <= r3) goto L_0x0046
            int r4 = r4 / r10
            int r3 = r15.f7275c
            if (r7 < r3) goto L_0x0043
            int r3 = r15.f7276d
            if (r7 > r3) goto L_0x0043
            int r3 = r15.j(r7, r4)
            goto L_0x0044
        L_0x0043:
            r3 = -1
        L_0x0044:
            r4 = 0
            goto L_0x0056
        L_0x0046:
            int r3 = r15.f7275c
            if (r7 < r3) goto L_0x0054
            int r3 = r15.f7276d
            if (r7 > r3) goto L_0x0054
            r4 = 0
            int r3 = r15.j(r7, r4)
            goto L_0x0056
        L_0x0054:
            r4 = 0
            r3 = -1
        L_0x0056:
            r10 = -1
            if (r3 != r10) goto L_0x006b
            r16 = r4
            r28 = r16
            r11 = r6
            r27 = r7
            r29 = r9
            r19 = r10
            r14 = r15
            r6 = r1
            r7 = r2
            r10 = r5
            r2 = r0
            goto L_0x0395
        L_0x006b:
            int[] r1 = r15.f7273a
            int r18 = r3 + 1
            r10 = r1[r18]
            int r4 = r10 >>> 20
            r4 = r4 & 255(0xff, float:3.57E-43)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r10 & r16
            r20 = r10
            long r10 = (long) r13
            r13 = 17
            r21 = r10
            if (r4 > r13) goto L_0x0278
            int r11 = r3 + 2
            r1 = r1[r11]
            int r11 = r1 >>> 20
            r13 = 1
            int r11 = r13 << r11
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r13
            r24 = r11
            if (r1 == r5) goto L_0x00a1
            if (r5 == r13) goto L_0x009a
            long r10 = (long) r5
            r9.putInt(r14, r10, r6)
        L_0x009a:
            long r5 = (long) r1
            int r6 = r9.getInt(r14, r5)
            r10 = r1
            goto L_0x00a2
        L_0x00a1:
            r10 = r5
        L_0x00a2:
            r11 = r6
            r1 = 5
            r6 = r37
            switch(r4) {
                case 0: goto L_0x023c;
                case 1: goto L_0x0225;
                case 2: goto L_0x01ff;
                case 3: goto L_0x01ff;
                case 4: goto L_0x01ea;
                case 5: goto L_0x01cc;
                case 6: goto L_0x01b8;
                case 7: goto L_0x0193;
                case 8: goto L_0x0172;
                case 9: goto L_0x0142;
                case 10: goto L_0x0131;
                case 11: goto L_0x01ea;
                case 12: goto L_0x00fd;
                case 13: goto L_0x01b8;
                case 14: goto L_0x01cc;
                case 15: goto L_0x00ee;
                case 16: goto L_0x00d4;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            r13 = r0
            r21 = r2
            r0 = 3
            r18 = 0
            if (r8 != r0) goto L_0x0266
            java.lang.Object r8 = r15.q(r3, r14)
            i4.m2 r1 = r15.n(r3)
            int r0 = r7 << 3
            r5 = r0 | 4
            r0 = r8
            r2 = r33
            r4 = r3
            r3 = r13
            r13 = r4
            r4 = r35
            r6 = r37
            int r0 = i4.x.m(r0, r1, r2, r3, r4, r5, r6)
            r15.z(r14, r13, r8)
            r6 = r11 | r24
            r5 = r10
            r10 = r13
            goto L_0x02bf
        L_0x00d4:
            if (r8 != 0) goto L_0x0169
            r4 = r21
            int r0 = i4.x.l(r12, r0, r6)
            long r13 = r6.f7750b
            long r13 = i4.g0.g(r13)
            r8 = r0
            r21 = r2
            r2 = r3
            r22 = r13
            r18 = 0
            r14 = r32
            goto L_0x0215
        L_0x00ee:
            r4 = r21
            if (r8 != 0) goto L_0x0169
            int r0 = i4.x.i(r12, r0, r6)
            int r1 = r6.f7749a
            int r1 = i4.g0.f(r1)
            goto L_0x0128
        L_0x00fd:
            r4 = r21
            if (r8 != 0) goto L_0x0169
            int r0 = i4.x.i(r12, r0, r6)
            int r1 = r6.f7749a
            i4.e1 r8 = r15.m(r3)
            if (r8 == 0) goto L_0x0128
            boolean r8 = r8.zza()
            if (r8 == 0) goto L_0x0114
            goto L_0x0128
        L_0x0114:
            i4.y2 r4 = I(r32)
            long r13 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r4.c(r2, r1)
            r14 = r32
            r21 = r2
            r18 = 0
            goto L_0x0256
        L_0x0128:
            r14 = r32
            r21 = r2
            r2 = r3
            r18 = 0
            goto L_0x01fa
        L_0x0131:
            r4 = r21
            r1 = 2
            if (r8 != r1) goto L_0x0169
            int r0 = i4.x.a(r12, r0, r6)
            r14 = r32
            r21 = r2
            r2 = r3
            r18 = 0
            goto L_0x018c
        L_0x0142:
            r1 = 2
            if (r8 != r1) goto L_0x0169
            r14 = r32
            java.lang.Object r8 = r15.q(r3, r14)
            i4.m2 r1 = r15.n(r3)
            r13 = r0
            r0 = r8
            r5 = r2
            r2 = r33
            r4 = r3
            r3 = r13
            r13 = r4
            r18 = 0
            r4 = r35
            r21 = r5
            r5 = r37
            int r0 = i4.x.n(r0, r1, r2, r3, r4, r5)
            r15.z(r14, r13, r8)
            r3 = r13
            goto L_0x0253
        L_0x0169:
            r14 = r32
            r13 = r0
            r21 = r2
            r2 = r3
            r18 = 0
            goto L_0x01b5
        L_0x0172:
            r13 = r0
            r4 = r21
            r0 = 2
            r18 = 0
            r21 = r2
            r2 = r3
            if (r8 != r0) goto L_0x01b5
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x0188
            int r0 = i4.x.f(r12, r13, r6)
            goto L_0x018c
        L_0x0188:
            int r0 = i4.x.g(r12, r13, r6)
        L_0x018c:
            java.lang.Object r1 = r6.f7751c
            r9.putObject(r14, r4, r1)
            goto L_0x01fd
        L_0x0193:
            r13 = r0
            r4 = r21
            r18 = 0
            r21 = r2
            r2 = r3
            if (r8 != 0) goto L_0x01b5
            int r0 = i4.x.l(r12, r13, r6)
            r34 = r0
            long r0 = r6.f7750b
            r25 = 0
            int r0 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x01ad
            r0 = 1
            goto L_0x01af
        L_0x01ad:
            r0 = r18
        L_0x01af:
            i4.h3.m(r14, r4, r0)
            r0 = r34
            goto L_0x01fd
        L_0x01b5:
            r3 = r2
            goto L_0x0266
        L_0x01b8:
            r13 = r0
            r4 = r21
            r18 = 0
            r21 = r2
            r2 = r3
            if (r8 != r1) goto L_0x01b5
            int r0 = i4.x.b(r13, r12)
            r9.putInt(r14, r4, r0)
            r3 = r2
            goto L_0x0239
        L_0x01cc:
            r13 = r0
            r4 = r21
            r0 = 1
            r18 = 0
            r21 = r2
            r2 = r3
            if (r8 != r0) goto L_0x01b5
            long r22 = i4.x.o(r13, r12)
            r0 = r9
            r1 = r32
            r8 = r2
            r2 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r13 + 8
            r3 = r8
            goto L_0x0253
        L_0x01ea:
            r13 = r0
            r4 = r21
            r18 = 0
            r21 = r2
            r2 = r3
            if (r8 != 0) goto L_0x01b5
            int r0 = i4.x.i(r12, r13, r6)
            int r1 = r6.f7749a
        L_0x01fa:
            r9.putInt(r14, r4, r1)
        L_0x01fd:
            r3 = r2
            goto L_0x0253
        L_0x01ff:
            r13 = r0
            r4 = r21
            r18 = 0
            r21 = r2
            r2 = r3
            if (r8 != 0) goto L_0x01b5
            int r0 = i4.x.l(r12, r13, r6)
            r34 = r0
            long r0 = r6.f7750b
            r8 = r34
            r22 = r0
        L_0x0215:
            r0 = r9
            r1 = r32
            r13 = r2
            r2 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            r0 = r11 | r24
            r11 = r0
            r0 = r8
            r3 = r13
            goto L_0x0256
        L_0x0225:
            r13 = r0
            r4 = r21
            r18 = 0
            r21 = r2
            if (r8 != r1) goto L_0x0266
            int r0 = i4.x.b(r13, r12)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            i4.h3.p(r14, r4, r0)
        L_0x0239:
            int r0 = r13 + 4
            goto L_0x0253
        L_0x023c:
            r13 = r0
            r4 = r21
            r0 = 1
            r18 = 0
            r21 = r2
            if (r8 != r0) goto L_0x0266
            long r0 = i4.x.o(r13, r12)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            i4.h3.o(r14, r4, r0)
            int r0 = r13 + 8
        L_0x0253:
            r1 = r11 | r24
            r11 = r1
        L_0x0256:
            r13 = r35
            r1 = r36
            r4 = r3
            r3 = r7
            r5 = r10
            r2 = r21
            r30 = r11
            r11 = r6
            r6 = r30
            goto L_0x001a
        L_0x0266:
            r6 = r36
            r16 = r3
            r27 = r7
            r29 = r9
            r2 = r13
            r14 = r15
            r28 = r18
            r7 = r21
            r19 = -1
            goto L_0x0395
        L_0x0278:
            r13 = r0
            r10 = r21
            r18 = 0
            r21 = r2
            r0 = 27
            if (r4 != r0) goto L_0x02dc
            r0 = 2
            if (r8 != r0) goto L_0x02cb
            java.lang.Object r0 = r9.getObject(r14, r10)
            i4.f1 r0 = (i4.f1) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x02a3
            int r1 = r0.size()
            if (r1 != 0) goto L_0x029b
            r1 = 10
            goto L_0x029c
        L_0x029b:
            int r1 = r1 + r1
        L_0x029c:
            i4.f1 r0 = r0.c(r1)
            r9.putObject(r14, r10, r0)
        L_0x02a3:
            r8 = r0
            i4.m2 r0 = r15.n(r3)
            r1 = r21
            r2 = r33
            r10 = r3
            r3 = r13
            r4 = r35
            r22 = r5
            r5 = r8
            r23 = r6
            r6 = r37
            int r0 = i4.x.d(r0, r1, r2, r3, r4, r5, r6)
            r5 = r22
            r6 = r23
        L_0x02bf:
            r13 = r35
            r1 = r36
            r11 = r37
            r3 = r7
            r4 = r10
            r2 = r21
            goto L_0x001a
        L_0x02cb:
            r22 = r5
            r23 = r6
            r26 = r3
            r27 = r7
            r29 = r9
            r15 = r13
            r28 = r18
            r19 = -1
            goto L_0x0338
        L_0x02dc:
            r22 = r5
            r23 = r6
            r6 = r3
            r0 = 49
            if (r4 > r0) goto L_0x031e
            r5 = r20
            long r2 = (long) r5
            r0 = r31
            r1 = r32
            r24 = r2
            r2 = r33
            r3 = r13
            r5 = r4
            r4 = r35
            r20 = r5
            r5 = r21
            r26 = r6
            r6 = r7
            r27 = r7
            r19 = -1
            r7 = r8
            r8 = r26
            r28 = r18
            r17 = r10
            r11 = r9
            r9 = r24
            r29 = r11
            r11 = r20
            r15 = r13
            r12 = r17
            r14 = r37
            int r0 = r0.Q(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r31
            r16 = r26
            if (r0 == r15) goto L_0x038c
            goto L_0x0373
        L_0x031e:
            r26 = r6
            r27 = r7
            r29 = r9
            r15 = r13
            r28 = r18
            r5 = r20
            r19 = -1
            r20 = r4
            r17 = r10
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L_0x034b
            r0 = 2
            if (r8 == r0) goto L_0x033e
        L_0x0338:
            r14 = r31
            r0 = r15
            r16 = r26
            goto L_0x038c
        L_0x033e:
            r14 = r31
            r15 = r32
            r10 = r17
            r13 = r26
            r14.N(r15, r13, r10)
            r12 = 0
            throw r12
        L_0x034b:
            r12 = 0
            r14 = r31
            r7 = r15
            r10 = r17
            r13 = r26
            r15 = r32
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r7
            r4 = r35
            r16 = r5
            r5 = r21
            r6 = r27
            r15 = r7
            r7 = r8
            r8 = r16
            r12 = r13
            r16 = r13
            r13 = r37
            int r0 = r0.O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x038c
        L_0x0373:
            r12 = r33
            r13 = r35
            r1 = r36
            r11 = r37
            r15 = r14
            r4 = r16
            r2 = r21
            r5 = r22
            r6 = r23
            r3 = r27
            r9 = r29
            r14 = r32
            goto L_0x001a
        L_0x038c:
            r6 = r36
            r2 = r0
            r7 = r21
            r10 = r22
            r11 = r23
        L_0x0395:
            if (r7 != r6) goto L_0x03a2
            if (r6 == 0) goto L_0x03a2
            r12 = r32
            r0 = r2
            r1 = r6
            r2 = r7
            r5 = r10
            r6 = r11
            goto L_0x0403
        L_0x03a2:
            boolean r0 = r14.f7278f
            if (r0 == 0) goto L_0x03d4
            r8 = r37
            i4.p0 r0 = r8.f7752d
            i4.p0 r1 = i4.p0.f7582b
            if (r0 == r1) goto L_0x03d1
            i4.b2 r1 = r14.f7277e
            r9 = r27
            i4.b1 r0 = r0.a(r1, r9)
            if (r0 != 0) goto L_0x03ca
            i4.y2 r4 = I(r32)
            r0 = r7
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = i4.x.h(r0, r1, r2, r3, r4, r5)
            r12 = r32
            goto L_0x03e9
        L_0x03ca:
            r12 = r32
            r0 = r12
            i4.a1 r0 = (i4.a1) r0
            r3 = 0
            throw r3
        L_0x03d1:
            r12 = r32
            goto L_0x03d8
        L_0x03d4:
            r12 = r32
            r8 = r37
        L_0x03d8:
            r9 = r27
            i4.y2 r4 = I(r32)
            r0 = r7
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = i4.x.h(r0, r1, r2, r3, r4, r5)
        L_0x03e9:
            r13 = r35
            r1 = r6
            r2 = r7
            r3 = r9
            r5 = r10
            r6 = r11
            r15 = r14
            r4 = r16
            r9 = r29
            r11 = r8
            r14 = r12
            r12 = r33
            goto L_0x001a
        L_0x03fb:
            r22 = r5
            r23 = r6
            r29 = r9
            r12 = r14
            r14 = r15
        L_0x0403:
            r3 = 0
            r4 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r4) goto L_0x040f
            long r4 = (long) r5
            r7 = r29
            r7.putInt(r12, r4, r6)
        L_0x040f:
            int r4 = r14.f7282j
        L_0x0411:
            int r5 = r14.k
            if (r4 >= r5) goto L_0x041f
            int[] r5 = r14.f7281i
            r5 = r5[r4]
            r14.o(r12, r5, r3)
            int r4 = r4 + 1
            goto L_0x0411
        L_0x041f:
            r3 = r35
            if (r1 != 0) goto L_0x042b
            if (r0 != r3) goto L_0x0426
            goto L_0x042f
        L_0x0426:
            i4.i1 r0 = i4.i1.d()
            throw r0
        L_0x042b:
            if (r0 > r3) goto L_0x0430
            if (r2 != r1) goto L_0x0430
        L_0x042f:
            return r0
        L_0x0430:
            i4.i1 r0 = i4.i1.d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.H(java.lang.Object, byte[], int, int, int, i4.w):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b2, code lost:
        r3 = i4.l0.V(r11, (i4.b2) r2.getObject(r1, r3), n(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c9, code lost:
        r3 = i4.l0.D((r3 >> 63) ^ (r3 + r3)) + i4.l0.C(r11 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x030e, code lost:
        r3 = i4.l0.C(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0321, code lost:
        r3 = i4.n2.J(r11, n(r5), r2.getObject(r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x033b, code lost:
        r4 = i4.l0.C(r11 << 3);
        r3 = ((i4.e0) r3).g();
        r6 = r6 + ((i4.l0.C(r3) + r3) + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0361, code lost:
        r3 = i4.l0.C(r11 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0377, code lost:
        r3 = r2.getInt(r1, r3);
        r4 = i4.l0.C(r11 << 3);
        r3 = i4.l0.W(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0385, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0390, code lost:
        r3 = r2.getLong(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0394, code lost:
        r3 = i4.l0.D(r3) + i4.l0.C(r11 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03a4, code lost:
        r3 = i4.l0.C(r11 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03b1, code lost:
        r3 = i4.l0.C(r11 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b9, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03ba, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        r3 = i4.l0.C(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        r4 = i4.l0.C(r11 << 3);
        r3 = ((i4.e0) r3).g();
        r9 = (i4.l0.C(r3) + r3) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f6, code lost:
        r3 = M(r3, r1);
        r4 = i4.l0.C(r11 << 3);
        r3 = i4.l0.W(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0113, code lost:
        r3 = l(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0201, code lost:
        r9 = (i4.l0.C(r3) + i4.l0.B(r11)) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020b, code lost:
        r6 = r6 + r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int K(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f7272p
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r3
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000c:
            int[] r9 = r0.f7273a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x03c1
            int r9 = r15.k(r5)
            int[] r10 = r0.f7273a
            r11 = r10[r5]
            int r12 = r9 >>> 20
            r12 = r12 & 255(0xff, float:3.57E-43)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0035
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r10 = r10 >>> 20
            int r10 = r14 << r10
            if (r13 == r7) goto L_0x0036
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
            goto L_0x0036
        L_0x0035:
            r10 = 0
        L_0x0036:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x03ad;
                case 1: goto L_0x03a0;
                case 2: goto L_0x038c;
                case 3: goto L_0x0387;
                case 4: goto L_0x0373;
                case 5: goto L_0x036e;
                case 6: goto L_0x0369;
                case 7: goto L_0x035d;
                case 8: goto L_0x032f;
                case 9: goto L_0x031d;
                case 10: goto L_0x0314;
                case 11: goto L_0x0300;
                case 12: goto L_0x02fa;
                case 13: goto L_0x02f4;
                case 14: goto L_0x02ee;
                case 15: goto L_0x02da;
                case 16: goto L_0x02c2;
                case 17: goto L_0x02ae;
                case 18: goto L_0x02a2;
                case 19: goto L_0x0296;
                case 20: goto L_0x028a;
                case 21: goto L_0x027e;
                case 22: goto L_0x0272;
                case 23: goto L_0x02a2;
                case 24: goto L_0x0296;
                case 25: goto L_0x0266;
                case 26: goto L_0x025a;
                case 27: goto L_0x024a;
                case 28: goto L_0x023e;
                case 29: goto L_0x0232;
                case 30: goto L_0x0226;
                case 31: goto L_0x0296;
                case 32: goto L_0x02a2;
                case 33: goto L_0x021a;
                case 34: goto L_0x020e;
                case 35: goto L_0x01f5;
                case 36: goto L_0x01e8;
                case 37: goto L_0x01db;
                case 38: goto L_0x01ce;
                case 39: goto L_0x01c1;
                case 40: goto L_0x01b4;
                case 41: goto L_0x01a7;
                case 42: goto L_0x019a;
                case 43: goto L_0x018c;
                case 44: goto L_0x017e;
                case 45: goto L_0x0170;
                case 46: goto L_0x0162;
                case 47: goto L_0x0154;
                case 48: goto L_0x0146;
                case 49: goto L_0x0136;
                case 50: goto L_0x0129;
                case 51: goto L_0x0121;
                case 52: goto L_0x0119;
                case 53: goto L_0x010d;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f0;
                case 56: goto L_0x00e9;
                case 57: goto L_0x00e2;
                case 58: goto L_0x00da;
                case 59: goto L_0x00aa;
                case 60: goto L_0x00a2;
                case 61: goto L_0x0097;
                case 62: goto L_0x0081;
                case 63: goto L_0x0079;
                case 64: goto L_0x0071;
                case 65: goto L_0x0069;
                case 66: goto L_0x0053;
                case 67: goto L_0x0047;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x03ba
        L_0x003f:
            boolean r9 = r15.E(r11, r5, r1)
            if (r9 == 0) goto L_0x03ba
            goto L_0x02b2
        L_0x0047:
            boolean r10 = r15.E(r11, r5, r1)
            if (r10 == 0) goto L_0x03ba
            long r3 = l(r3, r1)
            goto L_0x02c9
        L_0x0053:
            boolean r9 = r15.E(r11, r5, r1)
            if (r9 == 0) goto L_0x03ba
            int r3 = M(r3, r1)
            int r4 = r11 << 3
            int r4 = i4.l0.C(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            goto L_0x0091
        L_0x0069:
            boolean r3 = r15.E(r11, r5, r1)
            if (r3 == 0) goto L_0x03ba
            goto L_0x0127
        L_0x0071:
            boolean r3 = r15.E(r11, r5, r1)
            if (r3 == 0) goto L_0x03ba
            goto L_0x011f
        L_0x0079:
            boolean r9 = r15.E(r11, r5, r1)
            if (r9 == 0) goto L_0x03ba
            goto L_0x00f6
        L_0x0081:
            boolean r9 = r15.E(r11, r5, r1)
            if (r9 == 0) goto L_0x03ba
            int r3 = M(r3, r1)
            int r4 = r11 << 3
            int r4 = i4.l0.C(r4)
        L_0x0091:
            int r3 = i4.l0.C(r3)
            goto L_0x0385
        L_0x0097:
            boolean r9 = r15.E(r11, r5, r1)
            if (r9 == 0) goto L_0x03ba
            java.lang.Object r3 = r2.getObject(r1, r3)
            goto L_0x00b8
        L_0x00a2:
            boolean r9 = r15.E(r11, r5, r1)
            if (r9 == 0) goto L_0x03ba
            goto L_0x0321
        L_0x00aa:
            boolean r9 = r15.E(r11, r5, r1)
            if (r9 == 0) goto L_0x03ba
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof i4.e0
            if (r4 == 0) goto L_0x00cc
        L_0x00b8:
            i4.e0 r3 = (i4.e0) r3
            int r4 = r11 << 3
            int r4 = i4.l0.C(r4)
            int r3 = r3.g()
            int r9 = i4.l0.C(r3)
            int r9 = r9 + r3
            int r9 = r9 + r4
            goto L_0x020b
        L_0x00cc:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = i4.l0.C(r4)
            int r3 = i4.l0.A(r3)
            goto L_0x0385
        L_0x00da:
            boolean r3 = r15.E(r11, r5, r1)
            if (r3 == 0) goto L_0x03ba
            goto L_0x0361
        L_0x00e2:
            boolean r3 = r15.E(r11, r5, r1)
            if (r3 == 0) goto L_0x03ba
            goto L_0x011f
        L_0x00e9:
            boolean r3 = r15.E(r11, r5, r1)
            if (r3 == 0) goto L_0x03ba
            goto L_0x0127
        L_0x00f0:
            boolean r9 = r15.E(r11, r5, r1)
            if (r9 == 0) goto L_0x03ba
        L_0x00f6:
            int r3 = M(r3, r1)
            int r4 = r11 << 3
            int r4 = i4.l0.C(r4)
            int r3 = i4.l0.W(r3)
            goto L_0x0385
        L_0x0106:
            boolean r9 = r15.E(r11, r5, r1)
            if (r9 == 0) goto L_0x03ba
            goto L_0x0113
        L_0x010d:
            boolean r9 = r15.E(r11, r5, r1)
            if (r9 == 0) goto L_0x03ba
        L_0x0113:
            long r3 = l(r3, r1)
            goto L_0x0394
        L_0x0119:
            boolean r3 = r15.E(r11, r5, r1)
            if (r3 == 0) goto L_0x03ba
        L_0x011f:
            goto L_0x03a4
        L_0x0121:
            boolean r3 = r15.E(r11, r5, r1)
            if (r3 == 0) goto L_0x03ba
        L_0x0127:
            goto L_0x03b1
        L_0x0129:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r15.p(r5)
            i4.x1.a(r3, r4)
            goto L_0x03ba
        L_0x0136:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            i4.m2 r4 = r15.n(r5)
            int r3 = i4.n2.E(r11, r3, r4)
            goto L_0x03b9
        L_0x0146:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.O(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x0154:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.M(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x0162:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.D(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x0170:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.B(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x017e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.z(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x018c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.R(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x019a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.w(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x01a7:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.B(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x01b4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.D(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x01c1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.G(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x01ce:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.T(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x01db:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.I(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x01e8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.B(r3)
            if (r3 <= 0) goto L_0x03ba
            goto L_0x0201
        L_0x01f5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.D(r3)
            if (r3 <= 0) goto L_0x03ba
        L_0x0201:
            int r4 = i4.l0.B(r11)
            int r9 = i4.l0.C(r3)
            int r9 = r9 + r4
            int r9 = r9 + r3
        L_0x020b:
            int r6 = r6 + r9
            goto L_0x03ba
        L_0x020e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.N(r11, r3)
            goto L_0x03b9
        L_0x021a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.L(r11, r3)
            goto L_0x03b9
        L_0x0226:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.y(r11, r3)
            goto L_0x03b9
        L_0x0232:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.Q(r11, r3)
            goto L_0x03b9
        L_0x023e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.x(r3, r11)
            goto L_0x03b9
        L_0x024a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            i4.m2 r4 = r15.n(r5)
            int r3 = i4.n2.K(r11, r3, r4)
            goto L_0x03b9
        L_0x025a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.P(r3, r11)
            goto L_0x03b9
        L_0x0266:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.t(r11, r3)
            goto L_0x03b9
        L_0x0272:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.F(r11, r3)
            goto L_0x03b9
        L_0x027e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.S(r11, r3)
            goto L_0x03b9
        L_0x028a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.H(r11, r3)
            goto L_0x03b9
        L_0x0296:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.A(r11, r3)
            goto L_0x03b9
        L_0x02a2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.C(r11, r3)
            goto L_0x03b9
        L_0x02ae:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03ba
        L_0x02b2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            i4.b2 r3 = (i4.b2) r3
            i4.m2 r4 = r15.n(r5)
            int r3 = i4.l0.V(r11, r3, r4)
            goto L_0x03b9
        L_0x02c2:
            r10 = r10 & r8
            if (r10 == 0) goto L_0x03ba
            long r3 = r2.getLong(r1, r3)
        L_0x02c9:
            int r10 = r11 << 3
            int r10 = i4.l0.C(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = i4.l0.D(r3)
            int r3 = r3 + r10
            goto L_0x03b9
        L_0x02da:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03ba
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = i4.l0.C(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            goto L_0x030e
        L_0x02ee:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03ba
            goto L_0x03b1
        L_0x02f4:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03ba
            goto L_0x03a4
        L_0x02fa:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03ba
            goto L_0x0377
        L_0x0300:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03ba
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = i4.l0.C(r4)
        L_0x030e:
            int r3 = i4.l0.C(r3)
            goto L_0x0385
        L_0x0314:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03ba
            java.lang.Object r3 = r2.getObject(r1, r3)
            goto L_0x033b
        L_0x031d:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03ba
        L_0x0321:
            java.lang.Object r3 = r2.getObject(r1, r3)
            i4.m2 r4 = r15.n(r5)
            int r3 = i4.n2.J(r11, r4, r3)
            goto L_0x03b9
        L_0x032f:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03ba
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof i4.e0
            if (r4 == 0) goto L_0x0350
        L_0x033b:
            i4.e0 r3 = (i4.e0) r3
            int r4 = r11 << 3
            int r4 = i4.l0.C(r4)
            int r3 = r3.g()
            int r9 = i4.l0.C(r3)
            int r9 = r9 + r3
            int r9 = r9 + r4
            int r6 = r6 + r9
            goto L_0x03ba
        L_0x0350:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = i4.l0.C(r4)
            int r3 = i4.l0.A(r3)
            goto L_0x0385
        L_0x035d:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03ba
        L_0x0361:
            int r3 = r11 << 3
            int r3 = i4.l0.C(r3)
            int r3 = r3 + r14
            goto L_0x03b9
        L_0x0369:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03ba
            goto L_0x03a4
        L_0x036e:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03ba
            goto L_0x03b1
        L_0x0373:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03ba
        L_0x0377:
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = i4.l0.C(r4)
            int r3 = i4.l0.W(r3)
        L_0x0385:
            int r3 = r3 + r4
            goto L_0x03b9
        L_0x0387:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03ba
            goto L_0x0390
        L_0x038c:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03ba
        L_0x0390:
            long r3 = r2.getLong(r1, r3)
        L_0x0394:
            int r9 = r11 << 3
            int r9 = i4.l0.C(r9)
            int r3 = i4.l0.D(r3)
            int r3 = r3 + r9
            goto L_0x03b9
        L_0x03a0:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03ba
        L_0x03a4:
            int r3 = r11 << 3
            int r3 = i4.l0.C(r3)
            int r3 = r3 + 4
            goto L_0x03b9
        L_0x03ad:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03ba
        L_0x03b1:
            int r3 = r11 << 3
            int r3 = i4.l0.C(r3)
            int r3 = r3 + 8
        L_0x03b9:
            int r6 = r6 + r3
        L_0x03ba:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x03c1:
            i4.x2 r2 = r0.f7284m
            i4.y2 r3 = r2.d(r1)
            int r2 = r2.a(r3)
            int r2 = r2 + r6
            boolean r3 = r0.f7278f
            if (r3 != 0) goto L_0x03d1
            return r2
        L_0x03d1:
            i4.q0 r2 = r0.f7285n
            r2.a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.K(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0285, code lost:
        r4 = i4.l0.C(r5 << 3);
        r3 = i4.l0.D((r6 >> 63) ^ (r6 + r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02a0, code lost:
        r4 = i4.l0.C(r5 << 3);
        r3 = (r3 >> 31) ^ (r3 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ce, code lost:
        r4 = i4.l0.C(r5 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02d4, code lost:
        r3 = i4.l0.C(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02e0, code lost:
        r3 = i4.h3.j(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02eb, code lost:
        r3 = i4.n2.J(r5, n(r1), i4.h3.j(r6, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0305, code lost:
        if ((r3 instanceof i4.e0) != false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0307, code lost:
        r4 = i4.l0.C(r5 << 3);
        r3 = ((i4.e0) r3).g();
        r5 = (i4.l0.C(r3) + r3) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0319, code lost:
        r2 = r2 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x031c, code lost:
        r4 = i4.l0.C(r5 << 3);
        r3 = i4.l0.A((java.lang.String) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x032f, code lost:
        r3 = i4.l0.C(r5 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034c, code lost:
        r3 = i4.h3.g(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0350, code lost:
        r4 = i4.l0.C(r5 << 3);
        r3 = i4.l0.W(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x035a, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0369, code lost:
        r3 = i4.h3.h(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x036d, code lost:
        r3 = i4.l0.D(r3) + i4.l0.C(r5 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x037f, code lost:
        r3 = i4.l0.C(r5 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x038e, code lost:
        r3 = i4.l0.C(r5 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0396, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0397, code lost:
        r1 = r1 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        if ((r3 instanceof i4.e0) != false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b8, code lost:
        r3 = M(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r3 = l(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b9, code lost:
        r5 = (i4.l0.C(r3) + i4.l0.B(r5)) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x026b, code lost:
        r3 = i4.l0.V(r5, (i4.b2) i4.h3.j(r6, r11), n(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int L(java.lang.Object r11) {
        /*
            r10 = this;
            sun.misc.Unsafe r0 = f7272p
            r1 = 0
            r2 = r1
        L_0x0004:
            int[] r3 = r10.f7273a
            int r3 = r3.length
            if (r1 >= r3) goto L_0x039b
            int r3 = r10.k(r1)
            int r4 = r3 >>> 20
            r4 = r4 & 255(0xff, float:3.57E-43)
            int[] r5 = r10.f7273a
            r5 = r5[r1]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r6
            long r6 = (long) r3
            i4.v0 r3 = i4.v0.DOUBLE_LIST_PACKED
            int r3 = r3.zza()
            if (r4 < r3) goto L_0x0030
            i4.v0 r3 = i4.v0.SINT64_LIST_PACKED
            int r3 = r3.zza()
            if (r4 > r3) goto L_0x0030
            int[] r3 = r10.f7273a
            int r8 = r1 + 2
            r3 = r3[r8]
        L_0x0030:
            r3 = 63
            switch(r4) {
                case 0: goto L_0x0388;
                case 1: goto L_0x0379;
                case 2: goto L_0x0363;
                case 3: goto L_0x035c;
                case 4: goto L_0x0346;
                case 5: goto L_0x033f;
                case 6: goto L_0x0338;
                case 7: goto L_0x0329;
                case 8: goto L_0x02f9;
                case 9: goto L_0x02e5;
                case 10: goto L_0x02da;
                case 11: goto L_0x02c4;
                case 12: goto L_0x02bc;
                case 13: goto L_0x02b4;
                case 14: goto L_0x02ac;
                case 15: goto L_0x0296;
                case 16: goto L_0x027b;
                case 17: goto L_0x0265;
                case 18: goto L_0x0259;
                case 19: goto L_0x024d;
                case 20: goto L_0x0241;
                case 21: goto L_0x0235;
                case 22: goto L_0x0229;
                case 23: goto L_0x0259;
                case 24: goto L_0x024d;
                case 25: goto L_0x021d;
                case 26: goto L_0x0211;
                case 27: goto L_0x0201;
                case 28: goto L_0x01f5;
                case 29: goto L_0x01e9;
                case 30: goto L_0x01dd;
                case 31: goto L_0x024d;
                case 32: goto L_0x0259;
                case 33: goto L_0x01d1;
                case 34: goto L_0x01c5;
                case 35: goto L_0x01ad;
                case 36: goto L_0x01a0;
                case 37: goto L_0x0193;
                case 38: goto L_0x0186;
                case 39: goto L_0x0179;
                case 40: goto L_0x016c;
                case 41: goto L_0x015f;
                case 42: goto L_0x0152;
                case 43: goto L_0x0144;
                case 44: goto L_0x0136;
                case 45: goto L_0x0128;
                case 46: goto L_0x011a;
                case 47: goto L_0x010c;
                case 48: goto L_0x00fe;
                case 49: goto L_0x00ee;
                case 50: goto L_0x00e1;
                case 51: goto L_0x00d9;
                case 52: goto L_0x00d1;
                case 53: goto L_0x00c5;
                case 54: goto L_0x00be;
                case 55: goto L_0x00b2;
                case 56: goto L_0x00aa;
                case 57: goto L_0x00a2;
                case 58: goto L_0x009a;
                case 59: goto L_0x008a;
                case 60: goto L_0x0082;
                case 61: goto L_0x007a;
                case 62: goto L_0x006e;
                case 63: goto L_0x0067;
                case 64: goto L_0x005f;
                case 65: goto L_0x0057;
                case 66: goto L_0x004b;
                case 67: goto L_0x003f;
                case 68: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0397
        L_0x0037:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x026b
        L_0x003f:
            boolean r4 = r10.E(r5, r1, r11)
            if (r4 == 0) goto L_0x0397
            long r6 = l(r6, r11)
            goto L_0x0285
        L_0x004b:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            int r3 = M(r6, r11)
            goto L_0x02a0
        L_0x0057:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x038e
        L_0x005f:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x037f
        L_0x0067:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x00b8
        L_0x006e:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            int r3 = M(r6, r11)
            goto L_0x02ce
        L_0x007a:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x02e0
        L_0x0082:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x02eb
        L_0x008a:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            java.lang.Object r3 = i4.h3.j(r6, r11)
            boolean r4 = r3 instanceof i4.e0
            if (r4 == 0) goto L_0x031c
            goto L_0x0307
        L_0x009a:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x032f
        L_0x00a2:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x037f
        L_0x00aa:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x038e
        L_0x00b2:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
        L_0x00b8:
            int r3 = M(r6, r11)
            goto L_0x0350
        L_0x00be:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x00cb
        L_0x00c5:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
        L_0x00cb:
            long r3 = l(r6, r11)
            goto L_0x036d
        L_0x00d1:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x037f
        L_0x00d9:
            boolean r3 = r10.E(r5, r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x038e
        L_0x00e1:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.lang.Object r4 = r10.p(r1)
            i4.x1.a(r3, r4)
            goto L_0x0397
        L_0x00ee:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            i4.m2 r4 = r10.n(r1)
            int r3 = i4.n2.E(r5, r3, r4)
            goto L_0x0396
        L_0x00fe:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.O(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x010c:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.M(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x011a:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.D(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x0128:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.B(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x0136:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.z(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x0144:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.R(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x0152:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.w(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x015f:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.B(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x016c:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.D(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x0179:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.G(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x0186:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.T(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x0193:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.I(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x01a0:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.B(r3)
            if (r3 <= 0) goto L_0x0397
            goto L_0x01b9
        L_0x01ad:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.D(r3)
            if (r3 <= 0) goto L_0x0397
        L_0x01b9:
            int r4 = i4.l0.B(r5)
            int r5 = i4.l0.C(r3)
            int r5 = r5 + r4
            int r5 = r5 + r3
            goto L_0x0319
        L_0x01c5:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.N(r5, r3)
            goto L_0x0396
        L_0x01d1:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.L(r5, r3)
            goto L_0x0396
        L_0x01dd:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.y(r5, r3)
            goto L_0x0396
        L_0x01e9:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.Q(r5, r3)
            goto L_0x0396
        L_0x01f5:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.x(r3, r5)
            goto L_0x0396
        L_0x0201:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            i4.m2 r4 = r10.n(r1)
            int r3 = i4.n2.K(r5, r3, r4)
            goto L_0x0396
        L_0x0211:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.P(r3, r5)
            goto L_0x0396
        L_0x021d:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.t(r5, r3)
            goto L_0x0396
        L_0x0229:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.F(r5, r3)
            goto L_0x0396
        L_0x0235:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.S(r5, r3)
            goto L_0x0396
        L_0x0241:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.H(r5, r3)
            goto L_0x0396
        L_0x024d:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.A(r5, r3)
            goto L_0x0396
        L_0x0259:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = i4.n2.C(r5, r3)
            goto L_0x0396
        L_0x0265:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
        L_0x026b:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            i4.b2 r3 = (i4.b2) r3
            i4.m2 r4 = r10.n(r1)
            int r3 = i4.l0.V(r5, r3, r4)
            goto L_0x0396
        L_0x027b:
            boolean r4 = r10.C(r1, r11)
            if (r4 == 0) goto L_0x0397
            long r6 = i4.h3.h(r6, r11)
        L_0x0285:
            int r4 = r5 << 3
            int r4 = i4.l0.C(r4)
            long r8 = r6 + r6
            long r5 = r6 >> r3
            long r5 = r5 ^ r8
            int r3 = i4.l0.D(r5)
            goto L_0x035a
        L_0x0296:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
            int r3 = i4.h3.g(r6, r11)
        L_0x02a0:
            int r4 = r5 << 3
            int r4 = i4.l0.C(r4)
            int r5 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r5
            goto L_0x02d4
        L_0x02ac:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x038e
        L_0x02b4:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x037f
        L_0x02bc:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x034c
        L_0x02c4:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
            int r3 = i4.h3.g(r6, r11)
        L_0x02ce:
            int r4 = r5 << 3
            int r4 = i4.l0.C(r4)
        L_0x02d4:
            int r3 = i4.l0.C(r3)
            goto L_0x035a
        L_0x02da:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
        L_0x02e0:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            goto L_0x0307
        L_0x02e5:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
        L_0x02eb:
            java.lang.Object r3 = i4.h3.j(r6, r11)
            i4.m2 r4 = r10.n(r1)
            int r3 = i4.n2.J(r5, r4, r3)
            goto L_0x0396
        L_0x02f9:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
            java.lang.Object r3 = i4.h3.j(r6, r11)
            boolean r4 = r3 instanceof i4.e0
            if (r4 == 0) goto L_0x031c
        L_0x0307:
            i4.e0 r3 = (i4.e0) r3
            int r4 = r5 << 3
            int r4 = i4.l0.C(r4)
            int r3 = r3.g()
            int r5 = i4.l0.C(r3)
            int r5 = r5 + r3
            int r5 = r5 + r4
        L_0x0319:
            int r2 = r2 + r5
            goto L_0x0397
        L_0x031c:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r5 << 3
            int r4 = i4.l0.C(r4)
            int r3 = i4.l0.A(r3)
            goto L_0x035a
        L_0x0329:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
        L_0x032f:
            int r3 = r5 << 3
            int r3 = i4.l0.C(r3)
            int r3 = r3 + 1
            goto L_0x0396
        L_0x0338:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x037f
        L_0x033f:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x038e
        L_0x0346:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
        L_0x034c:
            int r3 = i4.h3.g(r6, r11)
        L_0x0350:
            int r4 = r5 << 3
            int r4 = i4.l0.C(r4)
            int r3 = i4.l0.W(r3)
        L_0x035a:
            int r3 = r3 + r4
            goto L_0x0396
        L_0x035c:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
            goto L_0x0369
        L_0x0363:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
        L_0x0369:
            long r3 = i4.h3.h(r6, r11)
        L_0x036d:
            int r5 = r5 << 3
            int r5 = i4.l0.C(r5)
            int r3 = i4.l0.D(r3)
            int r3 = r3 + r5
            goto L_0x0396
        L_0x0379:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
        L_0x037f:
            int r3 = r5 << 3
            int r3 = i4.l0.C(r3)
            int r3 = r3 + 4
            goto L_0x0396
        L_0x0388:
            boolean r3 = r10.C(r1, r11)
            if (r3 == 0) goto L_0x0397
        L_0x038e:
            int r3 = r5 << 3
            int r3 = i4.l0.C(r3)
            int r3 = r3 + 8
        L_0x0396:
            int r2 = r2 + r3
        L_0x0397:
            int r1 = r1 + 3
            goto L_0x0004
        L_0x039b:
            i4.x2 r0 = r10.f7284m
            i4.y2 r11 = r0.d(r11)
            int r11 = r0.a(r11)
            int r11 = r11 + r2
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.L(java.lang.Object):int");
    }

    public final void N(Object obj, int i10, long j10) {
        Unsafe unsafe = f7272p;
        Object p5 = p(i10);
        Object object = unsafe.getObject(obj, j10);
        if (x1.b(object)) {
            w1 c10 = w1.b().c();
            x1.c(c10, object);
            unsafe.putObject(obj, j10, c10);
        }
        v1 v1Var = (v1) p5;
        throw null;
    }

    public final int O(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, w wVar) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        long j11 = j10;
        int i22 = i17;
        w wVar2 = wVar;
        Unsafe unsafe = f7272p;
        long j12 = (long) (this.f7273a[i22 + 2] & 1048575);
        switch (i16) {
            case 51:
                if (i21 == 1) {
                    unsafe.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(x.o(i18, bArr2))));
                    unsafe.putInt(obj2, j12, i20);
                    return i18 + 8;
                }
                break;
            case 52:
                if (i21 == 5) {
                    unsafe.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(x.b(i18, bArr2))));
                    unsafe.putInt(obj2, j12, i20);
                    return i18 + 4;
                }
                break;
            case 53:
            case 54:
                if (i21 == 0) {
                    int l6 = x.l(bArr2, i18, wVar2);
                    unsafe.putObject(obj2, j11, Long.valueOf(wVar2.f7750b));
                    unsafe.putInt(obj2, j12, i20);
                    return l6;
                }
                break;
            case 55:
            case 62:
                if (i21 == 0) {
                    int i23 = x.i(bArr2, i18, wVar2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(wVar2.f7749a));
                    unsafe.putInt(obj2, j12, i20);
                    return i23;
                }
                break;
            case 56:
            case 65:
                if (i21 == 1) {
                    unsafe.putObject(obj2, j11, Long.valueOf(x.o(i18, bArr2)));
                    unsafe.putInt(obj2, j12, i20);
                    return i18 + 8;
                }
                break;
            case 57:
            case 64:
                if (i21 == 5) {
                    unsafe.putObject(obj2, j11, Integer.valueOf(x.b(i18, bArr2)));
                    unsafe.putInt(obj2, j12, i20);
                    return i18 + 4;
                }
                break;
            case 58:
                if (i21 == 0) {
                    int l10 = x.l(bArr2, i18, wVar2);
                    unsafe.putObject(obj2, j11, Boolean.valueOf(wVar2.f7750b != 0));
                    unsafe.putInt(obj2, j12, i20);
                    return l10;
                }
                break;
            case 59:
                if (i21 == 2) {
                    int i24 = x.i(bArr2, i18, wVar2);
                    int i25 = wVar2.f7749a;
                    if (i25 == 0) {
                        unsafe.putObject(obj2, j11, "");
                    } else if ((i15 & 536870912) == 0 || m3.d(bArr2, i24, i24 + i25)) {
                        unsafe.putObject(obj2, j11, new String(bArr2, i24, i25, g1.f7324a));
                        i24 += i25;
                    } else {
                        throw i1.b();
                    }
                    unsafe.putInt(obj2, j12, i20);
                    return i24;
                }
                break;
            case 60:
                if (i21 == 2) {
                    Object r4 = r(i20, i22, obj2);
                    int n2 = x.n(r4, n(i22), bArr, i10, i11, wVar);
                    A(obj2, i20, i22, r4);
                    return n2;
                }
                break;
            case 61:
                if (i21 == 2) {
                    int a10 = x.a(bArr2, i18, wVar2);
                    unsafe.putObject(obj2, j11, wVar2.f7751c);
                    unsafe.putInt(obj2, j12, i20);
                    return a10;
                }
                break;
            case 63:
                if (i21 == 0) {
                    int i26 = x.i(bArr2, i18, wVar2);
                    int i27 = wVar2.f7749a;
                    e1 m2 = m(i22);
                    if (m2 == null || m2.zza()) {
                        unsafe.putObject(obj2, j11, Integer.valueOf(i27));
                        unsafe.putInt(obj2, j12, i20);
                    } else {
                        I(obj).c(i19, Long.valueOf((long) i27));
                    }
                    return i26;
                }
                break;
            case 66:
                if (i21 == 0) {
                    int i28 = x.i(bArr2, i18, wVar2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(g0.f(wVar2.f7749a)));
                    unsafe.putInt(obj2, j12, i20);
                    return i28;
                }
                break;
            case 67:
                if (i21 == 0) {
                    int l11 = x.l(bArr2, i18, wVar2);
                    unsafe.putObject(obj2, j11, Long.valueOf(g0.g(wVar2.f7750b)));
                    unsafe.putInt(obj2, j12, i20);
                    return l11;
                }
                break;
            case 68:
                if (i21 == 3) {
                    Object r10 = r(i20, i22, obj2);
                    int m8 = x.m(r10, n(i22), bArr, i10, i11, (i19 & -8) | 4, wVar);
                    A(obj2, i20, i22, r10);
                    return m8;
                }
                break;
        }
        return i18;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0349, code lost:
        if (r0 != r14) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014b, code lost:
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014e, code lost:
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016a, code lost:
        r7.putObject(r14, r8, r11.f7751c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0170, code lost:
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0171, code lost:
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a5, code lost:
        r1 = r19 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d4, code lost:
        r1 = r11.f7749a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d6, code lost:
        r7.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x020d, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x020e, code lost:
        r1 = r0;
        r0 = r19 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0215, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0216, code lost:
        r5 = r6;
        r8 = r10;
        r6 = r0;
        r0 = r13;
        r13 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021d, code lost:
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x023b, code lost:
        r13 = r35;
        r5 = r6;
        r9 = r7;
        r2 = r10;
        r8 = r24;
        r7 = -1;
        r10 = 0;
        r6 = r1;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0249, code lost:
        r2 = r4;
        r29 = r7;
        r15 = r14;
        r26 = r19;
        r17 = -1;
        r18 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P(java.lang.Object r32, byte[] r33, int r34, int r35, i4.w r36) {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            t(r32)
            sun.misc.Unsafe r9 = f7272p
            r10 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r7 = -1
            r0 = r34
            r1 = r7
            r5 = r8
            r2 = r10
            r6 = r2
        L_0x001a:
            if (r0 >= r13) goto L_0x037f
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = i4.x.j(r0, r12, r3, r11)
            int r3 = r11.f7749a
            r4 = r0
            r16 = r3
            goto L_0x002f
        L_0x002c:
            r16 = r0
            r4 = r3
        L_0x002f:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            if (r3 <= r1) goto L_0x0044
            int r2 = r2 / 3
            int r1 = r15.f7275c
            if (r3 < r1) goto L_0x0051
            int r1 = r15.f7276d
            if (r3 > r1) goto L_0x0051
            int r1 = r15.j(r3, r2)
            goto L_0x0052
        L_0x0044:
            int r1 = r15.f7275c
            if (r3 < r1) goto L_0x0051
            int r1 = r15.f7276d
            if (r3 > r1) goto L_0x0051
            int r1 = r15.j(r3, r10)
            goto L_0x0052
        L_0x0051:
            r1 = r7
        L_0x0052:
            r2 = r1
            if (r2 != r7) goto L_0x0064
            r23 = r3
            r2 = r4
            r26 = r6
            r17 = r7
            r29 = r9
            r18 = r10
            r15 = r14
            r6 = r5
            goto L_0x0355
        L_0x0064:
            int[] r1 = r15.f7273a
            int r17 = r2 + 1
            r10 = r1[r17]
            int r7 = r10 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r34 = r3
            r3 = r10 & r8
            r19 = r9
            long r8 = (long) r3
            r3 = 17
            if (r7 > r3) goto L_0x0255
            int r3 = r2 + 2
            r1 = r1[r3]
            int r3 = r1 >>> 20
            r13 = 1
            int r22 = r13 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            r20 = r4
            if (r1 == r5) goto L_0x00a5
            if (r5 == r3) goto L_0x0096
            long r3 = (long) r5
            r5 = r19
            r5.putInt(r14, r3, r6)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0098
        L_0x0096:
            r5 = r19
        L_0x0098:
            if (r1 == r3) goto L_0x00a0
            long r3 = (long) r1
            int r3 = r5.getInt(r14, r3)
            r6 = r3
        L_0x00a0:
            r4 = r5
            r19 = r6
            r6 = r1
            goto L_0x00aa
        L_0x00a5:
            r4 = r19
            r19 = r6
            r6 = r5
        L_0x00aa:
            r1 = 5
            switch(r7) {
                case 0: goto L_0x021f;
                case 1: goto L_0x01f5;
                case 2: goto L_0x01da;
                case 3: goto L_0x01da;
                case 4: goto L_0x01c5;
                case 5: goto L_0x01a9;
                case 6: goto L_0x0191;
                case 7: goto L_0x0174;
                case 8: goto L_0x0150;
                case 9: goto L_0x0127;
                case 10: goto L_0x0115;
                case 11: goto L_0x01c5;
                case 12: goto L_0x0102;
                case 13: goto L_0x0191;
                case 14: goto L_0x01a9;
                case 15: goto L_0x00e9;
                case 16: goto L_0x00b9;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            r23 = r34
            r10 = r2
            r7 = r4
            r4 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0249
        L_0x00b9:
            if (r0 != 0) goto L_0x00de
            r5 = r20
            int r7 = i4.x.l(r12, r5, r11)
            long r0 = r11.f7750b
            long r20 = i4.g0.g(r0)
            r0 = r4
            r1 = r32
            r23 = r34
            r13 = r2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r8
            r10 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            r0 = r19 | r22
            r1 = r7
            r7 = r10
            r10 = r13
            goto L_0x0215
        L_0x00de:
            r23 = r34
            r13 = r2
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            goto L_0x0170
        L_0x00e9:
            r23 = r34
            r13 = r2
            r10 = r4
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != 0) goto L_0x014e
            int r0 = i4.x.i(r12, r5, r11)
            int r1 = r11.f7749a
            int r1 = i4.g0.f(r1)
            r7 = r10
            r10 = r13
            goto L_0x01d6
        L_0x0102:
            r23 = r34
            r13 = r2
            r10 = r4
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != 0) goto L_0x014e
            int r0 = i4.x.i(r12, r5, r11)
            r7 = r10
            r10 = r13
            goto L_0x01d4
        L_0x0115:
            r23 = r34
            r13 = r2
            r10 = r4
            r5 = r20
            r1 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x014e
            int r0 = i4.x.a(r12, r5, r11)
            r7 = r10
            goto L_0x016a
        L_0x0127:
            r23 = r34
            r13 = r2
            r10 = r4
            r5 = r20
            r1 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x014e
            java.lang.Object r7 = r15.q(r13, r14)
            i4.m2 r1 = r15.n(r13)
            r0 = r7
            r2 = r33
            r3 = r5
            r4 = r35
            r5 = r36
            int r0 = i4.x.n(r0, r1, r2, r3, r4, r5)
            r15.z(r14, r13, r7)
            r7 = r10
        L_0x014b:
            r10 = r13
            goto L_0x020e
        L_0x014e:
            r7 = r10
            goto L_0x0170
        L_0x0150:
            r23 = r34
            r13 = r2
            r7 = r4
            r5 = r20
            r1 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0170
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r10
            if (r0 != 0) goto L_0x0166
            int r0 = i4.x.f(r12, r5, r11)
            goto L_0x016a
        L_0x0166:
            int r0 = i4.x.g(r12, r5, r11)
        L_0x016a:
            java.lang.Object r1 = r11.f7751c
            r7.putObject(r14, r8, r1)
            goto L_0x014b
        L_0x0170:
            r10 = r13
        L_0x0171:
            r13 = r5
            goto L_0x021d
        L_0x0174:
            r23 = r34
            r10 = r2
            r7 = r4
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != 0) goto L_0x0171
            int r0 = i4.x.l(r12, r5, r11)
            long r1 = r11.f7750b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018c
            goto L_0x018d
        L_0x018c:
            r13 = 0
        L_0x018d:
            i4.h3.m(r14, r8, r13)
            goto L_0x01a5
        L_0x0191:
            r23 = r34
            r10 = r2
            r7 = r4
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0171
            int r0 = i4.x.b(r5, r12)
            r7.putInt(r14, r8, r0)
            int r0 = r5 + 4
        L_0x01a5:
            r1 = r19 | r22
            goto L_0x023b
        L_0x01a9:
            r23 = r34
            r10 = r2
            r7 = r4
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r13) goto L_0x0171
            long r20 = i4.x.o(r5, r12)
            r0 = r7
            r1 = r32
            r2 = r8
            r13 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r4 = r13 + 8
            goto L_0x020d
        L_0x01c5:
            r23 = r34
            r10 = r2
            r7 = r4
            r13 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != 0) goto L_0x021d
            int r0 = i4.x.i(r12, r13, r11)
        L_0x01d4:
            int r1 = r11.f7749a
        L_0x01d6:
            r7.putInt(r14, r8, r1)
            goto L_0x020e
        L_0x01da:
            r23 = r34
            r10 = r2
            r7 = r4
            r13 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != 0) goto L_0x021d
            int r13 = i4.x.l(r12, r13, r11)
            long r4 = r11.f7750b
            r0 = r7
            r1 = r32
            r2 = r8
            r0.putLong(r1, r2, r4)
            r0 = r19 | r22
            goto L_0x0216
        L_0x01f5:
            r23 = r34
            r10 = r2
            r7 = r4
            r13 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x021d
            int r0 = i4.x.b(r13, r12)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            i4.h3.p(r14, r8, r0)
            int r4 = r13 + 4
        L_0x020d:
            r0 = r4
        L_0x020e:
            r1 = r19 | r22
            r30 = r1
            r1 = r0
            r0 = r30
        L_0x0215:
            r13 = r1
        L_0x0216:
            r5 = r6
            r8 = r10
            r6 = r0
            r0 = r13
            r13 = r7
            goto L_0x0299
        L_0x021d:
            r4 = r13
            goto L_0x0249
        L_0x021f:
            r23 = r34
            r10 = r2
            r7 = r4
            r4 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r13) goto L_0x0249
            long r0 = i4.x.o(r4, r12)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            i4.h3.o(r14, r8, r0)
            int r4 = r4 + 8
            r0 = r19 | r22
            r1 = r0
            r0 = r4
        L_0x023b:
            r13 = r35
            r5 = r6
            r9 = r7
            r2 = r10
            r8 = r24
            r7 = -1
            r10 = 0
            r6 = r1
            r1 = r23
            goto L_0x001a
        L_0x0249:
            r2 = r4
            r29 = r7
            r15 = r14
            r26 = r19
            r17 = -1
            r18 = 0
            goto L_0x0355
        L_0x0255:
            r23 = r34
            r3 = r2
            r13 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r7 != r1) goto L_0x02b4
            r1 = 2
            if (r0 != r1) goto L_0x02a5
            java.lang.Object r0 = r13.getObject(r14, r8)
            i4.f1 r0 = (i4.f1) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0281
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0279
            r1 = 10
            goto L_0x027a
        L_0x0279:
            int r1 = r1 + r1
        L_0x027a:
            i4.f1 r0 = r0.c(r1)
            r13.putObject(r14, r8, r0)
        L_0x0281:
            r7 = r0
            i4.m2 r0 = r15.n(r3)
            r1 = r16
            r2 = r33
            r8 = r3
            r3 = r4
            r4 = r35
            r9 = r5
            r5 = r7
            r7 = r6
            r6 = r36
            int r0 = i4.x.d(r0, r1, r2, r3, r4, r5, r6)
            r6 = r7
            r5 = r9
        L_0x0299:
            r2 = r8
            r9 = r13
            r1 = r23
            r8 = r24
            r7 = -1
            r10 = 0
            r13 = r35
            goto L_0x001a
        L_0x02a5:
            r34 = r3
            r15 = r4
            r25 = r5
            r26 = r6
            r29 = r13
            r17 = -1
            r18 = 0
            goto L_0x0314
        L_0x02b4:
            r1 = 49
            if (r7 > r1) goto L_0x02f9
            long r1 = (long) r10
            r10 = r0
            r0 = r31
            r19 = r1
            r1 = r32
            r2 = r33
            r34 = r3
            r3 = r4
            r15 = r4
            r4 = r35
            r25 = r5
            r5 = r16
            r26 = r6
            r6 = r23
            r22 = r7
            r17 = -1
            r7 = r10
            r9 = r8
            r8 = r34
            r27 = r9
            r18 = 0
            r9 = r19
            r11 = r22
            r29 = r13
            r12 = r27
            r14 = r36
            int r0 = r0.Q(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02f2
            r15 = r32
            r19 = r34
            goto L_0x034b
        L_0x02f2:
            r15 = r32
            r19 = r34
        L_0x02f6:
            r4 = r0
            goto L_0x0350
        L_0x02f9:
            r34 = r3
            r15 = r4
            r25 = r5
            r26 = r6
            r22 = r7
            r27 = r8
            r29 = r13
            r17 = -1
            r18 = 0
            r7 = r0
            r0 = 50
            r9 = r22
            if (r9 != r0) goto L_0x0327
            r0 = 2
            if (r7 == r0) goto L_0x031a
        L_0x0314:
            r19 = r34
            r4 = r15
            r15 = r32
            goto L_0x0350
        L_0x031a:
            r14 = r31
            r15 = r32
            r13 = r34
            r11 = r27
            r14.N(r15, r13, r11)
            r0 = 0
            throw r0
        L_0x0327:
            r14 = r31
            r13 = r34
            r8 = r15
            r11 = r27
            r15 = r32
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r8
            r4 = r35
            r5 = r16
            r6 = r23
            r14 = r8
            r8 = r10
            r10 = r11
            r12 = r13
            r19 = r13
            r13 = r36
            int r0 = r0.O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02f6
        L_0x034b:
            r2 = r19
            r5 = r25
            goto L_0x0367
        L_0x0350:
            r2 = r4
            r10 = r19
            r6 = r25
        L_0x0355:
            i4.y2 r4 = I(r32)
            r0 = r16
            r1 = r33
            r3 = r35
            r5 = r36
            int r0 = i4.x.h(r0, r1, r2, r3, r4, r5)
            r5 = r6
            r2 = r10
        L_0x0367:
            r6 = r26
            r12 = r33
            r13 = r35
            r11 = r36
            r14 = r15
            r7 = r17
            r10 = r18
            r1 = r23
            r9 = r29
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r31
            goto L_0x001a
        L_0x037f:
            r26 = r6
            r1 = r8
            r29 = r9
            r15 = r14
            if (r5 == r1) goto L_0x038f
            long r1 = (long) r5
            r6 = r26
            r3 = r29
            r3.putInt(r15, r1, r6)
        L_0x038f:
            r1 = r35
            if (r0 != r1) goto L_0x0394
            return
        L_0x0394:
            i4.i1 r0 = i4.i1.d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.P(java.lang.Object, byte[], int, int, i4.w):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x024f, code lost:
        if (r7.f7750b != 0) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0252, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0253, code lost:
        r12.d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0256, code lost:
        if (r4 >= r5) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0258, code lost:
        r6 = i4.x.i(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x025e, code lost:
        if (r2 == r7.f7749a) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0261, code lost:
        r4 = i4.x.l(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0269, code lost:
        if (r7.f7750b == 0) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x026b, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x026d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0115, code lost:
        if (r4 == 0) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0118, code lost:
        r12.add(i4.e0.q(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0120, code lost:
        if (r1 >= r5) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0122, code lost:
        r4 = i4.x.i(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0128, code lost:
        if (r2 == r7.f7749a) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012b, code lost:
        r1 = i4.x.i(r3, r4, r7);
        r4 = r7.f7749a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0131, code lost:
        if (r4 < 0) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0135, code lost:
        if (r4 > (r3.length - r1)) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0137, code lost:
        if (r4 != 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        r12.add(i4.e0.f7269b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0143, code lost:
        throw i4.i1.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0148, code lost:
        throw i4.i1.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0149, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0194  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Q(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, i4.w r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f7272p
            java.lang.Object r12 = r11.getObject(r1, r9)
            i4.f1 r12 = (i4.f1) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            i4.f1 r12 = r12.c(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 2
            r11 = 1
            r13 = 0
            switch(r26) {
                case 18: goto L_0x037a;
                case 19: goto L_0x0337;
                case 20: goto L_0x02ff;
                case 21: goto L_0x02ff;
                case 22: goto L_0x02e4;
                case 23: goto L_0x02a9;
                case 24: goto L_0x026e;
                case 25: goto L_0x021a;
                case 26: goto L_0x016f;
                case 27: goto L_0x0154;
                case 28: goto L_0x0107;
                case 29: goto L_0x02e4;
                case 30: goto L_0x00d7;
                case 31: goto L_0x026e;
                case 32: goto L_0x02a9;
                case 33: goto L_0x0097;
                case 34: goto L_0x0057;
                case 35: goto L_0x037a;
                case 36: goto L_0x0337;
                case 37: goto L_0x02ff;
                case 38: goto L_0x02ff;
                case 39: goto L_0x02e4;
                case 40: goto L_0x02a9;
                case 41: goto L_0x026e;
                case 42: goto L_0x021a;
                case 43: goto L_0x02e4;
                case 44: goto L_0x00d7;
                case 45: goto L_0x026e;
                case 46: goto L_0x02a9;
                case 47: goto L_0x0097;
                case 48: goto L_0x0057;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x03de
            i4.m2 r1 = r15.n(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = i4.x.c(r21, r22, r23, r24, r25, r26)
            goto L_0x03bc
        L_0x0057:
            if (r6 != r10) goto L_0x007b
            i4.q1 r12 = (i4.q1) r12
            int r1 = i4.x.i(r3, r4, r7)
            int r2 = r7.f7749a
            int r2 = r2 + r1
        L_0x0062:
            if (r1 >= r2) goto L_0x0072
            int r1 = i4.x.l(r3, r1, r7)
            long r4 = r7.f7750b
            long r4 = i4.g0.g(r4)
            r12.d(r4)
            goto L_0x0062
        L_0x0072:
            if (r1 != r2) goto L_0x0076
            goto L_0x03df
        L_0x0076:
            i4.i1 r1 = i4.i1.e()
            throw r1
        L_0x007b:
            if (r6 != 0) goto L_0x03de
            i4.q1 r12 = (i4.q1) r12
        L_0x007f:
            int r1 = i4.x.l(r3, r4, r7)
            long r8 = r7.f7750b
            long r8 = i4.g0.g(r8)
            r12.d(r8)
            if (r1 >= r5) goto L_0x0096
            int r4 = i4.x.i(r3, r1, r7)
            int r6 = r7.f7749a
            if (r2 == r6) goto L_0x007f
        L_0x0096:
            return r1
        L_0x0097:
            if (r6 != r10) goto L_0x00bb
            i4.d1 r12 = (i4.d1) r12
            int r1 = i4.x.i(r3, r4, r7)
            int r2 = r7.f7749a
            int r2 = r2 + r1
        L_0x00a2:
            if (r1 >= r2) goto L_0x00b2
            int r1 = i4.x.i(r3, r1, r7)
            int r4 = r7.f7749a
            int r4 = i4.g0.f(r4)
            r12.d(r4)
            goto L_0x00a2
        L_0x00b2:
            if (r1 != r2) goto L_0x00b6
            goto L_0x03df
        L_0x00b6:
            i4.i1 r1 = i4.i1.e()
            throw r1
        L_0x00bb:
            if (r6 != 0) goto L_0x03de
            i4.d1 r12 = (i4.d1) r12
        L_0x00bf:
            int r1 = i4.x.i(r3, r4, r7)
            int r4 = r7.f7749a
            int r4 = i4.g0.f(r4)
            r12.d(r4)
            if (r1 >= r5) goto L_0x00d6
            int r4 = i4.x.i(r3, r1, r7)
            int r6 = r7.f7749a
            if (r2 == r6) goto L_0x00bf
        L_0x00d6:
            return r1
        L_0x00d7:
            if (r6 != r10) goto L_0x00de
            int r2 = i4.x.e(r3, r4, r12, r7)
            goto L_0x00ef
        L_0x00de:
            if (r6 != 0) goto L_0x03de
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = i4.x.k(r2, r3, r4, r5, r6, r7)
        L_0x00ef:
            i4.e1 r3 = r15.m(r8)
            r4 = 0
            i4.x2 r5 = r0.f7284m
            r22 = r16
            r23 = r21
            r24 = r12
            r25 = r3
            r26 = r4
            r27 = r5
            i4.n2.a(r22, r23, r24, r25, r26, r27)
            goto L_0x023b
        L_0x0107:
            if (r6 != r10) goto L_0x03de
            int r1 = i4.x.i(r3, r4, r7)
            int r4 = r7.f7749a
            if (r4 < 0) goto L_0x014f
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x014a
            if (r4 != 0) goto L_0x0118
            goto L_0x0139
        L_0x0118:
            i4.d0 r6 = i4.e0.q(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0120:
            if (r1 >= r5) goto L_0x0149
            int r4 = i4.x.i(r3, r1, r7)
            int r6 = r7.f7749a
            if (r2 == r6) goto L_0x012b
            goto L_0x0149
        L_0x012b:
            int r1 = i4.x.i(r3, r4, r7)
            int r4 = r7.f7749a
            if (r4 < 0) goto L_0x0144
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x013f
            if (r4 != 0) goto L_0x0118
        L_0x0139:
            i4.d0 r4 = i4.e0.f7269b
            r12.add(r4)
            goto L_0x0120
        L_0x013f:
            i4.i1 r1 = i4.i1.e()
            throw r1
        L_0x0144:
            i4.i1 r1 = i4.i1.c()
            throw r1
        L_0x0149:
            return r1
        L_0x014a:
            i4.i1 r1 = i4.i1.e()
            throw r1
        L_0x014f:
            i4.i1 r1 = i4.i1.c()
            throw r1
        L_0x0154:
            if (r6 == r10) goto L_0x0158
            goto L_0x03de
        L_0x0158:
            i4.m2 r1 = r15.n(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = i4.x.d(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x016f:
            if (r6 != r10) goto L_0x03de
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01bc
            int r1 = i4.x.i(r3, r4, r7)
            int r4 = r7.f7749a
            if (r4 < 0) goto L_0x01b7
            if (r4 != 0) goto L_0x0187
            goto L_0x01a6
        L_0x0187:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = i4.g1.f7324a
            r8.<init>(r3, r1, r4, r9)
        L_0x018e:
            r12.add(r8)
            int r1 = r1 + r4
        L_0x0192:
            if (r1 >= r5) goto L_0x03df
            int r4 = i4.x.i(r3, r1, r7)
            int r8 = r7.f7749a
            if (r2 != r8) goto L_0x03df
            int r1 = i4.x.i(r3, r4, r7)
            int r4 = r7.f7749a
            if (r4 < 0) goto L_0x01b2
            if (r4 != 0) goto L_0x01aa
        L_0x01a6:
            r12.add(r6)
            goto L_0x0192
        L_0x01aa:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = i4.g1.f7324a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x018e
        L_0x01b2:
            i4.i1 r1 = i4.i1.c()
            throw r1
        L_0x01b7:
            i4.i1 r1 = i4.i1.c()
            throw r1
        L_0x01bc:
            int r1 = i4.x.i(r3, r4, r7)
            int r4 = r7.f7749a
            if (r4 < 0) goto L_0x0215
            if (r4 != 0) goto L_0x01c8
        L_0x01c6:
            r8 = r1
            goto L_0x01ef
        L_0x01c8:
            int r8 = r1 + r4
            boolean r9 = i4.m3.d(r3, r1, r8)
            if (r9 == 0) goto L_0x0210
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = i4.g1.f7324a
            r9.<init>(r3, r1, r4, r10)
        L_0x01d7:
            r12.add(r9)
        L_0x01da:
            if (r8 >= r5) goto L_0x020d
            int r1 = i4.x.i(r3, r8, r7)
            int r4 = r7.f7749a
            if (r2 != r4) goto L_0x020d
            int r1 = i4.x.i(r3, r1, r7)
            int r4 = r7.f7749a
            if (r4 < 0) goto L_0x0208
            if (r4 != 0) goto L_0x01f3
            goto L_0x01c6
        L_0x01ef:
            r12.add(r6)
            goto L_0x01da
        L_0x01f3:
            int r8 = r1 + r4
            boolean r9 = i4.m3.d(r3, r1, r8)
            if (r9 == 0) goto L_0x0203
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = i4.g1.f7324a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01d7
        L_0x0203:
            i4.i1 r1 = i4.i1.b()
            throw r1
        L_0x0208:
            i4.i1 r1 = i4.i1.c()
            throw r1
        L_0x020d:
            r1 = r8
            goto L_0x03df
        L_0x0210:
            i4.i1 r1 = i4.i1.b()
            throw r1
        L_0x0215:
            i4.i1 r1 = i4.i1.c()
            throw r1
        L_0x021a:
            r1 = 0
            if (r6 != r10) goto L_0x0243
            i4.y r12 = (i4.y) r12
            int r2 = i4.x.i(r3, r4, r7)
            int r4 = r7.f7749a
            int r4 = r4 + r2
        L_0x0226:
            if (r2 >= r4) goto L_0x0239
            int r2 = i4.x.l(r3, r2, r7)
            long r5 = r7.f7750b
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x0234
            r5 = r11
            goto L_0x0235
        L_0x0234:
            r5 = r1
        L_0x0235:
            r12.d(r5)
            goto L_0x0226
        L_0x0239:
            if (r2 != r4) goto L_0x023e
        L_0x023b:
            r1 = r2
            goto L_0x03df
        L_0x023e:
            i4.i1 r1 = i4.i1.e()
            throw r1
        L_0x0243:
            if (r6 != 0) goto L_0x03de
            i4.y r12 = (i4.y) r12
            int r4 = i4.x.l(r3, r4, r7)
            long r8 = r7.f7750b
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0252
            goto L_0x026b
        L_0x0252:
            r6 = r1
        L_0x0253:
            r12.d(r6)
            if (r4 >= r5) goto L_0x026d
            int r6 = i4.x.i(r3, r4, r7)
            int r8 = r7.f7749a
            if (r2 == r8) goto L_0x0261
            goto L_0x026d
        L_0x0261:
            int r4 = i4.x.l(r3, r6, r7)
            long r8 = r7.f7750b
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0252
        L_0x026b:
            r6 = r11
            goto L_0x0253
        L_0x026d:
            return r4
        L_0x026e:
            if (r6 != r10) goto L_0x028e
            i4.d1 r12 = (i4.d1) r12
            int r1 = i4.x.i(r3, r4, r7)
            int r2 = r7.f7749a
            int r2 = r2 + r1
        L_0x0279:
            if (r1 >= r2) goto L_0x0285
            int r4 = i4.x.b(r1, r3)
            r12.d(r4)
            int r1 = r1 + 4
            goto L_0x0279
        L_0x0285:
            if (r1 != r2) goto L_0x0289
            goto L_0x03df
        L_0x0289:
            i4.i1 r1 = i4.i1.e()
            throw r1
        L_0x028e:
            if (r6 != r9) goto L_0x03de
            i4.d1 r12 = (i4.d1) r12
        L_0x0292:
            int r1 = i4.x.b(r4, r3)
            r12.d(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x02a8
            int r1 = i4.x.i(r3, r4, r7)
            int r6 = r7.f7749a
            if (r2 == r6) goto L_0x02a6
            goto L_0x02a8
        L_0x02a6:
            r4 = r1
            goto L_0x0292
        L_0x02a8:
            return r4
        L_0x02a9:
            if (r6 != r10) goto L_0x02c9
            i4.q1 r12 = (i4.q1) r12
            int r1 = i4.x.i(r3, r4, r7)
            int r2 = r7.f7749a
            int r2 = r2 + r1
        L_0x02b4:
            if (r1 >= r2) goto L_0x02c0
            long r4 = i4.x.o(r1, r3)
            r12.d(r4)
            int r1 = r1 + 8
            goto L_0x02b4
        L_0x02c0:
            if (r1 != r2) goto L_0x02c4
            goto L_0x03df
        L_0x02c4:
            i4.i1 r1 = i4.i1.e()
            throw r1
        L_0x02c9:
            if (r6 != r11) goto L_0x03de
            i4.q1 r12 = (i4.q1) r12
        L_0x02cd:
            long r8 = i4.x.o(r4, r3)
            r12.d(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x02e3
            int r1 = i4.x.i(r3, r4, r7)
            int r6 = r7.f7749a
            if (r2 == r6) goto L_0x02e1
            goto L_0x02e3
        L_0x02e1:
            r4 = r1
            goto L_0x02cd
        L_0x02e3:
            return r4
        L_0x02e4:
            if (r6 != r10) goto L_0x02ec
            int r1 = i4.x.e(r3, r4, r12, r7)
            goto L_0x03df
        L_0x02ec:
            if (r6 == 0) goto L_0x02f0
            goto L_0x03de
        L_0x02f0:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = i4.x.k(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x02ff:
            if (r6 != r10) goto L_0x031f
            i4.q1 r12 = (i4.q1) r12
            int r1 = i4.x.i(r3, r4, r7)
            int r2 = r7.f7749a
            int r2 = r2 + r1
        L_0x030a:
            if (r1 >= r2) goto L_0x0316
            int r1 = i4.x.l(r3, r1, r7)
            long r4 = r7.f7750b
            r12.d(r4)
            goto L_0x030a
        L_0x0316:
            if (r1 != r2) goto L_0x031a
            goto L_0x03df
        L_0x031a:
            i4.i1 r1 = i4.i1.e()
            throw r1
        L_0x031f:
            if (r6 != 0) goto L_0x03de
            i4.q1 r12 = (i4.q1) r12
        L_0x0323:
            int r1 = i4.x.l(r3, r4, r7)
            long r8 = r7.f7750b
            r12.d(r8)
            if (r1 >= r5) goto L_0x0336
            int r4 = i4.x.i(r3, r1, r7)
            int r6 = r7.f7749a
            if (r2 == r6) goto L_0x0323
        L_0x0336:
            return r1
        L_0x0337:
            if (r6 != r10) goto L_0x035b
            i4.w0 r12 = (i4.w0) r12
            int r1 = i4.x.i(r3, r4, r7)
            int r2 = r7.f7749a
            int r2 = r2 + r1
        L_0x0342:
            if (r1 >= r2) goto L_0x0352
            int r4 = i4.x.b(r1, r3)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.d(r4)
            int r1 = r1 + 4
            goto L_0x0342
        L_0x0352:
            if (r1 != r2) goto L_0x0356
            goto L_0x03df
        L_0x0356:
            i4.i1 r1 = i4.i1.e()
            throw r1
        L_0x035b:
            if (r6 != r9) goto L_0x03de
            i4.w0 r12 = (i4.w0) r12
        L_0x035f:
            int r1 = i4.x.b(r4, r3)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.d(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x0379
            int r1 = i4.x.i(r3, r4, r7)
            int r6 = r7.f7749a
            if (r2 == r6) goto L_0x0377
            goto L_0x0379
        L_0x0377:
            r4 = r1
            goto L_0x035f
        L_0x0379:
            return r4
        L_0x037a:
            if (r6 != r10) goto L_0x039d
            i4.n0 r12 = (i4.n0) r12
            int r1 = i4.x.i(r3, r4, r7)
            int r2 = r7.f7749a
            int r2 = r2 + r1
        L_0x0385:
            if (r1 >= r2) goto L_0x0395
            long r4 = i4.x.o(r1, r3)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.d(r4)
            int r1 = r1 + 8
            goto L_0x0385
        L_0x0395:
            if (r1 != r2) goto L_0x0398
            goto L_0x03df
        L_0x0398:
            i4.i1 r1 = i4.i1.e()
            throw r1
        L_0x039d:
            if (r6 != r11) goto L_0x03de
            i4.n0 r12 = (i4.n0) r12
        L_0x03a1:
            long r8 = i4.x.o(r4, r3)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.d(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x03bb
            int r1 = i4.x.i(r3, r4, r7)
            int r6 = r7.f7749a
            if (r2 == r6) goto L_0x03b9
            goto L_0x03bb
        L_0x03b9:
            r4 = r1
            goto L_0x03a1
        L_0x03bb:
            return r4
        L_0x03bc:
            java.lang.Object r8 = r7.f7751c
            r12.add(r8)
            if (r4 >= r5) goto L_0x03dd
            int r8 = i4.x.i(r3, r4, r7)
            int r9 = r7.f7749a
            if (r2 == r9) goto L_0x03cc
            goto L_0x03dd
        L_0x03cc:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = i4.x.c(r21, r22, r23, r24, r25, r26)
            goto L_0x03bc
        L_0x03dd:
            return r4
        L_0x03de:
            r1 = r4
        L_0x03df:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.Q(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, i4.w):int");
    }

    public final void a(Object obj) {
        if (D(obj)) {
            if (obj instanceof c1) {
                c1 c1Var = (c1) obj;
                c1Var.k();
                c1Var.zza = 0;
                c1Var.f();
            }
            int length = this.f7273a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int k10 = k(i10);
                long j10 = (long) (1048575 & k10);
                int i11 = (k10 >>> 20) & 255;
                if (i11 != 9) {
                    switch (i11) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f7283l.b(j10, obj);
                            continue;
                        case 50:
                            Unsafe unsafe = f7272p;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((w1) object).d();
                                unsafe.putObject(obj, j10, object);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (C(i10, obj)) {
                    n(i10).a(f7272p.getObject(obj, j10));
                }
            }
            this.f7284m.m(obj);
            if (this.f7278f) {
                this.f7285n.e(obj);
            }
        }
    }

    public final int b(Object obj) {
        return this.f7280h ? L(obj) : K(obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        i4.h3.s(r2, r7, i4.h3.j(r2, r8));
        y(r4, r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        i4.h3.s(r2, r7, i4.h3.j(r2, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        i4.h3.q(i4.h3.g(r2, r8), r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
        i4.h3.r(r7, r2, i4.h3.h(r2, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fa, code lost:
        x(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            t(r7)
            r8.getClass()
            r0 = 0
        L_0x0007:
            int[] r1 = r6.f7273a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x0101
            int r1 = r6.k(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f7273a
            r4 = r4[r0]
            int r1 = r1 >>> 20
            r1 = r1 & 255(0xff, float:3.57E-43)
            switch(r1) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x00df;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00bc;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00ae;
                case 7: goto L_0x00a0;
                case 8: goto L_0x0092;
                case 9: goto L_0x008d;
                case 10: goto L_0x0086;
                case 11: goto L_0x007f;
                case 12: goto L_0x0078;
                case 13: goto L_0x0071;
                case 14: goto L_0x0069;
                case 15: goto L_0x0062;
                case 16: goto L_0x005a;
                case 17: goto L_0x008d;
                case 18: goto L_0x0053;
                case 19: goto L_0x0053;
                case 20: goto L_0x0053;
                case 21: goto L_0x0053;
                case 22: goto L_0x0053;
                case 23: goto L_0x0053;
                case 24: goto L_0x0053;
                case 25: goto L_0x0053;
                case 26: goto L_0x0053;
                case 27: goto L_0x0053;
                case 28: goto L_0x0053;
                case 29: goto L_0x0053;
                case 30: goto L_0x0053;
                case 31: goto L_0x0053;
                case 32: goto L_0x0053;
                case 33: goto L_0x0053;
                case 34: goto L_0x0053;
                case 35: goto L_0x0053;
                case 36: goto L_0x0053;
                case 37: goto L_0x0053;
                case 38: goto L_0x0053;
                case 39: goto L_0x0053;
                case 40: goto L_0x0053;
                case 41: goto L_0x0053;
                case 42: goto L_0x0053;
                case 43: goto L_0x0053;
                case 44: goto L_0x0053;
                case 45: goto L_0x0053;
                case 46: goto L_0x0053;
                case 47: goto L_0x0053;
                case 48: goto L_0x0053;
                case 49: goto L_0x0053;
                case 50: goto L_0x0040;
                case 51: goto L_0x002e;
                case 52: goto L_0x002e;
                case 53: goto L_0x002e;
                case 54: goto L_0x002e;
                case 55: goto L_0x002e;
                case 56: goto L_0x002e;
                case 57: goto L_0x002e;
                case 58: goto L_0x002e;
                case 59: goto L_0x002e;
                case 60: goto L_0x0029;
                case 61: goto L_0x0022;
                case 62: goto L_0x0022;
                case 63: goto L_0x0022;
                case 64: goto L_0x0022;
                case 65: goto L_0x0022;
                case 66: goto L_0x0022;
                case 67: goto L_0x0022;
                case 68: goto L_0x0029;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x00fd
        L_0x0022:
            boolean r1 = r6.E(r4, r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x0034
        L_0x0029:
            r6.v(r7, r0, r8)
            goto L_0x00fd
        L_0x002e:
            boolean r1 = r6.E(r4, r0, r8)
            if (r1 == 0) goto L_0x00fd
        L_0x0034:
            java.lang.Object r1 = i4.h3.j(r2, r8)
            i4.h3.s(r2, r7, r1)
            r6.y(r4, r0, r7)
            goto L_0x00fd
        L_0x0040:
            java.lang.Class r1 = i4.n2.f7515a
            java.lang.Object r1 = i4.h3.j(r2, r7)
            java.lang.Object r4 = i4.h3.j(r2, r8)
            i4.w1 r1 = i4.x1.c(r1, r4)
            i4.h3.s(r2, r7, r1)
            goto L_0x00fd
        L_0x0053:
            i4.p1 r1 = r6.f7283l
            r1.c(r2, r7, r8)
            goto L_0x00fd
        L_0x005a:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x0062:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x0069:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x0071:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x0078:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x007f:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x0086:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x0098
        L_0x008d:
            r6.u(r7, r0, r8)
            goto L_0x00fd
        L_0x0092:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
        L_0x0098:
            java.lang.Object r1 = i4.h3.j(r2, r8)
            i4.h3.s(r2, r7, r1)
            goto L_0x00fa
        L_0x00a0:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            boolean r1 = i4.h3.u(r2, r8)
            i4.h3.m(r7, r2, r1)
            goto L_0x00fa
        L_0x00ae:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x00b5:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x00bc:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
        L_0x00c2:
            int r1 = i4.h3.g(r2, r8)
            i4.h3.q(r1, r2, r7)
            goto L_0x00fa
        L_0x00ca:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x00d1:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
        L_0x00d7:
            long r4 = i4.h3.h(r2, r8)
            i4.h3.r(r7, r2, r4)
            goto L_0x00fa
        L_0x00df:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            float r1 = i4.h3.f(r2, r8)
            i4.h3.p(r7, r2, r1)
            goto L_0x00fa
        L_0x00ed:
            boolean r1 = r6.C(r0, r8)
            if (r1 == 0) goto L_0x00fd
            double r4 = i4.h3.e(r2, r8)
            i4.h3.o(r7, r2, r4)
        L_0x00fa:
            r6.x(r0, r7)
        L_0x00fd:
            int r0 = r0 + 3
            goto L_0x0007
        L_0x0101:
            i4.x2 r0 = r6.f7284m
            java.lang.Class r1 = i4.n2.f7515a
            i4.y2 r1 = r0.d(r7)
            i4.y2 r2 = r0.d(r8)
            java.lang.Object r1 = r0.e(r1, r2)
            r0.o(r7, r1)
            boolean r7 = r6.f7278f
            if (r7 != 0) goto L_0x0119
            return
        L_0x0119:
            i4.q0 r7 = r6.f7285n
            r7.a(r8)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.c(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b8, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            int[] r0 = r8.f7273a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r2 >= r0) goto L_0x01bc
            int r3 = r8.k(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            switch(r3) {
                case 0: goto L_0x019c;
                case 1: goto L_0x0183;
                case 2: goto L_0x0170;
                case 3: goto L_0x015d;
                case 4: goto L_0x014c;
                case 5: goto L_0x0138;
                case 6: goto L_0x0126;
                case 7: goto L_0x0114;
                case 8: goto L_0x00fe;
                case 9: goto L_0x00e8;
                case 10: goto L_0x00d2;
                case 11: goto L_0x00c0;
                case 12: goto L_0x00ae;
                case 13: goto L_0x009c;
                case 14: goto L_0x0088;
                case 15: goto L_0x0076;
                case 16: goto L_0x0062;
                case 17: goto L_0x004c;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x001a;
                case 55: goto L_0x001a;
                case 56: goto L_0x001a;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x001a;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x01b8
        L_0x001a:
            int[] r3 = r8.f7273a
            int r7 = r2 + 2
            r3 = r3[r7]
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = i4.h3.g(r3, r9)
            int r3 = i4.h3.g(r3, r10)
            if (r7 != r3) goto L_0x01b7
            java.lang.Object r3 = i4.h3.j(r5, r9)
            java.lang.Object r4 = i4.h3.j(r5, r10)
            boolean r3 = i4.n2.b(r3, r4)
            if (r3 != 0) goto L_0x01b8
            goto L_0x01b7
        L_0x003c:
            java.lang.Object r3 = i4.h3.j(r5, r9)
            java.lang.Object r4 = i4.h3.j(r5, r10)
            boolean r3 = i4.n2.b(r3, r4)
            if (r3 != 0) goto L_0x01b8
            goto L_0x01b7
        L_0x004c:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            java.lang.Object r3 = i4.h3.j(r5, r9)
            java.lang.Object r4 = i4.h3.j(r5, r10)
            boolean r3 = i4.n2.b(r3, r4)
            if (r3 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x0062:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            long r3 = i4.h3.h(r5, r9)
            long r5 = i4.h3.h(r5, r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x0076:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = i4.h3.g(r5, r9)
            int r4 = i4.h3.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x0088:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            long r3 = i4.h3.h(r5, r9)
            long r5 = i4.h3.h(r5, r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x009c:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = i4.h3.g(r5, r9)
            int r4 = i4.h3.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x00ae:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = i4.h3.g(r5, r9)
            int r4 = i4.h3.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x00c0:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = i4.h3.g(r5, r9)
            int r4 = i4.h3.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x00d2:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            java.lang.Object r3 = i4.h3.j(r5, r9)
            java.lang.Object r4 = i4.h3.j(r5, r10)
            boolean r3 = i4.n2.b(r3, r4)
            if (r3 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x00e8:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            java.lang.Object r3 = i4.h3.j(r5, r9)
            java.lang.Object r4 = i4.h3.j(r5, r10)
            boolean r3 = i4.n2.b(r3, r4)
            if (r3 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x00fe:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            java.lang.Object r3 = i4.h3.j(r5, r9)
            java.lang.Object r4 = i4.h3.j(r5, r10)
            boolean r3 = i4.n2.b(r3, r4)
            if (r3 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x0114:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            boolean r3 = i4.h3.u(r5, r9)
            boolean r4 = i4.h3.u(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x0126:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = i4.h3.g(r5, r9)
            int r4 = i4.h3.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x0138:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            long r3 = i4.h3.h(r5, r9)
            long r5 = i4.h3.h(r5, r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x014c:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = i4.h3.g(r5, r9)
            int r4 = i4.h3.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x015d:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            long r3 = i4.h3.h(r5, r9)
            long r5 = i4.h3.h(r5, r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x0170:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            long r3 = i4.h3.h(r5, r9)
            long r5 = i4.h3.h(r5, r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x0183:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            float r3 = i4.h3.f(r5, r9)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = i4.h3.f(r5, r10)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x019c:
            boolean r3 = r8.B(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            double r3 = i4.h3.e(r5, r9)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = i4.h3.e(r5, r10)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x01b7:
            return r1
        L_0x01b8:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01bc:
            i4.x2 r0 = r8.f7284m
            i4.y2 r0 = r0.d(r9)
            i4.x2 r2 = r8.f7284m
            i4.y2 r2 = r2.d(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cf
            return r1
        L_0x01cf:
            boolean r0 = r8.f7278f
            if (r0 != 0) goto L_0x01d5
            r9 = 1
            return r9
        L_0x01d5:
            i4.q0 r0 = r8.f7285n
            r0.a(r9)
            i4.q0 r9 = r8.f7285n
            r9.a(r10)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.d(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean e(Object obj) {
        boolean z9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (true) {
            boolean z10 = true;
            if (i10 < this.f7282j) {
                int i13 = this.f7281i[i10];
                int i14 = this.f7273a[i13];
                int k10 = k(i13);
                int i15 = this.f7273a[i13 + 2];
                int i16 = i15 & 1048575;
                int i17 = 1 << (i15 >>> 20);
                if (i16 != i12) {
                    if (i16 != 1048575) {
                        i11 = f7272p.getInt(obj, (long) i16);
                    }
                    i12 = i16;
                }
                if ((268435456 & k10) != 0) {
                    if (i12 == 1048575) {
                        z9 = C(i13, obj);
                    } else if ((i11 & i17) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        return false;
                    }
                }
                int i18 = (k10 >>> 20) & 255;
                if (i18 == 9 || i18 == 17) {
                    if (i12 == 1048575) {
                        z10 = C(i13, obj);
                    } else if ((i11 & i17) == 0) {
                        z10 = false;
                    }
                    if (z10 && !n(i13).e(h3.j((long) (k10 & 1048575), obj))) {
                        return false;
                    }
                } else {
                    if (i18 != 27) {
                        if (i18 == 60 || i18 == 68) {
                            if (E(i14, i13, obj) && !n(i13).e(h3.j((long) (k10 & 1048575), obj))) {
                                return false;
                            }
                        } else if (i18 != 49) {
                            if (i18 == 50 && !((w1) h3.j((long) (k10 & 1048575), obj)).isEmpty()) {
                                v1 v1Var = (v1) p(i13);
                                throw null;
                            }
                        }
                    }
                    List list = (List) h3.j((long) (k10 & 1048575), obj);
                    if (!list.isEmpty()) {
                        m2 n2 = n(i13);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            if (!n2.e(list.get(i19))) {
                                return false;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
                i10++;
            } else if (!this.f7278f) {
                return true;
            } else {
                this.f7285n.a(obj);
                throw null;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        r2 = r2 * 53;
        r3 = M(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = l(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        if (r3 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        r2 = r2 * 53;
        r3 = i4.h3.j(r5, r9).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        if (r3 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ee, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f6, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) i4.h3.j(r5, r9)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0109, code lost:
        r3 = i4.g1.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0122, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012d, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0131, code lost:
        r3 = i4.g1.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0135, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0137, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f7273a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x013b
            int r3 = r8.k(r1)
            int[] r4 = r8.f7273a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0127;
                case 1: goto L_0x011c;
                case 2: goto L_0x0115;
                case 3: goto L_0x0115;
                case 4: goto L_0x010e;
                case 5: goto L_0x0115;
                case 6: goto L_0x010e;
                case 7: goto L_0x0103;
                case 8: goto L_0x00f6;
                case 9: goto L_0x00e8;
                case 10: goto L_0x00dd;
                case 11: goto L_0x010e;
                case 12: goto L_0x010e;
                case 13: goto L_0x010e;
                case 14: goto L_0x0115;
                case 15: goto L_0x010e;
                case 16: goto L_0x0115;
                case 17: goto L_0x00d6;
                case 18: goto L_0x00dd;
                case 19: goto L_0x00dd;
                case 20: goto L_0x00dd;
                case 21: goto L_0x00dd;
                case 22: goto L_0x00dd;
                case 23: goto L_0x00dd;
                case 24: goto L_0x00dd;
                case 25: goto L_0x00dd;
                case 26: goto L_0x00dd;
                case 27: goto L_0x00dd;
                case 28: goto L_0x00dd;
                case 29: goto L_0x00dd;
                case 30: goto L_0x00dd;
                case 31: goto L_0x00dd;
                case 32: goto L_0x00dd;
                case 33: goto L_0x00dd;
                case 34: goto L_0x00dd;
                case 35: goto L_0x00dd;
                case 36: goto L_0x00dd;
                case 37: goto L_0x00dd;
                case 38: goto L_0x00dd;
                case 39: goto L_0x00dd;
                case 40: goto L_0x00dd;
                case 41: goto L_0x00dd;
                case 42: goto L_0x00dd;
                case 43: goto L_0x00dd;
                case 44: goto L_0x00dd;
                case 45: goto L_0x00dd;
                case 46: goto L_0x00dd;
                case 47: goto L_0x00dd;
                case 48: goto L_0x00dd;
                case 49: goto L_0x00dd;
                case 50: goto L_0x00dd;
                case 51: goto L_0x00c3;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x006b;
                case 59: goto L_0x0063;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0137
        L_0x001f:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x00dd
        L_0x0027:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x0093
        L_0x0036:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x0093
        L_0x0045:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x00dd
        L_0x005b:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x00dd
        L_0x0063:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x00f6
        L_0x006b:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            int r2 = r2 * 53
            java.lang.Object r3 = i4.h3.j(r5, r9)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x0109
        L_0x007f:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
        L_0x0093:
            int r2 = r2 * 53
            int r3 = M(r5, r9)
            goto L_0x0135
        L_0x009b:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = l(r5, r9)
            goto L_0x0131
        L_0x00b0:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            int r2 = r2 * 53
            java.lang.Object r3 = i4.h3.j(r5, r9)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L_0x0122
        L_0x00c3:
            boolean r3 = r8.E(r4, r1, r9)
            if (r3 == 0) goto L_0x0137
            int r2 = r2 * 53
            java.lang.Object r3 = i4.h3.j(r5, r9)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            goto L_0x012d
        L_0x00d6:
            java.lang.Object r3 = i4.h3.j(r5, r9)
            if (r3 == 0) goto L_0x00f2
            goto L_0x00ee
        L_0x00dd:
            int r2 = r2 * 53
            java.lang.Object r3 = i4.h3.j(r5, r9)
            int r3 = r3.hashCode()
            goto L_0x0135
        L_0x00e8:
            java.lang.Object r3 = i4.h3.j(r5, r9)
            if (r3 == 0) goto L_0x00f2
        L_0x00ee:
            int r7 = r3.hashCode()
        L_0x00f2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0137
        L_0x00f6:
            int r2 = r2 * 53
            java.lang.Object r3 = i4.h3.j(r5, r9)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0135
        L_0x0103:
            int r2 = r2 * 53
            boolean r3 = i4.h3.u(r5, r9)
        L_0x0109:
            int r3 = i4.g1.a(r3)
            goto L_0x0135
        L_0x010e:
            int r2 = r2 * 53
            int r3 = i4.h3.g(r5, r9)
            goto L_0x0135
        L_0x0115:
            int r2 = r2 * 53
            long r3 = i4.h3.h(r5, r9)
            goto L_0x0131
        L_0x011c:
            int r2 = r2 * 53
            float r3 = i4.h3.f(r5, r9)
        L_0x0122:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0135
        L_0x0127:
            int r2 = r2 * 53
            double r3 = i4.h3.e(r5, r9)
        L_0x012d:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0131:
            int r3 = i4.g1.b(r3)
        L_0x0135:
            int r3 = r3 + r2
            r2 = r3
        L_0x0137:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x013b:
            int r2 = r2 * 53
            i4.x2 r0 = r8.f7284m
            i4.y2 r0 = r0.d(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f7278f
            if (r1 != 0) goto L_0x014d
            return r0
        L_0x014d:
            i4.q0 r0 = r8.f7285n
            r0.a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.f(java.lang.Object):int");
    }

    public final void g(Object obj, byte[] bArr, int i10, int i11, w wVar) {
        if (this.f7280h) {
            P(obj, bArr, i10, i11, wVar);
        } else {
            H(obj, bArr, i10, i11, 0, wVar);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02f5, code lost:
        r12.b(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0306, code lost:
        r12.a(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0317, code lost:
        r12.q(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0328, code lost:
        r12.p(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0339, code lost:
        r12.h(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x034a, code lost:
        r12.c(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0355, code lost:
        r12.f(r5, (i4.e0) i4.h3.j((long) (r4 & 1048575), r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0368, code lost:
        r12.o(r5, n(r3), i4.h3.j((long) (r4 & 1048575), r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x037d, code lost:
        G(r5, i4.h3.j((long) (r4 & 1048575), r11), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0394, code lost:
        r12.e(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03a5, code lost:
        r12.i(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03b5, code lost:
        r12.j(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03c5, code lost:
        r12.m(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03d5, code lost:
        r12.d(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03e5, code lost:
        r12.n(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03f5, code lost:
        r12.k(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0405, code lost:
        r12.g(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02da, code lost:
        r12.l(r5, n(r3), i4.h3.j((long) (r4 & 1048575), r11));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.Object r11, i4.m0 r12) {
        /*
            r10 = this;
            boolean r0 = r10.f7280h
            if (r0 == 0) goto L_0x041c
            boolean r0 = r10.f7278f
            r1 = 0
            if (r0 != 0) goto L_0x0416
            int[] r0 = r10.f7273a
            int r0 = r0.length
            r2 = 0
            r3 = r2
        L_0x000e:
            if (r3 >= r0) goto L_0x040c
            int r4 = r10.k(r3)
            int[] r5 = r10.f7273a
            r5 = r5[r3]
            int r6 = r4 >>> 20
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            switch(r6) {
                case 0: goto L_0x03f9;
                case 1: goto L_0x03e9;
                case 2: goto L_0x03d9;
                case 3: goto L_0x03c9;
                case 4: goto L_0x03b9;
                case 5: goto L_0x03a9;
                case 6: goto L_0x0399;
                case 7: goto L_0x0388;
                case 8: goto L_0x0377;
                case 9: goto L_0x0362;
                case 10: goto L_0x034f;
                case 11: goto L_0x033e;
                case 12: goto L_0x032d;
                case 13: goto L_0x031c;
                case 14: goto L_0x030b;
                case 15: goto L_0x02fa;
                case 16: goto L_0x02e9;
                case 17: goto L_0x02d4;
                case 18: goto L_0x02c7;
                case 19: goto L_0x02ba;
                case 20: goto L_0x02ad;
                case 21: goto L_0x02a0;
                case 22: goto L_0x0293;
                case 23: goto L_0x0286;
                case 24: goto L_0x0279;
                case 25: goto L_0x026c;
                case 26: goto L_0x025f;
                case 27: goto L_0x024e;
                case 28: goto L_0x0241;
                case 29: goto L_0x0234;
                case 30: goto L_0x0227;
                case 31: goto L_0x021a;
                case 32: goto L_0x020d;
                case 33: goto L_0x0200;
                case 34: goto L_0x01f3;
                case 35: goto L_0x01e6;
                case 36: goto L_0x01d9;
                case 37: goto L_0x01cc;
                case 38: goto L_0x01bf;
                case 39: goto L_0x01b2;
                case 40: goto L_0x01a5;
                case 41: goto L_0x0198;
                case 42: goto L_0x018b;
                case 43: goto L_0x017e;
                case 44: goto L_0x0171;
                case 45: goto L_0x0164;
                case 46: goto L_0x0157;
                case 47: goto L_0x014a;
                case 48: goto L_0x013d;
                case 49: goto L_0x012c;
                case 50: goto L_0x011b;
                case 51: goto L_0x0107;
                case 52: goto L_0x00f3;
                case 53: goto L_0x00e5;
                case 54: goto L_0x00d7;
                case 55: goto L_0x00c9;
                case 56: goto L_0x00bb;
                case 57: goto L_0x00ad;
                case 58: goto L_0x0099;
                case 59: goto L_0x0091;
                case 60: goto L_0x0089;
                case 61: goto L_0x0081;
                case 62: goto L_0x0073;
                case 63: goto L_0x0065;
                case 64: goto L_0x0057;
                case 65: goto L_0x0049;
                case 66: goto L_0x003b;
                case 67: goto L_0x002d;
                case 68: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0408
        L_0x0025:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            goto L_0x02da
        L_0x002d:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = l(r6, r11)
            goto L_0x02f5
        L_0x003b:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = M(r6, r11)
            goto L_0x0306
        L_0x0049:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = l(r6, r11)
            goto L_0x0317
        L_0x0057:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = M(r6, r11)
            goto L_0x0328
        L_0x0065:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = M(r6, r11)
            goto L_0x0339
        L_0x0073:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = M(r6, r11)
            goto L_0x034a
        L_0x0081:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            goto L_0x0355
        L_0x0089:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            goto L_0x0368
        L_0x0091:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            goto L_0x037d
        L_0x0099:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L_0x0394
        L_0x00ad:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = M(r6, r11)
            goto L_0x03a5
        L_0x00bb:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = l(r6, r11)
            goto L_0x03b5
        L_0x00c9:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = M(r6, r11)
            goto L_0x03c5
        L_0x00d7:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = l(r6, r11)
            goto L_0x03d5
        L_0x00e5:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = l(r6, r11)
            goto L_0x03e5
        L_0x00f3:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x03f5
        L_0x0107:
            boolean r6 = r10.E(r5, r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.lang.Double r4 = (java.lang.Double) r4
            double r6 = r4.doubleValue()
            goto L_0x0405
        L_0x011b:
            r4 = r4 & r8
            long r4 = (long) r4
            java.lang.Object r4 = i4.h3.j(r4, r11)
            if (r4 != 0) goto L_0x0125
            goto L_0x0408
        L_0x0125:
            java.lang.Object r11 = r10.p(r3)
            i4.v1 r11 = (i4.v1) r11
            throw r1
        L_0x012c:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.m2 r6 = r10.n(r3)
            i4.n2.j(r5, r4, r12, r6)
            goto L_0x0408
        L_0x013d:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.q(r5, r4, r12, r7)
            goto L_0x0408
        L_0x014a:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.p(r5, r4, r12, r7)
            goto L_0x0408
        L_0x0157:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.o(r5, r4, r12, r7)
            goto L_0x0408
        L_0x0164:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.n(r5, r4, r12, r7)
            goto L_0x0408
        L_0x0171:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.f(r5, r4, r12, r7)
            goto L_0x0408
        L_0x017e:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.s(r5, r4, r12, r7)
            goto L_0x0408
        L_0x018b:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.c(r5, r4, r12, r7)
            goto L_0x0408
        L_0x0198:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.g(r5, r4, r12, r7)
            goto L_0x0408
        L_0x01a5:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.h(r5, r4, r12, r7)
            goto L_0x0408
        L_0x01b2:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.k(r5, r4, r12, r7)
            goto L_0x0408
        L_0x01bf:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.u(r5, r4, r12, r7)
            goto L_0x0408
        L_0x01cc:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.l(r5, r4, r12, r7)
            goto L_0x0408
        L_0x01d9:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.i(r5, r4, r12, r7)
            goto L_0x0408
        L_0x01e6:
            r4 = r4 & r8
            long r8 = (long) r4
            java.lang.Object r4 = i4.h3.j(r8, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.e(r5, r4, r12, r7)
            goto L_0x0408
        L_0x01f3:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.q(r5, r4, r12, r2)
            goto L_0x0408
        L_0x0200:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.p(r5, r4, r12, r2)
            goto L_0x0408
        L_0x020d:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.o(r5, r4, r12, r2)
            goto L_0x0408
        L_0x021a:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.n(r5, r4, r12, r2)
            goto L_0x0408
        L_0x0227:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.f(r5, r4, r12, r2)
            goto L_0x0408
        L_0x0234:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.s(r5, r4, r12, r2)
            goto L_0x0408
        L_0x0241:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.d(r5, r4, r12)
            goto L_0x0408
        L_0x024e:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.m2 r6 = r10.n(r3)
            i4.n2.m(r5, r4, r12, r6)
            goto L_0x0408
        L_0x025f:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.r(r5, r4, r12)
            goto L_0x0408
        L_0x026c:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.c(r5, r4, r12, r2)
            goto L_0x0408
        L_0x0279:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.g(r5, r4, r12, r2)
            goto L_0x0408
        L_0x0286:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.h(r5, r4, r12, r2)
            goto L_0x0408
        L_0x0293:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.k(r5, r4, r12, r2)
            goto L_0x0408
        L_0x02a0:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.u(r5, r4, r12, r2)
            goto L_0x0408
        L_0x02ad:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.l(r5, r4, r12, r2)
            goto L_0x0408
        L_0x02ba:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.i(r5, r4, r12, r2)
            goto L_0x0408
        L_0x02c7:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            java.util.List r4 = (java.util.List) r4
            i4.n2.e(r5, r4, r12, r2)
            goto L_0x0408
        L_0x02d4:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
        L_0x02da:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            i4.m2 r6 = r10.n(r3)
            r12.l(r5, r6, r4)
            goto L_0x0408
        L_0x02e9:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = i4.h3.h(r6, r11)
        L_0x02f5:
            r12.b(r5, r6)
            goto L_0x0408
        L_0x02fa:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = i4.h3.g(r6, r11)
        L_0x0306:
            r12.a(r5, r4)
            goto L_0x0408
        L_0x030b:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = i4.h3.h(r6, r11)
        L_0x0317:
            r12.q(r5, r6)
            goto L_0x0408
        L_0x031c:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = i4.h3.g(r6, r11)
        L_0x0328:
            r12.p(r5, r4)
            goto L_0x0408
        L_0x032d:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = i4.h3.g(r6, r11)
        L_0x0339:
            r12.h(r5, r4)
            goto L_0x0408
        L_0x033e:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = i4.h3.g(r6, r11)
        L_0x034a:
            r12.c(r5, r4)
            goto L_0x0408
        L_0x034f:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
        L_0x0355:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            i4.e0 r4 = (i4.e0) r4
            r12.f(r5, r4)
            goto L_0x0408
        L_0x0362:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
        L_0x0368:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            i4.m2 r6 = r10.n(r3)
            r12.o(r5, r6, r4)
            goto L_0x0408
        L_0x0377:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
        L_0x037d:
            r4 = r4 & r8
            long r6 = (long) r4
            java.lang.Object r4 = i4.h3.j(r6, r11)
            G(r5, r4, r12)
            goto L_0x0408
        L_0x0388:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            boolean r4 = i4.h3.u(r6, r11)
        L_0x0394:
            r12.e(r5, r4)
            goto L_0x0408
        L_0x0399:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = i4.h3.g(r6, r11)
        L_0x03a5:
            r12.i(r5, r4)
            goto L_0x0408
        L_0x03a9:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = i4.h3.h(r6, r11)
        L_0x03b5:
            r12.j(r5, r6)
            goto L_0x0408
        L_0x03b9:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            int r4 = i4.h3.g(r6, r11)
        L_0x03c5:
            r12.m(r5, r4)
            goto L_0x0408
        L_0x03c9:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = i4.h3.h(r6, r11)
        L_0x03d5:
            r12.d(r5, r6)
            goto L_0x0408
        L_0x03d9:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            long r6 = i4.h3.h(r6, r11)
        L_0x03e5:
            r12.n(r5, r6)
            goto L_0x0408
        L_0x03e9:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            float r4 = i4.h3.f(r6, r11)
        L_0x03f5:
            r12.k(r5, r4)
            goto L_0x0408
        L_0x03f9:
            boolean r6 = r10.C(r3, r11)
            if (r6 == 0) goto L_0x0408
            r4 = r4 & r8
            long r6 = (long) r4
            double r6 = i4.h3.e(r6, r11)
        L_0x0405:
            r12.g(r6, r5)
        L_0x0408:
            int r3 = r3 + 3
            goto L_0x000e
        L_0x040c:
            i4.x2 r0 = r10.f7284m
            i4.y2 r11 = r0.d(r11)
            r0.r(r11, r12)
            return
        L_0x0416:
            i4.q0 r12 = r10.f7285n
            r12.a(r11)
            throw r1
        L_0x041c:
            r10.F(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.h(java.lang.Object, i4.m0):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void i(java.lang.Object r20, i4.h0 r21, i4.p0 r22) {
        /*
            r19 = this;
            r1 = r19
            r8 = r20
            r0 = r21
            r9 = r22
            r22.getClass()
            t(r20)
            i4.x2 r10 = r1.f7284m
            i4.q0 r11 = r1.f7285n
            r13 = 0
            r14 = 0
        L_0x0014:
            int r3 = r21.t()     // Catch:{ all -> 0x0026 }
            int r2 = r1.f7275c     // Catch:{ all -> 0x0026 }
            r4 = 0
            if (r3 < r2) goto L_0x0029
            int r2 = r1.f7276d     // Catch:{ all -> 0x0026 }
            if (r3 > r2) goto L_0x0029
            int r2 = r1.j(r3, r4)     // Catch:{ all -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r0 = move-exception
            goto L_0x05f9
        L_0x0029:
            r2 = -1
        L_0x002a:
            if (r2 >= 0) goto L_0x0088
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x0047
            int r0 = r1.f7282j
        L_0x0033:
            int r2 = r1.k
            if (r0 >= r2) goto L_0x0041
            int[] r2 = r1.f7281i
            r2 = r2[r0]
            r1.o(r8, r2, r13)
            int r0 = r0 + 1
            goto L_0x0033
        L_0x0041:
            if (r13 == 0) goto L_0x05f8
            r10.n(r8, r13)
            return
        L_0x0047:
            boolean r2 = r1.f7278f     // Catch:{ all -> 0x0026 }
            if (r2 != 0) goto L_0x004d
            r2 = 0
            goto L_0x0053
        L_0x004d:
            i4.b2 r2 = r1.f7277e     // Catch:{ all -> 0x0026 }
            i4.b1 r2 = r11.c(r9, r2, r3)     // Catch:{ all -> 0x0026 }
        L_0x0053:
            if (r2 == 0) goto L_0x0062
            if (r14 != 0) goto L_0x005c
            i4.u0 r2 = r11.b(r8)     // Catch:{ all -> 0x0026 }
            r14 = r2
        L_0x005c:
            java.lang.Object r2 = r11.d()     // Catch:{ all -> 0x0026 }
        L_0x0060:
            r13 = r2
            goto L_0x0014
        L_0x0062:
            r10.q()     // Catch:{ all -> 0x0026 }
            if (r13 != 0) goto L_0x006c
            i4.y2 r2 = r10.c(r8)     // Catch:{ all -> 0x0026 }
            r13 = r2
        L_0x006c:
            boolean r2 = r10.p(r13, r0)     // Catch:{ all -> 0x0026 }
            if (r2 != 0) goto L_0x0014
            int r0 = r1.f7282j
        L_0x0074:
            int r2 = r1.k
            if (r0 >= r2) goto L_0x0082
            int[] r2 = r1.f7281i
            r2 = r2[r0]
            r1.o(r8, r2, r13)
            int r0 = r0 + 1
            goto L_0x0074
        L_0x0082:
            if (r13 == 0) goto L_0x05f8
            r10.n(r8, r13)
            return
        L_0x0088:
            int r5 = r1.k(r2)     // Catch:{ all -> 0x0026 }
            int r6 = r5 >>> 20
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 3
            r12 = 1
            switch(r6) {
                case 0: goto L_0x059a;
                case 1: goto L_0x0581;
                case 2: goto L_0x056f;
                case 3: goto L_0x055d;
                case 4: goto L_0x054b;
                case 5: goto L_0x0539;
                case 6: goto L_0x0526;
                case 7: goto L_0x0513;
                case 8: goto L_0x050c;
                case 9: goto L_0x04f4;
                case 10: goto L_0x04e6;
                case 11: goto L_0x04d5;
                case 12: goto L_0x04a3;
                case 13: goto L_0x048d;
                case 14: goto L_0x0478;
                case 15: goto L_0x045f;
                case 16: goto L_0x0446;
                case 17: goto L_0x0432;
                case 18: goto L_0x0427;
                case 19: goto L_0x041c;
                case 20: goto L_0x0411;
                case 21: goto L_0x0406;
                case 22: goto L_0x03fb;
                case 23: goto L_0x03f0;
                case 24: goto L_0x03e5;
                case 25: goto L_0x03da;
                case 26: goto L_0x03b2;
                case 27: goto L_0x039e;
                case 28: goto L_0x038e;
                case 29: goto L_0x0383;
                case 30: goto L_0x0370;
                case 31: goto L_0x0363;
                case 32: goto L_0x0356;
                case 33: goto L_0x0349;
                case 34: goto L_0x033c;
                case 35: goto L_0x032f;
                case 36: goto L_0x0322;
                case 37: goto L_0x0315;
                case 38: goto L_0x0308;
                case 39: goto L_0x02fb;
                case 40: goto L_0x02ee;
                case 41: goto L_0x02e1;
                case 42: goto L_0x02d4;
                case 43: goto L_0x02c7;
                case 44: goto L_0x02ac;
                case 45: goto L_0x029c;
                case 46: goto L_0x028c;
                case 47: goto L_0x027c;
                case 48: goto L_0x026c;
                case 49: goto L_0x0258;
                case 50: goto L_0x0220;
                case 51: goto L_0x0201;
                case 52: goto L_0x01e8;
                case 53: goto L_0x01d5;
                case 54: goto L_0x01c2;
                case 55: goto L_0x01af;
                case 56: goto L_0x019b;
                case 57: goto L_0x0186;
                case 58: goto L_0x0175;
                case 59: goto L_0x0170;
                case 60: goto L_0x015a;
                case 61: goto L_0x0152;
                case 62: goto L_0x013f;
                case 63: goto L_0x010f;
                case 64: goto L_0x00fb;
                case 65: goto L_0x00e4;
                case 66: goto L_0x00ce;
                case 67: goto L_0x00b4;
                case 68: goto L_0x00a2;
                default: goto L_0x0098;
            }
        L_0x0098:
            r16 = 0
            if (r13 != 0) goto L_0x05b7
            i4.y2 r2 = r10.c(r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x05b6
        L_0x00a2:
            java.lang.Object r4 = r1.r(r3, r2, r8)     // Catch:{ h1 -> 0x0254 }
            i4.b2 r4 = (i4.b2) r4     // Catch:{ h1 -> 0x0254 }
            i4.m2 r5 = r1.n(r2)     // Catch:{ h1 -> 0x0254 }
            r0.q(r15)     // Catch:{ h1 -> 0x0254 }
            r0.n(r4, r5, r9)     // Catch:{ h1 -> 0x0254 }
            goto L_0x016b
        L_0x00b4:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ h1 -> 0x0254 }
            r0.q(r4)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r4 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r4 = (i4.f0) r4     // Catch:{ h1 -> 0x0254 }
            long r17 = r4.k()     // Catch:{ h1 -> 0x0254 }
            long r17 = i4.g0.g(r17)     // Catch:{ h1 -> 0x0254 }
            java.lang.Long r4 = java.lang.Long.valueOf(r17)     // Catch:{ h1 -> 0x0254 }
        L_0x00c9:
            i4.h3.s(r5, r8, r4)     // Catch:{ h1 -> 0x0254 }
            goto L_0x0219
        L_0x00ce:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ h1 -> 0x0254 }
            r0.q(r4)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r4 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r4 = (i4.f0) r4     // Catch:{ h1 -> 0x0254 }
            int r4 = r4.i()     // Catch:{ h1 -> 0x0254 }
            int r4 = i4.g0.f(r4)     // Catch:{ h1 -> 0x0254 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00c9
        L_0x00e4:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ h1 -> 0x0254 }
            r0.q(r12)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r6 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r6 = (i4.f0) r6     // Catch:{ h1 -> 0x0254 }
            long r6 = r6.j()     // Catch:{ h1 -> 0x0254 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ h1 -> 0x0254 }
        L_0x00f6:
            i4.h3.s(r4, r8, r6)     // Catch:{ h1 -> 0x0254 }
            goto L_0x0219
        L_0x00fb:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ h1 -> 0x0254 }
            r6 = 5
            r0.q(r6)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r6 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r6 = (i4.f0) r6     // Catch:{ h1 -> 0x0254 }
            int r6 = r6.h()     // Catch:{ h1 -> 0x0254 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00f6
        L_0x010f:
            r0.q(r4)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r4 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r4 = (i4.f0) r4     // Catch:{ h1 -> 0x0254 }
            int r4 = r4.i()     // Catch:{ h1 -> 0x0254 }
            i4.e1 r6 = r1.m(r2)     // Catch:{ h1 -> 0x0254 }
            if (r6 == 0) goto L_0x0138
            boolean r6 = r6.zza()     // Catch:{ h1 -> 0x0254 }
            if (r6 == 0) goto L_0x0127
            goto L_0x0138
        L_0x0127:
            java.lang.Class r2 = i4.n2.f7515a     // Catch:{ h1 -> 0x0254 }
            if (r13 != 0) goto L_0x0130
            i4.y2 r2 = r10.c(r8)     // Catch:{ h1 -> 0x0254 }
            goto L_0x0131
        L_0x0130:
            r2 = r13
        L_0x0131:
            long r4 = (long) r4     // Catch:{ h1 -> 0x0254 }
            r10.l(r3, r4, r2)     // Catch:{ h1 -> 0x0254 }
            r13 = r2
            goto L_0x021c
        L_0x0138:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ h1 -> 0x0254 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00c9
        L_0x013f:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ h1 -> 0x0254 }
            r0.q(r4)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r4 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r4 = (i4.f0) r4     // Catch:{ h1 -> 0x0254 }
            int r4 = r4.i()     // Catch:{ h1 -> 0x0254 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00c9
        L_0x0152:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ h1 -> 0x0254 }
            i4.d0 r6 = r21.u()     // Catch:{ h1 -> 0x0254 }
            goto L_0x00f6
        L_0x015a:
            java.lang.Object r4 = r1.r(r3, r2, r8)     // Catch:{ h1 -> 0x0254 }
            i4.b2 r4 = (i4.b2) r4     // Catch:{ h1 -> 0x0254 }
            i4.m2 r5 = r1.n(r2)     // Catch:{ h1 -> 0x0254 }
            r6 = 2
            r0.q(r6)     // Catch:{ h1 -> 0x0254 }
            r0.o(r4, r5, r9)     // Catch:{ h1 -> 0x0254 }
        L_0x016b:
            r1.A(r8, r3, r2, r4)     // Catch:{ h1 -> 0x0254 }
            goto L_0x021c
        L_0x0170:
            r1.w(r8, r5, r0)     // Catch:{ h1 -> 0x0254 }
            goto L_0x0219
        L_0x0175:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ h1 -> 0x0254 }
            r0.q(r4)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r4 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            boolean r4 = r4.d()     // Catch:{ h1 -> 0x0254 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00c9
        L_0x0186:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ h1 -> 0x0254 }
            r6 = 5
            r0.q(r6)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r6 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r6 = (i4.f0) r6     // Catch:{ h1 -> 0x0254 }
            int r6 = r6.h()     // Catch:{ h1 -> 0x0254 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00f6
        L_0x019b:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ h1 -> 0x0254 }
            r0.q(r12)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r6 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r6 = (i4.f0) r6     // Catch:{ h1 -> 0x0254 }
            long r6 = r6.j()     // Catch:{ h1 -> 0x0254 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00f6
        L_0x01af:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ h1 -> 0x0254 }
            r0.q(r4)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r4 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r4 = (i4.f0) r4     // Catch:{ h1 -> 0x0254 }
            int r4 = r4.i()     // Catch:{ h1 -> 0x0254 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00c9
        L_0x01c2:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ h1 -> 0x0254 }
            r0.q(r4)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r4 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r4 = (i4.f0) r4     // Catch:{ h1 -> 0x0254 }
            long r17 = r4.k()     // Catch:{ h1 -> 0x0254 }
            java.lang.Long r4 = java.lang.Long.valueOf(r17)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00c9
        L_0x01d5:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ h1 -> 0x0254 }
            r0.q(r4)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r4 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r4 = (i4.f0) r4     // Catch:{ h1 -> 0x0254 }
            long r17 = r4.k()     // Catch:{ h1 -> 0x0254 }
            java.lang.Long r4 = java.lang.Long.valueOf(r17)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00c9
        L_0x01e8:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ h1 -> 0x0254 }
            r6 = 5
            r0.q(r6)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r6 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r6 = (i4.f0) r6     // Catch:{ h1 -> 0x0254 }
            int r6 = r6.h()     // Catch:{ h1 -> 0x0254 }
            float r6 = java.lang.Float.intBitsToFloat(r6)     // Catch:{ h1 -> 0x0254 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00f6
        L_0x0201:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ h1 -> 0x0254 }
            r0.q(r12)     // Catch:{ h1 -> 0x0254 }
            i4.g0 r6 = r0.f7340a     // Catch:{ h1 -> 0x0254 }
            i4.f0 r6 = (i4.f0) r6     // Catch:{ h1 -> 0x0254 }
            long r6 = r6.j()     // Catch:{ h1 -> 0x0254 }
            double r6 = java.lang.Double.longBitsToDouble(r6)     // Catch:{ h1 -> 0x0254 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ h1 -> 0x0254 }
            goto L_0x00f6
        L_0x0219:
            r1.y(r3, r2, r8)     // Catch:{ h1 -> 0x0254 }
        L_0x021c:
            r16 = 0
            goto L_0x0014
        L_0x0220:
            java.lang.Object r3 = r1.p(r2)     // Catch:{ h1 -> 0x0254 }
            int r2 = r1.k(r2)     // Catch:{ h1 -> 0x0254 }
            r2 = r2 & r7
            long r4 = (long) r2     // Catch:{ h1 -> 0x0254 }
            java.lang.Object r2 = i4.h3.j(r4, r8)     // Catch:{ h1 -> 0x0254 }
            if (r2 == 0) goto L_0x0244
            boolean r6 = i4.x1.b(r2)     // Catch:{ h1 -> 0x0254 }
            if (r6 == 0) goto L_0x024d
            i4.w1 r6 = i4.w1.f7755b     // Catch:{ h1 -> 0x0254 }
            i4.w1 r6 = r6.c()     // Catch:{ h1 -> 0x0254 }
            i4.x1.c(r6, r2)     // Catch:{ h1 -> 0x0254 }
            i4.h3.s(r4, r8, r6)     // Catch:{ h1 -> 0x0254 }
            r2 = r6
            goto L_0x024d
        L_0x0244:
            i4.w1 r2 = i4.w1.f7755b     // Catch:{ h1 -> 0x0254 }
            i4.w1 r2 = r2.c()     // Catch:{ h1 -> 0x0254 }
            i4.h3.s(r4, r8, r2)     // Catch:{ h1 -> 0x0254 }
        L_0x024d:
            i4.w1 r2 = (i4.w1) r2     // Catch:{ h1 -> 0x0254 }
            i4.v1 r3 = (i4.v1) r3     // Catch:{ h1 -> 0x0254 }
            r16 = 0
            throw r16     // Catch:{ h1 -> 0x05d3 }
        L_0x0254:
            r16 = 0
            goto L_0x05d3
        L_0x0258:
            r16 = 0
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            i4.m2 r2 = r1.n(r2)     // Catch:{ h1 -> 0x05d3 }
            i4.p1 r5 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            java.util.List r3 = r5.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            r0.c(r3, r2, r9)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x026c:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
        L_0x0277:
            r0.j(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x027c:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
        L_0x0287:
            r0.i(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x028c:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
        L_0x0297:
            r0.h(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x029c:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
        L_0x02a7:
            r0.g(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x02ac:
            r16 = 0
            i4.p1 r4 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ h1 -> 0x05d3 }
            java.util.List r4 = r4.a(r5, r8)     // Catch:{ h1 -> 0x05d3 }
            r0.A(r4)     // Catch:{ h1 -> 0x05d3 }
            i4.e1 r5 = r1.m(r2)     // Catch:{ h1 -> 0x05d3 }
        L_0x02bd:
            r2 = r20
            r6 = r13
            r7 = r10
            java.lang.Object r13 = i4.n2.a(r2, r3, r4, r5, r6, r7)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x02c7:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
        L_0x02cb:
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0389
        L_0x02d4:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
        L_0x02d8:
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x03e0
        L_0x02e1:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
        L_0x02e5:
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x03eb
        L_0x02ee:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
        L_0x02f2:
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x03f6
        L_0x02fb:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
        L_0x02ff:
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0401
        L_0x0308:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
        L_0x030c:
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x040c
        L_0x0315:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
        L_0x0319:
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0417
        L_0x0322:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
        L_0x0326:
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0422
        L_0x032f:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
        L_0x0333:
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x042d
        L_0x033c:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0277
        L_0x0349:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0287
        L_0x0356:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0297
        L_0x0363:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x02a7
        L_0x0370:
            r16 = 0
            i4.p1 r4 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ h1 -> 0x05d3 }
            java.util.List r4 = r4.a(r5, r8)     // Catch:{ h1 -> 0x05d3 }
            r0.A(r4)     // Catch:{ h1 -> 0x05d3 }
            i4.e1 r5 = r1.m(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x02bd
        L_0x0383:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            goto L_0x02cb
        L_0x0389:
            r0.l(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x038e:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            r0.y(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x039e:
            r16 = 0
            i4.m2 r2 = r1.n(r2)     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            i4.p1 r5 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            java.util.List r3 = r5.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            r0.f(r3, r2, r9)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x03b2:
            r16 = 0
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r5
            if (r2 == 0) goto L_0x03bb
            r2 = r12
            goto L_0x03bc
        L_0x03bb:
            r2 = r4
        L_0x03bc:
            if (r2 == 0) goto L_0x03cc
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r3, r8)     // Catch:{ h1 -> 0x05d3 }
            r0.k(r2, r12)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x03cc:
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            r3 = r5 & r7
            long r5 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            java.util.List r2 = r2.a(r5, r8)     // Catch:{ h1 -> 0x05d3 }
            r0.k(r2, r4)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x03da:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            goto L_0x02d8
        L_0x03e0:
            r0.x(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x03e5:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            goto L_0x02e5
        L_0x03eb:
            r0.B(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x03f0:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            goto L_0x02f2
        L_0x03f6:
            r0.a(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x03fb:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            goto L_0x02ff
        L_0x0401:
            r0.d(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x0406:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            goto L_0x030c
        L_0x040c:
            r0.m(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x0411:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0319
        L_0x0417:
            r0.e(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x041c:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0326
        L_0x0422:
            r0.b(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x0427:
            r16 = 0
            i4.p1 r2 = r1.f7283l     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0333
        L_0x042d:
            r0.z(r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x0432:
            r16 = 0
            java.lang.Object r3 = r1.q(r2, r8)     // Catch:{ h1 -> 0x05d3 }
            i4.b2 r3 = (i4.b2) r3     // Catch:{ h1 -> 0x05d3 }
            i4.m2 r4 = r1.n(r2)     // Catch:{ h1 -> 0x05d3 }
            r0.q(r15)     // Catch:{ h1 -> 0x05d3 }
            r0.n(r3, r4, r9)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0507
        L_0x0446:
            r16 = 0
            r3 = r5 & r7
            long r5 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r0.q(r4)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r3 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r3 = (i4.f0) r3     // Catch:{ h1 -> 0x05d3 }
            long r3 = r3.k()     // Catch:{ h1 -> 0x05d3 }
            long r3 = i4.g0.g(r3)     // Catch:{ h1 -> 0x05d3 }
        L_0x045a:
            i4.h3.r(r8, r5, r3)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x05b1
        L_0x045f:
            r16 = 0
            r3 = r5 & r7
            long r5 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r0.q(r4)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r3 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r3 = (i4.f0) r3     // Catch:{ h1 -> 0x05d3 }
            int r3 = r3.i()     // Catch:{ h1 -> 0x05d3 }
            int r3 = i4.g0.f(r3)     // Catch:{ h1 -> 0x05d3 }
        L_0x0473:
            i4.h3.q(r3, r5, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x05b1
        L_0x0478:
            r16 = 0
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r0.q(r12)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r5 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r5 = (i4.f0) r5     // Catch:{ h1 -> 0x05d3 }
            long r5 = r5.j()     // Catch:{ h1 -> 0x05d3 }
        L_0x0488:
            i4.h3.r(r8, r3, r5)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x05b1
        L_0x048d:
            r16 = 0
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r5 = 5
            r0.q(r5)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r5 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r5 = (i4.f0) r5     // Catch:{ h1 -> 0x05d3 }
            int r5 = r5.h()     // Catch:{ h1 -> 0x05d3 }
        L_0x049e:
            i4.h3.q(r5, r3, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x05b1
        L_0x04a3:
            r16 = 0
            r0.q(r4)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r4 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r4 = (i4.f0) r4     // Catch:{ h1 -> 0x05d3 }
            int r4 = r4.i()     // Catch:{ h1 -> 0x05d3 }
            i4.e1 r6 = r1.m(r2)     // Catch:{ h1 -> 0x05d3 }
            if (r6 == 0) goto L_0x04cd
            boolean r6 = r6.zza()     // Catch:{ h1 -> 0x05d3 }
            if (r6 == 0) goto L_0x04bd
            goto L_0x04cd
        L_0x04bd:
            java.lang.Class r2 = i4.n2.f7515a     // Catch:{ h1 -> 0x05d3 }
            if (r13 != 0) goto L_0x04c6
            i4.y2 r2 = r10.c(r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x04c7
        L_0x04c6:
            r2 = r13
        L_0x04c7:
            long r4 = (long) r4     // Catch:{ h1 -> 0x05d3 }
            r10.l(r3, r4, r2)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0060
        L_0x04cd:
            r3 = r5 & r7
            long r5 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            i4.h3.q(r4, r5, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x05b1
        L_0x04d5:
            r16 = 0
            r3 = r5 & r7
            long r5 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r0.q(r4)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r3 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r3 = (i4.f0) r3     // Catch:{ h1 -> 0x05d3 }
            int r3 = r3.i()     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0473
        L_0x04e6:
            r16 = 0
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            i4.d0 r5 = r21.u()     // Catch:{ h1 -> 0x05d3 }
            i4.h3.s(r3, r8, r5)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x05b1
        L_0x04f4:
            r16 = 0
            java.lang.Object r3 = r1.q(r2, r8)     // Catch:{ h1 -> 0x05d3 }
            i4.b2 r3 = (i4.b2) r3     // Catch:{ h1 -> 0x05d3 }
            i4.m2 r4 = r1.n(r2)     // Catch:{ h1 -> 0x05d3 }
            r5 = 2
            r0.q(r5)     // Catch:{ h1 -> 0x05d3 }
            r0.o(r3, r4, r9)     // Catch:{ h1 -> 0x05d3 }
        L_0x0507:
            r1.z(r8, r2, r3)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x050c:
            r16 = 0
            r1.w(r8, r5, r0)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x05b1
        L_0x0513:
            r16 = 0
            r3 = r5 & r7
            long r5 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r0.q(r4)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r3 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            boolean r3 = r3.d()     // Catch:{ h1 -> 0x05d3 }
            i4.h3.m(r8, r5, r3)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x05b1
        L_0x0526:
            r16 = 0
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r5 = 5
            r0.q(r5)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r5 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r5 = (i4.f0) r5     // Catch:{ h1 -> 0x05d3 }
            int r5 = r5.h()     // Catch:{ h1 -> 0x05d3 }
            goto L_0x049e
        L_0x0539:
            r16 = 0
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r0.q(r12)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r5 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r5 = (i4.f0) r5     // Catch:{ h1 -> 0x05d3 }
            long r5 = r5.j()     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0488
        L_0x054b:
            r16 = 0
            r3 = r5 & r7
            long r5 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r0.q(r4)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r3 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r3 = (i4.f0) r3     // Catch:{ h1 -> 0x05d3 }
            int r3 = r3.i()     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0473
        L_0x055d:
            r16 = 0
            r3 = r5 & r7
            long r5 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r0.q(r4)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r3 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r3 = (i4.f0) r3     // Catch:{ h1 -> 0x05d3 }
            long r3 = r3.k()     // Catch:{ h1 -> 0x05d3 }
            goto L_0x045a
        L_0x056f:
            r16 = 0
            r3 = r5 & r7
            long r5 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r0.q(r4)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r3 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r3 = (i4.f0) r3     // Catch:{ h1 -> 0x05d3 }
            long r3 = r3.k()     // Catch:{ h1 -> 0x05d3 }
            goto L_0x045a
        L_0x0581:
            r16 = 0
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r5 = 5
            r0.q(r5)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r5 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r5 = (i4.f0) r5     // Catch:{ h1 -> 0x05d3 }
            int r5 = r5.h()     // Catch:{ h1 -> 0x05d3 }
            float r5 = java.lang.Float.intBitsToFloat(r5)     // Catch:{ h1 -> 0x05d3 }
            i4.h3.p(r8, r3, r5)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x05b1
        L_0x059a:
            r16 = 0
            r3 = r5 & r7
            long r3 = (long) r3     // Catch:{ h1 -> 0x05d3 }
            r0.q(r12)     // Catch:{ h1 -> 0x05d3 }
            i4.g0 r5 = r0.f7340a     // Catch:{ h1 -> 0x05d3 }
            i4.f0 r5 = (i4.f0) r5     // Catch:{ h1 -> 0x05d3 }
            long r5 = r5.j()     // Catch:{ h1 -> 0x05d3 }
            double r5 = java.lang.Double.longBitsToDouble(r5)     // Catch:{ h1 -> 0x05d3 }
            i4.h3.o(r8, r3, r5)     // Catch:{ h1 -> 0x05d3 }
        L_0x05b1:
            r1.x(r2, r8)     // Catch:{ h1 -> 0x05d3 }
            goto L_0x0014
        L_0x05b6:
            r13 = r2
        L_0x05b7:
            boolean r2 = r10.p(r13, r0)     // Catch:{ h1 -> 0x05d3 }
            if (r2 != 0) goto L_0x0014
            int r0 = r1.f7282j
        L_0x05bf:
            int r2 = r1.k
            if (r0 >= r2) goto L_0x05cd
            int[] r2 = r1.f7281i
            r2 = r2[r0]
            r1.o(r8, r2, r13)
            int r0 = r0 + 1
            goto L_0x05bf
        L_0x05cd:
            if (r13 == 0) goto L_0x05f8
            r10.n(r8, r13)
            return
        L_0x05d3:
            r10.q()     // Catch:{ all -> 0x0026 }
            if (r13 != 0) goto L_0x05dd
            i4.y2 r2 = r10.c(r8)     // Catch:{ all -> 0x0026 }
            r13 = r2
        L_0x05dd:
            boolean r2 = r10.p(r13, r0)     // Catch:{ all -> 0x0026 }
            if (r2 != 0) goto L_0x0014
            int r0 = r1.f7282j
        L_0x05e5:
            int r2 = r1.k
            if (r0 >= r2) goto L_0x05f3
            int[] r2 = r1.f7281i
            r2 = r2[r0]
            r1.o(r8, r2, r13)
            int r0 = r0 + 1
            goto L_0x05e5
        L_0x05f3:
            if (r13 == 0) goto L_0x05f8
            r10.n(r8, r13)
        L_0x05f8:
            return
        L_0x05f9:
            int r2 = r1.f7282j
        L_0x05fb:
            int r3 = r1.k
            if (r2 >= r3) goto L_0x0609
            int[] r3 = r1.f7281i
            r3 = r3[r2]
            r1.o(r8, r3, r13)
            int r2 = r2 + 1
            goto L_0x05fb
        L_0x0609:
            if (r13 == 0) goto L_0x060e
            r10.n(r8, r13)
        L_0x060e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e2.i(java.lang.Object, i4.h0, i4.p0):void");
    }

    public final int j(int i10, int i11) {
        int length = (this.f7273a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f7273a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final int k(int i10) {
        return this.f7273a[i10 + 1];
    }

    public final e1 m(int i10) {
        int i11 = i10 / 3;
        return (e1) this.f7274b[i11 + i11 + 1];
    }

    public final m2 n(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f7274b;
        m2 m2Var = (m2) objArr[i12];
        if (m2Var != null) {
            return m2Var;
        }
        m2 a10 = j2.f7400c.a((Class) objArr[i12 + 1]);
        this.f7274b[i12] = a10;
        return a10;
    }

    public final void o(Object obj, int i10, Object obj2) {
        int i11 = this.f7273a[i10];
        Object j10 = h3.j((long) (k(i10) & 1048575), obj);
        if (j10 != null && m(i10) != null) {
            w1 w1Var = (w1) j10;
            v1 v1Var = (v1) p(i10);
            throw null;
        }
    }

    public final Object p(int i10) {
        int i11 = i10 / 3;
        return this.f7274b[i11 + i11];
    }

    public final Object q(int i10, Object obj) {
        m2 n2 = n(i10);
        long k10 = (long) (k(i10) & 1048575);
        if (!C(i10, obj)) {
            return n2.zze();
        }
        Object object = f7272p.getObject(obj, k10);
        if (D(object)) {
            return object;
        }
        c1 zze = n2.zze();
        if (object != null) {
            n2.c(zze, object);
        }
        return zze;
    }

    public final Object r(int i10, int i11, Object obj) {
        m2 n2 = n(i11);
        if (!E(i10, i11, obj)) {
            return n2.zze();
        }
        Object object = f7272p.getObject(obj, (long) (k(i11) & 1048575));
        if (D(object)) {
            return object;
        }
        c1 zze = n2.zze();
        if (object != null) {
            n2.c(zze, object);
        }
        return zze;
    }

    public final void u(Object obj, int i10, Object obj2) {
        if (C(i10, obj2)) {
            long k10 = (long) (k(i10) & 1048575);
            Unsafe unsafe = f7272p;
            Object object = unsafe.getObject(obj2, k10);
            if (object != null) {
                m2 n2 = n(i10);
                if (!C(i10, obj)) {
                    if (!D(object)) {
                        unsafe.putObject(obj, k10, object);
                    } else {
                        c1 zze = n2.zze();
                        n2.c(zze, object);
                        unsafe.putObject(obj, k10, zze);
                    }
                    x(i10, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, k10);
                if (!D(object2)) {
                    c1 zze2 = n2.zze();
                    n2.c(zze2, object2);
                    unsafe.putObject(obj, k10, zze2);
                    object2 = zze2;
                }
                n2.c(object2, object);
                return;
            }
            int i11 = this.f7273a[i10];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i11 + " is present but null: " + obj3);
        }
    }

    public final void v(Object obj, int i10, Object obj2) {
        int i11 = this.f7273a[i10];
        if (E(i11, i10, obj2)) {
            long k10 = (long) (k(i10) & 1048575);
            Unsafe unsafe = f7272p;
            Object object = unsafe.getObject(obj2, k10);
            if (object != null) {
                m2 n2 = n(i10);
                if (!E(i11, i10, obj)) {
                    if (!D(object)) {
                        unsafe.putObject(obj, k10, object);
                    } else {
                        c1 zze = n2.zze();
                        n2.c(zze, object);
                        unsafe.putObject(obj, k10, zze);
                    }
                    y(i11, i10, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, k10);
                if (!D(object2)) {
                    c1 zze2 = n2.zze();
                    n2.c(zze2, object2);
                    unsafe.putObject(obj, k10, zze2);
                    object2 = zze2;
                }
                n2.c(object2, object);
                return;
            }
            int i12 = this.f7273a[i10];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i12 + " is present but null: " + obj3);
        }
    }

    public final void w(Object obj, int i10, h0 h0Var) {
        Object obj2;
        long j10;
        if ((536870912 & i10) != 0) {
            j10 = (long) (i10 & 1048575);
            obj2 = h0Var.w();
        } else {
            int i11 = i10 & 1048575;
            if (this.f7279g) {
                j10 = (long) i11;
                obj2 = h0Var.v();
            } else {
                j10 = (long) i11;
                obj2 = h0Var.u();
            }
        }
        h3.s(j10, obj, obj2);
    }

    public final void x(int i10, Object obj) {
        int i11 = this.f7273a[i10 + 2];
        long j10 = (long) (1048575 & i11);
        if (j10 != 1048575) {
            h3.q((1 << (i11 >>> 20)) | h3.g(j10, obj), j10, obj);
        }
    }

    public final void y(int i10, int i11, Object obj) {
        h3.q(i10, (long) (this.f7273a[i11 + 2] & 1048575), obj);
    }

    public final void z(Object obj, int i10, Object obj2) {
        f7272p.putObject(obj, (long) (k(i10) & 1048575), obj2);
        x(i10, obj);
    }

    public final c1 zze() {
        return ((c1) this.f7277e).s();
    }
}
