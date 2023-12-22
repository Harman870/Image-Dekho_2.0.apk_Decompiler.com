package j4;

import sun.misc.Unsafe;

public final class q9 extends s9 {
    public q9(Unsafe unsafe) {
        super(unsafe);
    }

    public final double a(long j10, Object obj) {
        return Double.longBitsToDouble(this.f8464a.getLong(obj, j10));
    }

    public final float b(long j10, Object obj) {
        return Float.intBitsToFloat(this.f8464a.getInt(obj, j10));
    }

    public final void c(Object obj, long j10, boolean z9) {
        if (t9.f8479g) {
            t9.c(obj, j10, z9);
        } else {
            t9.d(obj, j10, z9 ? (byte) 1 : 0);
        }
    }

    public final void d(Object obj, long j10, byte b10) {
        if (t9.f8479g) {
            t9.c(obj, j10, b10);
        } else {
            t9.d(obj, j10, b10);
        }
    }

    public final void e(Object obj, long j10, double d10) {
        this.f8464a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    public final void f(Object obj, long j10, float f10) {
        this.f8464a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    public final boolean g(long j10, Object obj) {
        return t9.f8479g ? t9.s(j10, obj) : t9.t(j10, obj);
    }
}
