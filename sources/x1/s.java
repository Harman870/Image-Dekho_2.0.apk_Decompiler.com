package x1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import j2.a;
import j2.j;
import java.nio.ByteBuffer;
import java.util.List;

public interface s {

    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f12897a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f12898b;

        /* renamed from: c  reason: collision with root package name */
        public final r1.b f12899c;

        public a(r1.b bVar, ByteBuffer byteBuffer, List list) {
            this.f12897a = byteBuffer;
            this.f12898b = list;
            this.f12899c = bVar;
        }

        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new a.C0103a(j2.a.c(this.f12897a)), (Rect) null, options);
        }

        public final void b() {
        }

        public final int c() {
            List<ImageHeaderParser> list = this.f12898b;
            ByteBuffer c10 = j2.a.c(this.f12897a);
            r1.b bVar = this.f12899c;
            if (c10 == null) {
                return -1;
            }
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                try {
                    int c11 = list.get(i10).c(c10, bVar);
                    if (c11 != -1) {
                        return c11;
                    }
                    i10++;
                } finally {
                    j2.a.c(c10);
                }
            }
            return -1;
        }

        public final ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.b(this.f12898b, j2.a.c(this.f12897a));
        }
    }

    public static final class b implements s {

        /* renamed from: a  reason: collision with root package name */
        public final k f12900a;

        /* renamed from: b  reason: collision with root package name */
        public final r1.b f12901b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f12902c;

        public b(r1.b bVar, j jVar, List list) {
            y3.a.h(bVar);
            this.f12901b = bVar;
            y3.a.h(list);
            this.f12902c = list;
            this.f12900a = new k(jVar, bVar);
        }

        public final Bitmap a(BitmapFactory.Options options) {
            k kVar = this.f12900a;
            kVar.f2606a.reset();
            return BitmapFactory.decodeStream(kVar.f2606a, (Rect) null, options);
        }

        public final void b() {
            w wVar = this.f12900a.f2606a;
            synchronized (wVar) {
                wVar.f12912c = wVar.f12910a.length;
            }
        }

        public final int c() {
            List<ImageHeaderParser> list = this.f12902c;
            k kVar = this.f12900a;
            kVar.f2606a.reset();
            return com.bumptech.glide.load.a.a(this.f12901b, kVar.f2606a, list);
        }

        public final ImageHeaderParser.ImageType d() {
            List<ImageHeaderParser> list = this.f12902c;
            k kVar = this.f12900a;
            kVar.f2606a.reset();
            return com.bumptech.glide.load.a.c(this.f12901b, kVar.f2606a, list);
        }
    }

    public static final class c implements s {

        /* renamed from: a  reason: collision with root package name */
        public final r1.b f12903a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f12904b;

        /* renamed from: c  reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f12905c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, r1.b bVar) {
            y3.a.h(bVar);
            this.f12903a = bVar;
            y3.a.h(list);
            this.f12904b = list;
            this.f12905c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f12905c.a().getFileDescriptor(), (Rect) null, options);
        }

        public final void b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int c() {
            /*
                r10 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r10.f12904b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r10.f12905c
                r1.b r2 = r10.f12903a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                r5 = -1
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r6 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r6 = (com.bumptech.glide.load.ImageHeaderParser) r6
                x1.w r7 = new x1.w     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r9 = r1.a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r8.<init>(r9)     // Catch:{ all -> 0x0039 }
                r7.<init>(r8, r2)     // Catch:{ all -> 0x0039 }
                int r6 = r6.b(r7, r2)     // Catch:{ all -> 0x0037 }
                r7.c()
                r1.a()
                if (r6 == r5) goto L_0x0034
                r5 = r6
                goto L_0x0044
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r0 = move-exception
                goto L_0x003b
            L_0x0039:
                r0 = move-exception
                r7 = 0
            L_0x003b:
                if (r7 == 0) goto L_0x0040
                r7.c()
            L_0x0040:
                r1.a()
                throw r0
            L_0x0044:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: x1.s.c.c():int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.ImageHeaderParser.ImageType d() {
            /*
                r9 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r9.f12904b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r9.f12905c
                r1.b r2 = r9.f12903a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r5 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r5 = (com.bumptech.glide.load.ImageHeaderParser) r5
                x1.w r6 = new x1.w     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r8 = r1.a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r8 = r8.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r7.<init>(r8)     // Catch:{ all -> 0x0039 }
                r6.<init>(r7, r2)     // Catch:{ all -> 0x0039 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.d(r6)     // Catch:{ all -> 0x0037 }
                r6.c()
                r1.a()
                com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                if (r5 == r6) goto L_0x0034
                goto L_0x0046
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r0 = move-exception
                goto L_0x003b
            L_0x0039:
                r0 = move-exception
                r6 = 0
            L_0x003b:
                if (r6 == 0) goto L_0x0040
                r6.c()
            L_0x0040:
                r1.a()
                throw r0
            L_0x0044:
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            L_0x0046:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: x1.s.c.d():com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
