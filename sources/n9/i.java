package n9;

import j9.b0;
import j9.r;
import j9.u;
import j9.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import m9.d;

public final class i implements r {

    /* renamed from: a  reason: collision with root package name */
    public final u f10402a;

    public i(u uVar) {
        this.f10402a = uVar;
    }

    public static int c(b0 b0Var, int i10) {
        String a10 = b0Var.a("Retry-After");
        if (a10 == null) {
            return i10;
        }
        if (a10.matches("\\d+")) {
            return Integer.valueOf(a10).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: j9.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: s9.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: javax.net.ssl.SSLSocketFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: j9.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: j9.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: s9.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: s9.c} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [m9.d, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r3v53 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x01fe A[SYNTHETIC] */
    public final j9.b0 a(n9.f r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            j9.x r0 = r2.f10393e
            m9.i r9 = r2.f10390b
            r3 = 0
            r4 = 0
            r10 = r0
            r11 = r3
            r12 = r4
        L_0x000d:
            j9.x r0 = r9.f9445g
            r4 = 1
            if (r0 == 0) goto L_0x003c
            j9.q r0 = r0.f9016a
            j9.q r5 = r10.f9016a
            boolean r0 = k9.e.q(r0, r5)
            if (r0 == 0) goto L_0x0028
            m9.d r0 = r9.f9446h
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0028
            r25 = r12
            goto L_0x0094
        L_0x0028:
            m9.c r0 = r9.f9448j
            if (r0 != 0) goto L_0x0036
            m9.d r0 = r9.f9446h
            if (r0 == 0) goto L_0x003c
            r9.d(r3, r4)
            r9.f9446h = r3
            goto L_0x003c
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x003c:
            r9.f9445g = r10
            m9.d r0 = new m9.d
            m9.f r5 = r9.f9440b
            j9.q r4 = r10.f9016a
            java.lang.String r6 = r4.f8942a
            java.lang.String r7 = "https"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x005d
            j9.u r3 = r9.f9439a
            javax.net.ssl.SSLSocketFactory r6 = r3.f8989j
            s9.c r7 = r3.f8990l
            j9.f r3 = r3.f8991m
            r20 = r3
            r18 = r6
            r19 = r7
            goto L_0x0063
        L_0x005d:
            r18 = r3
            r19 = r18
            r20 = r19
        L_0x0063:
            j9.a r6 = new j9.a
            java.lang.String r14 = r4.f8945d
            int r15 = r4.f8946e
            j9.u r3 = r9.f9439a
            com.ironsource.adapters.ironsource.a r4 = r3.f8995q
            javax.net.SocketFactory r7 = r3.f8988i
            androidx.activity.e r8 = r3.f8992n
            java.util.List<j9.v> r13 = r3.f8981b
            r25 = r12
            java.util.List<j9.h> r12 = r3.f8982c
            java.net.ProxySelector r3 = r3.f8986g
            r22 = r13
            r13 = r6
            r16 = r4
            r17 = r7
            r21 = r8
            r23 = r12
            r24 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            j9.d r7 = r9.f9441c
            j9.m r8 = r9.f9442d
            r3 = r0
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f9446h = r0
        L_0x0094:
            m9.f r3 = r9.f9440b
            monitor-enter(r3)
            boolean r0 = r9.f9450m     // Catch:{ all -> 0x0285 }
            monitor-exit(r3)     // Catch:{ all -> 0x0285 }
            if (r0 != 0) goto L_0x027d
            r3 = 0
            j9.b0 r0 = r2.b(r10, r9, r3)     // Catch:{ g -> 0x0264, IOException -> 0x0253 }
            if (r11 == 0) goto L_0x00c6
            j9.b0$a r4 = new j9.b0$a
            r4.<init>(r0)
            j9.b0$a r0 = new j9.b0$a
            r0.<init>(r11)
            r0.f8839g = r3
            j9.b0 r0 = r0.a()
            j9.d0 r3 = r0.f8827g
            if (r3 != 0) goto L_0x00be
            r4.f8842j = r0
            j9.b0 r0 = r4.a()
            goto L_0x00c6
        L_0x00be:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "priorResponse.body != null"
            r0.<init>(r2)
            throw r0
        L_0x00c6:
            r11 = r0
            j9.u$a r0 = k9.a.f9148a
            r0.getClass()
            m9.c r0 = r11.f8832m
            if (r0 == 0) goto L_0x00d7
            m9.e r3 = r0.a()
            j9.e0 r3 = r3.f9407c
            goto L_0x00d8
        L_0x00d7:
            r3 = 0
        L_0x00d8:
            int r4 = r11.f8823c
            j9.x r5 = r11.f8821a
            java.lang.String r5 = r5.f9017b
            r6 = 307(0x133, float:4.3E-43)
            java.lang.String r7 = "GET"
            if (r4 == r6) goto L_0x0155
            r6 = 308(0x134, float:4.32E-43)
            if (r4 == r6) goto L_0x0155
            r6 = 401(0x191, float:5.62E-43)
            if (r4 == r6) goto L_0x014d
            r6 = 503(0x1f7, float:7.05E-43)
            if (r4 == r6) goto L_0x0138
            r6 = 407(0x197, float:5.7E-43)
            if (r4 == r6) goto L_0x0118
            r3 = 408(0x198, float:5.72E-43)
            if (r4 == r3) goto L_0x00fd
            switch(r4) {
                case 300: goto L_0x0164;
                case 301: goto L_0x0164;
                case 302: goto L_0x0164;
                case 303: goto L_0x0164;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            goto L_0x01a4
        L_0x00fd:
            j9.u r4 = r1.f10402a
            boolean r4 = r4.f8998t
            if (r4 != 0) goto L_0x0105
            goto L_0x01a4
        L_0x0105:
            j9.b0 r4 = r11.f8830j
            if (r4 == 0) goto L_0x010f
            int r4 = r4.f8823c
            if (r4 != r3) goto L_0x010f
            goto L_0x01a4
        L_0x010f:
            r3 = 0
            int r3 = c(r11, r3)
            if (r3 <= 0) goto L_0x014a
            goto L_0x01a4
        L_0x0118:
            if (r3 == 0) goto L_0x011d
            java.net.Proxy r3 = r3.f8869b
            goto L_0x0123
        L_0x011d:
            j9.u r3 = r1.f10402a
            r3.getClass()
            r3 = 0
        L_0x0123:
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP
            if (r3 != r4) goto L_0x0130
            j9.u r3 = r1.f10402a
            androidx.activity.e r3 = r3.f8992n
            goto L_0x0151
        L_0x0130:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r2 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r0.<init>(r2)
            throw r0
        L_0x0138:
            j9.b0 r3 = r11.f8830j
            if (r3 == 0) goto L_0x0141
            int r3 = r3.f8823c
            if (r3 != r6) goto L_0x0141
            goto L_0x01a4
        L_0x0141:
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = c(r11, r3)
            if (r3 != 0) goto L_0x01a4
        L_0x014a:
            j9.x r3 = r11.f8821a
            goto L_0x01a5
        L_0x014d:
            j9.u r3 = r1.f10402a
            androidx.activity.e r3 = r3.f8993o
        L_0x0151:
            r3.getClass()
            goto L_0x01a4
        L_0x0155:
            boolean r3 = r5.equals(r7)
            if (r3 != 0) goto L_0x0164
            java.lang.String r3 = "HEAD"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0164
            goto L_0x01a4
        L_0x0164:
            j9.u r3 = r1.f10402a
            boolean r3 = r3.f8997s
            if (r3 != 0) goto L_0x016b
            goto L_0x01a4
        L_0x016b:
            java.lang.String r3 = "Location"
            java.lang.String r3 = r11.a(r3)
            if (r3 != 0) goto L_0x0174
            goto L_0x01a4
        L_0x0174:
            j9.x r4 = r11.f8821a
            j9.q r4 = r4.f9016a
            r4.getClass()
            j9.q$a r6 = new j9.q$a     // Catch:{ IllegalArgumentException -> 0x0184 }
            r6.<init>()     // Catch:{ IllegalArgumentException -> 0x0184 }
            r6.b(r4, r3)     // Catch:{ IllegalArgumentException -> 0x0184 }
            goto L_0x0185
        L_0x0184:
            r6 = 0
        L_0x0185:
            if (r6 == 0) goto L_0x018c
            j9.q r3 = r6.a()
            goto L_0x018d
        L_0x018c:
            r3 = 0
        L_0x018d:
            if (r3 != 0) goto L_0x0190
            goto L_0x01a4
        L_0x0190:
            java.lang.String r4 = r3.f8942a
            j9.x r6 = r11.f8821a
            j9.q r6 = r6.f9016a
            java.lang.String r6 = r6.f8942a
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x01a7
            j9.u r4 = r1.f10402a
            boolean r4 = r4.f8996r
            if (r4 != 0) goto L_0x01a7
        L_0x01a4:
            r3 = 0
        L_0x01a5:
            r10 = r3
            goto L_0x01fc
        L_0x01a7:
            j9.x r4 = r11.f8821a
            r4.getClass()
            j9.x$a r6 = new j9.x$a
            r6.<init>(r4)
            boolean r4 = y3.a.q(r5)
            if (r4 == 0) goto L_0x01e6
            java.lang.String r4 = "PROPFIND"
            boolean r8 = r5.equals(r4)
            boolean r4 = r5.equals(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x01ca
            r4 = 0
            r6.b(r7, r4)
            goto L_0x01d5
        L_0x01ca:
            if (r8 == 0) goto L_0x01d1
            j9.x r4 = r11.f8821a
            j9.a0 r4 = r4.f9019d
            goto L_0x01d2
        L_0x01d1:
            r4 = 0
        L_0x01d2:
            r6.b(r5, r4)
        L_0x01d5:
            if (r8 != 0) goto L_0x01e6
            java.lang.String r4 = "Transfer-Encoding"
            r6.c(r4)
            java.lang.String r4 = "Content-Length"
            r6.c(r4)
            java.lang.String r4 = "Content-Type"
            r6.c(r4)
        L_0x01e6:
            j9.x r4 = r11.f8821a
            j9.q r4 = r4.f9016a
            boolean r4 = k9.e.q(r4, r3)
            if (r4 != 0) goto L_0x01f5
            java.lang.String r4 = "Authorization"
            r6.c(r4)
        L_0x01f5:
            r6.f9022a = r3
            j9.x r3 = r6.a()
            goto L_0x01a5
        L_0x01fc:
            if (r10 != 0) goto L_0x0218
            if (r0 == 0) goto L_0x0217
            boolean r0 = r0.f9386e
            if (r0 == 0) goto L_0x0217
            boolean r0 = r9.f9451n
            if (r0 != 0) goto L_0x0211
            r0 = 1
            r9.f9451n = r0
            m9.i$a r0 = r9.f9443e
            r0.l()
            goto L_0x0217
        L_0x0211:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0217:
            return r11
        L_0x0218:
            j9.d0 r3 = r11.f8827g
            k9.e.c(r3)
            m9.f r3 = r9.f9440b
            monitor-enter(r3)
            m9.c r4 = r9.f9448j     // Catch:{ all -> 0x024e }
            if (r4 == 0) goto L_0x0226
            r4 = 1
            goto L_0x0227
        L_0x0226:
            r4 = 0
        L_0x0227:
            monitor-exit(r3)     // Catch:{ all -> 0x024e }
            if (r4 == 0) goto L_0x0238
            n9.c r3 = r0.f9385d
            r3.cancel()
            m9.i r3 = r0.f9382a
            r4 = 1
            r5 = 0
            r3.c(r0, r4, r4, r5)
            r3 = r5
            goto L_0x023a
        L_0x0238:
            r0 = 0
            r3 = r0
        L_0x023a:
            int r12 = r25 + 1
            r0 = 20
            if (r12 > r0) goto L_0x0242
            goto L_0x000d
        L_0x0242:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r2 = "Too many follow-up requests: "
            java.lang.String r2 = androidx.activity.e.a(r2, r12)
            r0.<init>(r2)
            throw r0
        L_0x024e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x024e }
            throw r0
        L_0x0251:
            r0 = move-exception
            goto L_0x0279
        L_0x0253:
            r0 = move-exception
            r4 = r0
            r0 = 1
            boolean r5 = r4 instanceof p9.a     // Catch:{ all -> 0x0251 }
            if (r5 != 0) goto L_0x025b
            goto L_0x025c
        L_0x025b:
            r0 = 0
        L_0x025c:
            boolean r0 = r1.b(r4, r9, r0, r10)     // Catch:{ all -> 0x0251 }
            if (r0 == 0) goto L_0x0263
            goto L_0x026f
        L_0x0263:
            throw r4     // Catch:{ all -> 0x0251 }
        L_0x0264:
            r0 = move-exception
            r4 = r0
            java.io.IOException r0 = r4.f9429b     // Catch:{ all -> 0x0251 }
            r5 = 0
            boolean r0 = r1.b(r0, r9, r5, r10)     // Catch:{ all -> 0x0251 }
            if (r0 == 0) goto L_0x0276
        L_0x026f:
            r9.b()
            r12 = r25
            goto L_0x000d
        L_0x0276:
            java.io.IOException r0 = r4.f9428a     // Catch:{ all -> 0x0251 }
            throw r0     // Catch:{ all -> 0x0251 }
        L_0x0279:
            r9.b()
            throw r0
        L_0x027d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0285:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0285 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.i.a(n9.f):j9.b0");
    }

    public final boolean b(IOException iOException, m9.i iVar, boolean z9, x xVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (!this.f10402a.f8998t) {
            return false;
        }
        if (z9 && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z9)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        d dVar = iVar.f9446h;
        synchronized (dVar.f9399c) {
            z11 = dVar.f9404h;
        }
        if (!z11 || !iVar.f9446h.c()) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z12) {
            return false;
        }
        return true;
    }
}
