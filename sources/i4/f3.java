package i4;

import sun.misc.Unsafe;

public final class f3 extends g3 {
    public f3(Unsafe unsafe) {
        super(unsafe);
    }

    public final double a(long j10, Object obj) {
        return Double.longBitsToDouble(k(j10, obj));
    }

    public final float b(long j10, Object obj) {
        return Float.intBitsToFloat(j(j10, obj));
    }

    public final void c(Object obj, long j10, boolean z9) {
        if (h3.f7351g) {
            h3.c(obj, j10, z9);
        } else {
            h3.d(obj, j10, z9 ? (byte) 1 : 0);
        }
    }

    public final void d(Object obj, long j10, byte b10) {
        if (h3.f7351g) {
            h3.c(obj, j10, b10);
        } else {
            h3.d(obj, j10, b10);
        }
    }

    public final void e(Object obj, long j10, double d10) {
        o(obj, j10, Double.doubleToLongBits(d10));
    }

    public final void f(Object obj, long j10, float f10) {
        n(Float.floatToIntBits(f10), j10, obj);
    }

    public final boolean g(long j10, Object obj) {
        if (h3.f7351g) {
            if (((byte) ((h3.f7347c.j(-4 & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0) {
                return true;
            }
            return false;
        } else if (((byte) ((h3.f7347c.j(-4 & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
            return true;
        } else {
            return false;
        }
    }
}
