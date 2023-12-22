package o3;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import r3.j0;
import r3.j1;
import r3.o;
import z3.a;
import z3.b;

public abstract class t extends j1 {

    /* renamed from: c  reason: collision with root package name */
    public final int f10577c;

    public t(byte[] bArr) {
        o.b(bArr.length == 25);
        this.f10577c = Arrays.hashCode(bArr);
    }

    public static byte[] E(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract byte[] F();

    public final a a() {
        return new b(F());
    }

    public final boolean equals(Object obj) {
        a a10;
        if (obj != null && (obj instanceof j0)) {
            try {
                j0 j0Var = (j0) obj;
                if (j0Var.zzc() != this.f10577c || (a10 = j0Var.a()) == null) {
                    return false;
                }
                return Arrays.equals(F(), (byte[]) b.F(a10));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10577c;
    }

    public final int zzc() {
        return this.f10577c;
    }
}
