package i4;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class g3 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f7326a;

    public g3(Unsafe unsafe) {
        this.f7326a = unsafe;
    }

    public abstract double a(long j10, Object obj);

    public abstract float b(long j10, Object obj);

    public abstract void c(Object obj, long j10, boolean z9);

    public abstract void d(Object obj, long j10, byte b10);

    public abstract void e(Object obj, long j10, double d10);

    public abstract void f(Object obj, long j10, float f10);

    public abstract boolean g(long j10, Object obj);

    public final int h(Class cls) {
        return this.f7326a.arrayBaseOffset(cls);
    }

    public final int i(Class cls) {
        return this.f7326a.arrayIndexScale(cls);
    }

    public final int j(long j10, Object obj) {
        return this.f7326a.getInt(obj, j10);
    }

    public final long k(long j10, Object obj) {
        return this.f7326a.getLong(obj, j10);
    }

    public final void l(Field field) {
        this.f7326a.objectFieldOffset(field);
    }

    public final Object m(long j10, Object obj) {
        return this.f7326a.getObject(obj, j10);
    }

    public final void n(int i10, long j10, Object obj) {
        this.f7326a.putInt(obj, j10, i10);
    }

    public final void o(Object obj, long j10, long j11) {
        this.f7326a.putLong(obj, j10, j11);
    }

    public final void p(long j10, Object obj, Object obj2) {
        this.f7326a.putObject(obj, j10, obj2);
    }
}
