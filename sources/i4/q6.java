package i4;

import c6.b;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import u1.t;

public final class q6 implements r3 {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f7610f = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final s6 f7611a;

    /* renamed from: b  reason: collision with root package name */
    public final r6 f7612b;

    /* renamed from: c  reason: collision with root package name */
    public final o6 f7613c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7614d;

    /* renamed from: e  reason: collision with root package name */
    public final t f7615e;

    public q6(s6 s6Var, r6 r6Var, t tVar, o6 o6Var, int i10) {
        this.f7611a = s6Var;
        this.f7612b = r6Var;
        this.f7615e = tVar;
        this.f7613c = o6Var;
        this.f7614d = i10;
    }

    public final byte[] zza(byte[] bArr) {
        byte[] M;
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        int i10 = this.f7614d;
        if (length >= i10) {
            byte[] copyOf = Arrays.copyOf(bArr2, i10);
            byte[] copyOfRange = Arrays.copyOfRange(bArr2, this.f7614d, length);
            s6 s6Var = this.f7611a;
            r6 r6Var = this.f7612b;
            t tVar = this.f7615e;
            o6 o6Var = this.f7613c;
            byte[] a10 = r6Var.a(copyOf, s6Var);
            byte[] K = b.K(u6.f7723n, r6Var.zzb(), tVar.g(), o6Var.zzb());
            byte[] bArr3 = u6.f7721l;
            byte[] bArr4 = p6.f7589d;
            byte[] bArr5 = u6.f7724o;
            byte[] K2 = b.K(u6.f7711a, tVar.j(b.K(bArr5, K, "psk_id_hash".getBytes(StandardCharsets.UTF_8), bArr4), bArr3), tVar.j(b.K(bArr5, K, "info_hash".getBytes(StandardCharsets.UTF_8), new byte[0]), bArr3));
            byte[] j10 = tVar.j(b.K(bArr5, K, "secret".getBytes(StandardCharsets.UTF_8), bArr4), a10);
            int zza = o6Var.zza();
            byte[] i11 = tVar.i(zza, j10, u6.c("key", K2, K, zza));
            byte[] i12 = tVar.i(12, j10, u6.c("base_nonce", K2, K, 12));
            BigInteger bigInteger = BigInteger.ONE;
            p6 p6Var = new p6(i11, i12, bigInteger.shiftLeft(96).subtract(bigInteger), o6Var);
            byte[] bArr6 = f7610f;
            synchronized (p6Var) {
                byte[] byteArray = p6Var.f7592c.toByteArray();
                int length2 = byteArray.length;
                if (length2 != 12) {
                    if (length2 > 13) {
                        throw new GeneralSecurityException("integer too large");
                    } else if (length2 != 13) {
                        byte[] bArr7 = new byte[12];
                        System.arraycopy(byteArray, 0, bArr7, 12 - length2, length2);
                        byteArray = bArr7;
                    } else if (byteArray[0] == 0) {
                        byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                    } else {
                        throw new GeneralSecurityException("integer too large");
                    }
                }
                M = b.M(i12, byteArray);
                if (p6Var.f7592c.compareTo(p6Var.f7591b) < 0) {
                    p6Var.f7592c = p6Var.f7592c.add(bigInteger);
                } else {
                    throw new GeneralSecurityException("message limit reached");
                }
            }
            return p6Var.f7590a.a(i11, M, copyOfRange, bArr6);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
