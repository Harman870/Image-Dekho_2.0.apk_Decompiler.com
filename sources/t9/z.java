package t9;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class z {

    /* renamed from: d  reason: collision with root package name */
    public static final a f12090d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f12091a;

    /* renamed from: b  reason: collision with root package name */
    public long f12092b;

    /* renamed from: c  reason: collision with root package name */
    public long f12093c;

    public class a extends z {
        public final z d(long j10) {
            return this;
        }

        public final void f() {
        }

        public final z g(long j10, TimeUnit timeUnit) {
            return this;
        }
    }

    public z a() {
        this.f12091a = false;
        return this;
    }

    public z b() {
        this.f12093c = 0;
        return this;
    }

    public long c() {
        if (this.f12091a) {
            return this.f12092b;
        }
        throw new IllegalStateException("No deadline");
    }

    public z d(long j10) {
        this.f12091a = true;
        this.f12092b = j10;
        return this;
    }

    public boolean e() {
        return this.f12091a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f12091a && this.f12092b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j10);
        } else if (timeUnit != null) {
            this.f12093c = timeUnit.toNanos(j10);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }
}
