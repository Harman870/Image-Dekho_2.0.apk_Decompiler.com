package j4;

import android.content.Context;
import javax.annotation.Nullable;

public final class m4 extends d5 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8323a;

    /* renamed from: b  reason: collision with root package name */
    public final m5 f8324b;

    public m4(Context context, @Nullable m5 m5Var) {
        this.f8323a = context;
        this.f8324b = m5Var;
    }

    public final Context a() {
        return this.f8323a;
    }

    @Nullable
    public final m5 b() {
        return this.f8324b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d5) {
            d5 d5Var = (d5) obj;
            if (this.f8323a.equals(d5Var.a())) {
                m5 m5Var = this.f8324b;
                m5 b10 = d5Var.b();
                if (m5Var != null ? m5Var.equals(b10) : b10 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f8323a.hashCode() ^ 1000003;
        m5 m5Var = this.f8324b;
        return (hashCode * 1000003) ^ (m5Var == null ? 0 : m5Var.hashCode());
    }

    public final String toString() {
        String obj = this.f8323a.toString();
        String valueOf = String.valueOf(this.f8324b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
