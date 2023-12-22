package t2;

import androidx.activity.f;
import b7.b;

public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f11985a = null;

    /* renamed from: b  reason: collision with root package name */
    public final T f11986b;

    /* renamed from: c  reason: collision with root package name */
    public final d f11987c;

    public a(b bVar) {
        d dVar = d.DEFAULT;
        this.f11986b = bVar;
        this.f11987c = dVar;
    }

    public final Integer a() {
        return this.f11985a;
    }

    public final T b() {
        return this.f11986b;
    }

    public final d c() {
        return this.f11987c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f11985a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f11986b.equals(cVar.b()) && this.f11987c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f11985a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f11986b.hashCode()) * 1000003) ^ this.f11987c.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("Event{code=");
        g10.append(this.f11985a);
        g10.append(", payload=");
        g10.append(this.f11986b);
        g10.append(", priority=");
        g10.append(this.f11987c);
        g10.append("}");
        return g10.toString();
    }
}
