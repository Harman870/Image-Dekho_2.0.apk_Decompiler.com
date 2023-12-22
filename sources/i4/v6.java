package i4;

import c6.b;
import java.nio.charset.StandardCharsets;
import javax.crypto.Mac;
import u1.t;

public final class v6 implements r6 {

    /* renamed from: a  reason: collision with root package name */
    public final t f7739a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7740b;

    public v6(t tVar, int i10) {
        this.f7739a = tVar;
        this.f7740b = i10;
    }

    public static v6 b(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? new v6(new t((Object) "HmacSha512"), 3) : new v6(new t((Object) "HmacSha384"), 2) : new v6(new t((Object) "HmacSha256"), 1);
    }

    public final byte[] a(byte[] bArr, s6 s6Var) {
        int i10 = this.f7740b;
        byte[] bArr2 = s6Var.zza().f7793a;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        byte[] f10 = id.f(id.g(i10, bArr3), id.h(id.i(this.f7740b), 1, bArr));
        byte[] bArr4 = s6Var.zzb().f7793a;
        int length2 = bArr4.length;
        byte[] bArr5 = new byte[length2];
        System.arraycopy(bArr4, 0, bArr5, 0, length2);
        byte[] K = b.K(bArr, bArr5);
        byte[] K2 = b.K(u6.f7722m, zzb());
        t tVar = this.f7739a;
        int macLength = Mac.getInstance((String) tVar.f12166a).getMacLength();
        return tVar.i(macLength, tVar.j(b.K(u6.f7724o, K2, "eae_prk".getBytes(StandardCharsets.UTF_8), f10), (byte[]) null), u6.c("shared_secret", K, K2, macLength));
    }

    public final byte[] zzb() {
        int i10 = this.f7740b - 1;
        return i10 != 0 ? i10 != 1 ? u6.f7715e : u6.f7714d : u6.f7713c;
    }
}
