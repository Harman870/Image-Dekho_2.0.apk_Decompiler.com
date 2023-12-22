package i4;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class y3 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f7810b = Logger.getLogger(y3.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f7811a;

    public y3() {
        this.f7811a = new ConcurrentHashMap();
    }

    public y3(y3 y3Var) {
        this.f7811a = new ConcurrentHashMap(y3Var.f7811a);
    }

    public final synchronized void a(x7 x7Var, l7 l7Var) {
        Class a10;
        int f10 = l7Var.f();
        if (!j3.c(1)) {
            String valueOf = String.valueOf(x7Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (j3.c(f10)) {
            String d10 = x7Var.d();
            String d11 = l7Var.d();
            if (!(!this.f7811a.containsKey(d10) || ((x3) this.f7811a.get(d10)).a() == null || (a10 = ((x3) this.f7811a.get(d10)).a()) == null)) {
                if (!a10.getName().equals(l7Var.getClass().getName())) {
                    Logger logger = f7810b;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + d10 + " with inconsistent public key type " + d11);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{x7Var.getClass().getName(), a10.getName(), l7Var.getClass().getName()}));
                }
            }
            e(new w3(x7Var, l7Var), true);
            e(new v3(l7Var), false);
        } else {
            String valueOf2 = String.valueOf(l7Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void b(l7 l7Var) {
        if (j3.c(l7Var.f())) {
            e(new v3(l7Var), false);
        } else {
            String valueOf = String.valueOf(l7Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    public final t3 c(Class cls, String str) {
        x3 d10 = d(str);
        if (cls == null) {
            return d10.zzb();
        }
        if (d10.zze().contains(cls)) {
            return d10.b(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(d10.zzc());
        Set<Class> zze = d10.zze();
        StringBuilder sb = new StringBuilder();
        boolean z9 = true;
        for (Class cls2 : zze) {
            if (!z9) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z9 = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    public final synchronized x3 d(String str) {
        if (this.f7811a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (x3) this.f7811a.get(str);
    }

    public final synchronized void e(x3 x3Var, boolean z9) {
        String zze = x3Var.zzb().zze();
        x3 x3Var2 = (x3) this.f7811a.get(zze);
        if (x3Var2 != null) {
            if (!x3Var2.zzc().equals(x3Var.zzc())) {
                f7810b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zze));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zze, x3Var2.zzc().getName(), x3Var.zzc().getName()}));
            }
        }
        if (!z9) {
            this.f7811a.putIfAbsent(zze, x3Var);
        } else {
            this.f7811a.put(zze, x3Var);
        }
    }
}
