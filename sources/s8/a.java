package s8;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import q8.d;
import s8.f;

public abstract class a implements d<Object>, d, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final d<Object> f11896a;

    public a(d<Object> dVar) {
        this.f11896a = dVar;
    }

    public final StackTraceElement a() {
        int i10;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i11;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v10 = eVar.v();
        if (v10 <= 1) {
            int i12 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                i10 = i11 - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i12 = eVar.l()[i10];
            }
            f.a aVar = f.f11901b;
            if (aVar == null) {
                try {
                    f.a aVar2 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    f.f11901b = aVar2;
                    aVar = aVar2;
                } catch (Exception unused2) {
                    aVar = f.f11900a;
                    f.f11901b = aVar;
                }
            }
            if (aVar != f.f11900a) {
                Method method = aVar.f11902a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = aVar.f11903b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = aVar.f11904c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = (String) obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i12);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + 1 + ", got " + v10 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object c(Object obj);

    public final d d() {
        d<Object> dVar = this.f11896a;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final void e(Object obj) {
        d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            d dVar2 = aVar.f11896a;
            x8.f.c(dVar2);
            try {
                obj = aVar.c(obj);
                if (obj == r8.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = c.a.d(th);
            }
            aVar.f();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.e(obj);
                return;
            }
        }
    }

    public void f() {
    }

    public String toString() {
        StringBuilder g10 = androidx.activity.f.g("Continuation at ");
        Object a10 = a();
        if (a10 == null) {
            a10 = getClass().getName();
        }
        g10.append(a10);
        return g10.toString();
    }
}
