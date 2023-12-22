package i1;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m.b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final b<String, Method> f7110a;

    /* renamed from: b  reason: collision with root package name */
    public final b<String, Method> f7111b;

    /* renamed from: c  reason: collision with root package name */
    public final b<String, Class> f7112c;

    public a(b<String, Method> bVar, b<String, Method> bVar2, b<String, Class> bVar3) {
        this.f7110a = bVar;
        this.f7111b = bVar2;
        this.f7112c = bVar3;
    }

    public abstract b a();

    public final Class b(Class<? extends c> cls) {
        Class orDefault = this.f7112c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f7112c.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method c(String str) {
        Class<a> cls = a.class;
        Method orDefault = this.f7110a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f7110a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        Method orDefault = this.f7111b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class b10 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b10.getDeclaredMethod("write", new Class[]{cls, a.class});
        this.f7111b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i10);

    public abstract int i();

    public abstract <T extends Parcelable> T j();

    public abstract String k();

    public final <T extends c> T l() {
        String k = k();
        if (k == null) {
            return null;
        }
        b a10 = a();
        try {
            return (c) c(k).invoke((Object) null, new Object[]{a10});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    public abstract void m(int i10);

    public abstract void n(boolean z9);

    public abstract void o(byte[] bArr);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i10);

    public abstract void r(Parcelable parcelable);

    public abstract void s(String str);

    public final void t(c cVar) {
        if (cVar == null) {
            s((String) null);
            return;
        }
        try {
            s(b(cVar.getClass()).getName());
            b a10 = a();
            try {
                d(cVar.getClass()).invoke((Object) null, new Object[]{cVar, a10});
                a10.u();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (InvocationTargetException e11) {
                if (e11.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e11.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e14);
        }
    }
}
