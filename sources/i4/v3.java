package i4;

import java.security.GeneralSecurityException;
import java.util.Set;

public final class v3 implements x3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l7 f7735a;

    public v3(l7 l7Var) {
        this.f7735a = l7Var;
    }

    public final Class a() {
        return null;
    }

    public final t3 b(Class cls) {
        try {
            return new u3(this.f7735a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final t3 zzb() {
        l7 l7Var = this.f7735a;
        return new u3(l7Var, l7Var.f7476c);
    }

    public final Class zzc() {
        return this.f7735a.getClass();
    }

    public final Set zze() {
        return this.f7735a.f7475b.keySet();
    }
}
