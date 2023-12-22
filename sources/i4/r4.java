package i4;

import c.a;

@Deprecated
public final class r4 {

    /* renamed from: a  reason: collision with root package name */
    public static final bc f7634a = b(16);

    /* renamed from: b  reason: collision with root package name */
    public static final bc f7635b = c(16, 16);

    static {
        b(32);
        a(16);
        a(32);
        c(32, 32);
        ac v10 = bc.v();
        new h5(0);
        v10.l("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        v10.k(2);
        bc bcVar = (bc) v10.d();
        ac v11 = bc.v();
        new w4(2);
        v11.l("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        v11.k(2);
        bc bcVar2 = (bc) v11.d();
    }

    public static void a(int i10) {
        aa w = ba.w();
        w.j();
        ((ba) w.f7833b).zze = i10;
        ca w10 = da.w();
        w10.j();
        ((da) w10.f7833b).zzd = 16;
        w.j();
        ((ba) w.f7833b).zzd = (da) w10.d();
        ac v10 = bc.v();
        v10.m(((ba) w.d()).i());
        new c5(0);
        v10.l("type.googleapis.com/google.crypto.tink.AesEaxKey");
        v10.k(2);
        bc bcVar = (bc) v10.d();
    }

    public static bc b(int i10) {
        ga w = ha.w();
        w.j();
        ((ha) w.f7833b).zzd = i10;
        ac v10 = bc.v();
        v10.m(((ha) w.d()).i());
        new w4(1);
        v10.l("type.googleapis.com/google.crypto.tink.AesGcmKey");
        v10.k(2);
        return (bc) v10.d();
    }

    public static bc c(int i10, int i11) {
        u9 w = v9.w();
        w9 w10 = x9.w();
        w10.j();
        ((x9) w10.f7833b).zzd = 16;
        w.j();
        ((v9) w.f7833b).zzd = (x9) w10.d();
        w.j();
        ((v9) w.f7833b).zze = i10;
        mb w11 = nb.w();
        ob w12 = pb.w();
        w12.j();
        ((pb) w12.f7833b).zzd = a.m(5);
        w12.j();
        ((pb) w12.f7833b).zze = i11;
        w11.j();
        ((nb) w11.f7833b).zzd = (pb) w12.d();
        w11.j();
        ((nb) w11.f7833b).zze = 32;
        p9 v10 = q9.v();
        v10.j();
        ((q9) v10.f7833b).zzd = (v9) w.d();
        v10.j();
        ((q9) v10.f7833b).zze = (nb) w11.d();
        ac v11 = bc.v();
        v11.m(((q9) v10.d()).i());
        new w4(0);
        v11.l("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        v11.k(2);
        return (bc) v11.d();
    }
}
