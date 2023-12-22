package t2;

import androidx.activity.e;
import androidx.activity.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f11988a;

    public b(String str) {
        if (str != null) {
            this.f11988a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f11988a.equals(((b) obj).f11988a);
    }

    public final int hashCode() {
        return this.f11988a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return e.c(f.g("Encoding{name=\""), this.f11988a, "\"}");
    }
}
