package j9;

import androidx.activity.result.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import t9.h;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f8871c = new f(new LinkedHashSet(new ArrayList()), (c) null);

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f8872a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final c f8873b;

    public static final class a {
        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public f(Set<a> set, @Nullable c cVar) {
        this.f8872a = set;
        this.f8873b = cVar;
    }

    public static String b(X509Certificate x509Certificate) {
        if (x509Certificate instanceof X509Certificate) {
            StringBuilder g10 = androidx.activity.f.g("sha256/");
            try {
                g10.append(h.g(MessageDigest.getInstance("SHA-256").digest(h.g(x509Certificate.getPublicKey().getEncoded()).f12049a)).a());
                return g10.toString();
            } catch (NoSuchAlgorithmException e10) {
                throw new AssertionError(e10);
            }
        } else {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
    }

    public final void a(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        Iterator<a> it = this.f8872a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        } else if (!emptyList.isEmpty()) {
            c cVar = this.f8873b;
            if (cVar != null) {
                list = cVar.f(str, list);
            }
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i10);
                if (emptyList.size() <= 0) {
                    i10++;
                } else {
                    ((a) emptyList.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder h10 = com.ironsource.adapters.ironsource.a.h("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i11);
                h10.append("\n    ");
                h10.append(b(x509Certificate2));
                h10.append(": ");
                h10.append(x509Certificate2.getSubjectDN().getName());
            }
            h10.append("\n  Pinned certificates for ");
            h10.append(str);
            h10.append(":");
            int size3 = emptyList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                h10.append("\n    ");
                h10.append((a) emptyList.get(i12));
            }
            throw new SSLPeerUnverifiedException(h10.toString());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return Objects.equals(this.f8873b, fVar.f8873b) && this.f8872a.equals(fVar.f8872a);
        }
    }

    public final int hashCode() {
        return this.f8872a.hashCode() + (Objects.hashCode(this.f8873b) * 31);
    }
}
