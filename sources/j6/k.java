package j6;

import androidx.activity.e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final v<?> f8748a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8749b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8750c;

    public k(int i10, int i11, Class cls) {
        this((v<?>) v.a(cls), i10, i11);
    }

    public k(v<?> vVar, int i10, int i11) {
        this.f8748a = vVar;
        this.f8749b = i10;
        this.f8750c = i11;
    }

    public static k a(Class<?> cls) {
        return new k(1, 0, (Class) cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f8748a.equals(kVar.f8748a) && this.f8749b == kVar.f8749b && this.f8750c == kVar.f8750c;
    }

    public final int hashCode() {
        return ((((this.f8748a.hashCode() ^ 1000003) * 1000003) ^ this.f8749b) * 1000003) ^ this.f8750c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f8748a);
        sb.append(", type=");
        int i10 = this.f8749b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i11 = this.f8750c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = IronSourceConstants.EVENTS_PROVIDER;
        } else if (i11 == 2) {
            str2 = "deferred";
        } else {
            throw new AssertionError(e.a("Unsupported injection: ", i11));
        }
        return e.c(sb, str2, "}");
    }
}
