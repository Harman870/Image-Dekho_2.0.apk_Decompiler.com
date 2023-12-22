package i4;

import java.util.Arrays;

public final class u8 extends z8 {

    /* renamed from: o  reason: collision with root package name */
    public final int f7725o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7726p;

    /* renamed from: q  reason: collision with root package name */
    public final t8 f7727q;

    /* renamed from: r  reason: collision with root package name */
    public final s8 f7728r;

    public /* synthetic */ u8(int i10, int i11, t8 t8Var, s8 s8Var) {
        this.f7725o = i10;
        this.f7726p = i11;
        this.f7727q = t8Var;
        this.f7728r = s8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return u8Var.f7725o == this.f7725o && u8Var.l() == l() && u8Var.f7727q == this.f7727q && u8Var.f7728r == this.f7728r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7726p), this.f7727q, this.f7728r});
    }

    public final int l() {
        t8 t8Var = this.f7727q;
        if (t8Var == t8.f7686e) {
            return this.f7726p;
        }
        if (t8Var == t8.f7683b || t8Var == t8.f7684c || t8Var == t8.f7685d) {
            return this.f7726p + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7727q);
        String valueOf2 = String.valueOf(this.f7728r);
        int i10 = this.f7726p;
        int i11 = this.f7725o;
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i10 + "-byte tags, and " + i11 + "-byte key)";
    }
}
