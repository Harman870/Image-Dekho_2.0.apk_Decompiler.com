package j4;

import java.util.ArrayList;
import java.util.Iterator;
import o.c;

public final class h implements p {

    /* renamed from: a  reason: collision with root package name */
    public final p f8206a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8207b;

    public h() {
        throw null;
    }

    public h(String str) {
        this.f8206a = p.f8373c0;
        this.f8207b = str;
    }

    public h(String str, p pVar) {
        this.f8206a = pVar;
        this.f8207b = str;
    }

    public final p a() {
        return new h(this.f8207b, this.f8206a.a());
    }

    public final Double b() {
        throw new IllegalStateException("Control is not a double");
    }

    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f8207b.equals(hVar.f8207b) && this.f8206a.equals(hVar.f8206a);
    }

    public final int hashCode() {
        return this.f8206a.hashCode() + (this.f8207b.hashCode() * 31);
    }

    public final Boolean k() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final p l(String str, c cVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }
}
