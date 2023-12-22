package i9;

import c6.b;
import h9.o;
import i4.yf;
import java.util.concurrent.TimeUnit;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final long f7973a = b.y("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final int f7974b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f7975c = b.z("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* renamed from: d  reason: collision with root package name */
    public static final long f7976d = TimeUnit.SECONDS.toNanos(b.y("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: e  reason: collision with root package name */
    public static e f7977e = e.f7968b;

    /* renamed from: f  reason: collision with root package name */
    public static final yf f7978f = new yf(0);

    /* renamed from: g  reason: collision with root package name */
    public static final yf f7979g = new yf(1);

    static {
        int i10 = o.f7068a;
        if (i10 < 2) {
            i10 = 2;
        }
        f7974b = b.z("kotlinx.coroutines.scheduler.core.pool.size", i10, 1, 0, 8);
    }
}
