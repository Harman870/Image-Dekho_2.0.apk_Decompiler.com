package i4;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public final class f9 {

    /* renamed from: a  reason: collision with root package name */
    public final c9 f7309a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7310b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Integer f7311c;

    public /* synthetic */ f9(c9 c9Var, List list, Integer num) {
        this.f7309a = c9Var;
        this.f7310b = list;
        this.f7311c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f9)) {
            return false;
        }
        f9 f9Var = (f9) obj;
        if (this.f7309a.equals(f9Var.f7309a) && this.f7310b.equals(f9Var.f7310b)) {
            Integer num = this.f7311c;
            Integer num2 = f9Var.f7311c;
            if (num != num2) {
                return num != null && num.equals(num2);
            }
            return true;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7309a, this.f7310b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.f7309a, this.f7310b, this.f7311c});
    }
}
