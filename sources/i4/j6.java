package i4;

import c.a;

@Deprecated
public final class j6 {

    /* renamed from: a  reason: collision with root package name */
    public static final bc f7404a;

    static {
        byte[] bArr = new byte[0];
        bc bcVar = r4.f7634a;
        f7404a = a(3, bcVar, 2, bArr);
        a(4, bcVar, 4, bArr);
        a(3, r4.f7635b, 2, bArr);
    }

    public static bc a(int i10, bc bcVar, int i11, byte[] bArr) {
        xa v10 = ya.v();
        gb v11 = hb.v();
        v11.j();
        hb.C((hb) v11.f7833b);
        v11.j();
        ((hb) v11.f7833b).zze = a.m(5);
        d0 q10 = e0.q(bArr, 0, bArr.length);
        v11.j();
        ((hb) v11.f7833b).zzf = q10;
        va v12 = wa.v();
        v12.j();
        wa.z((wa) v12.f7833b, bcVar);
        za w = bb.w();
        w.j();
        ((bb) w.f7833b).zzd = (hb) v11.d();
        w.j();
        ((bb) w.f7833b).zze = (wa) v12.d();
        w.j();
        bb.D((bb) w.f7833b, i10);
        v10.j();
        ((ya) v10.f7833b).zzd = (bb) w.d();
        ac v13 = bc.v();
        new c6();
        v13.l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        v13.k(i11);
        v13.m(((ya) v10.d()).i());
        return (bc) v13.d();
    }
}
