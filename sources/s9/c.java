package s9;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final c f11907a = new c();

    public static ArrayList a(X509Certificate x509Certificate) {
        List<String> b10 = b(x509Certificate, 7);
        List<String> b11 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b11.size() + b10.size());
        arrayList.addAll(b10);
        arrayList.addAll(b11);
        return arrayList;
    }

    public static List<String> b(X509Certificate x509Certificate, int i10) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i10 && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ff A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.lang.String r9, java.security.cert.X509Certificate r10) {
        /*
            java.util.regex.Pattern r0 = k9.e.k
            java.util.regex.Matcher r0 = r0.matcher(r9)
            boolean r0 = r0.matches()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002b
            r0 = 7
            java.util.List r10 = b(r10, r0)
            int r0 = r10.size()
            r3 = r1
        L_0x0018:
            if (r3 >= r0) goto L_0x0100
            java.lang.Object r4 = r10.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0028
            goto L_0x00ff
        L_0x0028:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x002b:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r0)
            r0 = 2
            java.util.List r10 = b(r10, r0)
            java.util.Iterator r10 = r10.iterator()
        L_0x003a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r9 == 0) goto L_0x00fc
            int r3 = r9.length()
            if (r3 == 0) goto L_0x00fc
            java.lang.String r3 = "."
            boolean r4 = r9.startsWith(r3)
            if (r4 != 0) goto L_0x00fc
            java.lang.String r4 = ".."
            boolean r5 = r9.endsWith(r4)
            if (r5 == 0) goto L_0x0060
            goto L_0x00fc
        L_0x0060:
            if (r0 == 0) goto L_0x00fc
            int r5 = r0.length()
            if (r5 == 0) goto L_0x00fc
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto L_0x00fc
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L_0x0076
            goto L_0x00fc
        L_0x0076:
            boolean r4 = r9.endsWith(r3)
            r5 = 46
            if (r4 != 0) goto L_0x008e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x008f
        L_0x008e:
            r4 = r9
        L_0x008f:
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L_0x00a4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r3.toString()
        L_0x00a4:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "*"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x00b7
            boolean r0 = r4.equals(r0)
            goto L_0x00fd
        L_0x00b7:
            java.lang.String r3 = "*."
            boolean r6 = r0.startsWith(r3)
            if (r6 == 0) goto L_0x00fc
            r6 = 42
            int r6 = r0.indexOf(r6, r2)
            r7 = -1
            if (r6 == r7) goto L_0x00c9
            goto L_0x00fc
        L_0x00c9:
            int r6 = r4.length()
            int r8 = r0.length()
            if (r6 >= r8) goto L_0x00d4
            goto L_0x00fc
        L_0x00d4:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00db
            goto L_0x00fc
        L_0x00db:
            java.lang.String r0 = r0.substring(r2)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto L_0x00e6
            goto L_0x00fc
        L_0x00e6:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x00fa
            int r3 = r3 + -1
            int r0 = r4.lastIndexOf(r5, r3)
            if (r0 == r7) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r0 = r2
            goto L_0x00fd
        L_0x00fc:
            r0 = r1
        L_0x00fd:
            if (r0 == 0) goto L_0x003a
        L_0x00ff:
            r1 = r2
        L_0x0100:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
