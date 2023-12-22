package o8;

import java.io.Serializable;
import x8.f;

public final class e<A, B> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final A f10603a;

    /* renamed from: b  reason: collision with root package name */
    public final B f10604b;

    public e(A a10, B b10) {
        this.f10603a = a10;
        this.f10604b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f.a(this.f10603a, eVar.f10603a) && f.a(this.f10604b, eVar.f10604b);
    }

    public final int hashCode() {
        A a10 = this.f10603a;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f10604b;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return '(' + this.f10603a + ", " + this.f10604b + ')';
    }
}
