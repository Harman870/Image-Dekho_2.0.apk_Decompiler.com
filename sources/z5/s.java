package z5;

import androidx.fragment.app.w0;
import z5.b;

public final class s extends b.d {

    /* renamed from: a  reason: collision with root package name */
    public final String f13226a;

    public /* synthetic */ s(String str) {
        this.f13226a = str;
    }

    public final String a() {
        return this.f13226a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b.d)) {
            return false;
        }
        String str = this.f13226a;
        String a10 = ((b.d) obj).a();
        return str == null ? a10 == null : str.equals(a10);
    }

    public final int hashCode() {
        String str = this.f13226a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return w0.d("StandardIntegrityTokenRequest{requestHash=", this.f13226a, "}");
    }
}
