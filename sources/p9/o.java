package p9;

import j9.b0;
import j9.r;
import j9.u;
import j9.v;
import java.util.List;
import k9.e;
import n9.c;
import n9.f;
import t9.x;
import t9.y;

public final class o implements c {

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f10799g = e.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f10800h = e.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final r.a f10801a;

    /* renamed from: b  reason: collision with root package name */
    public final m9.e f10802b;

    /* renamed from: c  reason: collision with root package name */
    public final f f10803c;

    /* renamed from: d  reason: collision with root package name */
    public volatile q f10804d;

    /* renamed from: e  reason: collision with root package name */
    public final v f10805e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f10806f;

    public o(u uVar, m9.e eVar, f fVar, f fVar2) {
        this.f10802b = eVar;
        this.f10801a = fVar;
        this.f10803c = fVar2;
        List<v> list = uVar.f8981b;
        v vVar = v.H2_PRIOR_KNOWLEDGE;
        this.f10805e = !list.contains(vVar) ? v.HTTP_2 : vVar;
    }

    public final long a(b0 b0Var) {
        return n9.e.a(b0Var);
    }

    public final void b() {
        q qVar = this.f10804d;
        synchronized (qVar) {
            if (!qVar.f10823f) {
                if (!qVar.f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        qVar.f10825h.close();
    }

    public final void c() {
        this.f10803c.flush();
    }

    public final void cancel() {
        this.f10806f = true;
        if (this.f10804d != null) {
            this.f10804d.e(6);
        }
    }

    public final x d(j9.x xVar, long j10) {
        q qVar = this.f10804d;
        synchronized (qVar) {
            if (!qVar.f10823f) {
                if (!qVar.f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return qVar.f10825h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(j9.x r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            p9.q r2 = r1.f10804d
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            j9.a0 r2 = r0.f9019d
            r4 = 1
            if (r2 == 0) goto L_0x0010
            r2 = r4
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            j9.p r5 = r0.f9018c
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.String[] r7 = r5.f8939a
            int r7 = r7.length
            int r7 = r7 / 2
            r8 = 4
            int r7 = r7 + r8
            r6.<init>(r7)
            p9.b r7 = new p9.b
            t9.h r9 = p9.b.f10710f
            java.lang.String r10 = r0.f9017b
            r7.<init>((t9.h) r9, (java.lang.String) r10)
            r6.add(r7)
            p9.b r7 = new p9.b
            t9.h r9 = p9.b.f10711g
            j9.q r10 = r0.f9016a
            java.lang.String r10 = n9.h.a(r10)
            r7.<init>((t9.h) r9, (java.lang.String) r10)
            r6.add(r7)
            java.lang.String r7 = "Host"
            java.lang.String r7 = r0.a(r7)
            if (r7 == 0) goto L_0x004d
            p9.b r9 = new p9.b
            t9.h r10 = p9.b.f10713i
            r9.<init>((t9.h) r10, (java.lang.String) r7)
            r6.add(r9)
        L_0x004d:
            p9.b r7 = new p9.b
            t9.h r9 = p9.b.f10712h
            j9.q r0 = r0.f9016a
            java.lang.String r0 = r0.f8942a
            r7.<init>((t9.h) r9, (java.lang.String) r0)
            r6.add(r7)
            java.lang.String[] r0 = r5.f8939a
            int r0 = r0.length
            int r0 = r0 / 2
            r7 = 0
        L_0x0061:
            if (r7 >= r0) goto L_0x0098
            java.lang.String r9 = r5.d(r7)
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r10)
            java.util.List<java.lang.String> r10 = f10799g
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = "te"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0095
            java.lang.String r10 = r5.g(r7)
            java.lang.String r11 = "trailers"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0095
        L_0x0089:
            p9.b r10 = new p9.b
            java.lang.String r11 = r5.g(r7)
            r10.<init>((java.lang.String) r9, (java.lang.String) r11)
            r6.add(r10)
        L_0x0095:
            int r7 = r7 + 1
            goto L_0x0061
        L_0x0098:
            p9.f r5 = r1.f10803c
            r0 = r2 ^ 1
            r13 = 0
            p9.r r7 = r5.u
            monitor-enter(r7)
            monitor-enter(r5)     // Catch:{ all -> 0x0186 }
            int r9 = r5.f10748f     // Catch:{ all -> 0x0183 }
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r9 <= r10) goto L_0x00ac
            r9 = 5
            r5.t(r9)     // Catch:{ all -> 0x0183 }
        L_0x00ac:
            boolean r9 = r5.f10749g     // Catch:{ all -> 0x0183 }
            if (r9 != 0) goto L_0x017d
            int r15 = r5.f10748f     // Catch:{ all -> 0x0183 }
            int r9 = r15 + 2
            r5.f10748f = r9     // Catch:{ all -> 0x0183 }
            p9.q r14 = new p9.q     // Catch:{ all -> 0x0183 }
            r16 = 0
            r9 = r14
            r10 = r15
            r11 = r5
            r12 = r0
            r3 = r14
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0183 }
            if (r2 == 0) goto L_0x00d7
            long r9 = r5.f10758q     // Catch:{ all -> 0x0183 }
            r11 = 0
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x00d7
            long r9 = r3.f10819b     // Catch:{ all -> 0x0183 }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            r2 = 0
            goto L_0x00d8
        L_0x00d7:
            r2 = r4
        L_0x00d8:
            boolean r9 = r3.g()     // Catch:{ all -> 0x0183 }
            if (r9 == 0) goto L_0x00e7
            java.util.LinkedHashMap r9 = r5.f10745c     // Catch:{ all -> 0x0183 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0183 }
            r9.put(r10, r3)     // Catch:{ all -> 0x0183 }
        L_0x00e7:
            monitor-exit(r5)     // Catch:{ all -> 0x0183 }
            p9.r r9 = r5.u     // Catch:{ all -> 0x0186 }
            monitor-enter(r9)     // Catch:{ all -> 0x0186 }
            boolean r10 = r9.f10844e     // Catch:{ all -> 0x017a }
            if (r10 != 0) goto L_0x0172
            p9.c$b r10 = r9.f10845f     // Catch:{ all -> 0x017a }
            r10.d(r6)     // Catch:{ all -> 0x017a }
            t9.e r6 = r9.f10842c     // Catch:{ all -> 0x017a }
            long r10 = r6.f12045b     // Catch:{ all -> 0x017a }
            int r6 = r9.f10843d     // Catch:{ all -> 0x017a }
            long r12 = (long) r6     // Catch:{ all -> 0x017a }
            long r12 = java.lang.Math.min(r12, r10)     // Catch:{ all -> 0x017a }
            int r6 = (int) r12     // Catch:{ all -> 0x017a }
            long r12 = (long) r6     // Catch:{ all -> 0x017a }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0108
            r17 = r8
            goto L_0x010a
        L_0x0108:
            r17 = 0
        L_0x010a:
            if (r0 == 0) goto L_0x0110
            r0 = r17 | 1
            byte r0 = (byte) r0     // Catch:{ all -> 0x017a }
            goto L_0x0112
        L_0x0110:
            r0 = r17
        L_0x0112:
            r9.j(r15, r6, r4, r0)     // Catch:{ all -> 0x017a }
            t9.f r0 = r9.f10840a     // Catch:{ all -> 0x017a }
            t9.e r4 = r9.f10842c     // Catch:{ all -> 0x017a }
            r0.g(r4, r12)     // Catch:{ all -> 0x017a }
            if (r14 <= 0) goto L_0x0122
            long r10 = r10 - r12
            r9.v(r15, r10)     // Catch:{ all -> 0x017a }
        L_0x0122:
            monitor-exit(r9)     // Catch:{ all -> 0x0186 }
            monitor-exit(r7)     // Catch:{ all -> 0x0186 }
            if (r2 == 0) goto L_0x013f
            p9.r r2 = r5.u
            monitor-enter(r2)
            boolean r0 = r2.f10844e     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x0134
            t9.f r0 = r2.f10840a     // Catch:{ all -> 0x013c }
            r0.flush()     // Catch:{ all -> 0x013c }
            monitor-exit(r2)
            goto L_0x013f
        L_0x0134:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "closed"
            r0.<init>(r3)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x013c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x013f:
            r1.f10804d = r3
            boolean r0 = r1.f10806f
            if (r0 != 0) goto L_0x0164
            p9.q r0 = r1.f10804d
            p9.q$c r0 = r0.f10826i
            j9.r$a r2 = r1.f10801a
            n9.f r2 = (n9.f) r2
            int r2 = r2.f10396h
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.g(r2, r4)
            p9.q r0 = r1.f10804d
            p9.q$c r0 = r0.f10827j
            j9.r$a r2 = r1.f10801a
            n9.f r2 = (n9.f) r2
            int r2 = r2.f10397i
            long r2 = (long) r2
            r0.g(r2, r4)
            return
        L_0x0164:
            p9.q r0 = r1.f10804d
            r2 = 6
            r0.e(r2)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0172:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x017a }
            java.lang.String r2 = "closed"
            r0.<init>(r2)     // Catch:{ all -> 0x017a }
            throw r0     // Catch:{ all -> 0x017a }
        L_0x017a:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0186 }
            throw r0     // Catch:{ all -> 0x0186 }
        L_0x017d:
            p9.a r0 = new p9.a     // Catch:{ all -> 0x0183 }
            r0.<init>()     // Catch:{ all -> 0x0183 }
            throw r0     // Catch:{ all -> 0x0183 }
        L_0x0183:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0183 }
            throw r0     // Catch:{ all -> 0x0186 }
        L_0x0186:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0186 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.o.e(j9.x):void");
    }

    public final y f(b0 b0Var) {
        return this.f10804d.f10824g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ce, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        r0.f10826i.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d4, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j9.b0.a g(boolean r11) {
        /*
            r10 = this;
            p9.q r0 = r10.f10804d
            monitor-enter(r0)
            p9.q$c r1 = r0.f10826i     // Catch:{ all -> 0x00d5 }
            r1.i()     // Catch:{ all -> 0x00d5 }
        L_0x0008:
            java.util.ArrayDeque r1 = r0.f10822e     // Catch:{ all -> 0x00ce }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0018
            int r1 = r0.k     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x0018
            r0.i()     // Catch:{ all -> 0x00ce }
            goto L_0x0008
        L_0x0018:
            p9.q$c r1 = r0.f10826i     // Catch:{ all -> 0x00d5 }
            r1.o()     // Catch:{ all -> 0x00d5 }
            java.util.ArrayDeque r1 = r0.f10822e     // Catch:{ all -> 0x00d5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x00c1
            java.util.ArrayDeque r1 = r0.f10822e     // Catch:{ all -> 0x00d5 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00d5 }
            j9.p r1 = (j9.p) r1     // Catch:{ all -> 0x00d5 }
            monitor-exit(r0)
            j9.v r0 = r10.f10805e
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            r3 = 0
            java.lang.String[] r4 = r1.f8939a
            int r4 = r4.length
            int r4 = r4 / 2
            r5 = 0
            r6 = r5
        L_0x003f:
            if (r3 >= r4) goto L_0x0081
            java.lang.String r7 = r1.d(r3)
            java.lang.String r8 = r1.g(r3)
            java.lang.String r9 = ":status"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x0067
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "HTTP/1.1 "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            n9.j r6 = n9.j.a(r6)
            goto L_0x007e
        L_0x0067:
            java.util.List<java.lang.String> r9 = f10800h
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto L_0x007e
            j9.u$a r9 = k9.a.f9148a
            r9.getClass()
            r2.add(r7)
            java.lang.String r7 = r8.trim()
            r2.add(r7)
        L_0x007e:
            int r3 = r3 + 1
            goto L_0x003f
        L_0x0081:
            if (r6 == 0) goto L_0x00b9
            j9.b0$a r1 = new j9.b0$a
            r1.<init>()
            r1.f8834b = r0
            int r0 = r6.f10404b
            r1.f8835c = r0
            java.lang.String r0 = r6.f10405c
            r1.f8836d = r0
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            j9.p$a r2 = new j9.p$a
            r2.<init>()
            java.util.ArrayList r3 = r2.f8940a
            java.util.Collections.addAll(r3, r0)
            r1.f8838f = r2
            if (r11 == 0) goto L_0x00b8
            j9.u$a r11 = k9.a.f9148a
            r11.getClass()
            int r11 = r1.f8835c
            r0 = 100
            if (r11 != r0) goto L_0x00b8
            return r5
        L_0x00b8:
            return r1
        L_0x00b9:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r11.<init>(r0)
            throw r11
        L_0x00c1:
            java.io.IOException r11 = r0.f10828l     // Catch:{ all -> 0x00d5 }
            if (r11 == 0) goto L_0x00c6
            goto L_0x00cd
        L_0x00c6:
            p9.u r11 = new p9.u     // Catch:{ all -> 0x00d5 }
            int r1 = r0.k     // Catch:{ all -> 0x00d5 }
            r11.<init>(r1)     // Catch:{ all -> 0x00d5 }
        L_0x00cd:
            throw r11     // Catch:{ all -> 0x00d5 }
        L_0x00ce:
            r11 = move-exception
            p9.q$c r1 = r0.f10826i     // Catch:{ all -> 0x00d5 }
            r1.o()     // Catch:{ all -> 0x00d5 }
            throw r11     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.o.g(boolean):j9.b0$a");
    }

    public final m9.e h() {
        return this.f10802b;
    }
}
