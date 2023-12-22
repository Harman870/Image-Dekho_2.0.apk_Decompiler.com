package i4;

import androidx.fragment.app.w0;
import java.util.Map;

public final class r2 implements Map.Entry, Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final Comparable f7631a;

    /* renamed from: b  reason: collision with root package name */
    public Object f7632b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u2 f7633c;

    public r2(u2 u2Var, Comparable comparable, Object obj) {
        this.f7633c = u2Var;
        this.f7631a = comparable;
        this.f7632b = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f7631a.compareTo(((r2) obj).f7631a);
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f7631a;
        Object key = entry.getKey();
        if (comparable != null) {
            z9 = comparable.equals(key);
        } else if (key != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            Object obj2 = this.f7632b;
            Object value = entry.getValue();
            if (obj2 != null) {
                z10 = obj2.equals(value);
            } else if (value != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object getKey() {
        return this.f7631a;
    }

    public final Object getValue() {
        return this.f7632b;
    }

    public final int hashCode() {
        Comparable comparable = this.f7631a;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f7632b;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    public final Object setValue(Object obj) {
        u2 u2Var = this.f7633c;
        int i10 = u2.f7700g;
        u2Var.g();
        Object obj2 = this.f7632b;
        this.f7632b = obj;
        return obj2;
    }

    public final String toString() {
        return w0.d(String.valueOf(this.f7631a), "=", String.valueOf(this.f7632b));
    }
}
