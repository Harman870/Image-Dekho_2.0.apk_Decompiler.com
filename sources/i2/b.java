package i2;

import java.security.MessageDigest;
import o1.f;
import y3.a;

public final class b implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f7121b;

    public b(Object obj) {
        a.h(obj);
        this.f7121b = obj;
    }

    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f7121b.toString().getBytes(f.f10513a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f7121b.equals(((b) obj).f7121b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7121b.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = androidx.activity.f.g("ObjectKey{object=");
        g10.append(this.f7121b);
        g10.append('}');
        return g10.toString();
    }
}
