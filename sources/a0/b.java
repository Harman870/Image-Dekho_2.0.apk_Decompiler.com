package a0;

import android.graphics.Insets;
import androidx.activity.f;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f3e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f4a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7d;

    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f4a = i10;
        this.f5b = i11;
        this.f6c = i12;
        this.f7d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f4a, bVar2.f4a), Math.max(bVar.f5b, bVar2.f5b), Math.max(bVar.f6c, bVar2.f6c), Math.max(bVar.f7d, bVar2.f7d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f3e : new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return a.a(this.f4a, this.f5b, this.f6c, this.f7d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7d == bVar.f7d && this.f4a == bVar.f4a && this.f6c == bVar.f6c && this.f5b == bVar.f5b;
    }

    public final int hashCode() {
        return (((((this.f4a * 31) + this.f5b) * 31) + this.f6c) * 31) + this.f7d;
    }

    public final String toString() {
        StringBuilder g10 = f.g("Insets{left=");
        g10.append(this.f4a);
        g10.append(", top=");
        g10.append(this.f5b);
        g10.append(", right=");
        g10.append(this.f6c);
        g10.append(", bottom=");
        g10.append(this.f7d);
        g10.append('}');
        return g10.toString();
    }
}
