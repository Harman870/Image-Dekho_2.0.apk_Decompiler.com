package x1;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o1.g;
import o1.j;
import q1.w;

public final class c0<T> implements j<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final o1.g<Long> f12844d = new o1.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final o1.g<Integer> f12845e = new o1.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f12846f = new e();

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f12847g = Collections.unmodifiableList(Arrays.asList(new String[]{"TP1A", "TD1A.220804.031"}));

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f12848a;

    /* renamed from: b  reason: collision with root package name */
    public final r1.d f12849b;

    /* renamed from: c  reason: collision with root package name */
    public final e f12850c;

    public class a implements g.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f12851a = ByteBuffer.allocate(8);

        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l6 = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.f12851a) {
                this.f12851a.position(0);
                messageDigest.update(this.f12851a.putLong(l6.longValue()).array());
            }
        }
    }

    public class b implements g.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f12852a = ByteBuffer.allocate(4);

        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f12852a) {
                    this.f12852a.position(0);
                    messageDigest.update(this.f12852a.putInt(num.intValue()).array());
                }
            }
        }
    }

    public static final class c implements f<AssetFileDescriptor> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    public static final class d implements f<ByteBuffer> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new d0((ByteBuffer) obj));
        }
    }

    public static class e {
    }

    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    public static final class g implements f<ParcelFileDescriptor> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public c0(r1.d dVar, f<T> fVar) {
        e eVar = f12846f;
        this.f12849b = dVar;
        this.f12848a = fVar;
        this.f12850c = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r12, long r13, int r15, int r16, int r17, x1.l r18) {
        /*
            r7 = r12
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            r9 = 3
            java.lang.String r10 = "VideoDecoder"
            r4 = 27
            if (r3 < r4) goto L_0x0067
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r3) goto L_0x0067
            if (r1 == r3) goto L_0x0067
            x1.l$f r3 = x1.l.f12869d
            if (r2 == r3) goto L_0x0067
            r3 = 18
            java.lang.String r3 = r12.extractMetadata(r3)     // Catch:{ all -> 0x005b }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x005b }
            r4 = 19
            java.lang.String r4 = r12.extractMetadata(r4)     // Catch:{ all -> 0x005b }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x005b }
            java.lang.String r5 = r12.extractMetadata(r8)     // Catch:{ all -> 0x005b }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x005b }
            r6 = 90
            if (r5 == r6) goto L_0x0040
            r6 = 270(0x10e, float:3.78E-43)
            if (r5 != r6) goto L_0x0043
        L_0x0040:
            r11 = r4
            r4 = r3
            r3 = r11
        L_0x0043:
            float r0 = r2.b(r3, r4, r0, r1)     // Catch:{ all -> 0x005b }
            float r1 = (float) r3     // Catch:{ all -> 0x005b }
            float r1 = r1 * r0
            int r5 = java.lang.Math.round(r1)     // Catch:{ all -> 0x005b }
            float r1 = (float) r4     // Catch:{ all -> 0x005b }
            float r0 = r0 * r1
            int r6 = java.lang.Math.round(r0)     // Catch:{ all -> 0x005b }
            r1 = r12
            r2 = r13
            r4 = r15
            android.graphics.Bitmap r0 = r1.getScaledFrameAtTime(r2, r4, r5, r6)     // Catch:{ all -> 0x005b }
            goto L_0x0068
        L_0x005b:
            r0 = move-exception
            boolean r1 = android.util.Log.isLoggable(r10, r9)
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r10, r1, r0)
        L_0x0067:
            r0 = 0
        L_0x0068:
            if (r0 != 0) goto L_0x006e
            android.graphics.Bitmap r0 = r12.getFrameAtTime(r13, r15)
        L_0x006e:
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "Pixel"
            boolean r1 = r1.startsWith(r2)
            r2 = 33
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x009b
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 != r2) goto L_0x009b
            java.util.List<java.lang.String> r1 = f12847g
            java.util.Iterator r1 = r1.iterator()
        L_0x0086:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a5
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = android.os.Build.ID
            boolean r2 = r5.startsWith(r2)
            if (r2 == 0) goto L_0x0086
            goto L_0x00a3
        L_0x009b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r1 < r5) goto L_0x00a5
            if (r1 >= r2) goto L_0x00a5
        L_0x00a3:
            r1 = r3
            goto L_0x00a6
        L_0x00a5:
            r1 = r4
        L_0x00a6:
            if (r1 != 0) goto L_0x00aa
            goto L_0x0129
        L_0x00aa:
            r1 = 36
            java.lang.String r1 = r12.extractMetadata(r1)     // Catch:{ NumberFormatException -> 0x00df }
            r2 = 35
            java.lang.String r2 = r12.extractMetadata(r2)     // Catch:{ NumberFormatException -> 0x00df }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00df }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x00df }
            r5 = 6
            r6 = 7
            if (r1 == r6) goto L_0x00c4
            if (r1 != r5) goto L_0x00c8
        L_0x00c4:
            if (r2 != r5) goto L_0x00c8
            r1 = r3
            goto L_0x00c9
        L_0x00c8:
            r1 = r4
        L_0x00c9:
            if (r1 == 0) goto L_0x00ea
            java.lang.String r1 = r12.extractMetadata(r8)     // Catch:{ NumberFormatException -> 0x00df }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00df }
            int r1 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x00df }
            r2 = 180(0xb4, float:2.52E-43)
            if (r1 != r2) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r3 = r4
        L_0x00dd:
            r4 = r3
            goto L_0x00ea
        L_0x00df:
            boolean r1 = android.util.Log.isLoggable(r10, r9)
            if (r1 == 0) goto L_0x00ea
            java.lang.String r1 = "Exception trying to extract HDR transfer function or rotation"
            android.util.Log.d(r10, r1)
        L_0x00ea:
            if (r4 != 0) goto L_0x00ed
            goto L_0x0129
        L_0x00ed:
            boolean r1 = android.util.Log.isLoggable(r10, r9)
            if (r1 == 0) goto L_0x00f8
            java.lang.String r1 = "Applying HDR 180 deg thumbnail correction"
            android.util.Log.d(r10, r1)
        L_0x00f8:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2 = 1127481344(0x43340000, float:180.0)
            int r3 = r0.getWidth()
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r5 = r0.getHeight()
            float r5 = (float) r5
            float r5 = r5 / r4
            r1.postRotate(r2, r3, r5)
            r2 = 0
            r3 = 0
            int r4 = r0.getWidth()
            int r5 = r0.getHeight()
            r6 = 1
            r12 = r0
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r1
            r18 = r6
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)
        L_0x0129:
            if (r0 == 0) goto L_0x012c
            return r0
        L_0x012c:
            x1.c0$h r0 = new x1.c0$h
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.c0.c(android.media.MediaMetadataRetriever, long, int, int, int, x1.l):android.graphics.Bitmap");
    }

    public final boolean a(T t10, o1.h hVar) {
        return true;
    }

    public final w<Bitmap> b(T t10, int i10, int i11, o1.h hVar) {
        int i12;
        long longValue = ((Long) hVar.c(f12844d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) hVar.c(f12845e);
            if (num == null) {
                num = 2;
            }
            l lVar = (l) hVar.c(l.f12871f);
            if (lVar == null) {
                lVar = l.f12870e;
            }
            l lVar2 = lVar;
            this.f12850c.getClass();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f12848a.a(mediaMetadataRetriever, t10);
                Bitmap c10 = c(mediaMetadataRetriever, longValue, num.intValue(), i10, i11, lVar2);
                if (i12 < 29) {
                    mediaMetadataRetriever.release();
                }
                return d.d(c10, this.f12849b);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.close();
                } else {
                    mediaMetadataRetriever.release();
                }
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }
}
