package i4;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class q8 extends k7 {
    public q8() {
        super(nb.class);
    }

    public final b2 a(b2 b2Var) {
        nb nbVar = (nb) b2Var;
        kb w = lb.w();
        w.j();
        ((lb) w.f7833b).zzd = 0;
        pb A = nbVar.A();
        w.j();
        lb.D((lb) w.f7833b, A);
        byte[] a10 = td.a(nbVar.v());
        d0 q10 = e0.q(a10, 0, a10.length);
        w.j();
        ((lb) w.f7833b).zzf = q10;
        return (lb) w.d();
    }

    public final b2 b(e0 e0Var) {
        return nb.z(e0Var, p0.f7582b);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", j8.i(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", j8.i(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", j8.i(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", j8.i(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", j8.i(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", j8.i(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", j8.i(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", j8.i(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", j8.i(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", j8.i(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void d(b2 b2Var) {
        nb nbVar = (nb) b2Var;
        if (nbVar.v() >= 16) {
            j8.k(nbVar.A());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
