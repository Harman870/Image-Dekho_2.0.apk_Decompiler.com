package com.ironsource.sdk.g;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5657a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5658b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5659c;

    public g(boolean z9, boolean z10, boolean z11) {
        this.f5657a = z9;
        this.f5658b = z10;
        this.f5659c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5657a == gVar.f5657a && this.f5658b == gVar.f5658b && this.f5659c == gVar.f5659c;
    }

    public final int hashCode() {
        boolean z9 = this.f5657a;
        boolean z10 = true;
        if (z9) {
            z9 = true;
        }
        int i10 = (z9 ? 1 : 0) * true;
        boolean z11 = this.f5658b;
        if (z11) {
            z11 = true;
        }
        int i11 = (i10 + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.f5659c;
        if (!z12) {
            z10 = z12;
        }
        return i11 + (z10 ? 1 : 0);
    }

    public final String toString() {
        return "ViewVisibilityParams(isVisible=" + this.f5657a + ", isWindowVisible=" + this.f5658b + ", isShown=" + this.f5659c + ')';
    }
}
