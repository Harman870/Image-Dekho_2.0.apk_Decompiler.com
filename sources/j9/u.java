package j9;

import androidx.activity.result.c;
import j9.d;
import j9.j;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import k9.e;
import q9.f;
import u2.b;

public final class u implements Cloneable, d.a {

    /* renamed from: x  reason: collision with root package name */
    public static final List<v> f8978x = e.m(v.HTTP_2, v.HTTP_1_1);

    /* renamed from: y  reason: collision with root package name */
    public static final List<h> f8979y = e.m(h.f8899e, h.f8900f);

    /* renamed from: a  reason: collision with root package name */
    public final k f8980a;

    /* renamed from: b  reason: collision with root package name */
    public final List<v> f8981b;

    /* renamed from: c  reason: collision with root package name */
    public final List<h> f8982c;

    /* renamed from: d  reason: collision with root package name */
    public final List<r> f8983d;

    /* renamed from: e  reason: collision with root package name */
    public final List<r> f8984e;

    /* renamed from: f  reason: collision with root package name */
    public final b f8985f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f8986g;

    /* renamed from: h  reason: collision with root package name */
    public final j.a f8987h;

    /* renamed from: i  reason: collision with root package name */
    public final SocketFactory f8988i;

    /* renamed from: j  reason: collision with root package name */
    public final SSLSocketFactory f8989j;
    public final c k;

    /* renamed from: l  reason: collision with root package name */
    public final s9.c f8990l;

    /* renamed from: m  reason: collision with root package name */
    public final f f8991m;

    /* renamed from: n  reason: collision with root package name */
    public final androidx.activity.e f8992n;

    /* renamed from: o  reason: collision with root package name */
    public final androidx.activity.e f8993o;

    /* renamed from: p  reason: collision with root package name */
    public final y0.c f8994p;

    /* renamed from: q  reason: collision with root package name */
    public final com.ironsource.adapters.ironsource.a f8995q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f8996r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8997s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f8998t;
    public final int u;

    /* renamed from: v  reason: collision with root package name */
    public final int f8999v;
    public final int w;

    public class a extends k9.a {
    }

    static {
        k9.a.f9148a = new a();
    }

    public u() {
        boolean z9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        k kVar = new k();
        List<v> list = f8978x;
        List<h> list2 = f8979y;
        b bVar = new b(4, m.f8929a);
        ProxySelector proxySelector = ProxySelector.getDefault();
        proxySelector = proxySelector == null ? new r9.a() : proxySelector;
        j.a aVar = j.f8921a;
        SocketFactory socketFactory = SocketFactory.getDefault();
        s9.c cVar = s9.c.f11907a;
        f fVar = f.f8871c;
        androidx.activity.e eVar = b.f8820k0;
        y0.c cVar2 = new y0.c(5);
        com.ironsource.adapters.ironsource.a aVar2 = l.f8928l0;
        this.f8980a = kVar;
        this.f8981b = list;
        this.f8982c = list2;
        this.f8983d = e.l(arrayList);
        this.f8984e = e.l(arrayList2);
        this.f8985f = bVar;
        this.f8986g = proxySelector;
        this.f8987h = aVar;
        this.f8988i = socketFactory;
        Iterator<h> it = list2.iterator();
        loop0:
        while (true) {
            z9 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                h next = it.next();
                if (z9 || next.f8901a) {
                    z9 = true;
                }
            }
        }
        if (!z9) {
            this.f8989j = null;
            this.k = null;
        } else {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            f fVar2 = f.f11399a;
                            SSLContext i10 = fVar2.i();
                            i10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                            this.f8989j = i10.getSocketFactory();
                            this.k = fVar2.c(x509TrustManager);
                        } catch (GeneralSecurityException e10) {
                            throw new AssertionError("No System TLS", e10);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e11) {
                throw new AssertionError("No System TLS", e11);
            }
        }
        SSLSocketFactory sSLSocketFactory = this.f8989j;
        if (sSLSocketFactory != null) {
            f.f11399a.f(sSLSocketFactory);
        }
        this.f8990l = cVar;
        c cVar3 = this.k;
        this.f8991m = !Objects.equals(fVar.f8873b, cVar3) ? new f(fVar.f8872a, cVar3) : fVar;
        this.f8992n = eVar;
        this.f8993o = eVar;
        this.f8994p = cVar2;
        this.f8995q = aVar2;
        this.f8996r = true;
        this.f8997s = true;
        this.f8998t = true;
        this.u = 10000;
        this.f8999v = 10000;
        this.w = 10000;
        if (this.f8983d.contains((Object) null)) {
            StringBuilder g10 = androidx.activity.f.g("Null interceptor: ");
            g10.append(this.f8983d);
            throw new IllegalStateException(g10.toString());
        } else if (this.f8984e.contains((Object) null)) {
            StringBuilder g11 = androidx.activity.f.g("Null network interceptor: ");
            g11.append(this.f8984e);
            throw new IllegalStateException(g11.toString());
        }
    }
}
