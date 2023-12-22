package j2;

import androidx.activity.f;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f8026a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f8027b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f8028c;

    public k() {
    }

    public k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f8026a = cls;
        this.f8027b = cls2;
        this.f8028c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f8026a.equals(kVar.f8026a) && this.f8027b.equals(kVar.f8027b) && l.b(this.f8028c, kVar.f8028c);
    }

    public final int hashCode() {
        int hashCode = (this.f8027b.hashCode() + (this.f8026a.hashCode() * 31)) * 31;
        Class<?> cls = this.f8028c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder g10 = f.g("MultiClassKey{first=");
        g10.append(this.f8026a);
        g10.append(", second=");
        g10.append(this.f8027b);
        g10.append('}');
        return g10.toString();
    }
}
