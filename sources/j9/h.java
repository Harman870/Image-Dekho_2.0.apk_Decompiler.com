package j9;

import androidx.activity.f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import k9.e;

public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final h f8899e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f8900f = new h(new a(false));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8901a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8902b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String[] f8903c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String[] f8904d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f8905a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String[] f8906b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String[] f8907c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f8908d;

        public a(h hVar) {
            this.f8905a = hVar.f8901a;
            this.f8906b = hVar.f8903c;
            this.f8907c = hVar.f8904d;
            this.f8908d = hVar.f8902b;
        }

        public a(boolean z9) {
            this.f8905a = z9;
        }

        public final void a(g... gVarArr) {
            if (this.f8905a) {
                String[] strArr = new String[gVarArr.length];
                for (int i10 = 0; i10 < gVarArr.length; i10++) {
                    strArr[i10] = gVarArr[i10].f8898a;
                }
                b(strArr);
                return;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final void b(String... strArr) {
            if (!this.f8905a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f8906b = (String[]) strArr.clone();
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public final void c(f0... f0VarArr) {
            if (this.f8905a) {
                String[] strArr = new String[f0VarArr.length];
                for (int i10 = 0; i10 < f0VarArr.length; i10++) {
                    strArr[i10] = f0VarArr[i10].f8880a;
                }
                d(strArr);
                return;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final void d(String... strArr) {
            if (!this.f8905a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f8907c = (String[]) strArr.clone();
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }
    }

    static {
        g gVar = g.f8895q;
        g gVar2 = g.f8896r;
        g gVar3 = g.f8897s;
        g gVar4 = g.k;
        g gVar5 = g.f8891m;
        g gVar6 = g.f8890l;
        g gVar7 = g.f8892n;
        g gVar8 = g.f8894p;
        g gVar9 = g.f8893o;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f8888i, g.f8889j, g.f8886g, g.f8887h, g.f8884e, g.f8885f, g.f8883d};
        a aVar = new a(true);
        aVar.a(gVarArr);
        f0 f0Var = f0.TLS_1_3;
        f0 f0Var2 = f0.TLS_1_2;
        aVar.c(f0Var, f0Var2);
        if (aVar.f8905a) {
            aVar.f8908d = true;
            new h(aVar);
            a aVar2 = new a(true);
            aVar2.a(gVarArr2);
            aVar2.c(f0Var, f0Var2);
            if (aVar2.f8905a) {
                aVar2.f8908d = true;
                f8899e = new h(aVar2);
                a aVar3 = new a(true);
                aVar3.a(gVarArr2);
                aVar3.c(f0Var, f0Var2, f0.TLS_1_1, f0.TLS_1_0);
                if (aVar3.f8905a) {
                    aVar3.f8908d = true;
                    new h(aVar3);
                    return;
                }
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public h(a aVar) {
        this.f8901a = aVar.f8905a;
        this.f8903c = aVar.f8906b;
        this.f8904d = aVar.f8907c;
        this.f8902b = aVar.f8908d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f8901a) {
            return false;
        }
        String[] strArr = this.f8904d;
        if (strArr != null && !e.p(e.f9160i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f8903c;
        return strArr2 == null || e.p(g.f8881b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z9 = this.f8901a;
        if (z9 != hVar.f8901a) {
            return false;
        }
        return !z9 || (Arrays.equals(this.f8903c, hVar.f8903c) && Arrays.equals(this.f8904d, hVar.f8904d) && this.f8902b == hVar.f8902b);
    }

    public final int hashCode() {
        if (this.f8901a) {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f8903c)) * 31) + Arrays.hashCode(this.f8904d)) * 31) + (this.f8902b ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List list;
        if (!this.f8901a) {
            return "ConnectionSpec()";
        }
        StringBuilder g10 = f.g("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f8903c;
        List list2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String a10 : strArr) {
                arrayList.add(g.a(a10));
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        g10.append(Objects.toString(list, "[all enabled]"));
        g10.append(", tlsVersions=");
        String[] strArr2 = this.f8904d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String a11 : strArr2) {
                arrayList2.add(f0.a(a11));
            }
            list2 = Collections.unmodifiableList(arrayList2);
        }
        g10.append(Objects.toString(list2, "[all enabled]"));
        g10.append(", supportsTlsExtensions=");
        g10.append(this.f8902b);
        g10.append(")");
        return g10.toString();
    }
}
