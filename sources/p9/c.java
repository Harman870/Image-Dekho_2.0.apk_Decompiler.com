package p9;

import androidx.activity.f;
import com.ironsource.mediationsdk.IronSourceSegment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;
import p9.p;
import p9.s;
import t9.e;
import t9.h;
import t9.q;
import t9.t;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b[] f10717a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<h, Integer> f10718b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f10719a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final t f10720b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10721c = 4096;

        /* renamed from: d  reason: collision with root package name */
        public int f10722d = 4096;

        /* renamed from: e  reason: collision with root package name */
        public b[] f10723e = new b[8];

        /* renamed from: f  reason: collision with root package name */
        public int f10724f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f10725g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f10726h = 0;

        public a(p.a aVar) {
            Logger logger = q.f12068a;
            this.f10720b = new t(aVar);
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f10723e.length;
                while (true) {
                    length--;
                    i11 = this.f10724f;
                    if (length < i11 || i10 <= 0) {
                        b[] bVarArr = this.f10723e;
                        System.arraycopy(bVarArr, i11 + 1, bVarArr, i11 + 1 + i12, this.f10725g);
                        this.f10724f += i12;
                    } else {
                        int i13 = this.f10723e[length].f10716c;
                        i10 -= i13;
                        this.f10726h -= i13;
                        this.f10725g--;
                        i12++;
                    }
                }
                b[] bVarArr2 = this.f10723e;
                System.arraycopy(bVarArr2, i11 + 1, bVarArr2, i11 + 1 + i12, this.f10725g);
                this.f10724f += i12;
            }
            return i12;
        }

        public final h b(int i10) {
            boolean z9;
            b bVar;
            if (i10 < 0 || i10 > c.f10717a.length - 1) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                bVar = c.f10717a[i10];
            } else {
                int length = this.f10724f + 1 + (i10 - c.f10717a.length);
                if (length >= 0) {
                    b[] bVarArr = this.f10723e;
                    if (length < bVarArr.length) {
                        bVar = bVarArr[length];
                    }
                }
                StringBuilder g10 = f.g("Header index too large ");
                g10.append(i10 + 1);
                throw new IOException(g10.toString());
            }
            return bVar.f10714a;
        }

        public final void c(b bVar) {
            this.f10719a.add(bVar);
            int i10 = bVar.f10716c;
            int i11 = this.f10722d;
            if (i10 > i11) {
                Arrays.fill(this.f10723e, (Object) null);
                this.f10724f = this.f10723e.length - 1;
                this.f10725g = 0;
                this.f10726h = 0;
                return;
            }
            a((this.f10726h + i10) - i11);
            int i12 = this.f10725g + 1;
            b[] bVarArr = this.f10723e;
            if (i12 > bVarArr.length) {
                b[] bVarArr2 = new b[(bVarArr.length * 2)];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f10724f = this.f10723e.length - 1;
                this.f10723e = bVarArr2;
            }
            int i13 = this.f10724f;
            this.f10724f = i13 - 1;
            this.f10723e[i13] = bVar;
            this.f10725g++;
            this.f10726h += i10;
        }

        public final h d() {
            boolean z9;
            byte readByte = this.f10720b.readByte() & 255;
            if ((readByte & 128) == 128) {
                z9 = true;
            } else {
                z9 = false;
            }
            int e10 = e(readByte, 127);
            if (!z9) {
                return this.f10720b.b((long) e10);
            }
            s sVar = s.f10848d;
            t tVar = this.f10720b;
            long j10 = (long) e10;
            tVar.D(j10);
            byte[] E = tVar.f12075a.E(j10);
            sVar.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i10 = 0;
            s.a aVar = sVar.f10849a;
            byte b10 = 0;
            for (byte b11 : E) {
                b10 = (b10 << 8) | (b11 & 255);
                i10 += 8;
                while (i10 >= 8) {
                    int i11 = i10 - 8;
                    aVar = aVar.f10850a[(b10 >>> i11) & 255];
                    if (aVar.f10850a == null) {
                        byteArrayOutputStream.write(aVar.f10851b);
                        i10 -= aVar.f10852c;
                        aVar = sVar.f10849a;
                    } else {
                        i10 = i11;
                    }
                }
            }
            while (i10 > 0) {
                s.a aVar2 = aVar.f10850a[(b10 << (8 - i10)) & 255];
                if (aVar2.f10850a != null || aVar2.f10852c > i10) {
                    break;
                }
                byteArrayOutputStream.write(aVar2.f10851b);
                i10 -= aVar2.f10852c;
                aVar = sVar.f10849a;
            }
            return h.g(byteArrayOutputStream.toByteArray());
        }

        public final int e(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                byte readByte = this.f10720b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i11 + (readByte << i13);
                }
                i11 += (readByte & Byte.MAX_VALUE) << i13;
                i13 += 7;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final e f10727a;

        /* renamed from: b  reason: collision with root package name */
        public int f10728b = Integer.MAX_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10729c;

        /* renamed from: d  reason: collision with root package name */
        public int f10730d = 4096;

        /* renamed from: e  reason: collision with root package name */
        public b[] f10731e = new b[8];

        /* renamed from: f  reason: collision with root package name */
        public int f10732f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f10733g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f10734h = 0;

        public b(e eVar) {
            this.f10727a = eVar;
        }

        public final void a(int i10) {
            int i11;
            if (i10 > 0) {
                int length = this.f10731e.length - 1;
                int i12 = 0;
                while (true) {
                    i11 = this.f10732f;
                    if (length < i11 || i10 <= 0) {
                        b[] bVarArr = this.f10731e;
                        int i13 = i11 + 1;
                        System.arraycopy(bVarArr, i13, bVarArr, i13 + i12, this.f10733g);
                        b[] bVarArr2 = this.f10731e;
                        int i14 = this.f10732f + 1;
                        Arrays.fill(bVarArr2, i14, i14 + i12, (Object) null);
                        this.f10732f += i12;
                    } else {
                        int i15 = this.f10731e[length].f10716c;
                        i10 -= i15;
                        this.f10734h -= i15;
                        this.f10733g--;
                        i12++;
                        length--;
                    }
                }
                b[] bVarArr3 = this.f10731e;
                int i132 = i11 + 1;
                System.arraycopy(bVarArr3, i132, bVarArr3, i132 + i12, this.f10733g);
                b[] bVarArr22 = this.f10731e;
                int i142 = this.f10732f + 1;
                Arrays.fill(bVarArr22, i142, i142 + i12, (Object) null);
                this.f10732f += i12;
            }
        }

        public final void b(b bVar) {
            int i10 = bVar.f10716c;
            int i11 = this.f10730d;
            if (i10 > i11) {
                Arrays.fill(this.f10731e, (Object) null);
                this.f10732f = this.f10731e.length - 1;
                this.f10733g = 0;
                this.f10734h = 0;
                return;
            }
            a((this.f10734h + i10) - i11);
            int i12 = this.f10733g + 1;
            b[] bVarArr = this.f10731e;
            if (i12 > bVarArr.length) {
                b[] bVarArr2 = new b[(bVarArr.length * 2)];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f10732f = this.f10731e.length - 1;
                this.f10731e = bVarArr2;
            }
            int i13 = this.f10732f;
            this.f10732f = i13 - 1;
            this.f10731e[i13] = bVar;
            this.f10733g++;
            this.f10734h += i10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(t9.h r11) {
            /*
                r10 = this;
                p9.s r0 = p9.s.f10848d
                r0.getClass()
                r0 = 0
                r2 = 0
                r4 = r0
                r3 = r2
            L_0x000a:
                int r6 = r11.j()
                r7 = 255(0xff, float:3.57E-43)
                if (r3 >= r6) goto L_0x0020
                byte r6 = r11.e(r3)
                r6 = r6 & r7
                byte[] r7 = p9.s.f10847c
                byte r6 = r7[r6]
                long r6 = (long) r6
                long r4 = r4 + r6
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r8 = 7
                long r4 = r4 + r8
                r3 = 3
                long r3 = r4 >> r3
                int r3 = (int) r3
                int r4 = r11.j()
                r5 = 127(0x7f, float:1.78E-43)
                if (r3 >= r4) goto L_0x0087
                t9.e r3 = new t9.e
                r3.<init>()
                p9.s r4 = p9.s.f10848d
                r4.getClass()
                r4 = r2
            L_0x003a:
                int r6 = r11.j()
                if (r2 >= r6) goto L_0x0061
                byte r6 = r11.e(r2)
                r6 = r6 & r7
                int[] r8 = p9.s.f10846b
                r8 = r8[r6]
                byte[] r9 = p9.s.f10847c
                byte r6 = r9[r6]
                long r0 = r0 << r6
                long r8 = (long) r8
                long r0 = r0 | r8
                int r4 = r4 + r6
            L_0x0051:
                r6 = 8
                if (r4 < r6) goto L_0x005e
                int r4 = r4 + -8
                long r8 = r0 >> r4
                int r6 = (int) r8
                r3.R(r6)
                goto L_0x0051
            L_0x005e:
                int r2 = r2 + 1
                goto L_0x003a
            L_0x0061:
                if (r4 <= 0) goto L_0x006e
                int r11 = 8 - r4
                long r0 = r0 << r11
                int r11 = r7 >>> r4
                long r6 = (long) r11
                long r0 = r0 | r6
                int r11 = (int) r0
                r3.R(r11)
            L_0x006e:
                t9.h r11 = new t9.h
                long r0 = r3.f12045b     // Catch:{ EOFException -> 0x0080 }
                byte[] r0 = r3.E(r0)     // Catch:{ EOFException -> 0x0080 }
                r11.<init>(r0)
                int r0 = r0.length
                r1 = 128(0x80, float:1.794E-43)
                r10.e(r0, r5, r1)
                goto L_0x008e
            L_0x0080:
                r11 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r11)
                throw r0
            L_0x0087:
                int r0 = r11.j()
                r10.e(r0, r5, r2)
            L_0x008e:
                t9.e r0 = r10.f10727a
                r0.Q(r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.c.b.c(t9.h):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(java.util.ArrayList r13) {
            /*
                r12 = this;
                boolean r0 = r12.f10729c
                r1 = 0
                if (r0 == 0) goto L_0x001e
                int r0 = r12.f10728b
                int r2 = r12.f10730d
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0012
                r12.e(r0, r4, r3)
            L_0x0012:
                r12.f10729c = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r12.f10728b = r0
                int r0 = r12.f10730d
                r12.e(r0, r4, r3)
            L_0x001e:
                int r0 = r13.size()
                r2 = r1
            L_0x0023:
                if (r2 >= r0) goto L_0x00e8
                java.lang.Object r3 = r13.get(r2)
                p9.b r3 = (p9.b) r3
                t9.h r4 = r3.f10714a
                t9.h r4 = r4.l()
                t9.h r5 = r3.f10715b
                java.util.Map<t9.h, java.lang.Integer> r6 = p9.c.f10718b
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                r8 = 1
                if (r6 == 0) goto L_0x0068
                int r6 = r6.intValue()
                int r6 = r6 + r8
                if (r6 <= r8) goto L_0x0066
                r9 = 8
                if (r6 >= r9) goto L_0x0066
                p9.b[] r9 = p9.c.f10717a
                int r10 = r6 + -1
                r10 = r9[r10]
                t9.h r10 = r10.f10715b
                boolean r10 = java.util.Objects.equals(r10, r5)
                if (r10 == 0) goto L_0x0059
                goto L_0x0069
            L_0x0059:
                r9 = r9[r6]
                t9.h r9 = r9.f10715b
                boolean r9 = java.util.Objects.equals(r9, r5)
                if (r9 == 0) goto L_0x0066
                int r9 = r6 + 1
                goto L_0x006a
            L_0x0066:
                r9 = r7
                goto L_0x006a
            L_0x0068:
                r6 = r7
            L_0x0069:
                r9 = r6
            L_0x006a:
                if (r9 != r7) goto L_0x00a2
                int r10 = r12.f10732f
                int r10 = r10 + r8
                p9.b[] r8 = r12.f10731e
                int r8 = r8.length
            L_0x0072:
                if (r10 >= r8) goto L_0x00a2
                p9.b[] r11 = r12.f10731e
                r11 = r11[r10]
                t9.h r11 = r11.f10714a
                boolean r11 = java.util.Objects.equals(r11, r4)
                if (r11 == 0) goto L_0x009f
                p9.b[] r11 = r12.f10731e
                r11 = r11[r10]
                t9.h r11 = r11.f10715b
                boolean r11 = java.util.Objects.equals(r11, r5)
                if (r11 == 0) goto L_0x0095
                int r8 = r12.f10732f
                int r10 = r10 - r8
                p9.b[] r8 = p9.c.f10717a
                int r8 = r8.length
                int r9 = r8 + r10
                goto L_0x00a2
            L_0x0095:
                if (r6 != r7) goto L_0x009f
                int r6 = r12.f10732f
                int r6 = r10 - r6
                p9.b[] r11 = p9.c.f10717a
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x009f:
                int r10 = r10 + 1
                goto L_0x0072
            L_0x00a2:
                if (r9 == r7) goto L_0x00ac
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r12.e(r9, r3, r4)
                goto L_0x00e4
            L_0x00ac:
                r8 = 64
                if (r6 != r7) goto L_0x00b9
                t9.e r6 = r12.f10727a
                r6.R(r8)
                r12.c(r4)
                goto L_0x00de
            L_0x00b9:
                t9.h r7 = p9.b.f10708d
                r4.getClass()
                int r9 = r7.j()
                boolean r7 = r4.i(r7, r9)
                if (r7 == 0) goto L_0x00d9
                t9.h r7 = p9.b.f10713i
                boolean r4 = r7.equals(r4)
                if (r4 != 0) goto L_0x00d9
                r3 = 15
                r12.e(r6, r3, r1)
                r12.c(r5)
                goto L_0x00e4
            L_0x00d9:
                r4 = 63
                r12.e(r6, r4, r8)
            L_0x00de:
                r12.c(r5)
                r12.b(r3)
            L_0x00e4:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x00e8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.c.b.d(java.util.ArrayList):void");
        }

        public final void e(int i10, int i11, int i12) {
            e eVar;
            int i13;
            if (i10 < i11) {
                eVar = this.f10727a;
                i13 = i10 | i12;
            } else {
                this.f10727a.R(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f10727a.R(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                eVar = this.f10727a;
            }
            eVar.R(i13);
        }
    }

    static {
        b bVar = new b(b.f10713i, "");
        int i10 = 0;
        h hVar = b.f10710f;
        h hVar2 = b.f10711g;
        h hVar3 = b.f10712h;
        h hVar4 = b.f10709e;
        b[] bVarArr = {bVar, new b(hVar, "GET"), new b(hVar, "POST"), new b(hVar2, "/"), new b(hVar2, "/index.html"), new b(hVar3, "http"), new b(hVar3, "https"), new b(hVar4, "200"), new b(hVar4, "204"), new b(hVar4, "206"), new b(hVar4, "304"), new b(hVar4, "400"), new b(hVar4, "404"), new b(hVar4, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b((String) IronSourceSegment.AGE, ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        f10717a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        while (true) {
            b[] bVarArr2 = f10717a;
            if (i10 < bVarArr2.length) {
                if (!linkedHashMap.containsKey(bVarArr2[i10].f10714a)) {
                    linkedHashMap.put(bVarArr2[i10].f10714a, Integer.valueOf(i10));
                }
                i10++;
            } else {
                f10718b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static void a(h hVar) {
        int j10 = hVar.j();
        int i10 = 0;
        while (i10 < j10) {
            byte e10 = hVar.e(i10);
            if (e10 < 65 || e10 > 90) {
                i10++;
            } else {
                StringBuilder g10 = f.g("PROTOCOL_ERROR response malformed: mixed case name: ");
                g10.append(hVar.m());
                throw new IOException(g10.toString());
            }
        }
    }
}
