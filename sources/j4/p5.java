package j4;

import androidx.fragment.app.w0;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

public final class p5 implements Serializable, m5 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8385a;

    public p5(Object obj) {
        this.f8385a = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof p5)) {
            return false;
        }
        Object obj2 = this.f8385a;
        Object obj3 = ((p5) obj).f8385a;
        return obj2 == obj3 || (obj2 != null && obj2.equals(obj3));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8385a});
    }

    public final String toString() {
        return w0.d("Suppliers.ofInstance(", this.f8385a.toString(), ")");
    }

    public final Object zza() {
        return this.f8385a;
    }
}
