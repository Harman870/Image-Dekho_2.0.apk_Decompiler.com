package j4;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class q8<T> implements y8<T> {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f8404n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f8405o = t9.k();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f8406a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f8407b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8408c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8409d;

    /* renamed from: e  reason: collision with root package name */
    public final n8 f8410e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8411f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8412g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f8413h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8414i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8415j;
    public final b8 k;

    /* renamed from: l  reason: collision with root package name */
    public final j9 f8416l;

    /* renamed from: m  reason: collision with root package name */
    public final z6 f8417m;

    public q8(int[] iArr, Object[] objArr, int i10, int i11, n8 n8Var, boolean z9, int[] iArr2, int i12, int i13, b8 b8Var, j9 j9Var, z6 z6Var) {
        this.f8406a = iArr;
        this.f8407b = objArr;
        this.f8408c = i10;
        this.f8409d = i11;
        this.f8412g = z9;
        this.f8411f = z6Var != null && z6Var.c(n8Var);
        this.f8413h = iArr2;
        this.f8414i = i12;
        this.f8415j = i13;
        this.k = b8Var;
        this.f8416l = j9Var;
        this.f8417m = z6Var;
        this.f8410e = n8Var;
    }

    public static k9 A(Object obj) {
        m7 m7Var = (m7) obj;
        k9 k9Var = m7Var.zzc;
        if (k9Var != k9.f8298f) {
            return k9Var;
        }
        k9 b10 = k9.b();
        m7Var.zzc = b10;
        return b10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x037a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j4.q8 B(j4.l8 r36, j4.b8 r37, j4.j9 r38, j4.z6 r39) {
        /*
            r0 = r36
            boolean r1 = r0 instanceof j4.x8
            if (r1 == 0) goto L_0x03df
            j4.x8 r0 = (j4.x8) r0
            int r1 = r0.zzc()
            java.lang.String r2 = r0.a()
            int r3 = r2.length()
            r4 = 0
            char r5 = r2.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0029
            r5 = 1
        L_0x001f:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x002a
            r5 = r8
            goto L_0x001f
        L_0x0029:
            r8 = 1
        L_0x002a:
            int r5 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0049
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0036:
            int r11 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x0046
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r10
            r8 = r8 | r5
            int r10 = r10 + 13
            r5 = r11
            goto L_0x0036
        L_0x0046:
            int r5 = r5 << r10
            r8 = r8 | r5
            r5 = r11
        L_0x0049:
            if (r8 != 0) goto L_0x005e
            int[] r8 = f8404n
            r12 = r4
            r13 = r12
            r14 = r13
            r20 = r14
            r21 = r20
            r25 = r21
            r16 = r5
            r24 = r8
            r5 = r25
            goto L_0x0172
        L_0x005e:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x006a:
            int r11 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x007a
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r5 = r5 | r8
            int r10 = r10 + 13
            r8 = r11
            goto L_0x006a
        L_0x007a:
            int r8 = r8 << r10
            r5 = r5 | r8
            r8 = r11
        L_0x007d:
            int r10 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x009c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x0089:
            int r12 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x0099
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r8 = r8 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x0089
        L_0x0099:
            int r10 = r10 << r11
            r8 = r8 | r10
            r10 = r12
        L_0x009c:
            int r11 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x00bb
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a8:
            int r13 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00b8
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00a8
        L_0x00b8:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00bb:
            int r12 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00da
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c7:
            int r14 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00d7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c7
        L_0x00d7:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00da:
            int r13 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e6:
            int r15 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x00f6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e6
        L_0x00f6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f9:
            int r14 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0105:
            int r16 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x0116
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0105
        L_0x0116:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011a:
            int r15 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x013d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0126:
            int r17 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x0138
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0126
        L_0x0138:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013d:
            int r16 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x014b:
            int r17 = r4 + 1
            char r4 = r2.charAt(r4)
            if (r4 < r6) goto L_0x015d
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x014b
        L_0x015d:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r17
        L_0x0162:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int r14 = r5 + r5
            int r14 = r14 + r8
            int[] r8 = new int[r4]
            r24 = r8
            r20 = r10
            r21 = r11
            r25 = r15
        L_0x0172:
            sun.misc.Unsafe r4 = f8405o
            java.lang.Object[] r8 = r0.b()
            j4.n8 r10 = r0.zza()
            java.lang.Class r10 = r10.getClass()
            int r26 = r25 + r13
            int r11 = r12 + r12
            int r12 = r12 * 3
            int[] r12 = new int[r12]
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r13 = r16
            r17 = r25
            r18 = r26
            r15 = 0
            r16 = 0
        L_0x0193:
            r9 = 2
            if (r1 != r9) goto L_0x0199
            r23 = 1
            goto L_0x019b
        L_0x0199:
            r23 = 0
        L_0x019b:
            if (r13 >= r3) goto L_0x03c9
            int r9 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x01c0
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r22 = 13
        L_0x01a9:
            int r27 = r9 + 1
            char r9 = r2.charAt(r9)
            if (r9 < r6) goto L_0x01bb
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r22
            r13 = r13 | r9
            int r22 = r22 + 13
            r9 = r27
            goto L_0x01a9
        L_0x01bb:
            int r9 = r9 << r22
            r13 = r13 | r9
            r9 = r27
        L_0x01c0:
            int r22 = r9 + 1
            char r9 = r2.charAt(r9)
            if (r9 < r6) goto L_0x01e6
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r7 = r22
            r22 = 13
        L_0x01ce:
            int r28 = r7 + 1
            char r7 = r2.charAt(r7)
            if (r7 < r6) goto L_0x01e0
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r22
            r9 = r9 | r7
            int r22 = r22 + 13
            r7 = r28
            goto L_0x01ce
        L_0x01e0:
            int r7 = r7 << r22
            r9 = r9 | r7
            r7 = r28
            goto L_0x01e8
        L_0x01e6:
            r7 = r22
        L_0x01e8:
            r6 = r9 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x01f1
            int r6 = r15 + 1
            r24[r15] = r16
            r15 = r6
        L_0x01f1:
            r6 = r9 & 255(0xff, float:3.57E-43)
            r28 = r1
            r1 = 51
            if (r6 < r1) goto L_0x029b
            int r1 = r7 + 1
            char r7 = r2.charAt(r7)
            r29 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x022d
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
            r35 = r29
            r29 = r7
            r7 = r35
        L_0x0210:
            int r34 = r7 + 1
            char r7 = r2.charAt(r7)
            if (r7 < r1) goto L_0x0226
            r1 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r33
            r29 = r29 | r1
            int r33 = r33 + 13
            r7 = r34
            r1 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0210
        L_0x0226:
            int r1 = r7 << r33
            r7 = r29 | r1
            r1 = r34
            goto L_0x022f
        L_0x022d:
            r1 = r29
        L_0x022f:
            r29 = r1
            int r1 = r6 + -51
            r33 = r3
            r3 = 9
            if (r1 == r3) goto L_0x0250
            r3 = 17
            if (r1 != r3) goto L_0x023e
            goto L_0x0250
        L_0x023e:
            r3 = 12
            if (r1 != r3) goto L_0x025c
            if (r23 != 0) goto L_0x025c
            int r1 = r16 / 3
            int r1 = r1 + r1
            r3 = 1
            int r1 = r1 + r3
            int r3 = r14 + 1
            r14 = r8[r14]
            r11[r1] = r14
            goto L_0x025b
        L_0x0250:
            int r1 = r16 / 3
            int r1 = r1 + r1
            r3 = 1
            int r1 = r1 + r3
            int r3 = r14 + 1
            r14 = r8[r14]
            r11[r1] = r14
        L_0x025b:
            r14 = r3
        L_0x025c:
            int r7 = r7 + r7
            r1 = r8[r7]
            boolean r3 = r1 instanceof java.lang.reflect.Field
            if (r3 == 0) goto L_0x0266
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            goto L_0x026e
        L_0x0266:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = m(r10, r1)
            r8[r7] = r1
        L_0x026e:
            r23 = r14
            r3 = r15
            long r14 = r4.objectFieldOffset(r1)
            int r1 = (int) r14
            int r7 = r7 + 1
            r14 = r8[r7]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0281
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x0289
        L_0x0281:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = m(r10, r14)
            r8[r7] = r14
        L_0x0289:
            long r14 = r4.objectFieldOffset(r14)
            int r7 = (int) r14
            r31 = r2
            r32 = r3
            r30 = r7
            r14 = r23
            r7 = 0
            r27 = 1
            goto L_0x0395
        L_0x029b:
            r33 = r3
            r3 = r15
            int r1 = r14 + 1
            r14 = r8[r14]
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = m(r10, r14)
            r15 = 9
            if (r6 == r15) goto L_0x0311
            r15 = 17
            if (r6 != r15) goto L_0x02b1
            goto L_0x0311
        L_0x02b1:
            r15 = 27
            if (r6 == r15) goto L_0x0301
            r15 = 49
            if (r6 != r15) goto L_0x02ba
            goto L_0x0301
        L_0x02ba:
            r15 = 12
            if (r6 == r15) goto L_0x02ef
            r15 = 30
            if (r6 == r15) goto L_0x02ef
            r15 = 44
            if (r6 != r15) goto L_0x02c7
            goto L_0x02ef
        L_0x02c7:
            r15 = 50
            if (r6 != r15) goto L_0x02e7
            int r15 = r17 + 1
            r24[r17] = r16
            int r17 = r16 / 3
            int r23 = r1 + 1
            r1 = r8[r1]
            int r17 = r17 + r17
            r11[r17] = r1
            r1 = r9 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x02ea
            int r17 = r17 + 1
            int r1 = r23 + 1
            r23 = r8[r23]
            r11[r17] = r23
            r17 = r15
        L_0x02e7:
            r27 = 1
            goto L_0x031e
        L_0x02ea:
            r17 = r15
            r27 = 1
            goto L_0x0320
        L_0x02ef:
            if (r23 != 0) goto L_0x02e7
            int r15 = r16 / 3
            int r15 = r15 + r15
            r23 = 1
            int r15 = r15 + 1
            int r23 = r1 + 1
            r1 = r8[r1]
            r11[r15] = r1
            r1 = r23
            goto L_0x02e7
        L_0x0301:
            int r15 = r16 / 3
            int r15 = r15 + r15
            r27 = 1
            int r15 = r15 + 1
            int r23 = r1 + 1
            r1 = r8[r1]
            r11[r15] = r1
            r1 = r23
            goto L_0x031e
        L_0x0311:
            r27 = 1
            int r15 = r16 / 3
            int r15 = r15 + r15
            int r15 = r15 + 1
            java.lang.Class r23 = r14.getType()
            r11[r15] = r23
        L_0x031e:
            r23 = r1
        L_0x0320:
            long r14 = r4.objectFieldOffset(r14)
            int r1 = (int) r14
            r14 = r9 & 4096(0x1000, float:5.74E-42)
            r15 = 4096(0x1000, float:5.74E-42)
            if (r14 != r15) goto L_0x037a
            r14 = 17
            if (r6 > r14) goto L_0x037a
            int r14 = r7 + 1
            char r7 = r2.charAt(r7)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r15) goto L_0x0355
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r22 = 13
        L_0x033e:
            int r30 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r15) goto L_0x0350
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r22
            r7 = r7 | r14
            int r22 = r22 + 13
            r14 = r30
            goto L_0x033e
        L_0x0350:
            int r14 = r14 << r22
            r7 = r7 | r14
            r14 = r30
        L_0x0355:
            int r22 = r5 + r5
            int r30 = r7 / 32
            int r30 = r30 + r22
            r15 = r8[r30]
            r31 = r2
            boolean r2 = r15 instanceof java.lang.reflect.Field
            if (r2 == 0) goto L_0x0366
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            goto L_0x036e
        L_0x0366:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Field r15 = m(r10, r15)
            r8[r30] = r15
        L_0x036e:
            r32 = r3
            long r2 = r4.objectFieldOffset(r15)
            int r2 = (int) r2
            int r7 = r7 % 32
            r30 = r2
            goto L_0x0383
        L_0x037a:
            r31 = r2
            r32 = r3
            r14 = r7
            r7 = 0
            r30 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0383:
            r2 = 18
            if (r6 < r2) goto L_0x0391
            r2 = 49
            if (r6 > r2) goto L_0x0391
            int r2 = r18 + 1
            r24[r18] = r1
            r18 = r2
        L_0x0391:
            r29 = r14
            r14 = r23
        L_0x0395:
            int r2 = r16 + 1
            r12[r16] = r13
            int r3 = r2 + 1
            r13 = r9 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x03a2
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03a3
        L_0x03a2:
            r13 = 0
        L_0x03a3:
            r9 = r9 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x03aa
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03ab
        L_0x03aa:
            r9 = 0
        L_0x03ab:
            int r6 = r6 << 20
            r9 = r9 | r13
            r6 = r6 | r9
            r1 = r1 | r6
            r12[r2] = r1
            int r16 = r3 + 1
            int r1 = r7 << 20
            r1 = r1 | r30
            r12[r3] = r1
            r1 = r28
            r13 = r29
            r2 = r31
            r15 = r32
            r3 = r33
            r6 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0193
        L_0x03c9:
            j4.q8 r1 = new j4.q8
            j4.n8 r22 = r0.zza()
            r17 = r1
            r18 = r12
            r19 = r11
            r27 = r37
            r28 = r38
            r29 = r39
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x03df:
            j4.i9 r0 = (j4.i9) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q8.B(j4.l8, j4.b8, j4.j9, j4.z6):j4.q8");
    }

    public static int D(long j10, Object obj) {
        return ((Integer) t9.j(j10, obj)).intValue();
    }

    public static long J(long j10, Object obj) {
        return ((Long) t9.j(j10, obj)).longValue();
    }

    public static Field m(Class cls, String str) {
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

    public static void n(Object obj) {
        if (!w(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean w(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof m7) {
            return ((m7) obj).r();
        }
        return true;
    }

    public static final void y(int i10, Object obj, v6 v6Var) {
        if (obj instanceof String) {
            v6Var.f8509a.d0(i10, (String) obj);
            return;
        }
        v6Var.f(i10, (q6) obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02bc, code lost:
        r3 = j4.u6.j0(r11, (j4.n8) r2.getObject(r1, r3), i(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02eb, code lost:
        r3 = j4.u6.m0((r3 >> 31) ^ (r3 + r3)) + j4.u6.m0(r11 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x032c, code lost:
        r3 = j4.z8.H(r11, i(r5), r2.getObject(r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0346, code lost:
        r9 = j4.u6.f8492x;
        r3 = ((j4.q6) r3).g();
        r9 = j4.u6.m0(r3) + r3;
        r3 = j4.u6.m0(r11 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0359, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0369, code lost:
        r3 = j4.u6.m0(r11 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x037f, code lost:
        r4 = r11 << 3;
        r3 = j4.u6.k0(r2.getInt(r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0389, code lost:
        r4 = j4.u6.m0(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0397, code lost:
        r3 = j4.u6.n0(r2.getLong(r1, r3));
        r4 = j4.u6.m0(r11 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03a5, code lost:
        r6 = r6 + (r4 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03ac, code lost:
        r3 = j4.u6.m0(r11 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b9, code lost:
        r3 = j4.u6.m0(r11 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03c1, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03c2, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
        r9 = j4.u6.f8492x;
        r3 = ((j4.q6) r3).g();
        r9 = j4.u6.m0(r3) + r3;
        r3 = j4.u6.m0(r11 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f1, code lost:
        r4 = r11 << 3;
        r3 = j4.u6.k0(D(r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fb, code lost:
        r4 = j4.u6.m0(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010e, code lost:
        r3 = j4.u6.n0(J(r3, r1));
        r4 = j4.u6.m0(r11 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0208, code lost:
        r4 = j4.u6.m0(r11 << 3) + j4.u6.m0(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0213, code lost:
        r6 = (r4 + r3) + r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int C(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f8405o
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r3
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000c:
            int[] r9 = r0.f8406a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x03c9
            int r9 = r15.I(r5)
            int[] r10 = r0.f8406a
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
            if (r13 == r7) goto L_0x0032
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
        L_0x0032:
            int r10 = r14 << r10
            goto L_0x0036
        L_0x0035:
            r10 = 0
        L_0x0036:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x03b5;
                case 1: goto L_0x03a8;
                case 2: goto L_0x0393;
                case 3: goto L_0x038e;
                case 4: goto L_0x037b;
                case 5: goto L_0x0376;
                case 6: goto L_0x0371;
                case 7: goto L_0x0365;
                case 8: goto L_0x033a;
                case 9: goto L_0x0328;
                case 10: goto L_0x031f;
                case 11: goto L_0x030f;
                case 12: goto L_0x0309;
                case 13: goto L_0x0303;
                case 14: goto L_0x02fd;
                case 15: goto L_0x02e3;
                case 16: goto L_0x02cc;
                case 17: goto L_0x02b8;
                case 18: goto L_0x02ac;
                case 19: goto L_0x02a0;
                case 20: goto L_0x0294;
                case 21: goto L_0x0288;
                case 22: goto L_0x027c;
                case 23: goto L_0x02ac;
                case 24: goto L_0x02a0;
                case 25: goto L_0x0270;
                case 26: goto L_0x0264;
                case 27: goto L_0x0254;
                case 28: goto L_0x0248;
                case 29: goto L_0x023c;
                case 30: goto L_0x0230;
                case 31: goto L_0x02a0;
                case 32: goto L_0x02ac;
                case 33: goto L_0x0224;
                case 34: goto L_0x0218;
                case 35: goto L_0x01fc;
                case 36: goto L_0x01ef;
                case 37: goto L_0x01e2;
                case 38: goto L_0x01d5;
                case 39: goto L_0x01c8;
                case 40: goto L_0x01bb;
                case 41: goto L_0x01ae;
                case 42: goto L_0x019f;
                case 43: goto L_0x0191;
                case 44: goto L_0x0183;
                case 45: goto L_0x0175;
                case 46: goto L_0x0167;
                case 47: goto L_0x0159;
                case 48: goto L_0x014b;
                case 49: goto L_0x013b;
                case 50: goto L_0x012e;
                case 51: goto L_0x0126;
                case 52: goto L_0x011e;
                case 53: goto L_0x0108;
                case 54: goto L_0x0101;
                case 55: goto L_0x00eb;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00dd;
                case 58: goto L_0x00d5;
                case 59: goto L_0x00a9;
                case 60: goto L_0x00a1;
                case 61: goto L_0x0096;
                case 62: goto L_0x0085;
                case 63: goto L_0x007d;
                case 64: goto L_0x0075;
                case 65: goto L_0x006d;
                case 66: goto L_0x0061;
                case 67: goto L_0x0047;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x03c2
        L_0x003f:
            boolean r9 = r15.x(r11, r5, r1)
            if (r9 == 0) goto L_0x03c2
            goto L_0x02bc
        L_0x0047:
            boolean r10 = r15.x(r11, r5, r1)
            if (r10 == 0) goto L_0x03c2
            long r3 = J(r3, r1)
            int r10 = r11 << 3
            long r11 = r3 + r3
            long r3 = r3 >> r9
            int r9 = j4.u6.m0(r10)
            long r3 = r3 ^ r11
            int r3 = j4.u6.n0(r3)
            goto L_0x0359
        L_0x0061:
            boolean r9 = r15.x(r11, r5, r1)
            if (r9 == 0) goto L_0x03c2
            int r3 = D(r3, r1)
            goto L_0x02eb
        L_0x006d:
            boolean r3 = r15.x(r11, r5, r1)
            if (r3 == 0) goto L_0x03c2
            goto L_0x012c
        L_0x0075:
            boolean r3 = r15.x(r11, r5, r1)
            if (r3 == 0) goto L_0x03c2
            goto L_0x0124
        L_0x007d:
            boolean r9 = r15.x(r11, r5, r1)
            if (r9 == 0) goto L_0x03c2
            goto L_0x00f1
        L_0x0085:
            boolean r9 = r15.x(r11, r5, r1)
            if (r9 == 0) goto L_0x03c2
            int r3 = D(r3, r1)
            int r4 = r11 << 3
            int r3 = j4.u6.m0(r3)
            goto L_0x00fb
        L_0x0096:
            boolean r9 = r15.x(r11, r5, r1)
            if (r9 == 0) goto L_0x03c2
            java.lang.Object r3 = r2.getObject(r1, r3)
            goto L_0x00b7
        L_0x00a1:
            boolean r9 = r15.x(r11, r5, r1)
            if (r9 == 0) goto L_0x03c2
            goto L_0x032c
        L_0x00a9:
            boolean r9 = r15.x(r11, r5, r1)
            if (r9 == 0) goto L_0x03c2
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof j4.q6
            if (r4 == 0) goto L_0x00cc
        L_0x00b7:
            j4.q6 r3 = (j4.q6) r3
            int r4 = r11 << 3
            java.util.logging.Logger r9 = j4.u6.f8492x
            int r3 = r3.g()
            int r9 = j4.u6.m0(r3)
            int r9 = r9 + r3
            int r3 = j4.u6.m0(r4)
            goto L_0x0359
        L_0x00cc:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = j4.u6.l0(r3)
            goto L_0x00fb
        L_0x00d5:
            boolean r3 = r15.x(r11, r5, r1)
            if (r3 == 0) goto L_0x03c2
            goto L_0x0369
        L_0x00dd:
            boolean r3 = r15.x(r11, r5, r1)
            if (r3 == 0) goto L_0x03c2
            goto L_0x0124
        L_0x00e4:
            boolean r3 = r15.x(r11, r5, r1)
            if (r3 == 0) goto L_0x03c2
            goto L_0x012c
        L_0x00eb:
            boolean r9 = r15.x(r11, r5, r1)
            if (r9 == 0) goto L_0x03c2
        L_0x00f1:
            int r3 = D(r3, r1)
            int r4 = r11 << 3
            int r3 = j4.u6.k0(r3)
        L_0x00fb:
            int r4 = j4.u6.m0(r4)
            goto L_0x0213
        L_0x0101:
            boolean r9 = r15.x(r11, r5, r1)
            if (r9 == 0) goto L_0x03c2
            goto L_0x010e
        L_0x0108:
            boolean r9 = r15.x(r11, r5, r1)
            if (r9 == 0) goto L_0x03c2
        L_0x010e:
            long r3 = J(r3, r1)
            int r9 = r11 << 3
            int r3 = j4.u6.n0(r3)
            int r4 = j4.u6.m0(r9)
            goto L_0x0213
        L_0x011e:
            boolean r3 = r15.x(r11, r5, r1)
            if (r3 == 0) goto L_0x03c2
        L_0x0124:
            goto L_0x03ac
        L_0x0126:
            boolean r3 = r15.x(r11, r5, r1)
            if (r3 == 0) goto L_0x03c2
        L_0x012c:
            goto L_0x03b9
        L_0x012e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r15.j(r5)
            j4.j8.a(r3, r4)
            goto L_0x03c2
        L_0x013b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            j4.y8 r4 = r15.i(r5)
            int r3 = j4.z8.C(r11, r3, r4)
            goto L_0x03c1
        L_0x014b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.M(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x0159:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.K(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x0167:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.B(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x0175:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.z(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x0183:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.x(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x0191:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.P(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x019f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            java.lang.Class r4 = j4.z8.f8581a
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x01ae:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.z(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x01bb:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.B(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x01c8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.E(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x01d5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.R(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x01e2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.G(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x01ef:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.z(r3)
            if (r3 <= 0) goto L_0x03c2
            goto L_0x0208
        L_0x01fc:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.B(r3)
            if (r3 <= 0) goto L_0x03c2
        L_0x0208:
            int r4 = r11 << 3
            int r9 = j4.u6.m0(r3)
            int r4 = j4.u6.m0(r4)
            int r4 = r4 + r9
        L_0x0213:
            int r4 = r4 + r3
            int r4 = r4 + r6
            r6 = r4
            goto L_0x03c2
        L_0x0218:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.L(r11, r3)
            goto L_0x03c1
        L_0x0224:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.J(r11, r3)
            goto L_0x03c1
        L_0x0230:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.w(r11, r3)
            goto L_0x03c1
        L_0x023c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.O(r11, r3)
            goto L_0x03c1
        L_0x0248:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.v(r3, r11)
            goto L_0x03c1
        L_0x0254:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            j4.y8 r4 = r15.i(r5)
            int r3 = j4.z8.I(r11, r3, r4)
            goto L_0x03c1
        L_0x0264:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.N(r3, r11)
            goto L_0x03c1
        L_0x0270:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.u(r11, r3)
            goto L_0x03c1
        L_0x027c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.D(r11, r3)
            goto L_0x03c1
        L_0x0288:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.Q(r11, r3)
            goto L_0x03c1
        L_0x0294:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.F(r11, r3)
            goto L_0x03c1
        L_0x02a0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.y(r11, r3)
            goto L_0x03c1
        L_0x02ac:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.A(r11, r3)
            goto L_0x03c1
        L_0x02b8:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03c2
        L_0x02bc:
            java.lang.Object r3 = r2.getObject(r1, r3)
            j4.n8 r3 = (j4.n8) r3
            j4.y8 r4 = r15.i(r5)
            int r3 = j4.u6.j0(r11, r3, r4)
            goto L_0x03c1
        L_0x02cc:
            r10 = r10 & r8
            if (r10 == 0) goto L_0x03c2
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            long r11 = r3 + r3
            long r3 = r3 >> r9
            int r9 = j4.u6.m0(r10)
            long r3 = r3 ^ r11
            int r3 = j4.u6.n0(r3)
            goto L_0x0359
        L_0x02e3:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03c2
            int r3 = r2.getInt(r1, r3)
        L_0x02eb:
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = j4.u6.m0(r4)
            r3 = r3 ^ r9
            int r3 = j4.u6.m0(r3)
            int r3 = r3 + r4
            goto L_0x03c1
        L_0x02fd:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03c2
            goto L_0x03b9
        L_0x0303:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03c2
            goto L_0x03ac
        L_0x0309:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03c2
            goto L_0x037f
        L_0x030f:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03c2
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = j4.u6.m0(r3)
            goto L_0x0389
        L_0x031f:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03c2
            java.lang.Object r3 = r2.getObject(r1, r3)
            goto L_0x0346
        L_0x0328:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03c2
        L_0x032c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            j4.y8 r4 = r15.i(r5)
            int r3 = j4.z8.H(r11, r4, r3)
            goto L_0x03c1
        L_0x033a:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03c2
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof j4.q6
            if (r4 == 0) goto L_0x035c
        L_0x0346:
            j4.q6 r3 = (j4.q6) r3
            int r4 = r11 << 3
            java.util.logging.Logger r9 = j4.u6.f8492x
            int r3 = r3.g()
            int r9 = j4.u6.m0(r3)
            int r9 = r9 + r3
            int r3 = j4.u6.m0(r4)
        L_0x0359:
            int r3 = r3 + r9
            goto L_0x03c1
        L_0x035c:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = j4.u6.l0(r3)
            goto L_0x0389
        L_0x0365:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03c2
        L_0x0369:
            int r3 = r11 << 3
            int r3 = j4.u6.m0(r3)
            int r3 = r3 + r14
            goto L_0x03c1
        L_0x0371:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03c2
            goto L_0x03ac
        L_0x0376:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03c2
            goto L_0x03b9
        L_0x037b:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03c2
        L_0x037f:
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = j4.u6.k0(r3)
        L_0x0389:
            int r4 = j4.u6.m0(r4)
            goto L_0x03a5
        L_0x038e:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03c2
            goto L_0x0397
        L_0x0393:
            r9 = r8 & r10
            if (r9 == 0) goto L_0x03c2
        L_0x0397:
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = j4.u6.n0(r3)
            int r4 = j4.u6.m0(r9)
        L_0x03a5:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x03c2
        L_0x03a8:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03c2
        L_0x03ac:
            int r3 = r11 << 3
            int r3 = j4.u6.m0(r3)
            int r3 = r3 + 4
            goto L_0x03c1
        L_0x03b5:
            r3 = r8 & r10
            if (r3 == 0) goto L_0x03c2
        L_0x03b9:
            int r3 = r11 << 3
            int r3 = j4.u6.m0(r3)
            int r3 = r3 + 8
        L_0x03c1:
            int r6 = r6 + r3
        L_0x03c2:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x03c9:
            j4.j9 r2 = r0.f8416l
            j4.k9 r3 = r2.d(r1)
            int r2 = r2.a(r3)
            int r2 = r2 + r6
            boolean r3 = r0.f8411f
            if (r3 != 0) goto L_0x03d9
            return r2
        L_0x03d9:
            j4.z6 r2 = r0.f8417m
            r2.a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q8.C(java.lang.Object):int");
    }

    public final void E(Object obj, int i10, long j10) {
        Unsafe unsafe = f8405o;
        Object j11 = j(i10);
        Object object = unsafe.getObject(obj, j10);
        if (!((i8) object).e()) {
            i8 c10 = i8.b().c();
            j8.b(c10, object);
            unsafe.putObject(obj, j10, c10);
        }
        h8 h8Var = (h8) j11;
        throw null;
    }

    public final int F(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, i6 i6Var) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        long j11 = j10;
        int i22 = i17;
        i6 i6Var2 = i6Var;
        Unsafe unsafe = f8405o;
        long j12 = (long) (this.f8406a[i22 + 2] & 1048575);
        switch (i16) {
            case 51:
                if (i21 == 1) {
                    unsafe.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(j6.o(i18, bArr2))));
                    int i23 = i18 + 8;
                    unsafe.putInt(obj2, j12, i20);
                    return i23;
                }
                break;
            case 52:
                if (i21 == 5) {
                    unsafe.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(j6.b(i18, bArr2))));
                    int i24 = i18 + 4;
                    unsafe.putInt(obj2, j12, i20);
                    return i24;
                }
                break;
            case 53:
            case 54:
                if (i21 == 0) {
                    int l6 = j6.l(bArr2, i18, i6Var2);
                    unsafe.putObject(obj2, j11, Long.valueOf(i6Var2.f8234b));
                    unsafe.putInt(obj2, j12, i20);
                    return l6;
                }
                break;
            case 55:
            case 62:
                if (i21 == 0) {
                    int i25 = j6.i(bArr2, i18, i6Var2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(i6Var2.f8233a));
                    unsafe.putInt(obj2, j12, i20);
                    return i25;
                }
                break;
            case 56:
            case 65:
                if (i21 == 1) {
                    unsafe.putObject(obj2, j11, Long.valueOf(j6.o(i18, bArr2)));
                    int i26 = i18 + 8;
                    unsafe.putInt(obj2, j12, i20);
                    return i26;
                }
                break;
            case 57:
            case 64:
                if (i21 == 5) {
                    unsafe.putObject(obj2, j11, Integer.valueOf(j6.b(i18, bArr2)));
                    int i27 = i18 + 4;
                    unsafe.putInt(obj2, j12, i20);
                    return i27;
                }
                break;
            case 58:
                if (i21 == 0) {
                    int l10 = j6.l(bArr2, i18, i6Var2);
                    unsafe.putObject(obj2, j11, Boolean.valueOf(i6Var2.f8234b != 0));
                    unsafe.putInt(obj2, j12, i20);
                    return l10;
                }
                break;
            case 59:
                if (i21 == 2) {
                    int i28 = j6.i(bArr2, i18, i6Var2);
                    int i29 = i6Var2.f8233a;
                    if (i29 == 0) {
                        unsafe.putObject(obj2, j11, "");
                    } else if ((i15 & 536870912) == 0 || x9.c(bArr2, i28, i28 + i29)) {
                        unsafe.putObject(obj2, j11, new String(bArr2, i28, i29, s7.f8462a));
                        i28 += i29;
                    } else {
                        throw u7.a();
                    }
                    unsafe.putInt(obj2, j12, i20);
                    return i28;
                }
                break;
            case 60:
                if (i21 == 2) {
                    Object l11 = l(i20, i22, obj2);
                    int n2 = j6.n(l11, i(i22), bArr, i10, i11, i6Var);
                    t(obj2, i20, i22, l11);
                    return n2;
                }
                break;
            case 61:
                if (i21 == 2) {
                    int a10 = j6.a(bArr2, i18, i6Var2);
                    unsafe.putObject(obj2, j11, i6Var2.f8235c);
                    unsafe.putInt(obj2, j12, i20);
                    return a10;
                }
                break;
            case 63:
                if (i21 == 0) {
                    int i30 = j6.i(bArr2, i18, i6Var2);
                    int i31 = i6Var2.f8233a;
                    int i32 = i22 / 3;
                    o7 o7Var = (o7) this.f8407b[i32 + i32 + 1];
                    if (o7Var == null || o7Var.zza(i31)) {
                        unsafe.putObject(obj2, j11, Integer.valueOf(i31));
                        unsafe.putInt(obj2, j12, i20);
                    } else {
                        A(obj).c(i19, Long.valueOf((long) i31));
                    }
                    return i30;
                }
                break;
            case 66:
                if (i21 == 0) {
                    int i33 = j6.i(bArr2, i18, i6Var2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(r6.a(i6Var2.f8233a)));
                    unsafe.putInt(obj2, j12, i20);
                    return i33;
                }
                break;
            case 67:
                if (i21 == 0) {
                    int l12 = j6.l(bArr2, i18, i6Var2);
                    unsafe.putObject(obj2, j11, Long.valueOf(r6.b(i6Var2.f8234b)));
                    unsafe.putInt(obj2, j12, i20);
                    return l12;
                }
                break;
            case 68:
                if (i21 == 3) {
                    Object l13 = l(i20, i22, obj2);
                    int m2 = j6.m(l13, i(i22), bArr, i10, i11, (i19 & -8) | 4, i6Var);
                    t(obj2, i20, i22, l13);
                    return m2;
                }
                break;
        }
        return i18;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02a8, code lost:
        if (r7.f8234b != 0) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02ab, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02ad, code lost:
        r13.d(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02b0, code lost:
        if (r1 >= r5) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02b2, code lost:
        r4 = j4.j6.i(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02b8, code lost:
        if (r2 == r7.f8233a) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02bb, code lost:
        r1 = j4.j6.l(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02c3, code lost:
        if (r7.f8234b == 0) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02c5, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02c7, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0171, code lost:
        if (r4 == 0) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        r13.add(j4.q6.n(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (r1 >= r5) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017e, code lost:
        r4 = j4.j6.i(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0184, code lost:
        if (r2 == r7.f8233a) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0187, code lost:
        r1 = j4.j6.i(r3, r4, r7);
        r4 = r7.f8233a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (r4 < 0) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0191, code lost:
        if (r4 > (r3.length - r1)) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0193, code lost:
        if (r4 != 0) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0195, code lost:
        r13.add(j4.q6.f8402b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019f, code lost:
        throw j4.u7.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a4, code lost:
        throw j4.u7.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a5, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int G(java.lang.Object r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, long r29, j4.i6 r31) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r2 = r22
            r8 = r23
            r6 = r24
            r9 = r25
            r10 = r29
            r7 = r31
            sun.misc.Unsafe r12 = f8405o
            java.lang.Object r13 = r12.getObject(r1, r10)
            j4.r7 r13 = (j4.r7) r13
            boolean r14 = r13.zzc()
            if (r14 != 0) goto L_0x0035
            int r14 = r13.size()
            if (r14 != 0) goto L_0x002d
            r14 = 10
            goto L_0x002e
        L_0x002d:
            int r14 = r14 + r14
        L_0x002e:
            j4.r7 r13 = r13.c(r14)
            r12.putObject(r1, r10, r13)
        L_0x0035:
            r11 = 2
            r12 = 3
            r14 = 0
            r16 = 0
            r10 = 1
            switch(r28) {
                case 18: goto L_0x03d4;
                case 19: goto L_0x0390;
                case 20: goto L_0x0358;
                case 21: goto L_0x0358;
                case 22: goto L_0x033f;
                case 23: goto L_0x0304;
                case 24: goto L_0x02c8;
                case 25: goto L_0x0274;
                case 26: goto L_0x01c9;
                case 27: goto L_0x01b0;
                case 28: goto L_0x0163;
                case 29: goto L_0x033f;
                case 30: goto L_0x00db;
                case 31: goto L_0x02c8;
                case 32: goto L_0x0304;
                case 33: goto L_0x009b;
                case 34: goto L_0x005b;
                case 35: goto L_0x03d4;
                case 36: goto L_0x0390;
                case 37: goto L_0x0358;
                case 38: goto L_0x0358;
                case 39: goto L_0x033f;
                case 40: goto L_0x0304;
                case 41: goto L_0x02c8;
                case 42: goto L_0x0274;
                case 43: goto L_0x033f;
                case 44: goto L_0x00db;
                case 45: goto L_0x02c8;
                case 46: goto L_0x0304;
                case 47: goto L_0x009b;
                case 48: goto L_0x005b;
                default: goto L_0x003f;
            }
        L_0x003f:
            if (r6 != r12) goto L_0x0438
            j4.y8 r1 = r0.i(r9)
            r6 = r2 & -8
            r6 = r6 | 4
            r23 = r1
            r24 = r19
            r25 = r20
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = j4.j6.c(r23, r24, r25, r26, r27, r28)
            goto L_0x0416
        L_0x005b:
            if (r6 != r11) goto L_0x007f
            j4.c8 r13 = (j4.c8) r13
            int r1 = j4.j6.i(r3, r4, r7)
            int r2 = r7.f8233a
            int r2 = r2 + r1
        L_0x0066:
            if (r1 >= r2) goto L_0x0076
            int r1 = j4.j6.l(r3, r1, r7)
            long r4 = r7.f8234b
            long r4 = j4.r6.b(r4)
            r13.d(r4)
            goto L_0x0066
        L_0x0076:
            if (r1 != r2) goto L_0x007a
            goto L_0x0439
        L_0x007a:
            j4.u7 r1 = j4.u7.d()
            throw r1
        L_0x007f:
            if (r6 != 0) goto L_0x0438
            j4.c8 r13 = (j4.c8) r13
        L_0x0083:
            int r1 = j4.j6.l(r3, r4, r7)
            long r8 = r7.f8234b
            long r8 = j4.r6.b(r8)
            r13.d(r8)
            if (r1 >= r5) goto L_0x009a
            int r4 = j4.j6.i(r3, r1, r7)
            int r6 = r7.f8233a
            if (r2 == r6) goto L_0x0083
        L_0x009a:
            return r1
        L_0x009b:
            if (r6 != r11) goto L_0x00bf
            j4.n7 r13 = (j4.n7) r13
            int r1 = j4.j6.i(r3, r4, r7)
            int r2 = r7.f8233a
            int r2 = r2 + r1
        L_0x00a6:
            if (r1 >= r2) goto L_0x00b6
            int r1 = j4.j6.i(r3, r1, r7)
            int r4 = r7.f8233a
            int r4 = j4.r6.a(r4)
            r13.d(r4)
            goto L_0x00a6
        L_0x00b6:
            if (r1 != r2) goto L_0x00ba
            goto L_0x0439
        L_0x00ba:
            j4.u7 r1 = j4.u7.d()
            throw r1
        L_0x00bf:
            if (r6 != 0) goto L_0x0438
            j4.n7 r13 = (j4.n7) r13
        L_0x00c3:
            int r1 = j4.j6.i(r3, r4, r7)
            int r4 = r7.f8233a
            int r4 = j4.r6.a(r4)
            r13.d(r4)
            if (r1 >= r5) goto L_0x00da
            int r4 = j4.j6.i(r3, r1, r7)
            int r6 = r7.f8233a
            if (r2 == r6) goto L_0x00c3
        L_0x00da:
            return r1
        L_0x00db:
            if (r6 != r11) goto L_0x00e2
            int r2 = j4.j6.e(r3, r4, r13, r7)
            goto L_0x00f3
        L_0x00e2:
            if (r6 != 0) goto L_0x0438
            r2 = r22
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r13
            r7 = r31
            int r2 = j4.j6.k(r2, r3, r4, r5, r6, r7)
        L_0x00f3:
            int r3 = r9 / 3
            int r3 = r3 + r3
            java.lang.Object[] r4 = r0.f8407b
            int r3 = r3 + r10
            r3 = r4[r3]
            j4.o7 r3 = (j4.o7) r3
            j4.j9 r4 = r0.f8416l
            java.lang.Class r5 = j4.z8.f8581a
            if (r3 == 0) goto L_0x0160
            boolean r5 = r13 instanceof java.util.RandomAccess
            r6 = 0
            if (r5 == 0) goto L_0x013e
            int r5 = r13.size()
            r7 = r16
            r9 = r7
        L_0x010f:
            if (r7 >= r5) goto L_0x0134
            java.lang.Object r10 = r13.get(r7)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            boolean r11 = r3.zza(r10)
            if (r11 == 0) goto L_0x012d
            if (r7 == r9) goto L_0x012a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.set(r9, r10)
        L_0x012a:
            int r9 = r9 + 1
            goto L_0x0131
        L_0x012d:
            java.lang.Object r6 = j4.z8.a(r1, r8, r10, r6, r4)
        L_0x0131:
            int r7 = r7 + 1
            goto L_0x010f
        L_0x0134:
            if (r9 == r5) goto L_0x0160
            java.util.List r1 = r13.subList(r9, r5)
            r1.clear()
            return r2
        L_0x013e:
            java.util.Iterator r5 = r13.iterator()
        L_0x0142:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0160
            java.lang.Object r7 = r5.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r9 = r3.zza(r7)
            if (r9 != 0) goto L_0x0142
            java.lang.Object r6 = j4.z8.a(r1, r8, r7, r6, r4)
            r5.remove()
            goto L_0x0142
        L_0x0160:
            r1 = r2
            goto L_0x0439
        L_0x0163:
            if (r6 != r11) goto L_0x0438
            int r1 = j4.j6.i(r3, r4, r7)
            int r4 = r7.f8233a
            if (r4 < 0) goto L_0x01ab
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01a6
            if (r4 != 0) goto L_0x0174
            goto L_0x0195
        L_0x0174:
            j4.o6 r6 = j4.q6.n(r3, r1, r4)
            r13.add(r6)
            int r1 = r1 + r4
        L_0x017c:
            if (r1 >= r5) goto L_0x01a5
            int r4 = j4.j6.i(r3, r1, r7)
            int r6 = r7.f8233a
            if (r2 == r6) goto L_0x0187
            goto L_0x01a5
        L_0x0187:
            int r1 = j4.j6.i(r3, r4, r7)
            int r4 = r7.f8233a
            if (r4 < 0) goto L_0x01a0
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019b
            if (r4 != 0) goto L_0x0174
        L_0x0195:
            j4.o6 r4 = j4.q6.f8402b
            r13.add(r4)
            goto L_0x017c
        L_0x019b:
            j4.u7 r1 = j4.u7.d()
            throw r1
        L_0x01a0:
            j4.u7 r1 = j4.u7.b()
            throw r1
        L_0x01a5:
            return r1
        L_0x01a6:
            j4.u7 r1 = j4.u7.d()
            throw r1
        L_0x01ab:
            j4.u7 r1 = j4.u7.b()
            throw r1
        L_0x01b0:
            if (r6 != r11) goto L_0x0438
            j4.y8 r1 = r0.i(r9)
            r23 = r1
            r24 = r22
            r25 = r19
            r26 = r20
            r27 = r21
            r28 = r13
            r29 = r31
            int r1 = j4.j6.d(r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x01c9:
            if (r6 != r11) goto L_0x0438
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r26 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0216
            int r1 = j4.j6.i(r3, r4, r7)
            int r4 = r7.f8233a
            if (r4 < 0) goto L_0x0211
            if (r4 != 0) goto L_0x01e1
            goto L_0x0200
        L_0x01e1:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = j4.s7.f8462a
            r8.<init>(r3, r1, r4, r9)
        L_0x01e8:
            r13.add(r8)
            int r1 = r1 + r4
        L_0x01ec:
            if (r1 >= r5) goto L_0x0439
            int r4 = j4.j6.i(r3, r1, r7)
            int r8 = r7.f8233a
            if (r2 != r8) goto L_0x0439
            int r1 = j4.j6.i(r3, r4, r7)
            int r4 = r7.f8233a
            if (r4 < 0) goto L_0x020c
            if (r4 != 0) goto L_0x0204
        L_0x0200:
            r13.add(r6)
            goto L_0x01ec
        L_0x0204:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = j4.s7.f8462a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x01e8
        L_0x020c:
            j4.u7 r1 = j4.u7.b()
            throw r1
        L_0x0211:
            j4.u7 r1 = j4.u7.b()
            throw r1
        L_0x0216:
            int r1 = j4.j6.i(r3, r4, r7)
            int r4 = r7.f8233a
            if (r4 < 0) goto L_0x026f
            if (r4 != 0) goto L_0x0222
        L_0x0220:
            r8 = r1
            goto L_0x0249
        L_0x0222:
            int r8 = r1 + r4
            boolean r9 = j4.x9.c(r3, r1, r8)
            if (r9 == 0) goto L_0x026a
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = j4.s7.f8462a
            r9.<init>(r3, r1, r4, r10)
        L_0x0231:
            r13.add(r9)
        L_0x0234:
            if (r8 >= r5) goto L_0x0267
            int r1 = j4.j6.i(r3, r8, r7)
            int r4 = r7.f8233a
            if (r2 != r4) goto L_0x0267
            int r1 = j4.j6.i(r3, r1, r7)
            int r4 = r7.f8233a
            if (r4 < 0) goto L_0x0262
            if (r4 != 0) goto L_0x024d
            goto L_0x0220
        L_0x0249:
            r13.add(r6)
            goto L_0x0234
        L_0x024d:
            int r8 = r1 + r4
            boolean r9 = j4.x9.c(r3, r1, r8)
            if (r9 == 0) goto L_0x025d
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = j4.s7.f8462a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x0231
        L_0x025d:
            j4.u7 r1 = j4.u7.a()
            throw r1
        L_0x0262:
            j4.u7 r1 = j4.u7.b()
            throw r1
        L_0x0267:
            r1 = r8
            goto L_0x0439
        L_0x026a:
            j4.u7 r1 = j4.u7.a()
            throw r1
        L_0x026f:
            j4.u7 r1 = j4.u7.b()
            throw r1
        L_0x0274:
            if (r6 != r11) goto L_0x029c
            j4.k6 r13 = (j4.k6) r13
            int r1 = j4.j6.i(r3, r4, r7)
            int r2 = r7.f8233a
            int r2 = r2 + r1
        L_0x027f:
            if (r1 >= r2) goto L_0x0293
            int r1 = j4.j6.l(r3, r1, r7)
            long r4 = r7.f8234b
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x028d
            r4 = r10
            goto L_0x028f
        L_0x028d:
            r4 = r16
        L_0x028f:
            r13.d(r4)
            goto L_0x027f
        L_0x0293:
            if (r1 != r2) goto L_0x0297
            goto L_0x0439
        L_0x0297:
            j4.u7 r1 = j4.u7.d()
            throw r1
        L_0x029c:
            if (r6 != 0) goto L_0x0438
            j4.k6 r13 = (j4.k6) r13
            int r1 = j4.j6.l(r3, r4, r7)
            long r8 = r7.f8234b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x02ab
            goto L_0x02c5
        L_0x02ab:
            r4 = r16
        L_0x02ad:
            r13.d(r4)
            if (r1 >= r5) goto L_0x02c7
            int r4 = j4.j6.i(r3, r1, r7)
            int r6 = r7.f8233a
            if (r2 == r6) goto L_0x02bb
            goto L_0x02c7
        L_0x02bb:
            int r1 = j4.j6.l(r3, r4, r7)
            long r8 = r7.f8234b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x02ab
        L_0x02c5:
            r4 = r10
            goto L_0x02ad
        L_0x02c7:
            return r1
        L_0x02c8:
            if (r6 != r11) goto L_0x02e8
            j4.n7 r13 = (j4.n7) r13
            int r1 = j4.j6.i(r3, r4, r7)
            int r2 = r7.f8233a
            int r2 = r2 + r1
        L_0x02d3:
            if (r1 >= r2) goto L_0x02df
            int r4 = j4.j6.b(r1, r3)
            r13.d(r4)
            int r1 = r1 + 4
            goto L_0x02d3
        L_0x02df:
            if (r1 != r2) goto L_0x02e3
            goto L_0x0439
        L_0x02e3:
            j4.u7 r1 = j4.u7.d()
            throw r1
        L_0x02e8:
            r1 = 5
            if (r6 != r1) goto L_0x0438
            j4.n7 r13 = (j4.n7) r13
        L_0x02ed:
            int r1 = j4.j6.b(r4, r3)
            r13.d(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x0303
            int r1 = j4.j6.i(r3, r4, r7)
            int r6 = r7.f8233a
            if (r2 == r6) goto L_0x0301
            goto L_0x0303
        L_0x0301:
            r4 = r1
            goto L_0x02ed
        L_0x0303:
            return r4
        L_0x0304:
            if (r6 != r11) goto L_0x0324
            j4.c8 r13 = (j4.c8) r13
            int r1 = j4.j6.i(r3, r4, r7)
            int r2 = r7.f8233a
            int r2 = r2 + r1
        L_0x030f:
            if (r1 >= r2) goto L_0x031b
            long r4 = j4.j6.o(r1, r3)
            r13.d(r4)
            int r1 = r1 + 8
            goto L_0x030f
        L_0x031b:
            if (r1 != r2) goto L_0x031f
            goto L_0x0439
        L_0x031f:
            j4.u7 r1 = j4.u7.d()
            throw r1
        L_0x0324:
            if (r6 != r10) goto L_0x0438
            j4.c8 r13 = (j4.c8) r13
        L_0x0328:
            long r8 = j4.j6.o(r4, r3)
            r13.d(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x033e
            int r1 = j4.j6.i(r3, r4, r7)
            int r6 = r7.f8233a
            if (r2 == r6) goto L_0x033c
            goto L_0x033e
        L_0x033c:
            r4 = r1
            goto L_0x0328
        L_0x033e:
            return r4
        L_0x033f:
            if (r6 != r11) goto L_0x0347
            int r1 = j4.j6.e(r3, r4, r13, r7)
            goto L_0x0439
        L_0x0347:
            if (r6 != 0) goto L_0x0438
            r23 = r19
            r24 = r20
            r25 = r21
            r26 = r13
            r27 = r31
            int r1 = j4.j6.k(r22, r23, r24, r25, r26, r27)
            return r1
        L_0x0358:
            if (r6 != r11) goto L_0x0378
            j4.c8 r13 = (j4.c8) r13
            int r1 = j4.j6.i(r3, r4, r7)
            int r2 = r7.f8233a
            int r2 = r2 + r1
        L_0x0363:
            if (r1 >= r2) goto L_0x036f
            int r1 = j4.j6.l(r3, r1, r7)
            long r4 = r7.f8234b
            r13.d(r4)
            goto L_0x0363
        L_0x036f:
            if (r1 != r2) goto L_0x0373
            goto L_0x0439
        L_0x0373:
            j4.u7 r1 = j4.u7.d()
            throw r1
        L_0x0378:
            if (r6 != 0) goto L_0x0438
            j4.c8 r13 = (j4.c8) r13
        L_0x037c:
            int r1 = j4.j6.l(r3, r4, r7)
            long r8 = r7.f8234b
            r13.d(r8)
            if (r1 >= r5) goto L_0x038f
            int r4 = j4.j6.i(r3, r1, r7)
            int r6 = r7.f8233a
            if (r2 == r6) goto L_0x037c
        L_0x038f:
            return r1
        L_0x0390:
            if (r6 != r11) goto L_0x03b4
            j4.f7 r13 = (j4.f7) r13
            int r1 = j4.j6.i(r3, r4, r7)
            int r2 = r7.f8233a
            int r2 = r2 + r1
        L_0x039b:
            if (r1 >= r2) goto L_0x03ab
            int r4 = j4.j6.b(r1, r3)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.d(r4)
            int r1 = r1 + 4
            goto L_0x039b
        L_0x03ab:
            if (r1 != r2) goto L_0x03af
            goto L_0x0439
        L_0x03af:
            j4.u7 r1 = j4.u7.d()
            throw r1
        L_0x03b4:
            r1 = 5
            if (r6 != r1) goto L_0x0438
            j4.f7 r13 = (j4.f7) r13
        L_0x03b9:
            int r1 = j4.j6.b(r4, r3)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.d(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x03d3
            int r1 = j4.j6.i(r3, r4, r7)
            int r6 = r7.f8233a
            if (r2 == r6) goto L_0x03d1
            goto L_0x03d3
        L_0x03d1:
            r4 = r1
            goto L_0x03b9
        L_0x03d3:
            return r4
        L_0x03d4:
            if (r6 != r11) goto L_0x03f7
            j4.w6 r13 = (j4.w6) r13
            int r1 = j4.j6.i(r3, r4, r7)
            int r2 = r7.f8233a
            int r2 = r2 + r1
        L_0x03df:
            if (r1 >= r2) goto L_0x03ef
            long r4 = j4.j6.o(r1, r3)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r13.d(r4)
            int r1 = r1 + 8
            goto L_0x03df
        L_0x03ef:
            if (r1 != r2) goto L_0x03f2
            goto L_0x0439
        L_0x03f2:
            j4.u7 r1 = j4.u7.d()
            throw r1
        L_0x03f7:
            if (r6 != r10) goto L_0x0438
            j4.w6 r13 = (j4.w6) r13
        L_0x03fb:
            long r8 = j4.j6.o(r4, r3)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.d(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x0415
            int r1 = j4.j6.i(r3, r4, r7)
            int r6 = r7.f8233a
            if (r2 == r6) goto L_0x0413
            goto L_0x0415
        L_0x0413:
            r4 = r1
            goto L_0x03fb
        L_0x0415:
            return r4
        L_0x0416:
            java.lang.Object r8 = r7.f8235c
            r13.add(r8)
            if (r4 >= r5) goto L_0x0437
            int r8 = j4.j6.i(r3, r4, r7)
            int r9 = r7.f8233a
            if (r2 == r9) goto L_0x0426
            goto L_0x0437
        L_0x0426:
            r23 = r1
            r24 = r19
            r25 = r8
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = j4.j6.c(r23, r24, r25, r26, r27, r28)
            goto L_0x0416
        L_0x0437:
            return r4
        L_0x0438:
            r1 = r4
        L_0x0439:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q8.G(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, j4.i6):int");
    }

    public final int H(int i10, int i11) {
        int length = (this.f8406a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f8406a[i13];
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

    public final int I(int i10) {
        return this.f8406a[i10 + 1];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = w(r8)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r8 instanceof j4.m7
            r1 = 0
            if (r0 == 0) goto L_0x0017
            r0 = r8
            j4.m7 r0 = (j4.m7) r0
            r0.q()
            r0.zzb = r1
            r0.o()
        L_0x0017:
            int[] r0 = r7.f8406a
            int r0 = r0.length
        L_0x001a:
            if (r1 >= r0) goto L_0x0072
            int r2 = r7.I(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = r2 >>> 20
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L_0x005c
            r5 = 60
            if (r2 == r5) goto L_0x0051
            r5 = 68
            if (r2 == r5) goto L_0x0051
            switch(r2) {
                case 17: goto L_0x005c;
                case 18: goto L_0x004b;
                case 19: goto L_0x004b;
                case 20: goto L_0x004b;
                case 21: goto L_0x004b;
                case 22: goto L_0x004b;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x004b;
                case 26: goto L_0x004b;
                case 27: goto L_0x004b;
                case 28: goto L_0x004b;
                case 29: goto L_0x004b;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x004b;
                case 34: goto L_0x004b;
                case 35: goto L_0x004b;
                case 36: goto L_0x004b;
                case 37: goto L_0x004b;
                case 38: goto L_0x004b;
                case 39: goto L_0x004b;
                case 40: goto L_0x004b;
                case 41: goto L_0x004b;
                case 42: goto L_0x004b;
                case 43: goto L_0x004b;
                case 44: goto L_0x004b;
                case 45: goto L_0x004b;
                case 46: goto L_0x004b;
                case 47: goto L_0x004b;
                case 48: goto L_0x004b;
                case 49: goto L_0x004b;
                case 50: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x006f
        L_0x0039:
            sun.misc.Unsafe r2 = f8405o
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L_0x006f
            r6 = r5
            j4.i8 r6 = (j4.i8) r6
            r6.d()
            r2.putObject(r8, r3, r5)
            goto L_0x006f
        L_0x004b:
            j4.b8 r2 = r7.k
            r2.a(r3, r8)
            goto L_0x006f
        L_0x0051:
            int[] r2 = r7.f8406a
            r2 = r2[r1]
            boolean r2 = r7.x(r2, r1, r8)
            if (r2 == 0) goto L_0x006f
            goto L_0x0062
        L_0x005c:
            boolean r2 = r7.v(r1, r8)
            if (r2 == 0) goto L_0x006f
        L_0x0062:
            j4.y8 r2 = r7.i(r1)
            sun.misc.Unsafe r5 = f8405o
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.a(r3)
        L_0x006f:
            int r1 = r1 + 3
            goto L_0x001a
        L_0x0072:
            j4.j9 r0 = r7.f8416l
            r0.g(r8)
            boolean r0 = r7.f8411f
            if (r0 == 0) goto L_0x0080
            j4.z6 r0 = r7.f8417m
            r0.b(r8)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q8.a(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0272, code lost:
        r3 = j4.u6.j0(r5, (j4.n8) j4.t9.j(r6, r11), i(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x028c, code lost:
        r3 = j4.u6.m0(r5 << 3);
        r4 = j4.u6.n0((r6 + r6) ^ (r6 >> 63));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02a8, code lost:
        r3 = j4.u6.m0((r3 >> 31) ^ (r3 + r3)) + j4.u6.m0(r5 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02dc, code lost:
        r4 = r5 << 3;
        r3 = j4.u6.m0(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02ea, code lost:
        r3 = j4.t9.j(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02f5, code lost:
        r3 = j4.z8.H(r5, i(r1), j4.t9.j(r6, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x030f, code lost:
        if ((r3 instanceof j4.q6) != false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0311, code lost:
        r4 = r5 << 3;
        r5 = j4.u6.f8492x;
        r3 = ((j4.q6) r3).g();
        r3 = j4.u6.m0(r4) + (j4.u6.m0(r3) + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0327, code lost:
        r4 = r5 << 3;
        r3 = j4.u6.l0((java.lang.String) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0336, code lost:
        r3 = j4.u6.m0(r5 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0353, code lost:
        r3 = j4.t9.g(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0357, code lost:
        r4 = r5 << 3;
        r3 = j4.u6.k0(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x035d, code lost:
        r4 = j4.u6.m0(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x036f, code lost:
        r3 = j4.t9.h(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0373, code lost:
        r3 = j4.u6.n0(r3);
        r4 = j4.u6.m0(r5 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x037d, code lost:
        r2 = (r4 + r3) + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0387, code lost:
        r3 = j4.u6.m0(r5 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0396, code lost:
        r3 = j4.u6.m0(r5 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x039e, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x039f, code lost:
        r1 = r1 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        if ((r3 instanceof j4.q6) != false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bc, code lost:
        r3 = D(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cf, code lost:
        r3 = J(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bf, code lost:
        r4 = j4.u6.m0(r5 << 3) + j4.u6.m0(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(java.lang.Object r11) {
        /*
            r10 = this;
            boolean r0 = r10.f8412g
            if (r0 == 0) goto L_0x03af
            sun.misc.Unsafe r0 = f8405o
            r1 = 0
            r2 = r1
        L_0x0008:
            int[] r3 = r10.f8406a
            int r3 = r3.length
            if (r1 >= r3) goto L_0x03a3
            int r3 = r10.I(r1)
            int r4 = r3 >>> 20
            r4 = r4 & 255(0xff, float:3.57E-43)
            int[] r5 = r10.f8406a
            r5 = r5[r1]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r6
            j4.e7 r6 = j4.e7.DOUBLE_LIST_PACKED
            int r6 = r6.zza()
            if (r4 < r6) goto L_0x0033
            j4.e7 r6 = j4.e7.SINT64_LIST_PACKED
            int r6 = r6.zza()
            if (r4 > r6) goto L_0x0033
            int[] r6 = r10.f8406a
            int r7 = r1 + 2
            r6 = r6[r7]
        L_0x0033:
            long r6 = (long) r3
            r3 = 63
            switch(r4) {
                case 0: goto L_0x0390;
                case 1: goto L_0x0381;
                case 2: goto L_0x0369;
                case 3: goto L_0x0362;
                case 4: goto L_0x034d;
                case 5: goto L_0x0346;
                case 6: goto L_0x033f;
                case 7: goto L_0x0330;
                case 8: goto L_0x0303;
                case 9: goto L_0x02ef;
                case 10: goto L_0x02e4;
                case 11: goto L_0x02d2;
                case 12: goto L_0x02ca;
                case 13: goto L_0x02c2;
                case 14: goto L_0x02ba;
                case 15: goto L_0x029e;
                case 16: goto L_0x0282;
                case 17: goto L_0x026c;
                case 18: goto L_0x0260;
                case 19: goto L_0x0254;
                case 20: goto L_0x0248;
                case 21: goto L_0x023c;
                case 22: goto L_0x0230;
                case 23: goto L_0x0260;
                case 24: goto L_0x0254;
                case 25: goto L_0x0224;
                case 26: goto L_0x0218;
                case 27: goto L_0x0208;
                case 28: goto L_0x01fc;
                case 29: goto L_0x01f0;
                case 30: goto L_0x01e4;
                case 31: goto L_0x0254;
                case 32: goto L_0x0260;
                case 33: goto L_0x01d8;
                case 34: goto L_0x01cc;
                case 35: goto L_0x01b3;
                case 36: goto L_0x01a6;
                case 37: goto L_0x0199;
                case 38: goto L_0x018c;
                case 39: goto L_0x017f;
                case 40: goto L_0x0172;
                case 41: goto L_0x0165;
                case 42: goto L_0x0156;
                case 43: goto L_0x0148;
                case 44: goto L_0x013a;
                case 45: goto L_0x012c;
                case 46: goto L_0x011e;
                case 47: goto L_0x0110;
                case 48: goto L_0x0102;
                case 49: goto L_0x00f2;
                case 50: goto L_0x00e5;
                case 51: goto L_0x00dd;
                case 52: goto L_0x00d5;
                case 53: goto L_0x00c9;
                case 54: goto L_0x00c2;
                case 55: goto L_0x00b6;
                case 56: goto L_0x00ae;
                case 57: goto L_0x00a6;
                case 58: goto L_0x009e;
                case 59: goto L_0x008e;
                case 60: goto L_0x0086;
                case 61: goto L_0x007e;
                case 62: goto L_0x0072;
                case 63: goto L_0x006b;
                case 64: goto L_0x0063;
                case 65: goto L_0x005b;
                case 66: goto L_0x004f;
                case 67: goto L_0x0043;
                case 68: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x039f
        L_0x003b:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0272
        L_0x0043:
            boolean r4 = r10.x(r5, r1, r11)
            if (r4 == 0) goto L_0x039f
            long r6 = J(r6, r11)
            goto L_0x028c
        L_0x004f:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            int r3 = D(r6, r11)
            goto L_0x02a8
        L_0x005b:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0396
        L_0x0063:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0387
        L_0x006b:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x00bc
        L_0x0072:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            int r3 = D(r6, r11)
            goto L_0x02dc
        L_0x007e:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x02ea
        L_0x0086:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x02f5
        L_0x008e:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            java.lang.Object r3 = j4.t9.j(r6, r11)
            boolean r4 = r3 instanceof j4.q6
            if (r4 == 0) goto L_0x0327
            goto L_0x0311
        L_0x009e:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0336
        L_0x00a6:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0387
        L_0x00ae:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0396
        L_0x00b6:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
        L_0x00bc:
            int r3 = D(r6, r11)
            goto L_0x0357
        L_0x00c2:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x00cf
        L_0x00c9:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
        L_0x00cf:
            long r3 = J(r6, r11)
            goto L_0x0373
        L_0x00d5:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0387
        L_0x00dd:
            boolean r3 = r10.x(r5, r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0396
        L_0x00e5:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.lang.Object r4 = r10.j(r1)
            j4.j8.a(r3, r4)
            goto L_0x039f
        L_0x00f2:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            j4.y8 r4 = r10.i(r1)
            int r3 = j4.z8.C(r5, r3, r4)
            goto L_0x039e
        L_0x0102:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.M(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x0110:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.K(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x011e:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.B(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x012c:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.z(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x013a:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.x(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x0148:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.P(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x0156:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            java.lang.Class r4 = j4.z8.f8581a
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x0165:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.z(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x0172:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.B(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x017f:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.E(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x018c:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.R(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x0199:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.G(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x01a6:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.z(r3)
            if (r3 <= 0) goto L_0x039f
            goto L_0x01bf
        L_0x01b3:
            java.lang.Object r3 = r0.getObject(r11, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.B(r3)
            if (r3 <= 0) goto L_0x039f
        L_0x01bf:
            int r4 = r5 << 3
            int r5 = j4.u6.m0(r3)
            int r4 = j4.u6.m0(r4)
            int r4 = r4 + r5
            goto L_0x037d
        L_0x01cc:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.L(r5, r3)
            goto L_0x039e
        L_0x01d8:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.J(r5, r3)
            goto L_0x039e
        L_0x01e4:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.w(r5, r3)
            goto L_0x039e
        L_0x01f0:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.O(r5, r3)
            goto L_0x039e
        L_0x01fc:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.v(r3, r5)
            goto L_0x039e
        L_0x0208:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            j4.y8 r4 = r10.i(r1)
            int r3 = j4.z8.I(r5, r3, r4)
            goto L_0x039e
        L_0x0218:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.N(r3, r5)
            goto L_0x039e
        L_0x0224:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.u(r5, r3)
            goto L_0x039e
        L_0x0230:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.D(r5, r3)
            goto L_0x039e
        L_0x023c:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.Q(r5, r3)
            goto L_0x039e
        L_0x0248:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.F(r5, r3)
            goto L_0x039e
        L_0x0254:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.y(r5, r3)
            goto L_0x039e
        L_0x0260:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            java.util.List r3 = (java.util.List) r3
            int r3 = j4.z8.A(r5, r3)
            goto L_0x039e
        L_0x026c:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
        L_0x0272:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            j4.n8 r3 = (j4.n8) r3
            j4.y8 r4 = r10.i(r1)
            int r3 = j4.u6.j0(r5, r3, r4)
            goto L_0x039e
        L_0x0282:
            boolean r4 = r10.v(r1, r11)
            if (r4 == 0) goto L_0x039f
            long r6 = j4.t9.h(r6, r11)
        L_0x028c:
            int r4 = r5 << 3
            long r8 = r6 + r6
            long r5 = r6 >> r3
            int r3 = j4.u6.m0(r4)
            long r4 = r8 ^ r5
            int r4 = j4.u6.n0(r4)
            goto L_0x037d
        L_0x029e:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
            int r3 = j4.t9.g(r6, r11)
        L_0x02a8:
            int r4 = r5 << 3
            int r5 = r3 + r3
            int r3 = r3 >> 31
            int r4 = j4.u6.m0(r4)
            r3 = r3 ^ r5
            int r3 = j4.u6.m0(r3)
            int r3 = r3 + r4
            goto L_0x039e
        L_0x02ba:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0396
        L_0x02c2:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0387
        L_0x02ca:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0353
        L_0x02d2:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
            int r3 = j4.t9.g(r6, r11)
        L_0x02dc:
            int r4 = r5 << 3
            int r3 = j4.u6.m0(r3)
            goto L_0x035d
        L_0x02e4:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
        L_0x02ea:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            goto L_0x0311
        L_0x02ef:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
        L_0x02f5:
            java.lang.Object r3 = j4.t9.j(r6, r11)
            j4.y8 r4 = r10.i(r1)
            int r3 = j4.z8.H(r5, r4, r3)
            goto L_0x039e
        L_0x0303:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
            java.lang.Object r3 = j4.t9.j(r6, r11)
            boolean r4 = r3 instanceof j4.q6
            if (r4 == 0) goto L_0x0327
        L_0x0311:
            j4.q6 r3 = (j4.q6) r3
            int r4 = r5 << 3
            java.util.logging.Logger r5 = j4.u6.f8492x
            int r3 = r3.g()
            int r5 = j4.u6.m0(r3)
            int r5 = r5 + r3
            int r3 = j4.u6.m0(r4)
            int r3 = r3 + r5
            goto L_0x039e
        L_0x0327:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r5 << 3
            int r3 = j4.u6.l0(r3)
            goto L_0x035d
        L_0x0330:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
        L_0x0336:
            int r3 = r5 << 3
            int r3 = j4.u6.m0(r3)
            int r3 = r3 + 1
            goto L_0x039e
        L_0x033f:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0387
        L_0x0346:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x0396
        L_0x034d:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
        L_0x0353:
            int r3 = j4.t9.g(r6, r11)
        L_0x0357:
            int r4 = r5 << 3
            int r3 = j4.u6.k0(r3)
        L_0x035d:
            int r4 = j4.u6.m0(r4)
            goto L_0x037d
        L_0x0362:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
            goto L_0x036f
        L_0x0369:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
        L_0x036f:
            long r3 = j4.t9.h(r6, r11)
        L_0x0373:
            int r5 = r5 << 3
            int r3 = j4.u6.n0(r3)
            int r4 = j4.u6.m0(r5)
        L_0x037d:
            int r4 = r4 + r3
            int r4 = r4 + r2
            r2 = r4
            goto L_0x039f
        L_0x0381:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
        L_0x0387:
            int r3 = r5 << 3
            int r3 = j4.u6.m0(r3)
            int r3 = r3 + 4
            goto L_0x039e
        L_0x0390:
            boolean r3 = r10.v(r1, r11)
            if (r3 == 0) goto L_0x039f
        L_0x0396:
            int r3 = r5 << 3
            int r3 = j4.u6.m0(r3)
            int r3 = r3 + 8
        L_0x039e:
            int r2 = r2 + r3
        L_0x039f:
            int r1 = r1 + 3
            goto L_0x0008
        L_0x03a3:
            j4.j9 r0 = r10.f8416l
            j4.k9 r11 = r0.d(r11)
            int r11 = r0.a(r11)
            int r11 = r11 + r2
            goto L_0x03b3
        L_0x03af:
            int r11 = r10.C(r11)
        L_0x03b3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q8.b(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        j4.t9.r(r4, r7, j4.t9.j(r4, r8));
        r(r3, r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        j4.t9.r(r4, r7, j4.t9.j(r4, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        j4.t9.p(j4.t9.g(r4, r8), r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
        j4.t9.q(r7, r4, j4.t9.h(r4, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fa, code lost:
        q(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            n(r7)
            r8.getClass()
            r0 = 0
        L_0x0007:
            int[] r1 = r6.f8406a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x0101
            int r1 = r6.I(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            int[] r3 = r6.f8406a
            r3 = r3[r0]
            int r1 = r1 >>> 20
            r1 = r1 & 255(0xff, float:3.57E-43)
            long r4 = (long) r2
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
            boolean r1 = r6.x(r3, r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x0034
        L_0x0029:
            r6.p(r7, r0, r8)
            goto L_0x00fd
        L_0x002e:
            boolean r1 = r6.x(r3, r0, r8)
            if (r1 == 0) goto L_0x00fd
        L_0x0034:
            java.lang.Object r1 = j4.t9.j(r4, r8)
            j4.t9.r(r4, r7, r1)
            r6.r(r3, r0, r7)
            goto L_0x00fd
        L_0x0040:
            java.lang.Class r1 = j4.z8.f8581a
            java.lang.Object r1 = j4.t9.j(r4, r7)
            java.lang.Object r2 = j4.t9.j(r4, r8)
            j4.i8 r1 = j4.j8.b(r1, r2)
            j4.t9.r(r4, r7, r1)
            goto L_0x00fd
        L_0x0053:
            j4.b8 r1 = r6.k
            r1.b(r4, r7, r8)
            goto L_0x00fd
        L_0x005a:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x0062:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x0069:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x0071:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x0078:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x007f:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x0086:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x0098
        L_0x008d:
            r6.o(r7, r0, r8)
            goto L_0x00fd
        L_0x0092:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
        L_0x0098:
            java.lang.Object r1 = j4.t9.j(r4, r8)
            j4.t9.r(r4, r7, r1)
            goto L_0x00fa
        L_0x00a0:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            boolean r1 = j4.t9.v(r4, r8)
            j4.t9.m(r7, r4, r1)
            goto L_0x00fa
        L_0x00ae:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x00b5:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x00bc:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
        L_0x00c2:
            int r1 = j4.t9.g(r4, r8)
            j4.t9.p(r1, r4, r7)
            goto L_0x00fa
        L_0x00ca:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x00d1:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
        L_0x00d7:
            long r1 = j4.t9.h(r4, r8)
            j4.t9.q(r7, r4, r1)
            goto L_0x00fa
        L_0x00df:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            float r1 = j4.t9.f(r4, r8)
            j4.t9.o(r7, r4, r1)
            goto L_0x00fa
        L_0x00ed:
            boolean r1 = r6.v(r0, r8)
            if (r1 == 0) goto L_0x00fd
            double r1 = j4.t9.e(r4, r8)
            j4.t9.n(r7, r4, r1)
        L_0x00fa:
            r6.q(r0, r7)
        L_0x00fd:
            int r0 = r0 + 3
            goto L_0x0007
        L_0x0101:
            j4.j9 r0 = r6.f8416l
            java.lang.Class r1 = j4.z8.f8581a
            j4.k9 r1 = r0.d(r7)
            j4.k9 r2 = r0.d(r8)
            java.lang.Object r1 = r0.e(r1, r2)
            r0.h(r7, r1)
            boolean r7 = r6.f8411f
            if (r7 != 0) goto L_0x0119
            return
        L_0x0119:
            j4.z6 r7 = r6.f8417m
            r7.a(r8)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q8.c(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b8, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            int[] r0 = r8.f8406a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r2 >= r0) goto L_0x01bc
            int r3 = r8.I(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
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
            int[] r3 = r8.f8406a
            int r7 = r2 + 2
            r3 = r3[r7]
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = j4.t9.g(r3, r9)
            int r3 = j4.t9.g(r3, r10)
            if (r7 != r3) goto L_0x01b7
            java.lang.Object r3 = j4.t9.j(r5, r9)
            java.lang.Object r4 = j4.t9.j(r5, r10)
            boolean r3 = j4.z8.t(r3, r4)
            if (r3 != 0) goto L_0x01b8
            goto L_0x01b7
        L_0x003c:
            java.lang.Object r3 = j4.t9.j(r5, r9)
            java.lang.Object r4 = j4.t9.j(r5, r10)
            boolean r3 = j4.z8.t(r3, r4)
            if (r3 != 0) goto L_0x01b8
            goto L_0x01b7
        L_0x004c:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            java.lang.Object r3 = j4.t9.j(r5, r9)
            java.lang.Object r4 = j4.t9.j(r5, r10)
            boolean r3 = j4.z8.t(r3, r4)
            if (r3 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x0062:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            long r3 = j4.t9.h(r5, r9)
            long r5 = j4.t9.h(r5, r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x0076:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = j4.t9.g(r5, r9)
            int r4 = j4.t9.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x0088:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            long r3 = j4.t9.h(r5, r9)
            long r5 = j4.t9.h(r5, r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x009c:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = j4.t9.g(r5, r9)
            int r4 = j4.t9.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x00ae:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = j4.t9.g(r5, r9)
            int r4 = j4.t9.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x00c0:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = j4.t9.g(r5, r9)
            int r4 = j4.t9.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x00d2:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            java.lang.Object r3 = j4.t9.j(r5, r9)
            java.lang.Object r4 = j4.t9.j(r5, r10)
            boolean r3 = j4.z8.t(r3, r4)
            if (r3 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x00e8:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            java.lang.Object r3 = j4.t9.j(r5, r9)
            java.lang.Object r4 = j4.t9.j(r5, r10)
            boolean r3 = j4.z8.t(r3, r4)
            if (r3 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x00fe:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            java.lang.Object r3 = j4.t9.j(r5, r9)
            java.lang.Object r4 = j4.t9.j(r5, r10)
            boolean r3 = j4.z8.t(r3, r4)
            if (r3 == 0) goto L_0x01b7
            goto L_0x01b8
        L_0x0114:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            boolean r3 = j4.t9.v(r5, r9)
            boolean r4 = j4.t9.v(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x0126:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = j4.t9.g(r5, r9)
            int r4 = j4.t9.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x0138:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            long r3 = j4.t9.h(r5, r9)
            long r5 = j4.t9.h(r5, r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x014c:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            int r3 = j4.t9.g(r5, r9)
            int r4 = j4.t9.g(r5, r10)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x015d:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            long r3 = j4.t9.h(r5, r9)
            long r5 = j4.t9.h(r5, r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x0170:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            long r3 = j4.t9.h(r5, r9)
            long r5 = j4.t9.h(r5, r10)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x0183:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            float r3 = j4.t9.f(r5, r9)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = j4.t9.f(r5, r10)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b7
            goto L_0x01b8
        L_0x019c:
            boolean r3 = r8.u(r9, r2, r10)
            if (r3 == 0) goto L_0x01b7
            double r3 = j4.t9.e(r5, r9)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = j4.t9.e(r5, r10)
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
            j4.j9 r0 = r8.f8416l
            j4.k9 r0 = r0.d(r9)
            j4.j9 r2 = r8.f8416l
            j4.k9 r2 = r2.d(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cf
            return r1
        L_0x01cf:
            boolean r0 = r8.f8411f
            if (r0 != 0) goto L_0x01d5
            r9 = 1
            return r9
        L_0x01d5:
            j4.z6 r0 = r8.f8417m
            r0.a(r9)
            j4.z6 r9 = r8.f8417m
            r9.a(r10)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q8.d(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean e(Object obj) {
        boolean z9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (true) {
            boolean z10 = true;
            if (i10 < this.f8414i) {
                int i13 = this.f8413h[i10];
                int i14 = this.f8406a[i13];
                int I = I(i13);
                int i15 = this.f8406a[i13 + 2];
                int i16 = i15 & 1048575;
                int i17 = 1 << (i15 >>> 20);
                if (i16 != i12) {
                    if (i16 != 1048575) {
                        i11 = f8405o.getInt(obj, (long) i16);
                    }
                    i12 = i16;
                }
                if ((268435456 & I) != 0) {
                    if (i12 == 1048575) {
                        z9 = v(i13, obj);
                    } else if ((i11 & i17) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        return false;
                    }
                }
                int i18 = (I >>> 20) & 255;
                if (i18 == 9 || i18 == 17) {
                    if (i12 == 1048575) {
                        z10 = v(i13, obj);
                    } else if ((i11 & i17) == 0) {
                        z10 = false;
                    }
                    if (z10 && !i(i13).e(t9.j((long) (I & 1048575), obj))) {
                        return false;
                    }
                } else {
                    if (i18 != 27) {
                        if (i18 == 60 || i18 == 68) {
                            if (x(i14, i13, obj) && !i(i13).e(t9.j((long) (I & 1048575), obj))) {
                                return false;
                            }
                        } else if (i18 != 49) {
                            if (i18 == 50 && !((i8) t9.j((long) (I & 1048575), obj)).isEmpty()) {
                                h8 h8Var = (h8) j(i13);
                                throw null;
                            }
                        }
                    }
                    List list = (List) t9.j((long) (I & 1048575), obj);
                    if (!list.isEmpty()) {
                        y8 i19 = i(i13);
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            if (!i19.e(list.get(i20))) {
                                return false;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
                i10++;
            } else if (!this.f8411f) {
                return true;
            } else {
                this.f8417m.a(obj);
                throw null;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        r3 = j4.t9.j(r5, r10);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        r2 = r2 * 53;
        r3 = D(r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b0, code lost:
        r2 = r2 * 53;
        r3 = J(r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        if (r3 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e5, code lost:
        r2 = r2 * 53;
        r3 = j4.t9.j(r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00eb, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f4, code lost:
        if (r3 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f6, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fa, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fe, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) j4.t9.j(r5, r10)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0111, code lost:
        r3 = j4.s7.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012a, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012e, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0137, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013b, code lost:
        r5 = j4.s7.f8462a;
        r2 = r2 + ((int) (r3 ^ (r3 >>> 32)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r0 = r9.f8406a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0146
            int r3 = r9.I(r1)
            int[] r4 = r9.f8406a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 37
            r8 = 32
            switch(r3) {
                case 0: goto L_0x0131;
                case 1: goto L_0x0124;
                case 2: goto L_0x011d;
                case 3: goto L_0x011d;
                case 4: goto L_0x0116;
                case 5: goto L_0x011d;
                case 6: goto L_0x0116;
                case 7: goto L_0x010b;
                case 8: goto L_0x00fe;
                case 9: goto L_0x00f0;
                case 10: goto L_0x00e5;
                case 11: goto L_0x0116;
                case 12: goto L_0x0116;
                case 13: goto L_0x0116;
                case 14: goto L_0x011d;
                case 15: goto L_0x0116;
                case 16: goto L_0x011d;
                case 17: goto L_0x00de;
                case 18: goto L_0x00e5;
                case 19: goto L_0x00e5;
                case 20: goto L_0x00e5;
                case 21: goto L_0x00e5;
                case 22: goto L_0x00e5;
                case 23: goto L_0x00e5;
                case 24: goto L_0x00e5;
                case 25: goto L_0x00e5;
                case 26: goto L_0x00e5;
                case 27: goto L_0x00e5;
                case 28: goto L_0x00e5;
                case 29: goto L_0x00e5;
                case 30: goto L_0x00e5;
                case 31: goto L_0x00e5;
                case 32: goto L_0x00e5;
                case 33: goto L_0x00e5;
                case 34: goto L_0x00e5;
                case 35: goto L_0x00e5;
                case 36: goto L_0x00e5;
                case 37: goto L_0x00e5;
                case 38: goto L_0x00e5;
                case 39: goto L_0x00e5;
                case 40: goto L_0x00e5;
                case 41: goto L_0x00e5;
                case 42: goto L_0x00e5;
                case 43: goto L_0x00e5;
                case 44: goto L_0x00e5;
                case 45: goto L_0x00e5;
                case 46: goto L_0x00e5;
                case 47: goto L_0x00e5;
                case 48: goto L_0x00e5;
                case 49: goto L_0x00e5;
                case 50: goto L_0x00e5;
                case 51: goto L_0x00cb;
                case 52: goto L_0x00b8;
                case 53: goto L_0x00aa;
                case 54: goto L_0x00a3;
                case 55: goto L_0x0095;
                case 56: goto L_0x008e;
                case 57: goto L_0x0087;
                case 58: goto L_0x0073;
                case 59: goto L_0x006b;
                case 60: goto L_0x005d;
                case 61: goto L_0x0055;
                case 62: goto L_0x004e;
                case 63: goto L_0x0047;
                case 64: goto L_0x0040;
                case 65: goto L_0x0038;
                case 66: goto L_0x0030;
                case 67: goto L_0x0028;
                case 68: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0142
        L_0x0021:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x0063
        L_0x0028:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x00b0
        L_0x0030:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x009b
        L_0x0038:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x00b0
        L_0x0040:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x009b
        L_0x0047:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x009b
        L_0x004e:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x009b
        L_0x0055:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x00e5
        L_0x005d:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
        L_0x0063:
            java.lang.Object r3 = j4.t9.j(r5, r10)
            int r2 = r2 * 53
            goto L_0x00eb
        L_0x006b:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x00fe
        L_0x0073:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            int r2 = r2 * 53
            java.lang.Object r3 = j4.t9.j(r5, r10)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x0111
        L_0x0087:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x009b
        L_0x008e:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x00b0
        L_0x0095:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
        L_0x009b:
            int r2 = r2 * 53
            int r3 = D(r5, r10)
            goto L_0x012e
        L_0x00a3:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            goto L_0x00b0
        L_0x00aa:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
        L_0x00b0:
            int r2 = r2 * 53
            long r3 = J(r5, r10)
            goto L_0x013b
        L_0x00b8:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            int r2 = r2 * 53
            java.lang.Object r3 = j4.t9.j(r5, r10)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L_0x012a
        L_0x00cb:
            boolean r3 = r9.x(r4, r1, r10)
            if (r3 == 0) goto L_0x0142
            int r2 = r2 * 53
            java.lang.Object r3 = j4.t9.j(r5, r10)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            goto L_0x0137
        L_0x00de:
            java.lang.Object r3 = j4.t9.j(r5, r10)
            if (r3 == 0) goto L_0x00fa
            goto L_0x00f6
        L_0x00e5:
            int r2 = r2 * 53
            java.lang.Object r3 = j4.t9.j(r5, r10)
        L_0x00eb:
            int r3 = r3.hashCode()
            goto L_0x012e
        L_0x00f0:
            java.lang.Object r3 = j4.t9.j(r5, r10)
            if (r3 == 0) goto L_0x00fa
        L_0x00f6:
            int r7 = r3.hashCode()
        L_0x00fa:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0142
        L_0x00fe:
            int r2 = r2 * 53
            java.lang.Object r3 = j4.t9.j(r5, r10)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x012e
        L_0x010b:
            int r2 = r2 * 53
            boolean r3 = j4.t9.v(r5, r10)
        L_0x0111:
            int r3 = j4.s7.a(r3)
            goto L_0x012e
        L_0x0116:
            int r2 = r2 * 53
            int r3 = j4.t9.g(r5, r10)
            goto L_0x012e
        L_0x011d:
            int r2 = r2 * 53
            long r3 = j4.t9.h(r5, r10)
            goto L_0x013b
        L_0x0124:
            int r2 = r2 * 53
            float r3 = j4.t9.f(r5, r10)
        L_0x012a:
            int r3 = java.lang.Float.floatToIntBits(r3)
        L_0x012e:
            int r3 = r3 + r2
            r2 = r3
            goto L_0x0142
        L_0x0131:
            int r2 = r2 * 53
            double r3 = j4.t9.e(r5, r10)
        L_0x0137:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x013b:
            java.nio.charset.Charset r5 = j4.s7.f8462a
            long r5 = r3 >>> r8
            long r3 = r3 ^ r5
            int r3 = (int) r3
            int r2 = r2 + r3
        L_0x0142:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0146:
            int r2 = r2 * 53
            j4.j9 r0 = r9.f8416l
            j4.k9 r0 = r0.d(r10)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r9.f8411f
            if (r1 != 0) goto L_0x0158
            return r0
        L_0x0158:
            j4.z6 r0 = r9.f8417m
            r0.a(r10)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q8.f(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fb, code lost:
        r2.b(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x030c, code lost:
        r2.a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x031d, code lost:
        r2.q(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x032e, code lost:
        r2.p(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x033f, code lost:
        r2.h(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0350, code lost:
        r2.c(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x035b, code lost:
        r2.f(r10, (j4.q6) j4.t9.j((long) (r9 & 1048575), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x036e, code lost:
        r2.o(r10, i(r8), j4.t9.j((long) (r9 & 1048575), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0383, code lost:
        y(r10, j4.t9.j((long) (r9 & 1048575), r1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x039a, code lost:
        r2.e(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03ab, code lost:
        r2.i(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03bb, code lost:
        r2.j(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03cb, code lost:
        r2.m(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03db, code lost:
        r2.d(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03eb, code lost:
        r2.n(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03fb, code lost:
        r2.k(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x040b, code lost:
        r2.g(r11, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02e0, code lost:
        r2.l(r10, i(r8), j4.t9.j((long) (r9 & 1048575), r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(java.lang.Object r17, j4.v6 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f8412g
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x0418
            boolean r3 = r0.f8411f
            if (r3 != 0) goto L_0x0412
            int[] r3 = r0.f8406a
            int r3 = r3.length
            r8 = r6
        L_0x0018:
            if (r8 >= r3) goto L_0x0866
            int r9 = r0.I(r8)
            int[] r10 = r0.f8406a
            r10 = r10[r8]
            int r11 = r9 >>> 20
            r11 = r11 & 255(0xff, float:3.57E-43)
            switch(r11) {
                case 0: goto L_0x03ff;
                case 1: goto L_0x03ef;
                case 2: goto L_0x03df;
                case 3: goto L_0x03cf;
                case 4: goto L_0x03bf;
                case 5: goto L_0x03af;
                case 6: goto L_0x039f;
                case 7: goto L_0x038e;
                case 8: goto L_0x037d;
                case 9: goto L_0x0368;
                case 10: goto L_0x0355;
                case 11: goto L_0x0344;
                case 12: goto L_0x0333;
                case 13: goto L_0x0322;
                case 14: goto L_0x0311;
                case 15: goto L_0x0300;
                case 16: goto L_0x02ef;
                case 17: goto L_0x02da;
                case 18: goto L_0x02cd;
                case 19: goto L_0x02c0;
                case 20: goto L_0x02b3;
                case 21: goto L_0x02a6;
                case 22: goto L_0x0299;
                case 23: goto L_0x028c;
                case 24: goto L_0x027f;
                case 25: goto L_0x0272;
                case 26: goto L_0x0265;
                case 27: goto L_0x0254;
                case 28: goto L_0x0247;
                case 29: goto L_0x023a;
                case 30: goto L_0x022d;
                case 31: goto L_0x0220;
                case 32: goto L_0x0213;
                case 33: goto L_0x0206;
                case 34: goto L_0x01f9;
                case 35: goto L_0x01ec;
                case 36: goto L_0x01df;
                case 37: goto L_0x01d2;
                case 38: goto L_0x01c5;
                case 39: goto L_0x01b8;
                case 40: goto L_0x01ab;
                case 41: goto L_0x019e;
                case 42: goto L_0x0191;
                case 43: goto L_0x0184;
                case 44: goto L_0x0177;
                case 45: goto L_0x016a;
                case 46: goto L_0x015d;
                case 47: goto L_0x0150;
                case 48: goto L_0x0143;
                case 49: goto L_0x0132;
                case 50: goto L_0x0121;
                case 51: goto L_0x010d;
                case 52: goto L_0x00f9;
                case 53: goto L_0x00eb;
                case 54: goto L_0x00dd;
                case 55: goto L_0x00cf;
                case 56: goto L_0x00c1;
                case 57: goto L_0x00b3;
                case 58: goto L_0x009f;
                case 59: goto L_0x0097;
                case 60: goto L_0x008f;
                case 61: goto L_0x0087;
                case 62: goto L_0x0079;
                case 63: goto L_0x006b;
                case 64: goto L_0x005d;
                case 65: goto L_0x004f;
                case 66: goto L_0x0041;
                case 67: goto L_0x0033;
                case 68: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x040e
        L_0x002b:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            goto L_0x02e0
        L_0x0033:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            long r11 = J(r11, r1)
            goto L_0x02fb
        L_0x0041:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = D(r11, r1)
            goto L_0x030c
        L_0x004f:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            long r11 = J(r11, r1)
            goto L_0x031d
        L_0x005d:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = D(r11, r1)
            goto L_0x032e
        L_0x006b:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = D(r11, r1)
            goto L_0x033f
        L_0x0079:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = D(r11, r1)
            goto L_0x0350
        L_0x0087:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            goto L_0x035b
        L_0x008f:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            goto L_0x036e
        L_0x0097:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            goto L_0x0383
        L_0x009f:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            goto L_0x039a
        L_0x00b3:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = D(r11, r1)
            goto L_0x03ab
        L_0x00c1:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            long r11 = J(r11, r1)
            goto L_0x03bb
        L_0x00cf:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = D(r11, r1)
            goto L_0x03cb
        L_0x00dd:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            long r11 = J(r11, r1)
            goto L_0x03db
        L_0x00eb:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            long r11 = J(r11, r1)
            goto L_0x03eb
        L_0x00f9:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L_0x03fb
        L_0x010d:
            boolean r11 = r0.x(r10, r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.lang.Double r9 = (java.lang.Double) r9
            double r11 = r9.doubleValue()
            goto L_0x040b
        L_0x0121:
            r9 = r9 & r4
            long r9 = (long) r9
            java.lang.Object r9 = j4.t9.j(r9, r1)
            if (r9 != 0) goto L_0x012b
            goto L_0x040e
        L_0x012b:
            java.lang.Object r1 = r0.j(r8)
            j4.h8 r1 = (j4.h8) r1
            throw r5
        L_0x0132:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.y8 r11 = r0.i(r8)
            j4.z8.i(r10, r9, r2, r11)
            goto L_0x040e
        L_0x0143:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.p(r10, r9, r2, r7)
            goto L_0x040e
        L_0x0150:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.o(r10, r9, r2, r7)
            goto L_0x040e
        L_0x015d:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.n(r10, r9, r2, r7)
            goto L_0x040e
        L_0x016a:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.m(r10, r9, r2, r7)
            goto L_0x040e
        L_0x0177:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.e(r10, r9, r2, r7)
            goto L_0x040e
        L_0x0184:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.r(r10, r9, r2, r7)
            goto L_0x040e
        L_0x0191:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.b(r10, r9, r2, r7)
            goto L_0x040e
        L_0x019e:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.f(r10, r9, r2, r7)
            goto L_0x040e
        L_0x01ab:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.g(r10, r9, r2, r7)
            goto L_0x040e
        L_0x01b8:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.j(r10, r9, r2, r7)
            goto L_0x040e
        L_0x01c5:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.s(r10, r9, r2, r7)
            goto L_0x040e
        L_0x01d2:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.k(r10, r9, r2, r7)
            goto L_0x040e
        L_0x01df:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.h(r10, r9, r2, r7)
            goto L_0x040e
        L_0x01ec:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.d(r10, r9, r2, r7)
            goto L_0x040e
        L_0x01f9:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.p(r10, r9, r2, r6)
            goto L_0x040e
        L_0x0206:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.o(r10, r9, r2, r6)
            goto L_0x040e
        L_0x0213:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.n(r10, r9, r2, r6)
            goto L_0x040e
        L_0x0220:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.m(r10, r9, r2, r6)
            goto L_0x040e
        L_0x022d:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.e(r10, r9, r2, r6)
            goto L_0x040e
        L_0x023a:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.r(r10, r9, r2, r6)
            goto L_0x040e
        L_0x0247:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.c(r10, r9, r2)
            goto L_0x040e
        L_0x0254:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.y8 r11 = r0.i(r8)
            j4.z8.l(r10, r9, r2, r11)
            goto L_0x040e
        L_0x0265:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.q(r10, r9, r2)
            goto L_0x040e
        L_0x0272:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.b(r10, r9, r2, r6)
            goto L_0x040e
        L_0x027f:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.f(r10, r9, r2, r6)
            goto L_0x040e
        L_0x028c:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.g(r10, r9, r2, r6)
            goto L_0x040e
        L_0x0299:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.j(r10, r9, r2, r6)
            goto L_0x040e
        L_0x02a6:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.s(r10, r9, r2, r6)
            goto L_0x040e
        L_0x02b3:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.k(r10, r9, r2, r6)
            goto L_0x040e
        L_0x02c0:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.h(r10, r9, r2, r6)
            goto L_0x040e
        L_0x02cd:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            java.util.List r9 = (java.util.List) r9
            j4.z8.d(r10, r9, r2, r6)
            goto L_0x040e
        L_0x02da:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
        L_0x02e0:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            j4.y8 r11 = r0.i(r8)
            r2.l(r10, r11, r9)
            goto L_0x040e
        L_0x02ef:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            long r11 = j4.t9.h(r11, r1)
        L_0x02fb:
            r2.b(r10, r11)
            goto L_0x040e
        L_0x0300:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = j4.t9.g(r11, r1)
        L_0x030c:
            r2.a(r10, r9)
            goto L_0x040e
        L_0x0311:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            long r11 = j4.t9.h(r11, r1)
        L_0x031d:
            r2.q(r10, r11)
            goto L_0x040e
        L_0x0322:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = j4.t9.g(r11, r1)
        L_0x032e:
            r2.p(r10, r9)
            goto L_0x040e
        L_0x0333:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = j4.t9.g(r11, r1)
        L_0x033f:
            r2.h(r10, r9)
            goto L_0x040e
        L_0x0344:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = j4.t9.g(r11, r1)
        L_0x0350:
            r2.c(r10, r9)
            goto L_0x040e
        L_0x0355:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
        L_0x035b:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            j4.q6 r9 = (j4.q6) r9
            r2.f(r10, r9)
            goto L_0x040e
        L_0x0368:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
        L_0x036e:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            j4.y8 r11 = r0.i(r8)
            r2.o(r10, r11, r9)
            goto L_0x040e
        L_0x037d:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
        L_0x0383:
            r9 = r9 & r4
            long r11 = (long) r9
            java.lang.Object r9 = j4.t9.j(r11, r1)
            y(r10, r9, r2)
            goto L_0x040e
        L_0x038e:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            boolean r9 = j4.t9.v(r11, r1)
        L_0x039a:
            r2.e(r10, r9)
            goto L_0x040e
        L_0x039f:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = j4.t9.g(r11, r1)
        L_0x03ab:
            r2.i(r10, r9)
            goto L_0x040e
        L_0x03af:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            long r11 = j4.t9.h(r11, r1)
        L_0x03bb:
            r2.j(r10, r11)
            goto L_0x040e
        L_0x03bf:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            int r9 = j4.t9.g(r11, r1)
        L_0x03cb:
            r2.m(r10, r9)
            goto L_0x040e
        L_0x03cf:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            long r11 = j4.t9.h(r11, r1)
        L_0x03db:
            r2.d(r10, r11)
            goto L_0x040e
        L_0x03df:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            long r11 = j4.t9.h(r11, r1)
        L_0x03eb:
            r2.n(r10, r11)
            goto L_0x040e
        L_0x03ef:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            float r9 = j4.t9.f(r11, r1)
        L_0x03fb:
            r2.k(r10, r9)
            goto L_0x040e
        L_0x03ff:
            boolean r11 = r0.v(r8, r1)
            if (r11 == 0) goto L_0x040e
            r9 = r9 & r4
            long r11 = (long) r9
            double r11 = j4.t9.e(r11, r1)
        L_0x040b:
            r2.g(r11, r10)
        L_0x040e:
            int r8 = r8 + 3
            goto L_0x0018
        L_0x0412:
            j4.z6 r2 = r0.f8417m
            r2.a(r1)
            throw r5
        L_0x0418:
            boolean r3 = r0.f8411f
            if (r3 != 0) goto L_0x0870
            int[] r3 = r0.f8406a
            int r3 = r3.length
            sun.misc.Unsafe r8 = f8405o
            r10 = r4
            r9 = r6
            r11 = r9
        L_0x0424:
            if (r9 >= r3) goto L_0x0866
            int r12 = r0.I(r9)
            int[] r13 = r0.f8406a
            r14 = r13[r9]
            int r15 = r12 >>> 20
            r15 = r15 & 255(0xff, float:3.57E-43)
            r6 = 17
            if (r15 > r6) goto L_0x0449
            int r6 = r9 + 2
            r6 = r13[r6]
            r13 = r6 & r4
            if (r13 == r10) goto L_0x0444
            long r10 = (long) r13
            int r11 = r8.getInt(r1, r10)
            r10 = r13
        L_0x0444:
            int r6 = r6 >>> 20
            int r6 = r7 << r6
            goto L_0x044a
        L_0x0449:
            r6 = 0
        L_0x044a:
            r12 = r12 & r4
            long r12 = (long) r12
            switch(r15) {
                case 0: goto L_0x0856;
                case 1: goto L_0x084a;
                case 2: goto L_0x083e;
                case 3: goto L_0x0832;
                case 4: goto L_0x0826;
                case 5: goto L_0x081a;
                case 6: goto L_0x080e;
                case 7: goto L_0x0802;
                case 8: goto L_0x07f6;
                case 9: goto L_0x07e5;
                case 10: goto L_0x07d6;
                case 11: goto L_0x07c9;
                case 12: goto L_0x07bc;
                case 13: goto L_0x07af;
                case 14: goto L_0x07a2;
                case 15: goto L_0x0795;
                case 16: goto L_0x0788;
                case 17: goto L_0x0777;
                case 18: goto L_0x0767;
                case 19: goto L_0x0757;
                case 20: goto L_0x0747;
                case 21: goto L_0x0737;
                case 22: goto L_0x0727;
                case 23: goto L_0x0717;
                case 24: goto L_0x0707;
                case 25: goto L_0x06f7;
                case 26: goto L_0x06e9;
                case 27: goto L_0x06d7;
                case 28: goto L_0x06c9;
                case 29: goto L_0x06b8;
                case 30: goto L_0x06a9;
                case 31: goto L_0x069a;
                case 32: goto L_0x068b;
                case 33: goto L_0x067c;
                case 34: goto L_0x066d;
                case 35: goto L_0x065f;
                case 36: goto L_0x0651;
                case 37: goto L_0x0642;
                case 38: goto L_0x0633;
                case 39: goto L_0x0624;
                case 40: goto L_0x0615;
                case 41: goto L_0x0606;
                case 42: goto L_0x05f7;
                case 43: goto L_0x05e8;
                case 44: goto L_0x05d9;
                case 45: goto L_0x05ca;
                case 46: goto L_0x05bb;
                case 47: goto L_0x05ac;
                case 48: goto L_0x059d;
                case 49: goto L_0x058a;
                case 50: goto L_0x057b;
                case 51: goto L_0x0566;
                case 52: goto L_0x0551;
                case 53: goto L_0x0542;
                case 54: goto L_0x0533;
                case 55: goto L_0x0524;
                case 56: goto L_0x0515;
                case 57: goto L_0x0506;
                case 58: goto L_0x04f1;
                case 59: goto L_0x04e2;
                case 60: goto L_0x04cf;
                case 61: goto L_0x04be;
                case 62: goto L_0x04af;
                case 63: goto L_0x04a0;
                case 64: goto L_0x0491;
                case 65: goto L_0x0482;
                case 66: goto L_0x0473;
                case 67: goto L_0x0464;
                case 68: goto L_0x0451;
                default: goto L_0x044f;
            }
        L_0x044f:
            goto L_0x06c6
        L_0x0451:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            java.lang.Object r6 = r8.getObject(r1, r12)
            j4.y8 r12 = r0.i(r9)
            r2.l(r14, r12, r6)
            goto L_0x06c6
        L_0x0464:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            long r12 = J(r12, r1)
            r2.b(r14, r12)
            goto L_0x06c6
        L_0x0473:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            int r6 = D(r12, r1)
            r2.a(r14, r6)
            goto L_0x06c6
        L_0x0482:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            long r12 = J(r12, r1)
            r2.q(r14, r12)
            goto L_0x06c6
        L_0x0491:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            int r6 = D(r12, r1)
            r2.p(r14, r6)
            goto L_0x06c6
        L_0x04a0:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            int r6 = D(r12, r1)
            r2.h(r14, r6)
            goto L_0x06c6
        L_0x04af:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            int r6 = D(r12, r1)
            r2.c(r14, r6)
            goto L_0x06c6
        L_0x04be:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            java.lang.Object r6 = r8.getObject(r1, r12)
            j4.q6 r6 = (j4.q6) r6
            r2.f(r14, r6)
            goto L_0x06c6
        L_0x04cf:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            java.lang.Object r6 = r8.getObject(r1, r12)
            j4.y8 r12 = r0.i(r9)
            r2.o(r14, r12, r6)
            goto L_0x06c6
        L_0x04e2:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            java.lang.Object r6 = r8.getObject(r1, r12)
            y(r14, r6, r2)
            goto L_0x06c6
        L_0x04f1:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            java.lang.Object r6 = j4.t9.j(r12, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r2.e(r14, r6)
            goto L_0x06c6
        L_0x0506:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            int r6 = D(r12, r1)
            r2.i(r14, r6)
            goto L_0x06c6
        L_0x0515:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            long r12 = J(r12, r1)
            r2.j(r14, r12)
            goto L_0x06c6
        L_0x0524:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            int r6 = D(r12, r1)
            r2.m(r14, r6)
            goto L_0x06c6
        L_0x0533:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            long r12 = J(r12, r1)
            r2.d(r14, r12)
            goto L_0x06c6
        L_0x0542:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            long r12 = J(r12, r1)
            r2.n(r14, r12)
            goto L_0x06c6
        L_0x0551:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            java.lang.Object r6 = j4.t9.j(r12, r1)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r2.k(r14, r6)
            goto L_0x06c6
        L_0x0566:
            boolean r6 = r0.x(r14, r9, r1)
            if (r6 == 0) goto L_0x06c6
            java.lang.Object r6 = j4.t9.j(r12, r1)
            java.lang.Double r6 = (java.lang.Double) r6
            double r12 = r6.doubleValue()
            r2.g(r12, r14)
            goto L_0x06c6
        L_0x057b:
            java.lang.Object r6 = r8.getObject(r1, r12)
            if (r6 != 0) goto L_0x0583
            goto L_0x06c6
        L_0x0583:
            java.lang.Object r1 = r0.j(r9)
            j4.h8 r1 = (j4.h8) r1
            throw r5
        L_0x058a:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.y8 r13 = r0.i(r9)
            j4.z8.i(r6, r12, r2, r13)
            goto L_0x06c6
        L_0x059d:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.p(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x05ac:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.o(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x05bb:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.n(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x05ca:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.m(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x05d9:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.e(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x05e8:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.r(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x05f7:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.b(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x0606:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.f(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x0615:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.g(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x0624:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.j(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x0633:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.s(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x0642:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.k(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x0651:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.h(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x065f:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.d(r6, r12, r2, r7)
            goto L_0x06c6
        L_0x066d:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            r14 = 0
            j4.z8.p(r6, r12, r2, r14)
            goto L_0x06c6
        L_0x067c:
            r14 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.o(r6, r12, r2, r14)
            goto L_0x06c6
        L_0x068b:
            r14 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.n(r6, r12, r2, r14)
            goto L_0x06c6
        L_0x069a:
            r14 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.m(r6, r12, r2, r14)
            goto L_0x06c6
        L_0x06a9:
            r14 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.e(r6, r12, r2, r14)
            goto L_0x06c6
        L_0x06b8:
            r14 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.r(r6, r12, r2, r14)
        L_0x06c6:
            r15 = 0
            goto L_0x0861
        L_0x06c9:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.c(r6, r12, r2)
            goto L_0x06c6
        L_0x06d7:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.y8 r13 = r0.i(r9)
            j4.z8.l(r6, r12, r2, r13)
            goto L_0x06c6
        L_0x06e9:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.q(r6, r12, r2)
            goto L_0x06c6
        L_0x06f7:
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            r15 = 0
            j4.z8.b(r6, r12, r2, r15)
            goto L_0x0861
        L_0x0707:
            r15 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.f(r6, r12, r2, r15)
            goto L_0x0861
        L_0x0717:
            r15 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.g(r6, r12, r2, r15)
            goto L_0x0861
        L_0x0727:
            r15 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.j(r6, r12, r2, r15)
            goto L_0x0861
        L_0x0737:
            r15 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.s(r6, r12, r2, r15)
            goto L_0x0861
        L_0x0747:
            r15 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.k(r6, r12, r2, r15)
            goto L_0x0861
        L_0x0757:
            r15 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.h(r6, r12, r2, r15)
            goto L_0x0861
        L_0x0767:
            r15 = 0
            int[] r6 = r0.f8406a
            r6 = r6[r9]
            java.lang.Object r12 = r8.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            j4.z8.d(r6, r12, r2, r15)
            goto L_0x0861
        L_0x0777:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            java.lang.Object r6 = r8.getObject(r1, r12)
            j4.y8 r12 = r0.i(r9)
            r2.l(r14, r12, r6)
            goto L_0x0861
        L_0x0788:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            long r12 = r8.getLong(r1, r12)
            r2.b(r14, r12)
            goto L_0x0861
        L_0x0795:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            int r6 = r8.getInt(r1, r12)
            r2.a(r14, r6)
            goto L_0x0861
        L_0x07a2:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            long r12 = r8.getLong(r1, r12)
            r2.q(r14, r12)
            goto L_0x0861
        L_0x07af:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            int r6 = r8.getInt(r1, r12)
            r2.p(r14, r6)
            goto L_0x0861
        L_0x07bc:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            int r6 = r8.getInt(r1, r12)
            r2.h(r14, r6)
            goto L_0x0861
        L_0x07c9:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            int r6 = r8.getInt(r1, r12)
            r2.c(r14, r6)
            goto L_0x0861
        L_0x07d6:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            java.lang.Object r6 = r8.getObject(r1, r12)
            j4.q6 r6 = (j4.q6) r6
            r2.f(r14, r6)
            goto L_0x0861
        L_0x07e5:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            java.lang.Object r6 = r8.getObject(r1, r12)
            j4.y8 r12 = r0.i(r9)
            r2.o(r14, r12, r6)
            goto L_0x0861
        L_0x07f6:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            java.lang.Object r6 = r8.getObject(r1, r12)
            y(r14, r6, r2)
            goto L_0x0861
        L_0x0802:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            boolean r6 = j4.t9.v(r12, r1)
            r2.e(r14, r6)
            goto L_0x0861
        L_0x080e:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            int r6 = r8.getInt(r1, r12)
            r2.i(r14, r6)
            goto L_0x0861
        L_0x081a:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            long r12 = r8.getLong(r1, r12)
            r2.j(r14, r12)
            goto L_0x0861
        L_0x0826:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            int r6 = r8.getInt(r1, r12)
            r2.m(r14, r6)
            goto L_0x0861
        L_0x0832:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            long r12 = r8.getLong(r1, r12)
            r2.d(r14, r12)
            goto L_0x0861
        L_0x083e:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            long r12 = r8.getLong(r1, r12)
            r2.n(r14, r12)
            goto L_0x0861
        L_0x084a:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            float r6 = j4.t9.f(r12, r1)
            r2.k(r14, r6)
            goto L_0x0861
        L_0x0856:
            r15 = 0
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0861
            double r12 = j4.t9.e(r12, r1)
            r2.g(r12, r14)
        L_0x0861:
            int r9 = r9 + 3
            r6 = r15
            goto L_0x0424
        L_0x0866:
            j4.j9 r3 = r0.f8416l
            j4.k9 r1 = r3.d(r1)
            r3.i(r1, r2)
            return
        L_0x0870:
            j4.z6 r2 = r0.f8417m
            r2.a(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q8.g(java.lang.Object, j4.v6):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x034b, code lost:
        if (r0 != r14) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014f, code lost:
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0152, code lost:
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016e, code lost:
        r7.putObject(r14, r8, r11.f8235c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0174, code lost:
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0175, code lost:
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a9, code lost:
        r1 = r19 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d8, code lost:
        r1 = r11.f8233a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01da, code lost:
        r7.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0211, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0212, code lost:
        r1 = r0;
        r0 = r19 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0219, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021a, code lost:
        r5 = r6;
        r8 = r10;
        r6 = r0;
        r0 = r13;
        r13 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0221, code lost:
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x023f, code lost:
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
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x024d, code lost:
        r2 = r4;
        r29 = r7;
        r15 = r14;
        r26 = r19;
        r17 = -1;
        r18 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.Object r32, byte[] r33, int r34, int r35, j4.i6 r36) {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            boolean r0 = r15.f8412g
            if (r0 == 0) goto L_0x039b
            n(r32)
            sun.misc.Unsafe r9 = f8405o
            r10 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r7 = -1
            r0 = r34
            r1 = r7
            r5 = r8
            r2 = r10
            r6 = r2
        L_0x001e:
            if (r0 >= r13) goto L_0x0381
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = j4.j6.j(r0, r12, r3, r11)
            int r3 = r11.f8233a
            r4 = r0
            r16 = r3
            goto L_0x0033
        L_0x0030:
            r16 = r0
            r4 = r3
        L_0x0033:
            int r3 = r16 >>> 3
            if (r3 <= r1) goto L_0x0046
            int r2 = r2 / 3
            int r0 = r15.f8408c
            if (r3 < r0) goto L_0x0053
            int r0 = r15.f8409d
            if (r3 > r0) goto L_0x0053
            int r0 = r15.H(r3, r2)
            goto L_0x0054
        L_0x0046:
            int r0 = r15.f8408c
            if (r3 < r0) goto L_0x0053
            int r0 = r15.f8409d
            if (r3 > r0) goto L_0x0053
            int r0 = r15.H(r3, r10)
            goto L_0x0054
        L_0x0053:
            r0 = r7
        L_0x0054:
            r2 = r0
            if (r2 != r7) goto L_0x0066
            r23 = r3
            r2 = r4
            r26 = r6
            r17 = r7
            r29 = r9
            r18 = r10
            r15 = r14
            r6 = r5
            goto L_0x0357
        L_0x0066:
            r1 = r16 & 7
            int[] r0 = r15.f8406a
            int r17 = r2 + 1
            r10 = r0[r17]
            int r7 = r10 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r34 = r3
            r3 = r10 & r8
            r19 = r9
            long r8 = (long) r3
            r3 = 17
            if (r7 > r3) goto L_0x0259
            int r3 = r2 + 2
            r0 = r0[r3]
            int r3 = r0 >>> 20
            r13 = 1
            int r22 = r13 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            r20 = r4
            if (r0 == r5) goto L_0x00a9
            if (r5 == r3) goto L_0x009a
            long r3 = (long) r5
            r5 = r19
            r5.putInt(r14, r3, r6)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x009c
        L_0x009a:
            r5 = r19
        L_0x009c:
            if (r0 == r3) goto L_0x00a4
            long r3 = (long) r0
            int r3 = r5.getInt(r14, r3)
            r6 = r3
        L_0x00a4:
            r4 = r5
            r19 = r6
            r6 = r0
            goto L_0x00ae
        L_0x00a9:
            r4 = r19
            r19 = r6
            r6 = r5
        L_0x00ae:
            r0 = 5
            switch(r7) {
                case 0: goto L_0x0223;
                case 1: goto L_0x01f9;
                case 2: goto L_0x01de;
                case 3: goto L_0x01de;
                case 4: goto L_0x01c9;
                case 5: goto L_0x01ad;
                case 6: goto L_0x0195;
                case 7: goto L_0x0178;
                case 8: goto L_0x0154;
                case 9: goto L_0x012b;
                case 10: goto L_0x0119;
                case 11: goto L_0x01c9;
                case 12: goto L_0x0106;
                case 13: goto L_0x0195;
                case 14: goto L_0x01ad;
                case 15: goto L_0x00ed;
                case 16: goto L_0x00bd;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            r23 = r34
            r10 = r2
            r7 = r4
            r4 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x024d
        L_0x00bd:
            if (r1 != 0) goto L_0x00e2
            r5 = r20
            int r7 = j4.j6.l(r12, r5, r11)
            long r0 = r11.f8234b
            long r20 = j4.r6.b(r0)
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
            goto L_0x0219
        L_0x00e2:
            r23 = r34
            r13 = r2
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            goto L_0x0174
        L_0x00ed:
            r23 = r34
            r13 = r2
            r10 = r4
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != 0) goto L_0x0152
            int r0 = j4.j6.i(r12, r5, r11)
            int r1 = r11.f8233a
            int r1 = j4.r6.a(r1)
            r7 = r10
            r10 = r13
            goto L_0x01da
        L_0x0106:
            r23 = r34
            r13 = r2
            r10 = r4
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != 0) goto L_0x0152
            int r0 = j4.j6.i(r12, r5, r11)
            r7 = r10
            r10 = r13
            goto L_0x01d8
        L_0x0119:
            r23 = r34
            r13 = r2
            r10 = r4
            r5 = r20
            r0 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != r0) goto L_0x0152
            int r0 = j4.j6.a(r12, r5, r11)
            r7 = r10
            goto L_0x016e
        L_0x012b:
            r23 = r34
            r13 = r2
            r10 = r4
            r5 = r20
            r0 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != r0) goto L_0x0152
            java.lang.Object r7 = r15.k(r13, r14)
            j4.y8 r1 = r15.i(r13)
            r0 = r7
            r2 = r33
            r3 = r5
            r4 = r35
            r5 = r36
            int r0 = j4.j6.n(r0, r1, r2, r3, r4, r5)
            r15.s(r14, r13, r7)
            r7 = r10
        L_0x014f:
            r10 = r13
            goto L_0x0212
        L_0x0152:
            r7 = r10
            goto L_0x0174
        L_0x0154:
            r23 = r34
            r13 = r2
            r7 = r4
            r5 = r20
            r0 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != r0) goto L_0x0174
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r10
            if (r0 != 0) goto L_0x016a
            int r0 = j4.j6.f(r12, r5, r11)
            goto L_0x016e
        L_0x016a:
            int r0 = j4.j6.g(r12, r5, r11)
        L_0x016e:
            java.lang.Object r1 = r11.f8235c
            r7.putObject(r14, r8, r1)
            goto L_0x014f
        L_0x0174:
            r10 = r13
        L_0x0175:
            r13 = r5
            goto L_0x0221
        L_0x0178:
            r23 = r34
            r10 = r2
            r7 = r4
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != 0) goto L_0x0175
            int r0 = j4.j6.l(r12, r5, r11)
            long r1 = r11.f8234b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0190
            goto L_0x0191
        L_0x0190:
            r13 = 0
        L_0x0191:
            j4.t9.m(r14, r8, r13)
            goto L_0x01a9
        L_0x0195:
            r23 = r34
            r10 = r2
            r7 = r4
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != r0) goto L_0x0175
            int r0 = j4.j6.b(r5, r12)
            r7.putInt(r14, r8, r0)
            int r0 = r5 + 4
        L_0x01a9:
            r1 = r19 | r22
            goto L_0x023f
        L_0x01ad:
            r23 = r34
            r10 = r2
            r7 = r4
            r5 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != r13) goto L_0x0175
            long r20 = j4.j6.o(r5, r12)
            r0 = r7
            r1 = r32
            r2 = r8
            r13 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r4 = r13 + 8
            goto L_0x0211
        L_0x01c9:
            r23 = r34
            r10 = r2
            r7 = r4
            r13 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != 0) goto L_0x0221
            int r0 = j4.j6.i(r12, r13, r11)
        L_0x01d8:
            int r1 = r11.f8233a
        L_0x01da:
            r7.putInt(r14, r8, r1)
            goto L_0x0212
        L_0x01de:
            r23 = r34
            r10 = r2
            r7 = r4
            r13 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != 0) goto L_0x0221
            int r13 = j4.j6.l(r12, r13, r11)
            long r4 = r11.f8234b
            r0 = r7
            r1 = r32
            r2 = r8
            r0.putLong(r1, r2, r4)
            r0 = r19 | r22
            goto L_0x021a
        L_0x01f9:
            r23 = r34
            r10 = r2
            r7 = r4
            r13 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != r0) goto L_0x0221
            int r0 = j4.j6.b(r13, r12)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            j4.t9.o(r14, r8, r0)
            int r4 = r13 + 4
        L_0x0211:
            r0 = r4
        L_0x0212:
            r1 = r19 | r22
            r30 = r1
            r1 = r0
            r0 = r30
        L_0x0219:
            r13 = r1
        L_0x021a:
            r5 = r6
            r8 = r10
            r6 = r0
            r0 = r13
            r13 = r7
            goto L_0x029d
        L_0x0221:
            r4 = r13
            goto L_0x024d
        L_0x0223:
            r23 = r34
            r10 = r2
            r7 = r4
            r4 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != r13) goto L_0x024d
            long r0 = j4.j6.o(r4, r12)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            j4.t9.n(r14, r8, r0)
            int r4 = r4 + 8
            r0 = r19 | r22
            r1 = r0
            r0 = r4
        L_0x023f:
            r13 = r35
            r5 = r6
            r9 = r7
            r2 = r10
            r8 = r24
            r7 = -1
            r10 = 0
            r6 = r1
            r1 = r23
            goto L_0x001e
        L_0x024d:
            r2 = r4
            r29 = r7
            r15 = r14
            r26 = r19
            r17 = -1
            r18 = 0
            goto L_0x0357
        L_0x0259:
            r23 = r34
            r3 = r2
            r13 = r19
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r7 != r0) goto L_0x02b8
            r0 = 2
            if (r1 != r0) goto L_0x02a9
            java.lang.Object r0 = r13.getObject(r14, r8)
            j4.r7 r0 = (j4.r7) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0285
            int r1 = r0.size()
            if (r1 != 0) goto L_0x027d
            r1 = 10
            goto L_0x027e
        L_0x027d:
            int r1 = r1 + r1
        L_0x027e:
            j4.r7 r0 = r0.c(r1)
            r13.putObject(r14, r8, r0)
        L_0x0285:
            r7 = r0
            j4.y8 r0 = r15.i(r3)
            r1 = r16
            r2 = r33
            r8 = r3
            r3 = r4
            r4 = r35
            r9 = r5
            r5 = r7
            r7 = r6
            r6 = r36
            int r0 = j4.j6.d(r0, r1, r2, r3, r4, r5, r6)
            r6 = r7
            r5 = r9
        L_0x029d:
            r2 = r8
            r9 = r13
            r1 = r23
            r8 = r24
            r7 = -1
            r10 = 0
            r13 = r35
            goto L_0x001e
        L_0x02a9:
            r34 = r3
            r15 = r4
            r25 = r5
            r26 = r6
            r29 = r13
            r17 = -1
            r18 = 0
            goto L_0x0315
        L_0x02b8:
            r0 = 49
            if (r7 > r0) goto L_0x02fa
            r19 = r8
            long r9 = (long) r10
            r0 = r31
            r8 = r1
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
            r7 = r8
            r27 = r19
            r8 = r34
            r18 = 0
            r11 = r22
            r29 = r13
            r12 = r27
            r14 = r36
            int r0 = r0.G(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02f3
            r15 = r32
            r19 = r34
            goto L_0x034d
        L_0x02f3:
            r15 = r32
            r19 = r34
        L_0x02f7:
            r4 = r0
            goto L_0x0352
        L_0x02fa:
            r34 = r3
            r15 = r4
            r25 = r5
            r26 = r6
            r22 = r7
            r27 = r8
            r29 = r13
            r17 = -1
            r18 = 0
            r8 = r1
            r0 = 50
            r9 = r22
            if (r9 != r0) goto L_0x0328
            r0 = 2
            if (r8 == r0) goto L_0x031b
        L_0x0315:
            r19 = r34
            r4 = r15
            r15 = r32
            goto L_0x0352
        L_0x031b:
            r14 = r31
            r15 = r32
            r13 = r34
            r11 = r27
            r14.E(r15, r13, r11)
            r0 = 0
            throw r0
        L_0x0328:
            r14 = r31
            r13 = r34
            r7 = r15
            r11 = r27
            r15 = r32
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r7
            r4 = r35
            r5 = r16
            r6 = r23
            r14 = r7
            r7 = r8
            r8 = r10
            r10 = r11
            r12 = r13
            r19 = r13
            r13 = r36
            int r0 = r0.F(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02f7
        L_0x034d:
            r2 = r19
            r5 = r25
            goto L_0x0369
        L_0x0352:
            r2 = r4
            r10 = r19
            r6 = r25
        L_0x0357:
            j4.k9 r4 = A(r32)
            r0 = r16
            r1 = r33
            r3 = r35
            r5 = r36
            int r0 = j4.j6.h(r0, r1, r2, r3, r4, r5)
            r5 = r6
            r2 = r10
        L_0x0369:
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
            goto L_0x001e
        L_0x0381:
            r26 = r6
            r1 = r8
            r29 = r9
            r15 = r14
            if (r5 == r1) goto L_0x0391
            long r1 = (long) r5
            r6 = r26
            r3 = r29
            r3.putInt(r15, r1, r6)
        L_0x0391:
            r4 = r35
            if (r0 != r4) goto L_0x0396
            return
        L_0x0396:
            j4.u7 r0 = j4.u7.c()
            throw r0
        L_0x039b:
            r4 = r13
            r15 = r14
            r5 = 0
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r6 = r36
            r0.z(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q8.h(java.lang.Object, byte[], int, int, j4.i6):void");
    }

    public final y8 i(int i10) {
        Object[] objArr = this.f8407b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        y8 y8Var = (y8) objArr[i12];
        if (y8Var != null) {
            return y8Var;
        }
        y8 a10 = v8.f8521c.a((Class) objArr[i12 + 1]);
        this.f8407b[i12] = a10;
        return a10;
    }

    public final Object j(int i10) {
        int i11 = i10 / 3;
        return this.f8407b[i11 + i11];
    }

    public final Object k(int i10, Object obj) {
        y8 i11 = i(i10);
        int I = I(i10) & 1048575;
        if (!v(i10, obj)) {
            return i11.zze();
        }
        Object object = f8405o.getObject(obj, (long) I);
        if (w(object)) {
            return object;
        }
        m7 zze = i11.zze();
        if (object != null) {
            i11.c(zze, object);
        }
        return zze;
    }

    public final Object l(int i10, int i11, Object obj) {
        y8 i12 = i(i11);
        if (!x(i10, i11, obj)) {
            return i12.zze();
        }
        Object object = f8405o.getObject(obj, (long) (I(i11) & 1048575));
        if (w(object)) {
            return object;
        }
        m7 zze = i12.zze();
        if (object != null) {
            i12.c(zze, object);
        }
        return zze;
    }

    public final void o(Object obj, int i10, Object obj2) {
        if (v(i10, obj2)) {
            Unsafe unsafe = f8405o;
            long I = (long) (I(i10) & 1048575);
            Object object = unsafe.getObject(obj2, I);
            if (object != null) {
                y8 i11 = i(i10);
                if (!v(i10, obj)) {
                    if (!w(object)) {
                        unsafe.putObject(obj, I, object);
                    } else {
                        m7 zze = i11.zze();
                        i11.c(zze, object);
                        unsafe.putObject(obj, I, zze);
                    }
                    q(i10, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, I);
                if (!w(object2)) {
                    m7 zze2 = i11.zze();
                    i11.c(zze2, object2);
                    unsafe.putObject(obj, I, zze2);
                    object2 = zze2;
                }
                i11.c(object2, object);
                return;
            }
            int i12 = this.f8406a[i10];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i12 + " is present but null: " + obj3);
        }
    }

    public final void p(Object obj, int i10, Object obj2) {
        int i11 = this.f8406a[i10];
        if (x(i11, i10, obj2)) {
            Unsafe unsafe = f8405o;
            long I = (long) (I(i10) & 1048575);
            Object object = unsafe.getObject(obj2, I);
            if (object != null) {
                y8 i12 = i(i10);
                if (!x(i11, i10, obj)) {
                    if (!w(object)) {
                        unsafe.putObject(obj, I, object);
                    } else {
                        m7 zze = i12.zze();
                        i12.c(zze, object);
                        unsafe.putObject(obj, I, zze);
                    }
                    r(i11, i10, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, I);
                if (!w(object2)) {
                    m7 zze2 = i12.zze();
                    i12.c(zze2, object2);
                    unsafe.putObject(obj, I, zze2);
                    object2 = zze2;
                }
                i12.c(object2, object);
                return;
            }
            int i13 = this.f8406a[i10];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i13 + " is present but null: " + obj3);
        }
    }

    public final void q(int i10, Object obj) {
        int i11 = this.f8406a[i10 + 2];
        long j10 = (long) (1048575 & i11);
        if (j10 != 1048575) {
            t9.p((1 << (i11 >>> 20)) | t9.g(j10, obj), j10, obj);
        }
    }

    public final void r(int i10, int i11, Object obj) {
        t9.p(i10, (long) (this.f8406a[i11 + 2] & 1048575), obj);
    }

    public final void s(Object obj, int i10, Object obj2) {
        f8405o.putObject(obj, (long) (I(i10) & 1048575), obj2);
        q(i10, obj);
    }

    public final void t(Object obj, int i10, int i11, Object obj2) {
        f8405o.putObject(obj, (long) (I(i11) & 1048575), obj2);
        r(i10, i11, obj);
    }

    public final boolean u(Object obj, int i10, Object obj2) {
        return v(i10, obj) == v(i10, obj2);
    }

    public final boolean v(int i10, Object obj) {
        int i11 = this.f8406a[i10 + 2];
        long j10 = (long) (i11 & 1048575);
        if (j10 == 1048575) {
            int I = I(i10);
            long j11 = (long) (I & 1048575);
            switch ((I >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(t9.e(j11, obj)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(t9.f(j11, obj)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (t9.h(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (t9.h(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (t9.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (t9.h(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (t9.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return t9.v(j11, obj);
                case 8:
                    Object j12 = t9.j(j11, obj);
                    if (j12 instanceof String) {
                        if (!((String) j12).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(j12 instanceof q6)) {
                        throw new IllegalArgumentException();
                    } else if (!q6.f8402b.equals(j12)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (t9.j(j11, obj) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!q6.f8402b.equals(t9.j(j11, obj))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (t9.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (t9.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (t9.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (t9.h(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (t9.g(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (t9.h(j11, obj) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (t9.j(j11, obj) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & t9.g(j10, obj)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean x(int i10, int i11, Object obj) {
        if (t9.g((long) (this.f8406a[i11 + 2] & 1048575), obj) == i10) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v56, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0295, code lost:
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0297, code lost:
        r0 = r1;
        r10 = r8;
        r6 = r19;
        r13 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x029f, code lost:
        r6 = r36;
        r23 = r4;
        r2 = r5;
        r9 = r8;
        r29 = r11;
        r7 = r13;
        r14 = r15;
        r27 = r17;
        r8 = r21;
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x035a, code lost:
        if (r0 != r15) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b9, code lost:
        if (r0 != r15) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03cd, code lost:
        r6 = r36;
        r2 = r0;
        r9 = r17;
        r8 = r22;
        r7 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00df, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013c, code lost:
        r21 = r0;
        r6 = r3;
        r19 = r7;
        r8 = r24;
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0158, code lost:
        r21 = r0;
        r8 = r3;
        r5 = r4;
        r19 = r7;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ac, code lost:
        r11.putObject(r14, r24, r7.f8235c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b3, code lost:
        r21 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d6, code lost:
        r5 = r4;
        r21 = r8;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022b, code lost:
        r11.putInt(r14, r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0246, code lost:
        r11.putLong(r32, r8, r4);
        r0 = r13 | r10;
        r8 = r6;
        r5 = r7;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026d, code lost:
        r4 = r5 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0270, code lost:
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0271, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x028c, code lost:
        r4 = r5 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x028e, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x028f, code lost:
        r0 = r13 | r10;
        r8 = r6;
        r5 = r7;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v7, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03d8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int z(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, j4.i6 r37) {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            n(r32)
            sun.misc.Unsafe r11 = f8405o
            r9 = 0
            r0 = r34
            r1 = r36
            r5 = r37
            r3 = r9
            r4 = r3
            r7 = r4
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001b:
            r16 = 0
            if (r0 >= r13) goto L_0x043c
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = j4.j6.j(r0, r12, r4, r5)
            int r4 = r5.f8233a
            r30 = r4
            r4 = r0
            r0 = r30
        L_0x0030:
            int r10 = r0 >>> 3
            r8 = 3
            if (r10 <= r2) goto L_0x0043
            int r3 = r3 / r8
            int r2 = r15.f8408c
            if (r10 < r2) goto L_0x0050
            int r2 = r15.f8409d
            if (r10 > r2) goto L_0x0050
            int r2 = r15.H(r10, r3)
            goto L_0x0051
        L_0x0043:
            int r2 = r15.f8408c
            if (r10 < r2) goto L_0x0050
            int r2 = r15.f8409d
            if (r10 > r2) goto L_0x0050
            int r2 = r15.H(r10, r9)
            goto L_0x0051
        L_0x0050:
            r2 = -1
        L_0x0051:
            r3 = r2
            r2 = -1
            if (r3 != r2) goto L_0x0067
            r8 = r0
            r18 = r2
            r2 = r4
            r19 = r6
            r20 = r9
            r27 = r10
            r29 = r11
            r14 = r15
            r23 = 1
            r6 = r1
            goto L_0x03d6
        L_0x0067:
            r1 = r0 & 7
            int[] r2 = r15.f8406a
            int r19 = r3 + 1
            r9 = r2[r19]
            int r8 = r9 >>> 20
            r8 = r8 & 255(0xff, float:3.57E-43)
            r17 = r10
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r9 & r13
            long r13 = (long) r10
            r10 = 17
            r22 = r13
            if (r8 > r10) goto L_0x02b1
            int r10 = r3 + 2
            r2 = r2[r10]
            int r10 = r2 >>> 20
            r14 = 1
            int r10 = r14 << r10
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r14
            if (r2 == r6) goto L_0x00a8
            if (r6 == r14) goto L_0x009b
            long r13 = (long) r6
            r6 = r32
            r24 = r22
            r11.putInt(r6, r13, r7)
            goto L_0x009f
        L_0x009b:
            r6 = r32
            r24 = r22
        L_0x009f:
            long r13 = (long) r2
            int r7 = r11.getInt(r6, r13)
            r14 = r6
            r13 = r7
            r7 = r2
            goto L_0x00ae
        L_0x00a8:
            r14 = r32
            r24 = r22
            r13 = r7
            r7 = r6
        L_0x00ae:
            r2 = 5
            switch(r8) {
                case 0: goto L_0x0273;
                case 1: goto L_0x0255;
                case 2: goto L_0x0230;
                case 3: goto L_0x0230;
                case 4: goto L_0x0218;
                case 5: goto L_0x01f5;
                case 6: goto L_0x01dc;
                case 7: goto L_0x01b7;
                case 8: goto L_0x0194;
                case 9: goto L_0x0163;
                case 10: goto L_0x0148;
                case 11: goto L_0x0218;
                case 12: goto L_0x010a;
                case 13: goto L_0x01dc;
                case 14: goto L_0x01f5;
                case 15: goto L_0x00fd;
                case 16: goto L_0x00e2;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            r21 = r0
            r6 = r3
            r5 = r4
            r19 = r7
            r0 = 3
            r4 = 1
            r18 = -1
            if (r1 != r0) goto L_0x0295
            java.lang.Object r7 = r15.k(r6, r14)
            int r0 = r17 << 3
            r8 = r0 | 4
            j4.y8 r1 = r15.i(r6)
            r0 = r7
            r2 = r33
            r3 = r5
            r4 = r35
            r5 = r8
            r8 = r6
            r6 = r37
            int r1 = j4.j6.m(r0, r1, r2, r3, r4, r5, r6)
            r15.s(r14, r8, r7)
            r0 = r13 | r10
            r5 = r37
        L_0x00df:
            r7 = r0
            goto L_0x0297
        L_0x00e2:
            if (r1 != 0) goto L_0x0158
            int r1 = j4.j6.l(r12, r4, r5)
            long r8 = r5.f8234b
            long r8 = j4.r6.b(r8)
            r21 = r0
            r16 = r1
            r6 = r3
            r19 = r7
            r18 = -1
            r7 = r5
            r4 = r8
            r8 = r24
            goto L_0x0246
        L_0x00fd:
            if (r1 != 0) goto L_0x0158
            int r1 = j4.j6.i(r12, r4, r5)
            int r2 = r5.f8233a
            int r2 = j4.r6.a(r2)
            goto L_0x013c
        L_0x010a:
            if (r1 != 0) goto L_0x0158
            int r1 = j4.j6.i(r12, r4, r5)
            int r2 = r5.f8233a
            int r4 = r3 / 3
            int r4 = r4 + r4
            java.lang.Object[] r6 = r15.f8407b
            r8 = 1
            int r4 = r4 + r8
            r4 = r6[r4]
            j4.o7 r4 = (j4.o7) r4
            if (r4 == 0) goto L_0x013c
            boolean r4 = r4.zza(r2)
            if (r4 == 0) goto L_0x0126
            goto L_0x013c
        L_0x0126:
            j4.k9 r4 = A(r32)
            long r8 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r4.c(r0, r2)
            r21 = r0
            r8 = r3
            r19 = r7
            r7 = r13
            r18 = -1
            goto L_0x0297
        L_0x013c:
            r21 = r0
            r6 = r3
            r19 = r7
            r8 = r24
            r18 = -1
            r7 = r5
            goto L_0x022b
        L_0x0148:
            r2 = 2
            if (r1 != r2) goto L_0x0158
            int r1 = j4.j6.a(r12, r4, r5)
            r8 = r0
            r6 = r3
            r19 = r7
            r18 = -1
            r7 = r5
            goto L_0x01ac
        L_0x0158:
            r21 = r0
            r8 = r3
            r5 = r4
            r19 = r7
            r4 = 1
            r18 = -1
            goto L_0x029f
        L_0x0163:
            r2 = 2
            if (r1 != r2) goto L_0x018a
            java.lang.Object r6 = r15.k(r3, r14)
            j4.y8 r1 = r15.i(r3)
            r8 = r0
            r0 = r6
            r18 = -1
            r2 = r33
            r9 = r3
            r3 = r4
            r4 = r35
            r19 = r7
            r7 = r5
            r5 = r37
            int r0 = j4.j6.n(r0, r1, r2, r3, r4, r5)
            r15.s(r14, r9, r6)
            r1 = r0
            r21 = r8
            r6 = r9
            goto L_0x028f
        L_0x018a:
            r19 = r7
            r18 = -1
            r21 = r0
            r8 = r3
            r5 = r4
            goto L_0x0271
        L_0x0194:
            r8 = r0
            r6 = r3
            r19 = r7
            r0 = 2
            r18 = -1
            r7 = r5
            if (r1 != r0) goto L_0x01d6
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r9
            if (r0 != 0) goto L_0x01a8
            int r1 = j4.j6.f(r12, r4, r7)
            goto L_0x01ac
        L_0x01a8:
            int r1 = j4.j6.g(r12, r4, r7)
        L_0x01ac:
            java.lang.Object r0 = r7.f8235c
            r2 = r24
            r11.putObject(r14, r2, r0)
        L_0x01b3:
            r21 = r8
            goto L_0x028f
        L_0x01b7:
            r8 = r0
            r6 = r3
            r19 = r7
            r2 = r24
            r18 = -1
            r7 = r5
            if (r1 != 0) goto L_0x01d6
            int r0 = j4.j6.l(r12, r4, r7)
            long r4 = r7.f8234b
            r21 = 0
            int r1 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r1 == 0) goto L_0x01d0
            r1 = 1
            goto L_0x01d1
        L_0x01d0:
            r1 = 0
        L_0x01d1:
            j4.t9.m(r14, r2, r1)
            r1 = r0
            goto L_0x01b3
        L_0x01d6:
            r5 = r4
            r21 = r8
            r4 = 1
            goto L_0x0295
        L_0x01dc:
            r21 = r0
            r6 = r3
            r19 = r7
            r8 = r24
            r18 = -1
            r7 = r5
            if (r1 != r2) goto L_0x01f2
            int r0 = j4.j6.b(r4, r12)
            r11.putInt(r14, r8, r0)
            r5 = r4
            goto L_0x026d
        L_0x01f2:
            r5 = r4
            goto L_0x0270
        L_0x01f5:
            r21 = r0
            r6 = r3
            r19 = r7
            r8 = r24
            r0 = 1
            r18 = -1
            r7 = r5
            if (r1 != r0) goto L_0x0213
            long r22 = j4.j6.o(r4, r12)
            r0 = r11
            r1 = r32
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            r5 = r8
            goto L_0x028c
        L_0x0213:
            r5 = r4
            r8 = r6
            r4 = r0
            goto L_0x029f
        L_0x0218:
            r21 = r0
            r6 = r3
            r19 = r7
            r8 = r24
            r18 = -1
            r7 = r5
            r5 = r4
            if (r1 != 0) goto L_0x0270
            int r1 = j4.j6.i(r12, r5, r7)
            int r2 = r7.f8233a
        L_0x022b:
            r11.putInt(r14, r8, r2)
            goto L_0x028f
        L_0x0230:
            r21 = r0
            r6 = r3
            r19 = r7
            r8 = r24
            r18 = -1
            r7 = r5
            r5 = r4
            if (r1 != 0) goto L_0x0270
            int r1 = j4.j6.l(r12, r5, r7)
            long r2 = r7.f8234b
            r16 = r1
            r4 = r2
        L_0x0246:
            r0 = r11
            r1 = r32
            r2 = r8
            r0.putLong(r1, r2, r4)
            r0 = r13 | r10
            r8 = r6
            r5 = r7
            r1 = r16
            goto L_0x00df
        L_0x0255:
            r21 = r0
            r6 = r3
            r19 = r7
            r8 = r24
            r18 = -1
            r7 = r5
            r5 = r4
            if (r1 != r2) goto L_0x0270
            int r0 = j4.j6.b(r5, r12)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            j4.t9.o(r14, r8, r0)
        L_0x026d:
            int r4 = r5 + 4
            goto L_0x028e
        L_0x0270:
            r8 = r6
        L_0x0271:
            r4 = 1
            goto L_0x029f
        L_0x0273:
            r21 = r0
            r6 = r3
            r19 = r7
            r8 = r24
            r18 = -1
            r7 = r5
            r5 = r4
            r4 = 1
            if (r1 != r4) goto L_0x0295
            long r0 = j4.j6.o(r5, r12)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            j4.t9.n(r14, r8, r0)
        L_0x028c:
            int r4 = r5 + 8
        L_0x028e:
            r1 = r4
        L_0x028f:
            r0 = r13 | r10
            r8 = r6
            r5 = r7
            goto L_0x00df
        L_0x0295:
            r8 = r6
            goto L_0x029f
        L_0x0297:
            r0 = r1
            r10 = r8
            r6 = r19
            r13 = r21
            goto L_0x02f9
        L_0x029f:
            r6 = r36
            r23 = r4
            r2 = r5
            r9 = r8
            r29 = r11
            r7 = r13
            r14 = r15
            r27 = r17
            r8 = r21
            r20 = 0
            goto L_0x03d6
        L_0x02b1:
            r14 = r32
            r13 = r0
            r10 = r3
            r5 = r4
            r2 = r8
            r3 = r9
            r8 = r22
            r4 = 1
            r18 = -1
            r0 = 27
            if (r2 != r0) goto L_0x0317
            r0 = 2
            if (r1 != r0) goto L_0x0304
            java.lang.Object r0 = r11.getObject(r14, r8)
            j4.r7 r0 = (j4.r7) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x02e1
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02d9
            r1 = 10
            goto L_0x02da
        L_0x02d9:
            int r1 = r1 + r1
        L_0x02da:
            j4.r7 r0 = r0.c(r1)
            r11.putObject(r14, r8, r0)
        L_0x02e1:
            r8 = r0
            j4.y8 r0 = r15.i(r10)
            r1 = r13
            r2 = r33
            r3 = r5
            r4 = r35
            r5 = r8
            r19 = r6
            r6 = r37
            int r0 = j4.j6.d(r0, r1, r2, r3, r4, r5, r6)
            r5 = r37
            r6 = r19
        L_0x02f9:
            r1 = r36
            r3 = r10
            r4 = r13
            r2 = r17
            r9 = 0
            r13 = r35
            goto L_0x001b
        L_0x0304:
            r19 = r6
            r23 = r4
            r15 = r5
            r24 = r7
            r28 = r10
            r29 = r11
            r22 = r13
            r27 = r17
            r20 = 0
            goto L_0x037e
        L_0x0317:
            r19 = r6
            r0 = 49
            if (r2 > r0) goto L_0x035e
            r22 = r11
            long r11 = (long) r3
            r0 = r31
            r6 = r1
            r1 = r32
            r21 = r2
            r2 = r33
            r3 = r5
            r23 = r4
            r4 = r35
            r15 = r5
            r5 = r13
            r34 = r6
            r6 = r17
            r24 = r7
            r7 = r34
            r25 = r8
            r9 = r21
            r8 = r10
            r28 = r10
            r27 = r17
            r20 = 0
            r17 = r9
            r9 = r11
            r12 = r22
            r11 = r17
            r29 = r12
            r22 = r13
            r12 = r25
            r14 = r37
            int r0 = r0.G(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r31
            r17 = r28
            if (r0 == r15) goto L_0x03cd
            goto L_0x03bb
        L_0x035e:
            r34 = r1
            r23 = r4
            r15 = r5
            r24 = r7
            r25 = r8
            r28 = r10
            r29 = r11
            r22 = r13
            r27 = r17
            r20 = 0
            r17 = r2
            r0 = 50
            r9 = r17
            if (r9 != r0) goto L_0x0396
            r7 = r34
            r0 = 2
            if (r7 == r0) goto L_0x038a
        L_0x037e:
            r14 = r31
            r6 = r36
            r2 = r15
            r8 = r22
            r7 = r24
            r9 = r28
            goto L_0x03d6
        L_0x038a:
            r14 = r31
            r15 = r32
            r10 = r25
            r13 = r28
            r14.E(r15, r13, r10)
            throw r16
        L_0x0396:
            r14 = r31
            r7 = r34
            r12 = r15
            r10 = r25
            r13 = r28
            r15 = r32
            r0 = r31
            r1 = r32
            r2 = r33
            r8 = r3
            r3 = r12
            r4 = r35
            r5 = r22
            r6 = r27
            r15 = r12
            r12 = r13
            r17 = r13
            r13 = r37
            int r0 = r0.F(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03cd
        L_0x03bb:
            r12 = r32
            r1 = r36
            r10 = r37
            r3 = r17
            r6 = r19
            r8 = r22
            r7 = r24
            r11 = r27
            goto L_0x042d
        L_0x03cd:
            r6 = r36
            r2 = r0
            r9 = r17
            r8 = r22
            r7 = r24
        L_0x03d6:
            if (r8 != r6) goto L_0x03e3
            if (r6 == 0) goto L_0x03e3
            r12 = r32
            r0 = r2
            r1 = r6
            r4 = r8
            r6 = r19
            goto L_0x0446
        L_0x03e3:
            boolean r0 = r14.f8411f
            if (r0 == 0) goto L_0x0414
            r10 = r37
            j4.y6 r0 = r10.f8236d
            j4.y6 r1 = j4.y6.f8568c
            if (r0 == r1) goto L_0x0411
            j4.n8 r1 = r14.f8410e
            r11 = r27
            j4.k7 r0 = r0.a(r1, r11)
            if (r0 != 0) goto L_0x040b
            j4.k9 r4 = A(r32)
            r0 = r8
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = j4.j6.h(r0, r1, r2, r3, r4, r5)
            r12 = r32
            goto L_0x0429
        L_0x040b:
            r12 = r32
            r0 = r12
            j4.j7 r0 = (j4.j7) r0
            throw r16
        L_0x0411:
            r12 = r32
            goto L_0x0418
        L_0x0414:
            r12 = r32
            r10 = r37
        L_0x0418:
            r11 = r27
            j4.k9 r4 = A(r32)
            r0 = r8
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = j4.j6.h(r0, r1, r2, r3, r4, r5)
        L_0x0429:
            r1 = r6
            r3 = r9
            r6 = r19
        L_0x042d:
            r13 = r35
            r4 = r8
            r5 = r10
            r2 = r11
            r15 = r14
            r9 = r20
            r11 = r29
            r14 = r12
            r12 = r33
            goto L_0x001b
        L_0x043c:
            r19 = r6
            r24 = r7
            r29 = r11
            r12 = r14
            r14 = r15
            r23 = 1
        L_0x0446:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x0451
            long r5 = (long) r6
            r3 = r29
            r3.putInt(r12, r5, r7)
        L_0x0451:
            int r3 = r14.f8414i
        L_0x0453:
            int r5 = r14.f8415j
            if (r3 >= r5) goto L_0x0485
            int[] r5 = r14.f8413h
            r5 = r5[r3]
            int[] r6 = r14.f8406a
            r6 = r6[r5]
            int r6 = r14.I(r5)
            r6 = r6 & r2
            long r6 = (long) r6
            java.lang.Object r6 = j4.t9.j(r6, r12)
            if (r6 != 0) goto L_0x046c
            goto L_0x0479
        L_0x046c:
            int r7 = r5 / 3
            int r7 = r7 + r7
            java.lang.Object[] r8 = r14.f8407b
            int r7 = r7 + 1
            r7 = r8[r7]
            j4.o7 r7 = (j4.o7) r7
            if (r7 != 0) goto L_0x047c
        L_0x0479:
            int r3 = r3 + 1
            goto L_0x0453
        L_0x047c:
            j4.i8 r6 = (j4.i8) r6
            java.lang.Object r0 = r14.j(r5)
            j4.h8 r0 = (j4.h8) r0
            throw r16
        L_0x0485:
            r2 = r35
            if (r1 != 0) goto L_0x0491
            if (r0 != r2) goto L_0x048c
            goto L_0x0495
        L_0x048c:
            j4.u7 r0 = j4.u7.c()
            throw r0
        L_0x0491:
            if (r0 > r2) goto L_0x0496
            if (r4 != r1) goto L_0x0496
        L_0x0495:
            return r0
        L_0x0496:
            j4.u7 r0 = j4.u7.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.q8.z(java.lang.Object, byte[], int, int, int, j4.i6):int");
    }

    public final m7 zze() {
        return (m7) ((m7) this.f8410e).s(4);
    }
}
