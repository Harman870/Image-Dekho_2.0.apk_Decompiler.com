package i4;

import c.a;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

public final class k6 {
    public static void a(bb bbVar) {
        id.i(c(bbVar.z().A()));
        b(bbVar.z().B());
        if (bbVar.C() != 2) {
            o4.a(bbVar.v().y());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String b(int i10) {
        int i11 = i10 - 2;
        if (i11 == 1) {
            return "HmacSha1";
        }
        if (i11 == 2) {
            return "HmacSha384";
        }
        if (i11 == 3) {
            return "HmacSha256";
        }
        if (i11 == 4) {
            return "HmacSha512";
        }
        if (i11 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(a.m(i10))));
    }

    public static int c(int i10) {
        int i11 = i10 - 2;
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        if (i10 != 1) {
            throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(i11)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int d(int i10) {
        int i11 = i10 - 2;
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        if (i11 == 3) {
            return 3;
        }
        if (i10 != 1) {
            throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(i11)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
