package i4;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

public final class qd implements g9 {

    /* renamed from: a  reason: collision with root package name */
    public final pd f7619a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7620b;

    /* renamed from: c  reason: collision with root package name */
    public final Key f7621c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7622d;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qd(java.lang.String r6, javax.crypto.spec.SecretKeySpec r7) {
        /*
            r5 = this;
            r5.<init>()
            i4.pd r0 = new i4.pd
            r0.<init>(r5)
            r5.f7619a = r0
            r1 = 2
            boolean r2 = i4.j3.c(r1)
            if (r2 == 0) goto L_0x008e
            r5.f7620b = r6
            r5.f7621c = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r2 = 16
            if (r7 < r2) goto L_0x0086
            int r7 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 1
            switch(r7) {
                case -1823053428: goto L_0x0051;
                case 392315023: goto L_0x0047;
                case 392315118: goto L_0x003d;
                case 392316170: goto L_0x0033;
                case 392317873: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x005b
        L_0x0029:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = r2
            goto L_0x005c
        L_0x0033:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = r3
            goto L_0x005c
        L_0x003d:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = r1
            goto L_0x005c
        L_0x0047:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = r4
            goto L_0x005c
        L_0x0051:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            r7 = 0
            goto L_0x005c
        L_0x005b:
            r7 = -1
        L_0x005c:
            if (r7 == 0) goto L_0x007e
            if (r7 == r4) goto L_0x007b
            if (r7 == r1) goto L_0x0078
            if (r7 == r3) goto L_0x0075
            if (r7 != r2) goto L_0x0069
            r6 = 64
            goto L_0x0080
        L_0x0069:
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        L_0x0075:
            r6 = 48
            goto L_0x0080
        L_0x0078:
            r6 = 32
            goto L_0x0080
        L_0x007b:
            r6 = 28
            goto L_0x0080
        L_0x007e:
            r6 = 20
        L_0x0080:
            r5.f7622d = r6
            r0.get()
            return
        L_0x0086:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        L_0x008e:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.qd.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }

    public final byte[] a(int i10, byte[] bArr) {
        if (i10 <= this.f7622d) {
            ((Mac) this.f7619a.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.f7619a.get()).doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
