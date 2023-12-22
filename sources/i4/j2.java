package i4;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public final class j2 {

    /* renamed from: c  reason: collision with root package name */
    public static final j2 f7400c = new j2();

    /* renamed from: a  reason: collision with root package name */
    public final u1 f7401a = new u1();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f7402b = new ConcurrentHashMap();

    public final m2 a(Class cls) {
        x1 x1Var;
        q0 q0Var;
        x2 x2Var;
        p1 p1Var;
        p1 p1Var2;
        x2 x2Var2;
        q0 q0Var2;
        f2 f2Var;
        Class cls2;
        Charset charset = g1.f7324a;
        if (cls != null) {
            m2 m2Var = (m2) this.f7402b.get(cls);
            if (m2Var == null) {
                u1 u1Var = this.f7401a;
                u1Var.getClass();
                Class<c1> cls3 = c1.class;
                Class cls4 = n2.f7515a;
                if (cls3.isAssignableFrom(cls) || (cls2 = n2.f7515a) == null || cls2.isAssignableFrom(cls)) {
                    z1 a10 = u1Var.f7699a.a(cls);
                    boolean zzb = a10.zzb();
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    if (zzb) {
                        if (isAssignableFrom) {
                            f2Var = new f2(n2.f7518d, s0.f7663a, a10.zza());
                        } else {
                            x2 x2Var3 = n2.f7516b;
                            q0 q0Var3 = s0.f7664b;
                            if (q0Var3 != null) {
                                f2Var = new f2(x2Var3, q0Var3, a10.zza());
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        m2Var = f2Var;
                    } else {
                        boolean z9 = false;
                        if (isAssignableFrom) {
                            if (a10.zzc() == 1) {
                                z9 = true;
                            }
                            if (z9) {
                                int i10 = h2.f7344a;
                                p1Var = p1.f7585b;
                                x2Var = n2.f7518d;
                                q0Var = s0.f7663a;
                            } else {
                                int i11 = h2.f7344a;
                                p1Var = p1.f7585b;
                                x2Var = n2.f7518d;
                                q0Var = null;
                            }
                            x1Var = y1.f7803b;
                        } else {
                            if (a10.zzc() == 1) {
                                z9 = true;
                            }
                            if (z9) {
                                int i12 = h2.f7344a;
                                p1Var2 = p1.f7584a;
                                x2Var2 = n2.f7516b;
                                q0 q0Var4 = s0.f7664b;
                                if (q0Var4 != null) {
                                    q0Var2 = q0Var4;
                                } else {
                                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                int i13 = h2.f7344a;
                                p1Var2 = p1.f7584a;
                                x2Var2 = n2.f7517c;
                                q0Var2 = null;
                            }
                            x1Var = y1.f7802a;
                        }
                        int[] iArr = e2.f7271o;
                        if (a10 instanceof l2) {
                            m2Var = e2.J((l2) a10, p1Var, x2Var, q0Var, x1Var);
                        } else {
                            v2 v2Var = (v2) a10;
                            throw null;
                        }
                    }
                    m2 m2Var2 = (m2) this.f7402b.putIfAbsent(cls, m2Var);
                    if (m2Var2 == null) {
                        return m2Var;
                    }
                    return m2Var2;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            return m2Var;
        }
        throw new NullPointerException("messageType");
    }
}
