package x1;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.activity.f;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import o1.g;
import o1.h;
import o1.i;
import r1.d;
import x1.l;

public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final g<o1.b> f12873f = g.a(o1.b.PREFER_ARGB_8888, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g  reason: collision with root package name */
    public static final g<i> f12874g = new g<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, g.f10514e);

    /* renamed from: h  reason: collision with root package name */
    public static final g<Boolean> f12875h;

    /* renamed from: i  reason: collision with root package name */
    public static final g<Boolean> f12876i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f12877j = new a();
    public static final ArrayDeque k = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public final d f12878a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f12879b;

    /* renamed from: c  reason: collision with root package name */
    public final r1.b f12880c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f12881d;

    /* renamed from: e  reason: collision with root package name */
    public final r f12882e;

    public class a implements b {
        public final void a(Bitmap bitmap, d dVar) {
        }

        public final void b() {
        }
    }

    public interface b {
        void a(Bitmap bitmap, d dVar);

        void b();
    }

    static {
        l.e eVar = l.f12866a;
        Boolean bool = Boolean.FALSE;
        f12875h = g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f12876i = g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = j2.l.f8029a;
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, d dVar, r1.b bVar) {
        if (r.f12890j == null) {
            synchronized (r.class) {
                if (r.f12890j == null) {
                    r.f12890j = new r();
                }
            }
        }
        this.f12882e = r.f12890j;
        this.f12881d = list;
        y3.a.h(displayMetrics);
        this.f12879b = displayMetrics;
        y3.a.h(dVar);
        this.f12878a = dVar;
        y3.a.h(bVar);
        this.f12880c = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(x1.s r5, android.graphics.BitmapFactory.Options r6, x1.m.b r7, r1.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.b()
            r5.b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = x1.z.f12925d
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch:{ IllegalArgumentException -> 0x0021 }
            r4.unlock()
            return r5
        L_0x001f:
            r5 = move-exception
            goto L_0x0048
        L_0x0021:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x001f }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x001f }
        L_0x0032:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0047
            r8.e(r0)     // Catch:{ IOException -> 0x0046 }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x0046 }
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch:{ IOException -> 0x0046 }
            java.util.concurrent.locks.Lock r6 = x1.z.f12925d
            r6.unlock()
            return r5
        L_0x0046:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0047:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0048:
            java.util.concurrent.locks.Lock r6 = x1.z.f12925d
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.m.c(x1.s, android.graphics.BitmapFactory$Options, x1.m$b, r1.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder g10 = f.g(" (");
        g10.append(bitmap.getAllocationByteCount());
        g10.append(")");
        String sb = g10.toString();
        StringBuilder g11 = f.g("[");
        g11.append(bitmap.getWidth());
        g11.append("x");
        g11.append(bitmap.getHeight());
        g11.append("] ");
        g11.append(bitmap.getConfig());
        g11.append(sb);
        return g11.toString();
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final d a(s sVar, int i10, int i11, h hVar, b bVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z9;
        h hVar2 = hVar;
        byte[] bArr = (byte[]) this.f12880c.c(65536, byte[].class);
        synchronized (m.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        o1.b bVar2 = (o1.b) hVar2.c(f12873f);
        i iVar = (i) hVar2.c(f12874g);
        l lVar = (l) hVar2.c(l.f12871f);
        boolean booleanValue = ((Boolean) hVar2.c(f12875h)).booleanValue();
        g gVar = f12876i;
        if (hVar2.c(gVar) == null || !((Boolean) hVar2.c(gVar)).booleanValue()) {
            z9 = false;
        } else {
            z9 = true;
        }
        try {
            d d10 = d.d(b(sVar, options2, lVar, bVar2, iVar, z9, i10, i11, booleanValue, bVar), this.f12878a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f12880c.put(bArr);
            return d10;
        } catch (Throwable th) {
            f(options2);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f12880c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:177:0x041c, code lost:
        if (r0 >= 26) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04fa, code lost:
        r2.postScale(-1.0f, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0509, code lost:
        r3 = new android.graphics.RectF(0.0f, 0.0f, (float) r0.getWidth(), (float) r0.getHeight());
        r2.mapRect(r3);
        r4 = java.lang.Math.round(r3.width());
        r5 = java.lang.Math.round(r3.height());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0530, code lost:
        if (r0.getConfig() == null) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0532, code lost:
        r6 = r0.getConfig();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0537, code lost:
        r6 = android.graphics.Bitmap.Config.ARGB_8888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0539, code lost:
        r1 = r1.d(r4, r5, r6);
        r2.postTranslate(-r3.left, -r3.top);
        r1.setHasAlpha(r0.hasAlpha());
        x1.z.a(r0, r1, r2);
        r6 = r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(x1.s r39, android.graphics.BitmapFactory.Options r40, x1.l r41, o1.b r42, o1.i r43, boolean r44, int r45, int r46, boolean r47, x1.m.b r48) {
        /*
            r38 = this;
            r1 = r38
            r2 = r39
            r9 = r40
            r0 = r41
            r10 = r42
            r11 = r43
            r12 = r45
            r13 = r46
            r14 = r48
            int r3 = j2.h.f8019b
            long r15 = android.os.SystemClock.elapsedRealtimeNanos()
            r1.d r3 = r1.f12878a
            r4 = 1
            r9.inJustDecodeBounds = r4
            c(r2, r9, r14, r3)
            r3 = 0
            r9.inJustDecodeBounds = r3
            int r8 = r9.outWidth
            int r7 = r9.outHeight
            java.lang.String r6 = r9.outMimeType
            r4 = -1
            if (r8 == r4) goto L_0x0032
            if (r7 != r4) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            r17 = r44
            goto L_0x0034
        L_0x0032:
            r17 = r3
        L_0x0034:
            int r18 = r39.c()
            r3 = 90
            switch(r18) {
                case 3: goto L_0x0044;
                case 4: goto L_0x0044;
                case 5: goto L_0x0042;
                case 6: goto L_0x0042;
                case 7: goto L_0x003f;
                case 8: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            r4 = 0
            goto L_0x0046
        L_0x003f:
            r4 = 270(0x10e, float:3.78E-43)
            goto L_0x0046
        L_0x0042:
            r4 = r3
            goto L_0x0046
        L_0x0044:
            r4 = 180(0xb4, float:2.52E-43)
        L_0x0046:
            switch(r18) {
                case 2: goto L_0x004b;
                case 3: goto L_0x004b;
                case 4: goto L_0x004b;
                case 5: goto L_0x004b;
                case 6: goto L_0x004b;
                case 7: goto L_0x004b;
                case 8: goto L_0x004b;
                default: goto L_0x0049;
            }
        L_0x0049:
            r5 = 0
            goto L_0x004c
        L_0x004b:
            r5 = 1
        L_0x004c:
            r19 = r5
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 != r5) goto L_0x0062
            if (r4 == r3) goto L_0x005b
            r3 = 270(0x10e, float:3.78E-43)
            if (r4 != r3) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            goto L_0x005c
        L_0x005b:
            r3 = 1
        L_0x005c:
            if (r3 == 0) goto L_0x0060
            r3 = r7
            goto L_0x0063
        L_0x0060:
            r3 = r8
            goto L_0x0063
        L_0x0062:
            r3 = r12
        L_0x0063:
            if (r13 != r5) goto L_0x0079
            r5 = 90
            if (r4 == r5) goto L_0x0070
            r5 = 270(0x10e, float:3.78E-43)
            if (r4 != r5) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r5 = 0
            goto L_0x0071
        L_0x0070:
            r5 = 1
        L_0x0071:
            r20 = r6
            if (r5 == 0) goto L_0x0077
            r5 = r8
            goto L_0x007c
        L_0x0077:
            r5 = r7
            goto L_0x007c
        L_0x0079:
            r20 = r6
            r5 = r13
        L_0x007c:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = r39.d()
            r21 = r15
            r1.d r15 = r1.f12878a
            java.lang.String r13 = "]"
            java.lang.String r12 = ", target density: "
            java.lang.String r11 = ", density: "
            java.lang.String r10 = "x"
            java.lang.String r1 = "Downsampler"
            if (r8 <= 0) goto L_0x02a2
            if (r7 > 0) goto L_0x0094
            goto L_0x02a2
        L_0x0094:
            r44 = r13
            r13 = 90
            if (r4 == r13) goto L_0x00a1
            r13 = 270(0x10e, float:3.78E-43)
            if (r4 != r13) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r13 = 0
            goto L_0x00a2
        L_0x00a1:
            r13 = 1
        L_0x00a2:
            if (r13 == 0) goto L_0x00ab
            r13 = r7
            r16 = r11
            r23 = r12
            r11 = r8
            goto L_0x00b1
        L_0x00ab:
            r13 = r8
            r16 = r11
            r23 = r12
            r11 = r7
        L_0x00b1:
            float r12 = r0.b(r13, r11, r3, r5)
            r24 = 0
            int r24 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x025d
            r24 = r4
            int r4 = r0.a(r13, r11, r3, r5)
            if (r4 == 0) goto L_0x0255
            r25 = r7
            float r7 = (float) r13
            r26 = r10
            float r10 = r12 * r7
            r27 = r1
            double r0 = (double) r10
            r28 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 + r28
            int r0 = (int) r0
            float r1 = (float) r11
            float r10 = r12 * r1
            r30 = r3
            double r2 = (double) r10
            double r2 = r2 + r28
            int r2 = (int) r2
            int r0 = r13 / r0
            int r2 = r11 / r2
            r3 = 1
            if (r4 != r3) goto L_0x00e7
            int r0 = java.lang.Math.max(r0, r2)
            goto L_0x00eb
        L_0x00e7:
            int r0 = java.lang.Math.min(r0, r2)
        L_0x00eb:
            int r0 = java.lang.Integer.highestOneBit(r0)
            int r0 = java.lang.Math.max(r3, r0)
            if (r4 != r3) goto L_0x00ff
            float r2 = (float) r0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 / r12
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ff
            int r0 = r0 << 1
        L_0x00ff:
            r9.inSampleSize = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r6 != r2) goto L_0x0127
            r2 = 8
            int r2 = java.lang.Math.min(r0, r2)
            float r2 = (float) r2
            float r7 = r7 / r2
            double r3 = (double) r7
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            float r1 = r1 / r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            int r2 = r0 / 8
            if (r2 <= 0) goto L_0x0120
            int r3 = r3 / r2
            int r1 = r1 / r2
        L_0x0120:
            r2 = r39
        L_0x0122:
            r4 = r41
            r7 = r30
            goto L_0x0176
        L_0x0127:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r6 == r2) goto L_0x0160
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r6 != r2) goto L_0x0130
            goto L_0x0160
        L_0x0130:
            boolean r2 = r6.isWebp()
            if (r2 == 0) goto L_0x0142
            float r2 = (float) r0
            float r7 = r7 / r2
            int r3 = java.lang.Math.round(r7)
            float r1 = r1 / r2
            int r1 = java.lang.Math.round(r1)
            goto L_0x0120
        L_0x0142:
            int r1 = r13 % r0
            if (r1 != 0) goto L_0x0150
            int r1 = r11 % r0
            if (r1 == 0) goto L_0x014b
            goto L_0x0150
        L_0x014b:
            int r3 = r13 / r0
            int r1 = r11 / r0
            goto L_0x0120
        L_0x0150:
            r1 = 1
            r9.inJustDecodeBounds = r1
            r2 = r39
            c(r2, r9, r14, r15)
            r1 = 0
            r9.inJustDecodeBounds = r1
            int r3 = r9.outWidth
            int r1 = r9.outHeight
            goto L_0x0122
        L_0x0160:
            r2 = r39
            float r3 = (float) r0
            float r7 = r7 / r3
            double r6 = (double) r7
            double r6 = java.lang.Math.floor(r6)
            int r4 = (int) r6
            float r1 = r1 / r3
            double r6 = (double) r1
            double r6 = java.lang.Math.floor(r6)
            int r1 = (int) r6
            r3 = r4
            r7 = r30
            r4 = r41
        L_0x0176:
            float r4 = r4.b(r3, r1, r7, r5)
            double r10 = (double) r4
            r30 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r10 > r30 ? 1 : (r10 == r30 ? 0 : -1))
            if (r4 > 0) goto L_0x0184
            r32 = r10
            goto L_0x0186
        L_0x0184:
            double r32 = r30 / r10
        L_0x0186:
            r34 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r32 = r32 * r34
            long r13 = java.lang.Math.round(r32)
            int r6 = (int) r13
            double r13 = (double) r6
            double r13 = r13 * r10
            double r13 = r13 + r28
            int r13 = (int) r13
            float r14 = (float) r13
            float r6 = (float) r6
            float r14 = r14 / r6
            double r14 = (double) r14
            double r14 = r10 / r14
            r32 = r12
            double r12 = (double) r13
            double r14 = r14 * r12
            double r14 = r14 + r28
            int r6 = (int) r14
            r9.inTargetDensity = r6
            if (r4 > 0) goto L_0x01ab
            r30 = r10
            goto L_0x01ad
        L_0x01ab:
            double r30 = r30 / r10
        L_0x01ad:
            double r30 = r30 * r34
            long r12 = java.lang.Math.round(r30)
            int r4 = (int) r12
            r9.inDensity = r4
            int r6 = r9.inTargetDensity
            if (r6 <= 0) goto L_0x01c0
            if (r4 <= 0) goto L_0x01c0
            if (r6 == r4) goto L_0x01c0
            r4 = 1
            goto L_0x01c1
        L_0x01c0:
            r4 = 0
        L_0x01c1:
            r6 = 1
            if (r4 == 0) goto L_0x01c9
            r9.inScaled = r6
            r4 = 2
            r6 = 0
            goto L_0x01cf
        L_0x01c9:
            r6 = 0
            r9.inTargetDensity = r6
            r9.inDensity = r6
            r4 = 2
        L_0x01cf:
            r12 = r27
            boolean r4 = android.util.Log.isLoggable(r12, r4)
            if (r4 == 0) goto L_0x024a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "Calculate scaling, source: ["
            r4.append(r13)
            r4.append(r8)
            r13 = r26
            r4.append(r13)
            r14 = r25
            r4.append(r14)
            java.lang.String r15 = "], degreesToRotate: "
            r4.append(r15)
            r15 = r24
            r4.append(r15)
            java.lang.String r15 = ", target: ["
            r4.append(r15)
            r4.append(r7)
            r4.append(r13)
            r4.append(r5)
            java.lang.String r15 = "], power of two scaled: ["
            r4.append(r15)
            r4.append(r3)
            r4.append(r13)
            r4.append(r1)
            java.lang.String r1 = "], exact scale factor: "
            r4.append(r1)
            r1 = r32
            r4.append(r1)
            java.lang.String r1 = ", power of 2 sample size: "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = ", adjusted scale factor: "
            r4.append(r0)
            r4.append(r10)
            r1 = r23
            r4.append(r1)
            int r0 = r9.inTargetDensity
            r4.append(r0)
            r10 = r16
            r4.append(r10)
            int r0 = r9.inDensity
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r12, r0)
            goto L_0x0252
        L_0x024a:
            r10 = r16
            r1 = r23
            r14 = r25
            r13 = r26
        L_0x0252:
            r11 = r6
            goto L_0x02da
        L_0x0255:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x025d:
            r4 = r0
            r14 = r7
            r13 = r10
            r1 = r12
            r7 = r3
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot scale with factor: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " from: "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = ", source: ["
            r2.append(r1)
            r2.append(r8)
            r2.append(r13)
            r2.append(r14)
            java.lang.String r1 = "], target: ["
            r2.append(r1)
            r2.append(r7)
            r2.append(r13)
            r2.append(r5)
            r3 = r44
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x02a2:
            r14 = r7
            r7 = r3
            r3 = r13
            r13 = r10
            r10 = r11
            r37 = r12
            r12 = r1
            r1 = r37
            r0 = 0
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r12, r4)
            if (r4 == 0) goto L_0x02d9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "Unable to determine dimensions for: "
            r4.append(r11)
            r4.append(r6)
            java.lang.String r6 = " with target ["
            r4.append(r6)
            r4.append(r7)
            r4.append(r13)
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.d(r12, r3)
        L_0x02d9:
            r11 = r0
        L_0x02da:
            r15 = r12
            r12 = r38
            x1.r r3 = r12.f12882e
            r6 = 1
            r16 = r7
            r4 = r16
            r23 = r5
            r7 = r6
            r37 = r20
            r20 = r1
            r1 = r37
            r6 = r40
            r41 = r11
            r11 = r7
            r7 = r17
            r36 = r8
            r8 = r19
            boolean r0 = r3.b(r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x0300
            r4 = r13
            goto L_0x0342
        L_0x0300:
            o1.b r0 = o1.b.PREFER_ARGB_8888
            r3 = r42
            r4 = r13
            if (r3 == r0) goto L_0x033e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r39.d()     // Catch:{ IOException -> 0x0310 }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x0310 }
            goto L_0x032e
        L_0x0310:
            r0 = move-exception
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r15, r5)
            if (r5 == 0) goto L_0x032c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Cannot determine whether the image has alpha or not from header, format "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.d(r15, r3, r0)
        L_0x032c:
            r0 = r41
        L_0x032e:
            if (r0 == 0) goto L_0x0333
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x0335
        L_0x0333:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x0335:
            r9.inPreferredConfig = r0
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r3) goto L_0x0342
            r9.inDither = r11
            goto L_0x0342
        L_0x033e:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r9.inPreferredConfig = r0
        L_0x0342:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r3 = r9.inSampleSize
            r5 = r36
            if (r5 < 0) goto L_0x0355
            if (r14 < 0) goto L_0x0355
            if (r47 == 0) goto L_0x0355
            r11 = r1
            r3 = r16
            r2 = r23
            goto L_0x03dc
        L_0x0355:
            int r6 = r9.inTargetDensity
            if (r6 <= 0) goto L_0x0360
            int r7 = r9.inDensity
            if (r7 <= 0) goto L_0x0360
            if (r6 == r7) goto L_0x0360
            goto L_0x0362
        L_0x0360:
            r11 = r41
        L_0x0362:
            if (r11 == 0) goto L_0x036a
            float r6 = (float) r6
            int r7 = r9.inDensity
            float r7 = (float) r7
            float r6 = r6 / r7
            goto L_0x036c
        L_0x036a:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x036c:
            float r7 = (float) r5
            float r8 = (float) r3
            float r7 = r7 / r8
            r11 = r1
            double r1 = (double) r7
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            float r2 = (float) r14
            float r2 = r2 / r8
            double r7 = (double) r2
            double r7 = java.lang.Math.ceil(r7)
            int r2 = (int) r7
            float r1 = (float) r1
            float r1 = r1 * r6
            int r1 = java.lang.Math.round(r1)
            float r2 = (float) r2
            float r2 = r2 * r6
            int r2 = java.lang.Math.round(r2)
            r7 = 2
            boolean r7 = android.util.Log.isLoggable(r15, r7)
            if (r7 == 0) goto L_0x03db
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Calculated target ["
            r7.append(r8)
            r7.append(r1)
            r7.append(r4)
            r7.append(r2)
            java.lang.String r8 = "] for source ["
            r7.append(r8)
            r7.append(r5)
            r7.append(r4)
            r7.append(r14)
            java.lang.String r8 = "], sampleSize: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = ", targetDensity: "
            r7.append(r3)
            int r3 = r9.inTargetDensity
            r7.append(r3)
            r7.append(r10)
            int r3 = r9.inDensity
            r7.append(r3)
            java.lang.String r3 = ", density multiplier: "
            r7.append(r3)
            r7.append(r6)
            java.lang.String r3 = r7.toString()
            android.util.Log.v(r15, r3)
        L_0x03db:
            r3 = r1
        L_0x03dc:
            r1 = 26
            r6 = 0
            if (r3 <= 0) goto L_0x03fc
            if (r2 <= 0) goto L_0x03fc
            r1.d r7 = r12.f12878a
            if (r0 < r1) goto L_0x03f1
            android.graphics.Bitmap$Config r8 = r9.inPreferredConfig
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.HARDWARE
            if (r8 != r13) goto L_0x03ee
            goto L_0x03fc
        L_0x03ee:
            android.graphics.Bitmap$Config r8 = r9.outConfig
            goto L_0x03f2
        L_0x03f1:
            r8 = r6
        L_0x03f2:
            if (r8 != 0) goto L_0x03f6
            android.graphics.Bitmap$Config r8 = r9.inPreferredConfig
        L_0x03f6:
            android.graphics.Bitmap r2 = r7.c(r3, r2, r8)
            r9.inBitmap = r2
        L_0x03fc:
            r2 = r43
            r3 = r10
            if (r2 == 0) goto L_0x0426
            r7 = 28
            if (r0 < r7) goto L_0x041c
            o1.i r0 = o1.i.DISPLAY_P3
            if (r2 != r0) goto L_0x0415
            android.graphics.ColorSpace r0 = r9.outColorSpace
            if (r0 == 0) goto L_0x0415
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x0415
            r0 = 1
            goto L_0x0417
        L_0x0415:
            r0 = r41
        L_0x0417:
            if (r0 == 0) goto L_0x041e
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0420
        L_0x041c:
            if (r0 < r1) goto L_0x0426
        L_0x041e:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x0420:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r9.inPreferredColorSpace = r0
        L_0x0426:
            r1.d r0 = r12.f12878a
            r1 = r39
            r2 = r48
            android.graphics.Bitmap r0 = c(r1, r9, r2, r0)
            r1.d r1 = r12.f12878a
            r2.a(r0, r1)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r15, r1)
            if (r1 == 0) goto L_0x04bf
            java.lang.String r1 = "Decoded "
            java.lang.StringBuilder r1 = androidx.activity.f.g(r1)
            java.lang.String r2 = d(r0)
            r1.append(r2)
            java.lang.String r2 = " from ["
            r1.append(r2)
            r1.append(r5)
            r1.append(r4)
            r1.append(r14)
            java.lang.String r2 = "] "
            r1.append(r2)
            r2 = r11
            r1.append(r2)
            java.lang.String r2 = " with inBitmap "
            r1.append(r2)
            android.graphics.Bitmap r2 = r9.inBitmap
            java.lang.String r2 = d(r2)
            r1.append(r2)
            java.lang.String r2 = " for ["
            r1.append(r2)
            r2 = r45
            r5 = r20
            r1.append(r2)
            r1.append(r4)
            r2 = r46
            r1.append(r2)
            java.lang.String r2 = "], sample size: "
            r1.append(r2)
            int r2 = r9.inSampleSize
            r1.append(r2)
            r1.append(r3)
            int r2 = r9.inDensity
            r1.append(r2)
            r1.append(r5)
            int r2 = r9.inTargetDensity
            r1.append(r2)
            java.lang.String r2 = ", thread: "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ", duration: "
            r1.append(r2)
            double r2 = j2.h.a(r21)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r15, r1)
        L_0x04bf:
            if (r0 == 0) goto L_0x055c
            android.util.DisplayMetrics r1 = r12.f12879b
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            r1.d r1 = r12.f12878a
            switch(r18) {
                case 2: goto L_0x04d0;
                case 3: goto L_0x04d0;
                case 4: goto L_0x04d0;
                case 5: goto L_0x04d0;
                case 6: goto L_0x04d0;
                case 7: goto L_0x04d0;
                case 8: goto L_0x04d0;
                default: goto L_0x04cd;
            }
        L_0x04cd:
            r11 = r41
            goto L_0x04d1
        L_0x04d0:
            r11 = 1
        L_0x04d1:
            if (r11 != 0) goto L_0x04d6
            r6 = r0
            goto L_0x0551
        L_0x04d6:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            r5 = 1127481344(0x43340000, float:180.0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r18) {
                case 2: goto L_0x0504;
                case 3: goto L_0x0500;
                case 4: goto L_0x04f7;
                case 5: goto L_0x04f3;
                case 6: goto L_0x04ef;
                case 7: goto L_0x04eb;
                case 8: goto L_0x04e7;
                default: goto L_0x04e6;
            }
        L_0x04e6:
            goto L_0x0509
        L_0x04e7:
            r2.setRotate(r3)
            goto L_0x0509
        L_0x04eb:
            r2.setRotate(r3)
            goto L_0x04fa
        L_0x04ef:
            r2.setRotate(r4)
            goto L_0x0509
        L_0x04f3:
            r2.setRotate(r4)
            goto L_0x04fa
        L_0x04f7:
            r2.setRotate(r5)
        L_0x04fa:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r6, r3)
            goto L_0x0509
        L_0x0500:
            r2.setRotate(r5)
            goto L_0x0509
        L_0x0504:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r6, r3)
        L_0x0509:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r0.getWidth()
            float r4 = (float) r4
            int r5 = r0.getHeight()
            float r5 = (float) r5
            r6 = 0
            r3.<init>(r6, r6, r4, r5)
            r2.mapRect(r3)
            float r4 = r3.width()
            int r4 = java.lang.Math.round(r4)
            float r5 = r3.height()
            int r5 = java.lang.Math.round(r5)
            android.graphics.Bitmap$Config r6 = r0.getConfig()
            if (r6 == 0) goto L_0x0537
            android.graphics.Bitmap$Config r6 = r0.getConfig()
            goto L_0x0539
        L_0x0537:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0539:
            android.graphics.Bitmap r1 = r1.d(r4, r5, r6)
            float r4 = r3.left
            float r4 = -r4
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r4, r3)
            boolean r3 = r0.hasAlpha()
            r1.setHasAlpha(r3)
            x1.z.a(r0, r1, r2)
            r6 = r1
        L_0x0551:
            boolean r1 = r0.equals(r6)
            if (r1 != 0) goto L_0x055c
            r1.d r1 = r12.f12878a
            r1.e(r0)
        L_0x055c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.m.b(x1.s, android.graphics.BitmapFactory$Options, x1.l, o1.b, o1.i, boolean, int, int, boolean, x1.m$b):android.graphics.Bitmap");
    }
}
