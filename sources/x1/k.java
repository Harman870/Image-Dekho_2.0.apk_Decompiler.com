package x1;

import android.util.Log;
import androidx.activity.f;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class k implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f12861a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f12862b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f12863a;

        public a(ByteBuffer byteBuffer) {
            this.f12863a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final short a() {
            if (this.f12863a.remaining() >= 1) {
                return (short) (this.f12863a.get() & 255);
            }
            throw new c.a();
        }

        public final int b() {
            return (a() << 8) | a();
        }

        public final int c(int i10, byte[] bArr) {
            int min = Math.min(i10, this.f12863a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f12863a.get(bArr, 0, min);
            return min;
        }

        public final long skip(long j10) {
            int min = (int) Math.min((long) this.f12863a.remaining(), j10);
            ByteBuffer byteBuffer = this.f12863a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f12864a;

        public b(int i10, byte[] bArr) {
            this.f12864a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public final short a(int i10) {
            boolean z9;
            if (this.f12864a.remaining() - i10 >= 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return this.f12864a.getShort(i10);
            }
            return -1;
        }
    }

    public interface c {

        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        short a();

        int b();

        int c(int i10, byte[] bArr);

        long skip(long j10);
    }

    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f12865a;

        public d(InputStream inputStream) {
            this.f12865a = inputStream;
        }

        public final short a() {
            int read = this.f12865a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        public final int b() {
            return (a() << 8) | a();
        }

        public final int c(int i10, byte[] bArr) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f12865a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 != 0 || i12 != -1) {
                return i11;
            }
            throw new c.a();
        }

        public final long skip(long j10) {
            if (j10 < 0) {
                return 0;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f12865a.skip(j11);
                if (skip <= 0) {
                    if (this.f12865a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public static int e(c cVar, r1.b bVar) {
        byte[] bArr;
        try {
            int b10 = cVar.b();
            if (!((b10 & 65496) == 65496 || b10 == 19789 || b10 == 18761)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + b10);
                }
                return -1;
            }
            int g10 = g(cVar);
            if (g10 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) bVar.c(g10, byte[].class);
            int h10 = h(cVar, bArr, g10);
            bVar.put(bArr);
            return h10;
        } catch (c.a unused) {
            return -1;
        } catch (Throwable th) {
            bVar.put(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType f(x1.k.c r7) {
        /*
            int r0 = r7.b()     // Catch:{ a -> 0x00fa }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00fa }
            return r7
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r7.a()     // Catch:{ a -> 0x00fa }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00fa }
            return r7
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r7.a()     // Catch:{ a -> 0x00fa }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r7.skip(r0)     // Catch:{ a -> 0x00fa }
            short r7 = r7.a()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r7 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r7
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00fa }
            return r7
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            r2 = 4
            if (r0 == r1) goto L_0x0099
            int r1 = r7.b()     // Catch:{ a -> 0x00fa }
            int r1 = r1 << 16
            int r4 = r7.b()     // Catch:{ a -> 0x00fa }
            r1 = r1 | r4
            r4 = 0
            r5 = 1718909296(0x66747970, float:2.8862439E23)
            if (r1 == r5) goto L_0x0055
            goto L_0x0091
        L_0x0055:
            int r1 = r7.b()     // Catch:{ a -> 0x00fa }
            int r1 = r1 << 16
            int r5 = r7.b()     // Catch:{ a -> 0x00fa }
            r1 = r1 | r5
            r5 = 1635150182(0x61766966, float:2.8409336E20)
            if (r1 == r5) goto L_0x0090
            r6 = 1635150195(0x61766973, float:2.8409359E20)
            if (r1 != r6) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            r7.skip(r2)     // Catch:{ a -> 0x00fa }
            int r0 = r0 + -16
            int r1 = r0 % 4
            if (r1 == 0) goto L_0x0075
            goto L_0x0091
        L_0x0075:
            r1 = r4
        L_0x0076:
            r2 = 5
            if (r1 >= r2) goto L_0x0091
            if (r0 <= 0) goto L_0x0091
            int r2 = r7.b()     // Catch:{ a -> 0x00fa }
            int r2 = r2 << 16
            int r3 = r7.b()     // Catch:{ a -> 0x00fa }
            r2 = r2 | r3
            if (r2 == r5) goto L_0x0090
            if (r2 != r6) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            int r1 = r1 + 1
            int r0 = r0 + -4
            goto L_0x0076
        L_0x0090:
            r4 = 1
        L_0x0091:
            if (r4 == 0) goto L_0x0096
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.AVIF     // Catch:{ a -> 0x00fa }
            goto L_0x0098
        L_0x0096:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00fa }
        L_0x0098:
            return r7
        L_0x0099:
            r7.skip(r2)     // Catch:{ a -> 0x00fa }
            int r0 = r7.b()     // Catch:{ a -> 0x00fa }
            int r0 = r0 << 16
            int r1 = r7.b()     // Catch:{ a -> 0x00fa }
            r0 = r0 | r1
            r1 = 1464156752(0x57454250, float:2.16888601E14)
            if (r0 == r1) goto L_0x00af
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00af:
            int r0 = r7.b()     // Catch:{ a -> 0x00fa }
            int r0 = r0 << 16
            int r1 = r7.b()     // Catch:{ a -> 0x00fa }
            r0 = r0 | r1
            r1 = r0 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r1 == r4) goto L_0x00c4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00c4:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 88
            if (r0 != r1) goto L_0x00e2
            r7.skip(r2)     // Catch:{ a -> 0x00fa }
            short r7 = r7.a()     // Catch:{ a -> 0x00fa }
            r0 = r7 & 2
            if (r0 == 0) goto L_0x00d8
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00d8:
            r7 = r7 & 16
            if (r7 == 0) goto L_0x00df
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00df:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00e2:
            r1 = 76
            if (r0 != r1) goto L_0x00f7
            r7.skip(r2)     // Catch:{ a -> 0x00fa }
            short r7 = r7.a()     // Catch:{ a -> 0x00fa }
            r7 = r7 & 8
            if (r7 == 0) goto L_0x00f4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00fa }
            goto L_0x00f6
        L_0x00f4:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00fa }
        L_0x00f6:
            return r7
        L_0x00f7:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00fa:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.k.f(x1.k$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public static int g(c cVar) {
        short a10;
        int b10;
        long j10;
        long skip;
        do {
            short a11 = cVar.a();
            if (a11 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + a11);
                }
                return -1;
            }
            a10 = cVar.a();
            if (a10 == 218) {
                return -1;
            }
            if (a10 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            b10 = cVar.b() - 2;
            if (a10 == 225) {
                return b10;
            }
            j10 = (long) b10;
            skip = cVar.skip(j10);
        } while (skip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + a10 + ", wanted to skip: " + b10 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public static int h(c cVar, byte[] bArr, int i10) {
        boolean z9;
        ByteOrder byteOrder;
        boolean z10;
        int i11;
        String str;
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        boolean z11;
        int i12;
        int c10 = cVar.c(i10, bArr);
        if (c10 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + c10);
            }
            return -1;
        }
        if (bArr == null || i10 <= f12861a.length) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            int i13 = 0;
            while (true) {
                byte[] bArr2 = f12861a;
                if (i13 >= bArr2.length) {
                    break;
                } else if (bArr[i13] != bArr2[i13]) {
                    z9 = false;
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (z9) {
            b bVar = new b(i10, bArr);
            short a10 = bVar.a(6);
            if (a10 != 18761) {
                if (a10 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + a10);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            bVar.f12864a.order(byteOrder);
            if (bVar.f12864a.remaining() - 10 >= 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = bVar.f12864a.getInt(10);
            } else {
                i11 = -1;
            }
            int i14 = i11 + 6;
            short a11 = bVar.a(i14);
            for (int i15 = 0; i15 < a11; i15++) {
                int i16 = (i15 * 12) + i14 + 2;
                short a12 = bVar.a(i16);
                if (a12 == 274) {
                    short a13 = bVar.a(i16 + 2);
                    if (a13 >= 1 && a13 <= 12) {
                        int i17 = i16 + 4;
                        if (bVar.f12864a.remaining() - i17 >= 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i12 = bVar.f12864a.getInt(i17);
                        } else {
                            i12 = -1;
                        }
                        if (i12 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i15 + " tagType=" + a12 + " formatCode=" + a13 + " componentCount=" + i12);
                            }
                            int i18 = i12 + f12862b[a13];
                            if (i18 <= 4) {
                                int i19 = i16 + 8;
                                if (i19 < 0 || i19 > bVar.f12864a.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Illegal tagValueOffset=");
                                        sb3.append(i19);
                                        sb3.append(" tagType=");
                                        sb = sb3;
                                    }
                                } else if (i18 >= 0 && i18 + i19 <= bVar.f12864a.remaining()) {
                                    return bVar.a(i19);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        sb = f.g("Illegal number of bytes for TI tag data tagType=");
                                    }
                                }
                                sb.append(a12);
                                str = sb.toString();
                                Log.d("DfltImageHeaderParser", str);
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb2 = new StringBuilder();
                                str2 = "Got byte count > 4, not orientation, continuing, formatCode=";
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "Negative tiff component count";
                            Log.d("DfltImageHeaderParser", str);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb2 = new StringBuilder();
                        str2 = "Got invalid format code = ";
                    }
                    sb2.append(str2);
                    sb2.append(a13);
                    sb = sb2;
                    str = sb.toString();
                    Log.d("DfltImageHeaderParser", str);
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        y3.a.h(byteBuffer);
        return f(new a(byteBuffer));
    }

    public final int b(InputStream inputStream, r1.b bVar) {
        y3.a.h(inputStream);
        d dVar = new d(inputStream);
        y3.a.h(bVar);
        return e(dVar, bVar);
    }

    public final int c(ByteBuffer byteBuffer, r1.b bVar) {
        y3.a.h(byteBuffer);
        a aVar = new a(byteBuffer);
        y3.a.h(bVar);
        return e(aVar, bVar);
    }

    public final ImageHeaderParser.ImageType d(InputStream inputStream) {
        y3.a.h(inputStream);
        return f(new d(inputStream));
    }
}
