package j4;

import androidx.activity.e;
import j4.i7;
import j4.m7;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class m7<MessageType extends m7<MessageType, BuilderType>, BuilderType extends i7<MessageType, BuilderType>> extends f6<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    public k9 zzc = k9.f8298f;
    private int zzd = -1;

    public static m7 k(Class cls) {
        Map map = zza;
        m7 m7Var = (m7) map.get(cls);
        if (m7Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                m7Var = (m7) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (m7Var == null) {
            m7Var = (m7) ((m7) t9.i(cls)).s(6);
            if (m7Var != null) {
                map.put(cls, m7Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return m7Var;
    }

    public static c8 l(q7 q7Var) {
        int i10;
        c8 c8Var = (c8) q7Var;
        int i11 = c8Var.f8087c;
        if (i11 == 0) {
            i10 = 10;
        } else {
            i10 = i11 + i11;
        }
        if (i10 >= i11) {
            return new c8(Arrays.copyOf(c8Var.f8086b, i10), c8Var.f8087c, true);
        }
        throw new IllegalArgumentException();
    }

    public static r7 m(r7 r7Var) {
        int size = r7Var.size();
        return r7Var.c(size == 0 ? 10 : size + size);
    }

    public static Object n(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static void p(Class cls, m7 m7Var) {
        m7Var.o();
        zza.put(cls, m7Var);
    }

    public final int a(y8 y8Var) {
        if (r()) {
            int h10 = h(y8Var);
            if (h10 >= 0) {
                return h10;
            }
            throw new IllegalStateException(e.a("serialized size must be non-negative, was ", h10));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int h11 = h(y8Var);
        if (h11 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | h11;
            return h11;
        }
        throw new IllegalStateException(e.a("serialized size must be non-negative, was ", h11));
    }

    public final /* synthetic */ m7 b() {
        return (m7) s(6);
    }

    public final /* synthetic */ i7 c() {
        return (i7) s(5);
    }

    public final int e() {
        int i10;
        if (r()) {
            i10 = h((y8) null);
            if (i10 < 0) {
                throw new IllegalStateException(e.a("serialized size must be non-negative, was ", i10));
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = h((y8) null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException(e.a("serialized size must be non-negative, was ", i10));
                }
            }
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v8.f8521c.a(getClass()).d(this, (m7) obj);
    }

    public final int h(y8 y8Var) {
        if (y8Var != null) {
            return y8Var.b(this);
        }
        return v8.f8521c.a(getClass()).b(this);
    }

    public final int hashCode() {
        if (r()) {
            return v8.f8521c.a(getClass()).f(this);
        }
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int f10 = v8.f8521c.a(getClass()).f(this);
        this.zzb = f10;
        return f10;
    }

    public final i7 i() {
        return (i7) s(5);
    }

    public final i7 j() {
        i7 i7Var = (i7) s(5);
        if (!i7Var.f8237a.equals(this)) {
            if (!i7Var.f8238b.r()) {
                m7 m7Var = (m7) i7Var.f8237a.s(4);
                v8.f8521c.a(m7Var.getClass()).c(m7Var, i7Var.f8238b);
                i7Var.f8238b = m7Var;
            }
            m7 m7Var2 = i7Var.f8238b;
            v8.f8521c.a(m7Var2.getClass()).c(m7Var2, this);
        }
        return i7Var;
    }

    public final void o() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void q() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean r() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object s(int i10);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = p8.f8388a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        p8.c(this, sb, 0);
        return sb.toString();
    }
}
