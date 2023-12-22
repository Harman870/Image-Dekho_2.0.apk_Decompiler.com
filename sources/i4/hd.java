package i4;

import java.security.interfaces.ECPrivateKey;
import y0.c;

public final class hd implements r3 {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f7363g = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final ECPrivateKey f7364a;

    /* renamed from: b  reason: collision with root package name */
    public final c f7365b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7366c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f7367d;

    /* renamed from: e  reason: collision with root package name */
    public final gd f7368e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7369f;

    public hd(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i10, l6 l6Var) {
        this.f7364a = eCPrivateKey;
        this.f7365b = new c((Object) eCPrivateKey);
        this.f7367d = bArr;
        this.f7366c = str;
        this.f7369f = i10;
        this.f7368e = l6Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zza(byte[] r13) {
        /*
            r12 = this;
            java.security.interfaces.ECPrivateKey r0 = r12.f7364a
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            int r1 = r12.f7369f
            int r0 = i4.id.a(r0)
            int r1 = r1 + -1
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x001b
            if (r1 == r3) goto L_0x0019
            goto L_0x001c
        L_0x0019:
            int r0 = r0 + r0
            goto L_0x001d
        L_0x001b:
            int r0 = r0 + r0
        L_0x001c:
            int r0 = r0 + r2
        L_0x001d:
            int r1 = r13.length
            if (r1 < r0) goto L_0x01f1
            r4 = 0
            byte[] r5 = java.util.Arrays.copyOfRange(r13, r4, r0)
            y0.c r6 = r12.f7365b
            java.lang.String r7 = r12.f7366c
            byte[] r8 = r12.f7367d
            i4.gd r9 = r12.f7368e
            i4.l6 r9 = (i4.l6) r9
            int r9 = r9.f7469b
            int r10 = r12.f7369f
            java.lang.Object r11 = r6.f13011a
            java.security.interfaces.ECPrivateKey r11 = (java.security.interfaces.ECPrivateKey) r11
            java.security.spec.ECParameterSpec r11 = r11.getParams()
            java.security.interfaces.ECPublicKey r10 = i4.id.h(r11, r10, r5)
            java.lang.Object r6 = r6.f13011a
            java.security.interfaces.ECPrivateKey r6 = (java.security.interfaces.ECPrivateKey) r6
            byte[] r6 = i4.id.f(r6, r10)
            byte[][] r3 = new byte[r3][]
            r3[r4] = r5
            r3[r2] = r6
            byte[] r3 = c6.b.K(r3)
            i4.kd r5 = i4.kd.f7451f
            java.lang.Object r5 = r5.a(r7)
            javax.crypto.Mac r5 = (javax.crypto.Mac) r5
            int r6 = r5.getMacLength()
            int r6 = r6 * 255
            if (r9 > r6) goto L_0x01e9
            if (r8 == 0) goto L_0x006d
            int r6 = r8.length
            if (r6 != 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            r6.<init>(r8, r7)
            goto L_0x0078
        L_0x006d:
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            int r8 = r5.getMacLength()
            byte[] r8 = new byte[r8]
            r6.<init>(r8, r7)
        L_0x0078:
            r5.init(r6)
            byte[] r3 = r5.doFinal(r3)
            byte[] r6 = new byte[r9]
            javax.crypto.spec.SecretKeySpec r8 = new javax.crypto.spec.SecretKeySpec
            r8.<init>(r3, r7)
            r5.init(r8)
            byte[] r3 = new byte[r4]
            r7 = r4
        L_0x008c:
            r5.update(r3)
            r3 = 0
            r5.update(r3)
            byte r3 = (byte) r2
            r5.update(r3)
            byte[] r3 = r5.doFinal()
            int r8 = r3.length
            int r10 = r7 + r8
            if (r10 >= r9) goto L_0x00a7
            java.lang.System.arraycopy(r3, r4, r6, r7, r8)
            int r2 = r2 + 1
            r7 = r10
            goto L_0x008c
        L_0x00a7:
            int r2 = r9 - r7
            java.lang.System.arraycopy(r3, r4, r6, r7, r2)
            i4.gd r2 = r12.f7368e
            i4.l6 r2 = (i4.l6) r2
            r2.getClass()
            java.lang.Class<i4.p3> r3 = i4.p3.class
            int r5 = r2.f7469b
            if (r9 != r5) goto L_0x01e1
            java.lang.String r5 = r2.f7468a
            java.lang.String r7 = i4.q4.f7609b
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00f1
            i4.ea r5 = i4.fa.w()
            i4.fa r7 = r2.f7470c
            r5.b(r7)
            int r7 = r2.f7469b
            i4.d0 r4 = i4.e0.q(r6, r4, r7)
            r5.j()
            i4.c1 r6 = r5.f7833b
            i4.fa r6 = (i4.fa) r6
            r6.zze = r4
            i4.c1 r4 = r5.d()
            i4.fa r4 = (i4.fa) r4
            e2.c r5 = new e2.c
            java.lang.String r2 = r2.f7468a
            java.lang.Object r2 = i4.o4.c(r2, r4, r3)
            i4.p3 r2 = (i4.p3) r2
            r5.<init>((i4.p3) r2)
            goto L_0x01bf
        L_0x00f1:
            java.lang.String r5 = r2.f7468a
            java.lang.String r7 = i4.q4.f7608a
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0187
            int r5 = r2.f7472e
            byte[] r4 = java.util.Arrays.copyOfRange(r6, r4, r5)
            int r5 = r2.f7472e
            int r7 = r2.f7469b
            byte[] r5 = java.util.Arrays.copyOfRange(r6, r5, r7)
            i4.s9 r6 = i4.t9.w()
            i4.o9 r7 = r2.f7471d
            i4.t9 r7 = r7.z()
            r6.b(r7)
            i4.d0 r4 = i4.e0.p(r4)
            r6.j()
            i4.c1 r7 = r6.f7833b
            i4.t9 r7 = (i4.t9) r7
            r7.zzf = r4
            i4.c1 r4 = r6.d()
            i4.t9 r4 = (i4.t9) r4
            i4.kb r6 = i4.lb.w()
            i4.o9 r7 = r2.f7471d
            i4.lb r7 = r7.A()
            r6.b(r7)
            i4.d0 r5 = i4.e0.p(r5)
            r6.j()
            i4.c1 r7 = r6.f7833b
            i4.lb r7 = (i4.lb) r7
            r7.zzf = r5
            i4.c1 r5 = r6.d()
            i4.lb r5 = (i4.lb) r5
            i4.n9 r6 = i4.o9.w()
            i4.o9 r7 = r2.f7471d
            int r7 = r7.v()
            r6.j()
            i4.c1 r8 = r6.f7833b
            i4.o9 r8 = (i4.o9) r8
            r8.zzd = r7
            r6.j()
            i4.c1 r7 = r6.f7833b
            i4.o9 r7 = (i4.o9) r7
            r7.zze = r4
            r6.j()
            i4.c1 r4 = r6.f7833b
            i4.o9 r4 = (i4.o9) r4
            i4.o9.D(r4, r5)
            i4.c1 r4 = r6.d()
            i4.o9 r4 = (i4.o9) r4
            e2.c r5 = new e2.c
            java.lang.String r2 = r2.f7468a
            java.lang.Object r2 = i4.o4.c(r2, r4, r3)
            i4.p3 r2 = (i4.p3) r2
            r5.<init>((i4.p3) r2)
            goto L_0x01bf
        L_0x0187:
            java.lang.String r3 = r2.f7468a
            java.lang.String r5 = i4.z5.f7839a
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x01d9
            i4.na r3 = i4.oa.w()
            i4.oa r5 = r2.f7473f
            r3.b(r5)
            int r5 = r2.f7469b
            i4.d0 r4 = i4.e0.q(r6, r4, r5)
            r3.j()
            i4.c1 r5 = r3.f7833b
            i4.oa r5 = (i4.oa) r5
            r5.zze = r4
            i4.c1 r3 = r3.d()
            i4.oa r3 = (i4.oa) r3
            e2.c r5 = new e2.c
            java.lang.String r2 = r2.f7468a
            java.lang.Class<i4.q3> r4 = i4.q3.class
            java.lang.Object r2 = i4.o4.c(r2, r3, r4)
            i4.q3 r2 = (i4.q3) r2
            r5.<init>((i4.q3) r2)
        L_0x01bf:
            byte[] r13 = java.util.Arrays.copyOfRange(r13, r0, r1)
            byte[] r0 = f7363g
            java.lang.Object r1 = r5.f6175a
            i4.p3 r1 = (i4.p3) r1
            if (r1 == 0) goto L_0x01d0
            byte[] r13 = r1.a(r13, r0)
            goto L_0x01d8
        L_0x01d0:
            java.lang.Object r1 = r5.f6176b
            i4.q3 r1 = (i4.q3) r1
            byte[] r13 = r1.a(r13, r0)
        L_0x01d8:
            return r13
        L_0x01d9:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown DEM key type"
            r13.<init>(r0)
            throw r13
        L_0x01e1:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Symmetric key has incorrect length"
            r13.<init>(r0)
            throw r13
        L_0x01e9:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r0 = "size too large"
            r13.<init>(r0)
            throw r13
        L_0x01f1:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r0 = "ciphertext too short"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.hd.zza(byte[]):byte[]");
    }
}
