package m9;

import j9.a;
import j9.a0;
import j9.b0;
import j9.e0;
import j9.m;
import j9.o;
import j9.u;
import j9.v;
import j9.x;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import n9.c;
import o9.a;
import p9.d;
import p9.f;
import p9.q;
import p9.r;
import t9.s;
import t9.t;
import t9.z;

public final class e extends f.d {

    /* renamed from: b  reason: collision with root package name */
    public final f f9406b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f9407c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f9408d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f9409e;

    /* renamed from: f  reason: collision with root package name */
    public o f9410f;

    /* renamed from: g  reason: collision with root package name */
    public v f9411g;

    /* renamed from: h  reason: collision with root package name */
    public f f9412h;

    /* renamed from: i  reason: collision with root package name */
    public t f9413i;

    /* renamed from: j  reason: collision with root package name */
    public s f9414j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public int f9415l;

    /* renamed from: m  reason: collision with root package name */
    public int f9416m;

    /* renamed from: n  reason: collision with root package name */
    public int f9417n;

    /* renamed from: o  reason: collision with root package name */
    public int f9418o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f9419p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public long f9420q = Long.MAX_VALUE;

    public e(f fVar, e0 e0Var) {
        this.f9406b = fVar;
        this.f9407c = e0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0021, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(p9.f r5) {
        /*
            r4 = this;
            m9.f r0 = r4.f9406b
            monitor-enter(r0)
            monitor-enter(r5)     // Catch:{ all -> 0x001b }
            g0.e r1 = r5.f10760s     // Catch:{ all -> 0x001d }
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r1.f6454a     // Catch:{ all -> 0x001d }
            r3 = r3 & 16
            if (r3 == 0) goto L_0x0016
            java.lang.Object r1 = r1.f6455b     // Catch:{ all -> 0x001d }
            int[] r1 = (int[]) r1     // Catch:{ all -> 0x001d }
            r2 = 4
            r2 = r1[r2]     // Catch:{ all -> 0x001d }
        L_0x0016:
            monitor-exit(r5)     // Catch:{ all -> 0x001b }
            r4.f9418o = r2     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r5 = move-exception
            goto L_0x0020
        L_0x001d:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x001b }
            throw r1     // Catch:{ all -> 0x001b }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.e.a(p9.f):void");
    }

    public final void b(q qVar) {
        qVar.c(5, (IOException) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0134, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0134, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0134, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r10, int r11, int r12, boolean r13, j9.m r14) {
        /*
            r9 = this;
            j9.v r0 = r9.f9411g
            if (r0 != 0) goto L_0x0146
            j9.e0 r0 = r9.f9407c
            j9.a r0 = r0.f8868a
            java.util.List<j9.h> r1 = r0.f8815f
            m9.b r2 = new m9.b
            r2.<init>(r1)
            javax.net.ssl.SSLSocketFactory r3 = r0.f8818i
            if (r3 != 0) goto L_0x004c
            j9.h r0 = j9.h.f8900f
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x003f
            j9.e0 r0 = r9.f9407c
            j9.a r0 = r0.f8868a
            j9.q r0 = r0.f8810a
            java.lang.String r0 = r0.f8945d
            q9.f r1 = q9.f.f11399a
            boolean r1 = r1.l(r0)
            if (r1 == 0) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            m9.g r10 = new m9.g
            java.net.UnknownServiceException r11 = new java.net.UnknownServiceException
            java.lang.String r12 = "CLEARTEXT communication to "
            java.lang.String r13 = " not permitted by network security policy"
            java.lang.String r12 = androidx.fragment.app.w0.d(r12, r0, r13)
            r11.<init>(r12)
            r10.<init>(r11)
            throw r10
        L_0x003f:
            m9.g r10 = new m9.g
            java.net.UnknownServiceException r11 = new java.net.UnknownServiceException
            java.lang.String r12 = "CLEARTEXT communication not enabled for client"
            r11.<init>(r12)
            r10.<init>(r11)
            throw r10
        L_0x004c:
            java.util.List<j9.v> r0 = r0.f8814e
            j9.v r1 = j9.v.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0139
        L_0x0056:
            r0 = 0
            r1 = r0
        L_0x0058:
            r3 = 1
            r4 = 0
            j9.e0 r5 = r9.f9407c     // Catch:{ IOException -> 0x00d6 }
            j9.a r6 = r5.f8868a     // Catch:{ IOException -> 0x00d6 }
            javax.net.ssl.SSLSocketFactory r6 = r6.f8818i     // Catch:{ IOException -> 0x00d6 }
            if (r6 == 0) goto L_0x006e
            java.net.Proxy r5 = r5.f8869b     // Catch:{ IOException -> 0x00d6 }
            java.net.Proxy$Type r5 = r5.type()     // Catch:{ IOException -> 0x00d6 }
            java.net.Proxy$Type r6 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x00d6 }
            if (r5 != r6) goto L_0x006e
            r5 = r3
            goto L_0x006f
        L_0x006e:
            r5 = r4
        L_0x006f:
            if (r5 == 0) goto L_0x0079
            r9.e(r10, r11, r12, r14)     // Catch:{ IOException -> 0x00d6 }
            java.net.Socket r5 = r9.f9408d     // Catch:{ IOException -> 0x00d6 }
            if (r5 != 0) goto L_0x007c
            goto L_0x0086
        L_0x0079:
            r9.d(r10, r11, r14)     // Catch:{ IOException -> 0x00d6 }
        L_0x007c:
            r9.f(r2, r14)     // Catch:{ IOException -> 0x00d6 }
            j9.e0 r5 = r9.f9407c     // Catch:{ IOException -> 0x00d6 }
            java.net.InetSocketAddress r5 = r5.f8870c     // Catch:{ IOException -> 0x00d6 }
            r14.getClass()     // Catch:{ IOException -> 0x00d6 }
        L_0x0086:
            j9.e0 r10 = r9.f9407c
            j9.a r11 = r10.f8868a
            javax.net.ssl.SSLSocketFactory r11 = r11.f8818i
            if (r11 == 0) goto L_0x0099
            java.net.Proxy r10 = r10.f8869b
            java.net.Proxy$Type r10 = r10.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.HTTP
            if (r10 != r11) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r3 = r4
        L_0x009a:
            if (r3 == 0) goto L_0x00ae
            java.net.Socket r10 = r9.f9408d
            if (r10 == 0) goto L_0x00a1
            goto L_0x00ae
        L_0x00a1:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "Too many tunnel connections attempted: 21"
            r10.<init>(r11)
            m9.g r11 = new m9.g
            r11.<init>(r10)
            throw r11
        L_0x00ae:
            p9.f r10 = r9.f9412h
            if (r10 == 0) goto L_0x00d5
            m9.f r10 = r9.f9406b
            monitor-enter(r10)
            p9.f r11 = r9.f9412h     // Catch:{ all -> 0x00d2 }
            monitor-enter(r11)     // Catch:{ all -> 0x00d2 }
            g0.e r12 = r11.f10760s     // Catch:{ all -> 0x00cf }
            r13 = 2147483647(0x7fffffff, float:NaN)
            int r14 = r12.f6454a     // Catch:{ all -> 0x00cf }
            r14 = r14 & 16
            if (r14 == 0) goto L_0x00ca
            java.lang.Object r12 = r12.f6455b     // Catch:{ all -> 0x00cf }
            int[] r12 = (int[]) r12     // Catch:{ all -> 0x00cf }
            r13 = 4
            r13 = r12[r13]     // Catch:{ all -> 0x00cf }
        L_0x00ca:
            monitor-exit(r11)     // Catch:{ all -> 0x00d2 }
            r9.f9418o = r13     // Catch:{ all -> 0x00d2 }
            monitor-exit(r10)     // Catch:{ all -> 0x00d2 }
            goto L_0x00d5
        L_0x00cf:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00d2 }
            throw r12     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00d2 }
            throw r11
        L_0x00d5:
            return
        L_0x00d6:
            r5 = move-exception
            java.net.Socket r6 = r9.f9409e
            k9.e.d(r6)
            java.net.Socket r6 = r9.f9408d
            k9.e.d(r6)
            r9.f9409e = r0
            r9.f9408d = r0
            r9.f9413i = r0
            r9.f9414j = r0
            r9.f9410f = r0
            r9.f9411g = r0
            r9.f9412h = r0
            j9.e0 r6 = r9.f9407c
            java.net.InetSocketAddress r6 = r6.f8870c
            r14.getClass()
            if (r1 != 0) goto L_0x00fe
            m9.g r1 = new m9.g
            r1.<init>(r5)
            goto L_0x010d
        L_0x00fe:
            java.io.IOException r6 = r1.f9428a
            java.lang.reflect.Method r7 = k9.e.f9161j
            if (r7 == 0) goto L_0x010b
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x010b }
            r8[r4] = r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x010b }
            r7.invoke(r6, r8)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x010b }
        L_0x010b:
            r1.f9429b = r5
        L_0x010d:
            if (r13 == 0) goto L_0x0138
            r2.f9381d = r3
            boolean r3 = r2.f9380c
            if (r3 != 0) goto L_0x0116
            goto L_0x0134
        L_0x0116:
            boolean r3 = r5 instanceof java.net.ProtocolException
            if (r3 == 0) goto L_0x011b
            goto L_0x0134
        L_0x011b:
            boolean r3 = r5 instanceof java.io.InterruptedIOException
            if (r3 == 0) goto L_0x0120
            goto L_0x0134
        L_0x0120:
            boolean r3 = r5 instanceof javax.net.ssl.SSLHandshakeException
            if (r3 == 0) goto L_0x012d
            java.lang.Throwable r3 = r5.getCause()
            boolean r3 = r3 instanceof java.security.cert.CertificateException
            if (r3 == 0) goto L_0x012d
            goto L_0x0134
        L_0x012d:
            boolean r3 = r5 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L_0x0132
            goto L_0x0134
        L_0x0132:
            boolean r4 = r5 instanceof javax.net.ssl.SSLException
        L_0x0134:
            if (r4 == 0) goto L_0x0138
            goto L_0x0058
        L_0x0138:
            throw r1
        L_0x0139:
            m9.g r10 = new m9.g
            java.net.UnknownServiceException r11 = new java.net.UnknownServiceException
            java.lang.String r12 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r11.<init>(r12)
            r10.<init>(r11)
            throw r10
        L_0x0146:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "already connected"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.e.c(int, int, int, boolean, j9.m):void");
    }

    public final void d(int i10, int i11, m mVar) {
        Socket socket;
        e0 e0Var = this.f9407c;
        Proxy proxy = e0Var.f8869b;
        a aVar = e0Var.f8868a;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = aVar.f8812c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.f9408d = socket;
        InetSocketAddress inetSocketAddress = this.f9407c.f8870c;
        mVar.getClass();
        this.f9408d.setSoTimeout(i11);
        try {
            q9.f.f11399a.h(this.f9408d, this.f9407c.f8870c, i10);
            try {
                this.f9413i = new t(t9.q.b(this.f9408d));
                this.f9414j = new s(t9.q.a(this.f9408d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            StringBuilder g10 = androidx.activity.f.g("Failed to connect to ");
            g10.append(this.f9407c.f8870c);
            ConnectException connectException = new ConnectException(g10.toString());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void e(int i10, int i11, int i12, m mVar) {
        x.a aVar = new x.a();
        j9.q qVar = this.f9407c.f8868a.f8810a;
        if (qVar != null) {
            aVar.f9022a = qVar;
            aVar.b("CONNECT", (a0) null);
            aVar.f9024c.d("Host", k9.e.k(this.f9407c.f8868a.f8810a, true));
            aVar.f9024c.d("Proxy-Connection", "Keep-Alive");
            aVar.f9024c.d("User-Agent", "okhttp/3.14.9");
            x a10 = aVar.a();
            b0.a aVar2 = new b0.a();
            aVar2.f8833a = a10;
            aVar2.f8834b = v.HTTP_1_1;
            aVar2.f8835c = 407;
            aVar2.f8836d = "Preemptive Authenticate";
            aVar2.f8839g = k9.e.f9155d;
            aVar2.k = -1;
            aVar2.f8843l = -1;
            aVar2.f8838f.d("Proxy-Authenticate", "OkHttp-Preemptive");
            aVar2.a();
            this.f9407c.f8868a.f8813d.getClass();
            j9.q qVar2 = a10.f9016a;
            d(i10, i11, mVar);
            String str = "CONNECT " + k9.e.k(qVar2, true) + " HTTP/1.1";
            t tVar = this.f9413i;
            o9.a aVar3 = new o9.a((u) null, (e) null, tVar, this.f9414j);
            z e10 = tVar.e();
            long j10 = (long) i11;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            e10.g(j10, timeUnit);
            this.f9414j.e().g((long) i12, timeUnit);
            aVar3.l(a10.f9018c, str);
            aVar3.b();
            b0.a g10 = aVar3.g(false);
            g10.f8833a = a10;
            b0 a11 = g10.a();
            long a12 = n9.e.a(a11);
            if (a12 != -1) {
                a.d i13 = aVar3.i(a12);
                k9.e.r(i13, Integer.MAX_VALUE, timeUnit);
                i13.close();
            }
            int i14 = a11.f8823c;
            if (i14 != 200) {
                if (i14 == 407) {
                    this.f9407c.f8868a.f8813d.getClass();
                    throw new IOException("Failed to authenticate with proxy");
                }
                StringBuilder g11 = androidx.activity.f.g("Unexpected response code for CONNECT: ");
                g11.append(a11.f8823c);
                throw new IOException(g11.toString());
            } else if (!this.f9413i.f12075a.p() || !this.f9414j.f12072a.p()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            throw new NullPointerException("url == null");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012f A[Catch:{ all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0135 A[Catch:{ all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(m9.b r8, j9.m r9) {
        /*
            r7 = this;
            j9.v r0 = j9.v.HTTP_1_1
            j9.e0 r1 = r7.f9407c
            j9.a r1 = r1.f8868a
            javax.net.ssl.SSLSocketFactory r2 = r1.f8818i
            if (r2 != 0) goto L_0x0025
            java.util.List<j9.v> r8 = r1.f8814e
            j9.v r9 = j9.v.H2_PRIOR_KNOWLEDGE
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x001e
            java.net.Socket r8 = r7.f9408d
            r7.f9409e = r8
            r7.f9411g = r9
            r7.i()
            return
        L_0x001e:
            java.net.Socket r8 = r7.f9408d
            r7.f9409e = r8
            r7.f9411g = r0
            return
        L_0x0025:
            r9.getClass()
            j9.e0 r9 = r7.f9407c
            j9.a r9 = r9.f8868a
            javax.net.ssl.SSLSocketFactory r1 = r9.f8818i
            r2 = 0
            java.net.Socket r3 = r7.f9408d     // Catch:{ AssertionError -> 0x0128 }
            j9.q r4 = r9.f8810a     // Catch:{ AssertionError -> 0x0128 }
            java.lang.String r5 = r4.f8945d     // Catch:{ AssertionError -> 0x0128 }
            int r4 = r4.f8946e     // Catch:{ AssertionError -> 0x0128 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r5, r4, r6)     // Catch:{ AssertionError -> 0x0128 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x0128 }
            j9.h r8 = r8.a(r1)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            boolean r3 = r8.f8902b     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            if (r3 == 0) goto L_0x0051
            q9.f r3 = q9.f.f11399a     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            j9.q r4 = r9.f8810a     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r4 = r4.f8945d     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.util.List<j9.v> r5 = r9.f8814e     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r3.g(r1, r4, r5)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
        L_0x0051:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            j9.o r4 = j9.o.a(r3)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            javax.net.ssl.HostnameVerifier r5 = r9.f8819j     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            j9.q r6 = r9.f8810a     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r6 = r6.f8945d     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            if (r3 != 0) goto L_0x00db
            java.util.List<java.security.cert.Certificate> r8 = r4.f8937c     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            boolean r0 = r8.isEmpty()     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r2 = "Hostname "
            if (r0 != 0) goto L_0x00bd
            r0 = 0
            java.lang.Object r8 = r8.get(r0)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r3.<init>()     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r3.append(r2)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            j9.q r9 = r9.f8810a     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r9 = r9.f8945d     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r3.append(r9)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r9 = " not verified:\n    certificate: "
            r3.append(r9)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r9 = j9.f.b(r8)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r3.append(r9)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r9 = "\n    DN: "
            r3.append(r9)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.security.Principal r9 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r9 = r9.getName()     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r3.append(r9)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r9 = "\n    subjectAltNames: "
            r3.append(r9)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.util.ArrayList r8 = s9.c.a(r8)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r3.append(r8)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r8 = r3.toString()     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r0.<init>(r8)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            throw r0     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
        L_0x00ba:
            r8 = move-exception
            goto L_0x0137
        L_0x00bd:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r0.<init>()     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r0.append(r2)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            j9.q r9 = r9.f8810a     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r9 = r9.f8945d     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r0.append(r9)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r9 = " not verified (no certificates)"
            r0.append(r9)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r9 = r0.toString()     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r8.<init>(r9)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            throw r8     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
        L_0x00db:
            j9.f r3 = r9.k     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            j9.q r9 = r9.f8810a     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r9 = r9.f8945d     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.util.List<java.security.cert.Certificate> r5 = r4.f8937c     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r3.a(r9, r5)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            boolean r8 = r8.f8902b     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            if (r8 == 0) goto L_0x00f0
            q9.f r8 = q9.f.f11399a     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.lang.String r2 = r8.j(r1)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
        L_0x00f0:
            r7.f9409e = r1     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            t9.b r8 = t9.q.b(r1)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            t9.t r9 = new t9.t     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r9.<init>(r8)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r7.f9413i = r9     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            java.net.Socket r8 = r7.f9409e     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            t9.a r8 = t9.q.a(r8)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            t9.s r9 = new t9.s     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r9.<init>(r8)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r7.f9414j = r9     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            r7.f9410f = r4     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            if (r2 == 0) goto L_0x0112
            j9.v r0 = j9.v.a(r2)     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
        L_0x0112:
            r7.f9411g = r0     // Catch:{ AssertionError -> 0x0123, all -> 0x00ba }
            q9.f r8 = q9.f.f11399a
            r8.a(r1)
            j9.v r8 = r7.f9411g
            j9.v r9 = j9.v.HTTP_2
            if (r8 != r9) goto L_0x0122
            r7.i()
        L_0x0122:
            return
        L_0x0123:
            r8 = move-exception
            r2 = r1
            goto L_0x0129
        L_0x0126:
            r8 = move-exception
            goto L_0x0136
        L_0x0128:
            r8 = move-exception
        L_0x0129:
            boolean r9 = k9.e.o(r8)     // Catch:{ all -> 0x0126 }
            if (r9 == 0) goto L_0x0135
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0126 }
            r9.<init>(r8)     // Catch:{ all -> 0x0126 }
            throw r9     // Catch:{ all -> 0x0126 }
        L_0x0135:
            throw r8     // Catch:{ all -> 0x0126 }
        L_0x0136:
            r1 = r2
        L_0x0137:
            if (r1 == 0) goto L_0x013e
            q9.f r9 = q9.f.f11399a
            r9.a(r1)
        L_0x013e:
            k9.e.d(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.e.f(m9.b, j9.m):void");
    }

    public final c g(u uVar, n9.f fVar) {
        if (this.f9412h != null) {
            return new p9.o(uVar, this, fVar, this.f9412h);
        }
        this.f9409e.setSoTimeout(fVar.f10396h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f9413i.e().g((long) fVar.f10396h, timeUnit);
        this.f9414j.e().g((long) fVar.f10397i, timeUnit);
        return new o9.a(uVar, this, this.f9413i, this.f9414j);
    }

    public final void h() {
        synchronized (this.f9406b) {
            this.k = true;
        }
    }

    public final void i() {
        boolean z9;
        int i10;
        this.f9409e.setSoTimeout(0);
        f.b bVar = new f.b();
        Socket socket = this.f9409e;
        String str = this.f9407c.f8868a.f8810a.f8945d;
        t tVar = this.f9413i;
        s sVar = this.f9414j;
        bVar.f10766a = socket;
        bVar.f10767b = str;
        bVar.f10768c = tVar;
        bVar.f10769d = sVar;
        bVar.f10770e = this;
        bVar.f10771f = 0;
        f fVar = new f(bVar);
        this.f9412h = fVar;
        r rVar = fVar.u;
        synchronized (rVar) {
            if (rVar.f10844e) {
                throw new IOException("closed");
            } else if (rVar.f10841b) {
                Logger logger = r.f10839g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(k9.e.j(">> CONNECTION %s", d.f10735a.f()));
                }
                rVar.f10840a.write((byte[]) d.f10735a.f12049a.clone());
                rVar.f10840a.flush();
            }
        }
        r rVar2 = fVar.u;
        g0.e eVar = fVar.f10759r;
        synchronized (rVar2) {
            if (!rVar2.f10844e) {
                rVar2.j(0, Integer.bitCount(eVar.f6454a) * 6, (byte) 4, (byte) 0);
                for (int i11 = 0; i11 < 10; i11++) {
                    if (((1 << i11) & eVar.f6454a) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        if (i11 == 4) {
                            i10 = 3;
                        } else if (i11 == 7) {
                            i10 = 4;
                        } else {
                            i10 = i11;
                        }
                        rVar2.f10840a.writeShort(i10);
                        rVar2.f10840a.writeInt(((int[]) eVar.f6455b)[i11]);
                    }
                }
                rVar2.f10840a.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int c10 = fVar.f10759r.c();
        if (c10 != 65535) {
            fVar.u.u(0, (long) (c10 - 65535));
        }
        new Thread(fVar.f10762v).start();
    }

    public final boolean j(j9.q qVar) {
        int i10 = qVar.f8946e;
        j9.q qVar2 = this.f9407c.f8868a.f8810a;
        if (i10 != qVar2.f8946e) {
            return false;
        }
        if (qVar.f8945d.equals(qVar2.f8945d)) {
            return true;
        }
        o oVar = this.f9410f;
        if (oVar == null || !s9.c.c(qVar.f8945d, (X509Certificate) oVar.f8937c.get(0))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Object obj;
        StringBuilder g10 = androidx.activity.f.g("Connection{");
        g10.append(this.f9407c.f8868a.f8810a.f8945d);
        g10.append(":");
        g10.append(this.f9407c.f8868a.f8810a.f8946e);
        g10.append(", proxy=");
        g10.append(this.f9407c.f8869b);
        g10.append(" hostAddress=");
        g10.append(this.f9407c.f8870c);
        g10.append(" cipherSuite=");
        o oVar = this.f9410f;
        if (oVar != null) {
            obj = oVar.f8936b;
        } else {
            obj = "none";
        }
        g10.append(obj);
        g10.append(" protocol=");
        g10.append(this.f9411g);
        g10.append('}');
        return g10.toString();
    }
}
