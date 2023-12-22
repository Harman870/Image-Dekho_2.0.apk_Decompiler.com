package i4;

import androidx.fragment.app.w0;
import java.util.Arrays;

public final class b8 {

    /* renamed from: a  reason: collision with root package name */
    public final Class f7201a;

    /* renamed from: b  reason: collision with root package name */
    public final xd f7202b;

    public /* synthetic */ b8(Class cls, xd xdVar) {
        this.f7201a = cls;
        this.f7202b = xdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return b8Var.f7201a.equals(this.f7201a) && b8Var.f7202b.equals(this.f7202b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7201a, this.f7202b});
    }

    public final String toString() {
        return w0.d(this.f7201a.getSimpleName(), ", object identifier: ", String.valueOf(this.f7202b));
    }
}
