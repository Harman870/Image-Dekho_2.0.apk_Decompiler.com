package x1;

import android.graphics.Bitmap;
import o1.c;
import o1.g;
import o1.h;
import o1.k;

public final class b implements k<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    public static final g<Integer> f12840b = g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c  reason: collision with root package name */
    public static final g<Bitmap.CompressFormat> f12841c = new g<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, g.f10514e);

    /* renamed from: a  reason: collision with root package name */
    public final r1.b f12842a;

    public b(r1.b bVar) {
        this.f12842a = bVar;
    }

    public final c c(h hVar) {
        return c.TRANSFORMED;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|41|(0)|45|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (r6 == null) goto L_0x006f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065 A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c0 A[SYNTHETIC, Splitter:B:43:0x00c0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.Object r9, java.io.File r10, o1.h r11) {
        /*
            r8 = this;
            q1.w r9 = (q1.w) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            o1.g<android.graphics.Bitmap$CompressFormat> r1 = f12841c
            java.lang.Object r1 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L_0x0015
            goto L_0x0020
        L_0x0015:
            boolean r1 = r9.hasAlpha()
            if (r1 == 0) goto L_0x001e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0020
        L_0x001e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0020:
            r9.getWidth()
            r9.getHeight()
            int r2 = j2.h.f8019b     // Catch:{ all -> 0x00c4 }
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00c4 }
            o1.g<java.lang.Integer> r4 = f12840b     // Catch:{ all -> 0x00c4 }
            java.lang.Object r4 = r11.c(r4)     // Catch:{ all -> 0x00c4 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00c4 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00c4 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005d }
            r7.<init>(r10)     // Catch:{ IOException -> 0x005d }
            r1.b r10 = r8.f12842a     // Catch:{ IOException -> 0x0058, all -> 0x004c }
            if (r10 == 0) goto L_0x004f
            com.bumptech.glide.load.data.c r10 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x0058, all -> 0x004c }
            r1.b r6 = r8.f12842a     // Catch:{ IOException -> 0x0058, all -> 0x004c }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x0058, all -> 0x004c }
            r6 = r10
            goto L_0x0050
        L_0x004c:
            r9 = move-exception
            goto L_0x00be
        L_0x004f:
            r6 = r7
        L_0x0050:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x005d }
            r6.close()     // Catch:{ IOException -> 0x005d }
            r5 = 1
            goto L_0x006c
        L_0x0058:
            r10 = move-exception
            r6 = r7
            goto L_0x005e
        L_0x005b:
            r9 = move-exception
            goto L_0x00bd
        L_0x005d:
            r10 = move-exception
        L_0x005e:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x006a
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch:{ all -> 0x005b }
        L_0x006a:
            if (r6 == 0) goto L_0x006f
        L_0x006c:
            r6.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x00c4 }
            if (r10 == 0) goto L_0x00bc
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r10.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch:{ all -> 0x00c4 }
            r10.append(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch:{ all -> 0x00c4 }
            int r1 = j2.l.c(r9)     // Catch:{ all -> 0x00c4 }
            r10.append(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch:{ all -> 0x00c4 }
            double r1 = j2.h.a(r2)     // Catch:{ all -> 0x00c4 }
            r10.append(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch:{ all -> 0x00c4 }
            o1.g<android.graphics.Bitmap$CompressFormat> r1 = f12841c     // Catch:{ all -> 0x00c4 }
            java.lang.Object r11 = r11.c(r1)     // Catch:{ all -> 0x00c4 }
            r10.append(r11)     // Catch:{ all -> 0x00c4 }
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch:{ all -> 0x00c4 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00c4 }
            r10.append(r9)     // Catch:{ all -> 0x00c4 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x00c4 }
            android.util.Log.v(r0, r9)     // Catch:{ all -> 0x00c4 }
        L_0x00bc:
            return r5
        L_0x00bd:
            r7 = r6
        L_0x00be:
            if (r7 == 0) goto L_0x00c3
            r7.close()     // Catch:{ IOException -> 0x00c3 }
        L_0x00c3:
            throw r9     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.b.d(java.lang.Object, java.io.File, o1.h):boolean");
    }
}
