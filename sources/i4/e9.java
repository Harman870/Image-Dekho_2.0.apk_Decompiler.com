package i4;

import androidx.lifecycle.c0;
import java.util.Arrays;

public final class e9 {

    /* renamed from: a  reason: collision with root package name */
    public final z3 f7286a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7287b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f7288c;

    public /* synthetic */ e9(z3 z3Var, int i10, c0 c0Var) {
        this.f7286a = z3Var;
        this.f7287b = i10;
        this.f7288c = c0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj;
        return this.f7286a == e9Var.f7286a && this.f7287b == e9Var.f7287b && this.f7288c.equals(e9Var.f7288c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7286a, Integer.valueOf(this.f7287b), Integer.valueOf(this.f7288c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", new Object[]{this.f7286a, Integer.valueOf(this.f7287b), this.f7288c});
    }
}
