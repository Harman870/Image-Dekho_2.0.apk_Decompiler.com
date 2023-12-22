package t0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.system.OsConstants;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import t0.b;

public final class a {
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};
    public static final String[] D = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] E = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] F = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final d G = new d("StripOffsets", 273, 3);
    public static final d[][] H;
    public static final d[] I = {new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashMap<Integer, d>[] J = new HashMap[10];
    public static final HashMap<String, d>[] K = new HashMap[10];
    public static final HashSet<String> L = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap<Integer, Integer> M = new HashMap<>();
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f11933l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m  reason: collision with root package name */
    public static final List<Integer> f11934m = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: n  reason: collision with root package name */
    public static final List<Integer> f11935n = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f11936o = {8, 8, 8};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f11937p = {8};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f11938q = {-1, -40, -1};

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f11939r = {102, 116, 121, 112};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f11940s = {109, 105, 102, 49};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f11941t = {104, 101, 105, 99};
    public static final byte[] u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f11942v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f11943x = {101, 88, 73, 102};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f11944y = {73, 72, 68, 82};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f11945z = {73, 69, 78, 68};

    /* renamed from: a  reason: collision with root package name */
    public FileDescriptor f11946a;

    /* renamed from: b  reason: collision with root package name */
    public AssetManager.AssetInputStream f11947b;

    /* renamed from: c  reason: collision with root package name */
    public int f11948c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, c>[] f11949d;

    /* renamed from: e  reason: collision with root package name */
    public HashSet f11950e;

    /* renamed from: f  reason: collision with root package name */
    public ByteOrder f11951f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11952g;

    /* renamed from: h  reason: collision with root package name */
    public int f11953h;

    /* renamed from: i  reason: collision with root package name */
    public int f11954i;

    /* renamed from: j  reason: collision with root package name */
    public int f11955j;
    public int k;

    /* renamed from: t0.a$a  reason: collision with other inner class name */
    public class C0142a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        public long f11956a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f11957b;

        public C0142a(f fVar) {
            this.f11957b = fVar;
        }

        public final void close() {
        }

        public final long getSize() {
            return -1;
        }

        public final int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f11956a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f11957b.available())) {
                        return -1;
                    }
                    this.f11957b.c(j10);
                    this.f11956a = j10;
                }
                if (i11 > this.f11957b.available()) {
                    i11 = this.f11957b.available();
                }
                int read = this.f11957b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f11956a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f11956a = -1;
            return -1;
        }
    }

    public static class b extends InputStream implements DataInput {

        /* renamed from: e  reason: collision with root package name */
        public static final ByteOrder f11958e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        public static final ByteOrder f11959f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a  reason: collision with root package name */
        public final DataInputStream f11960a;

        /* renamed from: b  reason: collision with root package name */
        public ByteOrder f11961b;

        /* renamed from: c  reason: collision with root package name */
        public int f11962c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f11963d;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            this.f11961b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f11960a = dataInputStream;
            dataInputStream.mark(0);
            this.f11962c = 0;
            this.f11961b = byteOrder;
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public final void a(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f11960a.skip((long) i12);
                if (skip <= 0) {
                    if (this.f11963d == null) {
                        this.f11963d = new byte[8192];
                    }
                    skip = this.f11960a.read(this.f11963d, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f11962c += i11;
        }

        public final int available() {
            return this.f11960a.available();
        }

        public final void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public final int read() {
            this.f11962c++;
            return this.f11960a.read();
        }

        public final int read(byte[] bArr, int i10, int i11) {
            int read = this.f11960a.read(bArr, i10, i11);
            this.f11962c += read;
            return read;
        }

        public final boolean readBoolean() {
            this.f11962c++;
            return this.f11960a.readBoolean();
        }

        public final byte readByte() {
            this.f11962c++;
            int read = this.f11960a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public final char readChar() {
            this.f11962c += 2;
            return this.f11960a.readChar();
        }

        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public final void readFully(byte[] bArr) {
            this.f11962c += bArr.length;
            this.f11960a.readFully(bArr);
        }

        public final void readFully(byte[] bArr, int i10, int i11) {
            this.f11962c += i11;
            this.f11960a.readFully(bArr, i10, i11);
        }

        public final int readInt() {
            this.f11962c += 4;
            int read = this.f11960a.read();
            int read2 = this.f11960a.read();
            int read3 = this.f11960a.read();
            int read4 = this.f11960a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f11961b;
                if (byteOrder == f11958e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f11959f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                StringBuilder g10 = androidx.activity.f.g("Invalid byte order: ");
                g10.append(this.f11961b);
                throw new IOException(g10.toString());
            }
            throw new EOFException();
        }

        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public final long readLong() {
            this.f11962c += 8;
            int read = this.f11960a.read();
            int read2 = this.f11960a.read();
            int read3 = this.f11960a.read();
            int read4 = this.f11960a.read();
            int read5 = this.f11960a.read();
            int read6 = this.f11960a.read();
            int read7 = this.f11960a.read();
            int read8 = this.f11960a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f11961b;
                if (byteOrder == f11958e) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                if (byteOrder == f11959f) {
                    return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                StringBuilder g10 = androidx.activity.f.g("Invalid byte order: ");
                g10.append(this.f11961b);
                throw new IOException(g10.toString());
            }
            throw new EOFException();
        }

        public final short readShort() {
            this.f11962c += 2;
            int read = this.f11960a.read();
            int read2 = this.f11960a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f11961b;
                if (byteOrder == f11958e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f11959f) {
                    return (short) ((read << 8) + read2);
                }
                StringBuilder g10 = androidx.activity.f.g("Invalid byte order: ");
                g10.append(this.f11961b);
                throw new IOException(g10.toString());
            }
            throw new EOFException();
        }

        public final String readUTF() {
            this.f11962c += 2;
            return this.f11960a.readUTF();
        }

        public final int readUnsignedByte() {
            this.f11962c++;
            return this.f11960a.readUnsignedByte();
        }

        public final int readUnsignedShort() {
            this.f11962c += 2;
            int read = this.f11960a.read();
            int read2 = this.f11960a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f11961b;
                if (byteOrder == f11958e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f11959f) {
                    return (read << 8) + read2;
                }
                StringBuilder g10 = androidx.activity.f.g("Invalid byte order: ");
                g10.append(this.f11961b);
                throw new IOException(g10.toString());
            }
            throw new EOFException();
        }

        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public final int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f11964a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11965b;

        /* renamed from: c  reason: collision with root package name */
        public final long f11966c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f11967d;

        public c(long j10, byte[] bArr, int i10, int i11) {
            this.f11964a = i10;
            this.f11965b = i11;
            this.f11966c = j10;
            this.f11967d = bArr;
        }

        public c(byte[] bArr, int i10, int i11) {
            this(-1, bArr, i10, i11);
        }

        public static c a(String str) {
            byte[] bytes = (str + 0).getBytes(a.N);
            return new c(bytes, 2, bytes.length);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            long[] jArr = {j10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.E[4] * 1)]);
            wrap.order(byteOrder);
            for (int i10 = 0; i10 < 1; i10++) {
                wrap.putInt((int) jArr[i10]);
            }
            return new c(wrap.array(), 4, 1);
        }

        public static c c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.E[5] * 1)]);
            wrap.order(byteOrder);
            for (int i10 = 0; i10 < 1; i10++) {
                e eVar2 = eVarArr[i10];
                wrap.putInt((int) eVar2.f11972a);
                wrap.putInt((int) eVar2.f11973b);
            }
            return new c(wrap.array(), 5, 1);
        }

        public static c d(int i10, ByteOrder byteOrder) {
            int[] iArr = {i10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.E[3] * 1)]);
            wrap.order(byteOrder);
            for (int i11 = 0; i11 < 1; i11++) {
                wrap.putShort((short) iArr[i11]);
            }
            return new c(wrap.array(), 3, 1);
        }

        public final double e(ByteOrder byteOrder) {
            Serializable h10 = h(byteOrder);
            if (h10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (h10 instanceof String) {
                return Double.parseDouble((String) h10);
            } else {
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof double[]) {
                    double[] dArr = (double[]) h10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof e[]) {
                    e[] eVarArr = (e[]) h10;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        return ((double) eVar.f11972a) / ((double) eVar.f11973b);
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public final int f(ByteOrder byteOrder) {
            Serializable h10 = h(byteOrder);
            if (h10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (h10 instanceof String) {
                return Integer.parseInt((String) h10);
            } else {
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public final String g(ByteOrder byteOrder) {
            Serializable h10 = h(byteOrder);
            if (h10 == null) {
                return null;
            }
            if (h10 instanceof String) {
                return (String) h10;
            }
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            if (h10 instanceof long[]) {
                long[] jArr = (long[]) h10;
                while (i10 < jArr.length) {
                    sb.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h10 instanceof int[]) {
                int[] iArr = (int[]) h10;
                while (i10 < iArr.length) {
                    sb.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h10 instanceof double[]) {
                double[] dArr = (double[]) h10;
                while (i10 < dArr.length) {
                    sb.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(h10 instanceof e[])) {
                return null;
            } else {
                e[] eVarArr = (e[]) h10;
                while (i10 < eVarArr.length) {
                    sb.append(eVarArr[i10].f11972a);
                    sb.append('/');
                    sb.append(eVarArr[i10].f11973b);
                    i10++;
                    if (i10 != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: type inference failed for: r13v19, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v21, types: [long[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v23, types: [t0.a$e[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v25, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v27, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v29, types: [t0.a$e[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v31, types: [double[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r13v33, types: [double[], java.io.Serializable] */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x01a6 A[SYNTHETIC, Splitter:B:163:0x01a6] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.Serializable h(java.nio.ByteOrder r13) {
            /*
                r12 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                t0.a$b r3 = new t0.a$b     // Catch:{ IOException -> 0x0190, all -> 0x018e }
                byte[] r4 = r12.f11967d     // Catch:{ IOException -> 0x0190, all -> 0x018e }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0190, all -> 0x018e }
                r3.f11961b = r13     // Catch:{ IOException -> 0x00c8 }
                int r13 = r12.f11964a     // Catch:{ IOException -> 0x00c8 }
                r4 = 0
                r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
                r7 = 1
                switch(r13) {
                    case 1: goto L_0x0155;
                    case 2: goto L_0x010a;
                    case 3: goto L_0x00f0;
                    case 4: goto L_0x00d4;
                    case 5: goto L_0x00aa;
                    case 6: goto L_0x0155;
                    case 7: goto L_0x010a;
                    case 8: goto L_0x0090;
                    case 9: goto L_0x0076;
                    case 10: goto L_0x0051;
                    case 11: goto L_0x0036;
                    case 12: goto L_0x001c;
                    default: goto L_0x001a;
                }     // Catch:{ IOException -> 0x00c8 }
            L_0x001a:
                goto L_0x0185
            L_0x001c:
                int r13 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                double[] r13 = new double[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x0020:
                int r5 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x002d
                double r5 = r3.readDouble()     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x0020
            L_0x002d:
                r3.close()     // Catch:{ IOException -> 0x0031 }
                goto L_0x0035
            L_0x0031:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0035:
                return r13
            L_0x0036:
                int r13 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                double[] r13 = new double[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x003a:
                int r5 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x0048
                float r5 = r3.readFloat()     // Catch:{ IOException -> 0x00c8 }
                double r5 = (double) r5     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x003a
            L_0x0048:
                r3.close()     // Catch:{ IOException -> 0x004c }
                goto L_0x0050
            L_0x004c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0050:
                return r13
            L_0x0051:
                int r13 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                t0.a$e[] r13 = new t0.a.e[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x0055:
                int r5 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x006d
                int r5 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                long r5 = (long) r5     // Catch:{ IOException -> 0x00c8 }
                int r7 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                long r7 = (long) r7     // Catch:{ IOException -> 0x00c8 }
                t0.a$e r9 = new t0.a$e     // Catch:{ IOException -> 0x00c8 }
                r9.<init>(r5, r7)     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r9     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x0055
            L_0x006d:
                r3.close()     // Catch:{ IOException -> 0x0071 }
                goto L_0x0075
            L_0x0071:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0075:
                return r13
            L_0x0076:
                int r13 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                int[] r13 = new int[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x007a:
                int r5 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x0087
                int r5 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x007a
            L_0x0087:
                r3.close()     // Catch:{ IOException -> 0x008b }
                goto L_0x008f
            L_0x008b:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008f:
                return r13
            L_0x0090:
                int r13 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                int[] r13 = new int[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x0094:
                int r5 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x00a1
                short r5 = r3.readShort()     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x0094
            L_0x00a1:
                r3.close()     // Catch:{ IOException -> 0x00a5 }
                goto L_0x00a9
            L_0x00a5:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a9:
                return r13
            L_0x00aa:
                int r13 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                t0.a$e[] r13 = new t0.a.e[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x00ae:
                int r7 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r7) goto L_0x00cb
                int r7 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                long r7 = (long) r7     // Catch:{ IOException -> 0x00c8 }
                long r7 = r7 & r5
                int r9 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                long r9 = (long) r9     // Catch:{ IOException -> 0x00c8 }
                long r9 = r9 & r5
                t0.a$e r11 = new t0.a$e     // Catch:{ IOException -> 0x00c8 }
                r11.<init>(r7, r9)     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r11     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x00ae
            L_0x00c8:
                r13 = move-exception
                goto L_0x0192
            L_0x00cb:
                r3.close()     // Catch:{ IOException -> 0x00cf }
                goto L_0x00d3
            L_0x00cf:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00d3:
                return r13
            L_0x00d4:
                int r13 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                long[] r13 = new long[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x00d8:
                int r7 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r7) goto L_0x00e7
                int r7 = r3.readInt()     // Catch:{ IOException -> 0x00c8 }
                long r7 = (long) r7     // Catch:{ IOException -> 0x00c8 }
                long r7 = r7 & r5
                r13[r4] = r7     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x00d8
            L_0x00e7:
                r3.close()     // Catch:{ IOException -> 0x00eb }
                goto L_0x00ef
            L_0x00eb:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00ef:
                return r13
            L_0x00f0:
                int r13 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                int[] r13 = new int[r13]     // Catch:{ IOException -> 0x00c8 }
            L_0x00f4:
                int r5 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x0101
                int r5 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x00c8 }
                r13[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                int r4 = r4 + 1
                goto L_0x00f4
            L_0x0101:
                r3.close()     // Catch:{ IOException -> 0x0105 }
                goto L_0x0109
            L_0x0105:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0109:
                return r13
            L_0x010a:
                int r13 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                byte[] r5 = t0.a.F     // Catch:{ IOException -> 0x00c8 }
                int r5 = r5.length     // Catch:{ IOException -> 0x00c8 }
                if (r13 < r5) goto L_0x0127
                r13 = r4
            L_0x0112:
                byte[] r5 = t0.a.F     // Catch:{ IOException -> 0x00c8 }
                int r6 = r5.length     // Catch:{ IOException -> 0x00c8 }
                if (r13 >= r6) goto L_0x0124
                byte[] r6 = r12.f11967d     // Catch:{ IOException -> 0x00c8 }
                byte r6 = r6[r13]     // Catch:{ IOException -> 0x00c8 }
                byte r8 = r5[r13]     // Catch:{ IOException -> 0x00c8 }
                if (r6 == r8) goto L_0x0121
                r7 = r4
                goto L_0x0124
            L_0x0121:
                int r13 = r13 + 1
                goto L_0x0112
            L_0x0124:
                if (r7 == 0) goto L_0x0127
                int r4 = r5.length     // Catch:{ IOException -> 0x00c8 }
            L_0x0127:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c8 }
                r13.<init>()     // Catch:{ IOException -> 0x00c8 }
            L_0x012c:
                int r5 = r12.f11965b     // Catch:{ IOException -> 0x00c8 }
                if (r4 >= r5) goto L_0x0148
                byte[] r5 = r12.f11967d     // Catch:{ IOException -> 0x00c8 }
                byte r5 = r5[r4]     // Catch:{ IOException -> 0x00c8 }
                if (r5 != 0) goto L_0x0137
                goto L_0x0148
            L_0x0137:
                r6 = 32
                if (r5 < r6) goto L_0x0140
                char r5 = (char) r5     // Catch:{ IOException -> 0x00c8 }
                r13.append(r5)     // Catch:{ IOException -> 0x00c8 }
                goto L_0x0145
            L_0x0140:
                r5 = 63
                r13.append(r5)     // Catch:{ IOException -> 0x00c8 }
            L_0x0145:
                int r4 = r4 + 1
                goto L_0x012c
            L_0x0148:
                java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x00c8 }
                r3.close()     // Catch:{ IOException -> 0x0150 }
                goto L_0x0154
            L_0x0150:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0154:
                return r13
            L_0x0155:
                byte[] r13 = r12.f11967d     // Catch:{ IOException -> 0x00c8 }
                int r5 = r13.length     // Catch:{ IOException -> 0x00c8 }
                if (r5 != r7) goto L_0x0175
                byte r5 = r13[r4]     // Catch:{ IOException -> 0x00c8 }
                if (r5 < 0) goto L_0x0175
                if (r5 > r7) goto L_0x0175
                java.lang.String r13 = new java.lang.String     // Catch:{ IOException -> 0x00c8 }
                char[] r6 = new char[r7]     // Catch:{ IOException -> 0x00c8 }
                int r5 = r5 + 48
                char r5 = (char) r5     // Catch:{ IOException -> 0x00c8 }
                r6[r4] = r5     // Catch:{ IOException -> 0x00c8 }
                r13.<init>(r6)     // Catch:{ IOException -> 0x00c8 }
                r3.close()     // Catch:{ IOException -> 0x0170 }
                goto L_0x0174
            L_0x0170:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0174:
                return r13
            L_0x0175:
                java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x00c8 }
                java.nio.charset.Charset r5 = t0.a.N     // Catch:{ IOException -> 0x00c8 }
                r4.<init>(r13, r5)     // Catch:{ IOException -> 0x00c8 }
                r3.close()     // Catch:{ IOException -> 0x0180 }
                goto L_0x0184
            L_0x0180:
                r13 = move-exception
                android.util.Log.e(r1, r0, r13)
            L_0x0184:
                return r4
            L_0x0185:
                r3.close()     // Catch:{ IOException -> 0x0189 }
                goto L_0x018d
            L_0x0189:
                r13 = move-exception
                android.util.Log.e(r1, r0, r13)
            L_0x018d:
                return r2
            L_0x018e:
                r13 = move-exception
                goto L_0x01a4
            L_0x0190:
                r13 = move-exception
                r3 = r2
            L_0x0192:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r13)     // Catch:{ all -> 0x01a2 }
                if (r3 == 0) goto L_0x01a1
                r3.close()     // Catch:{ IOException -> 0x019d }
                goto L_0x01a1
            L_0x019d:
                r13 = move-exception
                android.util.Log.e(r1, r0, r13)
            L_0x01a1:
                return r2
            L_0x01a2:
                r13 = move-exception
                r2 = r3
            L_0x01a4:
                if (r2 == 0) goto L_0x01ae
                r2.close()     // Catch:{ IOException -> 0x01aa }
                goto L_0x01ae
            L_0x01aa:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01ae:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.a.c.h(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder g10 = androidx.activity.f.g("(");
            g10.append(a.D[this.f11964a]);
            g10.append(", data length:");
            g10.append(this.f11967d.length);
            g10.append(")");
            return g10.toString();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f11968a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11969b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11970c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11971d;

        public d(int i10, int i11, int i12, String str) {
            this.f11969b = str;
            this.f11968a = i10;
            this.f11970c = i11;
            this.f11971d = i12;
        }

        public d(String str, int i10, int i11) {
            this.f11969b = str;
            this.f11968a = i10;
            this.f11970c = i11;
            this.f11971d = -1;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f11972a;

        /* renamed from: b  reason: collision with root package name */
        public final long f11973b;

        public e(long j10, long j11) {
            if (j11 == 0) {
                this.f11972a = 0;
                this.f11973b = 1;
                return;
            }
            this.f11972a = j10;
            this.f11973b = j11;
        }

        public final String toString() {
            return this.f11972a + "/" + this.f11973b;
        }
    }

    public static class f extends b {
        public f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f11960a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }

        public f(byte[] bArr) {
            super(bArr);
            this.f11960a.mark(Integer.MAX_VALUE);
        }

        public final void c(long j10) {
            int i10 = this.f11962c;
            if (((long) i10) > j10) {
                this.f11962c = 0;
                this.f11960a.reset();
            } else {
                j10 -= (long) i10;
            }
            a((int) j10);
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", IronSourceConstants.OFFERWALL_OPENED, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 1)};
        H = new d[][]{dVarArr, new d[]{new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")}, new d[]{new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)}, new d[]{new d("InteroperabilityIndex", 1, 2)}, new d[]{new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", IronSourceConstants.OFFERWALL_OPENED, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")}, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        Charset forName = Charset.forName("US-ASCII");
        N = forName;
        O = "Exif\u0000\u0000".getBytes(forName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr2 = H;
            if (i10 < dVarArr2.length) {
                J[i10] = new HashMap<>();
                K[i10] = new HashMap<>();
                for (d dVar : dVarArr2[i10]) {
                    J[i10].put(Integer.valueOf(dVar.f11968a), dVar);
                    K[i10].put(dVar.f11969b, dVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = M;
                d[] dVarArr3 = I;
                hashMap.put(Integer.valueOf(dVarArr3[0].f11968a), 5);
                hashMap.put(Integer.valueOf(dVarArr3[1].f11968a), 1);
                hashMap.put(Integer.valueOf(dVarArr3[2].f11968a), 2);
                hashMap.put(Integer.valueOf(dVarArr3[3].f11968a), 3);
                hashMap.put(Integer.valueOf(dVarArr3[4].f11968a), 7);
                hashMap.put(Integer.valueOf(dVarArr3[5].f11968a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public a(InputStream inputStream) {
        boolean z9;
        d[][] dVarArr = H;
        this.f11949d = new HashMap[dVarArr.length];
        this.f11950e = new HashSet(dVarArr.length);
        if (inputStream != null) {
            FileDescriptor fileDescriptor = null;
            boolean z10 = true;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f11947b = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        b.a.c(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                        z9 = true;
                    } catch (Exception unused) {
                        if (f11933l) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z9 = false;
                    }
                    if (z9) {
                        this.f11947b = null;
                        fileDescriptor = fileInputStream.getFD();
                    }
                }
                this.f11947b = null;
            }
            this.f11946a = fileDescriptor;
            int i10 = 0;
            while (i10 < H.length) {
                try {
                    this.f11949d[i10] = new HashMap<>();
                    i10++;
                } catch (IOException | UnsupportedOperationException e10) {
                    boolean z11 = f11933l;
                    if (z11) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    a();
                    if (!z11) {
                        return;
                    }
                } catch (Throwable th) {
                    a();
                    if (f11933l) {
                        p();
                    }
                    throw th;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            int f10 = f(bufferedInputStream);
            this.f11948c = f10;
            if ((f10 == 4 || f10 == 9 || f10 == 13 || f10 == 14) ? false : z10) {
                f fVar = new f((InputStream) bufferedInputStream);
                int i11 = this.f11948c;
                if (i11 == 12) {
                    d(fVar);
                } else if (i11 == 7) {
                    g(fVar);
                } else if (i11 == 10) {
                    k(fVar);
                } else {
                    j(fVar);
                }
                fVar.c((long) this.f11953h);
                u(fVar);
            } else {
                b bVar = new b((InputStream) bufferedInputStream);
                int i12 = this.f11948c;
                if (i12 == 4) {
                    e(bVar, 0, 0);
                } else if (i12 == 13) {
                    h(bVar);
                } else if (i12 == 9) {
                    i(bVar);
                } else if (i12 == 14) {
                    l(bVar);
                }
            }
            a();
            if (!f11933l) {
                return;
            }
            p();
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f11933l) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f11933l) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder g10 = androidx.activity.f.g("Invalid byte order: ");
            g10.append(Integer.toHexString(readShort));
            throw new IOException(g10.toString());
        }
    }

    public final void a() {
        String b10 = b("DateTimeOriginal");
        if (b10 != null && b("DateTime") == null) {
            this.f11949d[0].put("DateTime", c.a(b10));
        }
        if (b("ImageWidth") == null) {
            this.f11949d[0].put("ImageWidth", c.b(0, this.f11951f));
        }
        if (b("ImageLength") == null) {
            this.f11949d[0].put("ImageLength", c.b(0, this.f11951f));
        }
        if (b("Orientation") == null) {
            this.f11949d[0].put("Orientation", c.b(0, this.f11951f));
        }
        if (b("LightSource") == null) {
            this.f11949d[1].put("LightSource", c.b(0, this.f11951f));
        }
    }

    public final String b(String str) {
        String str2;
        c c10 = c(str);
        if (c10 != null) {
            if (!L.contains(str)) {
                return c10.g(this.f11951f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = c10.f11964a;
                if (i10 == 5 || i10 == 10) {
                    e[] eVarArr = (e[]) c10.h(this.f11951f);
                    if (eVarArr == null || eVarArr.length != 3) {
                        StringBuilder g10 = androidx.activity.f.g("Invalid GPS Timestamp array. array=");
                        g10.append(Arrays.toString(eVarArr));
                        str2 = g10.toString();
                    } else {
                        e eVar = eVarArr[0];
                        e eVar2 = eVarArr[1];
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVar.f11972a) / ((float) eVar.f11973b))), Integer.valueOf((int) (((float) eVar2.f11972a) / ((float) eVar2.f11973b))), Integer.valueOf((int) (((float) eVar3.f11972a) / ((float) eVar3.f11973b)))});
                    }
                } else {
                    StringBuilder g11 = androidx.activity.f.g("GPS Timestamp format is not rational. format=");
                    g11.append(c10.f11964a);
                    str2 = g11.toString();
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(c10.e(this.f11951f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f11933l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < H.length; i10++) {
            c cVar = this.f11949d[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0138, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0142, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0145, code lost:
        throw r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x013a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(t0.a.f r13) {
        /*
            r12 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0146
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            t0.a$a r2 = new t0.a$a     // Catch:{ RuntimeException -> 0x013a }
            r2.<init>(r13)     // Catch:{ RuntimeException -> 0x013a }
            t0.b.C0143b.a(r1, r2)     // Catch:{ RuntimeException -> 0x013a }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x013a }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x013a }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x013a }
            r6 = 0
            if (r4 == 0) goto L_0x0047
            r0 = 29
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r0 = 30
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 31
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x0062
        L_0x0047:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x013a }
            if (r0 == 0) goto L_0x0060
            r0 = 18
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r0 = 19
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x013a }
            r4 = 24
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x0062
        L_0x0060:
            r0 = r6
            r4 = r0
        L_0x0062:
            r5 = 0
            if (r6 == 0) goto L_0x0078
            java.util.HashMap<java.lang.String, t0.a$c>[] r7 = r12.f11949d     // Catch:{ RuntimeException -> 0x013a }
            r7 = r7[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r8 = "ImageWidth"
            int r9 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x013a }
            java.nio.ByteOrder r10 = r12.f11951f     // Catch:{ RuntimeException -> 0x013a }
            t0.a$c r9 = t0.a.c.d(r9, r10)     // Catch:{ RuntimeException -> 0x013a }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x013a }
        L_0x0078:
            if (r0 == 0) goto L_0x008d
            java.util.HashMap<java.lang.String, t0.a$c>[] r7 = r12.f11949d     // Catch:{ RuntimeException -> 0x013a }
            r7 = r7[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r8 = "ImageLength"
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x013a }
            java.nio.ByteOrder r10 = r12.f11951f     // Catch:{ RuntimeException -> 0x013a }
            t0.a$c r9 = t0.a.c.d(r9, r10)     // Catch:{ RuntimeException -> 0x013a }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x013a }
        L_0x008d:
            r7 = 6
            if (r4 == 0) goto L_0x00b7
            r8 = 1
            int r9 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x013a }
            r10 = 90
            if (r9 == r10) goto L_0x00a7
            r10 = 180(0xb4, float:2.52E-43)
            if (r9 == r10) goto L_0x00a5
            r10 = 270(0x10e, float:3.78E-43)
            if (r9 == r10) goto L_0x00a2
            goto L_0x00a8
        L_0x00a2:
            r8 = 8
            goto L_0x00a8
        L_0x00a5:
            r8 = 3
            goto L_0x00a8
        L_0x00a7:
            r8 = r7
        L_0x00a8:
            java.util.HashMap<java.lang.String, t0.a$c>[] r9 = r12.f11949d     // Catch:{ RuntimeException -> 0x013a }
            r9 = r9[r5]     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r12.f11951f     // Catch:{ RuntimeException -> 0x013a }
            t0.a$c r8 = t0.a.c.d(r8, r11)     // Catch:{ RuntimeException -> 0x013a }
            r9.put(r10, r8)     // Catch:{ RuntimeException -> 0x013a }
        L_0x00b7:
            if (r2 == 0) goto L_0x010a
            if (r3 == 0) goto L_0x010a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x013a }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x013a }
            if (r3 <= r7) goto L_0x0102
            long r8 = (long) r2     // Catch:{ RuntimeException -> 0x013a }
            r13.c(r8)     // Catch:{ RuntimeException -> 0x013a }
            byte[] r8 = new byte[r7]     // Catch:{ RuntimeException -> 0x013a }
            int r9 = r13.read(r8)     // Catch:{ RuntimeException -> 0x013a }
            if (r9 != r7) goto L_0x00fa
            int r2 = r2 + r7
            int r3 = r3 + -6
            byte[] r7 = O     // Catch:{ RuntimeException -> 0x013a }
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch:{ RuntimeException -> 0x013a }
            if (r7 == 0) goto L_0x00f2
            byte[] r7 = new byte[r3]     // Catch:{ RuntimeException -> 0x013a }
            int r13 = r13.read(r7)     // Catch:{ RuntimeException -> 0x013a }
            if (r13 != r3) goto L_0x00ea
            r12.f11953h = r2     // Catch:{ RuntimeException -> 0x013a }
            r12.r(r5, r7)     // Catch:{ RuntimeException -> 0x013a }
            goto L_0x010a
        L_0x00ea:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Can't read exif"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x00f2:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Invalid identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x00fa:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Can't read identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x0102:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = "Invalid exif length"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x013a }
            throw r13     // Catch:{ RuntimeException -> 0x013a }
        L_0x010a:
            boolean r13 = f11933l     // Catch:{ RuntimeException -> 0x013a }
            if (r13 == 0) goto L_0x0134
            java.lang.String r13 = "ExifInterface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x013a }
            r2.<init>()     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r3 = "Heif meta: "
            r2.append(r3)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r6)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = ", rotation "
            r2.append(r0)     // Catch:{ RuntimeException -> 0x013a }
            r2.append(r4)     // Catch:{ RuntimeException -> 0x013a }
            java.lang.String r0 = r2.toString()     // Catch:{ RuntimeException -> 0x013a }
            android.util.Log.d(r13, r0)     // Catch:{ RuntimeException -> 0x013a }
        L_0x0134:
            r1.release()
            return
        L_0x0138:
            r13 = move-exception
            goto L_0x0142
        L_0x013a:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r13.<init>(r0)     // Catch:{ all -> 0x0138 }
            throw r13     // Catch:{ all -> 0x0138 }
        L_0x0142:
            r1.release()
            throw r13
        L_0x0146:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.a.d(t0.a$f):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(t0.a.b r20, int r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            boolean r3 = f11933l
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0020
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L_0x0020:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f11961b = r3
            byte r3 = r20.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L_0x01dc
            byte r7 = r20.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x01c5
            r3 = 2
            r5 = r3
        L_0x0037:
            byte r7 = r20.readByte()
            if (r7 != r6) goto L_0x01ac
            r7 = 1
            int r3 = r3 + r7
            byte r8 = r20.readByte()
            boolean r9 = f11933l
            if (r9 == 0) goto L_0x005d
            java.lang.String r10 = "Found JPEG segment indicator: "
            java.lang.StringBuilder r10 = androidx.activity.f.g(r10)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r4, r10)
        L_0x005d:
            int r3 = r3 + r7
            r10 = -39
            if (r8 == r10) goto L_0x01a7
            r10 = -38
            if (r8 != r10) goto L_0x0068
            goto L_0x01a7
        L_0x0068:
            int r10 = r20.readUnsignedShort()
            int r10 = r10 - r5
            int r3 = r3 + r5
            if (r9 == 0) goto L_0x0095
            java.lang.String r5 = "JPEG segment: "
            java.lang.StringBuilder r5 = androidx.activity.f.g(r5)
            r9 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r5.append(r9)
            java.lang.String r9 = " (length: "
            r5.append(r9)
            int r9 = r10 + 2
            r5.append(r9)
            java.lang.String r9 = ")"
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
        L_0x0095:
            java.lang.String r5 = "Invalid length"
            if (r10 < 0) goto L_0x01a1
            r9 = -31
            r11 = 0
            if (r8 == r9) goto L_0x0115
            r9 = -2
            if (r8 == r9) goto L_0x00e9
            switch(r8) {
                case -64: goto L_0x00ae;
                case -63: goto L_0x00ae;
                case -62: goto L_0x00ae;
                case -61: goto L_0x00ae;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            switch(r8) {
                case -59: goto L_0x00ae;
                case -58: goto L_0x00ae;
                case -57: goto L_0x00ae;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            switch(r8) {
                case -55: goto L_0x00ae;
                case -54: goto L_0x00ae;
                case -53: goto L_0x00ae;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            switch(r8) {
                case -51: goto L_0x00ae;
                case -50: goto L_0x00ae;
                case -49: goto L_0x00ae;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            goto L_0x00e6
        L_0x00ae:
            r1.a(r7)
            java.util.HashMap<java.lang.String, t0.a$c>[] r7 = r0.f11949d
            r7 = r7[r2]
            r8 = 4
            if (r2 == r8) goto L_0x00bb
            java.lang.String r9 = "ImageLength"
            goto L_0x00bd
        L_0x00bb:
            java.lang.String r9 = "ThumbnailImageLength"
        L_0x00bd:
            int r11 = r20.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f11951f
            t0.a$c r11 = t0.a.c.b(r11, r13)
            r7.put(r9, r11)
            java.util.HashMap<java.lang.String, t0.a$c>[] r7 = r0.f11949d
            r7 = r7[r2]
            if (r2 == r8) goto L_0x00d4
            java.lang.String r8 = "ImageWidth"
            goto L_0x00d6
        L_0x00d4:
            java.lang.String r8 = "ThumbnailImageWidth"
        L_0x00d6:
            int r9 = r20.readUnsignedShort()
            long r11 = (long) r9
            java.nio.ByteOrder r9 = r0.f11951f
            t0.a$c r9 = t0.a.c.b(r11, r9)
            r7.put(r8, r9)
            int r10 = r10 + -5
        L_0x00e6:
            r11 = r10
            goto L_0x0191
        L_0x00e9:
            byte[] r8 = new byte[r10]
            int r9 = r1.read(r8)
            if (r9 != r10) goto L_0x010d
            java.lang.String r9 = "UserComment"
            java.lang.String r10 = r0.b(r9)
            if (r10 != 0) goto L_0x0191
            java.util.HashMap<java.lang.String, t0.a$c>[] r10 = r0.f11949d
            r7 = r10[r7]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r12 = N
            r10.<init>(r8, r12)
            t0.a$c r8 = t0.a.c.a(r10)
            r7.put(r9, r8)
            goto L_0x0191
        L_0x010d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x0115:
            byte[] r8 = new byte[r10]
            r1.readFully(r8)
            int r9 = r3 + r10
            byte[] r12 = O
            if (r12 != 0) goto L_0x0121
            goto L_0x012f
        L_0x0121:
            int r13 = r12.length
            if (r10 >= r13) goto L_0x0125
            goto L_0x012f
        L_0x0125:
            r13 = r11
        L_0x0126:
            int r14 = r12.length
            if (r13 >= r14) goto L_0x0134
            byte r14 = r8[r13]
            byte r15 = r12[r13]
            if (r14 == r15) goto L_0x0131
        L_0x012f:
            r13 = r11
            goto L_0x0135
        L_0x0131:
            int r13 = r13 + 1
            goto L_0x0126
        L_0x0134:
            r13 = r7
        L_0x0135:
            if (r13 == 0) goto L_0x014e
            int r7 = r12.length
            byte[] r7 = java.util.Arrays.copyOfRange(r8, r7, r10)
            int r3 = r21 + r3
            int r8 = r12.length
            int r3 = r3 + r8
            r0.f11953h = r3
            r0.r(r2, r7)
            t0.a$b r3 = new t0.a$b
            r3.<init>((byte[]) r7)
            r0.u(r3)
            goto L_0x0190
        L_0x014e:
            byte[] r12 = P
            if (r12 != 0) goto L_0x0153
            goto L_0x0161
        L_0x0153:
            int r13 = r12.length
            if (r10 >= r13) goto L_0x0157
            goto L_0x0161
        L_0x0157:
            r13 = r11
        L_0x0158:
            int r14 = r12.length
            if (r13 >= r14) goto L_0x0166
            byte r14 = r8[r13]
            byte r15 = r12[r13]
            if (r14 == r15) goto L_0x0163
        L_0x0161:
            r7 = r11
            goto L_0x0166
        L_0x0163:
            int r13 = r13 + 1
            goto L_0x0158
        L_0x0166:
            if (r7 == 0) goto L_0x0190
            int r7 = r12.length
            int r3 = r3 + r7
            int r7 = r12.length
            byte[] r15 = java.util.Arrays.copyOfRange(r8, r7, r10)
            java.lang.String r7 = "Xmp"
            java.lang.String r8 = r0.b(r7)
            if (r8 != 0) goto L_0x0190
            java.util.HashMap<java.lang.String, t0.a$c>[] r8 = r0.f11949d
            r8 = r8[r11]
            t0.a$c r10 = new t0.a$c
            r16 = 1
            int r13 = r15.length
            r18 = r7
            long r6 = (long) r3
            r12 = r10
            r3 = r13
            r13 = r6
            r17 = r3
            r12.<init>(r13, r15, r16, r17)
            r3 = r18
            r8.put(r3, r10)
        L_0x0190:
            r3 = r9
        L_0x0191:
            if (r11 < 0) goto L_0x019b
            r1.a(r11)
            int r3 = r3 + r11
            r5 = 2
            r6 = -1
            goto L_0x0037
        L_0x019b:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r5)
            throw r1
        L_0x01a1:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r5)
            throw r1
        L_0x01a7:
            java.nio.ByteOrder r2 = r0.f11951f
            r1.f11961b = r2
            return
        L_0x01ac:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid marker:"
            java.lang.StringBuilder r2 = androidx.activity.f.g(r2)
            r3 = r7 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c5:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = androidx.activity.f.g(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01dc:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = androidx.activity.f.g(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.a.e(t0.a$b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cf, code lost:
        if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0143 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8 A[Catch:{ all -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0111 A[SYNTHETIC, Splitter:B:99:0x0111] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r18.reset()
            r4 = 0
            r0 = r4
        L_0x0013:
            byte[] r5 = f11938q
            int r6 = r5.length
            if (r0 >= r6) goto L_0x0023
            byte r6 = r3[r0]
            byte r5 = r5[r0]
            if (r6 == r5) goto L_0x0020
            r0 = r4
            goto L_0x0024
        L_0x0020:
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0023:
            r0 = 1
        L_0x0024:
            r5 = 4
            if (r0 == 0) goto L_0x0028
            return r5
        L_0x0028:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r6 = "FUJIFILMCCD-RAW"
            byte[] r0 = r6.getBytes(r0)
            r6 = r4
        L_0x0033:
            int r8 = r0.length
            if (r6 >= r8) goto L_0x0041
            byte r8 = r3[r6]
            byte r9 = r0[r6]
            if (r8 == r9) goto L_0x003e
            r0 = r4
            goto L_0x0042
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0041:
            r0 = 1
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r0 = 9
            return r0
        L_0x0047:
            t0.a$b r8 = new t0.a$b     // Catch:{ Exception -> 0x00c2, all -> 0x00be }
            r8.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00c2, all -> 0x00be }
            int r0 = r8.readInt()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            long r9 = (long) r0     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r8.read(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r11 = f11939r     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r0 != 0) goto L_0x0060
            goto L_0x00d1
        L_0x0060:
            r11 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r13 = 16
            r15 = 8
            if (r0 != 0) goto L_0x0074
            long r9 = r8.readLong()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            goto L_0x00d1
        L_0x0074:
            r13 = r15
        L_0x0075:
            long r6 = (long) r2     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            r9 = r6
        L_0x007b:
            long r9 = r9 - r13
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0081
            goto L_0x00d1
        L_0x0081:
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r6 = 0
            r2 = r4
            r13 = r2
        L_0x0087:
            r14 = 4
            long r14 = r9 / r14
            int r14 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x00d1
            int r14 = r8.read(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == r5) goto L_0x0096
            goto L_0x00d1
        L_0x0096:
            int r14 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x009b
            goto L_0x00b7
        L_0x009b:
            byte[] r14 = f11940s     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00a5
            r2 = 1
            goto L_0x00ae
        L_0x00a5:
            byte[] r14 = f11941t     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00ae
            r13 = 1
        L_0x00ae:
            if (r2 == 0) goto L_0x00b7
            if (r13 == 0) goto L_0x00b7
            r8.close()
            r0 = 1
            goto L_0x00d5
        L_0x00b7:
            long r6 = r6 + r11
            goto L_0x0087
        L_0x00b9:
            r0 = move-exception
            goto L_0x018d
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c4
        L_0x00be:
            r0 = move-exception
            r6 = 0
            goto L_0x018c
        L_0x00c2:
            r0 = move-exception
            r8 = 0
        L_0x00c4:
            boolean r2 = f11933l     // Catch:{ all -> 0x018a }
            if (r2 == 0) goto L_0x00cf
            java.lang.String r2 = "ExifInterface"
            java.lang.String r6 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r6, r0)     // Catch:{ all -> 0x018a }
        L_0x00cf:
            if (r8 == 0) goto L_0x00d4
        L_0x00d1:
            r8.close()
        L_0x00d4:
            r0 = r4
        L_0x00d5:
            if (r0 == 0) goto L_0x00da
            r0 = 12
            return r0
        L_0x00da:
            t0.a$b r2 = new t0.a$b     // Catch:{ Exception -> 0x0106, all -> 0x00fe }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0106, all -> 0x00fe }
            java.nio.ByteOrder r0 = q(r2)     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r1.f11951f = r0     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r2.f11961b = r0     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r6 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r6) goto L_0x00f6
            r6 = 21330(0x5352, float:2.989E-41)
            if (r0 != r6) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r0 = r4
            goto L_0x00f7
        L_0x00f6:
            r0 = 1
        L_0x00f7:
            r2.close()
            goto L_0x010d
        L_0x00fb:
            r0 = move-exception
            r6 = r2
            goto L_0x0100
        L_0x00fe:
            r0 = move-exception
            r6 = 0
        L_0x0100:
            if (r6 == 0) goto L_0x0105
            r6.close()
        L_0x0105:
            throw r0
        L_0x0106:
            r2 = 0
        L_0x0107:
            if (r2 == 0) goto L_0x010c
            r2.close()
        L_0x010c:
            r0 = r4
        L_0x010d:
            if (r0 == 0) goto L_0x0111
            r0 = 7
            return r0
        L_0x0111:
            t0.a$b r2 = new t0.a$b     // Catch:{ Exception -> 0x013a, all -> 0x0132 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x013a, all -> 0x0132 }
            java.nio.ByteOrder r0 = q(r2)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r1.f11951f = r0     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r2.f11961b = r0     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r6 = 85
            if (r0 != r6) goto L_0x0128
            r0 = 1
            goto L_0x0129
        L_0x0128:
            r0 = r4
        L_0x0129:
            r2.close()
            goto L_0x0141
        L_0x012d:
            r0 = move-exception
            r6 = r2
            goto L_0x0134
        L_0x0130:
            r6 = r2
            goto L_0x013b
        L_0x0132:
            r0 = move-exception
            r6 = 0
        L_0x0134:
            if (r6 == 0) goto L_0x0139
            r6.close()
        L_0x0139:
            throw r0
        L_0x013a:
            r6 = 0
        L_0x013b:
            if (r6 == 0) goto L_0x0140
            r6.close()
        L_0x0140:
            r0 = r4
        L_0x0141:
            if (r0 == 0) goto L_0x0146
            r0 = 10
            return r0
        L_0x0146:
            r0 = r4
        L_0x0147:
            byte[] r2 = w
            int r6 = r2.length
            if (r0 >= r6) goto L_0x0157
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x0154
            r0 = r4
            goto L_0x0158
        L_0x0154:
            int r0 = r0 + 1
            goto L_0x0147
        L_0x0157:
            r0 = 1
        L_0x0158:
            if (r0 == 0) goto L_0x015d
            r0 = 13
            return r0
        L_0x015d:
            r0 = r4
        L_0x015e:
            byte[] r2 = A
            int r6 = r2.length
            if (r0 >= r6) goto L_0x016d
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x016a
            goto L_0x017e
        L_0x016a:
            int r0 = r0 + 1
            goto L_0x015e
        L_0x016d:
            r0 = r4
        L_0x016e:
            byte[] r2 = B
            int r6 = r2.length
            if (r0 >= r6) goto L_0x0183
            byte[] r6 = A
            int r6 = r6.length
            int r6 = r6 + r0
            int r6 = r6 + r5
            byte r6 = r3[r6]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x0180
        L_0x017e:
            r7 = r4
            goto L_0x0184
        L_0x0180:
            int r0 = r0 + 1
            goto L_0x016e
        L_0x0183:
            r7 = 1
        L_0x0184:
            if (r7 == 0) goto L_0x0189
            r0 = 14
            return r0
        L_0x0189:
            return r4
        L_0x018a:
            r0 = move-exception
            r6 = r8
        L_0x018c:
            r8 = r6
        L_0x018d:
            if (r8 == 0) goto L_0x0192
            r8.close()
        L_0x0192:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.a.f(java.io.BufferedInputStream):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(t0.a.f r6) {
        /*
            r5 = this;
            r5.j(r6)
            java.util.HashMap<java.lang.String, t0.a$c>[] r6 = r5.f11949d
            r0 = 1
            r6 = r6[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r6 = r6.get(r1)
            t0.a$c r6 = (t0.a.c) r6
            if (r6 == 0) goto L_0x00e7
            t0.a$f r1 = new t0.a$f
            byte[] r6 = r6.f11967d
            r1.<init>((byte[]) r6)
            java.nio.ByteOrder r6 = r5.f11951f
            r1.f11961b = r6
            byte[] r6 = u
            int r2 = r6.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.c(r3)
            byte[] r3 = f11942v
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r6 = java.util.Arrays.equals(r2, r6)
            if (r6 == 0) goto L_0x003b
            r2 = 8
            goto L_0x0043
        L_0x003b:
            boolean r6 = java.util.Arrays.equals(r4, r3)
            if (r6 == 0) goto L_0x0046
            r2 = 12
        L_0x0043:
            r1.c(r2)
        L_0x0046:
            r6 = 6
            r5.s(r1, r6)
            java.util.HashMap<java.lang.String, t0.a$c>[] r6 = r5.f11949d
            r1 = 7
            r6 = r6[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r6 = r6.get(r2)
            t0.a$c r6 = (t0.a.c) r6
            java.util.HashMap<java.lang.String, t0.a$c>[] r2 = r5.f11949d
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            t0.a$c r1 = (t0.a.c) r1
            if (r6 == 0) goto L_0x007a
            if (r1 == 0) goto L_0x007a
            java.util.HashMap<java.lang.String, t0.a$c>[] r2 = r5.f11949d
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r6)
            java.util.HashMap<java.lang.String, t0.a$c>[] r6 = r5.f11949d
            r6 = r6[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r6.put(r2, r1)
        L_0x007a:
            java.util.HashMap<java.lang.String, t0.a$c>[] r6 = r5.f11949d
            r1 = 8
            r6 = r6[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r6 = r6.get(r1)
            t0.a$c r6 = (t0.a.c) r6
            if (r6 == 0) goto L_0x00e7
            java.nio.ByteOrder r1 = r5.f11951f
            java.io.Serializable r6 = r6.h(r1)
            int[] r6 = (int[]) r6
            if (r6 == 0) goto L_0x00d1
            int r1 = r6.length
            r2 = 4
            if (r1 == r2) goto L_0x0099
            goto L_0x00d1
        L_0x0099:
            r1 = 2
            r1 = r6[r1]
            r2 = 0
            r3 = r6[r2]
            if (r1 <= r3) goto L_0x00e7
            r4 = 3
            r4 = r6[r4]
            r6 = r6[r0]
            if (r4 <= r6) goto L_0x00e7
            int r1 = r1 - r3
            int r1 = r1 + r0
            int r4 = r4 - r6
            int r4 = r4 + r0
            if (r1 >= r4) goto L_0x00b2
            int r1 = r1 + r4
            int r4 = r1 - r4
            int r1 = r1 - r4
        L_0x00b2:
            java.nio.ByteOrder r6 = r5.f11951f
            t0.a$c r6 = t0.a.c.d(r1, r6)
            java.nio.ByteOrder r0 = r5.f11951f
            t0.a$c r0 = t0.a.c.d(r4, r0)
            java.util.HashMap<java.lang.String, t0.a$c>[] r1 = r5.f11949d
            r1 = r1[r2]
            java.lang.String r3 = "ImageWidth"
            r1.put(r3, r6)
            java.util.HashMap<java.lang.String, t0.a$c>[] r6 = r5.f11949d
            r6 = r6[r2]
            java.lang.String r1 = "ImageLength"
            r6.put(r1, r0)
            goto L_0x00e7
        L_0x00d1:
            java.lang.String r0 = "Invalid aspect frame values. frame="
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r6)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.a.g(t0.a$f):void");
    }

    public final void h(b bVar) {
        if (f11933l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f11961b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = w;
        bVar.a(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16) {
                        if (!Arrays.equals(bArr2, f11944y)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f11945z)) {
                        if (Arrays.equals(bArr2, f11943x)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f11953h = i11;
                                    r(0, bArr3);
                                    x();
                                    u(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                        }
                        int i12 = readInt + 4;
                        bVar.a(i12);
                        length = i11 + i12;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) {
        boolean z9 = f11933l;
        if (z9) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.a(i10 - bVar.f11962c);
        bVar.read(bArr4);
        e(new b(bArr4), i10, 5);
        bVar.a(i12 - bVar.f11962c);
        bVar.f11961b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z9) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == G.f11968a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d10 = c.d(readShort, this.f11951f);
                c d11 = c.d(readShort2, this.f11951f);
                this.f11949d[0].put("ImageLength", d10);
                this.f11949d[0].put("ImageWidth", d11);
                if (f11933l) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        c cVar;
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f11948c == 8 && (cVar = this.f11949d[1].get("MakerNote")) != null) {
            f fVar2 = new f(cVar.f11967d);
            fVar2.f11961b = this.f11951f;
            fVar2.a(6);
            s(fVar2, 9);
            c cVar2 = this.f11949d[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f11949d[1].put("ColorSpace", cVar2);
            }
        }
    }

    public final void k(f fVar) {
        if (f11933l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        c cVar = this.f11949d[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f11967d), (int) cVar.f11966c, 5);
        }
        c cVar2 = this.f11949d[0].get("ISO");
        c cVar3 = this.f11949d[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            this.f11949d[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void l(b bVar) {
        if (f11933l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f11961b = ByteOrder.LITTLE_ENDIAN;
        bVar.a(A.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = B;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = length + 4 + 4;
                    if (Arrays.equals(C, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f11953h = i10;
                            r(0, bArr3);
                            u(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i10 + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.a(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f10 = cVar.f(this.f11951f);
            int f11 = cVar2.f(this.f11951f);
            if (this.f11948c == 7) {
                f10 += this.f11954i;
            }
            if (f10 > 0 && f11 > 0 && this.f11947b == null && this.f11946a == null) {
                bVar.skip((long) f10);
                bVar.read(new byte[f11]);
            }
            if (f11933l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f10 + ", length: " + f11);
            }
        }
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.f(this.f11951f) <= 512 && cVar2.f(this.f11951f) <= 512;
    }

    public final void o(b bVar) {
        ByteOrder q10 = q(bVar);
        this.f11951f = q10;
        bVar.f11961b = q10;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f11948c;
        if (i10 == 7 || i10 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i11 = readInt - 8;
                if (i11 > 0) {
                    bVar.a(i11);
                    return;
                }
                return;
            }
            throw new IOException(androidx.activity.e.a("Invalid first Ifd offset: ", readInt));
        }
        StringBuilder g10 = androidx.activity.f.g("Invalid start code: ");
        g10.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(g10.toString());
    }

    public final void p() {
        for (int i10 = 0; i10 < this.f11949d.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f11949d[i10].size());
            for (Map.Entry next : this.f11949d[i10].entrySet()) {
                c cVar = (c) next.getValue();
                StringBuilder g10 = androidx.activity.f.g("tagName: ");
                g10.append((String) next.getKey());
                g10.append(", tagType: ");
                g10.append(cVar.toString());
                g10.append(", tagValue: '");
                g10.append(cVar.g(this.f11951f));
                g10.append("'");
                Log.d("ExifInterface", g10.toString());
            }
        }
    }

    public final void r(int i10, byte[] bArr) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0164  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(t0.a.f r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.util.HashSet r3 = r0.f11950e
            int r4 = r1.f11962c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r22.readShort()
            boolean r4 = f11933l
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x002f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x002f:
            if (r3 > 0) goto L_0x0032
            return
        L_0x0032:
            r4 = 0
            r6 = r4
        L_0x0034:
            r7 = 5
            if (r4 >= r3) goto L_0x033a
            int r8 = r22.readUnsignedShort()
            int r9 = r22.readUnsignedShort()
            int r15 = r22.readInt()
            int r10 = r1.f11962c
            long r10 = (long) r10
            r12 = 4
            long r10 = r10 + r12
            java.util.HashMap<java.lang.Integer, t0.a$d>[] r14 = J
            r14 = r14[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            java.lang.Object r12 = r14.get(r12)
            r14 = r12
            t0.a$d r14 = (t0.a.d) r14
            boolean r12 = f11933l
            r13 = 3
            if (r12 == 0) goto L_0x008d
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r23)
            r7[r6] = r18
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r18 = 1
            r7[r18] = r6
            if (r14 == 0) goto L_0x0072
            java.lang.String r6 = r14.f11969b
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            r18 = 2
            r7[r18] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r7[r13] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r13 = 4
            r7[r13] = r6
            java.lang.String r6 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r6 = java.lang.String.format(r6, r7)
            android.util.Log.d(r5, r6)
        L_0x008d:
            r6 = 7
            if (r14 != 0) goto L_0x00aa
            if (r12 == 0) goto L_0x00a6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x00a6:
            r18 = r3
            goto L_0x0109
        L_0x00aa:
            if (r9 <= 0) goto L_0x013f
            int[] r7 = E
            int r13 = r7.length
            if (r9 < r13) goto L_0x00b3
            goto L_0x013f
        L_0x00b3:
            int r13 = r14.f11970c
            if (r13 == r6) goto L_0x00e4
            if (r9 != r6) goto L_0x00ba
            goto L_0x00e4
        L_0x00ba:
            if (r13 == r9) goto L_0x00e4
            int r6 = r14.f11971d
            if (r6 != r9) goto L_0x00c1
            goto L_0x00e4
        L_0x00c1:
            r18 = r3
            r3 = 4
            if (r13 == r3) goto L_0x00c8
            if (r6 != r3) goto L_0x00cc
        L_0x00c8:
            r3 = 3
            if (r9 != r3) goto L_0x00cc
            goto L_0x00e6
        L_0x00cc:
            r3 = 9
            if (r13 == r3) goto L_0x00d2
            if (r6 != r3) goto L_0x00d7
        L_0x00d2:
            r3 = 8
            if (r9 != r3) goto L_0x00d7
            goto L_0x00e6
        L_0x00d7:
            r3 = 12
            if (r13 == r3) goto L_0x00dd
            if (r6 != r3) goto L_0x00e2
        L_0x00dd:
            r3 = 11
            if (r9 != r3) goto L_0x00e2
            goto L_0x00e6
        L_0x00e2:
            r3 = 0
            goto L_0x00e7
        L_0x00e4:
            r18 = r3
        L_0x00e6:
            r3 = 1
        L_0x00e7:
            if (r3 != 0) goto L_0x010c
            if (r12 == 0) goto L_0x0109
            java.lang.String r3 = "Skip the tag entry since data format ("
            java.lang.StringBuilder r3 = androidx.activity.f.g(r3)
            java.lang.String[] r6 = D
            r6 = r6[r9]
            r3.append(r6)
            java.lang.String r6 = ") is unexpected for tag: "
            r3.append(r6)
            java.lang.String r6 = r14.f11969b
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x0109:
            r19 = r4
            goto L_0x0159
        L_0x010c:
            r3 = 7
            r6 = r4
            if (r9 != r3) goto L_0x0111
            r9 = r13
        L_0x0111:
            long r3 = (long) r15
            r7 = r7[r9]
            r19 = r6
            long r6 = (long) r7
            long r6 = r6 * r3
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0128
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            r3 = 1
            goto L_0x015d
        L_0x0128:
            if (r12 == 0) goto L_0x015c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since the number of components is invalid: "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
            goto L_0x015c
        L_0x013f:
            r18 = r3
            r19 = r4
            if (r12 == 0) goto L_0x0159
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x0159:
            r3 = 0
            r6 = r3
        L_0x015c:
            r3 = 0
        L_0x015d:
            if (r3 != 0) goto L_0x0164
            r1.c(r10)
            goto L_0x0330
        L_0x0164:
            r3 = 4
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            java.lang.String r4 = "Compression"
            if (r3 <= 0) goto L_0x01ea
            int r3 = r22.readInt()
            if (r12 == 0) goto L_0x0189
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r16 = r10
            java.lang.String r10 = "seek to data offset: "
            r13.append(r10)
            r13.append(r3)
            java.lang.String r10 = r13.toString()
            android.util.Log.d(r5, r10)
            goto L_0x018b
        L_0x0189:
            r16 = r10
        L_0x018b:
            int r10 = r0.f11948c
            r11 = 7
            if (r10 != r11) goto L_0x01e3
            java.lang.String r10 = r14.f11969b
            java.lang.String r11 = "MakerNote"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x019d
            r0.f11954i = r3
            goto L_0x01e3
        L_0x019d:
            r10 = 6
            if (r2 != r10) goto L_0x01e3
            java.lang.String r11 = r14.f11969b
            java.lang.String r13 = "ThumbnailImage"
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x01e3
            r0.f11955j = r3
            r0.k = r15
            java.nio.ByteOrder r11 = r0.f11951f
            t0.a$c r10 = t0.a.c.d(r10, r11)
            int r11 = r0.f11955j
            r20 = r14
            long r13 = (long) r11
            java.nio.ByteOrder r11 = r0.f11951f
            t0.a$c r11 = t0.a.c.b(r13, r11)
            int r13 = r0.k
            long r13 = (long) r13
            java.nio.ByteOrder r2 = r0.f11951f
            t0.a$c r2 = t0.a.c.b(r13, r2)
            java.util.HashMap<java.lang.String, t0.a$c>[] r13 = r0.f11949d
            r14 = 4
            r13 = r13[r14]
            r13.put(r4, r10)
            java.util.HashMap<java.lang.String, t0.a$c>[] r10 = r0.f11949d
            r10 = r10[r14]
            java.lang.String r13 = "JPEGInterchangeFormat"
            r10.put(r13, r11)
            java.util.HashMap<java.lang.String, t0.a$c>[] r10 = r0.f11949d
            r10 = r10[r14]
            java.lang.String r11 = "JPEGInterchangeFormatLength"
            r10.put(r11, r2)
            goto L_0x01e5
        L_0x01e3:
            r20 = r14
        L_0x01e5:
            long r2 = (long) r3
            r1.c(r2)
            goto L_0x01ee
        L_0x01ea:
            r16 = r10
            r20 = r14
        L_0x01ee:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = M
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r12 == 0) goto L_0x0218
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "nextIfdType: "
            r3.append(r8)
            r3.append(r2)
            java.lang.String r8 = " byteCount: "
            r3.append(r8)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x0218:
            if (r2 == 0) goto L_0x02bf
            r3 = -1
            r6 = 3
            if (r9 == r6) goto L_0x0245
            r6 = 4
            if (r9 == r6) goto L_0x0239
            r6 = 8
            if (r9 == r6) goto L_0x0234
            r6 = 9
            if (r9 == r6) goto L_0x022f
            r6 = 13
            if (r9 == r6) goto L_0x022f
            goto L_0x024a
        L_0x022f:
            int r3 = r22.readInt()
            goto L_0x0249
        L_0x0234:
            short r3 = r22.readShort()
            goto L_0x0249
        L_0x0239:
            int r3 = r22.readInt()
            long r3 = (long) r3
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            goto L_0x024a
        L_0x0245:
            int r3 = r22.readUnsignedShort()
        L_0x0249:
            long r3 = (long) r3
        L_0x024a:
            if (r12 == 0) goto L_0x0266
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            r8 = 0
            r6[r8] = r7
            r8 = r20
            java.lang.String r7 = r8.f11969b
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L_0x0266:
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x02a5
            java.util.HashSet r6 = r0.f11950e
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x0284
            r1.c(r3)
            int r2 = r2.intValue()
            r0.s(r1, r2)
            goto L_0x02bb
        L_0x0284:
            if (r12 == 0) goto L_0x02bb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            goto L_0x02b8
        L_0x02a5:
            if (r12 == 0) goto L_0x02bb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L_0x02b8:
            android.util.Log.d(r5, r2)
        L_0x02bb:
            r6 = r16
            goto L_0x032d
        L_0x02bf:
            r8 = r20
            int r2 = r1.f11962c
            int r3 = r0.f11953h
            int r2 = r2 + r3
            int r3 = (int) r6
            byte[] r13 = new byte[r3]
            r1.readFully(r13)
            t0.a$c r3 = new t0.a$c
            long r11 = (long) r2
            r6 = r16
            r10 = r3
            r2 = r8
            r14 = r9
            r10.<init>(r11, r13, r14, r15)
            java.util.HashMap<java.lang.String, t0.a$c>[] r8 = r0.f11949d
            r8 = r8[r23]
            java.lang.String r9 = r2.f11969b
            r8.put(r9, r3)
            java.lang.String r8 = r2.f11969b
            java.lang.String r9 = "DNGVersion"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x02ed
            r8 = 3
            r0.f11948c = r8
        L_0x02ed:
            java.lang.String r8 = r2.f11969b
            java.lang.String r9 = "Make"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0301
            java.lang.String r8 = r2.f11969b
            java.lang.String r9 = "Model"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x030f
        L_0x0301:
            java.nio.ByteOrder r8 = r0.f11951f
            java.lang.String r8 = r3.g(r8)
            java.lang.String r9 = "PENTAX"
            boolean r8 = r8.contains(r9)
            if (r8 != 0) goto L_0x0322
        L_0x030f:
            java.lang.String r2 = r2.f11969b
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0326
            java.nio.ByteOrder r2 = r0.f11951f
            int r2 = r3.f(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0326
        L_0x0322:
            r2 = 8
            r0.f11948c = r2
        L_0x0326:
            int r2 = r1.f11962c
            long r2 = (long) r2
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0330
        L_0x032d:
            r1.c(r6)
        L_0x0330:
            int r4 = r19 + 1
            short r4 = (short) r4
            r6 = 0
            r2 = r23
            r3 = r18
            goto L_0x0034
        L_0x033a:
            int r2 = r22.readInt()
            boolean r3 = f11933l
            if (r3 == 0) goto L_0x0355
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r4[r8] = r6
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            android.util.Log.d(r5, r4)
        L_0x0355:
            long r8 = (long) r2
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x0392
            java.util.HashSet r4 = r0.f11950e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L_0x0388
            r1.c(r8)
            java.util.HashMap<java.lang.String, t0.a$c>[] r2 = r0.f11949d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x037a
            r0.s(r1, r3)
            goto L_0x03a8
        L_0x037a:
            java.util.HashMap<java.lang.String, t0.a$c>[] r2 = r0.f11949d
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03a8
            r0.s(r1, r7)
            goto L_0x03a8
        L_0x0388:
            if (r3 == 0) goto L_0x03a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x039b
        L_0x0392:
            if (r3 == 0) goto L_0x03a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x039b:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
        L_0x03a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.a.s(t0.a$f, int):void");
    }

    public final void t(int i10, String str, String str2) {
        if (!this.f11949d[i10].isEmpty() && this.f11949d[i10].get(str) != null) {
            HashMap<String, c> hashMap = this.f11949d[i10];
            hashMap.put(str2, hashMap.get(str));
            this.f11949d[i10].remove(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(t0.a.b r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.HashMap<java.lang.String, t0.a$c>[] r2 = r0.f11949d
            r3 = 4
            r2 = r2[r3]
            java.lang.String r3 = "Compression"
            java.lang.Object r3 = r2.get(r3)
            t0.a$c r3 = (t0.a.c) r3
            if (r3 == 0) goto L_0x013b
            java.nio.ByteOrder r4 = r0.f11951f
            int r3 = r3.f(r4)
            r4 = 1
            r5 = 6
            if (r3 == r4) goto L_0x0024
            if (r3 == r5) goto L_0x013b
            r6 = 7
            if (r3 == r6) goto L_0x0024
            goto L_0x013e
        L_0x0024:
            java.lang.String r3 = "BitsPerSample"
            java.lang.Object r3 = r2.get(r3)
            t0.a$c r3 = (t0.a.c) r3
            java.lang.String r6 = "ExifInterface"
            r7 = 0
            if (r3 == 0) goto L_0x006b
            java.nio.ByteOrder r8 = r0.f11951f
            java.io.Serializable r3 = r3.h(r8)
            int[] r3 = (int[]) r3
            int[] r8 = f11936o
            boolean r9 = java.util.Arrays.equals(r8, r3)
            if (r9 == 0) goto L_0x0042
            goto L_0x0069
        L_0x0042:
            int r9 = r0.f11948c
            r10 = 3
            if (r9 != r10) goto L_0x006b
            java.lang.String r9 = "PhotometricInterpretation"
            java.lang.Object r9 = r2.get(r9)
            t0.a$c r9 = (t0.a.c) r9
            if (r9 == 0) goto L_0x006b
            java.nio.ByteOrder r10 = r0.f11951f
            int r9 = r9.f(r10)
            if (r9 != r4) goto L_0x0061
            int[] r10 = f11937p
            boolean r10 = java.util.Arrays.equals(r3, r10)
            if (r10 != 0) goto L_0x0069
        L_0x0061:
            if (r9 != r5) goto L_0x006b
            boolean r3 = java.util.Arrays.equals(r3, r8)
            if (r3 == 0) goto L_0x006b
        L_0x0069:
            r3 = r4
            goto L_0x0075
        L_0x006b:
            boolean r3 = f11933l
            if (r3 == 0) goto L_0x0074
            java.lang.String r3 = "Unsupported data type value"
            android.util.Log.d(r6, r3)
        L_0x0074:
            r3 = r7
        L_0x0075:
            if (r3 == 0) goto L_0x013e
            java.lang.String r3 = "StripOffsets"
            java.lang.Object r3 = r2.get(r3)
            t0.a$c r3 = (t0.a.c) r3
            java.lang.String r5 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r5)
            t0.a$c r2 = (t0.a.c) r2
            if (r3 == 0) goto L_0x013e
            if (r2 == 0) goto L_0x013e
            java.nio.ByteOrder r5 = r0.f11951f
            java.io.Serializable r3 = r3.h(r5)
            long[] r3 = t0.b.b(r3)
            java.nio.ByteOrder r5 = r0.f11951f
            java.io.Serializable r2 = r2.h(r5)
            long[] r2 = t0.b.b(r2)
            if (r3 == 0) goto L_0x0135
            int r5 = r3.length
            if (r5 != 0) goto L_0x00a6
            goto L_0x0135
        L_0x00a6:
            if (r2 == 0) goto L_0x0132
            int r5 = r2.length
            if (r5 != 0) goto L_0x00ad
            goto L_0x0132
        L_0x00ad:
            int r5 = r3.length
            int r8 = r2.length
            if (r5 == r8) goto L_0x00b5
            java.lang.String r1 = "stripOffsets and stripByteCounts should have same length."
            goto L_0x0137
        L_0x00b5:
            r8 = 0
            int r5 = r2.length
            r10 = r7
        L_0x00b9:
            if (r10 >= r5) goto L_0x00c1
            r11 = r2[r10]
            long r8 = r8 + r11
            int r10 = r10 + 1
            goto L_0x00b9
        L_0x00c1:
            int r5 = (int) r8
            byte[] r5 = new byte[r5]
            r0.f11952g = r4
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x00c9:
            int r11 = r3.length
            if (r8 >= r11) goto L_0x012b
            r11 = r3[r8]
            int r11 = (int) r11
            r12 = r2[r8]
            int r12 = (int) r12
            int r13 = r3.length
            int r13 = r13 - r4
            if (r8 >= r13) goto L_0x00e3
            int r13 = r11 + r12
            long r13 = (long) r13
            int r15 = r8 + 1
            r15 = r3[r15]
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x00e3
            r0.f11952g = r7
        L_0x00e3:
            int r11 = r11 - r9
            if (r11 >= 0) goto L_0x00e9
            java.lang.String r1 = "Invalid strip offset value"
            goto L_0x011f
        L_0x00e9:
            long r13 = (long) r11
            long r15 = r1.skip(r13)
            int r13 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x0100
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to skip "
            r1.append(r2)
            r1.append(r11)
            goto L_0x0116
        L_0x0100:
            int r9 = r9 + r11
            byte[] r11 = new byte[r12]
            int r13 = r1.read(r11)
            if (r13 == r12) goto L_0x0123
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read "
            r1.append(r2)
            r1.append(r12)
        L_0x0116:
            java.lang.String r2 = " bytes."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x011f:
            android.util.Log.d(r6, r1)
            goto L_0x013e
        L_0x0123:
            int r9 = r9 + r12
            java.lang.System.arraycopy(r11, r7, r5, r10, r12)
            int r10 = r10 + r12
            int r8 = r8 + 1
            goto L_0x00c9
        L_0x012b:
            boolean r1 = r0.f11952g
            if (r1 == 0) goto L_0x013e
            r1 = r3[r7]
            goto L_0x013e
        L_0x0132:
            java.lang.String r1 = "stripByteCounts should not be null or have zero length."
            goto L_0x0137
        L_0x0135:
            java.lang.String r1 = "stripOffsets should not be null or have zero length."
        L_0x0137:
            android.util.Log.w(r6, r1)
            goto L_0x013e
        L_0x013b:
            r0.m(r1, r2)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.a.u(t0.a$b):void");
    }

    public final void v(int i10, int i11) {
        String str;
        if (!this.f11949d[i10].isEmpty() && !this.f11949d[i11].isEmpty()) {
            c cVar = this.f11949d[i10].get("ImageLength");
            c cVar2 = this.f11949d[i10].get("ImageWidth");
            c cVar3 = this.f11949d[i11].get("ImageLength");
            c cVar4 = this.f11949d[i11].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (f11933l) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (cVar3 != null && cVar4 != null) {
                int f10 = cVar.f(this.f11951f);
                int f11 = cVar2.f(this.f11951f);
                int f12 = cVar3.f(this.f11951f);
                int f13 = cVar4.f(this.f11951f);
                if (f10 < f12 && f11 < f13) {
                    HashMap<String, c>[] hashMapArr = this.f11949d;
                    HashMap<String, c> hashMap = hashMapArr[i10];
                    hashMapArr[i10] = hashMapArr[i11];
                    hashMapArr[i11] = hashMap;
                    return;
                }
                return;
            } else if (f11933l) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
            Log.d("ExifInterface", str);
        } else if (f11933l) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(f fVar, int i10) {
        StringBuilder sb;
        String str;
        c cVar;
        c cVar2;
        c cVar3 = this.f11949d[i10].get("DefaultCropSize");
        c cVar4 = this.f11949d[i10].get("SensorTopBorder");
        c cVar5 = this.f11949d[i10].get("SensorLeftBorder");
        c cVar6 = this.f11949d[i10].get("SensorBottomBorder");
        c cVar7 = this.f11949d[i10].get("SensorRightBorder");
        if (cVar3 != null) {
            if (cVar3.f11964a == 5) {
                e[] eVarArr = (e[]) cVar3.h(this.f11951f);
                if (eVarArr == null || eVarArr.length != 2) {
                    sb = androidx.activity.f.g("Invalid crop size values. cropSize=");
                    str = Arrays.toString(eVarArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                cVar2 = c.c(eVarArr[0], this.f11951f);
                cVar = c.c(eVarArr[1], this.f11951f);
            } else {
                int[] iArr = (int[]) cVar3.h(this.f11951f);
                if (iArr == null || iArr.length != 2) {
                    sb = androidx.activity.f.g("Invalid crop size values. cropSize=");
                    str = Arrays.toString(iArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                cVar2 = c.d(iArr[0], this.f11951f);
                cVar = c.d(iArr[1], this.f11951f);
            }
            this.f11949d[i10].put("ImageWidth", cVar2);
            this.f11949d[i10].put("ImageLength", cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            c cVar8 = this.f11949d[i10].get("ImageLength");
            c cVar9 = this.f11949d[i10].get("ImageWidth");
            if (cVar8 == null || cVar9 == null) {
                c cVar10 = this.f11949d[i10].get("JPEGInterchangeFormat");
                c cVar11 = this.f11949d[i10].get("JPEGInterchangeFormatLength");
                if (cVar10 != null && cVar11 != null) {
                    int f10 = cVar10.f(this.f11951f);
                    int f11 = cVar10.f(this.f11951f);
                    fVar.c((long) f10);
                    byte[] bArr = new byte[f11];
                    fVar.read(bArr);
                    e(new b(bArr), f10, i10);
                }
            }
        } else {
            int f12 = cVar4.f(this.f11951f);
            int f13 = cVar6.f(this.f11951f);
            int f14 = cVar7.f(this.f11951f);
            int f15 = cVar5.f(this.f11951f);
            if (f13 > f12 && f14 > f15) {
                c d10 = c.d(f13 - f12, this.f11951f);
                c d11 = c.d(f14 - f15, this.f11951f);
                this.f11949d[i10].put("ImageLength", d10);
                this.f11949d[i10].put("ImageWidth", d11);
            }
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        c cVar = this.f11949d[1].get("PixelXDimension");
        c cVar2 = this.f11949d[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.f11949d[0].put("ImageWidth", cVar);
            this.f11949d[0].put("ImageLength", cVar2);
        }
        if (this.f11949d[4].isEmpty() && n(this.f11949d[5])) {
            HashMap<String, c>[] hashMapArr = this.f11949d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!n(this.f11949d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
