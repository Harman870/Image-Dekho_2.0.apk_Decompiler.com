package j2;

import java.io.FilterInputStream;

public final class j extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public int f8025a = Integer.MIN_VALUE;

    public j(d dVar) {
        super(dVar);
    }

    public final long a(long j10) {
        int i10 = this.f8025a;
        if (i10 == 0) {
            return -1;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : (long) i10;
    }

    public final int available() {
        int i10 = this.f8025a;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public final void c(long j10) {
        int i10 = this.f8025a;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.f8025a = (int) (((long) i10) - j10);
        }
    }

    public final synchronized void mark(int i10) {
        super.mark(i10);
        this.f8025a = i10;
    }

    public final int read() {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        c(1);
        return read;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        int a10 = (int) a((long) i11);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, a10);
        c((long) read);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f8025a = Integer.MIN_VALUE;
    }

    public final long skip(long j10) {
        long a10 = a(j10);
        if (a10 == -1) {
            return 0;
        }
        long skip = super.skip(a10);
        c(skip);
        return skip;
    }
}
