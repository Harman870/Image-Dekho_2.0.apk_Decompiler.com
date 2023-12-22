package a7;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

public final class d {

    public static final class a extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        public long f105a = 1048577;

        /* renamed from: b  reason: collision with root package name */
        public long f106b = -1;

        public a(InputStream inputStream) {
            super(inputStream);
        }

        public final int available() {
            return (int) Math.min((long) this.in.available(), this.f105a);
        }

        public final synchronized void mark(int i10) {
            this.in.mark(i10);
            this.f106b = this.f105a;
        }

        public final int read() {
            if (this.f105a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f105a--;
            }
            return read;
        }

        public final int read(byte[] bArr, int i10, int i11) {
            long j10 = this.f105a;
            if (j10 == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i10, (int) Math.min((long) i11, j10));
            if (read != -1) {
                this.f105a -= (long) read;
            }
            return read;
        }

        public final synchronized void reset() {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f106b != -1) {
                this.in.reset();
                this.f105a = this.f106b;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public final long skip(long j10) {
            long skip = this.in.skip(Math.min(j10, this.f105a));
            this.f105a -= skip;
            return skip;
        }
    }

    public static byte[] a(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(a aVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = aVar.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return a(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            long j10 = ((long) min) * ((long) (min < 4096 ? 4 : 2));
            min = j10 > 2147483647L ? Integer.MAX_VALUE : j10 < -2147483648L ? Integer.MIN_VALUE : (int) j10;
        }
        if (aVar.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
