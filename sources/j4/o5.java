package j4;

import androidx.fragment.app.w0;
import javax.annotation.CheckForNull;
import z5.c;

public final class o5 implements m5 {

    /* renamed from: a  reason: collision with root package name */
    public volatile m5 f8363a;
    @CheckForNull

    /* renamed from: b  reason: collision with root package name */
    public Object f8364b;

    public o5(m5 m5Var) {
        this.f8363a = m5Var;
    }

    public final String toString() {
        Object obj = this.f8363a;
        if (obj == c.f13182f) {
            obj = w0.d("<supplier that returned ", String.valueOf(this.f8364b), ">");
        }
        return w0.d("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    public final Object zza() {
        m5 m5Var = this.f8363a;
        c cVar = c.f13182f;
        if (m5Var != cVar) {
            synchronized (this) {
                if (this.f8363a != cVar) {
                    Object zza = this.f8363a.zza();
                    this.f8364b = zza;
                    this.f8363a = cVar;
                    return zza;
                }
            }
        }
        return this.f8364b;
    }
}
