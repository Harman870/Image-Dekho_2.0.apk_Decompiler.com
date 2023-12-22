package u9;

import androidx.activity.f;
import java.lang.annotation.Annotation;

public final class g0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f12265a = new g0();

    public final Class<? extends Annotation> annotationType() {
        return f0.class;
    }

    public final boolean equals(Object obj) {
        return obj instanceof f0;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder g10 = f.g("@");
        g10.append(f0.class.getName());
        g10.append("()");
        return g10.toString();
    }
}
