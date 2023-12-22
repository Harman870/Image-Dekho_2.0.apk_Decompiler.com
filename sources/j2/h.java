package j2;

import android.os.SystemClock;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final double f8018a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f8019b = 0;

    public static double a(long j10) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j10)) * f8018a;
    }
}
