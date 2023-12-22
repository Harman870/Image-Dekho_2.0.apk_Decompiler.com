package b6;

import c6.b;
import i4.r6;
import i4.s6;
import i4.u6;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;
import u1.t;
import y3.a;

public final class g implements f, r6 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2289a;

    public /* synthetic */ g(Object obj) {
        this.f2289a = obj;
    }

    public Object a() {
        return this.f2289a;
    }

    public byte[] a(byte[] bArr, s6 s6Var) {
        byte[] bArr2 = s6Var.zza().f7793a;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        byte[] P = a.P(bArr3, bArr);
        byte[] bArr4 = s6Var.zzb().f7793a;
        int length2 = bArr4.length;
        byte[] bArr5 = new byte[length2];
        System.arraycopy(bArr4, 0, bArr5, 0, length2);
        byte[] K = b.K(bArr, bArr5);
        byte[] K2 = b.K(u6.f7722m, u6.f7712b);
        t tVar = (t) this.f2289a;
        int macLength = Mac.getInstance((String) tVar.f12166a).getMacLength();
        return tVar.i(macLength, tVar.j(b.K(u6.f7724o, K2, "eae_prk".getBytes(StandardCharsets.UTF_8), P), (byte[]) null), u6.c("shared_secret", K, K2, macLength));
    }

    public byte[] zzb() {
        if (Arrays.equals(((t) this.f2289a).g(), u6.f7716f)) {
            return u6.f7712b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
