package n6;

import androidx.activity.f;
import java.util.Collections;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f10382a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f10383b;

    public c(String str, Map<Class<?>, Object> map) {
        this.f10382a = str;
        this.f10383b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10382a.equals(cVar.f10382a) && this.f10383b.equals(cVar.f10383b);
    }

    public final int hashCode() {
        return this.f10383b.hashCode() + (this.f10382a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder g10 = f.g("FieldDescriptor{name=");
        g10.append(this.f10382a);
        g10.append(", properties=");
        g10.append(this.f10383b.values());
        g10.append("}");
        return g10.toString();
    }
}
