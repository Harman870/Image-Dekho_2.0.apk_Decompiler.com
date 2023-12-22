package i4;

import androidx.fragment.app.w0;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class c4 {

    /* renamed from: a  reason: collision with root package name */
    public final gc f7223a;

    /* renamed from: b  reason: collision with root package name */
    public final c9 f7224b = c9.f7230b;

    public c4(gc gcVar) {
        this.f7223a = gcVar;
    }

    public static final c4 e(b7 b7Var, p3 p3Var) {
        byte[] bArr = new byte[0];
        byte[] a10 = b7Var.a();
        p0 p0Var = p0.f7582b;
        jb x9 = jb.x(a10, p0Var);
        if (x9.y().g() != 0) {
            try {
                gc A = gc.A(p3Var.a(x9.y().r(), bArr), p0Var);
                if (A.v() > 0) {
                    return new c4(A);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (i1 unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final c4 a() {
        if (this.f7223a != null) {
            dc x9 = gc.x();
            for (fc fcVar : this.f7223a.B()) {
                zb w = fcVar.w();
                if (w.w() == 3) {
                    String A = w.A();
                    e0 z9 = w.z();
                    AtomicReference atomicReference = o4.f7555b;
                    t3 c10 = ((y3) atomicReference.get()).c((Class) null, A);
                    if (c10 instanceof m4) {
                        zb b10 = ((m4) c10).b(z9);
                        String A2 = b10.A();
                        ((y3) atomicReference.get()).c((Class) null, A2).d(b10.z());
                        z0 z0Var = (z0) fcVar.p(5);
                        z0Var.b(fcVar);
                        ec ecVar = (ec) z0Var;
                        ecVar.j();
                        fc.A((fc) ecVar.f7833b, b10);
                        x9.j();
                        gc.D((gc) x9.f7833b, (fc) ecVar.d());
                    } else {
                        throw new GeneralSecurityException(w0.d("manager for key type ", A, " is not a PrivateKeyManager"));
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            int w10 = this.f7223a.w();
            x9.j();
            ((gc) x9.f7833b).zzd = w10;
            return new c4((gc) x9.d());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    public final Object b() {
        Class cls;
        boolean z9;
        Class<r3> cls2 = r3.class;
        l4 l4Var = (l4) o4.f7558e.get(cls2);
        if (l4Var == null) {
            cls = null;
        } else {
            cls = l4Var.zza();
        }
        if (cls != null) {
            gc gcVar = this.f7223a;
            int i10 = p4.f7586a;
            int w = gcVar.w();
            int i11 = 0;
            boolean z10 = false;
            boolean z11 = true;
            for (fc fcVar : gcVar.B()) {
                if (fcVar.E() == 3) {
                    if (!fcVar.D()) {
                        throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(fcVar.v())}));
                    } else if (fcVar.z() == 1) {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(fcVar.v())}));
                    } else if (fcVar.E() != 2) {
                        if (fcVar.v() == w) {
                            if (!z10) {
                                z10 = true;
                            } else {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                        }
                        if (fcVar.w().w() != 4) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        z11 &= z9;
                        i11++;
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(fcVar.v())}));
                    }
                }
            }
            if (i11 == 0) {
                throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
            } else if (z10 || z11) {
                h4 h4Var = new h4(cls);
                c9 c9Var = this.f7224b;
                if (h4Var.f7353b != null) {
                    h4Var.f7355d = c9Var;
                    for (fc fcVar2 : this.f7223a.B()) {
                        if (fcVar2.E() == 3) {
                            zb w10 = fcVar2.w();
                            Object d10 = ((y3) o4.f7555b.get()).c(cls, w10.A()).d(w10.z());
                            if (fcVar2.v() == this.f7223a.w()) {
                                h4Var.a(d10, fcVar2, true);
                            } else {
                                h4Var.a(d10, fcVar2, false);
                            }
                        }
                    }
                    ConcurrentHashMap concurrentHashMap = h4Var.f7353b;
                    if (concurrentHashMap != null) {
                        i4 i4Var = h4Var.f7354c;
                        c9 c9Var2 = h4Var.f7355d;
                        Class cls3 = h4Var.f7352a;
                        k4 k4Var = new k4(concurrentHashMap, i4Var, c9Var2, cls3);
                        h4Var.f7353b = null;
                        l4 l4Var2 = (l4) o4.f7558e.get(cls2);
                        if (l4Var2 == null) {
                            throw new GeneralSecurityException("No wrapper found for ".concat(cls3.getName()));
                        } else if (l4Var2.zza().equals(cls3)) {
                            return l4Var2.a(k4Var);
                        } else {
                            throw new GeneralSecurityException("Wrong input primitive class, expected " + l4Var2.zza().toString() + ", got " + cls3.toString());
                        }
                    } else {
                        throw new IllegalStateException("build cannot be called twice");
                    }
                } else {
                    throw new IllegalStateException("setAnnotations cannot be called after build");
                }
            } else {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
        } else {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
        }
    }

    public final void c(c7 c7Var, p3 p3Var) {
        byte[] bArr = new byte[0];
        gc gcVar = this.f7223a;
        byte[] b10 = p3Var.b(gcVar.e(), bArr);
        try {
            if (gc.A(p3Var.a(b10, bArr), p0.f7582b).equals(gcVar)) {
                ib v10 = jb.v();
                d0 p5 = e0.p(b10);
                v10.j();
                ((jb) v10.f7833b).zzd = p5;
                kc a10 = p4.a(gcVar);
                v10.j();
                ((jb) v10.f7833b).zze = a10;
                c7Var.a((jb) v10.d());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (i1 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(u1.t r7) {
        /*
            r6 = this;
            i4.gc r0 = r6.f7223a
            i4.f1 r0 = r0.B()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            i4.fc r1 = (i4.fc) r1
            i4.zb r2 = r1.w()
            int r2 = r2.w()
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0038
            i4.zb r2 = r1.w()
            int r2 = r2.w()
            if (r2 == r3) goto L_0x0038
            i4.zb r2 = r1.w()
            int r2 = r2.w()
            r5 = 3
            if (r2 == r5) goto L_0x0038
            goto L_0x000a
        L_0x0038:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            i4.zb r3 = r1.w()
            int r3 = r3.w()
            java.lang.String r3 = com.ironsource.adapters.ironsource.a.k(r3)
            r0[r2] = r3
            i4.zb r1 = r1.w()
            java.lang.String r1 = r1.A()
            r0[r4] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>(r0)
            throw r7
        L_0x005f:
            i4.gc r0 = r6.f7223a
            r7.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.c4.d(u1.t):void");
    }

    public final String toString() {
        return p4.a(this.f7223a).toString();
    }
}
