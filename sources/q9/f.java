package q9;

import androidx.activity.result.c;
import j9.u;
import j9.v;
import java.io.EOFException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import s9.a;
import s9.b;
import s9.d;
import t9.e;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f11399a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f11400b = Logger.getLogger(u.class.getName());

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: q9.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: q9.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: q9.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: q9.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: q9.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: q9.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: q9.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        if (r0 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013b  */
    static {
        /*
            java.lang.String r0 = "java.vm.name"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "Dalvik"
            boolean r1 = r2.equals(r1)
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.String r6 = java.lang.System.getProperty(r0)
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x001e
            goto L_0x002f
        L_0x001e:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ NoClassDefFoundError -> 0x0021 }
            goto L_0x0022
        L_0x0021:
            r6 = r3
        L_0x0022:
            r7 = 29
            if (r6 < r7) goto L_0x002f
            java.lang.Class.forName(r1)     // Catch:{ ReflectiveOperationException -> 0x002f }
            q9.a r6 = new q9.a     // Catch:{ ReflectiveOperationException -> 0x002f }
            r6.<init>()     // Catch:{ ReflectiveOperationException -> 0x002f }
            goto L_0x0030
        L_0x002f:
            r6 = r5
        L_0x0030:
            if (r6 == 0) goto L_0x0034
            goto L_0x0141
        L_0x0034:
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x003f
            goto L_0x0090
        L_0x003f:
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0090 }
            java.lang.String r0 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r7 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0090 }
            java.lang.String r0 = "setUseSessionTickets"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x007b }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x007b }
            r1[r3] = r2     // Catch:{ NoSuchMethodException -> 0x007b }
            java.lang.reflect.Method r8 = r7.getDeclaredMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x007b }
            java.lang.String r0 = "setHostname"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x007b }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r3] = r2     // Catch:{ NoSuchMethodException -> 0x007b }
            java.lang.reflect.Method r9 = r7.getMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x007b }
            java.lang.String r0 = "getAlpnSelectedProtocol"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x007b }
            java.lang.reflect.Method r10 = r7.getMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x007b }
            java.lang.String r0 = "setAlpnProtocols"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x007b }
            java.lang.Class<byte[]> r2 = byte[].class
            r1[r3] = r2     // Catch:{ NoSuchMethodException -> 0x007b }
            java.lang.reflect.Method r11 = r7.getMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x007b }
            q9.b r5 = new q9.b     // Catch:{ NoSuchMethodException -> 0x007b }
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ NoSuchMethodException -> 0x007b }
            goto L_0x0090
        L_0x007b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected Android API level 21+ but was "
            java.lang.StringBuilder r1 = androidx.activity.f.g(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0090:
            if (r5 == 0) goto L_0x0095
        L_0x0092:
            r6 = r5
            goto L_0x0141
        L_0x0095:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "No platform found on Android"
            r0.<init>(r1)
            throw r0
        L_0x009d:
            java.lang.String r0 = "okhttp.platform"
            byte[] r1 = k9.e.f9152a
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ AccessControlException -> 0x00a8 }
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r0 = r5
        L_0x00a9:
            java.lang.String r1 = "conscrypt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b3
            r0 = r4
            goto L_0x00c3
        L_0x00b3:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r3]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Conscrypt"
            boolean r0 = r1.equals(r0)
        L_0x00c3:
            if (r0 == 0) goto L_0x00ce
            q9.c r0 = q9.c.o()
            if (r0 == 0) goto L_0x00ce
        L_0x00cb:
            r6 = r0
            goto L_0x0141
        L_0x00ce:
            java.lang.Class<javax.net.ssl.SSLParameters> r0 = javax.net.ssl.SSLParameters.class
            java.lang.String r1 = "setApplicationProtocols"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x00ed }
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r2[r3] = r6     // Catch:{ NoSuchMethodException -> 0x00ed }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x00ed }
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x00ed }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r6)     // Catch:{ NoSuchMethodException -> 0x00ed }
            q9.e r2 = new q9.e     // Catch:{ NoSuchMethodException -> 0x00ed }
            r2.<init>(r0, r1)     // Catch:{ NoSuchMethodException -> 0x00ed }
            r6 = r2
            goto L_0x00ee
        L_0x00ed:
            r6 = r5
        L_0x00ee:
            if (r6 == 0) goto L_0x00f1
            goto L_0x0141
        L_0x00f1:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r1 = java.lang.Class.forName(r1, r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r2, r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r2, r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.String r2 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            r6[r4] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.reflect.Method r7 = r0.getMethod(r2, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.String r1 = "get"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r2[r3] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.reflect.Method r8 = r0.getMethod(r1, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.String r1 = "remove"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.Class<javax.net.ssl.SSLSocket> r4 = javax.net.ssl.SSLSocket.class
            r2[r3] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            java.lang.reflect.Method r9 = r0.getMethod(r1, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            q9.d r0 = new q9.d     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0137 }
            r5 = r0
        L_0x0137:
            if (r5 == 0) goto L_0x013b
            goto L_0x0092
        L_0x013b:
            q9.f r0 = new q9.f
            r0.<init>()
            goto L_0x00cb
        L_0x0141:
            f11399a = r6
            java.lang.Class<j9.u> r0 = j9.u.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f11400b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.f.<clinit>():void");
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = (v) list.get(i10);
            if (vVar != v.HTTP_1_0) {
                arrayList.add(vVar.f9007a);
            }
        }
        return arrayList;
    }

    public static byte[] e(List<v> list) {
        e eVar = new e();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = list.get(i10);
            if (vVar != v.HTTP_1_0) {
                eVar.R(vVar.f9007a.length());
                String str = vVar.f9007a;
                eVar.W(0, str.length(), str);
            }
        }
        try {
            return eVar.E(eVar.f12045b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public void a(SSLSocket sSLSocket) {
    }

    public c c(X509TrustManager x509TrustManager) {
        return new a(d(x509TrustManager));
    }

    public d d(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, @Nullable String str, List<v> list) {
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        socket.connect(inetSocketAddress, i10);
    }

    public SSLContext i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Nullable
    public String j(SSLSocket sSLSocket) {
        return null;
    }

    @Nullable
    public Object k() {
        if (f11400b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean l(String str) {
        return true;
    }

    public void m(int i10, String str, @Nullable Throwable th) {
        f11400b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void n(Object obj, String str) {
        if (obj == null) {
            str = com.ironsource.adapters.ironsource.a.g(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m(5, str, (Throwable) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
