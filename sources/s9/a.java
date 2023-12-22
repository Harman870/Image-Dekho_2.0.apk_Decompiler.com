package s9;

import androidx.activity.result.c;

public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public final d f11905b;

    public a(d dVar) {
        super(0);
        this.f11905b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && ((a) obj).f11905b.equals(this.f11905b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0057 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List f(java.lang.String r10, java.util.List r11) {
        /*
            r9 = this;
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.Object r0 = r10.removeFirst()
            java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0
            r11.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0016:
            r3 = 9
            if (r1 >= r3) goto L_0x00a7
            int r3 = r11.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r11.get(r3)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            s9.d r5 = r9.f11905b
            java.security.cert.X509Certificate r5 = r5.a(r3)
            if (r5 == 0) goto L_0x005a
            int r2 = r11.size()
            if (r2 > r4) goto L_0x003a
            boolean r2 = r3.equals(r5)
            if (r2 != 0) goto L_0x003d
        L_0x003a:
            r11.add(r5)
        L_0x003d:
            java.security.Principal r2 = r5.getIssuerDN()
            java.security.Principal r3 = r5.getSubjectDN()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004d
        L_0x004b:
            r2 = r0
            goto L_0x0055
        L_0x004d:
            java.security.PublicKey r2 = r5.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x004b }
            r5.verify(r2)     // Catch:{ GeneralSecurityException -> 0x004b }
            r2 = r4
        L_0x0055:
            if (r2 == 0) goto L_0x0058
            return r11
        L_0x0058:
            r2 = r4
            goto L_0x008a
        L_0x005a:
            java.util.Iterator r5 = r10.iterator()
        L_0x005e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x008d
            java.lang.Object r6 = r5.next()
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.security.Principal r7 = r3.getIssuerDN()
            java.security.Principal r8 = r6.getSubjectDN()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x007a
        L_0x0078:
            r7 = r0
            goto L_0x0082
        L_0x007a:
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x0078 }
            r3.verify(r7)     // Catch:{ GeneralSecurityException -> 0x0078 }
            r7 = r4
        L_0x0082:
            if (r7 == 0) goto L_0x005e
            r5.remove()
            r11.add(r6)
        L_0x008a:
            int r1 = r1 + 1
            goto L_0x0016
        L_0x008d:
            if (r2 == 0) goto L_0x0090
            return r11
        L_0x0090:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r11.append(r0)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00a7:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Certificate chain too long: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.a.f(java.lang.String, java.util.List):java.util.List");
    }

    public final int hashCode() {
        return this.f11905b.hashCode();
    }
}
