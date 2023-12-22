package i4;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class i8 extends k7 {
    public i8() {
        super(k9.class);
    }

    public final b2 a(b2 b2Var) {
        k9 k9Var = (k9) b2Var;
        h9 w = i9.w();
        w.j();
        ((i9) w.f7833b).zzd = 0;
        byte[] a10 = td.a(k9Var.v());
        d0 q10 = e0.q(a10, 0, a10.length);
        w.j();
        ((i9) w.f7833b).zze = q10;
        m9 z9 = k9Var.z();
        w.j();
        i9.D((i9) w.f7833b, z9);
        return (i9) w.d();
    }

    public final b2 b(e0 e0Var) {
        return k9.y(e0Var, p0.f7582b);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        j9 w = k9.w();
        w.j();
        ((k9) w.f7833b).zzd = 32;
        l9 w10 = m9.w();
        w10.j();
        ((m9) w10.f7833b).zzd = 16;
        w.j();
        ((k9) w.f7833b).zze = (m9) w10.d();
        hashMap.put("AES_CMAC", new j7(1, (k9) w.d()));
        j9 w11 = k9.w();
        w11.j();
        ((k9) w11.f7833b).zzd = 32;
        l9 w12 = m9.w();
        w12.j();
        ((m9) w12.f7833b).zzd = 16;
        w11.j();
        ((k9) w11.f7833b).zze = (m9) w12.d();
        hashMap.put("AES256_CMAC", new j7(1, (k9) w11.d()));
        j9 w13 = k9.w();
        w13.j();
        ((k9) w13.f7833b).zzd = 32;
        l9 w14 = m9.w();
        w14.j();
        ((m9) w14.f7833b).zzd = 16;
        w13.j();
        ((k9) w13.f7833b).zze = (m9) w14.d();
        hashMap.put("AES256_CMAC_RAW", new j7(3, (k9) w13.d()));
        return Collections.unmodifiableMap(hashMap);
    }

    public final void d(b2 b2Var) {
        k9 k9Var = (k9) b2Var;
        j8.j(k9Var.z());
        if (k9Var.v() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
