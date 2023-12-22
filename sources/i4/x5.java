package i4;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class x5 extends k7 {
    public x5() {
        super(qa.class);
    }

    public final b2 a(b2 b2Var) {
        na w = oa.w();
        byte[] a10 = td.a(((qa) b2Var).v());
        d0 q10 = e0.q(a10, 0, a10.length);
        w.j();
        ((oa) w.f7833b).zze = q10;
        w.j();
        ((oa) w.f7833b).zzd = 0;
        return (oa) w.d();
    }

    public final b2 b(e0 e0Var) {
        return qa.y(e0Var, p0.f7582b);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        pa w = qa.w();
        w.j();
        ((qa) w.f7833b).zzd = 64;
        hashMap.put("AES256_SIV", new j7(1, (qa) w.d()));
        pa w10 = qa.w();
        w10.j();
        ((qa) w10.f7833b).zzd = 64;
        hashMap.put("AES256_SIV_RAW", new j7(3, (qa) w10.d()));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void d(b2 b2Var) {
        qa qaVar = (qa) b2Var;
        if (qaVar.v() != 64) {
            int v10 = qaVar.v();
            throw new InvalidAlgorithmParameterException("invalid key size: " + v10 + ". Valid keys must have 64 bytes.");
        }
    }
}
