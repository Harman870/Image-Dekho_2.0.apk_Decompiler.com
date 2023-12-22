package j4;

import androidx.fragment.app.w0;
import javax.annotation.CheckForNull;

public final class k5 extends i5 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8294a;

    public k5(Object obj) {
        this.f8294a = obj;
    }

    public final Object a() {
        return this.f8294a;
    }

    public final boolean b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof k5) {
            return this.f8294a.equals(((k5) obj).f8294a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8294a.hashCode() + 1502476572;
    }

    public final String toString() {
        return w0.d("Optional.of(", this.f8294a.toString(), ")");
    }
}
