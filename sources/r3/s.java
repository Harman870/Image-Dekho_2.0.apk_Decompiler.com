package r3;

import java.util.Arrays;
import p3.a;

public final class s implements a.c {

    /* renamed from: b  reason: collision with root package name */
    public static final s f11631b = new s();

    /* renamed from: a  reason: collision with root package name */
    public final String f11632a = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        return m.a(this.f11632a, ((s) obj).f11632a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11632a});
    }
}
