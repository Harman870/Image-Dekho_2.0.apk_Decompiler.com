package i4;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class v4 extends k7 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7736b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4(Class cls, int i10) {
        super(cls);
        this.f7736b = i10;
    }

    public final b2 a(b2 b2Var) {
        switch (this.f7736b) {
            case 0:
                q9 q9Var = (q9) b2Var;
                new z4(0);
                t9 e10 = y4.e(q9Var.y());
                b2 a10 = new j8(1).a().a(q9Var.z());
                n9 w = o9.w();
                w.j();
                ((o9) w.f7833b).zze = e10;
                w.j();
                o9.D((o9) w.f7833b, (lb) a10);
                w.j();
                ((o9) w.f7833b).zzd = 0;
                return (o9) w.d();
            case 1:
                ea w10 = fa.w();
                byte[] a11 = td.a(((ha) b2Var).v());
                d0 q10 = e0.q(a11, 0, a11.length);
                w10.j();
                ((fa) w10.f7833b).zze = q10;
                w10.j();
                ((fa) w10.f7833b).zzd = 0;
                return (fa) w10.d();
            default:
                xc xcVar = (xc) b2Var;
                uc w11 = vc.w();
                w11.j();
                ((vc) w11.f7833b).zzd = 0;
                byte[] a12 = td.a(32);
                d0 q11 = e0.q(a12, 0, a12.length);
                w11.j();
                ((vc) w11.f7833b).zze = q11;
                return (vc) w11.d();
        }
    }

    public final b2 b(e0 e0Var) {
        switch (this.f7736b) {
            case 0:
                return q9.x(e0Var, p0.f7582b);
            case 1:
                return ha.y(e0Var, p0.f7582b);
            default:
                return xc.x(e0Var, p0.f7582b);
        }
    }

    public final Map c() {
        switch (this.f7736b) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("AES128_CTR_HMAC_SHA256", w4.i(16, 16, 1));
                hashMap.put("AES128_CTR_HMAC_SHA256_RAW", w4.i(16, 16, 3));
                hashMap.put("AES256_CTR_HMAC_SHA256", w4.i(32, 32, 1));
                hashMap.put("AES256_CTR_HMAC_SHA256_RAW", w4.i(32, 32, 3));
                return Collections.unmodifiableMap(hashMap);
            case 1:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_GCM", w4.h(16, 1));
                hashMap2.put("AES128_GCM_RAW", w4.h(16, 3));
                hashMap2.put("AES256_GCM", w4.h(32, 1));
                hashMap2.put("AES256_GCM_RAW", w4.h(32, 3));
                return Collections.unmodifiableMap(hashMap2);
            default:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("XCHACHA20_POLY1305", new j7(1, xc.w()));
                hashMap3.put("XCHACHA20_POLY1305_RAW", new j7(3, xc.w()));
                return Collections.unmodifiableMap(hashMap3);
        }
    }

    public final void d(b2 b2Var) {
        switch (this.f7736b) {
            case 0:
                q9 q9Var = (q9) b2Var;
                k7 a10 = new z4(0).a();
                v9 y9 = q9Var.y();
                y4 y4Var = (y4) a10;
                vd.b(y9.v());
                x9 A = y9.A();
                if (A.v() < 12 || A.v() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                new j8(1).a().d(q9Var.z());
                vd.b(q9Var.y().v());
                return;
            case 1:
                vd.b(((ha) b2Var).v());
                return;
            default:
                xc xcVar = (xc) b2Var;
                return;
        }
    }
}
