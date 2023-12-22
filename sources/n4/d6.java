package n4;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import r3.o;
import u1.t;

public final class d6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f9697a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e6 f9698b;

    /* renamed from: c  reason: collision with root package name */
    public final t f9699c;

    public d6(e6 e6Var, String str, URL url, t tVar) {
        this.f9698b = e6Var;
        o.e(str);
        this.f9697a = url;
        this.f9699c = tVar;
    }

    public final void a(int i10, IOException iOException, byte[] bArr, Map map) {
        this.f9698b.f9600a.d().o(new c6(this, i10, iOException, bArr, map));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC, Splitter:B:26:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            n4.e6 r0 = r10.f9698b
            n4.n4 r0 = r0.f9600a
            n4.m4 r0 = r0.d()
            r0.k()
            r0 = 0
            r1 = 0
            n4.e6 r2 = r10.f9698b     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            java.net.URL r3 = r10.f9697a     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            if (r4 == 0) goto L_0x0080
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r3.setDefaultUseCaches(r0)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            n4.n4 r4 = r2.f9600a     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r4.getClass()     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            n4.n4 r2 = r2.f9600a     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r2.getClass()     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r3.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x0079, all -> 0x0076 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x006a }
            r5.<init>()     // Catch:{ all -> 0x006a }
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ all -> 0x006a }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0068 }
        L_0x0050:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x0068 }
            if (r8 <= 0) goto L_0x005a
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x0068 }
            goto L_0x0050
        L_0x005a:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x0068 }
            r6.close()     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            r3.disconnect()
            r10.a(r2, r1, r0, r4)
            return
        L_0x0068:
            r0 = move-exception
            goto L_0x006c
        L_0x006a:
            r0 = move-exception
            r6 = r1
        L_0x006c:
            if (r6 == 0) goto L_0x0071
            r6.close()     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
        L_0x0071:
            throw r0     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            goto L_0x008e
        L_0x0074:
            r0 = move-exception
            goto L_0x009d
        L_0x0076:
            r0 = move-exception
            r4 = r1
            goto L_0x008e
        L_0x0079:
            r0 = move-exception
            r4 = r1
            goto L_0x009d
        L_0x007c:
            r2 = move-exception
            goto L_0x008a
        L_0x007e:
            r2 = move-exception
            goto L_0x0099
        L_0x0080:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
            throw r2     // Catch:{ IOException -> 0x0097, all -> 0x0088 }
        L_0x0088:
            r2 = move-exception
            r3 = r1
        L_0x008a:
            r4 = r1
            r9 = r2
            r2 = r0
            r0 = r9
        L_0x008e:
            if (r3 == 0) goto L_0x0093
            r3.disconnect()
        L_0x0093:
            r10.a(r2, r1, r1, r4)
            throw r0
        L_0x0097:
            r2 = move-exception
            r3 = r1
        L_0x0099:
            r4 = r1
            r9 = r2
            r2 = r0
            r0 = r9
        L_0x009d:
            if (r3 == 0) goto L_0x00a2
            r3.disconnect()
        L_0x00a2:
            r10.a(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.d6.run():void");
    }
}
