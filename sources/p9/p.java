package p9;

import androidx.activity.f;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p9.c;
import p9.f;
import t9.e;
import t9.g;
import t9.h;
import t9.y;
import t9.z;

public final class p implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f10807e = Logger.getLogger(d.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final g f10808a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10809b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10810c;

    /* renamed from: d  reason: collision with root package name */
    public final c.a f10811d;

    public static final class a implements y {

        /* renamed from: a  reason: collision with root package name */
        public final g f10812a;

        /* renamed from: b  reason: collision with root package name */
        public int f10813b;

        /* renamed from: c  reason: collision with root package name */
        public byte f10814c;

        /* renamed from: d  reason: collision with root package name */
        public int f10815d;

        /* renamed from: e  reason: collision with root package name */
        public int f10816e;

        /* renamed from: f  reason: collision with root package name */
        public short f10817f;

        public a(g gVar) {
            this.f10812a = gVar;
        }

        public final void close() {
        }

        public final z e() {
            return this.f10812a.e();
        }

        public final long z(e eVar, long j10) {
            int i10;
            int readInt;
            do {
                int i11 = this.f10816e;
                if (i11 == 0) {
                    this.f10812a.skip((long) this.f10817f);
                    this.f10817f = 0;
                    if ((this.f10814c & 4) != 0) {
                        return -1;
                    }
                    i10 = this.f10815d;
                    g gVar = this.f10812a;
                    byte readByte = (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
                    this.f10816e = readByte;
                    this.f10813b = readByte;
                    byte readByte2 = (byte) (this.f10812a.readByte() & 255);
                    this.f10814c = (byte) (this.f10812a.readByte() & 255);
                    Logger logger = p.f10807e;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(d.a(true, this.f10815d, this.f10813b, readByte2, this.f10814c));
                    }
                    readInt = this.f10812a.readInt() & Integer.MAX_VALUE;
                    this.f10815d = readInt;
                    if (readByte2 != 9) {
                        d.b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte2));
                        throw null;
                    }
                } else {
                    long z9 = this.f10812a.z(eVar, Math.min(8192, (long) i11));
                    if (z9 == -1) {
                        return -1;
                    }
                    this.f10816e = (int) (((long) this.f10816e) - z9);
                    return z9;
                }
            } while (readInt == i10);
            d.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }
    }

    public interface b {
    }

    public p(g gVar, boolean z9) {
        this.f10808a = gVar;
        this.f10810c = z9;
        a aVar = new a(gVar);
        this.f10809b = aVar;
        this.f10811d = new c.a(aVar);
    }

    public static int a(int i10, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        d.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0478, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(boolean r20, p9.p.b r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            r2 = 0
            t9.g r3 = r1.f10808a     // Catch:{ EOFException -> 0x0489 }
            r4 = 9
            r3.D(r4)     // Catch:{ EOFException -> 0x0489 }
            t9.g r3 = r1.f10808a
            byte r4 = r3.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            byte r5 = r3.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            r4 = 1
            r5 = 0
            if (r3 < 0) goto L_0x047a
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r6) goto L_0x047a
            t9.g r7 = r1.f10808a
            byte r7 = r7.readByte()
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r8 = 4
            if (r20 == 0) goto L_0x004b
            if (r7 != r8) goto L_0x003d
            goto L_0x004b
        L_0x003d:
            java.lang.String r0 = "Expected a SETTINGS frame but was %s"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r7)
            r3[r2] = r4
            p9.d.b(r0, r3)
            throw r5
        L_0x004b:
            t9.g r9 = r1.f10808a
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            t9.g r10 = r1.f10808a
            int r10 = r10.readInt()
            r11 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r11
            java.util.logging.Logger r12 = f10807e
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r12.isLoggable(r13)
            if (r13 == 0) goto L_0x006f
            java.lang.String r13 = p9.d.a(r4, r10, r3, r7, r9)
            r12.fine(r13)
        L_0x006f:
            r12 = 5
            r15 = 2
            switch(r7) {
                case 0: goto L_0x0311;
                case 1: goto L_0x023e;
                case 2: goto L_0x0215;
                case 3: goto L_0x0190;
                case 4: goto L_0x00ef;
                case 5: goto L_0x008b;
                case 6: goto L_0x0086;
                case 7: goto L_0x0081;
                case 8: goto L_0x007c;
                default: goto L_0x0074;
            }
        L_0x0074:
            t9.g r0 = r1.f10808a
            long r2 = (long) r3
            r0.skip(r2)
            goto L_0x0478
        L_0x007c:
            r1.u(r0, r3, r10)
            goto L_0x0304
        L_0x0081:
            r1.o(r0, r3, r10)
            goto L_0x0304
        L_0x0086:
            r1.t(r0, r3, r9, r10)
            goto L_0x0304
        L_0x008b:
            if (r10 == 0) goto L_0x00e7
            r5 = r9 & 8
            if (r5 == 0) goto L_0x009b
            t9.g r5 = r1.f10808a
            byte r5 = r5.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            short r5 = (short) r5
            goto L_0x009c
        L_0x009b:
            r5 = r2
        L_0x009c:
            t9.g r6 = r1.f10808a
            int r6 = r6.readInt()
            r6 = r6 & r11
            int r3 = r3 + -4
            int r3 = a(r3, r9, r5)
            java.util.ArrayList r3 = r1.s(r3, r5, r9, r10)
            p9.f$f r0 = (p9.f.C0128f) r0
            p9.f r7 = p9.f.this
            monitor-enter(r7)
            java.util.LinkedHashSet r0 = r7.w     // Catch:{ all -> 0x00e4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e4 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00c4
            r7.A(r6, r15)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e4 }
            goto L_0x0304
        L_0x00c4:
            java.util.LinkedHashSet r0 = r7.w     // Catch:{ all -> 0x00e4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e4 }
            r0.add(r5)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e4 }
            p9.h r0 = new p9.h     // Catch:{ RejectedExecutionException -> 0x0304 }
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ RejectedExecutionException -> 0x0304 }
            java.lang.String r8 = r7.f10746d     // Catch:{ RejectedExecutionException -> 0x0304 }
            r5[r2] = r8     // Catch:{ RejectedExecutionException -> 0x0304 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ RejectedExecutionException -> 0x0304 }
            r5[r4] = r2     // Catch:{ RejectedExecutionException -> 0x0304 }
            r0.<init>(r7, r5, r6, r3)     // Catch:{ RejectedExecutionException -> 0x0304 }
            r7.o(r0)     // Catch:{ RejectedExecutionException -> 0x0304 }
            goto L_0x0304
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e4 }
            throw r0
        L_0x00e7:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            p9.d.b(r0, r2)
            throw r5
        L_0x00ef:
            if (r10 != 0) goto L_0x0188
            r7 = r9 & 1
            if (r7 == 0) goto L_0x0104
            if (r3 != 0) goto L_0x00fc
            r21.getClass()
            goto L_0x0304
        L_0x00fc:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            p9.d.b(r2, r0)
            throw r5
        L_0x0104:
            int r7 = r3 % 6
            if (r7 != 0) goto L_0x017a
            g0.e r7 = new g0.e
            r7.<init>()
            r9 = r2
        L_0x010e:
            if (r9 >= r3) goto L_0x0161
            t9.g r10 = r1.f10808a
            short r10 = r10.readShort()
            r11 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r11
            t9.g r11 = r1.f10808a
            int r11 = r11.readInt()
            if (r10 == r15) goto L_0x014e
            r13 = 3
            if (r10 == r13) goto L_0x014c
            if (r10 == r8) goto L_0x0140
            if (r10 == r12) goto L_0x012a
            goto L_0x015b
        L_0x012a:
            if (r11 < r6) goto L_0x0132
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            if (r11 > r13) goto L_0x0132
            goto L_0x015b
        L_0x0132:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r0[r2] = r3
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            p9.d.b(r2, r0)
            throw r5
        L_0x0140:
            r10 = 7
            if (r11 < 0) goto L_0x0144
            goto L_0x015b
        L_0x0144:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            p9.d.b(r2, r0)
            throw r5
        L_0x014c:
            r10 = r8
            goto L_0x015b
        L_0x014e:
            if (r11 == 0) goto L_0x015b
            if (r11 != r4) goto L_0x0153
            goto L_0x015b
        L_0x0153:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            p9.d.b(r2, r0)
            throw r5
        L_0x015b:
            r7.d(r10, r11)
            int r9 = r9 + 6
            goto L_0x010e
        L_0x0161:
            p9.f$f r0 = (p9.f.C0128f) r0
            r0.getClass()
            p9.f r3 = p9.f.this     // Catch:{ RejectedExecutionException -> 0x0304 }
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r3.f10750h     // Catch:{ RejectedExecutionException -> 0x0304 }
            p9.m r6 = new p9.m     // Catch:{ RejectedExecutionException -> 0x0304 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ RejectedExecutionException -> 0x0304 }
            java.lang.String r3 = r3.f10746d     // Catch:{ RejectedExecutionException -> 0x0304 }
            r8[r2] = r3     // Catch:{ RejectedExecutionException -> 0x0304 }
            r6.<init>(r0, r8, r7)     // Catch:{ RejectedExecutionException -> 0x0304 }
            r5.execute(r6)     // Catch:{ RejectedExecutionException -> 0x0304 }
            goto L_0x0304
        L_0x017a:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_SETTINGS length %% 6 != 0: %s"
            p9.d.b(r2, r0)
            throw r5
        L_0x0188:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            p9.d.b(r2, r0)
            throw r5
        L_0x0190:
            if (r3 != r8) goto L_0x0207
            if (r10 == 0) goto L_0x01ff
            t9.g r3 = r1.f10808a
            int r3 = r3.readInt()
            int[] r6 = androidx.activity.f._values$1()
            int r7 = r6.length
            r8 = r2
        L_0x01a0:
            if (r8 >= r7) goto L_0x01ae
            r9 = r6[r8]
            int r11 = androidx.activity.f.c(r9)
            if (r11 != r3) goto L_0x01ab
            goto L_0x01af
        L_0x01ab:
            int r8 = r8 + 1
            goto L_0x01a0
        L_0x01ae:
            r9 = r2
        L_0x01af:
            if (r9 == 0) goto L_0x01f1
            p9.f$f r0 = (p9.f.C0128f) r0
            p9.f r3 = p9.f.this
            r3.getClass()
            if (r10 == 0) goto L_0x01c0
            r3 = r10 & 1
            if (r3 != 0) goto L_0x01c0
            r3 = r4
            goto L_0x01c1
        L_0x01c0:
            r3 = r2
        L_0x01c1:
            p9.f r0 = p9.f.this
            if (r3 == 0) goto L_0x01db
            p9.k r3 = new p9.k
            java.lang.Object[] r5 = new java.lang.Object[r15]
            java.lang.String r6 = r0.f10746d
            r5[r2] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r5[r4] = r2
            r3.<init>(r0, r5, r10, r9)
            r0.o(r3)
            goto L_0x0304
        L_0x01db:
            p9.q r2 = r0.s(r10)
            if (r2 == 0) goto L_0x0304
            monitor-enter(r2)
            int r0 = r2.k     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x01eb
            r2.k = r9     // Catch:{ all -> 0x01ee }
            r2.notifyAll()     // Catch:{ all -> 0x01ee }
        L_0x01eb:
            monitor-exit(r2)
            goto L_0x0304
        L_0x01ee:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01f1:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_RST_STREAM unexpected error code: %d"
            p9.d.b(r2, r0)
            throw r5
        L_0x01ff:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            p9.d.b(r2, r0)
            throw r5
        L_0x0207:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_RST_STREAM length: %d != 4"
            p9.d.b(r2, r0)
            throw r5
        L_0x0215:
            if (r3 != r12) goto L_0x0230
            if (r10 == 0) goto L_0x0228
            t9.g r2 = r1.f10808a
            r2.readInt()
            t9.g r2 = r1.f10808a
            r2.readByte()
            r21.getClass()
            goto L_0x0304
        L_0x0228:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            p9.d.b(r2, r0)
            throw r5
        L_0x0230:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_PRIORITY length: %d != 5"
            p9.d.b(r2, r0)
            throw r5
        L_0x023e:
            if (r10 == 0) goto L_0x0309
            r5 = r9 & 1
            if (r5 == 0) goto L_0x0246
            r5 = r4
            goto L_0x0247
        L_0x0246:
            r5 = r2
        L_0x0247:
            r6 = r9 & 8
            if (r6 == 0) goto L_0x0255
            t9.g r6 = r1.f10808a
            byte r6 = r6.readByte()
            r6 = r6 & 255(0xff, float:3.57E-43)
            short r6 = (short) r6
            goto L_0x0256
        L_0x0255:
            r6 = r2
        L_0x0256:
            r7 = r9 & 32
            if (r7 == 0) goto L_0x0269
            t9.g r7 = r1.f10808a
            r7.readInt()
            t9.g r7 = r1.f10808a
            r7.readByte()
            r21.getClass()
            int r3 = r3 + -5
        L_0x0269:
            int r3 = a(r3, r9, r6)
            java.util.ArrayList r16 = r1.s(r3, r6, r9, r10)
            p9.f$f r0 = (p9.f.C0128f) r0
            p9.f r3 = p9.f.this
            r3.getClass()
            if (r10 == 0) goto L_0x0280
            r3 = r10 & 1
            if (r3 != 0) goto L_0x0280
            r3 = r4
            goto L_0x0281
        L_0x0280:
            r3 = r2
        L_0x0281:
            if (r3 == 0) goto L_0x02a2
            p9.f r0 = p9.f.this
            r0.getClass()
            p9.i r3 = new p9.i     // Catch:{ RejectedExecutionException -> 0x0304 }
            java.lang.Object[] r14 = new java.lang.Object[r15]     // Catch:{ RejectedExecutionException -> 0x0304 }
            java.lang.String r6 = r0.f10746d     // Catch:{ RejectedExecutionException -> 0x0304 }
            r14[r2] = r6     // Catch:{ RejectedExecutionException -> 0x0304 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ RejectedExecutionException -> 0x0304 }
            r14[r4] = r2     // Catch:{ RejectedExecutionException -> 0x0304 }
            r12 = r3
            r13 = r0
            r15 = r10
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ RejectedExecutionException -> 0x0304 }
            r0.o(r3)     // Catch:{ RejectedExecutionException -> 0x0304 }
            goto L_0x0304
        L_0x02a2:
            p9.f r3 = p9.f.this
            monitor-enter(r3)
            p9.f r6 = p9.f.this     // Catch:{ all -> 0x02fa }
            p9.q r6 = r6.j(r10)     // Catch:{ all -> 0x02fa }
            if (r6 != 0) goto L_0x02fc
            p9.f r6 = p9.f.this     // Catch:{ all -> 0x02fa }
            boolean r7 = r6.f10749g     // Catch:{ all -> 0x02fa }
            if (r7 == 0) goto L_0x02b4
            goto L_0x02f8
        L_0x02b4:
            int r7 = r6.f10747e     // Catch:{ all -> 0x02fa }
            if (r10 > r7) goto L_0x02b9
            goto L_0x02f8
        L_0x02b9:
            int r7 = r10 % 2
            int r6 = r6.f10748f     // Catch:{ all -> 0x02fa }
            int r6 = r6 % r15
            if (r7 != r6) goto L_0x02c1
            goto L_0x02f8
        L_0x02c1:
            j9.p r17 = k9.e.u(r16)     // Catch:{ all -> 0x02fa }
            p9.q r6 = new p9.q     // Catch:{ all -> 0x02fa }
            p9.f r14 = p9.f.this     // Catch:{ all -> 0x02fa }
            r7 = 0
            r12 = r6
            r13 = r10
            r11 = r15
            r15 = r7
            r16 = r5
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x02fa }
            p9.f r5 = p9.f.this     // Catch:{ all -> 0x02fa }
            r5.f10747e = r10     // Catch:{ all -> 0x02fa }
            java.util.LinkedHashMap r5 = r5.f10745c     // Catch:{ all -> 0x02fa }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02fa }
            r5.put(r7, r6)     // Catch:{ all -> 0x02fa }
            java.util.concurrent.ThreadPoolExecutor r5 = p9.f.f10742x     // Catch:{ all -> 0x02fa }
            p9.l r7 = new p9.l     // Catch:{ all -> 0x02fa }
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ all -> 0x02fa }
            p9.f r9 = p9.f.this     // Catch:{ all -> 0x02fa }
            java.lang.String r9 = r9.f10746d     // Catch:{ all -> 0x02fa }
            r8[r2] = r9     // Catch:{ all -> 0x02fa }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02fa }
            r8[r4] = r2     // Catch:{ all -> 0x02fa }
            r7.<init>(r0, r8, r6)     // Catch:{ all -> 0x02fa }
            r5.execute(r7)     // Catch:{ all -> 0x02fa }
        L_0x02f8:
            monitor-exit(r3)     // Catch:{ all -> 0x02fa }
            goto L_0x0304
        L_0x02fa:
            r0 = move-exception
            goto L_0x0307
        L_0x02fc:
            monitor-exit(r3)     // Catch:{ all -> 0x02fa }
            j9.p r0 = k9.e.u(r16)
            r6.h(r0, r5)
        L_0x0304:
            r0 = r4
            goto L_0x0479
        L_0x0307:
            monitor-exit(r3)     // Catch:{ all -> 0x02fa }
            throw r0
        L_0x0309:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            p9.d.b(r0, r2)
            throw r5
        L_0x0311:
            r11 = r15
            if (r10 == 0) goto L_0x0470
            r6 = r9 & 1
            if (r6 == 0) goto L_0x031b
            r18 = r4
            goto L_0x031d
        L_0x031b:
            r18 = r2
        L_0x031d:
            r6 = r9 & 32
            if (r6 == 0) goto L_0x0323
            r6 = r4
            goto L_0x0324
        L_0x0323:
            r6 = r2
        L_0x0324:
            if (r6 != 0) goto L_0x0468
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0334
            t9.g r5 = r1.f10808a
            byte r5 = r5.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            short r5 = (short) r5
            goto L_0x0335
        L_0x0334:
            r5 = r2
        L_0x0335:
            int r3 = a(r3, r9, r5)
            t9.g r6 = r1.f10808a
            p9.f$f r0 = (p9.f.C0128f) r0
            p9.f r7 = p9.f.this
            r7.getClass()
            if (r10 == 0) goto L_0x034a
            r7 = r10 & 1
            if (r7 != 0) goto L_0x034a
            r7 = r4
            goto L_0x034b
        L_0x034a:
            r7 = r2
        L_0x034b:
            if (r7 == 0) goto L_0x039c
            p9.f r0 = p9.f.this
            r0.getClass()
            t9.e r7 = new t9.e
            r7.<init>()
            long r8 = (long) r3
            r6.D(r8)
            r6.z(r7, r8)
            long r12 = r7.f12045b
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0380
            p9.j r6 = new p9.j
            java.lang.Object[] r14 = new java.lang.Object[r11]
            java.lang.String r8 = r0.f10746d
            r14[r2] = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r14[r4] = r2
            r12 = r6
            r13 = r0
            r15 = r10
            r16 = r7
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.o(r6)
            goto L_0x03b2
        L_0x0380:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r4 = r7.f12045b
            r2.append(r4)
            java.lang.String r4 = " != "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x039c:
            p9.f r7 = p9.f.this
            p9.q r7 = r7.j(r10)
            if (r7 != 0) goto L_0x03b6
            p9.f r2 = p9.f.this
            r2.A(r10, r11)
            p9.f r0 = p9.f.this
            long r2 = (long) r3
            r0.u(r2)
            r6.skip(r2)
        L_0x03b2:
            r17 = r5
            goto L_0x045f
        L_0x03b6:
            p9.q$b r0 = r7.f10824g
            long r9 = (long) r3
        L_0x03b9:
            r11 = 0
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0452
            p9.q r3 = p9.q.this
            monitor-enter(r3)
            boolean r13 = r0.f10837e     // Catch:{ all -> 0x044f }
            t9.e r14 = r0.f10834b     // Catch:{ all -> 0x044f }
            long r14 = r14.f12045b     // Catch:{ all -> 0x044f }
            long r14 = r14 + r9
            r17 = r5
            long r4 = r0.f10835c     // Catch:{ all -> 0x044f }
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x03d3
            r4 = 1
            goto L_0x03d4
        L_0x03d3:
            r4 = r2
        L_0x03d4:
            monitor-exit(r3)     // Catch:{ all -> 0x044f }
            if (r4 == 0) goto L_0x03e1
            r6.skip(r9)
            p9.q r0 = p9.q.this
            r0.e(r8)
            goto L_0x0457
        L_0x03e1:
            if (r13 == 0) goto L_0x03e8
            r6.skip(r9)
            goto L_0x0457
        L_0x03e8:
            t9.e r3 = r0.f10833a
            long r3 = r6.z(r3, r9)
            r13 = -1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x0449
            long r9 = r9 - r3
            p9.q r3 = p9.q.this
            monitor-enter(r3)
            boolean r4 = r0.f10836d     // Catch:{ all -> 0x0446 }
            if (r4 == 0) goto L_0x0406
            t9.e r4 = r0.f10833a     // Catch:{ all -> 0x0446 }
            long r13 = r4.f12045b     // Catch:{ all -> 0x0446 }
            r4.c()     // Catch:{ all -> 0x0446 }
            r20 = r9
            goto L_0x042a
        L_0x0406:
            t9.e r4 = r0.f10834b     // Catch:{ all -> 0x0446 }
            r20 = r9
            long r8 = r4.f12045b     // Catch:{ all -> 0x0446 }
            int r5 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0412
            r5 = 1
            goto L_0x0413
        L_0x0412:
            r5 = r2
        L_0x0413:
            t9.e r8 = r0.f10833a     // Catch:{ all -> 0x0446 }
            if (r8 == 0) goto L_0x043e
        L_0x0417:
            r9 = 8192(0x2000, double:4.0474E-320)
            long r9 = r8.z(r4, r9)     // Catch:{ all -> 0x0446 }
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x0422
            goto L_0x0417
        L_0x0422:
            if (r5 == 0) goto L_0x0429
            p9.q r4 = p9.q.this     // Catch:{ all -> 0x0446 }
            r4.notifyAll()     // Catch:{ all -> 0x0446 }
        L_0x0429:
            r13 = r11
        L_0x042a:
            monitor-exit(r3)     // Catch:{ all -> 0x0446 }
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0436
            p9.q r3 = p9.q.this
            p9.f r3 = r3.f10821d
            r3.u(r13)
        L_0x0436:
            r9 = r20
            r5 = r17
            r4 = 1
            r8 = 4
            goto L_0x03b9
        L_0x043e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0446 }
            java.lang.String r2 = "source == null"
            r0.<init>(r2)     // Catch:{ all -> 0x0446 }
            throw r0     // Catch:{ all -> 0x0446 }
        L_0x0446:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0446 }
            throw r0
        L_0x0449:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x044f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x044f }
            throw r0
        L_0x0452:
            r17 = r5
            r0.getClass()
        L_0x0457:
            if (r18 == 0) goto L_0x045f
            j9.p r0 = k9.e.f9154c
            r2 = 1
            r7.h(r0, r2)
        L_0x045f:
            t9.g r0 = r1.f10808a
            r2 = r17
            long r2 = (long) r2
            r0.skip(r2)
            goto L_0x0478
        L_0x0468:
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            p9.d.b(r0, r2)
            throw r5
        L_0x0470:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            p9.d.b(r0, r2)
            throw r5
        L_0x0478:
            r0 = 1
        L_0x0479:
            return r0
        L_0x047a:
            r0 = r4
            java.lang.String r4 = "FRAME_SIZE_ERROR: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            p9.d.b(r4, r0)
            throw r5
        L_0x0489:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.p.c(boolean, p9.p$b):boolean");
    }

    public final void close() {
        this.f10808a.close();
    }

    public final void j(b bVar) {
        if (!this.f10810c) {
            g gVar = this.f10808a;
            h hVar = d.f10735a;
            h b10 = gVar.b((long) hVar.f12049a.length);
            Logger logger = f10807e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(k9.e.j("<< CONNECTION %s", b10.f()));
            }
            if (!hVar.equals(b10)) {
                d.b("Expected a connection header but was %s", b10.m());
                throw null;
            }
        } else if (!c(true, bVar)) {
            d.b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public final void o(b bVar, int i10, int i11) {
        int i12;
        q[] qVarArr;
        if (i10 < 8) {
            d.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            throw null;
        } else if (i11 == 0) {
            int readInt = this.f10808a.readInt();
            int readInt2 = this.f10808a.readInt();
            int i13 = i10 - 8;
            int[] _values$1 = f._values$1();
            int length = _values$1.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    i12 = 0;
                    break;
                }
                i12 = _values$1[i14];
                if (f.c(i12) == readInt2) {
                    break;
                }
                i14++;
            }
            if (i12 != 0) {
                h hVar = h.f12048e;
                if (i13 > 0) {
                    hVar = this.f10808a.b((long) i13);
                }
                f.C0128f fVar = (f.C0128f) bVar;
                fVar.getClass();
                hVar.j();
                synchronized (f.this) {
                    qVarArr = (q[]) f.this.f10745c.values().toArray(new q[f.this.f10745c.size()]);
                    f.this.f10749g = true;
                }
                for (q qVar : qVarArr) {
                    if (qVar.f10820c > readInt && qVar.f()) {
                        synchronized (qVar) {
                            if (qVar.k == 0) {
                                qVar.k = 5;
                                qVar.notifyAll();
                            }
                        }
                        f.this.s(qVar.f10820c);
                    }
                }
                return;
            }
            d.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            d.b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    public final ArrayList s(int i10, short s10, byte b10, int i11) {
        a aVar = this.f10809b;
        aVar.f10816e = i10;
        aVar.f10813b = i10;
        aVar.f10817f = s10;
        aVar.f10814c = b10;
        aVar.f10815d = i11;
        c.a aVar2 = this.f10811d;
        while (!aVar2.f10720b.p()) {
            byte readByte = aVar2.f10720b.readByte() & 255;
            if (readByte != 128) {
                boolean z9 = false;
                if ((readByte & 128) == 128) {
                    int e10 = aVar2.e(readByte, 127) - 1;
                    if (e10 >= 0 && e10 <= c.f10717a.length - 1) {
                        z9 = true;
                    }
                    if (z9) {
                        aVar2.f10719a.add(c.f10717a[e10]);
                    } else {
                        int length = aVar2.f10724f + 1 + (e10 - c.f10717a.length);
                        if (length >= 0) {
                            b[] bVarArr = aVar2.f10723e;
                            if (length < bVarArr.length) {
                                aVar2.f10719a.add(bVarArr[length]);
                            }
                        }
                        StringBuilder g10 = androidx.activity.f.g("Header index too large ");
                        g10.append(e10 + 1);
                        throw new IOException(g10.toString());
                    }
                } else if (readByte == 64) {
                    h d10 = aVar2.d();
                    c.a(d10);
                    aVar2.c(new b(d10, aVar2.d()));
                } else if ((readByte & 64) == 64) {
                    aVar2.c(new b(aVar2.b(aVar2.e(readByte, 63) - 1), aVar2.d()));
                } else if ((readByte & 32) == 32) {
                    int e11 = aVar2.e(readByte, 31);
                    aVar2.f10722d = e11;
                    if (e11 < 0 || e11 > aVar2.f10721c) {
                        StringBuilder g11 = androidx.activity.f.g("Invalid dynamic table size update ");
                        g11.append(aVar2.f10722d);
                        throw new IOException(g11.toString());
                    }
                    int i12 = aVar2.f10726h;
                    if (e11 < i12) {
                        if (e11 == 0) {
                            Arrays.fill(aVar2.f10723e, (Object) null);
                            aVar2.f10724f = aVar2.f10723e.length - 1;
                            aVar2.f10725g = 0;
                            aVar2.f10726h = 0;
                        } else {
                            aVar2.a(i12 - e11);
                        }
                    }
                } else if (readByte == 16 || readByte == 0) {
                    h d11 = aVar2.d();
                    c.a(d11);
                    aVar2.f10719a.add(new b(d11, aVar2.d()));
                } else {
                    aVar2.f10719a.add(new b(aVar2.b(aVar2.e(readByte, 15) - 1), aVar2.d()));
                }
            } else {
                throw new IOException("index == 0");
            }
        }
        c.a aVar3 = this.f10811d;
        aVar3.getClass();
        ArrayList arrayList = new ArrayList(aVar3.f10719a);
        aVar3.f10719a.clear();
        return arrayList;
    }

    public final void t(b bVar, int i10, byte b10, int i11) {
        boolean z9 = false;
        if (i10 != 8) {
            d.b("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            throw null;
        } else if (i11 == 0) {
            int readInt = this.f10808a.readInt();
            int readInt2 = this.f10808a.readInt();
            if ((b10 & 1) != 0) {
                z9 = true;
            }
            f.C0128f fVar = (f.C0128f) bVar;
            fVar.getClass();
            if (z9) {
                synchronized (f.this) {
                    if (readInt == 1) {
                        try {
                            f.this.f10753l++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (readInt == 2) {
                        f.this.f10755n++;
                    } else if (readInt == 3) {
                        f fVar2 = f.this;
                        fVar2.getClass();
                        fVar2.notifyAll();
                    }
                }
                return;
            }
            try {
                f fVar3 = f.this;
                fVar3.f10750h.execute(new f.e(readInt, readInt2));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            d.b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    public final void u(b bVar, int i10, int i11) {
        if (i10 == 4) {
            long readInt = ((long) this.f10808a.readInt()) & 2147483647L;
            int i12 = (readInt > 0 ? 1 : (readInt == 0 ? 0 : -1));
            if (i12 != 0) {
                f.C0128f fVar = (f.C0128f) bVar;
                f fVar2 = f.this;
                if (i11 == 0) {
                    synchronized (fVar2) {
                        f fVar3 = f.this;
                        fVar3.f10758q += readInt;
                        fVar3.notifyAll();
                    }
                    return;
                }
                q j10 = fVar2.j(i11);
                if (j10 != null) {
                    synchronized (j10) {
                        j10.f10819b += readInt;
                        if (i12 > 0) {
                            j10.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            d.b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        d.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
        throw null;
    }
}
