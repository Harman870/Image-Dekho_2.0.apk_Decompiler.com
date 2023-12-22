package s9;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f11906a = new LinkedHashMap();

    public b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.f11906a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f11906a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public final X509Certificate a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.f11906a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof b) && ((b) obj).f11906a.equals(this.f11906a);
    }

    public final int hashCode() {
        return this.f11906a.hashCode();
    }
}
