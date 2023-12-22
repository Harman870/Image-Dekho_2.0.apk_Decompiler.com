package i4;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b5 extends k7 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7197b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5(Class cls, int i10) {
        super(cls);
        this.f7197b = i10;
    }

    public final b2 a(b2 b2Var) {
        switch (this.f7197b) {
            case 0:
                ba baVar = (ba) b2Var;
                y9 w = z9.w();
                byte[] a10 = td.a(baVar.v());
                d0 q10 = e0.q(a10, 0, a10.length);
                w.j();
                ((z9) w.f7833b).zzf = q10;
                da z9 = baVar.z();
                w.j();
                z9.C((z9) w.f7833b, z9);
                w.j();
                ((z9) w.f7833b).zzd = 0;
                return (z9) w.d();
            case 1:
                pc w10 = qc.w();
                w10.j();
                qc.B((qc) w10.f7833b, (rc) b2Var);
                w10.j();
                ((qc) w10.f7833b).zzd = 0;
                return (qc) w10.d();
            default:
                ya yaVar = (ya) b2Var;
                ECParameterSpec i10 = id.i(k6.c(yaVar.y().z().A()));
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) kd.f7453h.a("EC");
                keyPairGenerator.initialize(i10);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                ECPoint w11 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
                eb x9 = fb.x();
                x9.j();
                ((fb) x9.f7833b).zzd = 0;
                bb y9 = yaVar.y();
                x9.j();
                fb.E((fb) x9.f7833b, y9);
                d0 p5 = e0.p(w11.getAffineX().toByteArray());
                x9.j();
                ((fb) x9.f7833b).zzf = p5;
                d0 p10 = e0.p(w11.getAffineY().toByteArray());
                x9.j();
                ((fb) x9.f7833b).zzg = p10;
                cb w12 = db.w();
                w12.j();
                ((db) w12.f7833b).zzd = 0;
                w12.j();
                ((db) w12.f7833b).zze = (fb) x9.d();
                d0 p11 = e0.p(((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray());
                w12.j();
                ((db) w12.f7833b).zzf = p11;
                return (db) w12.d();
        }
    }

    public final b2 b(e0 e0Var) {
        switch (this.f7197b) {
            case 0:
                return ba.y(e0Var, p0.f7582b);
            case 1:
                return rc.y(e0Var, p0.f7582b);
            default:
                return ya.x(e0Var, p0.f7582b);
        }
    }

    public final Map c() {
        switch (this.f7197b) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("AES128_EAX", c5.h(16, 1));
                hashMap.put("AES128_EAX_RAW", c5.h(16, 3));
                hashMap.put("AES256_EAX", c5.h(32, 1));
                hashMap.put("AES256_EAX_RAW", c5.h(32, 3));
                return Collections.unmodifiableMap(hashMap);
            case 2:
                HashMap hashMap2 = new HashMap();
                a4 a10 = b4.a("AES128_GCM");
                byte[] bArr = c6.f7226d;
                hashMap2.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", c6.i(3, a10, bArr, 1));
                hashMap2.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", c6.i(3, b4.a("AES128_GCM"), bArr, 3));
                hashMap2.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", c6.i(4, b4.a("AES128_GCM"), bArr, 1));
                hashMap2.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", c6.i(4, b4.a("AES128_GCM"), bArr, 3));
                hashMap2.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", c6.i(4, b4.a("AES128_GCM"), bArr, 3));
                hashMap2.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", c6.i(3, b4.a("AES128_CTR_HMAC_SHA256"), bArr, 1));
                hashMap2.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", c6.i(3, b4.a("AES128_CTR_HMAC_SHA256"), bArr, 3));
                hashMap2.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", c6.i(4, b4.a("AES128_CTR_HMAC_SHA256"), bArr, 1));
                hashMap2.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", c6.i(4, b4.a("AES128_CTR_HMAC_SHA256"), bArr, 3));
                return Collections.unmodifiableMap(hashMap2);
            default:
                return Collections.emptyMap();
        }
    }

    public final /* synthetic */ void d(b2 b2Var) {
        switch (this.f7197b) {
            case 0:
                ba baVar = (ba) b2Var;
                vd.b(baVar.v());
                if (baVar.z().v() != 12 && baVar.z().v() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 1:
                rc rcVar = (rc) b2Var;
                if (rcVar.z().isEmpty() || !rcVar.A()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            default:
                k6.a(((ya) b2Var).y());
                return;
        }
    }
}
