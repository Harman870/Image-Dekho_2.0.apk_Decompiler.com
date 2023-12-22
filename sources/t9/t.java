package t9;

import androidx.activity.f;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class t implements g {

    /* renamed from: a  reason: collision with root package name */
    public final e f12075a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final y f12076b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12077c;

    public class a extends InputStream {
        public a() {
        }

        public final int available() {
            t tVar = t.this;
            if (!tVar.f12077c) {
                return (int) Math.min(tVar.f12075a.f12045b, 2147483647L);
            }
            throw new IOException("closed");
        }

        public final void close() {
            t.this.close();
        }

        public final int read() {
            t tVar = t.this;
            if (!tVar.f12077c) {
                e eVar = tVar.f12075a;
                if (eVar.f12045b == 0 && tVar.f12076b.z(eVar, 8192) == -1) {
                    return -1;
                }
                return t.this.f12075a.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public final int read(byte[] bArr, int i10, int i11) {
            if (!t.this.f12077c) {
                a0.a((long) bArr.length, (long) i10, (long) i11);
                t tVar = t.this;
                e eVar = tVar.f12075a;
                if (eVar.f12045b == 0 && tVar.f12076b.z(eVar, 8192) == -1) {
                    return -1;
                }
                return t.this.f12075a.read(bArr, i10, i11);
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return t.this + ".inputStream()";
        }
    }

    public t(y yVar) {
        if (yVar != null) {
            this.f12076b = yVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final void D(long j10) {
        if (!j(j10)) {
            throw new EOFException();
        }
    }

    public final long H() {
        D(1);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!j((long) i11)) {
                break;
            }
            byte v10 = this.f12075a.v((long) i10);
            if ((v10 >= 48 && v10 <= 57) || ((v10 >= 97 && v10 <= 102) || (v10 >= 65 && v10 <= 70))) {
                i10 = i11;
            } else if (i10 == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(v10)}));
            }
        }
        return this.f12075a.H();
    }

    public final int I(r rVar) {
        if (!this.f12077c) {
            do {
                int O = this.f12075a.O(rVar, true);
                if (O == -1) {
                    return -1;
                }
                if (O != -2) {
                    this.f12075a.skip((long) rVar.f12070a[O].j());
                    return O;
                }
            } while (this.f12076b.z(this.f12075a, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public final String J(Charset charset) {
        if (charset != null) {
            e eVar = this.f12075a;
            y yVar = this.f12076b;
            eVar.getClass();
            if (yVar != null) {
                do {
                } while (yVar.z(eVar, 8192) != -1);
                return this.f12075a.J(charset);
            }
            throw new IllegalArgumentException("source == null");
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final InputStream K() {
        return new a();
    }

    public final long a(byte b10, long j10, long j11) {
        if (!this.f12077c) {
            long j12 = 0;
            if (j11 >= 0) {
                while (j12 < j11) {
                    long A = this.f12075a.A(b10, j12, j11);
                    if (A == -1) {
                        e eVar = this.f12075a;
                        long j13 = eVar.f12045b;
                        if (j13 >= j11 || this.f12076b.z(eVar, 8192) == -1) {
                            break;
                        }
                        j12 = Math.max(j12, j13);
                    } else {
                        return A;
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{0L, Long.valueOf(j11)}));
        }
        throw new IllegalStateException("closed");
    }

    public final h b(long j10) {
        D(j10);
        return this.f12075a.b(j10);
    }

    public final void c(byte[] bArr) {
        int i10 = 0;
        try {
            D((long) bArr.length);
            e eVar = this.f12075a;
            eVar.getClass();
            while (i10 < bArr.length) {
                int read = eVar.read(bArr, i10, bArr.length - i10);
                if (read != -1) {
                    i10 += read;
                } else {
                    throw new EOFException();
                }
            }
        } catch (EOFException e10) {
            while (true) {
                e eVar2 = this.f12075a;
                long j10 = eVar2.f12045b;
                if (j10 > 0) {
                    int read2 = eVar2.read(bArr, i10, (int) j10);
                    if (read2 != -1) {
                        i10 += read2;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e10;
                }
            }
        }
    }

    public final void close() {
        if (!this.f12077c) {
            this.f12077c = true;
            this.f12076b.close();
            this.f12075a.c();
        }
    }

    public final e d() {
        return this.f12075a;
    }

    public final z e() {
        return this.f12076b.e();
    }

    public final boolean isOpen() {
        return !this.f12077c;
    }

    public final boolean j(long j10) {
        e eVar;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (!this.f12077c) {
            do {
                eVar = this.f12075a;
                if (eVar.f12045b >= j10) {
                    return true;
                }
            } while (this.f12076b.z(eVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final String l() {
        return w(Long.MAX_VALUE);
    }

    public final boolean p() {
        if (!this.f12077c) {
            return this.f12075a.p() && this.f12076b.z(this.f12075a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public final int read(ByteBuffer byteBuffer) {
        e eVar = this.f12075a;
        if (eVar.f12045b == 0 && this.f12076b.z(eVar, 8192) == -1) {
            return -1;
        }
        return this.f12075a.read(byteBuffer);
    }

    public final byte readByte() {
        D(1);
        return this.f12075a.readByte();
    }

    public final int readInt() {
        D(4);
        return this.f12075a.readInt();
    }

    public final short readShort() {
        D(2);
        return this.f12075a.readShort();
    }

    public final void skip(long j10) {
        if (!this.f12077c) {
            while (j10 > 0) {
                e eVar = this.f12075a;
                if (eVar.f12045b == 0 && this.f12076b.z(eVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f12075a.f12045b);
                this.f12075a.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        StringBuilder g10 = f.g("buffer(");
        g10.append(this.f12076b);
        g10.append(")");
        return g10.toString();
    }

    public final String w(long j10) {
        long j11;
        if (j10 >= 0) {
            if (j10 == Long.MAX_VALUE) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10 + 1;
            }
            long a10 = a((byte) 10, 0, j11);
            if (a10 != -1) {
                return this.f12075a.N(a10);
            }
            if (j11 < Long.MAX_VALUE && j(j11) && this.f12075a.v(j11 - 1) == 13 && j(1 + j11) && this.f12075a.v(j11) == 10) {
                return this.f12075a.N(j11);
            }
            e eVar = new e();
            e eVar2 = this.f12075a;
            eVar2.o(eVar, 0, Math.min(32, eVar2.f12045b));
            StringBuilder g10 = f.g("\\n not found: limit=");
            g10.append(Math.min(this.f12075a.f12045b, j10));
            g10.append(" content=");
            try {
                g10.append(new h(eVar.E(eVar.f12045b)).f());
                g10.append(8230);
                throw new EOFException(g10.toString());
            } catch (EOFException e10) {
                throw new AssertionError(e10);
            }
        } else {
            throw new IllegalArgumentException("limit < 0: " + j10);
        }
    }

    public final long x(e eVar) {
        long j10 = 0;
        while (this.f12076b.z(this.f12075a, 8192) != -1) {
            long j11 = this.f12075a.j();
            if (j11 > 0) {
                j10 += j11;
                eVar.g(this.f12075a, j11);
            }
        }
        e eVar2 = this.f12075a;
        long j12 = eVar2.f12045b;
        if (j12 <= 0) {
            return j10;
        }
        long j13 = j10 + j12;
        eVar.g(eVar2, j12);
        return j13;
    }

    public final long z(e eVar, long j10) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (!this.f12077c) {
            e eVar2 = this.f12075a;
            if (eVar2.f12045b == 0 && this.f12076b.z(eVar2, 8192) == -1) {
                return -1;
            }
            return this.f12075a.z(eVar, Math.min(j10, this.f12075a.f12045b));
        } else {
            throw new IllegalStateException("closed");
        }
    }
}
