package j4;

import androidx.fragment.app.w0;
import java.io.Serializable;
import javax.annotation.CheckForNull;

public final class n5 implements Serializable, m5 {

    /* renamed from: a  reason: collision with root package name */
    public final m5 f8335a;

    /* renamed from: b  reason: collision with root package name */
    public volatile transient boolean f8336b;
    @CheckForNull

    /* renamed from: c  reason: collision with root package name */
    public transient Object f8337c;

    public n5(m5 m5Var) {
        this.f8335a = m5Var;
    }

    public final String toString() {
        Object obj;
        if (this.f8336b) {
            obj = w0.d("<supplier that returned ", String.valueOf(this.f8337c), ">");
        } else {
            obj = this.f8335a;
        }
        return w0.d("Suppliers.memoize(", obj.toString(), ")");
    }

    public final Object zza() {
        if (!this.f8336b) {
            synchronized (this) {
                if (!this.f8336b) {
                    Object zza = this.f8335a.zza();
                    this.f8337c = zza;
                    this.f8336b = true;
                    return zza;
                }
            }
        }
        return this.f8337c;
    }
}
