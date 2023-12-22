package okhttp3.internal.publicsuffix;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f10634e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f10635f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f10636g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    public static final PublicSuffixDatabase f10637h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f10638a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f10639b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f10640c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f10641d;

    public static String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z9;
        byte b10;
        int i12;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = (i13 + length) / 2;
            while (i14 > -1 && bArr3[i14] != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i11 = i15 + i16;
                if (bArr3[i11] == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i11 - i15;
            int i18 = i10;
            boolean z10 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z10) {
                    b10 = 46;
                    z9 = false;
                } else {
                    z9 = z10;
                    b10 = bArr4[i18][i19] & 255;
                }
                i12 = b10 - (bArr3[i15 + i20] & 255);
                if (i12 == 0) {
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    } else if (bArr4[i18].length != i19) {
                        z10 = z9;
                    } else if (i18 == bArr4.length - 1) {
                        break;
                    } else {
                        i18++;
                        i19 = -1;
                        z10 = true;
                    }
                } else {
                    break;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i21 = i17 - i20;
                    int length2 = bArr4[i18].length - i19;
                    while (true) {
                        i18++;
                        if (i18 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i18].length;
                    }
                    if (length2 >= i21) {
                        if (length2 <= i21) {
                            return new String(bArr3, i15, i17, StandardCharsets.UTF_8);
                        }
                    }
                }
                i13 = i11 + 1;
            }
            length = i15 - 1;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            t9.l r1 = new t9.l
            t9.z r2 = new t9.z
            r2.<init>()
            java.util.logging.Logger r3 = t9.q.f12068a
            t9.o r3 = new t9.o
            r3.<init>(r0, r2)
            r1.<init>(r3)
            t9.t r0 = new t9.t
            r0.<init>(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x0045 }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0045 }
            r0.c(r1)     // Catch:{ all -> 0x0045 }
            int r2 = r0.readInt()     // Catch:{ all -> 0x0045 }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0045 }
            r0.c(r2)     // Catch:{ all -> 0x0045 }
            r0.close()
            monitor-enter(r4)
            r4.f10640c = r1     // Catch:{ all -> 0x0042 }
            r4.f10641d = r2     // Catch:{ all -> 0x0042 }
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            java.util.concurrent.CountDownLatch r0 = r4.f10639b
            r0.countDown()
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            throw r0
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0050:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
    }
}
