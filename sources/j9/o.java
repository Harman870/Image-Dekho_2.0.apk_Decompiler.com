package j9;

import androidx.activity.f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import k9.e;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f8935a;

    /* renamed from: b  reason: collision with root package name */
    public final g f8936b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Certificate> f8937c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f8938d;

    public o(f0 f0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f8935a = f0Var;
        this.f8936b = gVar;
        this.f8937c = list;
        this.f8938d = list2;
    }

    public static o a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            g a10 = g.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                f0 a11 = f0.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List m2 = certificateArr != null ? e.m(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new o(a11, a10, m2, localCertificates != null ? e.m(localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (Certificate) it.next();
            arrayList.add(certificate instanceof X509Certificate ? String.valueOf(((X509Certificate) certificate).getSubjectDN()) : certificate.getType());
        }
        return arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f8935a.equals(oVar.f8935a) && this.f8936b.equals(oVar.f8936b) && this.f8937c.equals(oVar.f8937c) && this.f8938d.equals(oVar.f8938d);
    }

    public final int hashCode() {
        int hashCode = this.f8936b.hashCode();
        int hashCode2 = this.f8937c.hashCode();
        return this.f8938d.hashCode() + ((hashCode2 + ((hashCode + ((this.f8935a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder g10 = f.g("Handshake{tlsVersion=");
        g10.append(this.f8935a);
        g10.append(" cipherSuite=");
        g10.append(this.f8936b);
        g10.append(" peerCertificates=");
        g10.append(b(this.f8937c));
        g10.append(" localCertificates=");
        g10.append(b(this.f8938d));
        g10.append('}');
        return g10.toString();
    }
}
