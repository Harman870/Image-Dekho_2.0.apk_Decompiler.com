package i4;

import androidx.fragment.app.w0;
import java.util.Arrays;

public final class c8 {

    /* renamed from: a  reason: collision with root package name */
    public final Class f7228a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f7229b;

    public /* synthetic */ c8(Class cls, Class cls2) {
        this.f7228a = cls;
        this.f7229b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        return c8Var.f7228a.equals(this.f7228a) && c8Var.f7229b.equals(this.f7229b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7228a, this.f7229b});
    }

    public final String toString() {
        return w0.d(this.f7228a.getSimpleName(), " with serialization type: ", this.f7229b.getSimpleName());
    }
}
