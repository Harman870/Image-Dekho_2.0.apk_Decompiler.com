package t9;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class l implements y {

    /* renamed from: a  reason: collision with root package name */
    public int f12055a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final t f12056b;

    /* renamed from: c  reason: collision with root package name */
    public final Inflater f12057c;

    /* renamed from: d  reason: collision with root package name */
    public final m f12058d;

    /* renamed from: e  reason: collision with root package name */
    public final CRC32 f12059e = new CRC32();

    public l(y yVar) {
        if (yVar != null) {
            Inflater inflater = new Inflater(true);
            this.f12057c = inflater;
            Logger logger = q.f12068a;
            t tVar = new t(yVar);
            this.f12056b = tVar;
            this.f12058d = new m(tVar, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public static void a(int i10, int i11, String str) {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}));
        }
    }

    public final void c(e eVar, long j10, long j11) {
        u uVar = eVar.f12044a;
        while (true) {
            int i10 = uVar.f12081c;
            int i11 = uVar.f12080b;
            if (j10 < ((long) (i10 - i11))) {
                break;
            }
            j10 -= (long) (i10 - i11);
            uVar = uVar.f12084f;
        }
        while (j11 > 0) {
            int i12 = (int) (((long) uVar.f12080b) + j10);
            int min = (int) Math.min((long) (uVar.f12081c - i12), j11);
            this.f12059e.update(uVar.f12079a, i12, min);
            j11 -= (long) min;
            uVar = uVar.f12084f;
            j10 = 0;
        }
    }

    public final void close() {
        this.f12058d.close();
    }

    public final z e() {
        return this.f12056b.e();
    }

    public final long z(e eVar, long j10) {
        boolean z9;
        long j11;
        e eVar2 = eVar;
        if (this.f12055a == 0) {
            this.f12056b.D(10);
            byte v10 = this.f12056b.f12075a.v(3);
            if (((v10 >> 1) & 1) == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                c(this.f12056b.f12075a, 0, 10);
            }
            a(8075, this.f12056b.readShort(), "ID1ID2");
            this.f12056b.skip(8);
            if (((v10 >> 2) & 1) == 1) {
                this.f12056b.D(2);
                if (z9) {
                    c(this.f12056b.f12075a, 0, 2);
                }
                short readShort = this.f12056b.f12075a.readShort();
                Charset charset = a0.f12033a;
                short s10 = readShort & 65535;
                long j12 = (long) ((short) (((s10 & 255) << 8) | ((s10 & 65280) >>> 8)));
                this.f12056b.D(j12);
                if (z9) {
                    j11 = j12;
                    c(this.f12056b.f12075a, 0, j12);
                } else {
                    j11 = j12;
                }
                this.f12056b.skip(j11);
            }
            if (((v10 >> 3) & 1) == 1) {
                long a10 = this.f12056b.a((byte) 0, 0, Long.MAX_VALUE);
                if (a10 != -1) {
                    if (z9) {
                        c(this.f12056b.f12075a, 0, a10 + 1);
                    }
                    this.f12056b.skip(a10 + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (((v10 >> 4) & 1) == 1) {
                long a11 = this.f12056b.a((byte) 0, 0, Long.MAX_VALUE);
                if (a11 != -1) {
                    if (z9) {
                        c(this.f12056b.f12075a, 0, a11 + 1);
                    }
                    this.f12056b.skip(a11 + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (z9) {
                t tVar = this.f12056b;
                tVar.D(2);
                short readShort2 = tVar.f12075a.readShort();
                Charset charset2 = a0.f12033a;
                short s11 = readShort2 & 65535;
                a((short) (((s11 & 255) << 8) | ((s11 & 65280) >>> 8)), (short) ((int) this.f12059e.getValue()), "FHCRC");
                this.f12059e.reset();
            }
            this.f12055a = 1;
        }
        if (this.f12055a == 1) {
            long j13 = eVar2.f12045b;
            long z10 = this.f12058d.z(eVar2, 8192);
            if (z10 != -1) {
                c(eVar, j13, z10);
                return z10;
            }
            this.f12055a = 2;
        }
        if (this.f12055a == 2) {
            t tVar2 = this.f12056b;
            tVar2.D(4);
            int readInt = tVar2.f12075a.readInt();
            Charset charset3 = a0.f12033a;
            a(((readInt & 255) << 24) | ((readInt & -16777216) >>> 24) | ((readInt & 16711680) >>> 8) | ((readInt & 65280) << 8), (int) this.f12059e.getValue(), "CRC");
            t tVar3 = this.f12056b;
            tVar3.D(4);
            int readInt2 = tVar3.f12075a.readInt();
            a(((readInt2 & 255) << 24) | ((readInt2 & -16777216) >>> 24) | ((readInt2 & 16711680) >>> 8) | ((readInt2 & 65280) << 8), (int) this.f12057c.getBytesWritten(), "ISIZE");
            this.f12055a = 3;
            if (!this.f12056b.p()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1;
    }
}
