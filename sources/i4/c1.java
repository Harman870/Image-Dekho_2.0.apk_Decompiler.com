package i4;

import androidx.activity.e;
import i4.c1;
import i4.z0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class c1<MessageType extends c1<MessageType, BuilderType>, BuilderType extends z0<MessageType, BuilderType>> extends t<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    public y2 zzc = y2.f7804f;
    private int zzd = -1;

    public static Object b(Object obj, Method method, Object... objArr) {
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

    public static void j(Class cls, c1 c1Var) {
        zzb.put(cls, c1Var);
        c1Var.d();
    }

    public static c1 r(Class cls) {
        Map map = zzb;
        c1 c1Var = (c1) map.get(cls);
        if (c1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c1Var = (c1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (c1Var == null) {
            c1Var = (c1) ((c1) h3.i(cls)).p(6);
            if (c1Var != null) {
                map.put(cls, c1Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return c1Var;
    }

    public static c1 t(c1 c1Var, e0 e0Var, p0 p0Var) {
        f0 k = e0Var.k();
        c1 s10 = c1Var.s();
        try {
            m2 a10 = j2.f7400c.a(s10.getClass());
            h0 h0Var = k.f7323b;
            if (h0Var == null) {
                h0Var = new h0(k);
            }
            a10.i(s10, h0Var, p0Var);
            a10.a(s10);
            try {
                if (k.f7298g != 0) {
                    throw new i1("Protocol message end-group tag did not match expected tag.");
                } else if (s10.m()) {
                    return s10;
                } else {
                    throw new i1(new w2().getMessage());
                }
            } catch (i1 e10) {
                throw e10;
            }
        } catch (i1 e11) {
            throw e11;
        } catch (w2 e12) {
            throw new i1(e12.getMessage());
        } catch (IOException e13) {
            if (e13.getCause() instanceof i1) {
                throw ((i1) e13.getCause());
            }
            throw new i1(e13);
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof i1) {
                throw ((i1) e14.getCause());
            }
            throw e14;
        }
    }

    public static c1 u(c1 c1Var, byte[] bArr, p0 p0Var) {
        int length = bArr.length;
        c1 s10 = c1Var.s();
        try {
            m2 a10 = j2.f7400c.a(s10.getClass());
            a10.g(s10, bArr, 0, length, new w(p0Var));
            a10.a(s10);
            if (s10.m()) {
                return s10;
            }
            throw new i1(new w2().getMessage());
        } catch (i1 e10) {
            throw e10;
        } catch (w2 e11) {
            throw new i1(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof i1) {
                throw ((i1) e12.getCause());
            }
            throw new i1(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw i1.e();
        }
    }

    public final int a(m2 m2Var) {
        if (n()) {
            int o10 = o(m2Var);
            if (o10 >= 0) {
                return o10;
            }
            throw new IllegalStateException(e.a("serialized size must be non-negative, was ", o10));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int o11 = o(m2Var);
        if (o11 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | o11;
            return o11;
        }
        throw new IllegalStateException(e.a("serialized size must be non-negative, was ", o11));
    }

    public final /* synthetic */ z0 c() {
        return (z0) p(5);
    }

    public final void d() {
        j2.f7400c.a(getClass()).a(this);
        f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return j2.f7400c.a(getClass()).d(this, (c1) obj);
        }
        return false;
    }

    public final void f() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final /* synthetic */ c1 g() {
        return (c1) p(6);
    }

    public final int h() {
        int i10;
        if (n()) {
            i10 = o((m2) null);
            if (i10 < 0) {
                throw new IllegalStateException(e.a("serialized size must be non-negative, was ", i10));
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = o((m2) null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException(e.a("serialized size must be non-negative, was ", i10));
                }
            }
        }
        return i10;
    }

    public final int hashCode() {
        if (n()) {
            return j2.f7400c.a(getClass()).f(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int f10 = j2.f7400c.a(getClass()).f(this);
        this.zza = f10;
        return f10;
    }

    public final void k() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final void l(l0 l0Var) {
        m2 a10 = j2.f7400c.a(getClass());
        m0 m0Var = l0Var.f7461b;
        if (m0Var == null) {
            m0Var = new m0(l0Var);
        }
        a10.h(this, m0Var);
    }

    public final boolean m() {
        byte byteValue = ((Byte) p(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e10 = j2.f7400c.a(getClass()).e(this);
        p(2);
        return e10;
    }

    public final boolean n() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int o(m2 m2Var) {
        if (m2Var == null) {
            return j2.f7400c.a(getClass()).b(this);
        }
        return m2Var.b(this);
    }

    public abstract Object p(int i10);

    public final z0 q() {
        return (z0) p(5);
    }

    public final c1 s() {
        return (c1) p(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = d2.f7249a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        d2.c(this, sb, 0);
        return sb.toString();
    }
}
