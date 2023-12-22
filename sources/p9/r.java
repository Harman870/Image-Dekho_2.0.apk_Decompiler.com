package p9;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import p9.c;
import t9.e;
import t9.f;
import t9.h;

public final class r implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f10839g = Logger.getLogger(d.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final f f10840a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10841b;

    /* renamed from: c  reason: collision with root package name */
    public final e f10842c;

    /* renamed from: d  reason: collision with root package name */
    public int f10843d = 16384;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10844e;

    /* renamed from: f  reason: collision with root package name */
    public final c.b f10845f;

    public r(f fVar, boolean z9) {
        this.f10840a = fVar;
        this.f10841b = z9;
        e eVar = new e();
        this.f10842c = eVar;
        this.f10845f = new c.b(eVar);
    }

    public final synchronized void a(g0.e eVar) {
        int i10;
        int i11;
        if (!this.f10844e) {
            int i12 = this.f10843d;
            int i13 = eVar.f6454a;
            if ((i13 & 32) != 0) {
                i12 = ((int[]) eVar.f6455b)[5];
            }
            this.f10843d = i12;
            if ((i13 & 2) != 0) {
                i10 = ((int[]) eVar.f6455b)[1];
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                c.b bVar = this.f10845f;
                if ((i13 & 2) != 0) {
                    i11 = ((int[]) eVar.f6455b)[1];
                } else {
                    i11 = -1;
                }
                bVar.getClass();
                int min = Math.min(i11, 16384);
                int i14 = bVar.f10730d;
                if (i14 != min) {
                    if (min < i14) {
                        bVar.f10728b = Math.min(bVar.f10728b, min);
                    }
                    bVar.f10729c = true;
                    bVar.f10730d = min;
                    int i15 = bVar.f10734h;
                    if (min < i15) {
                        if (min == 0) {
                            Arrays.fill(bVar.f10731e, (Object) null);
                            bVar.f10732f = bVar.f10731e.length - 1;
                            bVar.f10733g = 0;
                            bVar.f10734h = 0;
                        } else {
                            bVar.a(i15 - min);
                        }
                    }
                }
            }
            j(0, 0, (byte) 4, (byte) 1);
            this.f10840a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void c(boolean z9, int i10, e eVar, int i11) {
        byte b10;
        if (!this.f10844e) {
            if (z9) {
                b10 = (byte) 1;
            } else {
                b10 = 0;
            }
            j(i10, i11, (byte) 0, b10);
            if (i11 > 0) {
                this.f10840a.g(eVar, (long) i11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void close() {
        this.f10844e = true;
        this.f10840a.close();
    }

    public final void j(int i10, int i11, byte b10, byte b11) {
        Logger logger = f10839g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(d.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f10843d;
        if (i11 > i12) {
            Object[] objArr = {Integer.valueOf(i12), Integer.valueOf(i11)};
            h hVar = d.f10735a;
            throw new IllegalArgumentException(k9.e.j("FRAME_SIZE_ERROR length > %d: %d", objArr));
        } else if ((Integer.MIN_VALUE & i10) == 0) {
            f fVar = this.f10840a;
            fVar.writeByte((i11 >>> 16) & 255);
            fVar.writeByte((i11 >>> 8) & 255);
            fVar.writeByte(i11 & 255);
            this.f10840a.writeByte(b10 & 255);
            this.f10840a.writeByte(b11 & 255);
            this.f10840a.writeInt(i10 & Integer.MAX_VALUE);
        } else {
            Object[] objArr2 = {Integer.valueOf(i10)};
            h hVar2 = d.f10735a;
            throw new IllegalArgumentException(k9.e.j("reserved bit set: %s", objArr2));
        }
    }

    public final synchronized void o(int i10, int i11, byte[] bArr) {
        if (this.f10844e) {
            throw new IOException("closed");
        } else if (androidx.activity.f.c(i11) != -1) {
            j(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f10840a.writeInt(i10);
            this.f10840a.writeInt(androidx.activity.f.c(i11));
            if (bArr.length > 0) {
                this.f10840a.write(bArr);
            }
            this.f10840a.flush();
        } else {
            h hVar = d.f10735a;
            throw new IllegalArgumentException(k9.e.j("errorCode.httpCode == -1", new Object[0]));
        }
    }

    public final synchronized void s(int i10, int i11, boolean z9) {
        if (!this.f10844e) {
            j(0, 8, (byte) 6, z9 ? (byte) 1 : 0);
            this.f10840a.writeInt(i10);
            this.f10840a.writeInt(i11);
            this.f10840a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void t(int i10, int i11) {
        if (this.f10844e) {
            throw new IOException("closed");
        } else if (androidx.activity.f.c(i11) != -1) {
            j(i10, 4, (byte) 3, (byte) 0);
            this.f10840a.writeInt(androidx.activity.f.c(i11));
            this.f10840a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void u(int i10, long j10) {
        if (this.f10844e) {
            throw new IOException("closed");
        } else if (j10 == 0 || j10 > 2147483647L) {
            Object[] objArr = {Long.valueOf(j10)};
            h hVar = d.f10735a;
            throw new IllegalArgumentException(k9.e.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArr));
        } else {
            j(i10, 4, (byte) 8, (byte) 0);
            this.f10840a.writeInt((int) j10);
            this.f10840a.flush();
        }
    }

    public final void v(int i10, long j10) {
        while (j10 > 0) {
            int min = (int) Math.min((long) this.f10843d, j10);
            long j11 = (long) min;
            j10 -= j11;
            j(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : 0);
            this.f10840a.g(this.f10842c, j11);
        }
    }
}
