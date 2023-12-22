package i4;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import y3.a;

public final class g5 extends k7 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7327b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5(Class cls, int i10) {
        super(cls);
        this.f7327b = i10;
    }

    public final b2 a(b2 b2Var) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f7327b) {
            case 0:
                ua uaVar = (ua) b2Var;
                ra w = sa.w();
                w.j();
                ((sa) w.f7833b).zzd = 0;
                byte[] a10 = td.a(32);
                d0 q10 = e0.q(a10, 0, a10.length);
                w.j();
                ((sa) w.f7833b).zze = q10;
                return (sa) w.d();
            default:
                rb rbVar = (rb) b2Var;
                int A = rbVar.y().A() - 2;
                if (A != 1) {
                    int i10 = 3;
                    if (A == 2 || A == 3 || A == 4) {
                        int A2 = rbVar.y().A();
                        byte[] bArr3 = u6.f7711a;
                        int i11 = A2 - 2;
                        if (i11 == 2) {
                            i10 = 1;
                        } else if (i11 == 3) {
                            i10 = 2;
                        } else if (i11 != 4) {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                        ECParameterSpec i12 = id.i(i10);
                        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) kd.f7453h.a("EC");
                        keyPairGenerator.initialize(i12);
                        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                        ECPoint w10 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
                        EllipticCurve curve = id.i(i10).getCurve();
                        id.d(w10, curve);
                        int a11 = id.a(curve);
                        int i13 = a11 + a11 + 1;
                        bArr = new byte[i13];
                        byte[] byteArray = w10.getAffineX().toByteArray();
                        byte[] byteArray2 = w10.getAffineY().toByteArray();
                        int length = byteArray2.length;
                        System.arraycopy(byteArray2, 0, bArr, i13 - length, length);
                        int length2 = byteArray.length;
                        System.arraycopy(byteArray, 0, bArr, (a11 + 1) - length2, length2);
                        bArr[0] = 4;
                        bArr2 = ((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray();
                    } else {
                        throw new GeneralSecurityException("Invalid KEM");
                    }
                } else {
                    bArr2 = td.a(32);
                    bArr2[0] = (byte) (bArr2[0] | 7);
                    byte b10 = bArr2[31] & 63;
                    bArr2[31] = (byte) b10;
                    bArr2[31] = (byte) (b10 | 128);
                    if (bArr2.length == 32) {
                        byte[] bArr4 = new byte[32];
                        bArr4[0] = 9;
                        bArr = a.P(bArr2, bArr4);
                    } else {
                        throw new InvalidKeyException("Private key must have 32 bytes.");
                    }
                }
                wb x9 = xb.x();
                x9.j();
                ((xb) x9.f7833b).zzd = 0;
                tb y9 = rbVar.y();
                x9.j();
                xb.D((xb) x9.f7833b, y9);
                d0 q11 = e0.q(bArr, 0, bArr.length);
                x9.j();
                ((xb) x9.f7833b).zzf = q11;
                ub w11 = vb.w();
                w11.j();
                ((vb) w11.f7833b).zzd = 0;
                w11.j();
                ((vb) w11.f7833b).zze = (xb) x9.d();
                d0 p5 = e0.p(bArr2);
                w11.j();
                ((vb) w11.f7833b).zzf = p5;
                return (vb) w11.d();
        }
    }

    public final b2 b(e0 e0Var) {
        switch (this.f7327b) {
            case 0:
                return ua.x(e0Var, p0.f7582b);
            default:
                return rb.x(e0Var, p0.f7582b);
        }
    }

    public final Map c() {
        switch (this.f7327b) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("CHACHA20_POLY1305", new j7(1, ua.w()));
                hashMap.put("CHACHA20_POLY1305_RAW", new j7(3, ua.w()));
                return Collections.unmodifiableMap(hashMap);
            default:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", t6.i(3, 3, 3, 1));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", t6.i(3, 3, 3, 3));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", t6.i(3, 3, 4, 1));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", t6.i(3, 3, 4, 3));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", t6.i(3, 3, 5, 1));
                hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", t6.i(3, 3, 5, 3));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", t6.i(4, 3, 3, 1));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", t6.i(4, 3, 3, 3));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", t6.i(4, 3, 4, 1));
                hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", t6.i(4, 3, 4, 3));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", t6.i(5, 4, 3, 1));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", t6.i(5, 4, 3, 3));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", t6.i(5, 4, 4, 1));
                hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", t6.i(5, 4, 4, 3));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", t6.i(6, 5, 3, 1));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", t6.i(6, 5, 3, 3));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", t6.i(6, 5, 4, 1));
                hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", t6.i(6, 5, 4, 3));
                return Collections.unmodifiableMap(hashMap2);
        }
    }

    public final /* synthetic */ void d(b2 b2Var) {
        switch (this.f7327b) {
            case 0:
                ua uaVar = (ua) b2Var;
                return;
            default:
                u6.a(((rb) b2Var).y());
                return;
        }
    }
}
