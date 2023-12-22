package c7;

import androidx.activity.e;
import androidx.activity.f;
import javax.annotation.Nonnull;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f2513a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2514b;

    public a(String str, String str2) {
        if (str != null) {
            this.f2513a = str;
            if (str2 != null) {
                this.f2514b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Nonnull
    public final String a() {
        return this.f2513a;
    }

    @Nonnull
    public final String b() {
        return this.f2514b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2513a.equals(dVar.a()) && this.f2514b.equals(dVar.b());
    }

    public final int hashCode() {
        return ((this.f2513a.hashCode() ^ 1000003) * 1000003) ^ this.f2514b.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("LibraryVersion{libraryName=");
        g10.append(this.f2513a);
        g10.append(", version=");
        return e.c(g10, this.f2514b, "}");
    }
}
