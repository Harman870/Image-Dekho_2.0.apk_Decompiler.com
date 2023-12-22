package s1;

import j2.i;
import j2.l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import k2.a;
import k2.d;
import o1.f;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final i<f, String> f11849a = new i<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final a.c f11850b = k2.a.a(10, new a());

    public class a implements a.b<b> {
        public final Object a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final class b implements a.d {

        /* renamed from: a  reason: collision with root package name */
        public final MessageDigest f11851a;

        /* renamed from: b  reason: collision with root package name */
        public final d.a f11852b = new d.a();

        public b(MessageDigest messageDigest) {
            this.f11851a = messageDigest;
        }

        public final d.a d() {
            return this.f11852b;
        }
    }

    public final String a(f fVar) {
        String a10;
        synchronized (this.f11849a) {
            a10 = this.f11849a.a(fVar);
        }
        if (a10 == null) {
            Object b10 = this.f11850b.b();
            y3.a.h(b10);
            b bVar = (b) b10;
            try {
                fVar.b(bVar.f11851a);
                byte[] digest = bVar.f11851a.digest();
                char[] cArr = l.f8030b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < digest.length; i10++) {
                        byte b11 = digest[i10] & 255;
                        int i11 = i10 * 2;
                        char[] cArr2 = l.f8029a;
                        cArr[i11] = cArr2[b11 >>> 4];
                        cArr[i11 + 1] = cArr2[b11 & 15];
                    }
                    a10 = new String(cArr);
                }
                this.f11850b.a(bVar);
            } catch (Throwable th) {
                this.f11850b.a(bVar);
                throw th;
            }
        }
        synchronized (this.f11849a) {
            this.f11849a.d(fVar, a10);
        }
        return a10;
    }
}
