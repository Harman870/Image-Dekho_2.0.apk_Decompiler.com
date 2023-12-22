package i4;

import java.security.GeneralSecurityException;
import java.util.Set;

public final class w3 implements x3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x7 f7757a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l7 f7758b;

    public w3(x7 x7Var, l7 l7Var) {
        this.f7757a = x7Var;
        this.f7758b = l7Var;
    }

    public final Class a() {
        return this.f7758b.getClass();
    }

    public final t3 b(Class cls) {
        try {
            return new n4(this.f7757a, this.f7758b, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final t3 zzb() {
        x7 x7Var = this.f7757a;
        return new n4(x7Var, this.f7758b, x7Var.f7476c);
    }

    public final Class zzc() {
        return this.f7757a.getClass();
    }

    public final Set zze() {
        return this.f7757a.f7475b.keySet();
    }
}
