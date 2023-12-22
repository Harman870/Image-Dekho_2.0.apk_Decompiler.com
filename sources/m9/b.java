package m9;

import androidx.activity.f;
import e0.d;
import j9.g;
import j9.h;
import j9.u;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import k9.a;
import k9.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<h> f9378a;

    /* renamed from: b  reason: collision with root package name */
    public int f9379b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9380c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9381d;

    public b(List<h> list) {
        this.f9378a = list;
    }

    public final h a(SSLSocket sSLSocket) {
        h hVar;
        boolean z9;
        String[] strArr;
        String[] strArr2;
        int i10 = this.f9379b;
        int size = this.f9378a.size();
        while (true) {
            if (i10 >= size) {
                hVar = null;
                break;
            }
            hVar = this.f9378a.get(i10);
            if (hVar.a(sSLSocket)) {
                this.f9379b = i10 + 1;
                break;
            }
            i10++;
        }
        if (hVar != null) {
            int i11 = this.f9379b;
            while (true) {
                if (i11 >= this.f9378a.size()) {
                    z9 = false;
                    break;
                } else if (this.f9378a.get(i11).a(sSLSocket)) {
                    z9 = true;
                    break;
                } else {
                    i11++;
                }
            }
            this.f9380c = z9;
            u.a aVar = a.f9148a;
            boolean z10 = this.f9381d;
            aVar.getClass();
            if (hVar.f8903c != null) {
                strArr = e.n(g.f8881b, sSLSocket.getEnabledCipherSuites(), hVar.f8903c);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            if (hVar.f8904d != null) {
                strArr2 = e.n(e.f9160i, sSLSocket.getEnabledProtocols(), hVar.f8904d);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            d dVar = g.f8881b;
            byte[] bArr = e.f9152a;
            int length = supportedCipherSuites.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                } else if (dVar.compare(supportedCipherSuites[i12], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                } else {
                    i12++;
                }
            }
            if (z10 && i12 != -1) {
                String str = supportedCipherSuites[i12];
                int length2 = strArr.length + 1;
                String[] strArr3 = new String[length2];
                System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
                strArr3[length2 - 1] = str;
                strArr = strArr3;
            }
            h.a aVar2 = new h.a(hVar);
            aVar2.b(strArr);
            aVar2.d(strArr2);
            h hVar2 = new h(aVar2);
            String[] strArr4 = hVar2.f8904d;
            if (strArr4 != null) {
                sSLSocket.setEnabledProtocols(strArr4);
            }
            String[] strArr5 = hVar2.f8903c;
            if (strArr5 != null) {
                sSLSocket.setEnabledCipherSuites(strArr5);
            }
            return hVar;
        }
        StringBuilder g10 = f.g("Unable to find acceptable protocols. isFallback=");
        g10.append(this.f9381d);
        g10.append(", modes=");
        g10.append(this.f9378a);
        g10.append(", supported protocols=");
        g10.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(g10.toString());
    }
}
