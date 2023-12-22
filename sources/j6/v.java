package j6;

import androidx.activity.f;
import java.lang.annotation.Annotation;

public final class v<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? extends Annotation> f8768a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<T> f8769b;

    public @interface a {
    }

    public v(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f8768a = cls;
        this.f8769b = cls2;
    }

    public static <T> v<T> a(Class<T> cls) {
        return new v<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.f8769b.equals(vVar.f8769b)) {
            return false;
        }
        return this.f8768a.equals(vVar.f8768a);
    }

    public final int hashCode() {
        return this.f8768a.hashCode() + (this.f8769b.hashCode() * 31);
    }

    public final String toString() {
        if (this.f8768a == a.class) {
            return this.f8769b.getName();
        }
        StringBuilder g10 = f.g("@");
        g10.append(this.f8768a.getName());
        g10.append(" ");
        g10.append(this.f8769b.getName());
        return g10.toString();
    }
}
