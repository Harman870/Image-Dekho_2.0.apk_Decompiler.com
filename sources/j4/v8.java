package j4;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public final class v8 {

    /* renamed from: c  reason: collision with root package name */
    public static final v8 f8521c = new v8();

    /* renamed from: a  reason: collision with root package name */
    public final g8 f8522a = new g8();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f8523b = new ConcurrentHashMap();

    public final y8 a(Class cls) {
        j9 j9Var;
        b8 b8Var;
        b8 b8Var2;
        j9 j9Var2;
        r8 r8Var;
        Class cls2;
        Charset charset = s7.f8462a;
        if (cls != null) {
            y8 y8Var = (y8) this.f8523b.get(cls);
            if (y8Var == null) {
                g8 g8Var = this.f8522a;
                g8Var.getClass();
                Class<m7> cls3 = m7.class;
                Class cls4 = z8.f8581a;
                if (cls3.isAssignableFrom(cls) || (cls2 = z8.f8581a) == null || cls2.isAssignableFrom(cls)) {
                    l8 a10 = g8Var.f8201a.a(cls);
                    boolean zzb = a10.zzb();
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    if (zzb) {
                        if (isAssignableFrom) {
                            r8Var = new r8(z8.f8583c, b7.f8060a, a10.zza());
                        } else {
                            j9 j9Var3 = z8.f8582b;
                            z6 z6Var = b7.f8061b;
                            if (z6Var != null) {
                                r8Var = new r8(j9Var3, z6Var, a10.zza());
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        y8Var = r8Var;
                    } else {
                        boolean z9 = false;
                        z6 z6Var2 = null;
                        if (isAssignableFrom) {
                            if (a10.zzc() == 1) {
                                z9 = true;
                            }
                            if (z9) {
                                int i10 = t8.f8472a;
                                b8Var = b8.f8063b;
                                j9Var = z8.f8583c;
                                z6Var2 = b7.f8060a;
                            } else {
                                int i11 = t8.f8472a;
                                b8Var = b8.f8063b;
                                j9Var = z8.f8583c;
                            }
                            int i12 = k8.f8297a;
                        } else {
                            if (a10.zzc() == 1) {
                                z9 = true;
                            }
                            if (z9) {
                                int i13 = t8.f8472a;
                                b8Var2 = b8.f8062a;
                                j9Var2 = z8.f8582b;
                                z6Var2 = b7.f8061b;
                                if (z6Var2 == null) {
                                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                int i14 = t8.f8472a;
                                b8Var2 = b8.f8062a;
                                j9Var2 = z8.f8582b;
                            }
                            int i15 = k8.f8297a;
                        }
                        y8Var = q8.B(a10, b8Var, j9Var, z6Var2);
                    }
                    y8 y8Var2 = (y8) this.f8523b.putIfAbsent(cls, y8Var);
                    if (y8Var2 == null) {
                        return y8Var;
                    }
                    return y8Var2;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            return y8Var;
        }
        throw new NullPointerException("messageType");
    }
}
