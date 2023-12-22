package i4;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

public final class id {
    public static int a(EllipticCurve ellipticCurve) {
        return (b(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger b(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static BigInteger c(BigInteger bigInteger, boolean z9, EllipticCurve ellipticCurve) {
        BigInteger bigInteger2;
        BigInteger b10 = b(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(b10);
        if (b10.signum() == 1) {
            BigInteger mod2 = mod.mod(b10);
            BigInteger bigInteger3 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger3)) {
                if (!b10.testBit(0) || !b10.testBit(1)) {
                    if (b10.testBit(0) && !b10.testBit(1)) {
                        bigInteger3 = BigInteger.ONE;
                        BigInteger shiftRight = b10.subtract(bigInteger3).shiftRight(1);
                        int i10 = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger3.multiply(bigInteger3).subtract(mod2).mod(b10);
                            if (mod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, b10);
                            BigInteger bigInteger4 = BigInteger.ONE;
                            if (modPow.add(bigInteger4).equals(b10)) {
                                BigInteger shiftRight2 = b10.add(bigInteger4).shiftRight(1);
                                BigInteger bigInteger5 = bigInteger3;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                    bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(b10).multiply(mod3)).mod(b10);
                                    BigInteger mod4 = multiply.add(multiply).mod(b10);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod5 = bigInteger5.multiply(bigInteger3).add(mod4.multiply(mod3)).mod(b10);
                                        bigInteger4 = bigInteger3.multiply(mod4).add(bigInteger5).mod(b10);
                                        bigInteger5 = mod5;
                                    } else {
                                        bigInteger4 = mod4;
                                    }
                                }
                                bigInteger2 = bigInteger5;
                            } else if (modPow.equals(bigInteger4)) {
                                bigInteger3 = bigInteger3.add(bigInteger4);
                                i10++;
                                if (i10 == 128 && !b10.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    } else {
                        bigInteger2 = null;
                    }
                } else {
                    bigInteger2 = mod2.modPow(b10.add(BigInteger.ONE).shiftRight(2), b10);
                }
                if (bigInteger3 != null && bigInteger3.multiply(bigInteger3).mod(b10).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z9 != bigInteger3.testBit(0) ? b10.subtract(bigInteger3).mod(b10) : bigInteger3;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static void d(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger b10 = b(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(b10) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(b10) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(b10).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(b10))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static void e(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static byte[] f(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        e(eCPrivateKey, eCPublicKey);
        ECPoint w = eCPublicKey.getW();
        d(w, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) kd.f7454i.a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) kd.f7452g.a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(b(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            c(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static ECPrivateKey g(int i10, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) kd.f7454i.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), i(i10)));
    }

    public static ECPublicKey h(ECParameterSpec eCParameterSpec, int i10, byte[] bArr) {
        ECPoint eCPoint;
        EllipticCurve curve = eCParameterSpec.getCurve();
        int a10 = a(curve);
        int i11 = i10 - 1;
        boolean z9 = false;
        if (i11 == 0) {
            int length = bArr.length;
            if (length != a10 + a10 + 1) {
                throw new GeneralSecurityException("invalid point size");
            } else if (bArr[0] == 4) {
                int i12 = a10 + 1;
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i12)), new BigInteger(1, Arrays.copyOfRange(bArr, i12, length)));
            } else {
                throw new GeneralSecurityException("invalid point format");
            }
        } else if (i11 != 2) {
            BigInteger b10 = b(curve);
            int length2 = bArr.length;
            if (length2 == a10 + 1) {
                byte b11 = bArr[0];
                if (b11 != 2) {
                    if (b11 == 3) {
                        z9 = true;
                    } else {
                        throw new GeneralSecurityException("invalid format");
                    }
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length2));
                if (bigInteger.signum() == -1 || bigInteger.compareTo(b10) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                eCPoint = new ECPoint(bigInteger, c(bigInteger, z9, curve));
                return (ECPublicKey) ((KeyFactory) kd.f7454i.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
            }
            throw new GeneralSecurityException("compressed point has wrong length");
        } else {
            int length3 = bArr.length;
            if (length3 == a10 + a10) {
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, a10)), new BigInteger(1, Arrays.copyOfRange(bArr, a10, length3)));
            } else {
                throw new GeneralSecurityException("invalid point size");
            }
        }
        d(eCPoint, curve);
        return (ECPublicKey) ((KeyFactory) kd.f7454i.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
    }

    public static ECParameterSpec i(int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i11 = i10 - 1;
        if (i11 == 0) {
            str = "115792089210356248762697446949407573530086143415290314195533631308867097853951";
            str2 = "115792089210356248762697446949407573529996955224135760342422259061068512044369";
            str3 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b";
            str4 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296";
            str5 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5";
        } else if (i11 != 1) {
            str = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";
            str2 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449";
            str3 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00";
            str4 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66";
            str5 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650";
        } else {
            str = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319";
            str2 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643";
            str3 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef";
            str4 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7";
            str5 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f";
        }
        return j(str, str2, str3, str4, str5);
    }

    public static ECParameterSpec j(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}
