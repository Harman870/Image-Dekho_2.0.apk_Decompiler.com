package n4;

import java.net.URL;
import java.util.Map;
import r3.o;

public final class m3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f9944a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f9945b;

    /* renamed from: c  reason: collision with root package name */
    public final k3 f9946c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9947d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f9948e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n3 f9949f;

    public m3(n3 n3Var, String str, URL url, byte[] bArr, Map map, k3 k3Var) {
        this.f9949f = n3Var;
        o.e(str);
        this.f9944a = url;
        this.f9945b = bArr;
        this.f9946c = k3Var;
        this.f9947d = str;
        this.f9948e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4 A[SYNTHETIC, Splitter:B:40:0x00f4] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0126 A[SYNTHETIC, Splitter:B:61:0x0126] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0165 A[SYNTHETIC, Splitter:B:73:0x0165] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            n4.n3 r1 = r13.f9949f
            n4.n4 r1 = r1.f9600a
            n4.m4 r1 = r1.d()
            r1.k()
            r1 = 0
            r2 = 0
            n4.n3 r3 = r13.f9949f     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            java.net.URL r4 = r13.f9944a     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            if (r5 == 0) goto L_0x0117
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            r4.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            n4.n4 r5 = r3.f9600a     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            r5.getClass()     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            n4.n4 r3 = r3.f9600a     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            r3.getClass()     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            r3 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r3)     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            r4.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            r3 = 1
            r4.setDoInput(r3)     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            java.util.Map r5 = r13.f9948e     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            if (r5 == 0) goto L_0x0065
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0112, all -> 0x010d }
        L_0x0049:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            if (r6 == 0) goto L_0x0065
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            goto L_0x0049
        L_0x0065:
            byte[] r5 = r13.f9945b     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            if (r5 == 0) goto L_0x00b0
            n4.n3 r5 = r13.f9949f     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            n4.w7 r5 = r5.f10066b     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            n4.y7 r5 = r5.f10288g     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            n4.w7.H(r5)     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            byte[] r6 = r13.f9945b     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            byte[] r5 = r5.J(r6)     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            n4.n3 r6 = r13.f9949f     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            n4.n4 r6 = r6.f9600a     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            n4.i3 r6 = r6.a()     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            n4.g3 r6 = r6.f9835n     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            java.lang.String r7 = "Uploading data. size"
            int r8 = r5.length     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            r6.b(r7, r9)     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            r4.setDoOutput(r3)     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r3, r6)     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            r4.setFixedLengthStreamingMode(r8)     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            r4.connect()     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            r3.write(r5)     // Catch:{ IOException -> 0x00ad, all -> 0x00a7 }
            r3.close()     // Catch:{ IOException -> 0x00ad, all -> 0x00a7 }
            goto L_0x00b0
        L_0x00a7:
            r5 = move-exception
            r9 = r1
            r12 = r2
            r2 = r3
            goto L_0x0124
        L_0x00ad:
            r5 = move-exception
            goto L_0x015f
        L_0x00b0:
            int r8 = r4.getResponseCode()     // Catch:{ IOException -> 0x0112, all -> 0x010d }
            java.util.Map r11 = r4.getHeaderFields()     // Catch:{ IOException -> 0x0107, all -> 0x0103 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00f0 }
            r3.<init>()     // Catch:{ all -> 0x00f0 }
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ all -> 0x00f0 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00ee }
        L_0x00c5:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00ee }
            if (r7 <= 0) goto L_0x00cf
            r3.write(r6, r1, r7)     // Catch:{ all -> 0x00ee }
            goto L_0x00c5
        L_0x00cf:
            byte[] r10 = r3.toByteArray()     // Catch:{ all -> 0x00ee }
            r5.close()     // Catch:{ IOException -> 0x00fd, all -> 0x00f8 }
            r4.disconnect()
            n4.n3 r0 = r13.f9949f
            n4.n4 r0 = r0.f9600a
            n4.m4 r0 = r0.d()
            n4.l3 r1 = new n4.l3
            java.lang.String r6 = r13.f9947d
            n4.k3 r7 = r13.f9946c
            r9 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0195
        L_0x00ee:
            r1 = move-exception
            goto L_0x00f2
        L_0x00f0:
            r1 = move-exception
            r5 = r2
        L_0x00f2:
            if (r5 == 0) goto L_0x00f7
            r5.close()     // Catch:{ IOException -> 0x00fd, all -> 0x00f8 }
        L_0x00f7:
            throw r1     // Catch:{ IOException -> 0x00fd, all -> 0x00f8 }
        L_0x00f8:
            r1 = move-exception
            r5 = r1
            r9 = r8
            r12 = r11
            goto L_0x0124
        L_0x00fd:
            r1 = move-exception
            r10 = r1
            r9 = r8
            r12 = r11
            goto L_0x0163
        L_0x0103:
            r5 = move-exception
            r12 = r2
            r9 = r8
            goto L_0x0124
        L_0x0107:
            r1 = move-exception
            r10 = r1
            r12 = r2
            r9 = r8
            goto L_0x0163
        L_0x010d:
            r3 = move-exception
            r9 = r1
            r12 = r2
            r5 = r3
            goto L_0x0124
        L_0x0112:
            r3 = move-exception
            r9 = r1
            r12 = r2
            r10 = r3
            goto L_0x0163
        L_0x0117:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x015b, all -> 0x011f }
            throw r3     // Catch:{ IOException -> 0x015b, all -> 0x011f }
        L_0x011f:
            r3 = move-exception
            r5 = r3
            r9 = r1
            r4 = r2
            r12 = r4
        L_0x0124:
            if (r2 == 0) goto L_0x013e
            r2.close()     // Catch:{ IOException -> 0x012a }
            goto L_0x013e
        L_0x012a:
            r1 = move-exception
            n4.n3 r2 = r13.f9949f
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9828f
            java.lang.String r3 = r13.f9947d
            n4.h3 r3 = n4.i3.p(r3)
            r2.c(r0, r3, r1)
        L_0x013e:
            if (r4 == 0) goto L_0x0143
            r4.disconnect()
        L_0x0143:
            n4.n3 r0 = r13.f9949f
            n4.n4 r0 = r0.f9600a
            n4.m4 r0 = r0.d()
            n4.l3 r1 = new n4.l3
            java.lang.String r7 = r13.f9947d
            n4.k3 r8 = r13.f9946c
            r10 = 0
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.o(r1)
            throw r5
        L_0x015b:
            r3 = move-exception
            r5 = r3
            r3 = r2
            r4 = r3
        L_0x015f:
            r9 = r1
            r12 = r2
            r2 = r3
            r10 = r5
        L_0x0163:
            if (r2 == 0) goto L_0x017d
            r2.close()     // Catch:{ IOException -> 0x0169 }
            goto L_0x017d
        L_0x0169:
            r1 = move-exception
            n4.n3 r2 = r13.f9949f
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9828f
            java.lang.String r3 = r13.f9947d
            n4.h3 r3 = n4.i3.p(r3)
            r2.c(r0, r3, r1)
        L_0x017d:
            if (r4 == 0) goto L_0x0182
            r4.disconnect()
        L_0x0182:
            n4.n3 r0 = r13.f9949f
            n4.n4 r0 = r0.f9600a
            n4.m4 r0 = r0.d()
            n4.l3 r1 = new n4.l3
            java.lang.String r7 = r13.f9947d
            n4.k3 r8 = r13.f9946c
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0195:
            r0.o(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.m3.run():void");
    }
}
