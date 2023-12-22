package j9;

import androidx.activity.e;
import androidx.activity.f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j9.q;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import s9.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final q f8810a;

    /* renamed from: b  reason: collision with root package name */
    public final l f8811b;

    /* renamed from: c  reason: collision with root package name */
    public final SocketFactory f8812c;

    /* renamed from: d  reason: collision with root package name */
    public final b f8813d;

    /* renamed from: e  reason: collision with root package name */
    public final List<v> f8814e;

    /* renamed from: f  reason: collision with root package name */
    public final List<h> f8815f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f8816g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f8817h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final SSLSocketFactory f8818i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final HostnameVerifier f8819j;
    @Nullable
    public final f k;

    public a(String str, int i10, com.ironsource.adapters.ironsource.a aVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable c cVar, @Nullable f fVar, e eVar, List list, List list2, ProxySelector proxySelector) {
        String str2 = str;
        int i11 = i10;
        com.ironsource.adapters.ironsource.a aVar2 = aVar;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        e eVar2 = eVar;
        ProxySelector proxySelector2 = proxySelector;
        q.a aVar3 = new q.a();
        String str3 = "https";
        String str4 = sSLSocketFactory2 != null ? str3 : "http";
        if (str4.equalsIgnoreCase("http")) {
            str3 = "http";
        } else if (!str4.equalsIgnoreCase(str3)) {
            throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.g("unexpected scheme: ", str4));
        }
        aVar3.f8951a = str3;
        if (str2 != null) {
            String b10 = k9.e.b(q.k(0, str.length(), str, false));
            if (b10 != null) {
                aVar3.f8954d = b10;
                if (i11 <= 0 || i11 > 65535) {
                    throw new IllegalArgumentException(e.a("unexpected port: ", i10));
                }
                aVar3.f8955e = i11;
                this.f8810a = aVar3.a();
                if (aVar2 != null) {
                    this.f8811b = aVar2;
                    if (socketFactory2 != null) {
                        this.f8812c = socketFactory2;
                        if (eVar2 != null) {
                            this.f8813d = eVar2;
                            if (list != null) {
                                this.f8814e = k9.e.l(list);
                                if (list2 != null) {
                                    this.f8815f = k9.e.l(list2);
                                    if (proxySelector2 != null) {
                                        this.f8816g = proxySelector2;
                                        this.f8817h = null;
                                        this.f8818i = sSLSocketFactory2;
                                        this.f8819j = cVar;
                                        this.k = fVar;
                                        return;
                                    }
                                    throw new NullPointerException("proxySelector == null");
                                }
                                throw new NullPointerException("connectionSpecs == null");
                            }
                            throw new NullPointerException("protocols == null");
                        }
                        throw new NullPointerException("proxyAuthenticator == null");
                    }
                    throw new NullPointerException("socketFactory == null");
                }
                throw new NullPointerException("dns == null");
            }
            throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.g("unexpected host: ", str));
        }
        throw new NullPointerException("host == null");
    }

    public final boolean a(a aVar) {
        if (!this.f8811b.equals(aVar.f8811b) || !this.f8813d.equals(aVar.f8813d) || !this.f8814e.equals(aVar.f8814e) || !this.f8815f.equals(aVar.f8815f) || !this.f8816g.equals(aVar.f8816g) || !Objects.equals(this.f8817h, aVar.f8817h) || !Objects.equals(this.f8818i, aVar.f8818i) || !Objects.equals(this.f8819j, aVar.f8819j) || !Objects.equals(this.k, aVar.k) || this.f8810a.f8946e != aVar.f8810a.f8946e) {
            return false;
        }
        return true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f8810a.equals(aVar.f8810a) && a(aVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.f8811b.hashCode();
        int hashCode2 = this.f8813d.hashCode();
        int hashCode3 = this.f8814e.hashCode();
        int hashCode4 = this.f8815f.hashCode();
        int hashCode5 = this.f8816g.hashCode();
        int hashCode6 = Objects.hashCode(this.f8817h);
        int hashCode7 = Objects.hashCode(this.f8818i);
        int hashCode8 = Objects.hashCode(this.f8819j);
        return Objects.hashCode(this.k) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f8810a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object obj;
        StringBuilder g10 = f.g("Address{");
        g10.append(this.f8810a.f8945d);
        g10.append(":");
        g10.append(this.f8810a.f8946e);
        if (this.f8817h != null) {
            g10.append(", proxy=");
            obj = this.f8817h;
        } else {
            g10.append(", proxySelector=");
            obj = this.f8816g;
        }
        g10.append(obj);
        g10.append("}");
        return g10.toString();
    }
}
