package i4;

import androidx.lifecycle.p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class o4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7554a = Logger.getLogger(o4.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f7555b = new AtomicReference(new y3());

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap f7556c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap f7557d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap f7558e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    public static final ConcurrentHashMap f7559f = new ConcurrentHashMap();

    static {
        new ConcurrentHashMap();
    }

    public static synchronized zb a(bc bcVar) {
        zb a10;
        synchronized (o4.class) {
            t3 zzb = ((y3) f7555b.get()).d(bcVar.A()).zzb();
            if (((Boolean) f7557d.get(bcVar.A())).booleanValue()) {
                a10 = zzb.a(bcVar.z());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(bcVar.A())));
            }
        }
        return a10;
    }

    public static synchronized b2 b(bc bcVar) {
        b2 c10;
        synchronized (o4.class) {
            t3 zzb = ((y3) f7555b.get()).d(bcVar.A()).zzb();
            if (((Boolean) f7557d.get(bcVar.A())).booleanValue()) {
                c10 = zzb.c(bcVar.z());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(bcVar.A())));
            }
        }
        return c10;
    }

    public static Object c(String str, c1 c1Var, Class cls) {
        return ((y3) f7555b.get()).c(cls, str).e(c1Var);
    }

    public static Object d(String str, byte[] bArr) {
        d0 d0Var = e0.f7269b;
        return ((y3) f7555b.get()).c(p3.class, str).d(e0.q(bArr, 0, bArr.length));
    }

    public static synchronized void e(x7 x7Var, l7 l7Var) {
        synchronized (o4.class) {
            AtomicReference atomicReference = f7555b;
            y3 y3Var = new y3((y3) atomicReference.get());
            y3Var.a(x7Var, l7Var);
            String d10 = x7Var.d();
            String d11 = l7Var.d();
            h(d10, x7Var.a().c(), true);
            h(d11, Collections.emptyMap(), false);
            if (!((y3) atomicReference.get()).f7811a.containsKey(d10)) {
                f7556c.put(d10, new p((Object) x7Var));
                i(x7Var.d(), x7Var.a().c());
            }
            ConcurrentHashMap concurrentHashMap = f7557d;
            concurrentHashMap.put(d10, Boolean.TRUE);
            concurrentHashMap.put(d11, Boolean.FALSE);
            atomicReference.set(y3Var);
        }
    }

    public static synchronized void f(l7 l7Var) {
        synchronized (o4.class) {
            AtomicReference atomicReference = f7555b;
            y3 y3Var = new y3((y3) atomicReference.get());
            y3Var.b(l7Var);
            String d10 = l7Var.d();
            h(d10, l7Var.a().c(), true);
            if (!((y3) atomicReference.get()).f7811a.containsKey(d10)) {
                f7556c.put(d10, new p((Object) l7Var));
                i(d10, l7Var.a().c());
            }
            f7557d.put(d10, Boolean.TRUE);
            atomicReference.set(y3Var);
        }
    }

    public static synchronized void g(l4 l4Var) {
        synchronized (o4.class) {
            Class zzb = l4Var.zzb();
            ConcurrentHashMap concurrentHashMap = f7558e;
            if (concurrentHashMap.containsKey(zzb)) {
                l4 l4Var2 = (l4) concurrentHashMap.get(zzb);
                if (!l4Var.getClass().getName().equals(l4Var2.getClass().getName())) {
                    f7554a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{zzb.getName(), l4Var2.getClass().getName(), l4Var.getClass().getName()}));
                }
            }
            concurrentHashMap.put(zzb, l4Var);
        }
    }

    public static synchronized void h(String str, Map map, boolean z9) {
        synchronized (o4.class) {
            if (z9) {
                ConcurrentHashMap concurrentHashMap = f7557d;
                if (concurrentHashMap.containsKey(str)) {
                    if (!((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (((y3) f7555b.get()).f7811a.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f7559f.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f7559f.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, i4.b2] */
    public static void i(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f7559f.put((String) entry.getKey(), a4.a(str, ((j7) entry.getValue()).f7405a.e(), ((j7) entry.getValue()).f7406b));
        }
    }
}
