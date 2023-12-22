package i4;

import java.util.Arrays;

public final class m8 extends z8 {

    /* renamed from: o  reason: collision with root package name */
    public final int f7491o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7492p;

    /* renamed from: q  reason: collision with root package name */
    public final l8 f7493q;

    public /* synthetic */ m8(int i10, int i11, l8 l8Var) {
        this.f7491o = i10;
        this.f7492p = i11;
        this.f7493q = l8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj;
        return m8Var.f7491o == this.f7491o && m8Var.l() == l() && m8Var.f7493q == this.f7493q;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7492p), this.f7493q});
    }

    public final int l() {
        l8 l8Var = this.f7493q;
        if (l8Var == l8.f7480e) {
            return this.f7492p;
        }
        if (l8Var == l8.f7477b || l8Var == l8.f7478c || l8Var == l8.f7479d) {
            return this.f7492p + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7493q);
        int i10 = this.f7492p;
        int i11 = this.f7491o;
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + i10 + "-byte tags, and " + i11 + "-byte key)";
    }
}
