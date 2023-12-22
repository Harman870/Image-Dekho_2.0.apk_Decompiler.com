package t9;

import androidx.activity.f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class s implements f {

    /* renamed from: a  reason: collision with root package name */
    public final e f12072a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final x f12073b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12074c;

    public s(x xVar) {
        this.f12073b = xVar;
    }

    public final f F(String str) {
        if (!this.f12074c) {
            e eVar = this.f12072a;
            eVar.getClass();
            eVar.W(0, str.length(), str);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f G(long j10) {
        if (!this.f12074c) {
            this.f12072a.S(j10);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f a() {
        if (!this.f12074c) {
            long j10 = this.f12072a.j();
            if (j10 > 0) {
                this.f12073b.g(this.f12072a, j10);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f12074c) {
            Throwable th = null;
            try {
                e eVar = this.f12072a;
                long j10 = eVar.f12045b;
                if (j10 > 0) {
                    this.f12073b.g(eVar, j10);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f12073b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f12074c = true;
            if (th != null) {
                Charset charset = a0.f12033a;
                throw th;
            }
        }
    }

    public final e d() {
        return this.f12072a;
    }

    public final z e() {
        return this.f12073b.e();
    }

    public final void flush() {
        if (!this.f12074c) {
            e eVar = this.f12072a;
            long j10 = eVar.f12045b;
            if (j10 > 0) {
                this.f12073b.g(eVar, j10);
            }
            this.f12073b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void g(e eVar, long j10) {
        if (!this.f12074c) {
            this.f12072a.g(eVar, j10);
            a();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final f i(long j10) {
        if (!this.f12074c) {
            this.f12072a.T(j10);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f12074c;
    }

    public final String toString() {
        StringBuilder g10 = f.g("buffer(");
        g10.append(this.f12073b);
        g10.append(")");
        return g10.toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.f12074c) {
            int write = this.f12072a.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public final f write(byte[] bArr) {
        if (!this.f12074c) {
            e eVar = this.f12072a;
            eVar.getClass();
            if (bArr != null) {
                eVar.write(bArr, 0, bArr.length);
                a();
                return this;
            }
            throw new IllegalArgumentException("source == null");
        }
        throw new IllegalStateException("closed");
    }

    public final f write(byte[] bArr, int i10, int i11) {
        if (!this.f12074c) {
            this.f12072a.write(bArr, i10, i11);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f writeByte(int i10) {
        if (!this.f12074c) {
            this.f12072a.R(i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f writeInt(int i10) {
        if (!this.f12074c) {
            this.f12072a.U(i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f writeShort(int i10) {
        if (!this.f12074c) {
            this.f12072a.V(i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f y(h hVar) {
        if (!this.f12074c) {
            this.f12072a.Q(hVar);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
