package q9;

import android.os.Build;
import android.util.Log;
import j9.v;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k9.e;
import s9.d;

public class b extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f11376c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f11377d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f11378e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f11379f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f11380g;

    /* renamed from: h  reason: collision with root package name */
    public final C0133b f11381h;

    public static final class a extends androidx.activity.result.c {

        /* renamed from: b  reason: collision with root package name */
        public final Object f11382b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f11383c;

        public a(Object obj, Method method) {
            super(0);
            this.f11382b = obj;
            this.f11383c = method;
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final List f(String str, List list) {
            try {
                return (List) this.f11383c.invoke(this.f11382b, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* renamed from: q9.b$b  reason: collision with other inner class name */
    public static final class C0133b {

        /* renamed from: a  reason: collision with root package name */
        public final Method f11384a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f11385b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f11386c;

        public C0133b(Method method, Method method2, Method method3) {
            this.f11384a = method;
            this.f11385b = method2;
            this.f11386c = method3;
        }
    }

    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f11387a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f11388b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.f11388b = method;
            this.f11387a = x509TrustManager;
        }

        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f11388b.invoke(this.f11387a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f11387a.equals(cVar.f11387a) && this.f11388b.equals(cVar.f11388b);
        }

        public final int hashCode() {
            return (this.f11388b.hashCode() * 31) + this.f11387a.hashCode();
        }
    }

    public b(Class cls, Method method, Method method2, Method method3, Method method4) {
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method8 = cls2.getMethod("get", new Class[0]);
            method5 = cls2.getMethod("open", new Class[]{String.class});
            method6 = cls2.getMethod("warnIfOpen", new Class[0]);
            method7 = method8;
        } catch (Exception unused) {
            method6 = null;
            method5 = null;
        }
        this.f11381h = new C0133b(method7, method5, method6);
        this.f11376c = cls;
        this.f11377d = method;
        this.f11378e = method2;
        this.f11379f = method3;
        this.f11380g = method4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return ((java.lang.Boolean) r6.getMethod("isCleartextTrafficPermitted", new java.lang.Class[0]).invoke(r7, new java.lang.Object[0])).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean o(java.lang.String r5, java.lang.Class r6, java.lang.Object r7) {
        /*
            java.lang.String r0 = "isCleartextTrafficPermitted"
            r1 = 0
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r1] = r4     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.reflect.Method r3 = r6.getMethod(r0, r3)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            r4[r1] = r5     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object r5 = r3.invoke(r7, r4)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ NoSuchMethodException -> 0x001d }
            boolean r5 = r5.booleanValue()     // Catch:{ NoSuchMethodException -> 0x001d }
            return r5
        L_0x001d:
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.reflect.Method r5 = r6.getMethod(r0, r5)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object r5 = r5.invoke(r7, r6)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ NoSuchMethodException -> 0x002f }
            boolean r2 = r5.booleanValue()     // Catch:{ NoSuchMethodException -> 0x002f }
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.b.o(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    public final androidx.activity.result.c c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    public final d d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new s9.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<v> list) {
        if (this.f11376c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f11377d.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                    this.f11378e.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new AssertionError(e10);
                }
            }
            this.f11380g.invoke(sSLSocket, new Object[]{f.e(list)});
        }
    }

    public final void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (e.o(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e11);
            }
            throw e11;
        }
    }

    public final SSLContext i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Nullable
    public String j(SSLSocket sSLSocket) {
        if (!this.f11376c.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f11379f.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError(e10);
        }
    }

    @Nullable
    public final Object k() {
        C0133b bVar = this.f11381h;
        Method method = bVar.f11384a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            bVar.f11385b.invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean l(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return o(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
            throw new AssertionError("unable to determine cleartext support", e10);
        }
    }

    public final void m(int i10, String str, @Nullable Throwable th) {
        int min;
        int i11 = 5;
        if (i10 != 5) {
            i11 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i12 = 0;
        int length = str.length();
        while (i12 < length) {
            int indexOf = str.indexOf(10, i12);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, min));
                if (min >= indexOf) {
                    break;
                }
                i12 = min;
            }
            i12 = min + 1;
        }
    }

    public final void n(Object obj, String str) {
        C0133b bVar = this.f11381h;
        bVar.getClass();
        boolean z9 = false;
        if (obj != null) {
            try {
                bVar.f11386c.invoke(obj, new Object[0]);
                z9 = true;
            } catch (Exception unused) {
            }
        }
        if (!z9) {
            m(5, str, (Throwable) null);
        }
    }
}
