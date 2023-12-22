package i4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d5 extends k7 {
    public d5() {
        super(ma.class);
    }

    public final b2 a(b2 b2Var) {
        ia w = ka.w();
        byte[] a10 = td.a(((ma) b2Var).v());
        d0 q10 = e0.q(a10, 0, a10.length);
        w.j();
        ((ka) w.f7833b).zze = q10;
        w.j();
        ((ka) w.f7833b).zzd = 0;
        return (ka) w.d();
    }

    public final b2 b(e0 e0Var) {
        return ma.y(e0Var, p0.f7582b);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", e5.h(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", e5.h(16, 3));
        hashMap.put("AES256_GCM_SIV", e5.h(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", e5.h(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void d(b2 b2Var) {
        vd.b(((ma) b2Var).v());
    }
}
