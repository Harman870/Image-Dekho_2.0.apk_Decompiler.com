package i4;

import java.security.GeneralSecurityException;

public final class c5 extends l7 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7225d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c5(int r5) {
        /*
            r4 = this;
            java.lang.Class<i4.p3> r0 = i4.p3.class
            r4.f7225d = r5
            r1 = 0
            r2 = 1
            if (r5 == r2) goto L_0x0017
            i4.w7[] r5 = new i4.w7[r2]
            i4.a5 r2 = new i4.a5
            r2.<init>(r1, r0)
            r5[r1] = r2
            java.lang.Class<i4.z9> r0 = i4.z9.class
            r4.<init>(r0, r5)
            return
        L_0x0017:
            i4.w7[] r5 = new i4.w7[r2]
            i4.a5 r3 = new i4.a5
            r3.<init>(r2, r0)
            r5[r1] = r3
            java.lang.Class<i4.qc> r0 = i4.qc.class
            r4.<init>(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.c5.<init>(int):void");
    }

    public static j7 h(int i10, int i11) {
        aa w = ba.w();
        w.j();
        ((ba) w.f7833b).zze = i10;
        ca w10 = da.w();
        w10.j();
        ((da) w10.f7833b).zzd = 16;
        w.j();
        ((ba) w.f7833b).zzd = (da) w10.d();
        return new j7(i11, (ba) w.d());
    }

    public final k7 a() {
        switch (this.f7225d) {
            case 0:
                return new b5(ba.class, 0);
            default:
                return new b5(rc.class, 1);
        }
    }

    public final int b() {
        switch (this.f7225d) {
            case 0:
                return 2;
            default:
                return 5;
        }
    }

    public final b2 c(e0 e0Var) {
        switch (this.f7225d) {
            case 0:
                return z9.y(e0Var, p0.f7582b);
            default:
                return qc.y(e0Var, p0.f7582b);
        }
    }

    public final String d() {
        switch (this.f7225d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            default:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
        }
    }

    public final /* bridge */ /* synthetic */ void e(b2 b2Var) {
        switch (this.f7225d) {
            case 0:
                z9 z9Var = (z9) b2Var;
                vd.c(z9Var.v());
                vd.b(z9Var.A().g());
                if (z9Var.z().v() != 12 && z9Var.z().v() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            default:
                vd.c(((qc) b2Var).v());
                return;
        }
    }
}
