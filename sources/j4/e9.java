package j4;

import androidx.fragment.app.w0;
import java.util.Map;

public final class e9 implements Map.Entry, Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final Comparable f8124a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8125b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h9 f8126c;

    public e9(h9 h9Var, Comparable comparable, Object obj) {
        this.f8126c = h9Var;
        this.f8124a = comparable;
        this.f8125b = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f8124a.compareTo(((e9) obj).f8124a);
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
        Comparable comparable = this.f8124a;
        Object key = entry.getKey();
        if (comparable != null) {
            z9 = comparable.equals(key);
        } else if (key != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            Object obj2 = this.f8125b;
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
        return this.f8124a;
    }

    public final Object getValue() {
        return this.f8125b;
    }

    public final int hashCode() {
        Comparable comparable = this.f8124a;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f8125b;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    public final Object setValue(Object obj) {
        h9 h9Var = this.f8126c;
        int i10 = h9.f8217g;
        h9Var.g();
        Object obj2 = this.f8125b;
        this.f8125b = obj;
        return obj2;
    }

    public final String toString() {
        return w0.d(String.valueOf(this.f8124a), "=", String.valueOf(this.f8125b));
    }
}
