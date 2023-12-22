package n1;

import android.graphics.Bitmap;
import b2.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import n1.a;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f9504a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f9505b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    public final a.C0117a f9506c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f9507d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f9508e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f9509f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f9510g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f9511h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f9512i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f9513j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public c f9514l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f9515m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9516n;

    /* renamed from: o  reason: collision with root package name */
    public int f9517o;

    /* renamed from: p  reason: collision with root package name */
    public int f9518p;

    /* renamed from: q  reason: collision with root package name */
    public int f9519q;

    /* renamed from: r  reason: collision with root package name */
    public int f9520r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f9521s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f9522t = Bitmap.Config.ARGB_8888;

    public e(b bVar, c cVar, ByteBuffer byteBuffer, int i10) {
        byte[] bArr;
        int[] iArr;
        this.f9506c = bVar;
        this.f9514l = new c();
        synchronized (this) {
            if (i10 > 0) {
                int highestOneBit = Integer.highestOneBit(i10);
                this.f9517o = 0;
                this.f9514l = cVar;
                this.k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f9507d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f9507d.order(ByteOrder.LITTLE_ENDIAN);
                this.f9516n = false;
                Iterator it = cVar.f9494e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((b) it.next()).f9486g == 3) {
                            this.f9516n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f9518p = highestOneBit;
                int i11 = cVar.f9495f;
                this.f9520r = i11 / highestOneBit;
                int i12 = cVar.f9496g;
                this.f9519q = i12 / highestOneBit;
                int i13 = i11 * i12;
                r1.b bVar2 = ((b) this.f9506c).f2209b;
                if (bVar2 == null) {
                    bArr = new byte[i13];
                } else {
                    bArr = (byte[]) bVar2.c(i13, byte[].class);
                }
                this.f9512i = bArr;
                a.C0117a aVar = this.f9506c;
                int i14 = this.f9520r * this.f9519q;
                r1.b bVar3 = ((b) aVar).f2209b;
                if (bVar3 == null) {
                    iArr = new int[i14];
                } else {
                    iArr = (int[]) bVar3.c(i14, int[].class);
                }
                this.f9513j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        }
    }

    public final int a() {
        return this.k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap b() {
        /*
            r8 = this;
            monitor-enter(r8)
            n1.c r0 = r8.f9514l     // Catch:{ all -> 0x00f7 }
            int r0 = r0.f9492c     // Catch:{ all -> 0x00f7 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.k     // Catch:{ all -> 0x00f7 }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "e"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r3.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00f7 }
            n1.c r4 = r8.f9514l     // Catch:{ all -> 0x00f7 }
            int r4 = r4.f9492c     // Catch:{ all -> 0x00f7 }
            r3.append(r4)     // Catch:{ all -> 0x00f7 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00f7 }
            int r4 = r8.k     // Catch:{ all -> 0x00f7 }
            r3.append(r4)     // Catch:{ all -> 0x00f7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f7 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00f7 }
        L_0x0039:
            r8.f9517o = r2     // Catch:{ all -> 0x00f7 }
        L_0x003b:
            int r0 = r8.f9517o     // Catch:{ all -> 0x00f7 }
            r3 = 0
            if (r0 == r2) goto L_0x00d5
            r4 = 2
            if (r0 != r4) goto L_0x0045
            goto L_0x00d5
        L_0x0045:
            r0 = 0
            r8.f9517o = r0     // Catch:{ all -> 0x00f7 }
            byte[] r5 = r8.f9508e     // Catch:{ all -> 0x00f7 }
            if (r5 != 0) goto L_0x0063
            n1.a$a r5 = r8.f9506c     // Catch:{ all -> 0x00f7 }
            r6 = 255(0xff, float:3.57E-43)
            b2.b r5 = (b2.b) r5     // Catch:{ all -> 0x00f7 }
            r1.b r5 = r5.f2209b     // Catch:{ all -> 0x00f7 }
            if (r5 != 0) goto L_0x0059
            byte[] r5 = new byte[r6]     // Catch:{ all -> 0x00f7 }
            goto L_0x0061
        L_0x0059:
            java.lang.Class<byte[]> r7 = byte[].class
            java.lang.Object r5 = r5.c(r6, r7)     // Catch:{ all -> 0x00f7 }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x00f7 }
        L_0x0061:
            r8.f9508e = r5     // Catch:{ all -> 0x00f7 }
        L_0x0063:
            n1.c r5 = r8.f9514l     // Catch:{ all -> 0x00f7 }
            java.util.ArrayList r5 = r5.f9494e     // Catch:{ all -> 0x00f7 }
            int r6 = r8.k     // Catch:{ all -> 0x00f7 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00f7 }
            n1.b r5 = (n1.b) r5     // Catch:{ all -> 0x00f7 }
            int r6 = r8.k     // Catch:{ all -> 0x00f7 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x007f
            n1.c r7 = r8.f9514l     // Catch:{ all -> 0x00f7 }
            java.util.ArrayList r7 = r7.f9494e     // Catch:{ all -> 0x00f7 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00f7 }
            n1.b r6 = (n1.b) r6     // Catch:{ all -> 0x00f7 }
            goto L_0x0080
        L_0x007f:
            r6 = r3
        L_0x0080:
            int[] r7 = r5.k     // Catch:{ all -> 0x00f7 }
            if (r7 == 0) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            n1.c r7 = r8.f9514l     // Catch:{ all -> 0x00f7 }
            int[] r7 = r7.f9490a     // Catch:{ all -> 0x00f7 }
        L_0x0089:
            r8.f9504a = r7     // Catch:{ all -> 0x00f7 }
            if (r7 != 0) goto L_0x00b1
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r1.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00f7 }
            int r4 = r8.k     // Catch:{ all -> 0x00f7 }
            r1.append(r4)     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f7 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f7 }
        L_0x00ad:
            r8.f9517o = r2     // Catch:{ all -> 0x00f7 }
            monitor-exit(r8)
            return r3
        L_0x00b1:
            boolean r1 = r5.f9485f     // Catch:{ all -> 0x00f7 }
            if (r1 == 0) goto L_0x00cf
            int[] r1 = r8.f9505b     // Catch:{ all -> 0x00f7 }
            int r2 = r7.length     // Catch:{ all -> 0x00f7 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00f7 }
            int[] r1 = r8.f9505b     // Catch:{ all -> 0x00f7 }
            r8.f9504a = r1     // Catch:{ all -> 0x00f7 }
            int r2 = r5.f9487h     // Catch:{ all -> 0x00f7 }
            r1[r2] = r0     // Catch:{ all -> 0x00f7 }
            int r0 = r5.f9486g     // Catch:{ all -> 0x00f7 }
            if (r0 != r4) goto L_0x00cf
            int r0 = r8.k     // Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x00cf
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00f7 }
            r8.f9521s = r0     // Catch:{ all -> 0x00f7 }
        L_0x00cf:
            android.graphics.Bitmap r0 = r8.j(r5, r6)     // Catch:{ all -> 0x00f7 }
            monitor-exit(r8)
            return r0
        L_0x00d5:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r1.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00f7 }
            int r2 = r8.f9517o     // Catch:{ all -> 0x00f7 }
            r1.append(r2)     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f7 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f7 }
        L_0x00f5:
            monitor-exit(r8)
            return r3
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.e.b():android.graphics.Bitmap");
    }

    public final void c() {
        this.k = (this.k + 1) % this.f9514l.f9492c;
    }

    public final void clear() {
        r1.b bVar;
        r1.b bVar2;
        r1.b bVar3;
        this.f9514l = null;
        byte[] bArr = this.f9512i;
        if (!(bArr == null || (bVar3 = ((b) this.f9506c).f2209b) == null)) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f9513j;
        if (!(iArr == null || (bVar2 = ((b) this.f9506c).f2209b) == null)) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f9515m;
        if (bitmap != null) {
            ((b) this.f9506c).f2208a.e(bitmap);
        }
        this.f9515m = null;
        this.f9507d = null;
        this.f9521s = null;
        byte[] bArr2 = this.f9508e;
        if (bArr2 != null && (bVar = ((b) this.f9506c).f2209b) != null) {
            bVar.put(bArr2);
        }
    }

    public final int d() {
        return this.f9514l.f9492c;
    }

    public final int e() {
        int i10;
        c cVar = this.f9514l;
        int i11 = cVar.f9492c;
        if (i11 <= 0 || (i10 = this.k) < 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= i11) {
            return -1;
        }
        return ((b) cVar.f9494e.get(i10)).f9488i;
    }

    public final int f() {
        return (this.f9513j.length * 4) + this.f9507d.limit() + this.f9512i.length;
    }

    public final ByteBuffer g() {
        return this.f9507d;
    }

    public final Bitmap h() {
        Bitmap.Config config;
        Boolean bool = this.f9521s;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f9522t;
        }
        a.C0117a aVar = this.f9506c;
        Bitmap c10 = ((b) aVar).f2208a.c(this.f9520r, this.f9519q, config);
        c10.setHasAlpha(true);
        return c10;
    }

    public final void i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f9522t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f9499j == r1.f9487h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v31, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap j(n1.b r36, n1.b r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f9513j
            r11 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f9515m
            if (r3 == 0) goto L_0x0018
            n1.a$a r4 = r0.f9506c
            b2.b r4 = (b2.b) r4
            r1.d r4 = r4.f2208a
            r4.e(r3)
        L_0x0018:
            r3 = 0
            r0.f9515m = r3
            java.util.Arrays.fill(r10, r11)
        L_0x001e:
            r12 = 3
            if (r2 == 0) goto L_0x002c
            int r3 = r2.f9486g
            if (r3 != r12) goto L_0x002c
            android.graphics.Bitmap r3 = r0.f9515m
            if (r3 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r11)
        L_0x002c:
            r13 = 2
            if (r2 == 0) goto L_0x007e
            int r3 = r2.f9486g
            if (r3 <= 0) goto L_0x007e
            if (r3 != r13) goto L_0x006c
            boolean r3 = r1.f9485f
            if (r3 != 0) goto L_0x0047
            n1.c r3 = r0.f9514l
            int r4 = r3.k
            int[] r5 = r1.k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f9499j
            int r5 = r1.f9487h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = r11
        L_0x0048:
            int r3 = r2.f9483d
            int r5 = r0.f9518p
            int r3 = r3 / r5
            int r6 = r2.f9481b
            int r6 = r6 / r5
            int r7 = r2.f9482c
            int r7 = r7 / r5
            int r2 = r2.f9480a
            int r2 = r2 / r5
            int r5 = r0.f9520r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005c:
            if (r6 >= r3) goto L_0x007e
            int r2 = r6 + r7
            r5 = r6
        L_0x0061:
            if (r5 >= r2) goto L_0x0068
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0061
        L_0x0068:
            int r2 = r0.f9520r
            int r6 = r6 + r2
            goto L_0x005c
        L_0x006c:
            if (r3 != r12) goto L_0x007e
            android.graphics.Bitmap r2 = r0.f9515m
            if (r2 == 0) goto L_0x007e
            r4 = 0
            int r8 = r0.f9520r
            r6 = 0
            r7 = 0
            int r9 = r0.f9519q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x007e:
            java.nio.ByteBuffer r2 = r0.f9507d
            int r3 = r1.f9489j
            r2.position(r3)
            int r2 = r1.f9482c
            int r3 = r1.f9483d
            int r2 = r2 * r3
            byte[] r3 = r0.f9512i
            if (r3 == 0) goto L_0x0091
            int r3 = r3.length
            if (r3 >= r2) goto L_0x00a6
        L_0x0091:
            n1.a$a r3 = r0.f9506c
            b2.b r3 = (b2.b) r3
            r1.b r3 = r3.f2209b
            if (r3 != 0) goto L_0x009c
            byte[] r3 = new byte[r2]
            goto L_0x00a4
        L_0x009c:
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Object r3 = r3.c(r2, r4)
            byte[] r3 = (byte[]) r3
        L_0x00a4:
            r0.f9512i = r3
        L_0x00a6:
            byte[] r3 = r0.f9512i
            short[] r4 = r0.f9509f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00b2
            short[] r4 = new short[r5]
            r0.f9509f = r4
        L_0x00b2:
            short[] r4 = r0.f9509f
            byte[] r6 = r0.f9510g
            if (r6 != 0) goto L_0x00bc
            byte[] r6 = new byte[r5]
            r0.f9510g = r6
        L_0x00bc:
            byte[] r6 = r0.f9510g
            byte[] r7 = r0.f9511h
            if (r7 != 0) goto L_0x00c8
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f9511h = r7
        L_0x00c8:
            byte[] r7 = r0.f9511h
            java.nio.ByteBuffer r8 = r0.f9507d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r14 = r9 << r8
            int r15 = r14 + 1
            int r16 = r14 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r13 = -1
            int r17 = r17 + -1
            r5 = r11
        L_0x00e0:
            if (r5 >= r14) goto L_0x00eb
            r4[r5] = r11
            byte r13 = (byte) r5
            r6[r5] = r13
            int r5 = r5 + 1
            r13 = -1
            goto L_0x00e0
        L_0x00eb:
            byte[] r5 = r0.f9508e
            r12 = r0
            r26 = r8
            r9 = r11
            r20 = r9
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r27 = r24
            r29 = r27
            r25 = r16
            r28 = r17
            r13 = -1
        L_0x0104:
            r30 = 8
            if (r9 >= r2) goto L_0x01ff
            if (r21 != 0) goto L_0x0142
            java.nio.ByteBuffer r11 = r0.f9507d
            byte r11 = r11.get()
            r11 = r11 & 255(0xff, float:3.57E-43)
            r31 = r8
            if (r11 > 0) goto L_0x011d
            r32 = r9
            r34 = r10
            r33 = r13
            goto L_0x0133
        L_0x011d:
            java.nio.ByteBuffer r8 = r12.f9507d
            r32 = r9
            byte[] r9 = r12.f9508e
            r33 = r13
            int r13 = r8.remaining()
            int r13 = java.lang.Math.min(r11, r13)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r13)
        L_0x0133:
            if (r11 > 0) goto L_0x013d
            r8 = 3
            r12.f9517o = r8
            r11 = r20
            r10 = 0
            goto L_0x0204
        L_0x013d:
            r21 = r11
            r22 = 0
            goto L_0x014a
        L_0x0142:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
        L_0x014a:
            byte r8 = r5[r22]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r23
            int r24 = r24 + r8
            int r23 = r23 + 8
            r8 = 1
            int r22 = r22 + 1
            r8 = -1
            int r21 = r21 + -1
            r10 = r23
            r11 = r25
            r8 = r26
            r9 = r32
            r13 = r33
            r23 = r5
            r5 = r27
        L_0x0168:
            if (r10 < r8) goto L_0x01eb
            r25 = r12
            r12 = r24 & r28
            int r24 = r24 >> r8
            int r10 = r10 - r8
            if (r12 != r14) goto L_0x0184
            r26 = r10
            r11 = r16
            r28 = r17
            r12 = r25
            r8 = r31
            r13 = -1
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01e5
        L_0x0184:
            if (r12 != r15) goto L_0x018e
            r27 = r5
            r12 = r25
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01f0
        L_0x018e:
            r26 = r10
            r10 = -1
            if (r13 != r10) goto L_0x01a1
            byte r5 = r6[r12]
            r3[r20] = r5
            int r20 = r20 + 1
            int r9 = r9 + 1
            r5 = r12
            r13 = r5
            r10 = r26
            r12 = r0
            goto L_0x0168
        L_0x01a1:
            if (r12 < r11) goto L_0x01aa
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r13
            goto L_0x01ab
        L_0x01aa:
            r5 = r12
        L_0x01ab:
            if (r5 < r14) goto L_0x01b6
            byte r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01ab
        L_0x01b6:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r3[r20] = r10
        L_0x01bd:
            r19 = 1
            int r20 = r20 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L_0x01cc
            int r29 = r29 + -1
            byte r25 = r7[r29]
            r3[r20] = r25
            goto L_0x01bd
        L_0x01cc:
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r5) goto L_0x01e3
            short r13 = (short) r13
            r4[r11] = r13
            r6[r11] = r10
            int r11 = r11 + 1
            r10 = r11 & r28
            if (r10 != 0) goto L_0x01e3
            if (r11 >= r5) goto L_0x01e3
            int r8 = r8 + 1
            int r28 = r28 + r11
        L_0x01e3:
            r13 = r12
            r12 = r0
        L_0x01e5:
            r5 = r25
            r10 = r26
            goto L_0x0168
        L_0x01eb:
            r27 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r12 = r0
        L_0x01f0:
            r26 = r8
            r25 = r11
            r5 = r23
            r8 = r31
            r11 = 0
            r23 = r10
            r10 = r34
            goto L_0x0104
        L_0x01ff:
            r34 = r10
            r10 = r11
            r11 = r20
        L_0x0204:
            java.util.Arrays.fill(r3, r11, r2, r10)
            boolean r2 = r1.f9484e
            if (r2 != 0) goto L_0x027c
            int r2 = r0.f9518p
            r3 = 1
            if (r2 == r3) goto L_0x0212
            goto L_0x027c
        L_0x0212:
            int[] r2 = r0.f9513j
            int r3 = r1.f9483d
            int r4 = r1.f9481b
            int r5 = r1.f9482c
            int r6 = r1.f9480a
            int r7 = r0.k
            if (r7 != 0) goto L_0x0222
            r7 = 1
            goto L_0x0223
        L_0x0222:
            r7 = r10
        L_0x0223:
            int r8 = r0.f9520r
            byte[] r9 = r0.f9512i
            int[] r11 = r0.f9504a
            r13 = r10
            r12 = -1
        L_0x022b:
            if (r13 >= r3) goto L_0x025e
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L_0x0238
            r10 = r14
        L_0x0238:
            int r14 = r1.f9482c
            int r14 = r14 * r13
        L_0x023b:
            r16 = r3
            if (r15 >= r10) goto L_0x0258
            byte r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x024f
            r4 = r11[r4]
            if (r4 == 0) goto L_0x024e
            r2[r15] = r4
            goto L_0x024f
        L_0x024e:
            r12 = r3
        L_0x024f:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x023b
        L_0x0258:
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L_0x022b
        L_0x025e:
            java.lang.Boolean r2 = r0.f9521s
            if (r2 == 0) goto L_0x0268
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0271
        L_0x0268:
            java.lang.Boolean r2 = r0.f9521s
            if (r2 != 0) goto L_0x0273
            if (r7 == 0) goto L_0x0273
            r2 = -1
            if (r12 == r2) goto L_0x0273
        L_0x0271:
            r11 = 1
            goto L_0x0274
        L_0x0273:
            r11 = 0
        L_0x0274:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f9521s = r2
            goto L_0x0405
        L_0x027c:
            int[] r2 = r0.f9513j
            int r3 = r1.f9483d
            int r4 = r0.f9518p
            int r3 = r3 / r4
            int r5 = r1.f9481b
            int r5 = r5 / r4
            int r6 = r1.f9482c
            int r6 = r6 / r4
            int r7 = r1.f9480a
            int r7 = r7 / r4
            int r8 = r0.k
            if (r8 != 0) goto L_0x0292
            r10 = 1
            goto L_0x0293
        L_0x0292:
            r10 = 0
        L_0x0293:
            int r8 = r0.f9520r
            int r9 = r0.f9519q
            byte[] r11 = r0.f9512i
            int[] r12 = r0.f9504a
            java.lang.Boolean r13 = r0.f9521s
            r14 = r13
            r17 = r30
            r13 = 0
            r15 = 0
            r16 = 1
        L_0x02a4:
            r37 = r14
            if (r13 >= r3) goto L_0x03f3
            boolean r14 = r1.f9484e
            if (r14 == 0) goto L_0x02d3
            if (r15 < r3) goto L_0x02ce
            int r14 = r16 + 1
            r20 = r3
            r3 = 2
            if (r14 == r3) goto L_0x02c9
            r3 = 3
            if (r14 == r3) goto L_0x02c2
            r3 = 4
            r16 = r14
            if (r14 == r3) goto L_0x02be
            goto L_0x02d0
        L_0x02be:
            r15 = 1
            r17 = 2
            goto L_0x02d0
        L_0x02c2:
            r3 = 4
            r17 = r3
            r16 = r14
            r15 = 2
            goto L_0x02d0
        L_0x02c9:
            r3 = 4
            r15 = r3
            r16 = r14
            goto L_0x02d0
        L_0x02ce:
            r20 = r3
        L_0x02d0:
            int r3 = r15 + r17
            goto L_0x02d7
        L_0x02d3:
            r20 = r3
            r3 = r15
            r15 = r13
        L_0x02d7:
            int r15 = r15 + r5
            r14 = 1
            if (r4 != r14) goto L_0x02dd
            r14 = 1
            goto L_0x02de
        L_0x02dd:
            r14 = 0
        L_0x02de:
            if (r15 >= r9) goto L_0x03d3
            int r15 = r15 * r8
            int r18 = r15 + r7
            r21 = r3
            int r3 = r18 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02eb
            r3 = r15
        L_0x02eb:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r1.f9482c
            int r15 = r15 * r5
            if (r14 == 0) goto L_0x0314
            r14 = r37
            r5 = r18
        L_0x02f8:
            r23 = r6
            if (r5 >= r3) goto L_0x03cc
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x0307
            r2[r5] = r6
            goto L_0x030e
        L_0x0307:
            if (r10 == 0) goto L_0x030e
            if (r14 != 0) goto L_0x030e
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r14 = r6
        L_0x030e:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02f8
        L_0x0314:
            r23 = r6
            int r5 = r3 - r18
            int r5 = r5 * r4
            int r5 = r5 + r15
            r14 = r37
            r6 = r18
        L_0x031e:
            if (r6 >= r3) goto L_0x03cc
            r18 = r3
            int r3 = r1.f9482c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0333:
            int r8 = r0.f9518p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x0368
            byte[] r8 = r0.f9512i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x036a
            if (r7 >= r5) goto L_0x036a
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f9504a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0363
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0363:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x0333
        L_0x0368:
            r32 = r9
        L_0x036a:
            int r3 = r3 + r15
            r7 = r3
        L_0x036c:
            int r8 = r0.f9518p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x039d
            byte[] r8 = r0.f9512i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x039d
            if (r7 >= r5) goto L_0x039d
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f9504a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x039a
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x039a:
            int r7 = r7 + 1
            goto L_0x036c
        L_0x039d:
            if (r28 != 0) goto L_0x03a1
            r3 = 0
            goto L_0x03b3
        L_0x03a1:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03b3:
            if (r3 == 0) goto L_0x03b8
            r2[r6] = r3
            goto L_0x03bf
        L_0x03b8:
            if (r10 == 0) goto L_0x03bf
            if (r14 != 0) goto L_0x03bf
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r14 = r3
        L_0x03bf:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r18
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x031e
        L_0x03cc:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03e1
        L_0x03d3:
            r21 = r3
            r22 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r14 = r37
        L_0x03e1:
            int r13 = r13 + 1
            r3 = r20
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x02a4
        L_0x03f3:
            java.lang.Boolean r2 = r0.f9521s
            if (r2 != 0) goto L_0x0405
            if (r37 != 0) goto L_0x03fb
            r11 = 0
            goto L_0x03ff
        L_0x03fb:
            boolean r11 = r37.booleanValue()
        L_0x03ff:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f9521s = r2
        L_0x0405:
            boolean r2 = r0.f9516n
            if (r2 == 0) goto L_0x0429
            int r1 = r1.f9486g
            if (r1 == 0) goto L_0x0410
            r2 = 1
            if (r1 != r2) goto L_0x0429
        L_0x0410:
            android.graphics.Bitmap r1 = r0.f9515m
            if (r1 != 0) goto L_0x041a
            android.graphics.Bitmap r1 = r35.h()
            r0.f9515m = r1
        L_0x041a:
            android.graphics.Bitmap r1 = r0.f9515m
            r3 = 0
            int r7 = r0.f9520r
            r5 = 0
            r6 = 0
            int r8 = r0.f9519q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x0429:
            android.graphics.Bitmap r9 = r35.h()
            r3 = 0
            int r7 = r0.f9520r
            r5 = 0
            r6 = 0
            int r8 = r0.f9519q
            r1 = r9
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.e.j(n1.b, n1.b):android.graphics.Bitmap");
    }
}
