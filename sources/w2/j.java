package w2;

import java.util.Arrays;
import t2.d;
import w2.s;

public final class j extends s {

    /* renamed from: a  reason: collision with root package name */
    public final String f12704a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12705b;

    /* renamed from: c  reason: collision with root package name */
    public final d f12706c;

    public static final class a extends s.a {

        /* renamed from: a  reason: collision with root package name */
        public String f12707a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f12708b;

        /* renamed from: c  reason: collision with root package name */
        public d f12709c;

        public final j a() {
            String str;
            if (this.f12707a == null) {
                str = " backendName";
            } else {
                str = "";
            }
            if (this.f12709c == null) {
                str = com.ironsource.adapters.ironsource.a.g(str, " priority");
            }
            if (str.isEmpty()) {
                return new j(this.f12707a, this.f12708b, this.f12709c);
            }
            throw new IllegalStateException(com.ironsource.adapters.ironsource.a.g("Missing required properties:", str));
        }

        public final a b(String str) {
            if (str != null) {
                this.f12707a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public final a c(d dVar) {
            if (dVar != null) {
                this.f12709c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public j(String str, byte[] bArr, d dVar) {
        this.f12704a = str;
        this.f12705b = bArr;
        this.f12706c = dVar;
    }

    public final String b() {
        return this.f12704a;
    }

    public final byte[] c() {
        return this.f12705b;
    }

    public final d d() {
        return this.f12706c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f12704a.equals(sVar.b())) {
            if (Arrays.equals(this.f12705b, sVar instanceof j ? ((j) sVar).f12705b : sVar.c()) && this.f12706c.equals(sVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f12704a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12705b)) * 1000003) ^ this.f12706c.hashCode();
    }
}
